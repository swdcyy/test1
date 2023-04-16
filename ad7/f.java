package ad7.f;
import on5.m$a;
import java.lang.String;
import java.lang.Object;
import zr6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ad7.f$a;
import zr6.g;
import wn5.b;
import wq6.e;
import android.content.Intent;
import java.lang.Boolean;
import android.net.Uri;
import on5.n;
import on5.o;

public class f extends m$a	// class@0000af
{

    public void f(){
       super("ato_nearby");
    }
    public b d(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f$a(p0);
    }
    public void e(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       p0.a("KEY_TAB_NAME_DEST", new b(p0.f(), R.string.arg_RES_7f102f5f));
       return;
    }
    public boolean f(e p0,Intent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (super.f(p0, p1)) {
          return true;
       }
       boolean b = n.d(p1.getData(), "kwai", "home", "local");
       if (b) {
          o.a("local", false);
       }
       return b;
    }
}
