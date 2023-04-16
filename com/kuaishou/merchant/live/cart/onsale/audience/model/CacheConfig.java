package com.kuaishou.merchant.live.cart.onsale.audience.model.CacheConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public class CacheConfig implements Serializable	// class@001949
{
    public boolean mEnableYellowCartPageRecovery;
    public long mExpireTimeMs;
    public int mRetryIntervalMs;
    public int mRetryTimes;
    public static CacheConfig b;
    public static final long serialVersionUID;

    public void CacheConfig(){
       super();
    }
    public static CacheConfig get(){
       Object obj = PatchProxy.apply(null, null, CacheConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (CacheConfig.b == null) {
          CacheConfig.b = a.t().getValue("yellowCartPageRecoveryConfig", CacheConfig.class, new CacheConfig());
       }
       return CacheConfig.b;
    }
}
