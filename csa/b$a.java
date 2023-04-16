package csa.b$a;
import com.yxcorp.gifshow.home.block.topbar.appbar.GestureCollapseAppBarBehavior$a;
import csa.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import wra.b;
import mrd.c;
import wra.a;
import brd.y;
import com.kwai.robust.PatchProxyResult;

public final class b$a implements GestureCollapseAppBarBehavior$a	// class@0023a4
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport2(b$a.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, b$a.class, "1")) {
          return;
       }
       b.P8(this.a).a().onNext(a.c);
       PatchProxy.onMethodExit(b$a.class, "1");
       return;
    }
    public boolean b(){
       b$a uoa = b$a.class;
       Object obj = PatchProxy.applyWithListener(null, this, uoa, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!b.P8(this.a).c())? true: false;
       PatchProxy.onMethodExit(uoa, "2");
       return b;
    }
}
