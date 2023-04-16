package com.kwai.nearby.startup.local.model.NearbyPoiInterceptConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class NearbyPoiInterceptConfig implements Serializable	// class@001029
{
    public List mPoiCommonTagType;
    public List mPoiPlcBizType;
    public static final long serialVersionUID = 0x1e9ca19db3ecfe98;

    public void NearbyPoiInterceptConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NearbyPoiInterceptConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NearbyPoiTagConfig{mPoiPlcBizType="+this.mPoiPlcBizType+", mPoiCommonTagType="+this.mPoiCommonTagType+'}';
    }
}
