package com.kwai.feature.post.api.feature.bridge.JsIntownPageShareParams$SharePlatformType;
import java.lang.Enum;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsIntownPageShareParams$SharePlatformType extends Enum	// class@00134d
{
    public final KwaiOp mKwaiOp;
    public static final JsIntownPageShareParams$SharePlatformType[] $VALUES;
    public static final JsIntownPageShareParams$SharePlatformType COPY_LINK;
    public static final JsIntownPageShareParams$SharePlatformType QQ;
    public static final JsIntownPageShareParams$SharePlatformType QQ_ZONE;
    public static final JsIntownPageShareParams$SharePlatformType SINA_WEIBO;
    public static final JsIntownPageShareParams$SharePlatformType WECHAT;
    public static final JsIntownPageShareParams$SharePlatformType WECHAT_TIMELINE;

    static {
       JsIntownPageShareParams$SharePlatformType sharePlatfor = new JsIntownPageShareParams$SharePlatformType("WECHAT", 0, KwaiOp.FORWARD_WECHAT_FRIEND);
       JsIntownPageShareParams$SharePlatformType.WECHAT = sharePlatfor;
       JsIntownPageShareParams$SharePlatformType sharePlatfor1 = new JsIntownPageShareParams$SharePlatformType("WECHAT_TIMELINE", 1, KwaiOp.FORWARD_WECHAT_MOMENT);
       JsIntownPageShareParams$SharePlatformType.WECHAT_TIMELINE = sharePlatfor1;
       JsIntownPageShareParams$SharePlatformType sharePlatfor2 = new JsIntownPageShareParams$SharePlatformType("QQ", 2, KwaiOp.FORWARD_QQ);
       JsIntownPageShareParams$SharePlatformType.QQ = sharePlatfor2;
       JsIntownPageShareParams$SharePlatformType sharePlatfor3 = new JsIntownPageShareParams$SharePlatformType("QQ_ZONE", 3, KwaiOp.FORWARD_QZONE);
       JsIntownPageShareParams$SharePlatformType.QQ_ZONE = sharePlatfor3;
       JsIntownPageShareParams$SharePlatformType sharePlatfor4 = new JsIntownPageShareParams$SharePlatformType("SINA_WEIBO", 4, KwaiOp.FORWARD_WEIBO);
       JsIntownPageShareParams$SharePlatformType.SINA_WEIBO = sharePlatfor4;
       JsIntownPageShareParams$SharePlatformType sharePlatfor5 = new JsIntownPageShareParams$SharePlatformType("COPY_LINK", 5, KwaiOp.COPY_LINK);
       JsIntownPageShareParams$SharePlatformType.COPY_LINK = sharePlatfor5;
       JsIntownPageShareParams$SharePlatformType[] sharePlatfor6 = new JsIntownPageShareParams$SharePlatformType[]{sharePlatfor,sharePlatfor1,sharePlatfor2,sharePlatfor3,sharePlatfor4,sharePlatfor5};
       JsIntownPageShareParams$SharePlatformType.$VALUES = sharePlatfor6;
    }
    public void JsIntownPageShareParams$SharePlatformType(String p0,int p1,KwaiOp p2){
       super(p0, p1);
       this.mKwaiOp = p2;
    }
    public static JsIntownPageShareParams$SharePlatformType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsIntownPageShareParams$SharePlatformType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsIntownPageShareParams$SharePlatformType.class, p0);
    }
    public static JsIntownPageShareParams$SharePlatformType[] values(){
       Object obj = PatchProxy.apply(null, null, JsIntownPageShareParams$SharePlatformType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsIntownPageShareParams$SharePlatformType.$VALUES.clone();
    }
}
