package evergreen;

import java.util.List;

public interface PositionFunction {
    double getPosition(double time);
    double getVelocity(double time);
    List<String> getUnits();
}