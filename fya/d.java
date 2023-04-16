package fya.d;
import java.lang.Object;
import java.util.Map;
import lnc.i3;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;

public class d	// class@002a59
{

    public void d(){
       super();
    }
    public static void a(Map p0,i3 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          p1.d(str, p0.get(str));
       }
       return;
    }
}
