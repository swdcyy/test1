package com.yxcorp.gifshow.detail.view.SlidePlayMusicAnimLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import com.yxcorp.gifshow.detail.view.SlidePlayMusicAnimLayout$MusicAnimIcon;
import android.util.SparseArray;
import android.util.AttributeSet;
import android.graphics.PointF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.n;
import android.view.View;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.detail.view.SlidePlayMusicAnimLayout$b;
import android.animation.TypeEvaluator;
import com.yxcorp.gifshow.detail.view.SlidePlayMusicAnimLayout$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import com.yxcorp.gifshow.detail.view.SlidePlayMusicAnimLayout$a;
import android.animation.Animator$AnimatorListener;
import n9a.z;
import java.lang.Runnable;
import java.util.LinkedList;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.Integer;

public class SlidePlayMusicAnimLayout extends RelativeLayout	// class@001a67
{
    public int b;
    public int c;
    public PointF d;
    public PointF e;
    public PointF f;
    public PointF g;
    public PointF h;
    public PointF i;
    public PointF j;
    public SlidePlayMusicAnimLayout$MusicAnimIcon k;
    public boolean l;
    public Runnable m;
    public SparseArray n;
    public static final int o;

    public void SlidePlayMusicAnimLayout(Context p0){
       super(p0);
       this.k = SlidePlayMusicAnimLayout$MusicAnimIcon.BIG;
       this.n = new SparseArray();
    }
    public void SlidePlayMusicAnimLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.k = SlidePlayMusicAnimLayout$MusicAnimIcon.BIG;
       this.n = new SparseArray();
    }
    public void SlidePlayMusicAnimLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = SlidePlayMusicAnimLayout$MusicAnimIcon.BIG;
       this.n = new SparseArray();
    }
    public final PointF a(boolean p0){
       SlidePlayMusicAnimLayout tg;
       if (PatchProxy.isSupport(SlidePlayMusicAnimLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, SlidePlayMusicAnimLayout.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float f = 15.00f;
       SlidePlayMusicAnimLayout slidePlayMus = 0x40a00000;
       float f1 = 0;
       if (p0) {
          if (this.k == SlidePlayMusicAnimLayout$MusicAnimIcon.BIG) {
             if (this.g == null) {
                this.g = new PointF(f1, (float)(this.c - n.c(this.getContext(), f)));
             }
             tg = this.g;
          }else if(this.h == null){
             this.h = new PointF(f1, (float)(this.c - n.c(this.getContext(), slidePlayMus)));
          }
          tg = this.h;
       }else if(this.k == SlidePlayMusicAnimLayout$MusicAnimIcon.BIG){
          if (this.i == null) {
             this.i = new PointF(f1, (float)(this.c - n.c(this.getContext(), 55.00f)));
          }
          tg = this.i;
       }else if(this.j == null){
          this.j = new PointF((float)n.c(this.getContext(), slidePlayMus), (float)n.c(this.getContext(), f));
       }
       tg = this.j;
       return tg;
    }
    public final void b(){
       ValueAnimator valueAnimato;
       if (PatchProxy.applyVoid(null, this, SlidePlayMusicAnimLayout.class, "4")) {
          return;
       }
       if (this.l != null) {
          View iconView = this.getIconView();
          PointF endPoint = this.getEndPoint();
          SlidePlayMusicAnimLayout td = this.d;
          PointF pointF = this.a(true);
          PointF pointF1 = this.a(false);
          if (PatchProxy.isSupport(SlidePlayMusicAnimLayout.class)) {
             Object[] objArray = new Object[]{td,endPoint,pointF,pointF1,iconView};
             valueAnimato = PatchProxy.apply(objArray, this, SlidePlayMusicAnimLayout.class, "11");
             if (valueAnimato != PatchProxyResult.class) {
             label_0074 :
                AnimatorSet uAnimatorSet = new AnimatorSet();
                uAnimatorSet.setTarget(iconView);
                uAnimatorSet.play(valueAnimato);
                uAnimatorSet.addListener(new SlidePlayMusicAnimLayout$a(this, iconView));
                uAnimatorSet.setDuration(this.getAnimDuration());
                uAnimatorSet.start();
                iconView.setTag(uAnimatorSet);
                SlidePlayMusicAnimLayout$MusicAnimIcon bIG = SlidePlayMusicAnimLayout$MusicAnimIcon.BIG;
                if (this.k == bIG) {
                   bIG = SlidePlayMusicAnimLayout$MusicAnimIcon.SMALL;
                }
                this.k = bIG;
                z oz = new z(this);
                this.m = oz;
                this.postDelayed(oz, 1300);
             }
          }
          Object[] objArray1 = new Object[]{td,endPoint};
          valueAnimato = ValueAnimator.ofObject(new SlidePlayMusicAnimLayout$b(pointF, pointF1), objArray1);
          valueAnimato.addUpdateListener(new SlidePlayMusicAnimLayout$c(this, iconView));
          valueAnimato.setTarget(iconView);
          valueAnimato.setInterpolator(new LinearInterpolator());
          valueAnimato.setDuration(this.getAnimDuration());
          goto label_0074 ;
       }
       return;
    }
    public final long getAnimDuration(){
       return this.k.mAnimDuration;
    }
    public final PointF getEndPoint(){
       SlidePlayMusicAnimLayout obj = PatchProxy.apply(null, this, SlidePlayMusicAnimLayout.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.k == SlidePlayMusicAnimLayout$MusicAnimIcon.BIG) {
          if (this.e == null) {
             this.e = new PointF((float)((this.b / 2) - n.c(this.getContext(), 17.00f)), 0);
          }
          obj = this.e;
       }else if(this.f == null){
          this.f = new PointF((float)n.c(this.getContext(), 10.00f), (float)n.c(this.getContext(), 8.00f));
       }
       obj = this.f;
       return obj;
    }
    public final View getIconView(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LinkedList obj = PatchProxy.apply(objArray, this, SlidePlayMusicAnimLayout.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.n.get(this.k.mBackgroundResId);
       View view = (obj != null)? obj.pollFirst(): objArray;
       if (view == null) {
          view = PatchProxy.apply(objArray, this, SlidePlayMusicAnimLayout.class, "6");
          if (view != patchProxyRe) {
          }else {
             View view1 = new View(this.getContext());
             RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(this.k.mSize, this.k.mSize);
             layoutParams.addRule(12, -1);
             layoutParams.addRule(14, -1);
             view1.setTag(R.id.viewtag, this.k);
             view1.setBackgroundResource(this.k.mBackgroundResId);
             this.addView(view1, layoutParams);
             view = view1;
          }
       }
       return view;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 2;
       if (PatchProxy.isSupport(SlidePlayMusicAnimLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SlidePlayMusicAnimLayout.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       p3 = p3 - p1;
       p4 = p4 - p2;
       if (p3 && (p4 && (this.b != p3 || (this.c != p4 && p0)))) {
          if (!PatchProxy.applyVoid(null, this, SlidePlayMusicAnimLayout.class, "8")) {
             float f = 10.00f;
             this.d = (this.k == SlidePlayMusicAnimLayout$MusicAnimIcon.BIG)? new PointF((float)((this.b / i) + n.c(this.getContext(), 27.00f)), (float)(this.getHeight() - n.c(this.getContext(), f))): new PointF((float)((this.b / i) + n.c(this.getContext(), 0x41f00000)), (float)(this.getHeight() - n.c(this.getContext(), f)));
          }
       label_00a9 :
          this.b();
       }
    label_00ac :
       this.b = p3;
       this.c = p4;
       return;
    }
}
