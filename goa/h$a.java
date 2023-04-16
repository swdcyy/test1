package goa.h$a;
import qn.l;
import com.yxcorp.gifshow.growth.invitecode.model.GrowthC2CPopupModel;
import goa.h;
import java.lang.Object;
import rn.a;
import qn.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import goa.d;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class h$a implements l	// class@002b44
{
    public final GrowthC2CPopupModel a;
    public final h b;

    public void h$a(GrowthC2CPopupModel p0,h p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void c(a p0){
       k.d(this, p0);
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h$a.class, "2")) {
          return;
       }
       k.a(this, p0);
       p0.a = false;
       PatchProxy.onMethodExit(h$a.class, "2");
       return;
    }
    public void e(a p0){
       k.c(this, p0);
    }
    public void f(a p0,int p1){
       if (PatchProxy.isSupport2(h$a.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, h$a.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       k.b(this, p0, p1);
       p0.a = false;
       PatchProxy.onMethodExit(h$a.class, "1");
       return;
    }
}
