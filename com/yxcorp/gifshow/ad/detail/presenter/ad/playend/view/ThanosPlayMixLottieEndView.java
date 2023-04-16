package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.AdPlayEndBaseView;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import w4.r;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView$b;
import w4.b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView$initView$2;
import msd.l;
import lnc.y0;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView$initView$3;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView$initView$4;
import f09.i;
import android.animation.Animator$AnimatorListener;
import java.lang.Integer;
import wkd.b;
import u49.c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.MixLottieCardData;
import brd.t;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView$c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView$d;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.lifecycle.Lifecycle;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.util.HashMap;
import java.lang.StringBuilder;

public final class ThanosPlayMixLottieEndView extends AdPlayEndBaseView	// class@0015fb
{
    public LottieAnimationView g;
    public View h;
    public View i;
    public r j;
    public QPhoto k;
    public MixLottieCardData l;
    public HashMap m;
    public static final ThanosPlayMixLottieEndView$a n;

    static {
       ThanosPlayMixLottieEndView.n = new ThanosPlayMixLottieEndView$a(null);
    }
    public void ThanosPlayMixLottieEndView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void ThanosPlayMixLottieEndView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void ThanosPlayMixLottieEndView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public static final void g(ThanosPlayMixLottieEndView p0,int p1){
       super.d(p1);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ThanosPlayMixLottieEndView.class, "2")) {
          return;
       }
       LayoutInflater.from(this.b).inflate(R.layout.arg_RES_7f0d0092, this);
       View view = this.findViewById(R.id.mix_lottie_anim_view);
       a.o(view, "findViewById\(R.id.mix_lottie_anim_view\)");
       this.g = view;
       view = this.findViewById(R.id.mix_lottie_touch_content);
       a.o(view, "findViewById\(R.id.mix_lottie_touch_content\)");
       this.h = view;
       view = this.findViewById(R.id.replay_ad_video);
       a.o(view, "findViewById\(R.id.replay_ad_video\)");
       this.i = view;
       ThanosPlayMixLottieEndView tg = this.g;
       String str = "mLottieAnimationView";
       if (tg == null) {
          a.S(str);
       }
       this.j = new r(tg);
       ThanosPlayMixLottieEndView tg1 = this.g;
       if (tg1 == null) {
          a.S(str);
       }
       tg1.setImageAssetsFolder("lottie/images/mix_play_end");
       tg1.setAnimation("ad_play_end_mix_lottie_anim.json");
       tg = this.j;
       if (tg == null) {
          a.S("mTextDelegate");
       }
       tg1.setTextDelegate(tg);
       tg1.setFontAssetDelegate(new ThanosPlayMixLottieEndView$b(tg1));
       y0.a(this, new ThanosPlayMixLottieEndView$initView$2(this));
       tg1 = this.h;
       if (tg1 == null) {
          a.S("mTouchContentView");
       }
       y0.a(tg1, new ThanosPlayMixLottieEndView$initView$3(this));
       tg1 = this.i;
       if (tg1 == null) {
          a.S("mPlayEndReplayBtn");
       }
       y0.a(tg1, new ThanosPlayMixLottieEndView$initView$4(this));
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ThanosPlayMixLottieEndView.class, "5")) {
          return;
       }
       super.b();
       if (!PatchProxy.applyVoid(objArray, this, ThanosPlayMixLottieEndView.class, "7")) {
          ThanosPlayMixLottieEndView ti = this.i;
          if (ti == null) {
             a.S("mPlayEndReplayBtn");
          }
          int i = 8;
          ti.setVisibility(i);
          ti = this.h;
          if (ti == null) {
             a.S("mTouchContentView");
          }
          ti.setVisibility(i);
          ti = this.g;
          if (ti == null) {
             a.S("mLottieAnimationView");
          }
          ti.C(28, 57);
          ti.s();
       }
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ThanosPlayMixLottieEndView.class, "4")) {
          return;
       }
       super.c();
       if (!PatchProxy.applyVoid(objArray, this, ThanosPlayMixLottieEndView.class, "6")) {
          ThanosPlayMixLottieEndView tg = this.g;
          if (tg == null) {
             a.S("mLottieAnimationView");
          }
          tg.C(0, 28);
          tg.a(new i(tg, this));
          tg.s();
       }
       return;
    }
    public void d(int p0){
       if (PatchProxy.isSupport(ThanosPlayMixLottieEndView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ThanosPlayMixLottieEndView.class, "10")) {
          return;
       }
       if (this.getReceiveStatus() == 1) {
          c uoc = b.a(0x3a268c29);
          ThanosPlayMixLottieEndView tl = this.l;
          MixLottieCardData requestData = (tl != null)? tl.requestData: null;
          uoc.b(requestData).map(new e()).subscribe(new ThanosPlayMixLottieEndView$c(this, p0), new ThanosPlayMixLottieEndView$d(this, p0));
       }else {
          super.d(p0);
       }
       return;
    }
    public void f(QPhoto p0,Lifecycle p1){
       ThanosPlayMixLottieEndView tl;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ThanosPlayMixLottieEndView.class, "8")) {
          return;
       }
       this.k = p0;
       MixLottieCardData mixLottieCar = null;
       if (this.getReceiveStatus() == 2) {
          tl = this.l;
          if (tl != null) {
             mixLottieCar = tl.afterReceiveActionbar;
          }
       }else {
          tl = this.l;
          if (tl != null) {
             mixLottieCar = tl.actionBar;
          }
       }
       tl = this.j;
       if (tl == null) {
          a.S("mTextDelegate");
       }
       tl.a("actionBar", y0.q(mixLottieCar, 4));
       return;
    }
    public final LottieAnimationView getMLottieAnimationView(){
       ThanosPlayMixLottieEndView obj = PatchProxy.apply(null, this, ThanosPlayMixLottieEndView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj == null) {
          a.S("mLottieAnimationView");
       }
       return obj;
    }
    public final int getReceiveStatus(){
       Object[] objArray1;
       Object[] objArray = null;
       PhotoAdvertisement obj = PatchProxy.apply(objArray, this, ThanosPlayMixLottieEndView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = k.B(this.k);
       if (obj != null) {
          obj = obj.mTKStatusDataMap;
          if (obj != null) {
             objArray1 = obj.get("receiveStatus");
          label_0028 :
             if (objArray1 instanceof Integer) {
                objArray = objArray1;
             }
             int i = 0;
             int i1 = (objArray != null)? objArray.intValue(): 0;
             if (i1 > 0) {
                return i1;
             }else {
                ThanosPlayMixLottieEndView tl = this.l;
                if (tl != null) {
                   MixLottieCardData receiveStatu = tl.receiveStatus;
                   if (receiveStatu != null) {
                      i = receiveStatu.intValue();
                   }
                }
                return i;
             }
          }
       }
       objArray1 = objArray;
       goto label_0028 ;
    }
    public final void setTextData(MixLottieCardData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosPlayMixLottieEndView.class, "3")) {
          return;
       }
       a.p(p0, "data");
       ThanosPlayMixLottieEndView tj = this.j;
       if (tj == null) {
          a.S("mTextDelegate");
       }
       this.l = p0;
       MixLottieCardData title = p0.title;
       if (title == null) {
          title = "";
       }
       tj.a("title", title);
       tj.a("price", 0xffe5+p0.price);
       tj.a("name", y0.q(p0.name, 7));
       tj.a("desc", y0.q(p0.desc, 9));
       tj.a("date", y0.q(p0.date, 14));
       return;
    }
}
