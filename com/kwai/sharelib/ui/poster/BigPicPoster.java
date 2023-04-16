package com.kwai.sharelib.ui.poster.BigPicPoster;
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
import com.kwai.sharelib.ui.poster.BigPicPoster$showPosterViewWithSpecifiedSize$3;
import msd.s;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import com.kwai.sharelib.ui.poster.BigPicPoster$showPosterView$2;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.sharelib.model.PainterModel$QrLayout;
import android.graphics.Bitmap$Config;
import lnc.a1;
import android.view.View$MeasureSpec;
import android.widget.TextView;
import java.lang.CharSequence;
import jp7.a;
import com.kwai.sharelib.KsShareApi;
import uo7.s;
import zo7.c;
import yo7.b;
import mp7.c;
import com.kwai.sharelib.model.PosterConfig$PosterLayout;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import qrd.l1;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import brd.t;
import np7.a;
import io.reactivex.g;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import com.kwai.sharelib.ui.poster.BigPicPoster$a;
import com.kwai.sharelib.ui.poster.BigPicPoster$b;
import erd.g;
import crd.b;
import au6.e;
import java.lang.StringBuilder;

public final class BigPicPoster implements a, d	// class@001713
{
    public View a;
    public ImageView b;
    public ViewGroup c;
    public b d;
    public c e;
    public boolean f;
    public Bitmap g;

