package b4d.y;
import java.lang.Runnable;
import b4d.z;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.RelativeLayout$LayoutParams;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import b4d.x;

public final class y implements Runnable	// class@0003a1
{
    public final z b;

    public void y(z p0){
       this.b = p0;
    }
    public final void run(){
       boolean b;
       y tb = this.b;
       Objects.requireNonNull(tb);
       z oz = z.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, oz, "3")) {
       }else if(tb.p != null){
          z q = tb.q;
          if (q != null && (q.getWidth() > 0 && tb.p.getLayoutParams() instanceof RelativeLayout$LayoutParams)) {
             RelativeLayout$LayoutParams layoutParams = tb.p.getLayoutParams();
             layoutParams.width = -2;
             layoutParams.addRule(11);
             if (!k1.f()) {
                Object obj = PatchProxy.apply(objArray, tb, oz, "4");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(tb.getActivity() == null){
                   oz = tb.q;
                   if (oz != null && (((float)oz.getWidth() * 0x3f800000) / (float)n.z(tb.getActivity())) - 0x3e99999a > 0) {
                      b = true;
                   }
                }
                b = false;
                if (b) {
                   tb.r = 4;
                   layoutParams.leftMargin = tb.q.getWidth() + a1.e(8.00f);
                   layoutParams.rightMargin = z.s;
                label_009a :
                   tb.p.postDelayed(new x(tb), 10);
                   oz = tb.p;
                   oz.setPadding(z.t, oz.getPaddingTop(), tb.p.getPaddingRight(), tb.p.getPaddingBottom());
                   tb.p.setLayoutParams(layoutParams);
                }
             }
             layoutParams.rightMargin = z.s / 2;
             goto label_009a ;
          }
       }
       return;
    }
}
