package com.kuaishou.growth.pendant.core.response.PendantCommonParams;
import java.io.Serializable;
import java.lang.Object;

public class PendantCommonParams implements Serializable	// class@000651
{
    public int mCloseCount;
    public boolean mIsAdsorbedStatus;
    public int mPendantX;
    public int mPendantY;
    public static final long serialVersionUID = 0x54df727d270c3b1a;

    public void PendantCommonParams(){
       super();
       this.mPendantX = Integer.MIN_VALUE;
       this.mPendantY = Integer.MIN_VALUE;
    }
}
