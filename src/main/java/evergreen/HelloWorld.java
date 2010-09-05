package evergreen;

import org.jruby.embed.LocalContextScope;
import org.jruby.embed.ScriptingContainer;

public class HelloWorld {

    private HelloWorld() {
        ScriptingContainer container = new ScriptingContainer(LocalContextScope.SINGLETHREAD);
        container.runScriptlet("puts \"Hello World!\"");
    }

    public static void main(String[] args) {
        new HelloWorld();
    }
}