package com.kuaishou.live.core.voiceparty.model.MicSeatLevelInfoResponse;
import java.io.Serializable;
import java.lang.Object;

public class MicSeatLevelInfoResponse implements Serializable	// class@0017a5
{
    public MicSeatLevelInterest[] interestList;
    public MicSeatLevelInfoResponse$LevelCardItem[] levelCardList;
    public MicSeatLevelInfo levelInfo;
    public MicSeatLevelInfoResponse$ExperienceInfo micSeatUserLevelExperienceInfo;
    public MicSeatLevelUserInfo userInfo;
    public static final long serialVersionUID = 0x4081489a5986d0b9;

    public void MicSeatLevelInfoResponse(){
       super();
    }
}
