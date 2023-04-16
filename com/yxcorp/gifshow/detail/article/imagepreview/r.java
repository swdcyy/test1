package com.yxcorp.gifshow.detail.article.imagepreview.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.article.imagepreview.r$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.PreviewModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import android.net.Uri;
import ekd.w0;
import java.lang.Number;
import com.yxcorp.utility.n;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.yxcorp.gifshow.detail.article.imagepreview.r$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.Rect;
import xw9.d;
import android.view.View;
import android.animation.ValueAnimator;
import xw9.o;
import com.kwai.library.widget.layout.DraggedFrameLayout$a;
import com.kwai.library.widget.layout.DraggedFrameLayout;
import xw9.r;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import com.kwai.library.widget.layout.DraggedFrameLayout$b;
import kxa.a;
import com.yxcorp.gifshow.detail.article.imagepreview.s;
import android.view.GestureDetector$OnDoubleTapListener;
import com.yxcorp.gifshow.detail.article.imagepreview.o;
import android.view.View$OnLongClickListener;
import xb.t$b;
import xw9.h;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import lnc.a1;
import android.animation.Animator;
import ekd.f;
import java.lang.Integer;
import xw9.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import xw9.s;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.detail.article.imagepreview.r$c;
import java.lang.Float;
import xw9.l;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import ekd.m1;
import android.widget.LinearLayout;
import io.reactivex.subjects.PublishSubject;

public class r extends PresenterV2	// class@00135f
{
    public ValueAnimator A;
    public ValueAnimator B;
    public int C;
    public ValueAnimator D;
    public Uri E;
    public boolean F;
    public int G;
    public b H;
    public KwaiZoomImageView p;
    public DraggedFrameLayout q;
    public View r;
    public LinearLayout s;
    public PreviewModel t;
    public int u;
    public int v;
    public PublishSubject w;
    public QPhoto x;
    public GifshowActivity y;
    public d z;

