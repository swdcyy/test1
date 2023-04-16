package ci3.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import o63.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import java.lang.String;
import msd.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.widget.BottomSheetFixedDialog;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Dialog;
import msd.a;
import java.lang.Integer;
import lnc.ja;
import le5.f;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel;
import mf5.s0;
import di3.h;
import java.util.List;
import trd.t;
import android.app.Activity;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.Objects;
import qrd.l1;
import kf5.x;
import mf5.v0;
import ci3.a;
import kf5.x$a;
import com.yxcorp.gifshow.share.widget.d;
import ci3.b$a;
import android.content.DialogInterface$OnCancelListener;
import ci3.b$b;
import android.content.DialogInterface$OnDismissListener;

public final class b	// class@00056a
{
    public k a;
    public final GifshowActivity b;
    public final BaseFragment c;
    public final a d;
    public final QPhoto e;
    public final FollowHelper$a f;
    public final String g;
    public final l h;

    public void b(GifshowActivity p0,BaseFragment p1,a p2,QPhoto p3,FollowHelper$a p4,String p5,l p6){
       a.p(p0, "activity");
       a.p(p1, "fragment");
       a.p(p2, "bridgeService");
       a.p(p3, "photo");
       a.p(p6, "switchTouchEnableStatusDelegate");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b ta = this.a;
       if (ta != null) {
          ta.dismiss();
       }
       return;
    }
    public final boolean b(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       b = true;
       if (obj == null || obj.isShowing() != b) {
          b = false;
       }
       return b;
    }
    public final void c(int p0,a p1){
       b b;
       b c;
       NewPlayerFeedbackPanel newPlayerFee;
       ClientContent$LiveStreamPackage liveStreamPa;
       l1 a;
       k ok = this;
       Object obj = p1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), obj, ok, uob, "1")) {
          return;
       }
       a.p(obj, "liveStreamPackageProvider");
       ja.a();
       if (f.d()) {
          b = ok.b;
          c = ok.c;
          b e = ok.e;
          h oh = new h(b, c, e, ok.f, p0, p1, ok.g, ok.d);
          newPlayerFee = NewPlayerFeedbackPanel.e1.a(b, c, e, new s0(t.k(v16)));
          liveStreamPa = p1.invoke();
          if (liveStreamPa != null) {
             Objects.requireNonNull(newPlayerFee);
             if (!PatchProxy.applyVoidOneRefs(liveStreamPa, newPlayerFee, NewPlayerFeedbackPanel.class, "15")) {
                a.p(liveStreamPa, "liveStreamPackage");
                newPlayerFee.W = liveStreamPa;
             }
          }
          a = l1.a;
       }else {
          b b1 = ok.b;
          b = ok.c;
          c = ok.e;
          a uoa = new a(b1, b, c, ok.f, p0, p1, ok.g, ok.d);
          newPlayerFee = x.W.a(b1, b, c, new v0(t.k(v16)));
          liveStreamPa = p1.invoke();
          if (liveStreamPa != null) {
             Objects.requireNonNull(newPlayerFee);
             if (!PatchProxy.applyVoidOneRefs(liveStreamPa, newPlayerFee, x.class, "9")) {
                a.p(liveStreamPa, "liveStreamPackage");
                newPlayerFee.q = liveStreamPa;
             }
          }
          a = l1.a;
       }
       ok.a = newPlayerFee;
       ok.h.invoke(Boolean.FALSE);
       uob = ok.a;
       if (uob != null) {
          uob.setOnCancelListener(new b$a(ok));
          uob.setOnDismissListener(new b$b(ok));
          uob.show();
       }
       return;
    }
}
