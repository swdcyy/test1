package b8a.s0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.s0$a;
import nsd.u;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import lnc.j2;
import com.yxcorp.utility.n;
import qrd.l1;

public final class s0 extends PresenterV2	// class@0003e4
{
    public View p;
    public static final s0$a q;

    static {
       s0.q = new s0$a(null);
    }
    public void s0(){
       super();
    }
    public void doBindView(View p0){
       s0 os0 = s0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, os0, "1")) {
          return;
       }
       p0 = m1.f(p0, R.id.top_gradual_mask_vs);
       a.o(p0, "ViewBindUtils.bindWidget¡­R.id.top_gradual_mask_vs\)");
       this.p = p0;
       if (!PatchProxy.applyVoid(null, this, os0, "2")) {
          s0 tp = this.p;
          String str = "mTopMask";
          if (tp == null) {
             a.S(str);
          }
          s0 tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          ViewGroup$LayoutParams layoutParams = tp1.getLayoutParams();
          s0 tp2 = this.p;
          if (tp2 == null) {
             a.S(str);
          }
          Context context = tp2.getContext();
          float f = (j2.a())? 0x42f00000: 76.00f;
          layoutParams.height = n.c(context, f);
          tp.setLayoutParams(layoutParams);
       }
       return;
    }
}
