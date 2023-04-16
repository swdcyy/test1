package com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction;
import java.io.Serializable;
import java.lang.Object;

public class PhotoAdvertisement$InspireAction implements Serializable	// class@000961
{
    public String mActionBar;
    public int mActiveAppRewardValue;
    public String mAwardType;
    public List mFakeComment;
    public String mFakeCommentUrl;
    public int mMinActionTimeMs;
    public int mPecStyle;
    public int mPecType;
    public PhotoAdvertisement$SecondNeoInfo mSecondNeoInfo;
    public static final long serialVersionUID = 0xec04e3b9b196655a;

    public void PhotoAdvertisement$InspireAction(){
       super();
       this.mAwardType = "PLAY_ENOUGH_TIME";
    }
}
