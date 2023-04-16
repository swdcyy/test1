package com.yxcorp.gifshow.relation.intimate.dialog.p;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import java.util.ArrayList;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.intimate.dialog.p$e;
import java.util.Objects;
import abc.x;
import abc.y;
import w4.j;
import android.content.Context;
import android.widget.ImageView;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import java.util.List;
import android.view.View;
import com.kwai.framework.model.user.IntimateTag;
import lnc.a1;
import ekd.m1;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.yxcorp.gifshow.relation.intimate.dialog.q;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import k2b.e0;
import cbc.b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Integer;
import android.animation.ValueAnimator;
import h2.b;
import java.util.Iterator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import abc.t;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import abc.v;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.i3;
import java.lang.Number;
import k2b.h;
import dbc.a;
import com.yxcorp.gifshow.relation.intimate.dialog.p$d;
import com.yxcorp.gifshow.relation.intimate.dialog.p$a;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.relation.intimate.dialog.p$b;
import com.yxcorp.gifshow.relation.intimate.dialog.p$c;

public class p extends e	// class@001900
{
    public SlipSwitchButton m;
    public LottieAnimationView n;
    public LottieAnimationView o;
    public ValueAnimator p;
    public f q;
    public f r;
    public final List s;
    public b t;
    public boolean u;

