package gs1.e;
import java.lang.Runnable;
import gs1.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleUserInfo;
import as1.b;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import android.view.View;
import com.kwai.library.widget.popup.bubble.a$c;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.n;
import com.kwai.library.widget.popup.common.c$b;
import java.util.concurrent.TimeUnit;
import gs1.b;
import android.view.View$OnClickListener;
import gs1.c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import v91.b;

public final class e implements Runnable	// class@002573
{
    public final f b;

    public void e(f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       e tb = this.b;
       f b = tb.b;
       LivePuzzleUserInfo livePuzzleUs = tb.c.c();
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(livePuzzleUs, b, LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding.class, "8")) {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          if (uActivity != null) {
             a uoa = new a(uActivity);
             uoa.K0(KwaiBubbleOption.e);
             uoa.o0(b.b);
             uoa.F0(a1.p(R.string.arg_RES_7f102aed));
             uoa.v0(a1.d(R.dimen.arg_RES_7f070334));
             uoa.u0(3);
             uoa.q0(true);
             uoa.I((n.k(uActivity) / 2));
             uoa.T(TimeUnit.SECONDS.toMillis(3));
             uoa.P(true);
             uoa.K(new b(b, livePuzzleUs));
             uoa.M(new c(b));
             uoa.A(false);
             a.o(uoa, "bubbleBuilder");
             b.h = p.o(uoa);
          }
       }
       this.b.b.a().a();
       return;
    }
}
