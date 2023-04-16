package com.kwai.components.nearbymodel.model.PoiLocation;
import java.io.Serializable;
import java.lang.Object;

public class PoiLocation implements Serializable	// class@000cbe
{
    public String mAddress;
    public String mAuthorId;
    public CDNUrl[] mCoverUrls;
    public double mDistance;
    public boolean mHasReport;
    public int mIconColor;
    public String mIconText;
    public String mId;
    public boolean mIsFullSpan;
    public boolean mIsShowed;
    public String mLatitude;
    public String mLongitude;
    public String mPhotoId;
    public int mPosition;
    public String mTitle;
    public static final long serialVersionUID = 0x4cc4a8eb4ba2670b;

    public void PoiLocation(){
       super();
    }
}
