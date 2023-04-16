package com.kuaishou.live.core.voiceparty.model.VoicePartyInfo;
import java.io.Serializable;
import java.lang.Object;

public class VoicePartyInfo implements Serializable	// class@0017b3
{
    public String mAryaConfig;
    public VoicePartyInfo$CommonInfo mCommonInfo;
    public String mEditTopicTip;
    public int mEstablishTimeoutMs;
    public String mId;
    public int mMaxTopicLength;
    public List mMicSeatsInfo;
    public static final long serialVersionUID = 0x46fae4e8ede98f13;

    public void VoicePartyInfo(){
       super();
       this.mEstablishTimeoutMs = 0x4e20;
    }
}
