package com.kuaishou.live.common.core.component.line.model.LiveInteractBannerInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class LiveInteractBannerInfo implements Serializable	// class@001481
{
    public List mBackgroundImg;
    public String mButtonDesc;
    public List mButtonImg;
    public String mButtonJumpUrl;
    public List mDesc;
    public boolean mEnableClick;
    public List mHeadImg;
    public String mLogParams;
    public int mStartMatchType;
    public List mTitle;
    public int mType;

    public void LiveInteractBannerInfo(){
       super();
       this.mHeadImg = new ArrayList();
       this.mBackgroundImg = new ArrayList();
       this.mButtonImg = new ArrayList();
    }
}
