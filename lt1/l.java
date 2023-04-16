package lt1.l;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC;
import ut1.d;
import zs1.b;
import ft1.b;
import ws1.c;
import msd.a;
import st1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lt1.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import xh3.g;
import lt1.l$b;
import androidx.lifecycle.Observer;
import lt1.l$c;
import android.view.View$OnClickListener;
import android.view.View;
import ut1.a;
import lt1.l$a;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import lt1.c;
import lnc.a1;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import lt1.d;
import java.lang.Boolean;
import com.yxcorp.plugin.live.widget.LiveNoShrinkTextView;

public final class l extends LiveMultiPkVoteBangsVC	// class@003036
{
    public View t;
    public LiveNoShrinkTextView u;
    public View v;
    public final b w;
    public final b x;
    public final a y;

    public void l(d p0,b p1,b p2,c p3,a p4,a p5){
       a.p(p0, "countDownModel");
       a.p(p1, "coreModel");
       a.p(p2, "gameModel");
       a.p(p3, "pkContainerLayout");
       a.p(p4, "isAnchorSide");
       a.p(p5, "logDelegate");
       super(p0, p1, p2, p3, p5, p4);
       this.w = p1;
       this.x = p2;
       this.y = p4;
    }
    public void V2(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       a.p(p0, "viewModel");
       l tu = this.u;
       if (tu != null) {
          g.a(tu, this, p0.u0());
       }
       p0.v0().observe(this, new l$b(this));
       tu = this.v;
       if (tu != null) {
          tu.setOnClickListener(new l$c(p0));
       }
       a uoa = this.x.q();
       if (uoa != null) {
          String str = uoa.b();
          if (str != null) {
             LiveMultiPkVoteBangsVC tj = this.j;
             if (tj != null) {
                tj.setOnClickListener(new l$a(str, this));
             }
          }
       }
       return;
    }
    public View X2(ViewGroup p0){
       Context obj = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       obj = p0.getContext();
       Context context = p0.getContext();
       a.o(context, "parent.context");
       c uoc = new c(context);
       a uoa = this.x.q();
       String str = "context";
       if (uoa != null && uoa.a()) {
          a.o(obj, str);
          this.t = d.c(obj, 0x7f1025a7, a1.e(12.00f), a1.e(12.00f));
       }
       if (this.y.invoke().booleanValue()) {
          a.o(obj, str);
          this.v = d.a(obj, 0x7f102934);
       }
       a.o(obj, str);
       this.u = d.b(obj);
       return c.d(c.d(uoc, this.t, null, 2, null).a(0x7f1025b9, a1.e(20.00f)), this.u, null, 2, null).c(this.v, Boolean.TRUE).e();
    }
}
