package com.kuaishou.android.model.ads.SplashInfo$SlideInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;

public class SplashInfo$SlideInfo implements Serializable, Cloneable	// class@000aa0
{
    public boolean mClickDisabled;
    public int mConvertDistance;
    public String mLiveTitle;
    public int mSlidePercent;
    public String mSubtitle;
    public String mTitle;
    public static final long serialVersionUID = 0xfe4c08dd8b8edaf;

    public void SplashInfo$SlideInfo(){
       super();
       this.mClickDisabled = true;
    }
}
