package com.kuaishou.live.core.show.paidshow.model.LivePaidShowInfo;
import java.io.Serializable;
import java.lang.Object;

public class LivePaidShowInfo implements Serializable	// class@000d4c
{
    public boolean mEnablePaidShow;
    public long mMaxFreeWatchingMs;
    public int mMaxKsCoinCost;
    public long mMinFreeWatchingMs;
    public int mMinKsCoinCost;
    public static final long serialVersionUID = 0xf0dbcd86057273fc;

    public void LivePaidShowInfo(){
       super();
    }
}
