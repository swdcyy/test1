package goa.h$b;
import zn.a;
import com.yxcorp.gifshow.growth.invitecode.model.GrowthC2CPopupModel;
import goa.h;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import goa.d;

public final class h$b implements a	// class@002b45
{
    public final GrowthC2CPopupModel a;
    public final h b;

    public void h$b(GrowthC2CPopupModel p0,h p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,Throwable p1){
       if (PatchProxy.isSupport2(h$b.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), p1, this, h$b.class, "1")) {
          return;
       }
       p0.a = false;
       PatchProxy.onMethodExit(h$b.class, "1");
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoidWithListener(null, this, h$b.class, "2")) {
          return;
       }
       PatchProxy.onMethodExit(h$b.class, "2");
       return;
    }
}
