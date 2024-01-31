package kr.jeremylab.demo.repository;

import kr.jeremylab.demo.domain.Lotto;
import org.springframework.data.repository.CrudRepository;

public interface LottoRepository extends CrudRepository<Lotto, String> {

}
