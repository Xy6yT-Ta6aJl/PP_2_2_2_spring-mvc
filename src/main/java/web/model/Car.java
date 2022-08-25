package web.model;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {

    private String model;

    private int series;

    private double power;
}
