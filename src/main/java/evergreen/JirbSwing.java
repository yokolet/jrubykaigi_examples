package evergreen;

import java.util.Arrays;

import org.jruby.embed.LocalContextScope;
import org.jruby.embed.ScriptingContainer;

public class JirbSwing {
    private JirbSwing() {
        ScriptingContainer container = new ScriptingContainer(LocalContextScope.SINGLETHREAD);
        String jrubyhome = container.getHomeDirectory();
        System.out.println(jrubyhome);
        String[] paths = {jrubyhome + "/bin"};
        container.setLoadPaths(Arrays.asList(paths));       // add "bin" directory to $LOAD_PATH
        container.runScriptlet("p $LOAD_PATH");
        String jirb_swing = jrubyhome + "/bin/jirb_swing";
        container.setScriptFilename(jirb_swing);            // equivalent to "-S /path/to/jirb_swing"
        container.runScriptlet("load 'jirb_swing'");
    }

    public static void main(String[] args) {
        new JirbSwing();
    }
}
