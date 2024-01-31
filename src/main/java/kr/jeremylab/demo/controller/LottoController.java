package kr.jeremylab.demo.controller;

import kr.jeremylab.demo.domain.Lotto;
import kr.jeremylab.demo.service.LottoGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LottoController {
    private final LottoGenerator lottoGenerator;

    @PostMapping("/lotto-numbers")
    @ResponseStatus(HttpStatus.CREATED)
    private Lotto generateLottoNumbers() {
        return lottoGenerator.generate();
    }
}
