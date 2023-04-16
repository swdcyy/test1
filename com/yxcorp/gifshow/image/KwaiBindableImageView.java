package com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import android.content.Context;
import com.yxcorp.image.request.cdntransform.IImageCDNTransformer$CDNResizeMode;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.Bitmap;
import kd.b;
import e0d.h;
import e0d.d;
import ll8.c$b;
import android.content.res.TypedArray;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import ub.b;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import java.lang.Boolean;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.d;
import com.yxcorp.image.request.a;
import com.yxcorp.image.request.cdntransform.c;
import s0d.a;
import uc.e;
import java.util.Objects;
import s0d.e;
import java.lang.Iterable;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import s0d.f;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.DraweeView;
import ac.b;
import yb.a;
import xb.t$b;
import pb.c;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import yb.b;
import yb.c;
import k0d.a;
import android.graphics.drawable.ColorDrawable;
import androidx.core.content.ContextCompat;
import l0d.c;
import zc.a;
import n0d.f;
import ac.d;
import com.facebook.common.internal.ImmutableList;
import java.io.File;
import android.net.Uri$Builder;

public class KwaiBindableImageView extends SimpleDraweeView	// class@001944
{
    public Integer j;
    public PaintFlagsDrawFilter k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public String r;
    public IImageCDNTransformer$CDNResizeMode s;
    public Context t;
    public static final String u;

