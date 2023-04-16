package ljd.a;
import java.util.HashMap;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.util.Map;
import java.util.Collections;

public class a	// class@001c39
{
    public static final Map a;
    public static final Map b;

    static {
       a.a = new HashMap();
       a.b = new HashMap();
    }
    public static List a(String p0){
       List list = a.a.get(p0);
       if (list == null) {
          list = Collections.emptyList();
       }
       return list;
    }
    public static List b(String p0){
       List list = a.b.get(p0);
       if (list == null) {
          list = Collections.emptyList();
       }
       return list;
    }
}
