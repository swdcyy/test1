package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer$mDurationTextView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer$mCurrentSpeedView$2;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer$mCurrentSpeedUnselectView$2;
import dpc.c;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer$b;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewParent;
import android.view.View;
import java.util.Objects;
import java.lang.Math;
import java.lang.Boolean;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;

public final class TimeLineTagContainer extends LinearLayout	// class@000dd6
{
    public int b;
    public int c;
    public final p d;
    public final p e;
    public final p f;
    public final ValueAnimator g;
    public final ValueAnimator h;
    public HashMap i;

    public void TimeLineTagContainer(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void TimeLineTagContainer(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void TimeLineTagContainer(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = Integer.MAX_VALUE;
       this.c = Integer.MAX_VALUE;
       this.d = s.c(new TimeLineTagContainer$mDurationTextView$2(this));
       this.e = s.c(new TimeLineTagContainer$mCurrentSpeedView$2(this));
       this.f = s.c(new TimeLineTagContainer$mCurrentSpeedUnselectView$2(this));
       float[] uofloatArray = new float[]{0,(float)c.c};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       this.g = valueAnimato;
       ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
       this.h = valueAnimato1;
       a.o(valueAnimato, "translateAnimator");
       long l = (long)300;
       valueAnimato.setDuration(l);
       valueAnimato.addUpdateListener(new TimeLineTagContainer$a(this));
       a.o(valueAnimato1, "alphaAnimator");
       valueAnimato1.setDuration(l);
       valueAnimato1.addListener(new TimeLineTagContainer$b(this));
       valueAnimato1.addUpdateListener(new TimeLineTagContainer$c(this));
    }
    public void TimeLineTagContainer(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, TimeLineTagContainer.class, "8")) {
          return;
       }
       if (!this.getParent() instanceof View) {
          return;
       }
       ViewParent parent = this.getParent();
       Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
       int[] ointArray = new int[2];
       parent.getLocationOnScreen(ointArray);
       this.setTranslationX((float)Math.min(Math.max((c.a - (ointArray[0] + c.b)), 0), this.c));
       return;
    }
    public final void b(boolean p0){
       TextView mDurationTex;
       if (PatchProxy.isSupport(TimeLineTagContainer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TimeLineTagContainer.class, "6")) {
          return;
       }
       String str = "mCurrentSpeedUnselectView";
       int i = 0;
       String str1 = "mCurrentSpeedView";
       if (p0) {
          mDurationTex = this.getMDurationTextView();
          a.o(mDurationTex, "mDurationTextView");
          if (mDurationTex.getVisibility()) {
             mDurationTex = this.getMCurrentSpeedView();
             a.o(mDurationTex, str1);
             if (TextUtils.x(mDurationTex.getText())) {
                mDurationTex = this.getMDurationTextView();
                a.o(mDurationTex, "mDurationTextView");
                if (!mDurationTex.getAlpha()) {
                   this.g.reverse();
                   this.h.reverse();
                }else {
                   mDurationTex = this.getMDurationTextView();
                   a.o(mDurationTex, "mDurationTextView");
                   mDurationTex.setVisibility(i);
                }
                return;
             }
          }
          mDurationTex = this.getMDurationTextView();
          a.o(mDurationTex, "mDurationTextView");
          if (mDurationTex.getVisibility()) {
             mDurationTex = this.getMCurrentSpeedView();
             a.o(mDurationTex, str1);
             if (!TextUtils.x(mDurationTex.getText()) && this.b >= (c.d * 2)) {
                mDurationTex = this.getMCurrentSpeedView();
                a.o(mDurationTex, str1);
                mDurationTex.setVisibility(i);
                mDurationTex = this.getMCurrentSpeedUnselectView();
                a.o(mDurationTex, str);
                mDurationTex.setVisibility(8);
                mDurationTex = this.getMDurationTextView();
                a.o(mDurationTex, "mDurationTextView");
                mDurationTex.setVisibility(i);
                this.g.reverse();
                this.h.reverse();
             }
          }
          mDurationTex = this.getMCurrentSpeedView();
          a.o(mDurationTex, str1);
          TextView mCurrentSpee = this.getMCurrentSpeedView();
          a.o(mCurrentSpee, str1);
          int i1 = (TextUtils.x(mCurrentSpee.getText()) || this.b < (c.d * 2))? 8: 0;
          mDurationTex.setVisibility(i1);
          mDurationTex = this.getMCurrentSpeedUnselectView();
          a.o(mDurationTex, str);
          mDurationTex.setVisibility(8);
          mDurationTex = this.getMDurationTextView();
          a.o(mDurationTex, "mDurationTextView");
          mDurationTex.setVisibility(i);
       }else {
          mDurationTex = this.getMDurationTextView();
          a.o(mDurationTex, "mDurationTextView");
          if (!mDurationTex.getVisibility()) {
             mDurationTex = this.getMCurrentSpeedView();
             a.o(mDurationTex, str1);
             if (TextUtils.x(mDurationTex.getText())) {
                mDurationTex = this.getMDurationTextView();
                a.o(mDurationTex, "mDurationTextView");
                mDurationTex.setVisibility(8);
                mDurationTex = this.getMCurrentSpeedView();
                a.o(mDurationTex, str1);
                mDurationTex.setVisibility(8);
                return;
             }
          }
          mDurationTex = this.getMDurationTextView();
          a.o(mDurationTex, "mDurationTextView");
          if (!mDurationTex.getVisibility()) {
             mDurationTex = this.getMCurrentSpeedView();
             a.o(mDurationTex, str1);
             if (!TextUtils.x(mDurationTex.getText()) && this.b >= (c.d * 2)) {
                mDurationTex = this.getMCurrentSpeedView();
                a.o(mDurationTex, str1);
                mDurationTex.setVisibility(i);
                mDurationTex = this.getMCurrentSpeedUnselectView();
                a.o(mDurationTex, str);
                mDurationTex.setVisibility(8);
                mDurationTex = this.getMDurationTextView();
                a.o(mDurationTex, "mDurationTextView");
                mDurationTex.setVisibility(i);
                this.g.start();
                this.h.start();
             }
          }
          mDurationTex = this.getMCurrentSpeedUnselectView();
          a.o(mDurationTex, str);
          TextView mCurrentSpee1 = this.getMCurrentSpeedView();
          a.o(mCurrentSpee1, str1);
          if (TextUtils.x(mCurrentSpee1.getText()) || this.b < c.d) {
             i = 8;
          }
          mDurationTex.setVisibility(i);
          mDurationTex = this.getMCurrentSpeedView();
          a.o(mDurationTex, str1);
          mDurationTex.setVisibility(8);
          mDurationTex = this.getMDurationTextView();
          a.o(mDurationTex, "mDurationTextView");
          mDurationTex.setVisibility(8);
       }
       return;
    }
    public final TextView getMCurrentSpeedUnselectView(){
       Object obj = PatchProxy.apply(null, this, TimeLineTagContainer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final TextView getMCurrentSpeedView(){
       Object obj = PatchProxy.apply(null, this, TimeLineTagContainer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final TextView getMDurationTextView(){
       Object obj = PatchProxy.apply(null, this, TimeLineTagContainer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
}