    static {
       KwaiBindableImageView.u = "KwaiBindableImageView";
    }
    public void KwaiBindableImageView(Context p0){
       super(p0);
       this.o = false;
       this.p = 0;
       this.q = 0;
       this.r = null;
       this.s = IImageCDNTransformer$CDNResizeMode.NONE;
       this.t = null;
       this.r(p0, null);
    }
    public void KwaiBindableImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.o = false;
       this.p = 0;
       this.q = 0;
       this.r = null;
       this.s = IImageCDNTransformer$CDNResizeMode.NONE;
       this.t = null;
       this.r(p0, p1);
    }
    public void KwaiBindableImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.o = false;
       this.p = 0;
       this.q = 0;
       this.r = null;
       this.s = IImageCDNTransformer$CDNResizeMode.NONE;
       this.t = null;
       this.r(p0, p1);
    }
    private void m0(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiBindableImageView.class, "12")) {
          return;
       }
       if (p0 instanceof BitmapDrawable) {
          DisplayMetrics densityDpi = c.c(this.getContext().getApplicationContext().getResources()).densityDpi;
          Bitmap bitmap = p0.getBitmap();
          if (bitmap != null) {
             bitmap.setDensity(densityDpi);
          }
       }
       return;
    }
    private void r(Context p0,AttributeSet p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiBindableImageView.class, "1")) {
          return;
       }
       if (b.d()) {
          b.a("KwaiBindableImageView#init");
       }
       d a = h.a;
       b = false;
       boolean b1 = (a == null || a.s != null)? true: false;
       this.m = b1;
       this.t = p0;
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.d5);
          if (typedArray.hasValue(16) || typedArray.hasValue(26)) {
             b = true;
          }
          this.l = b;
          typedArray.recycle();
       }
       this.setTag(R.id.view_status_tag, "invalid");
       if (b.d()) {
          b.b();
       }
       return;
    }
    public ImageRequest A(Uri p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiBindableImageView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiBindableImageView.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.B(p0, p1, p2, null);
    }
    public ImageRequest B(Uri p0,int p1,int p2,b p3){
       return this.D(p0, p1, p2, false, p3, null);
    }
    public ImageRequest C(Uri p0,int p1,int p2,boolean p3,b p4){
       ImageRequest imageRequest = this.K(p0, p1, p2, p3);
       this.setController(this.f0(p4, null, imageRequest).e());
       return imageRequest;
    }
    public ImageRequest D(Uri p0,int p1,int p2,boolean p3,b p4,Object p5){
       if (PatchProxy.isSupport(KwaiBindableImageView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),p4,p5};
          Object obj = PatchProxy.apply(objArray, this, KwaiBindableImageView.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ImageRequest imageRequest = this.K(p0, p1, p2, p3);
       this.setController(this.f0(p4, p5, imageRequest).e());
       return imageRequest;
    }
    public ImageRequest E(Uri p0,Object p1,int p2,int p3,b p4){
       if (PatchProxy.isSupport(KwaiBindableImageView.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, KwaiBindableImageView.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.D(p0, p2, p3, false, p4, p1);
    }
    public void F(Uri p0,int p1,int p2,c p3,b p4){
       ImageRequestBuilder imageRequest = ImageRequestBuilder.k(p0);
       imageRequest.r(p3);
       if (p1 > 0 && p2 > 0) {
          imageRequest.v(new d(p1, p2));
       }
       this.setController(this.f0(p4, null, imageRequest.a()).e());
       return;
    }
    public void G(Uri p0,int p1,int p2,c p3,b p4,Object p5){
       if (PatchProxy.isSupport(KwaiBindableImageView.class)) {
          p5 = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4,null};
          if (PatchProxy.applyVoid(p5, this, KwaiBindableImageView.class, "24")) {
             return;
          }
       }
       ImageRequestBuilder imageRequest = ImageRequestBuilder.k(p0);
       imageRequest.r(p3);
       if (p1 > 0 && p2 > 0) {
          imageRequest.v(new d(p1, p2));
       }
       this.setController(this.f0(p4, null, imageRequest.a()).e());
       return;
    }
    public void H(Uri p0,c p1,b p2){
       ImageRequestBuilder imageRequest = ImageRequestBuilder.k(p0);
       imageRequest.r(p1);
       this.setController(this.f0(p2, null, imageRequest.a()).e());
    }
    public void I(Uri p0,c p1,b p2,Object p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, KwaiBindableImageView.class, "23")) {
          return;
       }
       ImageRequestBuilder imageRequest = ImageRequestBuilder.k(p0);
       imageRequest.r(p1);
       this.setController(this.f0(p2, p3, imageRequest.a()).e());
       return;
    }
    public ImageRequest J(Uri p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiBindableImageView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiBindableImageView.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.K(p0, p1, p2, false);
    }
    public ImageRequest K(Uri p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(KwaiBindableImageView.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, KwaiBindableImageView.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a uoa = a.t(p0);
       if (this.o != null) {
          uoa.h(this.getCdnOperation());
       }
       if (p1 > 0 && p2 > 0) {
          uoa.p(new d(p1, p2));
       }
       KwaiBindableImageView tj = this.j;
       if (tj != null && tj.intValue() > -1) {
          e uoe = e.d(this.j.intValue());
          Objects.requireNonNull(uoa);
          if (PatchProxy.applyOneRefs(uoe, uoa, a.class, "12") != PatchProxyResult.class) {
          }else {
             uoa.a.w(uoe);
          }
       }
       uoa.x(p3);
       return uoa.q();
    }
    public void L(String p0){
       if (p0 == null) {
          this.i0();
       }else {
          this.B(Uri.parse(p0), 0, 0, null);
       }
       return;
    }
    public void M(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiBindableImageView.class, "15")) {
          return;
       }
       if (p0 == null) {
          this.i0();
       }else {
          this.E(Uri.parse(p0), p1, 0, 0, null);
       }
       return;
    }
    public void N(Iterable p0,Object p1,b p2){
       Object this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiBindableImageView.class, "32")) {
          return;
       }
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, KwaiBindableImageView.class, "35");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next());
          }
       }
       this = uArrayList;
       this.d0(this, 0, 0, false, null, p1, p2);
       return;
    }
    public void O(Iterable p0,b p1){
       this.N(p0, null, null);
    }
    public void P(List p0){
       this.T(p0, false);
    }
    public void Q(List p0,int p1,int p2,c p3,Object p4,b p5){
       if (PatchProxy.isSupport(KwaiBindableImageView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, KwaiBindableImageView.class, "34")) {
             return;
          }
       }
       this.d0(p0, p1, p2, false, p3, p4, p5);
       return;
    }
    public void R(List p0,int p1,int p2,c p3,b p4){
       this.d0(p0, p1, p2, false, p3, null, p4);
    }
    public void S(List p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiBindableImageView.class, "26")) {
          return;
       }
       if (!PatchProxy.isSupport(KwaiBindableImageView.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.FALSE, this, KwaiBindableImageView.class, "27")) {
          CDNUrl[] uCDNUrlArray = new CDNUrl[0];
          CDNUrl[] uCDNUrlArray1 = p0.toArray(uCDNUrlArray);
          if (!PatchProxy.isSupport(KwaiBindableImageView.class) || !PatchProxy.applyVoidThreeRefs(uCDNUrlArray1, p1, Boolean.FALSE, this, KwaiBindableImageView.class, "28")) {
             this.d0(this.j0(uCDNUrlArray1), 0, 0, false, null, p1, null);
          }
       }
       return;
    }
    public void T(List p0,boolean p1){
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       this.c0(p0.toArray(uCDNUrlArray), p1);
    }
    public void U(CDNUrl[] p0){
       this.a0(p0, null);
    }
    public void V(CDNUrl[] p0,int p1,int p2){
       this.Z(p0, null, null, p1, p2);
    }
    public void W(CDNUrl[] p0,int p1,int p2,Object p3){
       if (PatchProxy.isSupport(KwaiBindableImageView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, KwaiBindableImageView.class, "30")) {
          return;
       }
       this.Z(p0, p3, null, p1, p2);
       return;
    }
    public void X(CDNUrl[] p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiBindableImageView.class, "29")) {
          return;
       }
       this.Y(p0, p1, null);
       return;
    }
    public void Y(CDNUrl[] p0,Object p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiBindableImageView.class, "31")) {
          return;
       }
       this.Z(p0, p1, p2, 0, 0);
       return;
    }
    public void Z(CDNUrl[] p0,Object p1,b p2,int p3,int p4){
       if (PatchProxy.isSupport(KwaiBindableImageView.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, KwaiBindableImageView.class, "33")) {
             return;
          }
       }
       this.Q(this.j0(p0), p3, p4, null, p1, p2);
       return;
    }
    public void a0(CDNUrl[] p0,b p1){
       this.b0(p0, p1, 0, 0);
    }
    public void b0(CDNUrl[] p0,b p1,int p2,int p3){
       this.Q(this.j0(p0), p2, p3, null, null, p1);
    }
    public void c0(CDNUrl[] p0,boolean p1){
       this.d0(this.j0(p0), 0, 0, p1, null, null, null);
    }
    public final void d0(Collection p0,int p1,int p2,boolean p3,c p4,Object p5,b p6){
       if (PatchProxy.isSupport(KwaiBindableImageView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, this, KwaiBindableImageView.class, "37")) {
             return;
          }
       }
       if (p0.isEmpty()) {
          this.i0();
          return;
       }else {
          f uof = f.x();
          f uof1 = uof.u(p0).o(p1, p2);
          uof1.y(p3);
          uof1.l(p4);
          if (this.o != null) {
             uof.h(this.getCdnOperation());
          }
          d uod = this.g0(p6, p5, uof.w());
          a uoa = (uod == null)? null: uod.e();
          this.setController(uoa);
          return;
       }
    }
    public d e0(b p0,ImageRequest p1){
       d uod = Fresco.newDraweeControllerBuilder();
       uod.y(this.getController());
       uod.w(p1);
       uod.s(this.k0(p0));
       return uod;
    }
    public d f0(b p0,Object p1,ImageRequest p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KwaiBindableImageView.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p1 = Fresco.newDraweeControllerBuilder().r(p1);
       p1.y(this.getController());
       p1.w(p2);
       p1.s(this.k0(p0));
       return p1;
    }
    public d g0(b p0,Object p1,ImageRequest[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KwaiBindableImageView.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2.length > 0) {
          p1 = Fresco.newDraweeControllerBuilder().r(p1);
          p1.y(this.getController());
          p1.s(this.k0(p0));
          p1.v(p2, true);
       }else {
          p1 = null;
       }
       return p1;
    }
    public final c getCdnOperation(){
       String str;
       IImageCDNTransformer$CDNResizeMode nONE;
       KwaiBindableImageView obj = PatchProxy.apply(null, this, KwaiBindableImageView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       d a = h.a;
       a = (a != null && a.B != null)? 1: 0;
       if (!a && obj == null) {
          str = "webp";
       }
       KwaiBindableImageView kwaiBindable = str;
       t$b uob = this.getHierarchy().l();
       if (uob == null) {
          uob = t$b.i;
       }
       t$b uob1 = uob;
       obj = this.s;
       if (obj == null) {
          nONE = IImageCDNTransformer$CDNResizeMode.NONE;
       }
       c uoc = new c(this.p, this.q, uob1, kwaiBindable, nONE);
       return nONE;
    }
    public ImageRequest h0(Uri p0,int p1,int p2,ImageRequest p3){
       if (PatchProxy.isSupport(KwaiBindableImageView.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, KwaiBindableImageView.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ImageRequest imageRequest = this.J(p0, p1, p2);
       if (p3 != null) {
          d uod = Fresco.newDraweeControllerBuilder();
          uod.x(p3);
          uod.w(imageRequest);
          uod.y(this.getController());
          this.setController(uod.e());
       }
       return imageRequest;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, KwaiBindableImageView.class, "10")) {
          return;
       }
       this.setController(null);
       return;
    }
    public final List j0(CDNUrl[] p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, KwaiBindableImageView.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p0 == null) {
          return obj;
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          obj.add(p0[i].getUrl());
       }
       return obj;
    }
    public b k0(b p0){
       return p0;
    }
    public void l0(boolean p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiBindableImageView.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiBindableImageView.class, "13")) {
          return;
       }
       if (!PatchProxy.isSupport(KwaiBindableImageView.class) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, this, KwaiBindableImageView.class, "14")) {
          this.o = p0;
          this.p = p1;
          this.q = p2;
          this.r = null;
          this.s = null;
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiBindableImageView.class, "2")) {
          return;
       }
       if (this.l != null || (this.n != null && (this.m != null && Build$VERSION.SDK_INT >= 28))) {
          if (this.k == null) {
             this.k = new PaintFlagsDrawFilter(0, 3);
          }
          p0.setDrawFilter(this.k);
       }
    label_002f :
       super.onDraw(p0);
       return;
    }
    public void q(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiBindableImageView.class, "11")) {
          return;
       }
       if (b.d()) {
          b.a("KwaiBindableImageView#inflateHierarchy");
       }
       b uob = c.d(p0, p1);
       this.m0(uob.e());
       this.m0(uob.c());
       this.setAspectRatio(uob.b());
       this.setHierarchy(uob.a());
       if (b.d()) {
          b.b();
       }
       return;
    }
    public void setController(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiBindableImageView.class, "44")) {
          return;
       }
       if (p0 instanceof AbstractDraweeController) {
          p0.addControllerListener(new a(this));
       }
       super.setController(p0);
       return;
    }
    public void setDoAntiAliasing(boolean p0){
       this.n = p0;
    }
    public void setFailureImage(int p0){
       if (PatchProxy.isSupport(KwaiBindableImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiBindableImageView.class, "5")) {
          return;
       }
       this.setFailureImage(this.getResources().getDrawable(p0));
       return;
    }
    public void setFailureImage(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiBindableImageView.class, "6")) {
          return;
       }
       this.getHierarchy().A(p0);
       this.m0(p0);
       return;
    }
    public void setImageRotation(int p0){
       if (PatchProxy.isSupport(KwaiBindableImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiBindableImageView.class, "9")) {
          return;
       }
       this.j = Integer.valueOf(p0);
       return;
    }
    public void setOverlayColor(int p0){
       if (PatchProxy.isSupport(KwaiBindableImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiBindableImageView.class, "8")) {
          return;
       }
       this.getHierarchy().C(new ColorDrawable(ContextCompat.getColor(this.getContext(), p0)));
       return;
    }
    public void setOverlayImage(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiBindableImageView.class, "7")) {
          return;
       }
       this.getHierarchy().C(p0);
       return;
    }
    public void setPlaceHolderImage(int p0){
       if (PatchProxy.isSupport(KwaiBindableImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiBindableImageView.class, "3")) {
          return;
       }
       this.setPlaceHolderImage(this.getResources().getDrawable(p0));
       return;
    }
    public void setPlaceHolderImage(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiBindableImageView.class, "4")) {
          return;
       }
       this.getHierarchy().F(p0);
       this.m0(p0);
       return;
    }
    public void t(Uri p0,Object p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiBindableImageView.class, "45")) {
          return;
       }
       if (this.t == null) {
          this.t = this.getContext();
       }
       a obj = PatchProxy.applyOneRefs(p0, this, KwaiBindableImageView.class, "46");
       int i = 1;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(h.a().a(this.t, p0) == null){
          obj = this.getController();
          if (obj != null) {
             if (obj instanceof f) {
                f v = obj.v;
                if (v != null && !v.isEmpty()) {
                label_004f :
                   b = false;
                }
             }
          }
          b = true;
       }
       if (!b) {
          super.t(p0, p1);
          return;
       }else {
          p1 = this.getControllerBuilder().r(p1).c(p0).d(this.getController()).build();
          if (p1 instanceof c) {
             a[] uoaArray = new a[i];
             uoaArray[0] = h.a().a(this.t, p0);
             p1.i(ImmutableList.of(uoaArray));
          }
          this.setController(p1);
          return;
       }
    }
    public void v(File p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiBindableImageView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiBindableImageView.class, "38")) {
          return;
       }
       this.w(p0, p1, p2, null);
       return;
    }
    public void w(File p0,int p1,int p2,b p3){
       if (PatchProxy.isSupport(KwaiBindableImageView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, KwaiBindableImageView.class, "39")) {
          return;
       }
       this.B(Uri.fromFile(p0), p1, p2, p3);
       return;
    }
    public void x(File p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiBindableImageView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiBindableImageView.class, "40")) {
          return;
       }
       d uod = this.f0(null, null, this.J(Uri.fromFile(p0), p1, p2));
       uod.q(true);
       this.setController(uod.e());
       return;
    }
    public void y(int p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiBindableImageView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiBindableImageView.class, "41")) {
          return;
       }
       this.A(new Uri$Builder().scheme("res").path(String.valueOf(p0)).build(), p1, p2);
       return;
    }
    public void z(int p0,int p1,int p2,c p3,b p4){
       this.G(new Uri$Builder().scheme("res").path(String.valueOf(p0)).build(), p1, p2, p3, null, null);
    }
}
