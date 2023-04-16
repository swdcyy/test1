package j02.f;
import androidx.lifecycle.Observer;
import j02.k;
import j02.o;
import java.lang.Object;
import k02.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j02.l;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import java.util.Objects;
import gg1.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import k2b.e0;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import android.view.ViewGroup;
import com.kuaishou.live.common.treasurebox.widget.LiveAudienceTreasureBoxWidgetView;
import android.content.Context;
import com.kuaishou.live.common.treasurebox.LiveAudienceTreasureBoxDataBinding$showTreasureBoxWidgetView$1;
import android.util.AttributeSet;
import msd.a;
import nsd.u;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import k02.h;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator$AnimatorListener;
import j02.j;
import android.view.View$OnClickListener;

public final class f implements Observer	// class@002a1b
{
    public final k b;
    public final o c;

    public void f(k p0,o p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       boolean b;
       a a;
       LiveAudienceTreasureBoxWidgetView liveAudience;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          b.P(l.a, "bindViewModel - »Øµ÷  DataBInd: "+this.b+' '+this.b.a+", containerView: "+this.b.e+", widgetStatusInfo, "+p0+", hasAddWidgetView:");
          b = false;
          if (p0.b()) {
             f tb = this.b;
             f tc = this.c;
             a.o(p0, "it");
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidTwoRefs(tc, p0, tb, k.class, "3")) {
                if (tb.a == null) {
                   a = a.a;
                   ClientContent$LiveStreamPackage liveStreamPa = tb.g.a();
                   a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
                   e0 page = tb.g.getPage();
                   a.o(page, "liveLogPackageProvider.page");
                   int i = p0.b();
                   String str = p0.a();
                   Objects.requireNonNull(a);
                   if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(liveStreamPa, page, Integer.valueOf(i), str, a, a.class, "1")) {
                      a.p(liveStreamPa, "liveStreamPackage");
                      a.p(page, "logPage");
                      i3 oi3 = i3.f();
                      oi3.c("box_status", Integer.valueOf(i));
                      oi3.d("box_text", str);
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "LIVE_GROWTH_COIN_BOX";
                      uElementPack.params = oi3.e();
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = liveStreamPa;
                      u1.B0(new ShowMetaData().setType(9).setLogPage(page).setElementPackage(uElementPack).setContentPackage(uContentPack));
                   }
                   tb.e.removeAllViews();
                   Context context = tb.e.getContext();
                   a.o(context, "containerView.context");
                   liveAudience = new LiveAudienceTreasureBoxWidgetView(context, null, 0, new LiveAudienceTreasureBoxDataBinding$showTreasureBoxWidgetView$1(tb, tc), tb.h, 6, null);
                   tb.b = liveStreamPa;
                   tb.e.setClipChildren(b);
                   tb.e.setClipToPadding(b);
                   tb.e.addView(tb.b, tb.a(tc));
                   tb.a = true;
                }
                k b1 = tb.b;
                if (b1 != null && !PatchProxy.applyVoidOneRefs(p0, b1, LiveAudienceTreasureBoxWidgetView.class, "2")) {
                   a.p(p0, "targetStatusInfo");
                   List a1 = h.a;
                   b.P(a1, "updateWidgetStatus, targetStatusInfo:"+p0+", "+"currentStatusInfo: "+b1.h);
                   b1.h = p0;
                   LiveAudienceTreasureBoxWidgetView d = b1.d;
                   if (d == null) {
                      a.S("treasureBoxBottomDescription");
                   }
                   d.setText(p0.a());
                   if (p0.d != null) {
                      b.P(a1, "updateWidgetStatus 1-1, showFirstNewTipAnimation ");
                      b1.b();
                      liveAudience = b1.e;
                      if (liveAudience == null) {
                         a.S("treasureBoxImageView");
                      }
                      liveAudience.setVisibility(8);
                      liveAudience = b1.f;
                      if (liveAudience == null) {
                         a.S("treasureBoxBottomAnimationView");
                      }
                      liveAudience.setVisibility(b);
                      liveAudience = b1.f;
                      if (liveAudience == null) {
                         a.S("treasureBoxBottomAnimationView");
                      }
                      liveAudience.D(R.string.arg_RES_7f102608);
                      p0 = (p0.b() == 2)? b1.c: b1.b;
                      liveAudience = b1.f;
                      if (liveAudience == null) {
                         a.S("treasureBoxBottomAnimationView");
                      }
                      liveAudience.C(b, p0);
                      p0 = b1.f;
                      if (p0 == null) {
                         a.S("treasureBoxBottomAnimationView");
                      }
                      p0.setRepeatCount(b);
                      p0 = b1.f;
                      if (p0 == null) {
                         a.S("treasureBoxBottomAnimationView");
                      }
                      p0.a(b1.k);
                      p0 = b1.f;
                      if (p0 == null) {
                         a.S("treasureBoxBottomAnimationView");
                      }
                      p0.s();
                   }else {
                      b.P(a1, "updateWidgetStatus 1-2, doTransferWidgetState ");
                      b1.a(p0);
                   }
                }
                p0 = tb.b;
                if (p0 != null) {
                   p0.setClickListener(new j(tc));
                }
             }
          }else {
             p0 = this.b;
             if (p0.a != null) {
                p0.e.removeAllViews();
                p0.a = b;
             }
          }
       }
       return;
    }
}
