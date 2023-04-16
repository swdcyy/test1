package cdc.c;
import udc.v;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.reminder.friend.presenter.single.d;
import android.content.Context;
import android.view.View;
import udc.u;
import kotlin.jvm.internal.a;
import c5a.i;
import i2b.a;

public final class c implements v	// class@00057f
{

    public void c(){
       super();
    }
    public PresenterV2 a(){
       Object obj = PatchProxy.applyWithListener(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(c.class, "3");
       return new d();
    }
    public View b(Context p0){
       return u.c(this, p0);
    }
    public void c(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "2")) {
          return;
       }
       a.p(p0, "presenter");
       p0.U7(new i());
       PatchProxy.onMethodExit(c.class, "2");
       return;
    }
    public View d(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       return a.a(p0, 0x7f0d052a);
    }
}
