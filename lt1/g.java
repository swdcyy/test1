package lt1.g;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC;
import ut1.d;
import zs1.b;
import ft1.b;
import ws1.c;
import msd.a;
import st1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lt1.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import xh3.g;
import lt1.g$b;
import android.view.View$OnClickListener;
import ut1.a;
import android.view.View;
import lt1.g$a;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.yxcorp.plugin.live.widget.LiveNoShrinkTextView;
import lt1.d;
import lnc.a1;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import java.lang.Boolean;
import lt1.c;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.multipk.logger.LiveMultiPkLogType;
import st1.c;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import st1.e;

public final class g extends LiveMultiPkPunishBangsVC	// class@00302b
{
    public final a A;
    public TextView u;
    public TextView v;
    public View w;
    public final b x;
    public final b y;
    public final a z;

    public void g(d p0,b p1,b p2,c p3,a p4,a p5){
       a.p(p0, "countDownModel");
       a.p(p1, "coreModel");
       a.p(p2, "gameModel");
       a.p(p3, "pkContainerLayout");
       a.p(p4, "isAnchorSide");
       a.p(p5, "logDelegate");
       super(p0, p1, p2, p3, p4, p5);
       this.x = p1;
       this.y = p2;
       this.z = p4;
       this.A = p5;
    }
    public void V2(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       a.p(p0, "viewModel");
       g tu = this.u;
       if (tu != null) {
          g.a(tu, this, p0.u0());
       }
       tu = this.v;
       if (tu != null) {
          tu.setOnClickListener(new g$b(p0));
       }
       a uoa = this.y.q();
       if (uoa != null) {
          String str = uoa.b();
          if (str != null) {
             View view = this.Y2();
             if (view != null) {
                view.setOnClickListener(new g$a(str, this));
             }
          }
       }
       return;
    }
    public View W2(ViewGroup p0,String p1){
       Context context;
       Context obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "root");
       a.p(p1, "title");
       obj = p0.getContext();
       a.o(obj, "context");
       this.u = d.b(obj);
       a uoa = this.y.q();
       if (uoa != null && uoa.a()) {
          this.w = d.c(obj, 0x7f1025a7, a1.e(12.00f), a1.e(12.00f));
       }
       if (this.z.invoke().booleanValue()) {
          this.v = d.a(obj, 0x7f102934);
       }
       context = p0.getContext();
       a.o(context, "root.context");
       c uoc = new c(context);
       return c.d(c.d(uoc, this.w, null, 2, null).b(p1), this.u, null, 2, null).c(this.v, Boolean.TRUE).e();
    }
    public void Z2(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       if (this.v != null && !this.y.n()) {
          this.y.u(true);
          e.b(LiveMultiPkLogType.SHOW, "EXIT", this.A.l(), this.A.i(), this.A.a());
       }
       return;
    }
}
