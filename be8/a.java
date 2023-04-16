package be8.a;
import java.lang.Object;
import yd8.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;
import yd8.b;
import ja8.e;
import org.json.JSONObject;
import java.lang.reflect.Type;
import gc8.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import zi8.o$a;
import zi8.o;

public class a	// class@00032e
{

    public void a(){
       super();
    }
    public static c a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Boolean) {
          return c.h(p0);
       }
       if (p0 instanceof Number) {
          return c.h(Boolean.valueOf((p0.equals(Integer.valueOf(0)) ^ 0x01)));
       }
       if (p0 instanceof String) {
          return c.h(Boolean.valueOf((p0.isEmpty() ^ 0x01)));
       }
       return new c(b.b(""), Boolean.FALSE);
    }
    public static c b(e p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.c(p0, p1, p2, "");
    }
    public static c c(e p0,String p1,boolean p2,String p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null || p0.f() == null) {
          return c.a(a.b(p1, String.class), p3);
       }else {
          return a.d(p0.f(), p1, p2, p3);
       }
    }
    public static c d(JSONObject p0,String p1,boolean p2,String p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, a.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = p0.opt(p1);
       if (p0 == null && p2) {
          return c.h(p3);
       }else if(!p0 instanceof String){
          return c.a(a.b(p1, String.class), p3);
       }else if(!TextUtils.isEmpty(p0)){
          if (o.d(p0).a()) {
             return c.h(p0);
          }
       }else if(p2){
          return c.h(p3);
       }
       return c.a(a.c(p1, p0), p3);
    }
}
