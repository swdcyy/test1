package i19.p;
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

public final class p implements ScreenCleanController	// class@002617
{
    public final q a;

    public void p(q p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       q obj = PatchProxy.apply(null, this, p.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.C;
       boolean b = (obj != null)? obj.b(): false;
       return b;
    }
    public boolean b(){
       q obj = PatchProxy.apply(null, this, p.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.C;
       boolean b = (obj != null)? obj.c(): false;
       return b;
    }
    public ScreenCleanSessionState c(){
       Object[] objArray = null;
       q obj = PatchProxy.apply(objArray, this, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.C;
       if (obj != null) {
          objArray = obj.f();
       }
       return objArray;
    }
    public void d(boolean p0,int p1,a p2){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, p.class, "2")) {
          return;
       }
       a.p(p2, "callback");
       q c = this.a.C;
       if (c != null) {
          ScreenCleanSession.e(c, p0, p2, 0, 4, null);
       }
       return;
    }
    public void e(boolean p0,a p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, op, "1")) {
          return;
       }
       a.p(p1, "callback");
       q c = this.a.C;
       if (c != null) {
          c.g(p0, p1);
       }
       return;
    }
}
