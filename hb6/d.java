package hb6.d;
import java.lang.Object;
import hb6.d$a;
import java.lang.reflect.Type;
import el.a;
import com.google.common.collect.LinkedListMultimap;
import java.util.HashMap;
import java.util.List;
import ta6.a;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import hb6.c;
import java.lang.Long;
import qk.g0;
import java.lang.CharSequence;
import android.text.TextUtils;
import xf6.e;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;
import fg6.a;
import com.google.gson.Gson;

public class d	// class@001746
{
    public final Type a;
    public g0 b;
    public Map c;
    public Map d;
    public g0 e;

    public void d(){
       super();
       Type type = new d$a(this).getType();
       this.a = type;
       this.b = LinkedListMultimap.create();
       this.c = new HashMap();
       this.d = new HashMap();
       this.d = d.c(a.e(type));
    }
    public static Map c(List p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0 == null) {
          return obj;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          String str = uoc.b();
          obj.put(str, Long.valueOf(uoc.d()));
       }
       return obj;
    }
    public static g0 d(List p0){
       LinkedListMultimap obj = PatchProxy.applyOneRefs(p0, null, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LinkedListMultimap.create();
       if (p0 == null) {
          return obj;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          Iterator iterator1 = uoc.c().iterator();
          while (iterator1.hasNext()) {
             String str = iterator1.next();
             if (!TextUtils.isEmpty(str)) {
                obj.put(uoc.b(), str);
             }
          }
       }
       return obj;
    }
    public final g0 a(){
       String obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.a();
       Object[] objArray = new Object[0];
       c.C().w("HostOptimalIpMapProvider", "GetOptimalHostIpMap from TestHook: "+obj, objArray);
       return d.d(a.a.i(obj, this.a));
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "10")) {
          return;
       }
       if (!this.b.isEmpty()) {
          Object[] objArray = new Object[0];
          c.C().w("HostOptimalIpMapProvider", p0+" optimal IPs: "+this.b, objArray);
       }
       return;
    }
}
