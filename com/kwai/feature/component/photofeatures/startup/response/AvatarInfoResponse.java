package com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.io.Serializable;
import java.lang.Object;

public class AvatarInfoResponse implements Serializable	// class@001273
{
    public boolean mCircleFlicker;
    public boolean mDisplayLiveHead;
    public DynamicEffectMarker mDynamicEffectMarker;
    public boolean mHeadFlicker;
    public boolean mIsLive;
    public boolean mIsShopLive;
    public int mLiveAvatarType;
    public int mLiveFontTipsSize;
    public String mLiveTipLink;
    public int mLiveTipType;
    public String mLiveTipsText;
    public LiveWindowConfig mLiveWindowConfig;
    public QPhoto mPhoto;
    public int mPhotoCount;
    public int mType;
    public static final long serialVersionUID = 0xa2ea2f5651150bb8;

    public void AvatarInfoResponse(){
       super();
       this.mDisplayLiveHead = true;
       this.mHeadFlicker = true;
       this.mCircleFlicker = true;
    }
}
