import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;
// 0 - nothing
// 1 - prize


@AllArgsConstructor
@Data
public class ThreeDoors {
    private int [] doors;
    Random rd = new Random();

    public ThreeDoors() {
        doors = new int[]{0, 0, 0};
        int prizeIndex = rd.nextInt(3);
        doors[prizeIndex] = 1;
    }


}