    public void p(GifshowActivity p0,IntimateRelationDialogParams p1,PopupInterface$h p2){
       super(p0, p1, p2);
       this.s = new ArrayList();
       this.l = 163;
       this.k = p1.mEnableProfileShow;
    }
    public final void A(LottieAnimationView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "9")) {
          return;
       }
       Objects.requireNonNull(p0);
       p$e uoe = new p$e(p1, new x(p0), new y(p0));
       uoe.b = a.i(p0.getContext(), p1).addListener(uoe.c).addFailureListener(uoe.d);
       this.s.add(uoe);
       return;
    }
    public int f(){
       return 0x7f0d063e;
    }
    public void p(View p0){
       p op = p.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, op, "1")) {
          return;
       }
       boolean b = true;
       this.k(p0, b);
       this.h(p0);
       this.o(p0, a1.r(R.string.arg_RES_7f104d30, this.i.mIntimateTag.nickName));
       this.j(p0, a1.r(R.string.arg_RES_7f1041d0, this.i.mIntimateTag.nickName));
       if (!PatchProxy.applyVoidOneRefs(p0, this, op, "10")) {
          SlipSwitchButton slipSwitchBu = m1.f(p0, R.id.switch_btn);
          this.m = slipSwitchBu;
          slipSwitchBu.g(this.k, false, false);
          this.m.setOnlyResponseClick(b);
          this.m.setOnClickListener(new q(this));
       }
       this.z(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, op, "8")) {
          this.n = p0.findViewById(0x7f0a3c09);
          this.o = p0.findViewById(0x7f0a3c0a);
          this.A(this.n, "https://static.yximgs.com/udata/pkg/kwai-client-image/intimate_relation/intimate_success_anim_behind.json");
          this.A(this.o, "https://static.yximgs.com/udata/pkg/kwai-client-image/intimate_relation/intimate_success_anim_front.json");
       }
       this.d.setAlpha(0);
       this.e.setAlpha(0);
       this.c.setScaleX(0);
       this.c.setScaleY(0);
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       super.q();
       e ti = this.i;
       b.d(ti.mTargetId, this.k, ti.isFromAgree, this.g, "HEAD_TO_PROFILE");
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       super.r();
       e ti = this.i;
       b.d(ti.mTargetId, this.k, ti.isFromAgree, this.g, "HEAD_TO_PROFILE");
       return;
    }
    public void s(c p0,int p1){
       p$e b;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, op, "17")) {
          return;
       }
       super.s(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, op, "18")) {
          op = this.p;
          if (op != null && op.isRunning()) {
             this.p.removeAllUpdateListeners();
             this.p.cancel();
          }
          op = this.q;
          if (op != null && op.h()) {
             this.q.b();
          }
          op = this.r;
          if (op != null && op.h()) {
             this.r.b();
          }
          Iterator iterator = this.s.iterator();
          while (iterator.hasNext()) {
             p$e uoe = iterator.next();
             b = uoe.b;
             if (b != null) {
                b.removeListener(uoe.c);
                uoe.b.removeFailureListener(uoe.d);
                uoe.b = objArray;
             }
          }
          p tn = this.n;
          if (tn != null && tn.p()) {
             this.n.t();
             this.n.f();
          }
          tn = this.o;
          if (tn != null && tn.p()) {
             this.o.t();
             this.o.f();
          }
       }
    label_00a2 :
       if (p1 != 11) {
          e ti = this.i;
          b.d(ti.mTargetId, this.k, ti.isFromAgree, this.g, "CLOSE");
       }
       return;
    }
    public void t(){
       p op = p.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, op, "13")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, op, "14")) {
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0}).setDuration(180);
          this.p = valueAnimato;
          valueAnimato.setInterpolator(new DecelerateInterpolator(0x3fc00000));
          this.p.addUpdateListener(new t(this, a1.e(50.00f)));
          this.p.start();
       }
       k1.s(new v(this), this, 126);
       return;
    }
    public void u(c p0){
       String id;
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "12")) {
          return;
       }
       e ti = this.i;
       IntimateRelationDialogParams mTargetId = ti.mTargetId;
       IntimateRelationDialogParams isFromAgree = ti.isFromAgree;
       e tg = this.g;
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(mTargetId, Boolean.valueOf(isFromAgree), tg, null, b.class, "23")) {
          if (isFromAgree != null) {
             id = QCurrentUser.me().getId();
          }else {
             mTargetId = QCurrentUser.me().getId();
             id = mTargetId;
          }
          int i = (isFromAgree != null)? 3: 2;
          b.i(mTargetId, id, i, tg);
       }
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, p.class, "5")) {
          return;
       }
       e ti = this.i;
       IntimateRelationDialogParams mIntimateTag = ti.mIntimateTag;
       IntimateRelationDialogParams mIntimateTyp = ti.mIntimateType;
       e tg = this.g;
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(mIntimateTag, Integer.valueOf(mIntimateTyp), tg, null, b.class, "39")) {
          i3 oi3 = i3.f();
          oi3.c("relationType", Integer.valueOf(mIntimateTyp));
          if (mIntimateTag != null) {
             oi3.c("lev", Integer.valueOf(mIntimateTag.level));
          }
          h oh = h.k("FRIENDSHIP_PROMOTE_BUTTON");
          oh.n(oi3.e());
          oh.i(tg);
       }
       e ti1 = this.i;
       a.e(this.g, ti1.mTargetId, ti1.mIntimateType, 1);
       this.c(11);
       return;
    }
    public final void z(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "4")) {
          return;
       }
       View view = m1.f(p0, R.id.btn_know);
       View view1 = m1.f(p0, R.id.btn_increase);
       View view2 = m1.f(p0, R.id.btn_increase_v2);
       p0 = m1.f(p0, R.id.btn_post);
       e ti = this.i;
       if (ti.isFromAgree != null || ti.mIntimateTag.level > null) {
          view.setVisibility(8);
          view1.setVisibility(0);
          view1.setOnClickListener(new p$a(this));
          if (Build$VERSION.SDK_INT >= 23) {
             view1.setVisibility(8);
             view2.setVisibility(0);
             p0.setVisibility(0);
             view2.setOnClickListener(new p$b(this));
             p0.setOnClickListener(new p$c(this));
          }
       }else {
          view.setVisibility(0);
          view1.setVisibility(8);
          view.setOnClickListener(new p$d(this));
       }
       return;
    }
}
