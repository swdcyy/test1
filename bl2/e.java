package bl2.e;
import erd.g;
import bl2.j;
import java.lang.Object;
import com.kwai.feature.post.api.feature.live.ShareLivePredictionConfig;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bl2.j$a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import i2b.a;
import java.lang.Boolean;
import d61.l0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import android.widget.TextView;
import bl2.i;
import android.view.View$OnClickListener;
import j26.c;
import wk2.s;

public final class e implements g	// class@00040d
{
    public final j b;

    public void e(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oj, "5")) {
       }else {
          tb.C = p0.reservationId;
          int i = 0;
          if (p0.canShow != null) {
             if (tb.B == null) {
                j$a uoa = PatchProxy.apply(null, tb, oj, "7");
                if (uoa != PatchProxyResult.class) {
                }else {
                   uoa = new j$a(tb, a.a(tb.getContext(), 0x7f0d0df4));
                }
                tb.B = uoa;
             }
             oj = tb.B;
             Objects.requireNonNull(oj);
             if (!PatchProxy.applyVoidOneRefs(p0, oj, j$a.class, "2")) {
                if (p0.hasRedDot != null) {
                   l0 f = j.F;
                   if (!f.b(Boolean.FALSE).booleanValue()) {
                      oj.b.setVisibility(i);
                      f.i(Boolean.TRUE);
                   label_0077 :
                      ShareLivePredictionConfig desc = p0.desc;
                      if (TextUtils.x(desc)) {
                         desc = a1.p(R.string.arg_RES_7f102ce2);
                      }
                      oj.c.setText(desc);
                      oj.a.setOnClickListener(new i(oj));
                   }
                }
                oj.b.setVisibility(8);
                goto label_0077 ;
             }
             tb.z.b(tb.B.a);
             tb.z.g(true);
             if (tb.z.e()) {
                s.u((TextUtils.x(p0.reservationId) ^ true));
             }
          }else {
             tb.z.g(i);
          }
          if (!TextUtils.x(tb.C)) {
             tb.Z8(tb.C);
          }
       }
       return;
    }
}
