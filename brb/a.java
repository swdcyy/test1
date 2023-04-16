package brb.a;
import on5.m$b;
import java.lang.String;
import java.lang.Object;
import zr6.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brb.a$a;
import zr6.g;
import wn5.b;
import wq6.g;
import wq6.h;
import on5.b;
import com.kwai.kcube.TabIdentifier;

public class a extends m$b	// class@000439
{

    public void a(){
       super("con_plaza");
    }
    public d d(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$a(p0);
    }
    public void e(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       p0.a("KEY_TAB_NAME_DEST", new b(p0.f(), R.string.arg_RES_7f1003d2));
       return;
    }
    public h f(g p0){
       TabIdentifier obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.f;
       if (p0.O(obj)) {
          return p0.H(obj);
       }
       return p0.U(0);
    }
}
