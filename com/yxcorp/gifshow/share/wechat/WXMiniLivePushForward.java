package com.yxcorp.gifshow.share.wechat.WXMiniLivePushForward;
import com.yxcorp.gifshow.share.platform.WechatForward;
import com.yxcorp.gifshow.share.util.PhotoForward;
import ajc.a;
import mhc.v;
import ajc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mhc.x;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import nsd.u;
import com.yxcorp.gifshow.share.OperationModel;
import msd.p;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.b;
import android.graphics.Bitmap;
import ajc.a$a;
import android.content.res.Resources;
import lnc.a1;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Paint;
import com.yxcorp.gifshow.share.KwaiOperator;
import com.yxcorp.gifshow.share.wechat.WXMiniLivePushForward$execute$1;
import t45.d;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.yxcorp.gifshow.share.wechat.WXMiniLivePushForward$a;
import erd.o;
import brd.x;
import mhc.u1;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import ajc.c;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;

public final class WXMiniLivePushForward extends v implements WechatForward, PhotoForward, a	// class@001c9b
{
    public final boolean h;
    public final int i;
    public final b j;
    public final b k;

    public void WXMiniLivePushForward(int p0,b p1,b p2){
       a.p(p1, "tagCenter");
       super(WechatForward.n0.c(), 0, 0, null, null, false, 62, null);
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.h = true;
    }
    public t F0(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(WXMiniLivePushForward.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, WXMiniLivePushForward.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       a.p(p3, "bitmapHandler");
       return PhotoForward$DefaultImpls.e(this, p0, p1, p2, p3);
    }
    public WXMediaMessage G(OperationModel p0){
       return b.a(this, p0);
    }
    public WXMediaMessage I(OperationModel p0){
       return b.c(this, p0);
    }
    public void J0(b p0,Bitmap p1){
       b b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WXMiniLivePushForward.class, "8")) {
          return;
       }
       String str = "bitmapCanvas";
       a.p(p1, str);
       if (!PatchProxy.applyVoidThreeRefs(this, p0, p1, null, a$a.class, "1")) {
          a.p(p1, str);
          if (p0 != null) {
             Bitmap uBitmap = BitmapFactory.decodeResource(a1.m(), p0.a);
             Canvas uCanvas = new Canvas(p1);
             Rect rect = PatchProxy.apply(null, p0, b.class, "1");
             if (rect != PatchProxyResult.class) {
             }else {
                b = p0.b;
                b c = p0.c;
                rect = new Rect(b, c, (p0.d + b), (p0.e + c));
             }
             a.o(uBitmap, "iconBmp");
             uCanvas.drawBitmap(uBitmap, new Rect(0, 0, uBitmap.getWidth(), uBitmap.getHeight()), rect, null);
          }
       }
       return;
    }
    public WXMediaMessage K0(OperationModel p0){
       return b.e(this, p0);
    }
    public WXMediaMessage N(OperationModel p0){
       return b.d(this, p0);
    }
    public t O(String p0,String p1,KwaiOperator p2,String p3){
       return b.i(this, p0, p1, p2, p3);
    }
    public t O0(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(WXMiniLivePushForward.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, WXMiniLivePushForward.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       a.p(p3, "bitmapHandler");
       return PhotoForward$DefaultImpls.f(this, p0, p1, p2, p3);
    }
    public t P0(KwaiOperator p0){
       OperationModel obj = PatchProxy.applyOneRefs(p0, this, WXMiniLivePushForward.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       obj = p0.i();
       t ot = this.W(obj, this.m0(), this.getAddWatermark(), new WXMiniLivePushForward$execute$1(this)).subscribeOn(d.c).observeOn(a.c()).flatMap(new WXMiniLivePushForward$a(this, obj, p0)).compose(u1.a(p0, this));
       a.o(ot, "downloadImageOrVideo\(mod¡­nsformer\(operator, this\)\)");
       return ot;
    }
    public Bitmap S(OperationModel p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WXMiniLivePushForward.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       a.p(p1, "bitmap");
       return PhotoForward$DefaultImpls.b(this, p0, p1);
    }
    public int S0(){
       return 1;
    }
    public final Bitmap T0(OperationModel p0,Bitmap p1){
       int i;
       int i1;
       SharePlatformData$ShareConfig obj = PatchProxy.applyTwoRefs(p0, p1, this, WXMiniLivePushForward.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       a.p(p1, "bitmap");
       SharePlatformData$ShareConfig shareConfig = this.a(p0);
       p1 = BitmapUtil.o(p1, c.b(), c.a());
       a.o(p1, "bitmapCanvas");
       this.J0(this.j, p1);
       this.J0(this.k, p1);
       obj = shareConfig.mCoverWidth;
       if (obj >= 200) {
          shareConfig = shareConfig.mCoverHeight;
          if (shareConfig >= 200) {
          label_004a :
             Bitmap uBitmap = BitmapUtil.o(p1, i, i1);
             a.o(uBitmap, "BitmapUtil.crop\(bitmapCanvas, width, height\)");
             return uBitmap;
          }
       }
       i = c.b();
       i1 = c.a();
       goto label_004a ;
    }
    public t W(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(WXMiniLivePushForward.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, WXMiniLivePushForward.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       a.p(p3, "bitmapHandler");
       return PhotoForward$DefaultImpls.c(this, p0, p1, p2, p3);
    }
    public WXMediaMessage X(OperationModel p0){
       return b.b(this, p0);
    }
    public WXMediaMessage a0(OperationModel p0){
       return b.g(this, p0);
    }
    public t c(OperationModel p0){
       a.p(p0, "model");
       return PhotoForward$DefaultImpls.a(this, p0);
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
    public int k(){
       return this.i;
    }
    public boolean m(){
       return this.h;
    }
    public b p(){
       return this.j;
    }
    public t q(OperationModel p0,p p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WXMiniLivePushForward.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       a.p(p1, "bitmapHandler");
       return PhotoForward$DefaultImpls.i(this, p0, p1);
    }
    public b w0(){
       return this.k;
    }
    public Bitmap y(OperationModel p0){
       a.p(p0, "model");
       return PhotoForward$DefaultImpls.g(this, p0);
    }
}
