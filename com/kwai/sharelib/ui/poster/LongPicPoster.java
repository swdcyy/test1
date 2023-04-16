package com.kwai.sharelib.ui.poster.LongPicPoster;
import ap7.a;
import np7.d;
import java.lang.Object;
import android.view.ViewGroup;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import np7.d$a;
import android.graphics.Paint;
import com.kwai.sharelib.model.PainterModel;
import android.graphics.Bitmap;
import java.lang.Integer;
import android.view.View;
import op7.f;
import com.kwai.sharelib.model.PainterModel$QrContent;
import java.lang.Throwable;
import com.kwai.sharelib.model.PainterModel$ImageContent;
import com.kwai.sharelib.model.PosterConfig;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import java.util.Objects;
import com.kwai.sharelib.ui.poster.LongPicPoster$showPosterViewWithSpecifiedSize$3;
import msd.s;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import com.kwai.sharelib.ui.poster.LongPicPoster$showPosterView$2;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.sharelib.model.PainterModel$QrLayout;
import android.graphics.Bitmap$Config;
import yo7.b;
import android.os.SystemClock;
import com.kwai.sharelib.model.TkConfig;
import yo7.b$a;
import mp7.c;
import com.kwai.sharelib.model.PosterConfig$PosterLayout;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import qrd.l1;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import brd.t;
import np7.e;
import io.reactivex.g;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import com.kwai.sharelib.ui.poster.LongPicPoster$a;
import com.kwai.sharelib.ui.poster.LongPicPoster$b;
import erd.g;
import crd.b;
import au6.e;
import java.lang.StringBuilder;

public final class LongPicPoster implements a, d	// class@00171f
{
    public ImageView a;
    public View b;
    public ViewGroup c;
    public b d;
    public c e;
    public f f;
    public boolean g;
    public boolean h;
    public Bitmap i;

