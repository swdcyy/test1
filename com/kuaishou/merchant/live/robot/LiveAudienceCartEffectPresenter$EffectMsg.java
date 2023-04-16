package com.kuaishou.merchant.live.robot.LiveAudienceCartEffectPresenter$EffectMsg;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.k1;
import com.kuaishou.merchant.live.robot.LiveAudienceCartEffectPresenter$EffectMsg$Data;

public class LiveAudienceCartEffectPresenter$EffectMsg implements Serializable	// class@001ac7
{
    public LiveAudienceCartEffectPresenter$EffectMsg$Data mData;
    public String mReqId;
    public int mReqType;
    public static final long serialVersionUID = 0xe44c9ccd3d81e2d6;

    public void LiveAudienceCartEffectPresenter$EffectMsg(){
       super();
    }
    public static LiveAudienceCartEffectPresenter$EffectMsg create(float[] p0){
       LiveAudienceCartEffectPresenter$EffectMsg obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceCartEffectPresenter$EffectMsg.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveAudienceCartEffectPresenter$EffectMsg();
       obj.mReqId = String.valueOf(k1.j());
       obj.mReqType = 9;
       obj.mData = new LiveAudienceCartEffectPresenter$EffectMsg$Data(p0);
       return obj;
    }
}
