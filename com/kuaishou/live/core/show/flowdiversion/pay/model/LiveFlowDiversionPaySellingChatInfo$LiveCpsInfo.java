package com.kuaishou.live.core.show.flowdiversion.pay.model.LiveFlowDiversionPaySellingChatInfo$LiveCpsInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveFlowDiversionPaySellingChatInfo$LiveCpsInfo implements Serializable	// class@000ba0
{
    public String mCpsPrepareInvitePaneRouterUrl;
    public static final long serialVersionUID = 0x9940493d56cfba89;

    public void LiveFlowDiversionPaySellingChatInfo$LiveCpsInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveFlowDiversionPaySellingChatInfo$LiveCpsInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCpsInfo{mPrepareInvitePanelUrl=\'"+this.mCpsPrepareInvitePaneRouterUrl+'''+'}';
    }
}
