package esa.h;
import on5.m$b;
import java.lang.String;
import java.lang.Object;
import zr6.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import esa.h$a;
import zr6.g;
import androidx.core.view.ScrollStrategy;
import uv8.m1;
import wq6.g;
import wq6.h;
import on5.b;
import com.kwai.kcube.TabIdentifier;

public class h extends m$b	// class@0027c8
{

    public void h(){
       super("con_bottomNav");
    }
    public d d(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h$a(p0);
    }
    public void e(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       p0.h = ScrollStrategy.ONLY_FIRST_TWO_TOUCH_SCROLL;
       if (m1.j()) {
          p0.j(-1, 3);
       }
       return;
    }
    public h f(g p0){
       h obj = PatchProxy.applyOneRefs(p0, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.G(b.f);
       if (obj != null) {
          return obj;
       }
       obj = p0.G(b.D);
       if (obj != null) {
          return obj;
       }
       return p0.U(0);
    }
}
