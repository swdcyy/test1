package com.kuaishou.live.core.show.flowdiversion.pay.model.LivePkFlowDiversionPayInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class LivePkFlowDiversionPayInfo implements Serializable	// class@000ba6
{
    public String mCpcPayEncrypted;
    public int mInvitationSource;
    public int mLiveFlowDiversionType;
    public static final long serialVersionUID = 0x5d092c4496bd46d;

    public void LivePkFlowDiversionPayInfo(){
       super();
    }
    public void LivePkFlowDiversionPayInfo(int p0,int p1,String p2){
       super();
       this.mLiveFlowDiversionType = p0;
       this.mInvitationSource = p1;
       this.mCpcPayEncrypted = p2;
    }
}
