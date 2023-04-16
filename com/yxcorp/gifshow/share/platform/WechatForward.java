package com.yxcorp.gifshow.share.platform.WechatForward;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import com.yxcorp.gifshow.share.OperationModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.String;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import mhc.x;

public interface abstract WechatForward	// class@001c1e
{
    public static final WechatForward$Companion n0;

    static {
       WechatForward.n0 = WechatForward$Companion.g;
    }
    WXMediaMessage G(OperationModel p0);
    WXMediaMessage I(OperationModel p0);
    WXMediaMessage K0(OperationModel p0);
    WXMediaMessage N(OperationModel p0);
    t O(String p0,String p1,KwaiOperator p2,String p3);
    WXMediaMessage X(OperationModel p0);
    WXMediaMessage a0(OperationModel p0);
    t c0(WXMediaMessage p0,KwaiOperator p1,String p2);
    WXMediaMessage d0(OperationModel p0,ShareToken p1);
    SharePlatformData$ShareConfig e0(OperationModel p0);
    x getForward();
    boolean m();
}