    public void LongPicPoster(){
       super();
    }
    public static final ViewGroup o(LongPicPoster p0){
       p0 = p0.c;
       if (p0 == null) {
          a.S("posterLayout");
       }
       return p0;
    }
    public static final ImageView p(LongPicPoster p0){
       p0 = p0.a;
       if (p0 == null) {
          a.S("posterLongPictureView");
       }
       return p0;
    }
    public boolean E(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LongPicPoster.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "activity");
       return d$a.j(this, p0);
    }
    public Paint a(){
       Object obj = PatchProxy.apply(null, this, LongPicPoster.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d$a.e(this);
    }
    public Bitmap b(PainterModel p0,Bitmap p1,int p2,int p3){
       if (PatchProxy.isSupport(LongPicPoster.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, LongPicPoster.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "painterModel");
       a.p(p1, "posterBitmap");
       return d$a.g(this, p0, p1, p2, p3);
    }
    public View c(View p0,int p1){
       LongPicPoster longPicPoste = LongPicPoster.class;
       if (PatchProxy.isSupport(longPicPoste)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, longPicPoste, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "view");
       return d$a.a(this, p0, p1);
    }
    public void d(boolean p0){
       this.h = p0;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, LongPicPoster.class, "7")) {
          return;
       }
       LongPicPoster tf = this.f;
       if (tf != null) {
          tf.d();
       }
       try{
          tf = this.i;
          if (tf != null) {
             tf.recycle();
          }
          this.i = null;
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public Bitmap e(PainterModel$QrContent p0,int p1){
       LongPicPoster longPicPoste = LongPicPoster.class;
       if (PatchProxy.isSupport(longPicPoste)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, longPicPoste, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "qrParams");
       return d$a.h(this, p0, p1);
    }
    public void f(PainterModel p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LongPicPoster.class, "18")) {
          return;
       }
       a.p(p0, "painterModel");
       a.p(p1, "error");
       d$a.k(this, p0, p1);
       return;
    }
    public void g(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LongPicPoster.class, "11")) {
          return;
       }
       a.p(p0, "posterView");
       d$a.i(this, p0);
       return;
    }
    public void h(ImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LongPicPoster.class, "16")) {
          return;
       }
       a.p(p0, "imageView");
       d$a.l(this, p0);
       return;
    }
    public Bitmap i(PainterModel$ImageContent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LongPicPoster.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "imageContent");
       return d$a.f(this, p0);
    }
    public ViewGroup j(Activity p0,PosterConfig p1,PainterModel p2,ViewGroup p3,int p4,int p5,boolean p6){
       ViewGroup obj;
       LongPicPoster longPicPoste = LongPicPoster.class;
       if (PatchProxy.isSupport(longPicPoste)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5),Boolean.valueOf(p6)};
          obj = PatchProxy.apply(objArray, this, longPicPoste, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "posterConfig");
       a.p(p2, "painterModel");
       a.p(p3, "viewGroup");
       obj = p3.findViewById(R.id.poster_root);
       if (obj != null) {
          this.c = obj;
       }else {
          View view = a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d1341, p3, p6);
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          this.c = view;
       }
       LongPicPoster tc = this.c;
       if (tc == null) {
          a.S("posterLayout");
       }
       this.a = this.c(tc, 0x7f0a3753);
       tc = this.c;
       if (tc == null) {
          a.S("posterLayout");
       }
       this.b = this.c(tc, 0x7f0a3752);
       this.y(p5, p4, p0, p1, p2, LongPicPoster$showPosterViewWithSpecifiedSize$3.INSTANCE);
       LongPicPoster tc1 = this.c;
       if (tc1 == null) {
          a.S("posterLayout");
       }
       return tc1;
    }
    public void k(Activity p0,PosterConfig p1,PainterModel p2,View p3){
       boolean b;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LongPicPoster.class, "1")) {
          return;
       }
       String str = "activity";
       a.p(p0, str);
       a.p(p1, "posterConfig");
       a.p(p2, "painterModel");
       a.p(p3, "viewLayout");
       LongPicPoster$showPosterView$2 obj = PatchProxy.applyOneRefs(p0, this, LongPicPoster.class, "17");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, str);
          b = d$a.j(this, p0);
       }
       if (b) {
          return;
       }else {
          View view = p3.findViewById(R.id.share_layout);
          if (view != null) {
             if (this.c == null) {
                ViewStub viewStub = p3.findViewById(R.id.poster_layout);
                if (viewStub != null) {
                   viewStub.setLayoutResource(R.layout.arg_RES_7f0d1341);
                   viewStub = viewStub.inflate();
                   Objects.requireNonNull(viewStub, "null cannot be cast to non-null type android.view.ViewGroup");
                   this.c = viewStub;
                   this.a = this.c(viewStub, 0x7f0a3753);
                   LongPicPoster tc = this.c;
                   if (tc == null) {
                      a.S("posterLayout");
                   }
                   this.b = this.c(tc, 0x7f0a3752);
                }else {
                   return;
                }
             }
             obj = new LongPicPoster$showPosterView$2(this, view, p0, p1, p2);
             view.getViewTreeObserver().addOnPreDrawListener(b);
          }
          return;
       }
    }
    public Bitmap l(Bitmap p0,PainterModel$QrLayout p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LongPicPoster.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "mQrLayout");
       return d$a.d(this, p0, p1);
    }
    public Bitmap m(View p0,int p1,int p2,Bitmap$Config p3){
       if (PatchProxy.isSupport(LongPicPoster.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, LongPicPoster.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "view");
       a.p(p3, "config");
       return d$a.b(this, p0, p1, p2, p3);
    }
    public Bitmap n(Context p0,PainterModel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LongPicPoster.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       a.p(p1, "painterModel");
       Bitmap uBitmap = this.s(p1);
       if (uBitmap != null) {
          return this.b(p1, uBitmap, uBitmap.getWidth(), uBitmap.getHeight());
       }
       return null;
    }
    public final Bitmap q(){
       return this.i;
    }
    public final b r(){
       return this.d;
    }
    public final Bitmap s(PainterModel p0){
       Bitmap uBitmap;
       LongPicPoster tf1;
       PainterModel mImageConten;
       String str1;
       String message1;
       LongPicPoster obj = PatchProxy.applyOneRefs(p0, this, LongPicPoster.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = SystemClock.elapsedRealtime();
       LongPicPoster tf = this.f;
       boolean b = true;
       String str = "painterModel.mImageContent";
       if (tf != null) {
          LongPicPoster td = this.d;
          if (td != null) {
             a.m(tf);
             b$a.b(td, tf.n(), "START", null, 4, null);
          }
          tf = this.f;
          a.m(tf);
          uBitmap = tf.o();
          if (uBitmap != null) {
             td = this.d;
             if (td != null) {
                tf1 = this.f;
                a.m(tf1);
                b$a.b(td, tf1.n(), "SUCCESS", null, 4, null);
             }
             this.g = b;
          }else {
             td = this.d;
             if (td != null) {
                tf1 = this.f;
                a.m(tf1);
                TkConfig tkConfig = tf1.n();
                LongPicPoster tf2 = this.f;
                a.m(tf2);
                Throwable throwable1 = tf2.j();
                if (throwable1 != null) {
                   message1 = throwable1.getMessage();
                   if (message1 != null) {
                   label_0072 :
                      td.onTkViewRenderEvent(tkConfig, "FAIL", message1);
                   }
                }
                message1 = "";
                goto label_0072 ;
             }
          }
          if (uBitmap == null) {
             td = this.f;
             a.m(td);
             TkConfig isRetryNativ = td.n().isRetryNative;
             a.o(isRetryNativ, "tkPosterHelper!!.mTkPosterConfig.isRetryNative");
             if (isRetryNativ.booleanValue()) {
                mImageConten = p0.mImageContent;
                a.o(mImageConten, str);
                uBitmap = this.i(mImageConten);
             }
          }
       }else {
          mImageConten = p0.mImageContent;
          a.o(mImageConten, str);
          uBitmap = this.i(mImageConten);
       }
       LongPicPoster td1 = this.d;
       if (td1 != null) {
          long l1 = SystemClock.elapsedRealtime() - l;
          LongPicPoster tg = this.g;
          boolean b1 = (uBitmap != null)? true: false;
          obj = this.f;
          if (obj != null) {
             Throwable throwable = obj.j();
             if (throwable != null) {
                String message = throwable.getMessage();
                if (message != null) {
                   str1 = message;
                label_00c7 :
                   td1.onPosterGenerateEvent(p0, l1, tg, b1, str1);
                }
             }
          }
          str1 = "";
          goto label_00c7 ;
       }
       return uBitmap;
    }
    public final f t(){
       return this.f;
    }
    public final c u(){
       return this.e;
    }
    public final void v(b p0){
       this.d = p0;
    }
    public final void w(f p0){
       this.f = p0;
    }
    public final void x(c p0){
       this.e = p0;
    }
    public final void y(int p0,int p1,Activity p2,PosterConfig p3,PainterModel p4,s p5){
       t ot;
       LongPicPoster longPicPoste = LongPicPoster.class;
       int i = 0;
       if (PatchProxy.isSupport(longPicPoste)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, longPicPoste, "3")) {
             return;
          }
       }
       if (p0 > 0 && p1 > 0) {
          PosterConfig mPosterLayou = p3.mPosterLayout;
          PosterConfig$PosterLayout posterLayout = null;
          PosterConfig$PosterLayout mTopMargin = (mPosterLayou != null)? mPosterLayou.mTopMargin: 0;
          int i1 = n.c(p2, mTopMargin);
          p3 = p3.mPosterLayout;
          if (p3 != null) {
             posterLayout = p3.mBottomMargin;
          }
          int i2 = n.c(p2, posterLayout);
          int i3 = (p1 - i1) - i2;
          LongPicPoster tc = this.c;
          String str = "posterLayout";
          if (tc == null) {
             a.S(str);
          }
          LongPicPoster tc1 = this.c;
          if (tc1 == null) {
             a.S(str);
          }
          ViewGroup$LayoutParams layoutParams = tc1.getLayoutParams();
          layoutParams.width = p0;
          layoutParams.height = p1;
          tc.setLayoutParams(layoutParams);
          LongPicPoster tb = this.b;
          String str1 = "longPosterLayout";
          if (tb == null) {
             a.S(str1);
          }
          ViewGroup$LayoutParams layoutParams1 = tb.getLayoutParams();
          Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
          layoutParams1.setMargins(i, i1, i, i2);
          LongPicPoster tb1 = this.b;
          if (tb1 == null) {
             a.S(str1);
          }
          tb1.setLayoutParams(layoutParams1);
          if (PatchProxy.isSupport(longPicPoste)) {
             ot = PatchProxy.applyThreeRefs(p4, Integer.valueOf(p0), Integer.valueOf(i3), this, LongPicPoster.class, "6");
             if (ot != PatchProxyResult.class) {
             label_00c7 :
                ot.subscribe(new LongPicPoster$a(this, p5, p0, i3), new LongPicPoster$b(this, p4));
             }
          }
          ot = t.create(new e(this, p4, p0, i3)).subscribeOn(b.d()).observeOn(a.c());
          a.o(ot, "Observable.create<Bitmap¡­dSchedulers.mainThread\(\)\)");
          goto label_00c7 ;
       }else {
          e.b(e.a, null, "long pic poster width height error! width:"+p0+" height:"+p1, null, 5, null);
       }
       return;
    }
}
