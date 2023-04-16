package com.kwai.sharelib.ui.poster.BigQrPoster;
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
import com.kwai.sharelib.model.PainterModel$QrContent;
import java.lang.Throwable;
import com.kwai.sharelib.model.PainterModel$ImageContent;
import com.kwai.sharelib.model.PosterConfig;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import java.util.Objects;
import com.kwai.sharelib.ui.poster.BigQrPoster$showPosterViewWithSpecifiedSize$3;
import msd.s;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import com.kwai.sharelib.ui.poster.BigQrPoster$showPosterView$2;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.sharelib.model.PainterModel$QrLayout;
import android.graphics.Bitmap$Config;
import lnc.a1;
import android.view.View$MeasureSpec;
import android.widget.TextView;
import java.lang.CharSequence;
import com.facebook.drawee.view.SimpleDraweeView;
import com.kwai.sharelib.KsShareApi;
import uo7.s;
import zo7.c;
import np7.c;
import usd.q;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Canvas;
import com.facebook.drawee.view.DraweeView;
import jp7.a;
import yo7.b;
import mp7.c;
import com.kwai.sharelib.model.PosterConfig$PosterLayout;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import qrd.l1;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import brd.t;
import np7.b;
import io.reactivex.g;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import com.kwai.sharelib.ui.poster.BigQrPoster$a;
import com.kwai.sharelib.ui.poster.BigQrPoster$b;
import erd.g;
import crd.b;
import au6.e;
import java.lang.StringBuilder;

public final class BigQrPoster implements a, d	// class@001719
{
    public View a;
    public ImageView b;
    public ViewGroup c;
    public b d;
    public c e;
    public boolean f;
    public Bitmap g;

