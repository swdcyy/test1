package asb.a;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;

public class a	// class@0002ed
{
    public static final HashMap a;
    public static final HashMap b;
    public static final HashMap c;
    public static final HashMap d;

    static {
       HashMap hashMap = new HashMap();
       a.a = hashMap;
       HashMap hashMap1 = new HashMap();
       a.b = hashMap1;
       HashMap hashMap2 = new HashMap();
       a.c = hashMap2;
       HashMap hashMap3 = new HashMap();
       a.d = hashMap3;
       Integer integer = Integer.valueOf(1);
       hashMap.put("feedType", integer);
       Integer integer1 = Integer.valueOf(2);
       hashMap1.put("feedType", integer1);
       hashMap2.put("isFirstPage", integer);
       hashMap3.put("isFirstPage", integer1);
    }
}
