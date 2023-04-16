package com.yxcorp.gifshow.share.wechat.WechatLocalPhotoForward;
import com.yxcorp.gifshow.share.platform.WechatForward;
import com.yxcorp.gifshow.share.util.PhotoForward;
import mhc.v;
import mhc.x;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
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
import com.yxcorp.gifshow.share.KwaiOperator;
import com.yxcorp.gifshow.share.wechat.WechatLocalPhotoForward$execute$1;
import t45.d;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.yxcorp.gifshow.share.wechat.WechatLocalPhotoForward$a;
import erd.o;
import brd.x;
import mhc.u1;
import android.graphics.Bitmap;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;

public final class WechatLocalPhotoForward extends v implements WechatForward, PhotoForward	// class@001c9f
{
    public final boolean h;
    public final x i;
    public final int j;

    public void WechatLocalPhotoForward(boolean p0,x p1,int p2){
       a.p(p1, "forward");
       super(p1, 0, 0, null, null, false, 62, null);
       this.h = p0;
       this.i = p1;
       this.j = p2;
    }
    public t F0(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(WechatLocalPhotoForward.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, WechatLocalPhotoForward.class, "5");
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
       if (PatchProxy.isSupport(WechatLocalPhotoForward.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, WechatLocalPhotoForward.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       a.p(p3, "bitmapHandler");
       return PhotoForward$DefaultImpls.f(this, p0, p1, p2, p3);
    }
    public t P0(KwaiOperator p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WechatLocalPhotoForward.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       t ot = this.W(p0.i(), this.m0(), this.getAddWatermark(), WechatLocalPhotoForward$execute$1.INSTANCE).subscribeOn(d.c).observeOn(a.c()).flatMap(new WechatLocalPhotoForward$a(this, p0.i(), p0)).compose(u1.b(p0, this));
       a.o(ot, "downloadImageOrVideo\(ope¡­nsformer\(operator, this\)\)");
       return ot;
    }
    public Bitmap S(OperationModel p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WechatLocalPhotoForward.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       a.p(p1, "bitmap");
       return PhotoForward$DefaultImpls.b(this, p0, p1);
    }
    public int S0(){
       return 4;
    }
    public t W(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(WechatLocalPhotoForward.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, WechatLocalPhotoForward.class, "3");
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
    public x getForward(){
       return this.i;
    }
    public int k(){
       return this.j;
    }
    public boolean m(){
       return this.h;
    }
    public t q(OperationModel p0,p p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WechatLocalPhotoForward.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       a.p(p1, "bitmapHandler");
       return PhotoForward$DefaultImpls.i(this, p0, p1);
    }
    public Bitmap y(OperationModel p0){
       a.p(p0, "model");
       return PhotoForward$DefaultImpls.g(this, p0);
    }
}
