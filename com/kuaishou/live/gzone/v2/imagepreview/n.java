package com.kuaishou.live.gzone.v2.imagepreview.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.gzone.v2.imagepreview.n$a;
import com.facebook.animated.webp.WebPImage;
import java.io.InputStream;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import cl0.a;
import java.io.OutputStream;
import com.facebook.animated.webp.WebPFrame;
import java.io.ByteArrayInputStream;
import android.net.Uri;
import brd.w;
import java.lang.Boolean;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.StringBuilder;
import ekd.a0;
import java.lang.System;
import com.kuaishou.live.gzone.v2.imagepreview.l;
import io.reactivex.g;
import brd.t;
import android.app.Application;
import o56.a;
import android.content.ContentResolver;
import android.content.ContentValues;
import java.lang.Long;
import java.lang.Integer;
import com.yxcorp.gifshow.albumcontrol.a;
import android.provider.MediaStore$Images$Media;
import v79.a;
import ekd.p;
import android.os.Build$VERSION;
import android.os.Environment;
import java.io.File;
import qkd.b;
import android.content.Intent;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.PreviewModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.w0;
import java.lang.Number;
import com.yxcorp.utility.n;
import java.util.Objects;
import com.kuaishou.live.gzone.v2.imagepreview.GzoneImageView;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.kuaishou.live.gzone.v2.imagepreview.n$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.Rect;
import a63.d;
import android.view.View;
import android.animation.ValueAnimator;
import a63.p;
import com.kwai.library.widget.layout.DraggedFrameLayout$a;
import com.kwai.library.widget.layout.DraggedFrameLayout;
import a63.s;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import com.kwai.library.widget.layout.DraggedFrameLayout$b;
import kxa.a;
import com.kuaishou.live.gzone.v2.imagepreview.o;
import android.view.GestureDetector$OnDoubleTapListener;
import com.kuaishou.live.gzone.v2.imagepreview.k;
import android.view.View$OnLongClickListener;
import xb.t$b;
import a63.g;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import lnc.a1;
import android.animation.Animator;
import ekd.f;
import a63.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import a63.t;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.gzone.v2.imagepreview.n$c;
import java.lang.Float;
import a63.m;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;
import android.widget.LinearLayout;
import io.reactivex.subjects.PublishSubject;

public class n extends PresenterV2	// class@001cd6
{
    public ValueAnimator A;
    public int B;
    public ValueAnimator C;
    public Uri D;
    public boolean E;
    public int F;
    public b G;
    public GzoneImageView p;
    public DraggedFrameLayout q;
    public View r;
    public LinearLayout s;
    public PreviewModel t;
    public int u;
    public int v;
    public PublishSubject w;
    public GifshowActivity x;
    public d y;
    public ValueAnimator z;
    public static String sLivePresenterClassName = "GzoneImagePreviewPresenter";

