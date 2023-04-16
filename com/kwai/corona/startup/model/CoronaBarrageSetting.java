package com.kwai.corona.startup.model.CoronaBarrageSetting;
import java.lang.Object;

public class CoronaBarrageSetting	// class@000ce6
{
    public List mColors;
    public List mDanmakuActivityInfo;
    public DanmakuForceSwitch mDanmakuForceSwitch;
    public CoronaBarrageSetting$DanmakuInputHint mDanmakuInputHint;
    public DanmakuServerSetting mDanmakuServerSetting;
    public Boolean mDanmakuSwitch;
    public Long mDefaultImagePhotoDuration;
    public String mDevicePrice;
    public int mEnableDanmakuSwitch;
    public boolean mEverDanmakuOn;
    public int mMaxDanmakuBodyLength;
    public Boolean mUserAlreadySetDanmakuSetting;
    public boolean mUserDanmakuGuide;
    public boolean mYoungAgePass;

    public void CoronaBarrageSetting(){
       super();
       this.mDanmakuSwitch = null;
       this.mMaxDanmakuBodyLength = 25;
    }
}
