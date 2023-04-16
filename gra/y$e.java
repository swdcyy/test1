package gra.y$e;
import erd.g;
import com.yxcorp.gifshow.growth.vfc.model.NonReceiveCouponDialog;
import gra.y;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import gra.h;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;

public final class y$e implements g	// class@002bd3
{
    public final NonReceiveCouponDialog b;
    public final y c;

    public void y$e(NonReceiveCouponDialog p0,y p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, y$e.class, "1")) {
       }else if(a.g(p0, Boolean.TRUE)){
          p0 = this.c.X8();
          if (p0 != null) {
             GrowthVfcUtilKt.a(p0);
          }
       }
       PatchProxy.onMethodExit(y$e.class, "1");
       return;
    }
}
