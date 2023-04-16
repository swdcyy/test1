package com.yxcorp.gifshow.widget.AvatarWithPendantView;
import com.yxcorp.gifshow.widget.CustomLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.AvatarType;
import com.facebook.imagepipeline.request.ImageRequest;
import android.view.ViewGroup;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.CustomLayout$a;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import yb.b;
import android.content.res.Resources;
import com.facebook.drawee.generic.RoundingParams;
import lnc.a1;
import qrd.l1;
import xb.t$b;
import yb.a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Integer;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;
import java.lang.Float;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import tyc.o;
import w4.j;
import com.yxcorp.gifshow.model.CDNUrl;
import s0d.b;
import ub.b;
import pb.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import tyc.n;
import java.lang.Enum;
import w4.e;

public final class AvatarWithPendantView extends CustomLayout	// class@0017f0
{
    public HashMap A;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public float i;
    public int j;
    public float k;
    public boolean l;
    public int m;
    public Drawable n;
    public int o;
    public float p;
    public float q;
    public float r;
    public float s;
    public boolean t;
    public boolean u;
    public AvatarType v;
    public ImageRequest[] w;
    public final KwaiImageView x;
    public final LottieAnimationView y;
    public final KwaiImageView z;

    public void AvatarWithPendantView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void AvatarWithPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void AvatarWithPendantView(Context p0,AttributeSet p1,int p2){
       t$b a;
       a.p(p0, "context");
       super(p0, p1, p2);
       int i = this.f(27);
       this.e = i;
       p2 = this.f(27);
       this.f = p2;
       this.p = 0x3fa2b63d;
       this.q = 0x3fbdd49c;
       this.r = 0x3f95c988;
       this.s = 0.03f;
       this.v = AvatarType.NORMAL;
       ImageRequest[] imageRequest = new ImageRequest[0];
       this.w = imageRequest;
       this.setClipChildren(0);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.x);
       a.o(typedArray, "context.obtainStyledAttr¡­le.AvatarWithPendantView\)");
       this.g = (int)typedArray.getDimension(1, (float)i);
       this.h = (int)typedArray.getDimension(0, (float)p2);
       this.t = typedArray.getBoolean(5, 0);
       this.u = typedArray.getBoolean(4, 0);
       float f = 0;
       this.i = typedArray.getDimension(10, f);
       this.k = typedArray.getDimension(9, f);
       this.j = typedArray.getColor(8, -1);
       this.l = typedArray.getBoolean(7, 1);
       this.m = typedArray.getInt(3, 300);
       this.n = typedArray.getDrawable(2);
       this.o = typedArray.getInt(6, -1);
       typedArray.recycle();
       KwaiImageView kwaiImageVie = new KwaiImageView(p0);
       kwaiImageVie.setLayoutParams(new CustomLayout$a(this.g, this.h));
       b uob = new b(kwaiImageVie.getResources());
       RoundingParams roundingPara = new RoundingParams();
       roundingPara.q(this.l);
       AvatarWithPendantView tj = this.j;
       if (tj != -1) {
          roundingPara.k(a1.a(tj));
       }
       tj = this.i;
       if (tj - f) {
          roundingPara.l(tj);
       }
       tj = this.k;
       if (tj - f) {
          roundingPara.p(tj);
       }
       uob.z(roundingPara);
       uob.m(this.m);
       uob.k(this.n);
       switch (this.o){
           case 0:
             a = t$b.a;
             break;
           case 1:
             a = t$b.d;
             break;
           case 2:
             a = t$b.e;
             break;
           case 3:
             a = t$b.f;
             break;
           case 4:
             a = t$b.g;
             break;
           case 5:
             a = t$b.h;
             break;
           case 6:
             a = t$b.i;
             break;
           case 7:
             a = t$b.j;
             break;
           case 8:
             a = t$b.k;
             break;
           default:
             a = null;
       }
       uob.j(a);
       kwaiImageVie.setHierarchy(uob.a());
       this.b(kwaiImageVie);
       this.x = kwaiImageVie;
       LottieAnimationView lottieAnimat = new LottieAnimationView(p0);
       lottieAnimat.setLayoutParams(new CustomLayout$a(this.getDynamicPendantWidth(), this.getDynamicPendantHeight()));
       lottieAnimat.setRepeatCount(-1);
       this.y = lottieAnimat;
       kwaiImageVie = new KwaiImageView(p0);
       kwaiImageVie.setLayoutParams(new CustomLayout$a(this.getStaticPendantWidth(), this.getStaticPendantHeight()));
       this.z = kwaiImageVie;
       return;
    }
    public void AvatarWithPendantView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final KwaiImageView getAvatar(){
       return this.x;
    }
    public final boolean getAvatarAsCircle(){
       return this.l;
    }
    public final int getAvatarBorderColor(){
       return this.j;
    }
    public final float getAvatarBorderPadding(){
       return this.k;
    }
    public final float getAvatarBorderWidth(){
       return this.i;
    }
    public final int getAvatarHeight(){
       return this.h;
    }
    public final ViewGroup$LayoutParams getAvatarParam(){
       ViewGroup$LayoutParams obj = PatchProxy.apply(null, this, AvatarWithPendantView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x.getLayoutParams();
       a.o(obj, "avatar.layoutParams");
       return obj;
    }
    public final int getAvatarScaleType(){
       return this.o;
    }
    public final AvatarType getAvatarType(){
       return this.v;
    }
    public final int getAvatarWidth(){
       return this.g;
    }
    public final LottieAnimationView getDynamicPendant(){
       return this.y;
    }
    public final int getDynamicPendantHeight(){
       Object obj = PatchProxy.apply(null, this, AvatarWithPendantView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((float)this.x.getLayoutParams().height * this.q);
    }
    public final int getDynamicPendantWidth(){
       Object obj = PatchProxy.apply(null, this, AvatarWithPendantView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((float)this.x.getLayoutParams().width * this.p);
    }
    public final KwaiImageView getStaticPendant(){
       return this.z;
    }
    public final int getStaticPendantHeight(){
       Object obj = PatchProxy.apply(null, this, AvatarWithPendantView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((float)this.x.getLayoutParams().height * this.r);
    }
    public final int getStaticPendantWidth(){
       Object obj = PatchProxy.apply(null, this, AvatarWithPendantView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((float)this.x.getLayoutParams().width * this.r);
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, AvatarWithPendantView.class, "21")) {
          return;
       }
       AvatarWithPendantView uAvatarWithP = (this.indexOfChild(this.y) != -1)? 1: null;
       if (uAvatarWithP) {
          this.removeView(this.y);
          this.y.f();
       }
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, AvatarWithPendantView.class, "23")) {
          return;
       }
       this.n();
       this.p();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       AvatarWithPendantView tx;
       CustomLayout uCustomLayou;
       int i = 1;
       if (PatchProxy.isSupport(AvatarWithPendantView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, AvatarWithPendantView.class, "8")) {
             return;
          }
       }
       AvatarWithPendantView uAvatarWithP = -1;
       AvatarWithPendantView uAvatarWithP1 = (this.indexOfChild(this.y) != uAvatarWithP)? 1: null;
       if (uAvatarWithP1) {
          if (this.u != null || this.t != null) {
             tx = this.x;
             int i1 = (this.t != null)? 0: (this.y.getMeasuredWidth() - this.x.getMeasuredWidth()) / 2;
             CustomLayout.i(this, tx, i1, 0, false, 4, null);
             tx = this.y;
             i1 = (this.t != null)? (this.x.getMeasuredWidth() - this.y.getMeasuredWidth()) / 2: 0;
             CustomLayout.i(this, tx, i1, ((this.x.getMeasuredHeight() - this.y.getMeasuredHeight()) / 2), false, 4, null);
          }else {
             uCustomLayou = this;
             CustomLayout.i(uCustomLayou, this.x, ((this.y.getMeasuredWidth() - this.x.getMeasuredWidth()) / 2), ((this.y.getMeasuredHeight() - this.x.getMeasuredHeight()) / 2), false, 4, null);
             CustomLayout.i(uCustomLayou, this.y, 0, 0, false, 4, null);
          }
       }else if(this.indexOfChild(this.z) != uAvatarWithP){
          i = 0;
       }
       if (i) {
          if (this.u != null) {
             tx = this.x;
             CustomLayout.i(this, tx, this.k(tx), 0, false, 4, null);
             tx = this.z;
             CustomLayout.i(this, tx, 0, (this.x.getMeasuredHeight() - tx.getMeasuredHeight()), false, 4, null);
          }else {
             tx = this.x;
             uCustomLayou = this;
             CustomLayout.i(uCustomLayou, tx, this.k(tx), (this.z.getMeasuredHeight() - tx.getMeasuredHeight()), false, 4, null);
             CustomLayout.i(uCustomLayou, this.z, 0, 0, false, 4, null);
          }
       }else {
          CustomLayout.i(this, this.x, 0, 0, false, 4, null);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(AvatarWithPendantView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AvatarWithPendantView.class, "7")) {
          return;
       }
       super.onMeasure(p0, p1);
       Iterator iterator = ViewGroupKt.b(this).iterator();
       while (iterator.hasNext()) {
          this.c(iterator.next());
       }
       AvatarWithPendantView uAvatarWithP = 1;
       AvatarWithPendantView uAvatarWithP1 = (this.indexOfChild(this.y) != -1)? 1: null;
       if (uAvatarWithP1) {
          uAvatarWithP1 = (this.t != null)? this.x: this.y;
          uAvatarWithP1 = uAvatarWithP1.getMeasuredWidth();
          uAvatarWithP = (this.u != null)? this.x: this.y;
          this.setMeasuredDimension(uAvatarWithP1, uAvatarWithP.getMeasuredHeight());
       }else if(this.indexOfChild(this.z) != -1){
          uAvatarWithP = null;
       }
       if (uAvatarWithP != null) {
          uAvatarWithP1 = this.z.getMeasuredWidth();
          uAvatarWithP = (this.u != null)? this.x: this.z;
          this.setMeasuredDimension(uAvatarWithP1, uAvatarWithP.getMeasuredHeight());
       }else {
          this.setMeasuredDimension(this.x.getMeasuredWidth(), this.x.getMeasuredHeight());
       }
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, AvatarWithPendantView.class, "19")) {
          return;
       }
       AvatarWithPendantView uAvatarWithP = (this.indexOfChild(this.z) != -1)? 1: null;
       if (uAvatarWithP) {
          this.removeView(this.z);
       }
       return;
    }
    public final void q(boolean p0){
       if (PatchProxy.isSupport(AvatarWithPendantView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AvatarWithPendantView.class, "9")) {
          return;
       }
       this.u = p0;
       this.invalidate();
       this.requestLayout();
       return;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, AvatarWithPendantView.class, "24")) {
          return;
       }
       this.p();
       this.n();
       this.v = AvatarType.NORMAL;
       ImageRequest[] imageRequest = new ImageRequest[0];
       this.w = imageRequest;
       return;
    }
    public final void s(String p0,float p1,float p2){
       if (PatchProxy.isSupport(AvatarWithPendantView.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, AvatarWithPendantView.class, "15")) {
          return;
       }
       boolean b = true;
       if (!PatchProxy.isSupport(AvatarWithPendantView.class) || (!PatchProxy.applyVoidFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(b), this, AvatarWithPendantView.class, "14") && p0 != null)) {
          this.v = AvatarType.DYNAMIC_PENDANT;
          this.p = p1;
          this.q = p2;
          this.y.setLayoutParams(new CustomLayout$a(this.getDynamicPendantWidth(), this.getDynamicPendantHeight()));
          a.i(this.getContext(), p0).addListener(new o(this));
          if (this.indexOfChild(this.y) == -1) {
             b = false;
          }
          if (!b) {
             this.b(this.y);
          }
          this.p();
       }
       return;
    }
    public final void setAvatarAsCircle(boolean p0){
       this.l = p0;
    }
    public final void setAvatarBorderColor(int p0){
       this.j = p0;
    }
    public final void setAvatarBorderPadding(float p0){
       this.k = p0;
    }
    public final void setAvatarBorderWidth(float p0){
       this.i = p0;
    }
    public final void setAvatarHeight(int p0){
       this.h = p0;
    }
    public final void setAvatarParam(ViewGroup$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarWithPendantView.class, "16")) {
          return;
       }
       a.p(p0, "params");
       this.x.setLayoutParams(p0);
       this.y.setLayoutParams(new CustomLayout$a(this.getDynamicPendantWidth(), this.getDynamicPendantHeight()));
       this.z.setLayoutParams(new CustomLayout$a(this.getStaticPendantWidth(), this.getStaticPendantHeight()));
       return;
    }
    public final void setAvatarScaleType(int p0){
       this.o = p0;
    }
    public final void setAvatarType(AvatarType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarWithPendantView.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.v = p0;
       return;
    }
    public final void setAvatarWidth(int p0){
       this.g = p0;
    }
    public final void setStaticPendantRequest(ImageRequest[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarWithPendantView.class, "11")) {
          return;
       }
       boolean b = true;
       if (!PatchProxy.isSupport(AvatarWithPendantView.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(b), this, AvatarWithPendantView.class, "10")) {
          a.p(p0, "request");
          this.v = AvatarType.STATIC_PENDANT;
          this.w = p0;
          this.t(this.z, p0);
          if (this.indexOfChild(this.z) == -1) {
             b = false;
          }
          if (!b) {
             this.b(this.z);
          }
          this.n();
       }
       return;
    }
    public final void setStaticPendantUrl(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarWithPendantView.class, "13")) {
          return;
       }
       boolean b = true;
       if (!PatchProxy.isSupport(AvatarWithPendantView.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(b), this, AvatarWithPendantView.class, "12")) {
          a.p(p0, "urls");
          this.v = AvatarType.STATIC_PENDANT;
          ImageRequest[] imageRequest = b.c(p0);
          a.o(imageRequest, "BaseImageRequestFactory.build\(urls\)");
          this.w = imageRequest;
          this.t(this.z, imageRequest);
          if (this.indexOfChild(this.z) == -1) {
             b = false;
          }
          if (!b) {
             this.b(this.z);
          }
          this.n();
       }
       return;
    }
    public final void t(KwaiImageView p0,ImageRequest[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AvatarWithPendantView.class, "25")) {
          return;
       }
       a.p(p0, "$this$setImageRequest");
       a.p(p1, "request");
       b uob = null;
       d uod = p0.g0(uob, uob, p1);
       if (uod != null) {
          uob = uod.e();
       }
       p0.setController(uob);
       return;
    }
    public final void u(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AvatarWithPendantView.class, "22")) {
          return;
       }
       int i = n.a[this.v.ordinal()];
       int i1 = 0;
       if (i != 1) {
          if (i == 2 && !PatchProxy.applyVoid(objArray, this, AvatarWithPendantView.class, "18")) {
             AvatarWithPendantView uAvatarWithP = (this.indexOfChild(this.z) != -1)? 1: null;
             if (!uAvatarWithP && this.v == AvatarType.STATIC_PENDANT) {
                uAvatarWithP = this.w;
                if (uAvatarWithP != null) {
                   uAvatarWithP = (!uAvatarWithP.length)? 1: null;
                   if (!uAvatarWithP) {
                   label_004b :
                      if (!i1) {
                         this.n();
                         this.b(this.z);
                      }
                   }
                }
                i1 = 1;
                goto label_004b ;
             }
          }
       }else if(PatchProxy.applyVoid(objArray, this, AvatarWithPendantView.class, "20")){
          if (this.indexOfChild(this.y) != -1) {
             i1 = 1;
          }
          if (!i1 && (this.y.getComposition() != null && this.v == AvatarType.DYNAMIC_PENDANT)) {
             this.p();
             this.b(this.y);
             this.y.setRepeatCount(-1);
             this.y.s();
          }
       }
    label_008c :
       return;
    }
}