    public void n(){
       super();
       this.F = 0;
       this.G = new n$a(this);
    }
    public static InputStream S8(WebPImage p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int width = p0.getWidth();
       int height = p0.getHeight();
       int[] frameDuratio = p0.getFrameDurations();
       Bitmap uBitmap = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
       uBitmap.eraseColor(0);
       uBitmap.setHasAlpha(true);
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       a uoa = new a();
       uoa.h(uByteArrayOu);
       for (int i = 0; i < p0.getFrameCount(); i = i + 1) {
          p0.b(i).renderFrame(width, height, uBitmap);
          uoa.a(uBitmap.copy(Bitmap$Config.ARGB_8888, 0));
          uoa.f(frameDuratio[i]);
       }
       uoa.d();
       return new ByteArrayInputStream(uByteArrayOu.toByteArray());
    }
    public static w Y8(Uri p0,boolean p1){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, on, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.create(new l(ImageRequestBuilder.k(p0).a(), a0.c(p0.toString())+System.currentTimeMillis(), p1));
    }
    public static boolean a9(InputStream p0,String p1,String p2){
       OutputStream outputStream;
       byte[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, n.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       ContentResolver contentResol = a.b().getContentResolver();
       long l = System.currentTimeMillis();
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("date_modified", Long.valueOf(l));
       uContentValu.put("date_added", Long.valueOf(l));
       Long longx = Long.valueOf(l);
       uContentValu.put("datetaken", longx);
       uContentValu.put("_display_name", p1+"."+p2);
       uContentValu.put("mime_type", "image/"+p2);
       uContentValu.put("is_pending", Integer.valueOf(1));
       a uoa = a.b.g("game_photo_browser", contentResol, MediaStore$Images$Media.EXTERNAL_CONTENT_URI, uContentValu);
       boolean b = false;
       if (!uoa.b()) {
          return b;
       }
       Object obj1 = uoa.a();
       try{
          uoa = 0;
          outputStream = contentResol.openOutputStream(obj1);
          obj = new byte[8192];
          int i = p0.read(obj);
          while (i != -1) {
             outputStream.write(obj, b, i);
          }
          p.c(p0);
          p.d(outputStream);
          uContentValu.clear();
          uContentValu.put("is_pending", Integer.valueOf(b));
          return a.b.l("game_photo_browser", contentResol, obj1, uContentValu, null, null).b();
       }catch(java.lang.Exception e0){
          p.c(p0);
          p.d(outputStream);
          return b;
       }
    }
    public static boolean c9(InputStream p0,String p1,String p2){
       boolean b;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, n.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT >= 29) {
          b = n.a9(p0, p1, p2);
       }else {
          p1 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath()+File.separator+p1+"."+p2;
          b = b.l(p0, p1);
          if (b) {
             a.b().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://"+p1)));
          }
       }
       return b;
    }
    public void E8(){
       d uod;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "4")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       this.x = activity;
       if (activity == null) {
          return;
       }
       this.D = (!TextUtils.x(this.t.f))? w0.c(new File(this.t.f)): w0.f(this.t.d);
       n tp = this.p;
       n tD = this.D;
       Object obj = PatchProxy.apply(objArray, this, on, "8");
       int i = (obj != patchProxyRe)? obj.intValue(): n.x(this.x);
       n obj1 = PatchProxy.apply(objArray, this, on, "7");
       int i1 = (obj1 != patchProxyRe)? obj1.intValue(): n.t(this.x);
       n tG = this.G;
       Objects.requireNonNull(tp);
       if (PatchProxy.isSupport(GzoneImageView.class)) {
          Object[] objArray1 = new Object[]{tD,tD,Integer.valueOf(i),Integer.valueOf(i1),tG};
          if (PatchProxy.apply(objArray1, tp, GzoneImageView.class, "1") != patchProxyRe) {
          }else if(tD == null){
             tp.B(tD, i, i1, tG);
          }else {
             uod = tp.e0(tG, tp.p0(tD, i, i1));
             uod.q(1);
             uod.x(tp.p0(tD, i, i1));
             tp.setController(uod.e());
          }
       }else {
          goto label_009f ;
       }
       if (!this.t.d()) {
          this.p.getViewTreeObserver().addOnPreDrawListener(new n$b(this));
       }else {
          uod = this.W8(this.t.g, this.Z8());
          this.y = uod;
          this.z = this.V8(uod, this.p, 0, 255);
       }
       n tp1 = this.p;
       obj1 = this.q;
       if (!PatchProxy.applyVoidTwoRefs(tp1, obj1, this, on, "9")) {
          obj1.setInterceptor(new p(this));
          obj1.setDragListener(new s(this, tp1));
       }
       tp1 = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp1, this, on, "10")) {
          a attacher = tp1.getAttacher();
          attacher.setOnDoubleTapListener(new o(this, tp1));
          attacher.setOnLongClickListener(new k(this));
          attacher.v(t$b.e);
          tp1.setAutoSetMinScale(1);
       }
       this.X7(this.w.subscribe(new g(this), Functions.d()));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       this.B = a1.e(50.00f);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, n.class, "20")) {
          return;
       }
       f.a(this.z);
       f.a(this.A);
       f.a(this.C);
       return;
    }
    public void P8(int p0,d p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, on, "6")) {
          return;
       }
       if (p0 != 1) {
          int i = 2;
          if (p0 != i) {
             if (p0 != 3) {
                this.x.finish();
             }else if(this.z == null){
                this.x.finish();
                return;
             }else {
                this.p.setScale(0x3f800000);
                f.a(this.z);
                this.z.removeAllListeners();
                this.z.addListener(new n$c(this));
                this.z.reverse();
             }
          }else {
             f.a(this.C);
             n tp = this.p;
             ValueAnimator valueAnimato = PatchProxy.applyTwoRefs(p1, tp, this, on, "17");
             if (valueAnimato != PatchProxyResult.class) {
             }else {
                valueAnimato = ValueAnimator.ofFloat(new float[i]{0,0x3f800000});
                if (p1 != null) {
                   this.X8(this.q);
                   valueAnimato.setDuration(200);
                   valueAnimato.addUpdateListener(new e(this, p1, tp));
                   valueAnimato.addListener(new t(this));
                }
             }
             this.C = valueAnimato;
             valueAnimato.start();
          }
       }else {
          goto label_0064 ;
       }
       return;
    }
    public final Rect R8(Rect p0,Rect p1,float p2){
       Rect obj;
       if (PatchProxy.isSupport(n.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Float.valueOf(p2), this, n.class, "18");
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
    public ValueAnimator V8(d p0,View p1,int p2,int p3){
       ValueAnimator obj;
       if (PatchProxy.isSupport(n.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, n.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       obj.setDuration(200);
       m om = new m(this, p0, p1, p2, p3);
       obj.addUpdateListener(v1);
       return obj;
    }
    public d W8(Rect p0,Rect p1){
       float f1;
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "14");
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
    public int X8(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Drawable background = p0.getBackground();
       if (background instanceof ColorDrawable) {
          return background.getAlpha();
       }
       return 255;
    }
    public Rect Z8(){
       Rect obj = PatchProxy.apply(null, this, n.class, "5");
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
    public void b9(Rect p0,View p1,float p2,int p3,int p4){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, on, "19")) {
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
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a28d2);
       this.p = m1.f(p0, 0x7f0a32ab);
       this.q = m1.f(p0, 0x7f0a32ac);
       this.r = m1.f(p0, 0x7f0a32ad);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.t = this.r8("LIVE_GZONE_IMAGE_PREVIEW_MODEL");
       this.u = this.r8("LIVE_GZONE_IMAGE_PREVIEW_POSITION").intValue();
       this.v = this.r8("LIVE_GZONE_IMAGE_PREVIEW_SELECTED_POSITION").intValue();
       this.w = this.r8("LIVE_GZONE_IMAGE_PREVIEW_ANIM_OUT_SUBJECT");
       return;
    }
}
