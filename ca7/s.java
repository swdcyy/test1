package ca7.s;
import java.lang.String;
import java.nio.charset.Charset;
import java.util.Map;
import ca7.n;
import java.lang.Object;
import ca7.v;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import ca7.u;
import java.util.Collection;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import java.util.HashMap;

public class s	// class@000525
{
    public static final Charset a;

    static {
       s.a = Charset.forName("UTF-8");
    }
    public static String a(String p0,String p1,Map p2,n p3){
       v.d(p0, "method cannot be null or empty");
       v.d(p1, "path cannot be null or empty");
       ArrayList uArrayList = new ArrayList();
       uArrayList.add((p0.toUpperCase()).trim());
       uArrayList.add(p1.trim());
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = new TreeMap(p2).entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!(uEntry.getKey()).startsWith("__")) {
             uArrayList1.add(uEntry.getKey()+"="+u.a(uEntry.getValue()));
          }
       }
       uArrayList.addAll(uArrayList1);
       if (p3 != null) {
          uArrayList.add((p3.toString()).trim());
       }
       return TextUtils.join("&", uArrayList);
    }
    public static Map b(Map p0,Map p1){
       HashMap hashMap = new HashMap();
       if (p0 != null) {
          hashMap.putAll(p0);
       }
       if (p1 != null) {
          hashMap.putAll(p1);
       }
       return hashMap;
    }
}
