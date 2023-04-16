package com.yxcorp.gifshow.model.MagicGuideParams;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;

public class MagicGuideParams implements Serializable, Cloneable	// class@001e56
{
    public boolean mAlwaysPop;
    public long mImageShowTime;
    public CDNUrl[] mImages;
    public String mLinkTitle;
    public String mLinkUrl;
    public int mMaxPopNum;
    public int mNewStyleCloseBtnMarginBottom;
    public CDNUrl[] mNewStyleCloseBtnUrl;
    public String mRelatedPopId;
    public int mShowType;
    public String mTitle;
    public int mVideoPlayCount;
    public CDNUrl[] mVideos;
    public static final long serialVersionUID = 0xed71aa88c323b346;

    public void MagicGuideParams(){
       super();
    }
    public boolean isActivityGuideStyle(){
       boolean b = true;
       if (this.mShowType == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isFullScreenWithMaskGuideStyle(){
       boolean b = (this.mShowType == null)? true: false;
       return b;
    }
    public boolean isHalfScreenNoneMaskGuideStyle(){
       boolean b = (this.mShowType == 2)? true: false;
       return b;
    }
}
