package com.yxcorp.gifshow.album.widget.preview.c;
import u79.o;
import r79.d;
import j79.m0;
import androidx.lifecycle.ViewModel;
import java.lang.Object;
import java.lang.String;
import r79.c;
import java.io.File;
import ekd.b0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import com.yxcorp.gifshow.album.imageloader.CompatZoomImageView;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.view.View;
import android.widget.ImageView;
import android.net.Uri;
import ic7.d;
import g79.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Math;
import c79.c$a;
import c79.c;
import com.yxcorp.gifshow.album.widget.preview.c$f;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import c79.e;
import c79.d;
import c79.a;
import com.yxcorp.gifshow.album.widget.preview.c$g;
import android.view.GestureDetector$OnDoubleTapListener;
import java.lang.Boolean;
import java.lang.Long;
import android.view.ViewGroup;
import android.animation.AnimatorSet;
import o79.d;
import android.animation.ObjectAnimator;
import p79.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import q79.d;
import ga9.b;
import java.lang.RuntimeException;
import java.lang.Throwable;
import ic7.b;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import com.yxcorp.gifshow.album.widget.preview.b;
import erd.o;
import crd.b;
import com.yxcorp.gifshow.album.widget.preview.KSAPassThroughEventView;
import j79.l0;
import a2.f;
import com.yxcorp.gifshow.album.widget.preview.c$c;
import android.view.GestureDetector$OnGestureListener;
import u79.d;
import android.view.View$OnTouchListener;
import u79.c;
import android.view.View$OnClickListener;
import java.lang.Float;
import u79.n;
import u79.g;
import u79.h;
import java.util.concurrent.Callable;
import brd.t;
import w69.p0;
import brd.z;
import u79.f;
import erd.g;
import w69.n0;
import com.yxcorp.gifshow.album.widget.preview.c$d;
import com.yxcorp.gifshow.album.widget.preview.c$e;
import com.yxcorp.gifshow.album.widget.preview.c$b;
import io.reactivex.g;
import com.yxcorp.gifshow.album.widget.preview.c$a;
import t45.d;
import com.yxcorp.gifshow.album.widget.preview.c$h;
import com.yxcorp.gifshow.album.widget.preview.c$i;

public class c implements o	// class@001b35
{
    public int b;
    public final String c;
    public boolean d;
    public View e;
    public AbsPreviewItemViewBinder f;
    public boolean g;
    public b0 h;
    public m0 i;
    public ViewModel j;
    public d k;
    public boolean l;
    public d m;
    public b n;
    public b o;
    public ObjectAnimator p;
    public ObjectAnimator q;
    public AnimatorSet r;
    public String s;
    public boolean t;
    public float u;
    public static int v;

