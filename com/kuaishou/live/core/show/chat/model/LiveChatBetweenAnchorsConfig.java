package com.kuaishou.live.core.show.chat.model.LiveChatBetweenAnchorsConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveChatBetweenAnchorsConfig implements Serializable	// class@000a17
{
    public String mChatChooseApplyUserTipContent;
    public long mConnectingStateTimeoutDuration;
    public long mEstablishedStateTimeoutDuration;
    public long mInvitationDialogCountDownDuration;
    public long[] mPopGuidePromptDelayTimeGaps;
    public long mPopGuidePromptDuration;

    public void LiveChatBetweenAnchorsConfig(){
       super();
       long[] olongArray = new long[0];
       this.mPopGuidePromptDelayTimeGaps = olongArray;
       this.mPopGuidePromptDuration = 0;
       this.mConnectingStateTimeoutDuration = 0x4e20;
       this.mEstablishedStateTimeoutDuration = 0x4e20;
       this.mInvitationDialogCountDownDuration = 0x3a98;
       this.mChatChooseApplyUserTipContent = "";
    }
}
