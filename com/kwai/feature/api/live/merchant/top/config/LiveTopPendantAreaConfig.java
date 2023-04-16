package com.kwai.feature.api.live.merchant.top.config.LiveTopPendantAreaConfig;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.feature.api.live.merchant.top.config.LiveTopPendantItemConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.kwai.feature.api.live.merchant.top.config.a;
import java.lang.Iterable;
import ok.h;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class LiveTopPendantAreaConfig implements Serializable	// class@000fe2
{
    public int mLiveStreamType;
    public int mRotationIntervalMs;
    public Map mTopPendantItemConfigMap;
    public List mTopPendantItemList;
    public int mVersion;
    public static final long serialVersionUID = 0x7b3b4950aaf60a81;

    public void LiveTopPendantAreaConfig(){
       super();
    }
    public LiveTopPendantItemConfig getLiveTopPendantItemConfig(int p0){
       if (PatchProxy.isSupport(LiveTopPendantAreaConfig.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveTopPendantAreaConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.mTopPendantItemConfigMap == null) {
          if (q.f(this.mTopPendantItemList)) {
             return null;
          }else {
             this.mTopPendantItemConfigMap = Maps.B(this.mTopPendantItemList, a.b);
          }
       }
       return this.mTopPendantItemConfigMap.get(Integer.valueOf(p0));
    }
}
