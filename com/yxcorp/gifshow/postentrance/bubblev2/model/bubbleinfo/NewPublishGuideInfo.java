package com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.NewPublishGuideInfo;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.HomeOperateIconInfo;

public class NewPublishGuideInfo implements Serializable	// class@00100f
{
    public List gradientColors;
    public HomeOperateIconInfo leftIconInfo;
    public String mBackGroundColor;
    public int mBackgroundType;
    public String mCameraIconExpandBottomBarV2;
    public String mGradientColorFrom;
    public String mGradientColorTo;
    public int mGradientDirection;
    public String mImage;
    public String mRightTopImage;
    public String mSubTitleColor;
    public String mTitleColor;
    public HomeOperateIconInfo rightIconInfo;
    public HomeOperateIconInfo topIconInfo;
    public static final long serialVersionUID = 0x9722cd5c7d522ac4;

    public void NewPublishGuideInfo(){
       super();
       this.leftIconInfo = new HomeOperateIconInfo();
       this.rightIconInfo = new HomeOperateIconInfo();
       this.topIconInfo = new HomeOperateIconInfo();
    }
}
