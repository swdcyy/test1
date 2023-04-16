package com.yxcorp.gateway.pay.api.PayInitConfig;
import com.yxcorp.gateway.pay.api.PayInitConfig$Builder;
import java.lang.Object;
import com.yxcorp.gateway.pay.api.NetWorkGlobalConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PayInitConfig	// class@001219
{
    public final Application mApplication;
    public final g mCommonParams;
    public final String mDebugHostUrl;
    public final boolean mEnableLogger;
    public final boolean mIsSupportAlipay;
    public final boolean mIsSupportWechatPay;
    public final KwaiPayConfig mKwaiPayConfig;
    public final NetWorkGlobalConfig mNetWorkGlobalConfig;
    public final a mPayLoggerConfig;
    public final PayRetrofitGlobalConfig mPayRetrofitConfig;
    public final b mPayYodaConfig;
    public final e mRubasApi;
    public final f mUnionPayHelper;
    public final h mVerifyConfig;
    public final i mVideoHelper;
    public final k mWebInitConfig;
    public final l mWithDrawConfig;

    public void PayInitConfig(PayInitConfig$Builder p0){
       super();
       this.mIsSupportWechatPay = true;
       this.mIsSupportAlipay = true;
       this.mNetWorkGlobalConfig = p0.mNetWorkGlobalConfig;
       this.mDebugHostUrl = p0.mDebugHostUrl;
       this.mPayRetrofitConfig = p0.mPayRetrofitConfig;
       this.mVerifyConfig = p0.mVerifyConfig;
       this.mVideoHelper = p0.mVideoHelper;
       this.mWithDrawConfig = p0.mWithDrawConfig;
       this.mCommonParams = p0.mCommonParams;
       this.mEnableLogger = p0.mEnableLogger;
       this.mKwaiPayConfig = p0.mKwaiPayConfig;
       this.mUnionPayHelper = p0.mUnionPayHelper;
       this.mWebInitConfig = p0.mWebviewInitConfig;
       this.mPayYodaConfig = p0.mPayYodaConfig;
       this.mPayLoggerConfig = p0.mPayLoggerConfig;
       this.mApplication = p0.mApplication;
       this.mRubasApi = p0.mRubasApi;
    }
    public static PayInitConfig$Builder newBuilder(NetWorkGlobalConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PayInitConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PayInitConfig$Builder(p0);
    }
}
