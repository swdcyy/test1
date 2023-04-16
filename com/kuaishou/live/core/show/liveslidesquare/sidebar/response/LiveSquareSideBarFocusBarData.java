package com.kuaishou.live.core.show.liveslidesquare.sidebar.response.LiveSquareSideBarFocusBarData;
import java.io.Serializable;
import java.lang.Object;

public class LiveSquareSideBarFocusBarData implements Serializable	// class@000ca6
{
    public CDNUrl[] mImageUrls;
    public boolean mIsShown;
    public String mJumpText;
    public String mJumpUrl;
    public String mSubTitle;
    public String mTitle;
    public static final long serialVersionUID = 0x196180c002f29f8b;

    public void LiveSquareSideBarFocusBarData(){
       super();
       this.mIsShown = false;
    }
}
