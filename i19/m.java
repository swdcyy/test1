package i19.m;
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

public final class m implements ScreenCleanController	// class@002614
{
    public final q a;

    public void m(q p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       q obj = PatchProxy.apply(null, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.B;
       boolean b = (obj != null)? obj.b(): false;
       return b;
    }
    public boolean b(){
       q obj = PatchProxy.apply(null, this, m.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.B;
       boolean b = (obj != null)? obj.c(): true;
       return b;
    }
    public ScreenCleanSessionState c(){
       Object[] objArray = null;
       q obj = PatchProxy.apply(objArray, this, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.B;
       if (obj != null) {
          objArray = obj.f();
       }
       return objArray;
    }
    public void d(boolean p0,int p1,a p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, m.class, "2")) {
          return;
       }
       a.p(p2, "callback");
       m ta = this.a;
       ta.P8(false, ta.B);
       q b = this.a.B;
       if (b != null) {
          ScreenCleanSession.e(b, p0, p2, 0, 4, null);
       }
       return;
    }
    public void e(boolean p0,a p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, om, "1")) {
          return;
       }
       a.p(p1, "callback");
       om = this.a;
       om.P8(true, om.B);
       q b = this.a.B;
       if (b != null) {
          b.g(p0, p1);
       }
       return;
    }
}
