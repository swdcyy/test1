package com.yxcorp.gifshow.share.weibo.WeiboPictureForward;
import pic.h;
import yic.x;
import mhc.v;
import mhc.x;
import pic.h$a;
import yic.a0;
import msd.p;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.weibo.WeiboPictureForward$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.share.KwaiOperator;
import android.graphics.Bitmap;
import brd.t;
import pic.g;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Integer;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.ImageObject;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import com.kwai.framework.ui.popupmanager.dialog.a;
import com.yxcorp.gifshow.share.weibo.WeiboPictureForward$a;
import erd.o;
import brd.x;
import java.io.File;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import java.lang.Boolean;
import android.graphics.Bitmap$Config;

public final class WeiboPictureForward extends v implements h, x	// class@001caa
{
    public final x h;
    public final int i;
    public final p j;
    public final x k;

    public void WeiboPictureForward(){
       h$a b0 = h.B0;
       x ox = b0.a();
       super(ox, b0.a().k(), new a0(b0.a()), null, 8, null);
    }
    public void WeiboPictureForward(x p0,int p1,x p2,p p3){
       a.p(p0, "forward");
       a.p(p2, "forwarder");
       a.p(p3, "forwardTransformer");
       super(p0, 0, 0, null, null, false, 62, null);
       this.k = p2;
       this.h = p0;
       this.i = p1;
       this.j = p3;
    }
    public void WeiboPictureForward(x p0,int p1,x p2,p p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = h.B0.a();
       }
       if (p4 & 0x02) {
          p1 = p0.k();
       }
       WeiboPictureForward$1 iNSTANCE = (p4 & 0x08)? WeiboPictureForward$1.INSTANCE: null;
       super(p0, p1, p2, iNSTANCE);
       return;
    }
    public void WeiboPictureForward(x p0){
       a.p(p0, "forwarder");
       h$a b0 = h.B0;
       x ox = b0.a();
       super(ox, b0.a().k(), p0, null, 8, null);
    }
    public int A(){
       Object obj = PatchProxy.apply(null, this, WeiboPictureForward.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k.A();
    }
    public void A0(String p0,KwaiOperator p1,Bitmap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WeiboPictureForward.class, "5")) {
          return;
       }
       a.p(p0, "fileName");
       a.p(p1, "operator");
       a.p(p2, "bmp");
       this.k.A0(p0, p1, p2);
       return;
    }
    public t B0(KwaiOperator p0){
       return g.g(this, p0);
    }
    public Bitmap D(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WeiboPictureForward.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return this.k.D(p0);
    }
    public t D0(String p0,String p1,int p2){
       if (PatchProxy.isSupport(WeiboPictureForward.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, WeiboPictureForward.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "defaultShareUrl");
       return this.k.D0(p0, p1, p2);
    }
    public t H(WebpageObject p0,TextObject p1,ImageObject p2,KwaiOperator p3){
       return g.e(this, p0, p1, p2, p3);
    }
    public Bitmap L(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WeiboPictureForward.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return this.k.L(p0);
    }
    public Bitmap P(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WeiboPictureForward.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       return this.k.P(p0);
    }
    public t P0(KwaiOperator p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WeiboPictureForward.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       String[] stringArray = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE","android.permission.READ_EXTERNAL_STORAGE"};
       t ot = a.k(p0.c(), stringArray).flatMap(new WeiboPictureForward$a(this, p0)).compose(this.j.invoke(p0, this));
       a.o(ot, "PermissionDlgUtils.reque¡­nsformer\(operator, this\)\)");
       return ot;
    }
    public int S0(){
       return 6;
    }
    public void Z(View p0,KwaiOperator p1,Bitmap p2,int p3,int p4){
       WeiboPictureForward weiboPicture = WeiboPictureForward.class;
       if (PatchProxy.isSupport(weiboPicture)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, weiboPicture, "15")) {
             return;
          }
       }
       a.p(p0, "view");
       a.p(p1, "operator");
       a.p(p2, "bmp");
       this.k.Z(p0, p1, p2, p3, p4);
       return;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, WeiboPictureForward.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k.b();
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, WeiboPictureForward.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k.f();
    }
    public x getForward(){
       return this.h;
    }
    public t i(KwaiOperator p0){
       return g.d(this, p0);
    }
    public WebpageObject i0(String p0,String p1,String p2,File p3){
       return g.b(this, p0, p1, p2, p3);
    }
    public int k(){
       return this.i;
    }
    public t l(KwaiOperator p0){
       return g.f(this, p0);
    }
    public int q0(){
       Object obj = PatchProxy.apply(null, this, WeiboPictureForward.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k.q0();
    }
    public TextObject r(String p0){
       return g.a(this, p0);
    }
    public Bitmap r0(GifshowActivity p0,OperationModel p1,Bitmap p2){
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, WeiboPictureForward.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "a");
       a.p(p1, "model");
       a.p(p2, "qrBmp");
       PatchProxy.onMethodExit(WeiboPictureForward.class, "9");
       return this.k.r0(p0, p1, p2);
    }
    public SharePlatformData$ShareConfig s0(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WeiboPictureForward.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return this.k.s0(p0);
    }
    public Bitmap u0(OperationModel p0,boolean p1){
       WeiboPictureForward weiboPicture = WeiboPictureForward.class;
       if (PatchProxy.isSupport(weiboPicture)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, weiboPicture, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       return this.k.u0(p0, p1);
    }
    public t w(KwaiOperator p0){
       return g.c(this, p0);
    }
    public void x0(String p0,KwaiOperator p1,Bitmap p2,int p3,int p4,Bitmap$Config p5,int p6){
       WeiboPictureForward weiboPicture = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p5;
       WeiboPictureForward weiboPicture1 = WeiboPictureForward.class;
       if (PatchProxy.isSupport(weiboPicture1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Integer.valueOf(p3),Integer.valueOf(p4),oobject3,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, weiboPicture1, "6")) {
             return;
          }
       }
       a.p(p0, "fileName");
       a.p(p1, "operator");
       a.p(p2, "bmp");
       a.p(p5, "bitmapConfig");
       weiboPicture.k.x0(p0, p1, p2, p3, p4, p5, p6);
       return;
    }
}
