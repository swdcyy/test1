package com.kwai.framework.model.user.AdBusinessInfo$Location;
import java.io.Serializable;
import java.lang.Object;

public class AdBusinessInfo$Location implements Serializable	// class@0016e9
{
    public String mAddress;
    public long mId;
    public boolean mInsideNavigation;
    public double mLatitude;
    public double mLongitude;
    public String mTitle;
    public static final long serialVersionUID = 0xb9ab19709f31e512;

    public void AdBusinessInfo$Location(){
       super();
       this.mInsideNavigation = false;
    }
}
