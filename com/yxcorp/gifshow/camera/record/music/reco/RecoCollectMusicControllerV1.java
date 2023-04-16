package com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import oc9.d0;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import zb9.j;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kuaishou.android.model.music.Music;
import android.content.Intent;
import com.yxcorp.gifshow.camera.record.base.d;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import sm6.b;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiImageView;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.text.TextPaint;
import com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1$d;
import android.view.View$OnClickListener;
import android.view.ViewPropertyAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import java.lang.Runnable;
import ekd.k1;
import ag9.g;
import com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1$b;
import android.animation.Animator$AnimatorListener;
import android.view.ViewParent;
import java.util.Objects;
import ad9.a;
import com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1$onCreate$1;
import ag9.e;
import msd.l;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1$c;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public final class RecoCollectMusicControllerV1 extends BaseRecoCollectMusicController	// class@000e9a
{
    public View y;
    public final RecoCollectMusicControllerV1$a z;

    public void RecoCollectMusicControllerV1(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.z = new RecoCollectMusicControllerV1$a(this);
    }
    public void d5(int p0){
       RecoCollectMusicControllerV1 recoCollectM = RecoCollectMusicControllerV1.class;
       if (PatchProxy.isSupport(recoCollectM) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, recoCollectM, "9")) {
          return;
       }
       super.d5(p0);
       if (p0 == 5 && this.y != null) {
          Object[] objArray = new Object[0];
          a.D().w("RecoCollectMusicController", "setRecordMode : "+p0, objArray);
          this.u2();
       }
       return;
    }
    public String h2(){
       return "COLLECT_MUSIC_AUTO_USE_GUIDE_BUBBLE";
    }
    public void l2(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoCollectMusicControllerV1.class, "11")) {
          return;
       }
       a.p(p0, "assistantChangeEvent");
       super.l2(p0);
       this.t2();
       return;
    }
    public void m2(PanelShowEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoCollectMusicControllerV1.class, "10")) {
          return;
       }
       a.p(p0, "panelShowEvent");
       super.m2(p0);
       this.t2();
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, RecoCollectMusicControllerV1.class, "12")) {
          return;
       }
       this.u2();
       return;
    }
    public void r2(Music p0,Intent p1){
       RecoCollectMusicControllerV1 recoCollectM = RecoCollectMusicControllerV1.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, recoCollectM, "3")) {
          return;
       }
       a.p(p0, "music");
       a.p(p1, "intent");
       if (this.y == null) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, recoCollectM, "2")) {
             this.y = LayoutInflater.from(this.e).inflate(0x7f0d12bc, objArray);
             FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
             layoutParams.gravity = 81;
             layoutParams.bottomMargin = b.q(this.e) + a1.d(0x7f0702a7);
             this.e.findViewById(R.id.preview_layout_content).addView(this.y, layoutParams);
          }
       }
       recoCollectM = this.y;
       a.m(recoCollectM);
       TextView textView = recoCollectM.findViewById(R.id.reco_collect_music_download_operation);
       textView.setText(a1.p(R.string.arg_RES_7f10410c));
       int i = 0;
       textView.setVisibility(i);
       recoCollectM = this.y;
       a.m(recoCollectM);
       KwaiImageView kwaiImageVie = recoCollectM.findViewById(R.id.reco_collect_music_download_icon);
       Music mImageUrls = (!j.h(p0.mImageUrls))? p0.mImageUrls: e0.h(p0.mImageUrl);
       kwaiImageVie.U(mImageUrls);
       recoCollectM = this.y;
       a.m(recoCollectM);
       textView = recoCollectM.findViewById(R.id.reco_collect_music_download_operation_btn);
       textView.setText(a1.p(R.string.arg_RES_7f1004bf));
       TextPaint paint = textView.getPaint();
       a.o(paint, "paint");
       paint.setFakeBoldText(true);
       textView.setOnClickListener(new RecoCollectMusicControllerV1$d(this, p0));
       recoCollectM = this.y;
       a.m(recoCollectM);
       recoCollectM.setVisibility(i);
       recoCollectM = this.y;
       a.m(recoCollectM);
       recoCollectM.setAlpha(0);
       recoCollectM = this.y;
       a.m(recoCollectM);
       recoCollectM.animate().alpha(0x3f800000).setDuration(300).setInterpolator(new e()).start();
       k1.r(this.z, 5000);
       this.o2(p0);
       this.g2(p1, p0);
       if (this.k2() == 1) {
          g.a.a();
       }
       this.p2(p0);
       return;
    }
    public final void t2(){
       if (PatchProxy.applyVoid(null, this, RecoCollectMusicControllerV1.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RecoCollectMusicController", "hideBubbleWithAnim", objArray);
       k1.m(this.z);
       RecoCollectMusicControllerV1 ty = this.y;
       if (ty != null) {
          ty.animate().cancel();
          ty.animate().alpha(0).setDuration(300).setInterpolator(new e()).setListener(new RecoCollectMusicControllerV1$b(this));
       }
       return;
    }
    public final void u2(){
       if (PatchProxy.applyVoid(null, this, RecoCollectMusicControllerV1.class, "5")) {
          return;
       }
       k1.m(this.z);
       RecoCollectMusicControllerV1 ty = this.y;
       if (ty != null) {
          Object[] objArray = new Object[0];
          a.D().w("RecoCollectMusicController", "removeBubbleView", objArray);
          ty.animate().setListener(null).cancel();
          ViewParent parent = ty.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          parent.removeView(ty);
          this.y = null;
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoCollectMusicControllerV1.class, "1")) {
          return;
       }
       super.w1(p0);
       this.Y1(this.d.l(a.class, new e(new RecoCollectMusicControllerV1$onCreate$1(this))));
       BaseRecoCollectMusicController uBaseRecoCol = PatchProxy.apply(null, this, BaseRecoCollectMusicController.class, "1");
       if (uBaseRecoCol != PatchProxyResult.class) {
       }else {
          uBaseRecoCol = this.o;
          if (uBaseRecoCol == null) {
             a.S("recordBubbleManager");
          }
       }
       uBaseRecoCol.m(new RecoCollectMusicControllerV1$c(this));
       return;
    }
}
