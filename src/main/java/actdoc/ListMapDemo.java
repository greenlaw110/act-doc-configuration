package actdoc;

import org.osgl.http.H;
import org.osgl.inject.annotation.Configuration;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.ResponseContentType;

import java.util.List;
import java.util.Map;

public class ListMapDemo extends ConfigDemoBase {

    @GetAction("list")
    @ResponseContentType(H.MediaType.JSON)
    public int[] list(@Configuration("myconf.list.demo") int[] list) {
        return list;
    }

    @GetAction("list2")
    @ResponseContentType(H.MediaType.JSON)
    public List<Integer> list2(@Configuration("myconf.list.demo") List<Integer> list) {
        return list;
    }

    @GetAction("list3")
    @ResponseContentType(H.MediaType.JSON)
    public List<String> list3(@Configuration("myconf.list.demo") List<String> list) {
        return list;
    }

    @GetAction("map")
    @ResponseContentType(H.MediaType.JSON)
    public Object barMap(@Configuration("myconf.map.demo") Map<String, Integer> barMap) {
        return barMap;
    }

    @GetAction("map2")
    @ResponseContentType(H.MediaType.JSON)
    public Object barMap2(@Configuration("myconf.map") Map<String, Integer> fooMap) {
        return fooMap;
    }

}
