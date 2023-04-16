package cdc.b;
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
import com.yxcorp.gifshow.reminder.friend.presenter.single.a;
import ydc.h;
import zcc.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import zcc.k;
import ydc.b;
import cdc.a;
import com.yxcorp.gifshow.reminder.friend.presenter.single.b;
import i2b.a;

public class b implements v	// class@00057e
{

    public void b(){
       super();
    }
    public PresenterV2 a(){
       return u.b(this);
    }
    public View b(Context p0){
       return u.c(this, p0);
    }
    public void c(PresenterV2 p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "2")) {
          return;
       }
       p0.U7(new i());
       p0.U7(new a());
       p0.U7(new h());
       Object obj = PatchProxy.apply(null, null, l.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(b.a(0x78443100).c() == 1){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          p0.U7(new b());
          if (a.b()) {
             p0.U7(new b());
          }
       }
       PatchProxy.onMethodExit(b.class, "2");
       return;
    }
    public View d(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0, 0x7f0d052b);
    }
}
