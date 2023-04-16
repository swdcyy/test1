package com.kwai.live.gzone.accompanyplay.api.LiveGzoneAccompanyFleetSettingResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveGzoneAccompanyFleetSettingResponse implements Serializable	// class@000b4f
{
    public String mAccompanyId;
    public int mAccompanyStatus;
    public String mFleetTitle;
    public LiveGzoneAccompanyGameFleetSetting mGameFleetSetting;
    public LiveGzoneAccompanyGameInfo mGameInfo;
    public LiveLinkBindConfig mLivelinkBindConfig;
    public String mRoundId;
    public int mRoundStatus;
    public static final long serialVersionUID = 0x97d289f4b2065f2d;

    public void LiveGzoneAccompanyFleetSettingResponse(){
       super();
    }
}
