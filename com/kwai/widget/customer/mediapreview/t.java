package com.kwai.widget.customer.mediapreview.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.util.Pair;
import java.lang.Integer;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import com.kwai.widget.customer.mediapreview.t$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import ix7.t;
import erd.g;
import crd.b;
import brd.t;
import ix7.v;
import ix7.u;
import ix7.w;
import com.kwai.widget.customer.mediapreview.widget.KwaiDraggedConstraintLayout$a;
import com.kwai.widget.customer.mediapreview.widget.KwaiDraggedConstraintLayout;
import com.kwai.widget.customer.mediapreview.u;
import com.kwai.widget.customer.mediapreview.widget.KwaiDraggedConstraintLayout$b;
import android.animation.Animator;
import ekd.f;
import java.lang.Boolean;
import android.view.View;
import java.lang.ref.WeakReference;
import android.animation.ValueAnimator;
import ix7.q;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kwai.widget.customer.mediapreview.t$b;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.RectF;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import ekd.m1;
import com.kwai.library.widget.recyclerview.SnappyRecyclerView;
import io.reactivex.subjects.PublishSubject;
import ix7.a0;

public class t extends PresenterV2	// class@001147
{
    public a0 A;
    public int B;
    public SnappyRecyclerView p;
    public KwaiDraggedConstraintLayout q;
    public PublishSubject r;
    public PublishSubject s;
    public PublishSubject t;
    public PublishSubject u;
    public Rect v;
    public WeakReference w;
    public Pair x;
    public Rect y;
    public ValueAnimator z;

    public void t(){
       super();
       this.x = new Pair(Integer.valueOf(0), Integer.valueOf(0));
       this.y = new Rect();
    }
    public void E8(){
       t ot = t.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ot, "3")) {
          return;
       }
       if (this.v == null) {
          return;
       }
       this.q.getViewTreeObserver().addOnPreDrawListener(new t$a(this));
       this.X7(this.s.subscribe(new t(this)));
       this.X7(this.t.subscribe(new v(this)));
       this.X7(this.u.subscribe(new u(this)));
       if (!PatchProxy.applyVoid(objArray, this, ot, "5")) {
          this.q.setInterceptor(new w(this));
          this.q.setDragListener(new u(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       f.a(this.z);
       return;
    }
    public void P8(boolean p0){
       View view;
       t tv;
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ot, "10")) {
          return;
       }
       if (this.S8()) {
          return;
       }
       if (p0) {
          view = this.V8();
       }else {
          tv = this.w;
          if (tv != null && tv.get() != null) {
             view = this.w.get();
          }else {
          label_0104 :
             return;
          }
       }
       View view1 = view;
       tv = this.v;
       Rect left = tv.left;
       t ty = this.y;
       Rect left1 = ty.left;
       tv = this.v;
       left = tv.top;
       ty = this.y;
       left1 = ty.top;
       tv = this.v;
       t ty1 = this.y;
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       this.z = valueAnimato;
       q oq = new q(this, this.R8(this.q), view1.getScaleX(), (((float)(tv.right - tv.left) * 0x3f800000) / (float)(ty1.right - ty1.left)), view1.getScaleY(), (((float)(tv.bottom - tv.top) * 0x3f800000) / (float)(ty1.bottom - ty1.top)), view1, view1.getTranslationX(), (((((float)((tv.right - left) / 2) - ((float)(ty.right - left1) / 2.00f)) + (float)left) - (float)left1) - (float)((this.q.getWidth() - this.x.first.intValue()) / 2)), view1.getTranslationY(), (((((float)((tv.bottom - left) / 2) - ((float)(ty.bottom - left1) / 2.00f)) + (float)left) - (float)left1) - (float)((this.q.getHeight() - this.x.second.intValue()) / 2)));
       valueAnimato.addUpdateListener(v13);
       this.z.setInterpolator(new AccelerateDecelerateInterpolator());
       this.z.addListener(new t$b(this));
       this.z.setDuration(300);
       this.z.start();
       goto label_0104 ;
    }
    public final int R8(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Drawable background = p0.getBackground();
       if (background instanceof ColorDrawable) {
          return background.getAlpha();
       }
       return 255;
    }
    public boolean S8(){
       t obj = PatchProxy.apply(null, this, t.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.z;
       boolean b = (obj != null && obj.isRunning())? true: false;
       return b;
    }
    public View V8(){
       View view;
       View view1;
       t obj = PatchProxy.apply(null, this, t.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       if (obj != null && obj.get() != null) {
          view = this.w.get();
       }else {
          view = this.p.getChildAt(0);
          try{
             int i = 0x7f0a2abd;
             view1 = view.findViewById(i);
          }catch(java.lang.Exception e0){
          }
          if (view1 != null) {
             this.w = new WeakReference(view1);
          }
          view = view1;
       }
       if (view != null) {
          if (view instanceof KwaiBindableImageView) {
             RectF rectF = new RectF();
             view.getHierarchy().k(rectF);
             rectF.round(this.y);
          }else {
             view.getLocalVisibleRect(this.y);
          }
          this.x = new Pair(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
       }
       return view;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0c3f);
       this.p = m1.f(p0, 0x7f0a34da);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.r = this.r8("PREVIEW_MEDIA_PREVIEW_DRAG_STATE");
       this.s = this.r8("PREVIEW_MEDIA_PREVIEW_CONTAINERECT");
       this.t = this.r8("PREVIEW_MEDIA_PREVIEW_EXIT");
       this.v = this.t8("PREVIEW_MEDIA_PREVIEW_ORIGIN_RECT");
       this.A = this.r8("PREVIEW_MEDIA_PAGE_INDEX");
       this.u = this.r8("PREVIEW_MEDIA_PREVIEW_POSITION");
       this.B = this.r8("PREVIEW_MEDIA_PREVIEW_POSITION_INIT").intValue();
       return;
    }
}
