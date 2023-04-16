package i19.o;
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

public final class o implements ScreenCleanController	// class@002616
{
    public final q a;

    public void o(q p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       q obj = PatchProxy.apply(null, this, o.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.D;
       boolean b = (obj != null)? obj.b(): false;
       return b;
    }
    public boolean b(){
       q obj = PatchProxy.apply(null, this, o.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.D;
       boolean b = (obj != null)? obj.c(): false;
       return b;
    }
    public ScreenCleanSessionState c(){
       Object[] objArray = null;
       q obj = PatchProxy.apply(objArray, this, o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.D;
       if (obj != null) {
          objArray = obj.f();
       }
       return objArray;
    }
    public void d(boolean p0,int p1,a p2){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, o.class, "2")) {
          return;
       }
       a.p(p2, "callback");
       q d = this.a.D;
       if (d != null) {
          d.d(p0, p2, p1);
       }
       return;
    }
    public void e(boolean p0,a p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oo, "1")) {
          return;
       }
       a.p(p1, "callback");
       q d = this.a.D;
       if (d != null) {
          d.g(p0, p1);
       }
       return;
    }
}