    public void BigQrPoster(){
       super();
    }
    public static final ViewGroup o(BigQrPoster p0){
       p0 = p0.c;
       if (p0 == null) {
          a.S("posterLayout");
       }
       return p0;
    }
    public static final ImageView p(BigQrPoster p0){
       p0 = p0.b;
       if (p0 == null) {
          a.S("posterPictureView");
       }
       return p0;
    }
    public boolean E(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BigQrPoster.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "activity");
       return d$a.j(this, p0);
    }
    public Paint a(){
       Object obj = PatchProxy.apply(null, this, BigQrPoster.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d$a.e(this);
    }
    public Bitmap b(PainterModel p0,Bitmap p1,int p2,int p3){
       if (PatchProxy.isSupport(BigQrPoster.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, BigQrPoster.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "painterModel");
       a.p(p1, "posterBitmap");
       return d$a.g(this, p0, p1, p2, p3);
    }
    public View c(View p0,int p1){
       BigQrPoster uBigQrPoster = BigQrPoster.class;
       if (PatchProxy.isSupport(uBigQrPoster)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uBigQrPoster, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "view");
       return d$a.a(this, p0, p1);
    }
    public void d(boolean p0){
       this.f = p0;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, BigQrPoster.class, "7")) {
          return;
       }
       try{
          BigQrPoster tg = this.g;
          if (tg != null) {
             tg.recycle();
          }
          this.g = null;
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public Bitmap e(PainterModel$QrContent p0,int p1){
       BigQrPoster uBigQrPoster = BigQrPoster.class;
       if (PatchProxy.isSupport(uBigQrPoster)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uBigQrPoster, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "qrParams");
       return d$a.h(this, p0, p1);
    }
    public void f(PainterModel p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BigQrPoster.class, "18")) {
          return;
       }
       a.p(p0, "painterModel");
       a.p(p1, "error");
       d$a.k(this, p0, p1);
       return;
    }
    public void g(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BigQrPoster.class, "11")) {
          return;
       }
       a.p(p0, "posterView");
       d$a.i(this, p0);
       return;
    }
    public void h(ImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BigQrPoster.class, "16")) {
          return;
       }
       a.p(p0, "imageView");
       d$a.l(this, p0);
       return;
    }
    public Bitmap i(PainterModel$ImageContent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BigQrPoster.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "imageContent");
       return d$a.f(this, p0);
    }
    public ViewGroup j(Activity p0,PosterConfig p1,PainterModel p2,ViewGroup p3,int p4,int p5,boolean p6){
       ViewGroup obj;
       BigQrPoster uBigQrPoster = BigQrPoster.class;
       if (PatchProxy.isSupport(uBigQrPoster)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5),Boolean.valueOf(p6)};
          obj = PatchProxy.apply(objArray, this, uBigQrPoster, "2");
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
          View view = a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d10e2, p3, p6);
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          this.c = view;
       }
       BigQrPoster tc = this.c;
       if (tc == null) {
          a.S("posterLayout");
       }
       this.a = this.c(tc, 0x7f0a31a0);
       tc = this.c;
       if (tc == null) {
          a.S("posterLayout");
       }
       this.b = this.c(tc, 0x7f0a31a3);
       this.v(p5, p4, p0, p1, p2, BigQrPoster$showPosterViewWithSpecifiedSize$3.INSTANCE);
       BigQrPoster tc1 = this.c;
       if (tc1 == null) {
          a.S("posterLayout");
       }
       return tc1;
    }
    public void k(Activity p0,PosterConfig p1,PainterModel p2,View p3){
       boolean b;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, BigQrPoster.class, "1")) {
          return;
       }
       String str = "activity";
       a.p(p0, str);
       a.p(p1, "posterConfig");
       a.p(p2, "painterModel");
       a.p(p3, "viewLayout");
       BigQrPoster$showPosterView$2 obj = PatchProxy.applyOneRefs(p0, this, BigQrPoster.class, "17");
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
                   viewStub.setLayoutResource(R.layout.arg_RES_7f0d10e2);
                   viewStub = viewStub.inflate();
                   Objects.requireNonNull(viewStub, "null cannot be cast to non-null type android.view.ViewGroup");
                   this.c = viewStub;
                   this.a = this.c(viewStub, 0x7f0a31a0);
                   BigQrPoster tc = this.c;
                   if (tc == null) {
                      a.S("posterLayout");
                   }
                   this.b = this.c(tc, 0x7f0a31a3);
                }else {
                   return;
                }
             }
             obj = new BigQrPoster$showPosterView$2(this, view, p0, p1, p2);
             view.getViewTreeObserver().addOnPreDrawListener(b);
          }
          return;
       }
    }
    public Bitmap l(Bitmap p0,PainterModel$QrLayout p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BigQrPoster.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "mQrLayout");
       return d$a.d(this, p0, p1);
    }
    public Bitmap m(View p0,int p1,int p2,Bitmap$Config p3){
       if (PatchProxy.isSupport(BigQrPoster.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, BigQrPoster.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "view");
       a.p(p3, "config");
       return d$a.b(this, p0, p1, p2, p3);
    }
    public Bitmap n(Context p0,PainterModel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BigQrPoster.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       a.p(p1, "painterModel");
       return this.r(p0, p1);
    }
    public final Bitmap q(){
       return this.g;
    }
    public final Bitmap r(Context p0,PainterModel p1){
       Bitmap uBitmap1;
       Bitmap uBitmap2;
       ViewGroup viewGroup1;
       BigQrPoster uBigQrPoster = BigQrPoster.class;
       ImageView obj = PatchProxy.applyTwoRefs(p0, p1, this, uBigQrPoster, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewGroup viewGroup = null;
       View view = LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d00f8, viewGroup);
       view.measure(View$MeasureSpec.makeMeasureSpec(a1.d(R.dimen.arg_RES_7f0700b9), 0x40000000), View$MeasureSpec.makeMeasureSpec(a1.d(R.dimen.arg_RES_7f0700b8), 0x40000000));
       a.o(view, "contentView");
       obj = this.c(view, R.id.qr_code_image);
       PainterModel mQrParams = p1.mQrParams;
       a.o(mQrParams, "painterModel.mQrParams");
       Bitmap uBitmap = this.e(mQrParams, a1.d(R.dimen.arg_RES_7f0700b7));
       if (uBitmap != null) {
          obj.setImageBitmap(uBitmap);
          this.c(view, R.id.title).setText(p1.mImageContent.mTitle);
          this.c(view, R.id.sub_title).setText(p1.mImageContent.mSubTitle);
          SimpleDraweeView simpleDrawee = this.c(view, R.id.poster_icon);
          int i = 1;
          String[] stringArray = new String[i];
          int i1 = 0;
          stringArray[i1] = p1.mImageContent.mIcon;
          uBitmap = KsShareApi.s.e().a(new c(stringArray));
          if (uBitmap != null) {
             uBitmap1 = PatchProxy.applyOneRefs(uBitmap, viewGroup, c.class, "1");
             if (uBitmap1 != PatchProxyResult.class) {
             }else {
                int i2 = q.u(uBitmap.getWidth(), uBitmap.getHeight());
                Bitmap uBitmap3 = Bitmap.createBitmap(i2, i2, uBitmap.getConfig());
                Paint paint = new Paint();
                paint.setAntiAlias(i);
                paint.setShader(new BitmapShader(uBitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
                new Canvas(uBitmap3).drawCircle(((float)i2 / 2.00f), ((float)i2 / 2.00f), ((float)i2 / 2.00f), paint);
                a.o(uBitmap3, "targetBitmap");
                uBitmap1 = uBitmap3;
             }
          }else {
             uBitmap1 = viewGroup;
          }
          simpleDrawee.setImageBitmap(uBitmap1);
          obj = this.c(view, R.id.big_qr_picture);
          PainterModel$ImageContent mImageBytes = p1.mImageContent.mImageBytes;
          mQrParams = (mImageBytes == null || !mImageBytes.length())? 1: null;
          uBitmap = (!mQrParams)? a.a(p1.mImageContent.mImageBytes): viewGroup;
          if (uBitmap == null) {
             PainterModel$ImageContent mImageUrl = p1.mImageContent.mImageUrl;
             c uoc = (mImageUrl == null || !mImageUrl.length())? 1: null;
             if (!uoc) {
                String[] stringArray1 = new String[i];
                stringArray1[i1] = p1.mImageContent.mImageUrl;
                uBitmap = KsShareApi.s.e().a(new c(stringArray1));
             }
          }
          if (uBitmap != null) {
             obj.setImageBitmap(uBitmap);
             int measuredWidt = view.getMeasuredWidth();
             int measuredHeig = view.getMeasuredHeight();
             Bitmap$Config aRGB_8888 = Bitmap$Config.ARGB_8888;
             if (PatchProxy.isSupport(uBigQrPoster)) {
                uBitmap2 = PatchProxy.applyFourRefs(view, Integer.valueOf(measuredWidt), Integer.valueOf(measuredHeig), aRGB_8888, this, BigQrPoster.class, "15");
                if (uBitmap2 != PatchProxyResult.class) {
                label_0175 :
                   return uBitmap2;
                }
             }
             a.p(view, "view");
             a.p(aRGB_8888, "config");
             uBitmap2 = d$a.b(this, view, measuredWidt, measuredHeig, aRGB_8888);
             goto label_0175 ;
          }
       }
       return viewGroup;
    }
    public final b s(){
       return this.d;
    }
    public final void t(b p0){
       this.d = p0;
    }
    public final void u(c p0){
       this.e = p0;
    }
    public final void v(int p0,int p1,Activity p2,PosterConfig p3,PainterModel p4,s p5){
       BigQrPoster a;
       t ot;
       BigQrPoster uBigQrPoster = this;
       int i = p0;
       int i1 = p1;
       object oobject = p2;
       object oobject1 = p3;
       object oobject2 = p4;
       object oobject3 = p5;
       BigQrPoster uBigQrPoster1 = BigQrPoster.class;
       int i2 = 0;
       if (PatchProxy.isSupport(uBigQrPoster1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),oobject,oobject1,oobject2,oobject3};
          if (PatchProxy.applyVoid(objArray, this, uBigQrPoster1, "3")) {
             return;
          }
       }
       if (i > 0 && i1 > 0) {
          PosterConfig mPosterLayou = oobject1.mPosterLayout;
          PosterConfig$PosterLayout posterLayout = null;
          PosterConfig$PosterLayout mTopMargin = (mPosterLayou != null)? mPosterLayou.mTopMargin: 0;
          int i3 = n.c(oobject, mTopMargin);
          PosterConfig mPosterLayou1 = oobject1.mPosterLayout;
          if (mPosterLayou1 != null) {
             posterLayout = mPosterLayou1.mBottomMargin;
          }
          int i4 = n.c(oobject, posterLayout);
          int i5 = (i1 - i3) - i4;
          BigQrPoster c = uBigQrPoster.c;
          String str = "posterLayout";
          if (c == null) {
             a.S(str);
          }
          BigQrPoster c1 = uBigQrPoster.c;
          if (c1 == null) {
             a.S(str);
          }
          ViewGroup$LayoutParams layoutParams = c1.getLayoutParams();
          layoutParams.width = i;
          layoutParams.height = i1;
          c.setLayoutParams(layoutParams);
          a = uBigQrPoster.a;
          String str1 = "bigQrLayout";
          if (a == null) {
             a.S(str1);
          }
          ViewGroup$LayoutParams layoutParams1 = a.getLayoutParams();
          Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
          layoutParams1.setMargins(i2, i3, i2, i4);
          BigQrPoster a1 = uBigQrPoster.a;
          if (a1 == null) {
             a.S(str1);
          }
          a1.setLayoutParams(layoutParams1);
          if (PatchProxy.isSupport(uBigQrPoster1)) {
             ot = PatchProxy.applyFourRefs(p2, p4, Integer.valueOf(p0), Integer.valueOf(i5), this, BigQrPoster.class, "4");
             if (ot != PatchProxyResult.class) {
             label_00df :
                ot.subscribe(new BigQrPoster$a(this, oobject3, p0, i5), new BigQrPoster$b(this, oobject2));
             }
          }
          b uob = new b(this, p2, p4, p0, i5);
          ot = t.create(layoutParams).subscribeOn(b.d()).observeOn(a.c());
          a.o(ot, "Observable.create<Bitmap¡­dSchedulers.mainThread\(\)\)");
          goto label_00df ;
       }else {
          e.b(e.a, 0, "big qr poster width height error! width:"+p0+" height:"+i1, 0, 5, 0);
       }
       return;
    }
}