    public void c(int p0,d p1,m0 p2,ViewModel p3){
       super();
       this.g = false;
       this.l = false;
       this.t = false;
       this.u = 0;
       this.b = p0;
       this.m = p1;
       this.c = p1.getPath();
       this.i = p2;
       this.j = p3;
    }
    public void A(File p0,b0 p1){
       a c;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "13")) {
          return;
       }
       if (this.e == null || (this.f.u() != null && this.f.w() != null)) {
          Log.g("ImagePreviewItem", "previewWithKwaiZoomView, index = "+this.b+", source = "+this.c);
          this.f.u().setVisibility(8);
          this.f.w().setVisibility(0);
          boolean b = true;
          this.f.w().setAutoSetMinScale(b);
          Uri uri = d.a(p0);
          if (uri == null) {
             return;
          }else {
             c = a.c;
             float f = Math.min(((float)n.y(c.b()) / (float)p1.a), ((float)n.u(c.b()) / (float)p1.b)) * 3.00f;
             c$a uoa = new c$a();
             uoa.d(b);
             uoa.j((int)((float)p1.a * f));
             uoa.e((int)((float)p1.b * f));
             c uoc = uoa.a();
             a.c(this.f.w(), uri, uoc, null, new c$f(this));
             this.f.w().setOnDoubleTapListener(new c$g(this));
          }
       }
       return;
    }
    public final void B(boolean p0,long p1,boolean p2,boolean p3){
       int i3;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Long.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, c.class, "8")) {
          return;
       }
       ViewGroup viewGroup = this.f.q();
       if (viewGroup == null) {
          Log.g("ImagePreviewItem", "setPreviewBubbleVisible, not show because bubbleContainer is null..");
          return;
       }else {
          c tr = this.r;
          if (tr != null) {
             tr.cancel();
             ObjectAnimator objectAnimat = null;
             this.p = objectAnimat;
             this.q = objectAnimat;
          }
          if (p0 && this.d != null) {
             d.o(this.s);
             Log.g("ImagePreviewItem", "logPreviewBubbleShow, index="+this.b+", type="+this.s);
          }
          this.r = new AnimatorSet();
          int i = (p0)? 0: 4;
          Log.g("ImagePreviewItem", "setPreviewBubbleVisible, index="+this.b+", requestShow="+p0);
          this.p = c.c(viewGroup, i, p1);
          if (p2) {
             Log.g("ImagePreviewItem", "translate anim, index="+this.b+", requestShow="+p0);
             FrameLayout$LayoutParams bottomMargin = viewGroup.getLayoutParams().bottomMargin;
             int i1 = a1.d(R.dimen.arg_RES_7f0704b3);
             int i2 = a1.d(R.dimen.arg_RES_7f0704f2);
             Log.g("ImagePreviewItem", "index="+this.b+", selectContainerH="+i2+", bubbleMarginBottom="+bottomMargin+", additionBottomMargin="+i1);
             if ((bottomMargin - i2) < i1) {
                if (p0 || p3) {
                   i3 = - ((i2 + i1) - bottomMargin);
                   i1 = 0;
                }else {
                   i1 = - ((i2 + i1) - bottomMargin);
                   i3 = 0;
                }
                Log.g("ImagePreviewItem", "index="+this.b+", requestShow="+p0+", from="+i3+", to="+i1);
                this.q = c.d(viewGroup, (float)i3, (float)i1, 300);
             }
          }
          c tq = this.q;
          if (tq != null) {
             Animator[] uAnimatorArr = new Animator[]{this.p,tq};
             this.r.playTogether(uAnimatorArr);
          }else {
             this.r.play(this.p);
          }
          this.r.start();
          return;
       }
    }
    public int C(int p0){
       ViewGroup obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.f.q();
       if (obj == null) {
          Log.g("ImagePreviewItem", "setPreviewBubbleVisible, not show because bubbleContainer is null..");
          return -1;
       }else {
          int visibility = obj.getVisibility();
          if (visibility != p0) {
             obj.setVisibility(p0);
             if (!p0 && this.d != null) {
                d.o(this.s);
                Log.g("ImagePreviewItem", "logPreviewBubbleShow, index="+this.b+", type="+this.s);
             }
          }
          return visibility;
       }
    }
    public void D(b0 p0){
       this.h = p0;
    }
    public AbsPreviewItemViewBinder O1(){
       return this.f;
    }
    public void a(int p0){
       this.b = p0;
    }
    public void b(d p0){
       this.k = p0;
    }
    public void c(){
    }
    public void d(View p0){
       boolean b;
       int i;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "1")) {
          return;
       }
       Log.g("ImagePreviewItem", "bind image item called, index = "+this.b);
       this.f.e(p0);
       this.e = p0;
       File uFile = new File(this.c);
       if (!uFile.exists()) {
          b.a(new RuntimeException("image preview item bind view failed, file not exist"));
          return;
       }else {
          b = false;
          this.g = b;
          if (!c.v) {
             Object[] objArray = null;
             EGL10 obj = PatchProxy.apply(objArray, objArray, uoc, "18");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else {
                obj = EGLContext.getEGL();
                EGLDisplay uEGLDisplay = obj.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                int[] ointArray = new int[2];
                obj.eglInitialize(uEGLDisplay, ointArray);
                int[] ointArray1 = new int[1];
                obj.eglGetConfigs(uEGLDisplay, objArray, b, ointArray1);
                EGLConfig[] uEGLConfigAr = new EGLConfig[ointArray1[b]];
                obj.eglGetConfigs(uEGLDisplay, uEGLConfigAr, ointArray1[b], ointArray1);
                ointArray = new int[1];
                int i1 = 0;
                int i2 = 0;
                while (i1 < ointArray1[b]) {
                   obj.eglGetConfigAttrib(uEGLDisplay, uEGLConfigAr[i1], 0x302c, ointArray);
                   if (i2 < ointArray[b]) {
                      i2 = ointArray[b];
                   }
                   i1 = i1 + 1;
                }
                obj.eglTerminate(uEGLDisplay);
                i = Math.max(i2, 4096);
             }
             c.v = i;
             Log.g("ImagePreviewItem", "bind: sMaxTitleSize="+c.v);
          }
          this.f.u().setMaxTileSize(c.v);
          this.m();
          this.x(new b(this, uFile));
          if (this.f.k() != null) {
             this.f.k().setUndersideView(this.f.u());
          }
          c tj = this.j;
          if (tj != null && (tj instanceof l0 && tj.J0())) {
             this.f.k().setOnTouchListener(new d(new f(this.f.k().getContext(), new c$c(this))));
          }else {
             this.f.u().setOnClickListener(new c(this));
          }
          return;
       }
    }
    public void e(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "20")) {
          return;
       }
       uoc = this.f;
       if (uoc == null) {
          return;
       }
       ViewGroup viewGroup = uoc.q();
       if (viewGroup == null) {
          Log.g("ImagePreviewItem", "changePreviewBubbleAlpha, not show because bubbleContainer is null..");
          return;
       }else if(!viewGroup.getVisibility()){
          viewGroup.setAlpha(p0);
          Log.g("ImagePreviewItem", "changePreviewBubbleAlpha, alpha="+p0);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       this.t = true;
       Log.g("ImagePreviewItem", "notifyPreviewBubblePaddingShow, index="+this.b);
       return;
    }
    public void g(boolean p0){
       boolean b1;
       boolean b2;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "6")) {
          return;
       }
       Log.g("ImagePreviewItem", "decideBubbleVisibleIfNeed, index="+this.b);
       if (this.f == null) {
          Log.g("ImagePreviewItem", "decideBubbleVisibleIfNeed, iewBinder == null, index="+this.b);
          return;
       }else {
          c tj = this.j;
          if (tj == null) {
             Log.g("ImagePreviewItem", "decideBubbleVisibleIfNeed, mViewModel == null, index="+this.b);
             return;
          }else {
             boolean b = false;
             if (tj instanceof l0) {
                b1 = tj.G0();
                b2 = tj.I0();
             }else {
                b1 = false;
                b2 = false;
             }
             if (this.f.q() == null) {
                Log.g("ImagePreviewItem", "showPreviewBubbleIfNeed, not show because bubbleContainer is null..");
                return;
             }else {
                c tk = this.k;
                boolean b3 = (tk != null)? tk.O0(this.m.getPath()): false;
                b0 obj = PatchProxy.apply(null, this, uoc, "7");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   uoc = this.h;
                   if (uoc != null) {
                      b0 a = uoc.a;
                      if (a > null) {
                         obj = uoc.b;
                         if (obj > null) {
                            float f = (float)a / (float)obj;
                            Log.g("ImagePreviewItem", "isAspectRatioLegal, index="+this.b+", w="+a+", h="+obj+", aspect="+f);
                            if (a <= obj) {
                               if (f - 0x3ee66666 < 0) {
                               label_010e :
                                  Log.g("ImagePreviewItem", "index = "+this.b+", bubbleAdded = "+this.l+", hasSelectedMedia = "+b1+", screenClean = "+b2+", dismissByClose = "+b3+", isAspectLegal = "+b);
                                  if (this.l != null && (!b1 && (!b2 && (!b3 && b)))) {
                                     this.B(true, 150, p0, b2);
                                  }else {
                                     this.B(false, 150, p0, b2);
                                  }
                                  return;
                               }
                            }else if(f - 0x400e38e4 <= 0){
                            }
                            b = true;
                            goto label_010e ;
                         }
                      }
                   }
                   Log.g("ImagePreviewItem", "isAspectRatioLegal=false, dimension="+this.h);
                   goto label_010e ;
                }
             }
          }
       }
    }
    public int getIndex(){
       return this.b;
    }
    public View getView(){
       return this.e;
    }
    public void h(AbsPreviewItemViewBinder p0){
       this.f = p0;
    }
    public void i(){
    }
    public boolean isPlaying(){
       return n.f(this);
    }
    public boolean isPrepared(){
       boolean b = (this.e != null)? true: false;
       return b;
    }
    public int k(){
       return 0;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       Log.g("ImagePreviewItem", "notifyPreviewViewPagerShow, index="+this.b);
       if (this.t != null && this.e != null) {
          this.x(new g(this));
       }
       return;
    }
    public void m(){
       n.l(this);
    }
    public void n(){
    }
    public View o(ViewGroup p0){
       return n.b(this, p0);
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, c.class, "16")) {
          return;
       }
       this.d = false;
       Log.g("ImagePreviewItem", "selected changed, unSelectItem, index="+this.b);
       return;
    }
    public void q(boolean p0){
       n.i(this, p0);
    }
    public void r(){
    }
    public boolean s(){
       return true;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, c.class, "17")) {
          return;
       }
       this.d = true;
       Log.g("ImagePreviewItem", "selected changed, selectItem, index="+this.b);
       this.g(false);
       return;
    }
    public void u(int p0,float p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uoc, "19")) {
          return;
       }
       uoc = this.f;
       if (uoc != null && uoc.t() != null) {
          this.f.t().setVisibility(p0);
          this.f.t().setAlpha(p1);
       }
       return;
    }
    public void unbind(){
       if (PatchProxy.applyVoid(null, this, c.class, "15")) {
          return;
       }
       c tf = this.f;
       if (tf != null) {
          tf.onDestroy();
       }
       this.e = null;
       tf = this.n;
       if (tf != null) {
          tf.dispose();
       }
       tf = this.o;
       if (tf != null) {
          tf.dispose();
       }
       return;
    }
    public void v(){
    }
    public void w(boolean p0,boolean p1){
    }
    public final b x(o p0){
       a c;
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c = a.c;
       return t.fromCallable(new h(this)).subscribeOn(c.i().d()).observeOn(c.i().b()).subscribe(new f(this, p0));
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       String str = "ImagePreviewItem";
       Log.g(str, "prepareAndShow, index="+this.b);
       c tj = this.j;
       if (!tj instanceof l0) {
          Log.g(str, "not show because view model is not MediaPreviewViewModel..");
          return;
       }else {
          n0 on0 = tj.y0();
          if (on0 == null) {
             Log.g(str, "not show because extension is null..");
             return;
          }else {
             c tn = this.n;
             if (tn != null) {
                tn.dispose();
             }
             this.n = on0.b(this.m).observeOn(a.c.i().b()).subscribe(new c$d(this), new c$e(this));
             return;
          }
       }
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, c.class, "14")) {
          return;
       }
       ViewGroup viewGroup = this.f.q();
       String str = "ImagePreviewItem";
       if (viewGroup == null) {
          Log.g(str, "prepareBubbleBackgroundColor, bubbleContainer is null..");
          return;
       }else {
          c tj = this.j;
          if (!tj instanceof l0) {
             Log.g(str, "prepareBubbleBackgroundColor, mViewModel is not MediaPreviewViewModel..");
             return;
          }else {
             n0 on0 = tj.y0();
             if (on0 == null) {
                Log.g(str, "prepareBubbleBackgroundColor, extension is null..");
                return;
             }else {
                c to = this.o;
                if (to != null) {
                   to.dispose();
                }
                this.o = t.create(new c$b(this)).flatMap(new c$a(this, on0)).subscribeOn(d.c).observeOn(d.a).subscribe(new c$h(this, viewGroup), new c$i(this, viewGroup));
                return;
             }
          }
       }
    }
}
