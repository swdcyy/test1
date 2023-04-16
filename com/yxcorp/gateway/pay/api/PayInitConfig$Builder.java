package com.yxcorp.gateway.pay.api.PayInitConfig$Builder;
import com.yxcorp.gateway.pay.api.NetWorkGlobalConfig;
import java.lang.Object;
import com.yxcorp.gateway.pay.api.PayInitConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import h97.g;
import com.yxcorp.gateway.pay.api.KwaiPayConfig;
import go7.a;
import go7.b;
import com.yxcorp.gateway.pay.api.PayRetrofitGlobalConfig;
import go7.e;
import go7.f;
import go7.h;
import go7.i;
import go7.k;
import go7.l;

public final class PayInitConfig$Builder	// class@001218
{
    public Application mApplication;
    public g mCommonParams;
    public String mDebugHostUrl;
    public boolean mEnableLogger;
    public KwaiPayConfig mKwaiPayConfig;
    public NetWorkGlobalConfig mNetWorkGlobalConfig;
    public a mPayLoggerConfig;
    public PayRetrofitGlobalConfig mPayRetrofitConfig;
    public b mPayYodaConfig;
    public e mRubasApi;
    public f mUnionPayHelper;
    public h mVerifyConfig;
    public i mVideoHelper;
    public k mWebviewInitConfig;
    public l mWithDrawConfig;

    public void PayInitConfig$Builder(NetWorkGlobalConfig p0){
       this.mNetWorkGlobalConfig = p0;
    }
    public PayInitConfig build(){
       Object obj = PatchProxy.apply(null, this, PayInitConfig$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PayInitConfig(this);
    }
    public PayInitConfig$Builder setApplication(Application p0){
       this.mApplication = p0;
       return this;
    }
    public PayInitConfig$Builder setCommonParams(g p0){
       this.mCommonParams = p0;
       return this;
    }
    public PayInitConfig$Builder setDebugHostUrl(String p0){
       this.mDebugHostUrl = p0;
       return this;
    }
    public PayInitConfig$Builder setEnableLogger(boolean p0){
       this.mEnableLogger = p0;
       return this;
    }
    public PayInitConfig$Builder setKwaiPayConfig(KwaiPayConfig p0){
       this.mKwaiPayConfig = p0;
       return this;
    }
    public PayInitConfig$Builder setPayLoggerConfig(a p0){
       this.mPayLoggerConfig = p0;
       return this;
    }
    public PayInitConfig$Builder setPayYodaConfig(b p0){
       this.mPayYodaConfig = p0;
       return this;
    }
    public PayInitConfig$Builder setRetrofitConfig(PayRetrofitGlobalConfig p0){
       this.mPayRetrofitConfig = p0;
       return this;
    }
    public PayInitConfig$Builder setRubasApi(e p0){
       this.mRubasApi = p0;
       return this;
    }
    public PayInitConfig$Builder setUnionPayHelper(f p0){
       this.mUnionPayHelper = p0;
       return this;
    }
    public PayInitConfig$Builder setVerifyConfig(h p0){
       this.mVerifyConfig = p0;
       return this;
    }
    public PayInitConfig$Builder setVideoUploadHelper(i p0){
       this.mVideoHelper = p0;
       return this;
    }
    public PayInitConfig$Builder setWebInitConfig(k p0){
       this.mWebviewInitConfig = p0;
       return this;
    }
    public PayInitConfig$Builder setWithDrawConfig(l p0){
       this.mWithDrawConfig = p0;
       return this;
    }
}
