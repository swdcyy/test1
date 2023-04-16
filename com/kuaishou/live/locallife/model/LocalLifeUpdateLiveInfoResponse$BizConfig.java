package com.kuaishou.live.locallife.model.LocalLifeUpdateLiveInfoResponse$BizConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public class LocalLifeUpdateLiveInfoResponse$BizConfig implements Serializable	// class@000c3a
{
    public String mBizDataId;
    public String mBizId;
    public String mBizType;
    public static final long serialVersionUID = 0x8c2943358c06d1ff;

    public void LocalLifeUpdateLiveInfoResponse$BizConfig(){
       super();
    }
    public int getBizId(){
       LocalLifeUpdateLiveInfoResponse$BizConfig obj = PatchProxy.apply(null, this, LocalLifeUpdateLiveInfoResponse$BizConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mBizId;
       if (obj != null) {
          return Integer.valueOf(obj).intValue();
       }
       return 0;
    }
}
