package o90.f;
import androidx.lifecycle.Observer;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public final class f implements Observer	// class@002770
{
    public final KuaiShanEditActivityV2 b;
    public final KSTemplateDetailInfo c;

    public void f(KuaiShanEditActivityV2 p0,KSTemplateDetailInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          f tb = this.b;
          KuaiShanEditActivityV2 q = tb.Q;
          if (q != null) {
             a.o(p0, "progress");
             q.Nh(p0.intValue());
          }
          if (p0 != null && p0.intValue() == 100) {
             tb.K3(this.c);
          }
       }
       return;
    }
}
