package gz9.i;
import com.yxcorp.gateway.pay.api.PayCallback;
import gz9.b;
import java.lang.Object;
import com.yxcorp.gateway.pay.params.PayResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uw9.o;
import q87.c;

public final class i implements PayCallback	// class@00251e
{
    public final b a;

    public void i(b p0){
       this.a = p0;
       super();
    }
    public void onPayCancel(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       a.p(p0, "result");
       Object[] objArray = new Object[]{p0.mCode};
       o.C().w("PayCoursePaymentController", "onPayCancel", objArray);
       this.a.c();
       return;
    }
    public void onPayFailure(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       a.p(p0, "result");
       Object[] objArray = new Object[]{p0.mCode};
       o.C().w("PayCoursePaymentController", "onPayFailure", objArray);
       this.a.c();
       return;
    }
    public void onPaySuccess(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       a.p(p0, "result");
       Object[] objArray = new Object[]{p0.mCode};
       o.C().w("PayCoursePaymentController", "pay success", objArray);
       i ta = this.a;
       ta.b(ta.d());
       return;
    }
    public void onPayUnknown(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       a.p(p0, "result");
       Object[] objArray = new Object[]{p0.mCode};
       o.C().w("PayCoursePaymentController", "onPayUnknown", objArray);
       i ta = this.a;
       ta.b(ta.d());
       return;
    }
}
