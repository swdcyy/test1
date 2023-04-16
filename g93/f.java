package g93.f;
import android.view.View$OnClickListener;
import android.widget.TextView;
import g93.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.benefitcard.model.LiveBenefitCardInfo;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import vq5.d;
import lnc.a1;
import android.graphics.drawable.Drawable;
import d61.h;
import f93.b;

public final class f implements View$OnClickListener	// class@002ad9
{
    public final TextView b;
    public final g c;

    public void f(TextView p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "1")) {
          return;
       }
       f tc = this.c;
       f tb = this.b;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(tb, tc, g.class, "8")) {
          tc.k.r4(tc.j.mButtonRouter, tc.D2());
          tb.setBackground(h.a(a1.d(R.dimen.arg_RES_7f07042c), a1.a(R.color.arg_RES_7f061be3)));
          tc.l.a(1);
          tc.l.dismiss();
       }
       PatchProxy.onMethodExit(f.class, "1");
       return;
    }
}
