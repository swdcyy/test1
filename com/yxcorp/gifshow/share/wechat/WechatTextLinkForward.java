package com.yxcorp.gifshow.share.wechat.WechatTextLinkForward;
import com.yxcorp.gifshow.share.platform.WechatForward;
import mhc.v;
import mhc.x;
import msd.p;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import com.yxcorp.gifshow.share.wechat.WechatTextLinkForward$1;
import com.yxcorp.gifshow.share.OperationModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.b;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.OperationModel$Type;
import ajc.n;
import java.lang.Enum;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import brd.x;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;

public final class WechatTextLinkForward extends v implements WechatForward	// class@001ca4
{
    public final boolean h;
    public final x i;
    public final int j;
    public final p k;

    public void WechatTextLinkForward(boolean p0){
       super(p0, null, 0, null, 14, null);
    }
    public void WechatTextLinkForward(boolean p0,x p1,int p2){
       super(p0, p1, p2, null, 8, null);
    }
    public void WechatTextLinkForward(boolean p0,x p1,int p2,p p3){
       a.p(p1, "forward");
       a.p(p3, "forwardTransformer");
       super(p1, 0, 0, null, null, false, 62, null);
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = p3;
    }
    public void WechatTextLinkForward(boolean p0,x p1,int p2,p p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = WechatForward.n0.a(p0);
       }
       if (p4 & 0x04) {
          p2 = p1.k();
       }
       WechatTextLinkForward$1 iNSTANCE = (p4 & 0x08)? WechatTextLinkForward$1.INSTANCE: null;
       super(p0, p1, p2, iNSTANCE);
       return;
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
    public t P0(KwaiOperator p0){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       WechatTextLinkForward wechatTextLi = WechatTextLinkForward.class;
       OperationModel obj = PatchProxy.applyOneRefs(p0, this, wechatTextLi, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "operator");
       obj = p0.i();
       WXMediaMessage wXMediaMessa = this.K0(obj);
       String str = PatchProxy.applyOneRefs(obj, this, wechatTextLi, "2");
       if (str != patchProxyRe) {
       }else {
          int i = n.a[obj.q().ordinal()];
          if (i != 1 && i != 2) {
             if (i != 3) {
                if (i != 4) {
                   str1 = (i != 5)? "": "pageDetail";
                }else {
                   str1 = "profile";
                }
             }else {
                str1 = "liveCover";
             }
          }else {
             BaseFeed uBaseFeed = obj.i();
             a.m(uBaseFeed);
             str1 = r1.R0(uBaseFeed);
          }
          str = str1;
       }
       t ot = this.c0(wXMediaMessa, p0, str).compose(this.k.invoke(p0, this));
       a.o(ot, "shareMessage\(createTextM¡­nsformer\(operator, this\)\)");
       return ot;
    }
    public int S0(){
       return 3;
    }
    public WXMediaMessage X(OperationModel p0){
       return b.b(this, p0);
    }
    public WXMediaMessage a0(OperationModel p0){
       return b.g(this, p0);
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
}
