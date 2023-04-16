package com.kuaishou.android.model.mix.LiveSquareParams;
import java.io.Serializable;
import java.lang.Object;

public class LiveSquareParams implements Serializable	// class@000d0a
{
    public boolean mIsLiveSquareSourceFeed;
    public int mLiveSquareReferLiveSourceType;
    public int mLiveSquareSourceFeedLiveSourceType;
    public static final long serialVersionUID = 0x43e93b7d2903c98d;

    public void LiveSquareParams(){
       super();
       this.mIsLiveSquareSourceFeed = false;
    }
}
