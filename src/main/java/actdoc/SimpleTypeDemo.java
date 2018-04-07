package actdoc;

import act.Act;
import act.app.conf.AutoConfig;
import act.conf.AppConfig;
import org.osgl.$;
import org.osgl.inject.annotation.Configuration;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.util.Const;

@AutoConfig("myconf")
public class SimpleTypeDemo extends ConfigDemoBase {

    static final Const<Integer> FOO_BAR = $.constant();

    @Configuration("myconf.foo.bar")
    private int fooBar1;

    @GetAction("auto_conf")
    public int autoConf() {
        return FOO_BAR.get();
    }

    @GetAction("inject")
    public int inject() {
        return this.fooBar1;
    }

    @GetAction("inject_param")
    public int injectParam(@Configuration("myconf.foo.bar") int fooBar) {
        return fooBar;
    }

    @GetAction("pull")
    public int testPull() {
        AppConfig conf = Act.appConfig();
        return $.convert(conf.get("myconf.foo.bar")).toInt();
    }

}
