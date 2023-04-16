package com.yxcorp.gifshow.share.wechat.WXMiniLivePushForward$a;
import erd.o;
import com.yxcorp.gifshow.share.wechat.WXMiniLivePushForward;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.WechatForward;
import brd.t;

public final class WXMiniLivePushForward$a implements o	// class@001c99
{
    public final WXMiniLivePushForward b;
    public final OperationModel c;
    public final KwaiOperator d;

    public void WXMiniLivePushForward$a(WXMiniLivePushForward p0,OperationModel p1,KwaiOperator p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, WXMiniLivePushForward$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          if (this.c.i() == null) {
             p0 = "";
          }else {
             p0 = this.c.i();
             a.m(p0);
             p0 = r1.R0(p0);
             a.o(p0, "FeedExt.getFullSource\(model.photo!!\)");
          }
          WXMiniLivePushForward$a tb = this.b;
          ot = tb.c0(tb.X(this.c), this.d, p0);
       }
       return ot;
    }
}