    public void BigPicPoster(){
       super();
    }
    public static final ViewGroup o(BigPicPoster p0){
       p0 = p0.c;
       if (p0 == null) {
          a.S("posterLayout");
       }
       return p0;
    }
    public static final ImageView p(BigPicPoster p0){
       p0 = p0.b;
       if (p0 == null) {
          a.S("posterPictureView");
       }
       return p0;
    }
    public boolean E(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BigPicPoster.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "activity");
       return d$a.j(this, p0);
    }
    public Paint a(){
       Object obj = PatchProxy.apply(null, this, BigPicPoster.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d$a.e(this);
    }
    public Bitmap b(PainterModel p0,Bitmap p1,int p2,int p3){
       if (PatchProxy.isSupport(BigPicPoster.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, BigPicPoster.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "painterModel");
       a.p(p1, "posterBitmap");
       return d$a.g(this, p0, p1, p2, p3);
    }
    public View c(View p0,int p1){
       BigPicPoster uBigPicPoste = BigPicPoster.class;
       if (PatchProxy.isSupport(uBigPicPoste)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uBigPicPoste, "11");
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
       if (PatchProxy.applyVoid(null, this, BigPicPoster.class, "8")) {
          return;
       }
       try{
          BigPicPoster tg = this.g;
          if (tg != null) {
             tg.recycle();
          }
          this.g = null;
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public Bitmap e(PainterModel$QrContent p0,int p1){
       BigPicPoster uBigPicPoste = BigPicPoster.class;
       if (PatchProxy.isSupport(uBigPicPoste)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uBigPicPoste, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "qrParams");
       return d$a.h(this, p0, p1);
    }
    public void f(PainterModel p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BigPicPoster.class, "18")) {
          return;
       }
       a.p(p0, "painterModel");
       a.p(p1, "error");
       d$a.k(this, p0, p1);
       return;
    }
    public void g(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BigPicPoster.class, "12")) {
          return;
       }
       a.p(p0, "posterView");
       d$a.i(this, p0);
       return;
    }
    public void h(ImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BigPicPoster.class, "16")) {
          return;
       }
       a.p(p0, "imageView");
       d$a.l(this, p0);
       return;
    }
    public Bitmap i(PainterModel$ImageContent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BigPicPoster.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "imageContent");
       return d$a.f(this, p0);
    }
    public ViewGroup j(Activity p0,PosterConfig p1,PainterModel p2,ViewGroup p3,int p4,int p5,boolean p6){
       ViewGroup obj;
       BigPicPoster uBigPicPoste = BigPicPoster.class;
       if (PatchProxy.isSupport(uBigPicPoste)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5),Boolean.valueOf(p6)};
          obj = PatchProxy.apply(objArray, this, uBigPicPoste, "2");
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
       BigPicPoster tc = this.c;
       if (tc == null) {
          a.S("posterLayout");
       }
       this.a = this.c(tc, 0x7f0a31a0);
       tc = this.c;
       if (tc == null) {
          a.S("posterLayout");
       }
       this.b = this.c(tc, 0x7f0a31a3);
       this.v(p5, p4, p0, p1, p2, BigPicPoster$showPosterViewWithSpecifiedSize$3.INSTANCE);
       BigPicPoster tc1 = this.c;
       if (tc1 == null) {
          a.S("posterLayout");
       }
       return tc1;
    }
    public void k(Activity p0,PosterConfig p1,PainterModel p2,View p3){
       boolean b;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, BigPicPoster.class, "1")) {
          return;
       }
       String str = "activity";
       a.p(p0, str);
       a.p(p1, "posterConfig");
       a.p(p2, "painterModel");
       a.p(p3, "viewLayout");
       BigPicPoster$showPosterView$2 obj = PatchProxy.applyOneRefs(p0, this, BigPicPoster.class, "17");
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
                   BigPicPoster tc = this.c;
                   if (tc == null) {
                      a.S("posterLayout");
                   }
                   this.b = this.c(tc, 0x7f0a31a3);
                }else {
                   return;
                }
             }
             obj = new BigPicPoster$showPosterView$2(this, view, p0, p1, p2);
             view.getViewTreeObserver().addOnPreDrawListener(b);
          }
          return;
       }
    }
    public Bitmap l(Bitmap p0,PainterModel$QrLayout p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BigPicPoster.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "mQrLayout");
       d$a.d(this, p0, p1);
       if (p0 != null) {
          return p0;
       }
       return null;
    }
    public Bitmap m(View p0,int p1,int p2,Bitmap$Config p3){
       if (PatchProxy.isSupport(BigPicPoster.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, BigPicPoster.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "view");
       a.p(p3, "config");
       return d$a.b(this, p0, p1, p2, p3);
    }
    public Bitmap n(Context p0,PainterModel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BigPicPoster.class, "6");
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
       ViewGroup viewGroup1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BigPicPoster uBigPicPoste = BigPicPoster.class;
       ImageView obj = PatchProxy.applyTwoRefs(p0, p1, this, uBigPicPoste, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       ViewGroup viewGroup = null;
       View view = LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d00f7, viewGroup);
       view.measure(View$MeasureSpec.makeMeasureSpec(a1.d(R.dimen.arg_RES_7f0700b5), 0x40000000), View$MeasureSpec.makeMeasureSpec(a1.d(R.dimen.arg_RES_7f0700b4), 0x40000000));
       a.o(view, "contentView");
       obj = this.c(view, R.id.qr_code_image);
       PainterModel mQrParams = p1.mQrParams;
       a.o(mQrParams, "painterModel.mQrParams");
       Bitmap uBitmap = this.e(mQrParams, a1.d(R.dimen.arg_RES_7f0700b7));
       if (uBitmap != null) {
          obj.setImageBitmap(uBitmap);
          this.c(view, R.id.title).setText(p1.mImageContent.mTitle);
          this.c(view, R.id.sub_title).setText(p1.mImageContent.mSubTitle);
          obj = this.c(view, R.id.big_image);
          PainterModel$ImageContent mImageBytes = p1.mImageContent.mImageBytes;
          int i = 0;
          int i1 = 1;
          mQrParams = (mImageBytes == null || !mImageBytes.length())? 1: null;
          uBitmap = (!mQrParams)? a.a(p1.mImageContent.mImageBytes): viewGroup;
          if (uBitmap == null) {
             PainterModel$ImageContent mImageUrl = p1.mImageContent.mImageUrl;
             c uoc = (mImageUrl == null || !mImageUrl.length())? 1: null;
             if (!uoc) {
                String[] stringArray = new String[i1];
                stringArray[i] = p1.mImageContent.mImageUrl;
                uBitmap = KsShareApi.s.e().a(new c(stringArray));
             }
          }
          if (uBitmap != null) {
             obj.setImageBitmap(uBitmap);
             int measuredWidt = view.getMeasuredWidth();
             int measuredHeig = view.getMeasuredHeight();
             Bitmap$Config aRGB_8888 = Bitmap$Config.ARGB_8888;
             if (PatchProxy.isSupport(uBigPicPoste)) {
                uBitmap1 = PatchProxy.applyFourRefs(view, Integer.valueOf(measuredWidt), Integer.valueOf(measuredHeig), aRGB_8888, this, BigPicPoster.class, "15");
                if (uBitmap1 != patchProxyRe) {
                label_0108 :
                   return uBitmap1;
                }
             }
             a.p(view, "view");
             a.p(aRGB_8888, "config");
             uBitmap1 = d$a.b(this, view, measuredWidt, measuredHeig, aRGB_8888);
             goto label_0108 ;
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
       BigPicPoster a;
       t ot;
       BigPicPoster uBigPicPoste = this;
       int i = p0;
       int i1 = p1;
       object oobject = p2;
       object oobject1 = p3;
       object oobject2 = p4;
       object oobject3 = p5;
       BigPicPoster uBigPicPoste1 = BigPicPoster.class;
       int i2 = 0;
       if (PatchProxy.isSupport(uBigPicPoste1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),oobject,oobject1,oobject2,oobject3};
          if (PatchProxy.applyVoid(objArray, this, uBigPicPoste1, "3")) {
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
          BigPicPoster c = uBigPicPoste.c;
          String str = "posterLayout";
          if (c == null) {
             a.S(str);
          }
          BigPicPoster c1 = uBigPicPoste.c;
          if (c1 == null) {
             a.S(str);
          }
          ViewGroup$LayoutParams layoutParams = c1.getLayoutParams();
          layoutParams.width = i;
          layoutParams.height = i1;
          c.setLayoutParams(layoutParams);
          a = uBigPicPoste.a;
          String str1 = "bigPicLayout";
          if (a == null) {
             a.S(str1);
          }
          ViewGroup$LayoutParams layoutParams1 = a.getLayoutParams();
          Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
          layoutParams1.setMargins(i2, i3, i2, i4);
          BigPicPoster a1 = uBigPicPoste.a;
          if (a1 == null) {
             a.S(str1);
          }
          a1.setLayoutParams(layoutParams1);
          if (PatchProxy.isSupport(uBigPicPoste1)) {
             ot = PatchProxy.applyFourRefs(p2, p4, Integer.valueOf(p0), Integer.valueOf(i5), this, BigPicPoster.class, "4");
             if (ot != PatchProxyResult.class) {
             label_00df :
                ot.subscribe(new BigPicPoster$a(this, oobject3, p0, i5), new BigPicPoster$b(this, oobject2));
             }
          }
          a uoa = new a(this, p2, p4, p0, i5);
          ot = t.create(layoutParams).subscribeOn(b.d()).observeOn(a.c());
          a.o(ot, "Observable.create<Bitmap¡­dSchedulers.mainThread\(\)\)");
          goto label_00df ;
       }else {
          e.b(e.a, 0, "big pic poster width height error! width:"+p0+" height:"+i1, 0, 5, 0);
       }
       return;
    }
}
