package n21.o$a;
import n21.h$b;
import n21.o;
import java.lang.Object;
import n21.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import n21.p;
import android.view.View$OnClickListener;
import n21.l;
import n21.p$c;
import ks5.m;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import java.util.Map;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.yxcorp.utility.TextUtils;
import n21.g;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import java.lang.Boolean;
import n21.m;
import hc.a;

public class o$a implements h$b	// class@003296
{
    public final o a;

    public void o$a(o p0){
       this.a = p0;
       super();
    }
    public void a(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "1")) {
          return;
       }
       o$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, o.class, "4")) {
          View view = a.d(ta.getContext(), R.layout.arg_RES_7f0d0e17, null, false);
          p op = new p(view, view.findViewById(0x7f0a26ca), view.findViewById(0x7f0a26cb), view.findViewById(0x7f0a26cc));
          op.a(p0, true, ta.P8(p0), new l(ta, p0));
          ta.p.b(op.b());
          ta.t.put(p0.e(), op);
          ClientContent$LiveStreamPackage liveStreamPa = ta.r.a();
          String str = p0.e();
          int i = p0.f();
          String str1 = TextUtils.k(p0.c());
          if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidFourRefs(liveStreamPa, str, Integer.valueOf(i), str1, null, g.class, "1")) {
             u1.u0(5, g.b(), g.a(liveStreamPa, str, i, str1));
          }
       }
       return;
    }
    public void b(String p0,e p1,boolean p2){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, o$a.class, "2")) {
          return;
       }
       o$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(o.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), ta, o.class, "5")) {
          p op = ta.t.get(p0);
          if (op != null) {
             op.a(p1, p2, ta.P8(p1), new m(ta, p0));
          }
       }
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "3")) {
          return;
       }
       o$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, o.class, "6")) {
          p op = ta.t.remove(p0);
          if (op != null) {
             if (!PatchProxy.applyVoid(null, op, p.class, "2")) {
                p g = op.g;
                if (g != null && g.isRunning()) {
                   op.g.stop();
                }
             }
             ta.p.c(op.b());
          }
       }
       return;
    }
}
