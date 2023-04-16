package com.kwai.components.nearbymodel.model.PoiCollectInfo;
import java.io.Serializable;
import java.lang.Object;

public class PoiCollectInfo implements Serializable	// class@000cbb
{
    public int mClickTimesOneDay;
    public String mCollectedTitle;
    public boolean mIsCollected;
    public int mNoClickContinuousDay;
    public int mNoShowDay;
    public String mPoiId;
    public int mShowTimesOneDay;
    public long mShowVideoMillis;
    public String mTitle;
    public static final long serialVersionUID = 0x165e1145c0bfc1c3;

    public void PoiCollectInfo(){
       super();
       this.mIsCollected = false;
    }
}
