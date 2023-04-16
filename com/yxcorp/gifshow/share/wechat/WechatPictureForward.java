package com.yxcorp.gifshow.share.wechat.WechatPictureForward;
import com.yxcorp.gifshow.share.platform.WechatForward;
import yic.x;
import mhc.v;
import mhc.x;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import com.yxcorp.gifshow.share.wechat.WechatPictureForward$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.share.KwaiOperator;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.share.OperationModel;
import brd.t;
import java.lang.Integer;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.b;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import com.kwai.framework.ui.popupmanager.dialog.a;
import com.yxcorp.gifshow.share.wechat.WechatPictureForward$a;
import erd.o;
import brd.x;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import java.lang.Boolean;
import android.graphics.Bitmap$Config;

public final class WechatPictureForward extends v implements WechatForward, x	// class@001ca2
{
    public final boolean h;
    public final x i;
    public final int j;
    public final p k;
    public final x l;

    public void WechatPictureForward(boolean p0,x p1,int p2,x p3,p p4){
       a.p(p1, "forward");
       a.p(p3, "picForward");
       a.p(p4, "forwardTransformer");
       super(p1, 0, 0, null, null, false, 62, null);
       this.l = p3;
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = p4;
    }
    public void WechatPictureForward(boolean p0,x p1,int p2,x p3,p p4,int p5,u p6){
       if (p5 & 0x02) {
          p1 = WechatForward.n0.a(p0);
       }
       x ox = p1;
       if (p5 & 0x04) {
          p2 = ox.k();
       }
       int i = p2;
       WechatPictureForward$1 iNSTANCE = (p5 & 0x10)? WechatPictureForward$1.INSTANCE: 0;
       super(p0, ox, i, p3, iNSTANCE);
       return;
    }
    public int A(){
       Object obj = PatchProxy.apply(null, this, WechatPictureForward.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l.A();
    }
    public void A0(String p0,KwaiOperator p1,Bitmap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WechatPictureForward.class, "5")) {
          return;
       }
       a.p(p0, "fileName");
       a.p(p1, "operator");
       a.p(p2, "bmp");
       this.l.A0(p0, p1, p2);
       return;
    }
    public Bitmap D(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WechatPictureForward.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return this.l.D(p0);
    }
    public t D0(String p0,String p1,int p2){
       if (PatchProxy.isSupport(WechatPictureForward.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, WechatPictureForward.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "defaultShareUrl");
       return this.l.D0(p0, p1, p2);
    }
    public WXMediaMessage G(OperationModel p0){
       return b.a(this, p0);
    }
    public WXMediaMessage I(OperationModel p0){
       return b.c(this, p0);
    }
    public WXMediaMessage K0(OperationModel p0){
       return b.e(this, p0);
    }
    public Bitmap L(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WechatPictureForward.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return this.l.L(p0);
    }
    public WXMediaMessage N(OperationModel p0){
       return b.d(this, p0);
    }
    public t O(String p0,String p1,KwaiOperator p2,String p3){
       return b.i(this, p0, p1, p2, p3);
    }
    public Bitmap P(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WechatPictureForward.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       return this.l.P(p0);
    }
    public t P0(KwaiOperator p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WechatPictureForward.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       String[] stringArray = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE","android.permission.READ_EXTERNAL_STORAGE"};
       t ot = a.k(p0.c(), stringArray).flatMap(new WechatPictureForward$a(this, p0)).compose(this.k.invoke(p0, this));
       a.o(ot, "PermissionDlgUtils.reque¡­nsformer\(operator, this\)\)");
       return ot;
    }
    public int S0(){
       return 6;
    }
    public WXMediaMessage X(OperationModel p0){
       return b.b(this, p0);
    }
    public void Z(View p0,KwaiOperator p1,Bitmap p2,int p3,int p4){
       WechatPictureForward wechatPictur = WechatPictureForward.class;
       if (PatchProxy.isSupport(wechatPictur)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, wechatPictur, "15")) {
             return;
          }
       }
       a.p(p0, "view");
       a.p(p1, "operator");
       a.p(p2, "bmp");
       this.l.Z(p0, p1, p2, p3, p4);
       return;
    }
    public WXMediaMessage a0(OperationModel p0){
       return b.g(this, p0);
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, WechatPictureForward.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l.b();
    }
    public t c0(WXMediaMessage p0,KwaiOperator p1,String p2){
       return b.j(this, p0, p1, p2);
    }
    public WXMediaMessage d0(OperationModel p0,ShareToken p1){
       return b.f(this, p0, p1);
    }
    public SharePlatformData$ShareConfig e0(OperationModel p0){
       return b.h(this, p0);
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, WechatPictureForward.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l.f();
    }
    public x getForward(){
       return this.i;
    }
    public int k(){
       return this.j;
    }
    public boolean m(){
       return this.h;
    }
    public int q0(){
       Object obj = PatchProxy.apply(null, this, WechatPictureForward.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l.q0();
    }
    public Bitmap r0(GifshowActivity p0,OperationModel p1,Bitmap p2){
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, WechatPictureForward.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "a");
       a.p(p1, "model");
       a.p(p2, "qrBmp");
       PatchProxy.onMethodExit(WechatPictureForward.class, "9");
       return this.l.r0(p0, p1, p2);
    }
    public SharePlatformData$ShareConfig s0(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WechatPictureForward.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return this.l.s0(p0);
    }
    public Bitmap u0(OperationModel p0,boolean p1){
       WechatPictureForward wechatPictur = WechatPictureForward.class;
       if (PatchProxy.isSupport(wechatPictur)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, wechatPictur, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       return this.l.u0(p0, p1);
    }
    public void x0(String p0,KwaiOperator p1,Bitmap p2,int p3,int p4,Bitmap$Config p5,int p6){
       WechatPictureForward wechatPictur = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p5;
       WechatPictureForward wechatPictur1 = WechatPictureForward.class;
       if (PatchProxy.isSupport(wechatPictur1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Integer.valueOf(p3),Integer.valueOf(p4),oobject3,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, wechatPictur1, "6")) {
             return;
          }
       }
       a.p(p0, "fileName");
       a.p(p1, "operator");
       a.p(p2, "bmp");
       a.p(p5, "bitmapConfig");
       wechatPictur.l.x0(p0, p1, p2, p3, p4, p5, p6);
       return;
    }
}
