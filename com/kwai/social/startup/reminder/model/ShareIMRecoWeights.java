package com.kwai.social.startup.reminder.model.ShareIMRecoWeights;
import java.lang.Object;

public class ShareIMRecoWeights	// class@000f79
{
    public float mIntimacyWeight;
    public float mSendCountWeight;
    public float mShareTimeWeight;

    public void ShareIMRecoWeights(){
       super();
       this.mIntimacyWeight = 0x3f800000;
       this.mSendCountWeight = 0;
       this.mShareTimeWeight = 0;
    }
}
