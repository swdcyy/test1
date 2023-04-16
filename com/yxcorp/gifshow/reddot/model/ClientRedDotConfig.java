package com.yxcorp.gifshow.reddot.model.ClientRedDotConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.List;

public class ClientRedDotConfig implements Serializable	// class@0017cb
{
    public List mConfigs;
    public long mTime;
    public static final long serialVersionUID = 0x13f660426d4d0261;

    public void ClientRedDotConfig(){
       super();
    }
    public static ClientRedDotConfig of(long p0){
       ClientRedDotConfig obj;
       if (PatchProxy.isSupport(ClientRedDotConfig.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, ClientRedDotConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientRedDotConfig();
       obj.mTime = p0;
       return obj;
    }
    public static ClientRedDotConfig of(long p0,List p1){
       ClientRedDotConfig obj;
       if (PatchProxy.isSupport(ClientRedDotConfig.class)) {
          obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, null, ClientRedDotConfig.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientRedDotConfig();
       obj.mTime = p0;
       obj.mConfigs = p1;
       return obj;
    }
}
