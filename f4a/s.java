package f4a.s;
import f4a.i;
import java.lang.Object;
import java.lang.String;
import f4a.h;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import f4a.m;
import android.content.Context;

public class s implements i	// class@0022b7
{

    public void s(){
       super();
    }
    public boolean a(String p0){
       return h.a(this, p0);
    }
    public boolean b(String p0,String p1,Activity p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, s.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, m.class, "7");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(!m.b(p0) && (!m.d(p0) && (!m.a(p0) && !m.c(p2, p1)))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return m.a(p0);
    }
    public boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return m.d(p0);
    }
    public boolean f(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, s.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return m.c(p0, p1);
    }
    public boolean g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return m.b(p0);
    }
}
