package com.yxcorp.gifshow.model.PoiBriefInfo;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.model.PoiBriefInfo$RecommendPoiType;

public class PoiBriefInfo implements Serializable	// class@001e70
{
    public String mAddress;
    public int mCategory;
    public String mCity;
    public int mId;
    public boolean mIsShowed;
    public double mLatitude;
    public double mLongitude;
    public PoiBriefInfo$RecommendPoiType mRecommendType;
    public String mTitle;
    public static final long serialVersionUID = 0xc01714d233f644f;

    public void PoiBriefInfo(){
       super();
       this.mRecommendType = PoiBriefInfo$RecommendPoiType.POI;
    }
}
