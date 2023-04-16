package i19.l;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController;
import i19.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSession;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSessionState;
import msd.a;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class l implements ScreenCleanController	// class@002613
{
    public final q a;

    public void l(q p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       q obj = PatchProxy.apply(null, this, l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.A;
       boolean b = (obj != null)? obj.b(): false;
       return b;
    }
    public boolean b(){
       q obj = PatchProxy.apply(null, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.A;
       boolean b = (obj != null)? obj.c(): true;
       return b;
    }
    public ScreenCleanSessionState c(){
       Object[] objArray = null;
       q obj = PatchProxy.apply(objArray, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.A;
       if (obj != null) {
          objArray = obj.f();
       }
       return objArray;
    }
    public void d(boolean p0,int p1,a p2){
       q a;
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, l.class, "2")) {
          return;
       }
       a.p(p2, "callback");
       this.a.R8(false);
       a = this.a.A;
       if (a != null) {
          ScreenCleanSession.e(a, p0, p2, 0, 4, null);
       }
       return;
    }
    public void e(boolean p0,a p1){
       q a;
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ol, "1")) {
          return;
       }
       a.p(p1, "callback");
       this.a.R8(true);
       a = this.a.A;
       if (a != null) {
          a.g(p0, p1);
       }
       return;
    }
}
