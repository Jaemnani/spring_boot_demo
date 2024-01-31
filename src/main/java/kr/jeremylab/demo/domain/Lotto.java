package kr.jeremylab.demo.domain;

import java.time.LocalDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Lotto {
    private Set<Integer> numbers;
    private LocalDateTime createdAt;
}
