package com.yxcorp.gifshow.model.MagicFaceIconTipMsg;
import java.io.Serializable;
import java.lang.Object;

public class MagicFaceIconTipMsg implements Serializable	// class@001e55
{
    public int mBackgroundAlpha;
    public CDNUrl[] mIconUrls;
    public String mMsgColor;
    public String mMsgText;
    public int mStrategyId;
    public String mTipBackGroundEndColor;
    public String mTipBackGroundStartColor;
    public int mWeight;

    public void MagicFaceIconTipMsg(){
       super();
       this.mBackgroundAlpha = 50;
    }
}