    public void r(){
       super();
       this.G = 0;
       this.H = new r$a(this);
    }
    public void E8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or, "4")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       this.y = activity;
       if (activity == null) {
          return;
       }
       this.E = (!TextUtils.x(this.t.f))? w0.c(new File(this.t.f)): w0.f(this.t.d);
       r tp = this.p;
       r tE = this.E;
       Object obj = PatchProxy.apply(objArray, this, or, "8");
       int i = (obj != patchProxyRe)? obj.intValue(): n.x(this.y);
       r obj1 = PatchProxy.apply(objArray, this, or, "7");
       int i1 = (obj1 != patchProxyRe)? obj1.intValue(): n.t(this.y);
       tp.B(tE, i, i1, this.H);
       if (!this.t.d()) {
          this.p.getViewTreeObserver().addOnPreDrawListener(new r$b(this));
       }else {
          d uod = this.V8(this.t.g, this.X8());
          this.z = uod;
          this.A = this.S8(uod, this.p, 0, 255);
       }
       r tp1 = this.p;
       obj1 = this.q;
       if (!PatchProxy.applyVoidTwoRefs(tp1, obj1, this, or, "9")) {
          obj1.setInterceptor(new o(this));
          obj1.setDragListener(new r(this, obj1, tp1));
       }
       tp1 = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp1, this, or, "10")) {
          a attacher = tp1.getAttacher();
          attacher.setOnDoubleTapListener(new s(this, tp1));
          attacher.setOnLongClickListener(new o(this));
          attacher.v(t$b.e);
          tp1.setAutoSetMinScale(true);
       }
       this.X7(this.w.subscribe(new h(this), Functions.d()));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       this.C = a1.e(50.00f);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, r.class, "22")) {
          return;
       }
       f.a(this.A);
       f.a(this.B);
       f.a(this.D);
       return;
    }
    public void P8(int p0,d p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, or, "6")) {
          return;
       }
       if (p0 != 1) {
          int i = 2;
          if (p0 != i) {
             if (p0 != 3) {
                this.y.finish();
             }else if(this.A == null){
                this.y.finish();
                return;
             }else {
                this.p.setScale(0x3f800000);
                f.a(this.A);
                this.A.removeAllListeners();
                this.A.addListener(new r$c(this));
                this.A.reverse();
             }
          }else {
             f.a(this.D);
             r tp = this.p;
             ValueAnimator valueAnimato = PatchProxy.applyTwoRefs(p1, tp, this, or, "19");
             if (valueAnimato != PatchProxyResult.class) {
             }else {
                valueAnimato = ValueAnimator.ofFloat(new float[i]{0,0x3f800000});
                if (p1 != null) {
                   valueAnimato.setDuration(200);
                   valueAnimato.addUpdateListener(new e(this, p1, tp, this.W8(this.q)));
                   valueAnimato.addListener(new s(this));
                }
             }
             this.D = valueAnimato;
             valueAnimato.start();
          }
       }else {
          goto label_0065 ;
       }
       return;
    }
    public final Rect R8(Rect p0,Rect p1,float p2){
       Rect obj;
       if (PatchProxy.isSupport(r.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Float.valueOf(p2), this, r.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Rect();
       Rect left = p0.left;
       float f = (float)left;
       obj.left = (int)(f + ((float)(p1.left - left) * p2));
       left = p0.right;
       f = (float)left;
       obj.right = (int)(f + ((float)(p1.right - left) * p2));
       left = p0.top;
       f = (float)left;
       obj.top = (int)(f + ((float)(p1.top - left) * p2));
       p0 = p0.bottom;
       float f1 = (float)p0;
       obj.bottom = (int)(f1 + ((float)(p1.bottom - p0) * p2));
       return obj;
    }
    public ValueAnimator S8(d p0,View p1,int p2,int p3){
       ValueAnimator obj;
       if (PatchProxy.isSupport(r.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, r.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       obj.setDuration(200);
       l ol = new l(this, p0, p1, p2, p3);
       obj.addUpdateListener(v1);
       return obj;
    }
    public d V8(Rect p0,Rect p1){
       float f1;
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, r.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && (p1 != null && (!p1.width() || !p1.height()))) {
          return new d(new Rect(), new Rect(), new Rect());
       }
       float f = 0x3f800000;
       if ((p1.width() * p0.height()) < (p1.height() * p0.width())) {
          f1 = (float)p1.width() * f;
          i = p0.width();
       }else {
          f1 = (float)p1.height() * f;
          i = p0.height();
       }
       f1 = f1 / (float)i;
       i = (int)((float)p0.width() * f1);
       int i1 = (int)(f1 * (float)p0.height());
       Rect rect = new Rect();
       int i2 = (p1.width() - i) / 2;
       rect.left = i2;
       rect.right = i2 + i;
       i = (p1.height() - i1) / 2;
       rect.top = i;
       rect.bottom = i + i1;
       return new d(p0, rect, p1);
    }
    public int W8(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Drawable background = p0.getBackground();
       if (background instanceof ColorDrawable) {
          return background.getAlpha();
       }
       return 255;
    }
    public Rect X8(){
       Rect obj = PatchProxy.apply(null, this, r.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Rect();
       ViewParent parent = this.q.getParent();
       if (parent instanceof View) {
          parent.getGlobalVisibleRect(obj);
       }else {
          this.q.getGlobalVisibleRect(obj);
       }
       return obj;
    }
    public void Y8(Rect p0,View p1,float p2,int p3,int p4){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, or, "21")) {
             return;
          }
       }
       ViewGroup$MarginLayoutParams layoutParams = p1.getLayoutParams();
       layoutParams.width = (int)((float)p0.width() * p2);
       layoutParams.height = (int)((float)p0.height() * p2);
       layoutParams.setMargins((p0.left + (int)((float)p3 * p2)), (p0.top + (int)((float)p4 * p2)), 0, 0);
       p1.setLayoutParams(layoutParams);
       return;
    }
    public final void Z8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "14")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p0;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.x.mEntity);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, r.class, "13")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SHOW_SAVE_TOAST";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.x.mEntity);
       u1.u0(6, uElementPack, uContentPack);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a28d2);
       this.p = m1.f(p0, 0x7f0a32ab);
       this.q = m1.f(p0, 0x7f0a32ac);
       this.r = m1.f(p0, 0x7f0a32ad);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.t = this.r8("IMAGE_PREVIEW_MODEL");
       this.u = this.r8("IMAGE_PREVIEW_POSITION").intValue();
       this.v = this.r8("IMAGE_PREVIEW_SELECTED_POSITION").intValue();
       this.w = this.r8("IMAGE_PREVIEW_ANIM_OUT_SUBJECT");
       this.x = this.r8("IMAGE_PREVIEW_ADAPTER_PHOTO");
       return;
    }
}
