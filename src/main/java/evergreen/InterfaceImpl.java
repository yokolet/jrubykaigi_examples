package evergreen;

import java.util.List;

import org.jruby.embed.LocalContextScope;
import org.jruby.embed.PathType;
import org.jruby.embed.ScriptingContainer;

public class InterfaceImpl {
    public static void main(String[] args) {
        ScriptingContainer container = new ScriptingContainer(LocalContextScope.SINGLETHREAD);
        container.put("initial_velocity", 16.0);
        container.put("initial_height", 32.0);
        container.put("system", "english");;
        PositionFunction result = (PositionFunction) container.runScriptlet(PathType.CLASSPATH, "ruby/position_function.rb");
        double time = 2.0;
        double position = result.getPosition(time);
        double velocity = result.getVelocity(time);
        List<String> units = ((PositionFunction)result).getUnits();
        System.out.println(velocity + units.get(0) + ", " + position + units.get(1));
    }
}
