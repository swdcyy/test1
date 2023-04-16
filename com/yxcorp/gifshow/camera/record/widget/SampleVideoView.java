package com.yxcorp.gifshow.camera.record.widget.SampleVideoView;
import android.widget.RelativeLayout;
import android.content.Context;
import lnc.a1;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kwai.library.widget.surface.SafeTextureView;
import com.yxcorp.gifshow.image.KwaiImageView;
import pi9.h;
import android.content.res.Resources;
import cw9.c;
import hd9.q;
import com.yxcorp.gifshow.camera.record.widget.SampleVideoView$a;
import java.util.Objects;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.view.GestureDetector;
import com.yxcorp.gifshow.camera.record.widget.h;
import android.view.GestureDetector$OnGestureListener;
import java.lang.Integer;
import java.lang.Math;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import e3a.a;
import com.yxcorp.gifshow.camera.record.widget.SampleVideoView$b;
import android.graphics.Point;

public class SampleVideoView extends RelativeLayout	// class@000fdc
{
    public float b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public SafeTextureView g;
    public KwaiImageView h;
    public GestureDetector i;
    public SampleVideoView$b j;
    public h k;
    public q l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public float r;

    public void SampleVideoView(Context p0){
       super(p0);
       this.d = true;
       this.e = a1.g();
       this.f = a1.h();
       this.o = false;
       this.p = false;
       this.a(p0);
    }
    public void SampleVideoView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = true;
       this.e = a1.g();
       this.f = a1.h();
       this.o = false;
       this.p = false;
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SampleVideoView.class, "1")) {
          return;
       }
       a.d(p0, R.layout.arg_RES_7f0d1335, this, true);
       this.g = this.findViewById(0x7f0a3e7d);
       this.h = this.findViewById(0x7f0a135e);
       this.k = new h(c.b(this.getResources(), 0x7f07034b));
       if (!PatchProxy.applyVoid(null, this, SampleVideoView.class, "2")) {
          this.l = new q(this);
       }
       return;
    }
    public final void b(){
       h a;
       int i2;
       if (PatchProxy.applyVoid(null, this, SampleVideoView.class, "8")) {
          return;
       }
       boolean b = false;
       this.o = b;
       SampleVideoView tk = this.k;
       SampleVideoView$a uoa = new SampleVideoView$a(this);
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoidTwoRefs(this, uoa, tk, h.class, "1")) {
          int i1 = (this.getHeight() - this.getWidth()) / 2;
          tk.d(this, i1);
          Object[] objArray1 = new Object[b];
          a.D().s("FollowShootSnapEdgeHelp", tk.a+":"+i1+":"+this.getX()+":"+this.getY(), objArray1);
          a = tk.a;
          if (a != null) {
             if (a != 1) {
                if (a != 2) {
                   if (a != 3) {
                      Object[] objArray2 = new Object[b];
                      a.D().A("FollowShootSnapEdgeHelp", "position undefined", objArray2);
                      i2 = 0;
                   label_00c0 :
                      if (tk.a > 1) {
                         this.animate().translationX((float)i2).setDuration((long)h.h).setListener(uoa).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                      }else {
                         this.animate().translationY((float)i2).setDuration((long)h.h).setListener(uoa).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                      }
                   }else if(tk.e != null){
                      i1 = tk.d - this.getWidth();
                      a = tk.g;
                   }else {
                      i2 = (tk.d - this.getWidth()) - i1;
                      goto label_00c0 ;
                   }
                }else if(tk.e != null){
                   i1 = tk.g;
                }
             }else if(tk.e != null){
                i1 = tk.c - this.getHeight();
                a = tk.g;
             }else {
                i2 = (tk.c - this.getHeight()) + i1;
                goto label_00c0 ;
             }
             i1 = i1 - a;
          }else if(tk.e != null){
             i1 = tk.g;
          }else {
             i1 = - i1;
          }
          i2 = i1;
          goto label_00c0 ;
       }
       int i = this.k.c();
       if (i) {
          String str = 0x40000000;
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   Object[] objArray = new Object[b];
                   a.D().A("SampleVideoView", "position undefined", objArray);
                }else if(this.d != null){
                   this.n = this.f - this.getWidth();
                   this.m = (int)this.getY();
                }else if(this.q != null){
                   this.n = this.f - this.getWidth();
                   this.m = (int)this.getY();
                }else {
                   this.n = (int)((float)(this.f - this.getWidth()) + (this.r * str));
                   this.m = (int)(this.getY() - this.r);
                }
             }else {
                this.n = (int)this.getX();
                if (this.q == null && this.d == null) {
                   this.m = (int)(this.getY() - this.r);
                }else {
                   this.m = (int)this.getY();
                }
             }
          }else if(this.d != null){
             this.m = (this.q != null)? this.e - this.getHeight(): (int)((float)(this.e - this.getHeight()) - (this.r * str));
             this.n = (int)this.getX();
          }else if(this.q != null){
             this.m = this.e - this.getHeight();
             this.n = (int)this.getX();
          }else {
             this.m = (int)((float)(this.e - this.getHeight()) - (this.r * str));
             this.n = (int)(this.getX() + this.r);
          }
       }else {
          this.m = (int)this.getY();
          this.n = (this.q == null && this.d == null)? (int)(this.getX() + this.r): (int)this.getX();
       }
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SampleVideoView.class, "5")) {
          return;
       }
       this.l.a(p0);
       super.dispatchDraw(p0);
       return;
    }
    public KwaiImageView getImageView(){
       return this.h;
    }
    public SafeTextureView getTextureView(){
       return this.g;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SampleVideoView.class, "3")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoid(objArray, this, SampleVideoView.class, "10")) {
          this.i = new GestureDetector(this.getContext(), new h(this));
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(SampleVideoView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SampleVideoView.class, "4")) {
          return;
       }
       super.onMeasure(p0, p1);
       boolean b = (this.getHeight() > this.getWidth())? true: false;
       this.q = b;
       this.r = (float)(Math.abs((this.getHeight() - this.getWidth())) / 2);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SampleVideoView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.getAction() == 1 && this.o != null) {
          this.b();
          float f = 0;
          this.b = f;
          this.c = f;
       }
       return this.i.onTouchEvent(p0);
    }
    public void onVisibilityChanged(View p0,int p1){
       if (PatchProxy.isSupport(SampleVideoView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, SampleVideoView.class, "7")) {
          return;
       }
       super.onVisibilityChanged(p0, p1);
       Activity uActivity = a.b(this.getContext());
       if (p0 == this && (!p1 && (uActivity != null && this.o != null))) {
          Object[] objArray = new Object[0];
          a.D().s("SampleVideoView", "onVisibilityChanged snapToEdge", objArray);
          this.b();
       }
    label_003d :
       return;
    }
    public void setGestureEnable(boolean p0){
       this.o = p0;
    }
    public void setListener(SampleVideoView$b p0){
       this.j = p0;
    }
    public void setPreviewSize(Point p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SampleVideoView.class, "13")) {
          return;
       }
       Point y = p0.y;
       this.e = y;
       p0 = p0.x;
       this.f = p0;
       SampleVideoView tk = this.k;
       if (tk != null) {
          tk.e(p0, y);
       }
       return;
    }
    public void setSwitchEnable(boolean p0){
       this.p = p0;
    }
}
