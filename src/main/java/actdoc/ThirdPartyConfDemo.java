package actdoc;

import act.inject.util.LoadConfig;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.util.IO;

import java.io.File;

public class ThirdPartyConfDemo extends ConfigDemoBase {

    @LoadConfig("libx.json")
    private File libXConf;

    @GetAction("3rd_party")
    public String test() {
        return IO.read(libXConf).toString();
    }

}
