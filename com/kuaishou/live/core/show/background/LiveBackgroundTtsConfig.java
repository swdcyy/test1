package com.kuaishou.live.core.show.background.LiveBackgroundTtsConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveBackgroundTtsConfig implements Serializable	// class@0009db
{
    public final int DEFAULT_LANGUAGE_TYPE;
    public final int DEFAULT_SPEAK_ID;
    public long mSpeakMessageCoolingTime;
    public int mTtsLanguageType;
    public int mTtsSpeakId;
    public static final long serialVersionUID = 0x32df60b1ec2a4789;

    public void LiveBackgroundTtsConfig(){
       super();
       this.DEFAULT_LANGUAGE_TYPE = 4;
       this.DEFAULT_SPEAK_ID = 0;
       this.mSpeakMessageCoolingTime = 0x493e0;
       this.mTtsLanguageType = 4;
       this.mTtsSpeakId = 0;
    }
}
