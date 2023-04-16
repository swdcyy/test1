package com.kuaishou.live.core.show.liveslidesquare.sidebar.response.LiveSquareSideBarTabData;
import java.io.Serializable;
import java.lang.Object;

public class LiveSquareSideBarTabData implements Serializable	// class@000cad
{
    public String mExpTag;
    public CDNUrl[] mImageUrl;
    public int mIndex;
    public boolean mIsShown;
    public String mName;
    public List mSubTabs;
    public String mTabId;
    public String mTargetUrl;
    public static final long serialVersionUID = 0x7afff0052473390f;

    public void LiveSquareSideBarTabData(){
       super();
       this.mIsShown = false;
    }
}
