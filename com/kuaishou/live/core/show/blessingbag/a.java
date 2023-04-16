package com.kuaishou.live.core.show.blessingbag.a;
import k51.c;
import p32.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget;
import lf3.g;
import hf3.a;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.i;
import p32.b;
import z1.a;
import p32.a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.blessingbag.a$a;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer$a;
import ks5.m;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import java.util.Objects;
import android.animation.Animator;
import android.animation.AnimatorSet;
import ekd.k1;
import com.kuaishou.live.core.basic.model.LiveAudienceBlessBagConfig;
import p32.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import p32.i;
import android.view.View;
import lnc.a1;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import p32.j;
import android.animation.Animator$AnimatorListener;
import p32.h;
import java.lang.Runnable;
import p91.m;
import v51.a;
import lp3.c;
import ks5.i;

public abstract class a extends c	// class@000a06
{
    public final g p;
    public m q;
    public i r;
    public a s;
    public LiveTopPendantTempPlayService t;
    public i u;
    public m v;
    public LiveBlessingBagContainer w;
    public static String sLivePresenterClassName = "LiveBlessingBagBasePresenter";

    public void a(){
       super();
       this.p = new c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.s.u0(1015, LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget.class, this.p);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.s.o(1015, this.p);
       this.V8();
       return;
    }
    public LiveBlessingBagContainer P8(LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget p0){
       LiveBlessingBagContainer obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.w == null) {
          obj = new LiveBlessingBagContainer(this.getContext());
          this.w = obj;
          obj.setLiveServiceManager(this.r);
          this.w.setLiveTopPendantEnterAnimationService(new b(this));
          this.w.setOnClickListener(new a(this, p0));
          this.w.setLiveBlessingBagContainerCallback(new a$a(this));
       }
       return this.w;
    }
    public abstract void R8(LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget p0);
    public abstract void S8(LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget p0);
    public void V8(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       a tv = this.v;
       if (tv != null) {
          this.t.c(tv);
          this.v = null;
       }
       tv = this.w;
       if (tv != null) {
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoid(null, tv, LiveBlessingBagContainer.class, "10")) {
             if (tv.a(tv.f)) {
                tv.f.cancel();
             }
             tv.f = null;
             tv.b();
             k1.n("LiveBlessingBagContainer");
          }
          this.w = null;
       }
       return;
    }
    public void W8(String p0){
    }
    public void X8(LiveAudienceBlessBagConfig p0,LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget p1){
       float f1;
       a uoa = a.class;
       String str = "6";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, str)) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p1, this, uoa, "4") && this.v == null) {
          d uod = new d(this, p1);
          this.v = uod;
          this.t.b(uod);
       }
       LiveBlessingBagContainer liveBlessing = this.P8(p1);
       Objects.requireNonNull(liveBlessing);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, liveBlessing, LiveBlessingBagContainer.class, "1") && p1 != null) {
          if (!TextUtils.n(liveBlessing.m, p1.campaignId)) {
             liveBlessing.d.U(e0.i(p1.bagUrl));
          }
          boolean b = true;
          boolean b1 = (p0 == null)? true: false;
          liveBlessing.l = b1;
          if (liveBlessing.a(liveBlessing.f)) {
             b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag("LiveBlessingBagContainer"), "updateBlessingBag, isAnimatorRunning");
          }else if(liveBlessing.p == null){
             LiveLogTag lIVE_BLESSIN = LiveLogTag.LIVE_BLESSING_BAG;
             lIVE_BLESSIN.appendTag("LiveBlessingBagContainer");
             b.P(lIVE_BLESSIN, "updateBlessingBag, playFirstAddAnimator");
             liveBlessing.g = new i(liveBlessing, p0, p1);
             liveBlessing.p = b;
             if (!PatchProxy.applyVoid(null, liveBlessing, LiveBlessingBagContainer.class, str)) {
                liveBlessing.c.setVisibility(4);
                int i = a1.e(14.00f);
                liveBlessing.c.setScaleX(2.00f);
                liveBlessing.c.setScaleY(2.00f);
                float f = (float)a1.e(88.00f);
                liveBlessing.c.setTranslationY(f);
                float[] uofloatArray = new float[]{(float)i,f1};
                f1 = (float)(- i);
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(liveBlessing.c, View.TRANSLATION_X, uofloatArray);
                objectAnimat.setDuration(200);
                float[] uofloatArray1 = new float[]{f,0};
                float[] uofloatArray2 = new float[]{f1,0};
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x40000000,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x40000000,0x3f800000}),PropertyValuesHolder.ofFloat(FrameLayout.TRANSLATION_Y, uofloatArray1),PropertyValuesHolder.ofFloat(FrameLayout.TRANSLATION_X, uofloatArray2)};
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(liveBlessing.c, propertyValu);
                objectAnimat1.setDuration(400);
                objectAnimat1.setStartDelay(1380);
                AnimatorSet uAnimatorSet = new AnimatorSet();
                liveBlessing.f = uAnimatorSet;
                Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
                uAnimatorSet.playSequentially(uAnimatorArr);
                liveBlessing.f.addListener(new j(liveBlessing));
                if (liveBlessing.h != null) {
                   lIVE_BLESSIN.appendTag("LiveBlessingBagContainer");
                   b.P(lIVE_BLESSIN, "accept mFirstAddAnimator");
                   k1.s(new h(liveBlessing), "LiveBlessingBagContainer", 500);
                }else {
                   lIVE_BLESSIN.appendTag("LiveBlessingBagContainer");
                   b.P(lIVE_BLESSIN, "start mFirstAddAnimator");
                   liveBlessing.f.start();
                }
             }
          }else {
             b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag("LiveBlessingBagContainer"), "updateBlessingBag, updateBlessingBagView");
             liveBlessing.d(p0, p1);
          }
       }
    label_0167 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.t = this.q8(LiveTopPendantTempPlayService.class);
       this.r = this.r8("LIVE_SERVICE_MANAGER");
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.r.a(a.class).u();
       this.u = this.r.a(i.class);
       return;
    }
}
