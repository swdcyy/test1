package com.kuaishou.live.audience.component.comments.editor.asr.LiveAsrInputRecordView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.audience.component.comments.editor.asr.LiveAsrInputRecordView$a;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import java.lang.Math;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import com.kuaishou.live.audience.component.comments.editor.asr.LiveAsrInputRecordView$b;
import android.animation.Animator$AnimatorListener;
import ekd.m1;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Runnable;
import e93.f;
import t52.d;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.app.Activity;
import d61.h;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import com.kuaishou.live.audience.component.comments.editor.asr.a;
import erd.o;
import crd.b;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import e3a.a;

public class LiveAsrInputRecordView extends FrameLayout implements d	// class@000a9f
{
    public View b;
    public d c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public AnimatorSet h;
    public AnimatorSet i;
    public Runnable j;
    public static final int k;

    public void LiveAsrInputRecordView(Context p0){
       super(p0, null);
    }
    public void LiveAsrInputRecordView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAsrInputRecordView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = false;
       this.e = false;
       this.g = 1;
       this.j = new LiveAsrInputRecordView$a(this);
       a.c(p0, R.layout.arg_RES_7f0d09e5, this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveAsrInputRecordView.class, "8")) {
          return;
       }
       LiveAsrInputRecordView ti = this.i;
       if (ti != null && ti.isRunning()) {
          return;
       }
       float scaleX = this.b.getScaleX();
       float f = (((float)this.g * 0.40f) / 100.00f) + 0x3f800000;
       float[] uofloatArray = new float[]{scaleX,f};
       float[] uofloatArray1 = new float[]{scaleX,f};
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", uofloatArray),PropertyValuesHolder.ofFloat("scaleY", uofloatArray1)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu);
       f = f - scaleX;
       objectAnimat.setDuration((Math.abs((long)(f * 750.00f)) + 50));
       AnimatorSet uAnimatorSet = new AnimatorSet();
       this.i = uAnimatorSet;
       uAnimatorSet.setInterpolator(new LinearInterpolator());
       this.i.play(objectAnimat);
       this.i.addListener(new LiveAsrInputRecordView$b(this));
       this.i.start();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveAsrInputRecordView.class, "9")) {
          return;
       }
       LiveAsrInputRecordView th = this.h;
       if (th != null) {
          th.cancel();
          this.h = null;
       }
       th = this.i;
       if (th != null) {
          th.cancel();
          this.i = null;
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveAsrInputRecordView.class, "4")) {
          return;
       }
       if (this.f != null) {
          return;
       }
       this.b();
       this.b.setScaleX(0x3f400000);
       this.b.setScaleY(0x3f400000);
       this.b.setVisibility(8);
       this.f = true;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAsrInputRecordView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1902);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveAsrInputRecordView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       LiveAsrInputRecordView tc;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAsrInputRecordView.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean action = p0.getAction();
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                }
             }else {
                return true;
             }
          }else if(this.d == null){
             return true;
          }else {
             f.f(this.j);
             if (this.e == null) {
                tc = this.c;
                if (tc != null) {
                   tc.onStop(true);
                }
                return true;
             }else {
                this.e = false;
                this.c();
                tc = this.c;
                if (tc != null) {
                   tc.onStop(false);
                }
             }
          }
       }else {
          action = PatchProxy.apply(null, this, LiveAsrInputRecordView.class, "5");
          if (action != patchProxyRe) {
             action = action.booleanValue();
          }else if(!QCurrentUser.me().isLogined()){
             y.a(this.getContext(), "live_play", LiveLogTag.LIVE_ASR_INPUT.getName(), 38, this.getContext().getString(R.string.arg_RES_7f103076), null, null, null, null);
          }else {
             String str = "android.permission.RECORD_AUDIO";
             if (!PermissionUtils.a(a.a().a(), str)) {
                a.e(h.d(this), R.string.arg_RES_7f102b42, 0x7f102b41, str).map(a.b).subscribe();
             }else {
                action = true;
             }
          }
          action = false;
          this.d = action;
          if (action) {
             if (LiveSnowManager.f()) {
                f.j("startAsrInputRecord", this.j, 150);
             }else {
                this.d = false;
                LiveSnowManager.h(true, a.a(this));
             }
          }
       }
    label_00ce :
       return true;
    }
    public void setVoiceInputListener(d p0){
       this.c = p0;
    }
}
