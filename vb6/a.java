package vb6.a;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o96.t;
import o96.g0;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import e66.e;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import t96.a;
import p96.a;
import java.lang.Throwable;
import q87.c;
import java.lang.Boolean;

public class a	// class@002681
{
    public static final Map a;

    static {
       boolean b;
       a.a = new HashMap();
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, objArray, a.class, str)) {
       }else if(PatchProxy.applyVoid(objArray, objArray, t.class, str)){
          ConcurrentHashMap uConcurrentH = e.b(g0.e);
          if (uConcurrentH != null) {
             Iterator iterator = uConcurrentH.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                str = uEntry.getKey();
                a value = uEntry.getValue();
                value = (value != null)? value.a: false;
                a.a(str, value);
             }
          }
       }
    }
    public void a(){
       super();
    }
    public static void a(String p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "2")) {
          return;
       }
       a.a.put(p0, Boolean.valueOf(p1));
       return;
    }
}
