package nx0.e;
import androidx.lifecycle.Observer;
import nx0.a;
import nx0.x;
import java.lang.Object;
import nx0.y;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View;
import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import nx0.b;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View$a;
import nx0.c;
import android.view.View$OnClickListener;
import nx0.d;
import android.widget.RelativeLayout;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import nx0.q;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import qd1.a;
import lnc.a1;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Objects;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import wb5.g;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import android.view.View;
import d61.f0;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import s0d.f;
import s0d.e;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import ekd.p1;
import nx0.o;
import d61.j0;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.ViewPropertyAnimator;
import nx0.u;
import android.animation.Animator$AnimatorListener;
import qrd.l1;

public final class e implements Observer	// class@0033ea
{
    public final a b;
    public final x c;

    public void e(a p0,x p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       float f;
       boolean b;
       d uod;
       AbstractDraweeController uAbstractDra;
       Object[] objArray;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, str)) {
       }else {
          String str1 = "viewParam";
          b.S(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2DataBinding"), "receive viewParam", str1, p0);
          this.b.a();
          e tb = this.b;
          Context context = this.b.c.getContext();
          a.o(context, "containerView.context");
          LiveAudienceOverRoomV2View liveAudience = new LiveAudienceOverRoomV2View(context);
          liveAudience.setOnDismissListener(new b(liveAudience, this, p0));
          liveAudience.setCloseClickListener(new c(this, p0));
          liveAudience.setOnClickListener(new d(liveAudience, this, p0));
          a.o(p0, "it");
          long l = 0x7f07031b;
          if (!PatchProxy.applyVoidOneRefs(p0, liveAudience, LiveAudienceOverRoomV2View.class, str)) {
             a.p(p0, "param");
             liveAudience.u = p0;
             b = false;
             KwaiRadiusStyles kwaiRadiusSt = 8;
             if (!PatchProxy.applyVoidOneRefs(p0, liveAudience, LiveAudienceOverRoomV2View.class, "8")) {
                if (TextUtils.x(p0.e()) || p0.f() - null <= 0) {
                   liveAudience.c.setVisibility(kwaiRadiusSt);
                   liveAudience.r = b;
                }else {
                   uod = Fresco.newDraweeControllerBuilder();
                   uod.q(b);
                   uod = uod.E(p0.e());
                   uod.s(new q());
                   uAbstractDra = uod.e();
                   a.o(uAbstractDra, "Fresco.newDraweeControll¡­}\n      }\)\n      .build\(\)");
                   liveAudience.d.setController(uAbstractDra);
                   if (!TextUtils.x(p0.g())) {
                      liveAudience.f.setText(p0.g());
                      liveAudience.e.setVisibility(b);
                      liveAudience.e(liveAudience.f, p0.h().a, p0.h().b, a1.d(R.dimen.arg_RES_7f0705eb));
                   }else {
                      liveAudience.e.setVisibility(kwaiRadiusSt);
                   }
                }
             }
             boolean b1 = true;
             if (!PatchProxy.applyVoidOneRefs(p0, liveAudience, LiveAudienceOverRoomV2View.class, "9")) {
                uod = Fresco.newDraweeControllerBuilder();
                uod.q(b);
                uAbstractDra = uod.E(p0.a()).e();
                a.o(uAbstractDra, "Fresco.newDraweeControll¡­UriString\)\n      .build\(\)");
                liveAudience.h.setController(uAbstractDra);
                if (!q.f(p0.b())) {
                   liveAudience.t = b1;
                   LiveAudienceOverRoomV2View k = liveAudience.k;
                   List list = p0.b();
                   if (list != null) {
                      CDNUrl[] uCDNUrlArray = new CDNUrl[b];
                      objArray = list.toArray(uCDNUrlArray);
                      Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                   }else {
                      objArray = null;
                   }
                   g.h(k, null, null, objArray, HeadImageSize.MIDDLE);
                   liveAudience.k.setVisibility(b);
                   liveAudience.l.D(R.string.arg_RES_7f102607);
                   liveAudience.l.setVisibility(kwaiRadiusSt);
                   liveAudience.i.setGravity(b1);
                   liveAudience.f(liveAudience.i, a1.d(R.dimen.arg_RES_7f07034b), a1.d(R.dimen.arg_RES_7f07034b), a1.d(R.dimen.arg_RES_7f07034b));
                }else {
                   liveAudience.i.setGravity(3);
                   liveAudience.f(liveAudience.i, a1.d(l), a1.d(l), a1.d(l));
                }
                liveAudience.i.setText(p0.f);
                if (p0.h != null) {
                   f0.i(liveAudience.i, liveAudience.getContext());
                }
                if (p0.i != null) {
                   liveAudience.j.setVisibility(b);
                }
             }
             if (!PatchProxy.applyVoidOneRefs(p0, liveAudience, LiveAudienceOverRoomV2View.class, "10")) {
                if (!q.f(p0.d())) {
                   if (p0.l != null) {
                      RoundingParams roundingPara = new RoundingParams();
                      roundingPara.q(b1);
                      a hierarchy = liveAudience.o.getHierarchy();
                      a.o(hierarchy, "bottomPartImageView.hierarchy");
                      hierarchy.L(roundingPara);
                      ViewGroup$LayoutParams layoutParams = liveAudience.o.getLayoutParams();
                      a.o(layoutParams, "bottomPartImageView.layoutParams");
                      layoutParams.height = a1.d(0x7f0702cc);
                      layoutParams.width = a1.d(0x7f0702cc);
                      if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                         layoutParams.rightMargin = a1.d(0x7f070334);
                      }
                      liveAudience.o.setLayoutParams(layoutParams);
                   }
                   uod = Fresco.newDraweeControllerBuilder();
                   uod.q(b);
                   uod.u(f.x().u(p0.d()).w());
                   uAbstractDra = uod.e();
                   a.o(uAbstractDra, "Fresco.newDraweeControll¡­uests\(\)\)\n        .build\(\)");
                   liveAudience.o.setController(uAbstractDra);
                }else {
                   liveAudience.o.setVisibility(kwaiRadiusSt);
                }
                if (!TextUtils.x(p0.c())) {
                   liveAudience.p.setText(p0.c());
                   if (liveAudience.r == null) {
                      liveAudience.m.setTranslationY((float)a1.d(R.dimen.arg_RES_7f0705e8));
                   }
                   b uob = new b();
                   uob.g(KwaiRadiusStyles.BL4_BR4);
                   uob.v(p0.h().e);
                   uob.s(DrawableCreator$Shape.Rectangle);
                   liveAudience.m.setBackground(uob.a());
                   liveAudience.e(liveAudience.p, p0.h().c, p0.h().d, a1.d(R.dimen.arg_RES_7f0705e7));
                }else {
                   liveAudience.s = b;
                   liveAudience.m.setVisibility(kwaiRadiusSt);
                }
             }
             if (!PatchProxy.applyVoid(null, liveAudience, LiveAudienceOverRoomV2View.class, "11")) {
                p1.c(liveAudience.q, a1.d(R.dimen.arg_RES_7f070334), a1.d(R.dimen.arg_RES_7f070334), a1.d(R.dimen.arg_RES_7f070334), a1.d(R.dimen.arg_RES_7f070334));
                liveAudience.q.setOnClickListener(new o(liveAudience));
             }
          }
          this.b.c.addView(liveAudience);
          if (!PatchProxy.applyVoid(null, liveAudience, LiveAudienceOverRoomV2View.class, "2")) {
             if (!PatchProxy.applyVoid(null, liveAudience, LiveAudienceOverRoomV2View.class, "7")) {
                p0 = liveAudience.getLayoutParams();
                Objects.requireNonNull(p0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                p0.width = a1.d(0x7f07034e);
                int i = (liveAudience.r != null || liveAudience.s == null)? a1.d(R.dimen.arg_RES_7f0705ea): a1.d(R.dimen.arg_RES_7f0705e6);
                p0.height = i;
                p0.leftMargin = a1.d(0x7f07025d);
                liveAudience.setLayoutParams(p0);
                j0.a(liveAudience, (float)a1.d(l));
             }
             p0 = liveAudience.u;
             if (p0 == null) {
                a.S(str1);
             }
             l = p0.f();
             p0 = liveAudience.u;
             if (p0 == null) {
                a.S(str1);
             }
             f = - (float)n.k(n.d(liveAudience));
             liveAudience.setTranslationX(f);
             liveAudience.animate().setDuration(1200).translationX(0).setListener(new u(liveAudience, (l + p0.e), f)).start();
          }
          tb.a = liveAudience;
       }
       return;
    }
}
