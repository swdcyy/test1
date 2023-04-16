package com.yxcorp.gifshow.share.wechat.WechatLocalPhotoForward$a;
import erd.o;
import com.yxcorp.gifshow.share.wechat.WechatLocalPhotoForward;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.WechatForward;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import brd.t;

public final class WechatLocalPhotoForward$a implements o	// class@001c9d
{
    public final WechatLocalPhotoForward b;
    public final OperationModel c;
    public final KwaiOperator d;

    public void WechatLocalPhotoForward$a(WechatLocalPhotoForward p0,OperationModel p1,KwaiOperator p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, WechatLocalPhotoForward$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = this.b;
          BaseFeed uBaseFeed = this.c.i();
          a.m(uBaseFeed);
          ot = p0.c0(p0.I(this.c), this.d, r1.R0(uBaseFeed));
       }
       return ot;
    }
}
