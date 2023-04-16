package com.kuaishou.live.core.show.flowdiversion.pay.model.LiveFlowDiversionPaySellingChatInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveFlowDiversionPaySellingChatInfo implements Serializable	// class@000ba3
{
    public LiveFlowDiversionCpcInfoV2 mCpcInfo;
    public LiveFlowDiversionPaySellingChatInfo$LiveCpsInfo mCpsInfo;
    public LiveFlowDiversionPaySellingChatInfo$LiveFlowDiversionInviteParam mInviteParam;
    public int mLiveFlowDiversionType;
    public LiveFlowDiversionPaySellingChatInfo$LiveFlowDiversionOnInviteParam mOnInviteParam;
    public static final long serialVersionUID = 0x6243bb7a03d0f226;

    public void LiveFlowDiversionPaySellingChatInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveFlowDiversionPaySellingChatInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveFlowDiversionPaySellingChatInfo{mBillingType="+this.mLiveFlowDiversionType+", mLiveCpsInfo="+this.mCpsInfo+'}';
    }
}
