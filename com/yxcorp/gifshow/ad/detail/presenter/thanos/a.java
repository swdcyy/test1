package com.yxcorp.gifshow.ad.detail.presenter.thanos.a;
import i19.k;
import android.graphics.RectF;
import lnc.a1;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo;
import java.lang.StringBuilder;
import yx.j0;
import android.view.ViewTreeObserver;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Float;
import i19.f;
import msd.r;
import i19.g;
import i19.h;
import im8.f;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends k	// class@0016bf
{
    public final boolean A;
    public View B;
    public KwaiImageView C;
    public View D;
    public View E;
    public View F;
    public View G;
    public PhotoDisplayLocationInfo H;
    public final ViewTreeObserver$OnGlobalLayoutListener I;
    public f z;
    public static final RectF J;
    public static final int K;

    static {
       a.J = new RectF();
       a.K = a1.e(50.00f);
    }
    public void a(){
       super();
       this.A = a.t().d("disableCommentWindowAnim", false);
       this.I = new a$a(this);
    }
    public static RectF Z8(a p0,RectF p1,float p2,float p3,float p4){
       return p0.b9(p1, p2, p3, p4);
    }
    public void E8(){
       boolean b1;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(objArray, this, uoa, "4");
       boolean b = true;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          PhotoAdvertisement obj1 = PatchProxy.apply(objArray, this, uoa, "5");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             obj1 = k.B(this.s);
             b1 = (obj1 != null && obj1.mSourceType == 32)? true: false;
          }
          if (b1 && a.t().d("disableBrandAdSmallWindow", 0)) {
             b = false;
          }
       }
       if (!b) {
          return;
       }else {
          super.E8();
          uoa = this.H;
          if (uoa == null || !uoa.isValid()) {
             this.H = this.a9();
          }
          objArray = new Object[0];
          j0.f("AdVideoSmallWindowPresenter", "adapt photoDisplayLocationInfo left:"+this.H.mLeftRatio+" top:"+this.H.mTopRatio+" width:"+this.H.mWidthRatio+" height:"+this.H.mHeightRatio, objArray);
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       super.J8();
       a tD = this.D;
       if (tD != null) {
          tD.getViewTreeObserver().removeOnGlobalLayoutListener(this.I);
       }
       return;
    }
    public void P8(float p0,float p1,float p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, a.class, "7")) {
          return;
       }
       a tB = this.B;
       k ok = this;
       float f = p0;
       ok.R8(tB, tB, this.x, this.y, f, new f(this));
       tB = this.D;
       ok.R8(tB, tB, this.x, this.y, f, new g(this));
       a tC = this.C;
       a tB1 = (this.s.isVideoType())? this.B: this.C;
       this.R8(tC, tB1, this.x, this.y, p0, new f(this));
       float f1 = 0x3f800000;
       if (this.A == null && (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, a.class, "13"))) {
          tB = this.E;
          this.S8(tB, tB, this.x, this.y, p0, new h(this), true);
          if (!p0) {
             this.z.set(Float.valueOf(f1));
          }
          this.E.setAlpha((f1 - p0));
       }
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, a.class, "11")) {
          tB1 = this.F;
          if (tB1 != null && !tB1.getVisibility()) {
             this.F.setAlpha((f1 - p0));
          }
       }
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, a.class, "12")) {
          tB1 = this.G;
          if (tB1 != null && !tB1.getVisibility()) {
             this.G.setTranslationY((- ((float)a.K * p0)));
          }
       }
       return;
    }
    public void Y8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "15")) {
          return;
       }
       super.Y8();
       a tF = this.F;
       if (tF != null && !tF.getVisibility()) {
          this.F.setAlpha(0x3f800000);
       }
       tF = this.G;
       if (tF != null && !tF.getVisibility()) {
          this.G.setTranslationY(0);
       }
       if (this.A == null && !PatchProxy.applyVoid(objArray, this, uoa, "16")) {
          this.E.setAlpha(0x3f800000);
          this.X8(this.E);
          this.z.set(Float.valueOf(0x3f800000));
       }
       return;
    }
    public final PhotoDisplayLocationInfo a9(){
       PhotoDisplayLocationInfo obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhotoDisplayLocationInfo();
       obj.mTopRatio = 0;
       obj.mLeftRatio = 0;
       obj.mWidthRatio = 0x3f800000;
       obj.mHeightRatio = 0x3f800000;
       return obj;
    }
    public final RectF b9(RectF p0,float p1,float p2,float p3){
       RectF obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, a.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.J;
       obj.setEmpty();
       if (this.H == null) {
          this.H = this.a9();
       }
       a tH = this.H;
       PhotoDisplayLocationInfo mWidthRatio = tH.mWidthRatio;
       float f = p1 / mWidthRatio;
       float f1 = p2 / tH.mHeightRatio;
       float f2 = 0x3f800000;
       if (((mWidthRatio * p0.width()) / (this.H.mHeightRatio * p0.height())) - (p1 / p2) > 0) {
          obj.left = (p0.left * (f2 - p3)) + ((- (this.H.mLeftRatio * f)) * p3);
          p1 = (float)(int)(p0.height() * (f / p0.width()));
          a tH1 = this.H;
          RectF top = p0.top;
          obj.top = top - (((float)(int)((tH1.mTopRatio * p1) - ((p2 - (tH1.mHeightRatio * p1)) / 2.00f)) + top) * p3);
          obj.right = obj.left + (p0.width() - ((p0.width() - f) * p3));
          obj.bottom = obj.top + (p0.height() / (p0.width() / obj.width()));
       }else {
          float f3 = (p0.top * (f2 - p3)) + ((- (this.H.mTopRatio * f1)) * p3);
          obj.top = f3;
          obj.bottom = (f3 + p0.height()) - ((p0.height() - f1) * p3);
          float f4 = (float)(int)(p0.width() / (p0.height() / obj.height()));
          p1 = (p1 - f4) / 2.00f;
          obj.left = p1;
          obj.right = p1 + f4;
       }
       Object[] objArray = new Object[0];
       j0.a("AdVideoSmallWindowPresenter", "video rect is : "+obj, objArray);
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a3120);
       this.C = m1.f(p0, 0x7f0a319f);
       this.D = m1.f(p0, 0x7f0a3e7f);
       this.E = m1.f(p0, 0x7f0a30cf);
       this.F = m1.f(p0, 0x7f0a3a04);
       this.G = m1.f(p0, 0x7f0a39c5);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       this.H = this.s8(PhotoDisplayLocationInfo.class);
       this.z = this.x8("CONTENT_CURRENT_HEIGHT_RATIO");
       return;
    }
}
