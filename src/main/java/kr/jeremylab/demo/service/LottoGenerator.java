package kr.jeremylab.demo.service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import kr.jeremylab.demo.domain.Lotto;
import kr.jeremylab.demo.repository.LottoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LottoGenerator {
    private final LottoRepository lottoRepository;
    public Lotto generate() {
        Set<Integer> numbers = new HashSet<>();
        Random rand = new Random();

        while (numbers.size() < 6) {
            int randomNumber = rand.nextInt(45) + 1;
            numbers.add(randomNumber);
        }

        Lotto createdLotto = new Lotto(numbers, LocalDateTime.now());
        lottoRepository.save(createdLotto);

        return createdLotto;
    }
}
