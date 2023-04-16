package cdc.d;
import udc.v;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import udc.u;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c5a.i;
import com.kwai.robust.PatchProxyResult;
import i2b.a;

public class d implements v	// class@000580
{

    public void d(){
       super();
    }
    public PresenterV2 a(){
       return u.b(this);
    }
    public View b(Context p0){
       return u.c(this, p0);
    }
    public void c(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "2")) {
          return;
       }
       p0.U7(new i());
       PatchProxy.onMethodExit(d.class, "2");
       return;
    }
    public View d(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0, 0x7f0d052a);
    }
}
