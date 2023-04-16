package hc2.g;
import erd.g;
import com.kuaishou.live.core.show.luckystar.v2.currentinfo.b;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarInfo;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import crd.b;
import lnc.b9;
import android.view.View;
import android.widget.TextView;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$PanelBackgroundResources;
import lnc.a1;
import java.lang.String;
import z12.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.GradientDrawable;
import d61.k;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import java.lang.CharSequence;

public final class g implements g	// class@002d5c
{
    public final b b;
    public final LiveLuckyStarInfoResponse$LiveLuckyStarInfo c;

    public void g(b p0,LiveLuckyStarInfoResponse$LiveLuckyStarInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       Objects.requireNonNull(tb);
       int i = 8;
       int i1 = 0x7f061486;
       if (p0.longValue() <= 0) {
          b9.a(tb.V);
          tb.y.setVisibility(i);
          tb.B.setVisibility(0);
          tb.B.setTextColor(x.A(tc.getPanelBackgroundResources().mCountdownTextColor, a1.a(i1)));
       }else {
          tb.y.setVisibility(0);
          b uob = b.class;
          if (!PatchProxy.applyVoidOneRefs(tc, tb, uob, "11")) {
             GradientDrawable gradientDraw = PatchProxy.applyOneRefs(tc, tb, uob, "12");
             if (gradientDraw != PatchProxyResult.class) {
             }else {
                gradientDraw = new GradientDrawable();
                gradientDraw.setColor(k.c(tc.getPanelBackgroundResources().mCountdownBackgroundColor, a1.a(R.color.arg_RES_7f061485)));
                gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07031b));
             }
             tb.z.setBackground(gradientDraw);
             tb.A.setBackground(gradientDraw);
             tb.z.setTextColor(x.A(tc.getPanelBackgroundResources().mCountdownTextColor, a1.a(R.color.arg_RES_7f06060a)));
             tb.A.setTextColor(x.A(tc.getPanelBackgroundResources().mCountdownTextColor, a1.a(R.color.arg_RES_7f06060a)));
             tb.C.setTextColor(x.A(tc.getPanelBackgroundResources().mCountdownTextColor, a1.a(i1)));
             tb.E.setTextColor(x.A(tc.getPanelBackgroundResources().mCountdownTextColor, a1.a(i1)));
             tb.D.setColorFilter(x.A(tc.getPanelBackgroundResources().mCountdownTextColor, a1.a(i1)));
          }
          tb.B.setVisibility(i);
          long l = TimeUnit.MILLISECONDS.toSeconds(p0.longValue());
          long l1 = TimeUnit.MINUTES.toSeconds(1);
          long l2 = l / l1;
          l = l % l1;
          Locale uS = Locale.US;
          Object[] objArray = new Object[]{Long.valueOf(l2)};
          tb.z.setText(String.format(uS, "%02d", objArray));
          Object[] objArray1 = new Object[]{Long.valueOf(l)};
          tb.A.setText(String.format(uS, "%02d", objArray1));
       }
       return;
    }
}
