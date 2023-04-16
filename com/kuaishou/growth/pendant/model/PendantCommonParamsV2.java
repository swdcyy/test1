package com.kuaishou.growth.pendant.model.PendantCommonParamsV2;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.PendantCommonParamsV2$a;
import nsd.u;
import java.lang.Object;

public final class PendantCommonParamsV2 implements Serializable	// class@000670
{
    public int mCloseCount;
    public boolean mIsAdsorbedStatus;
    public int mPendantX;
    public int mPendantY;
    public static final PendantCommonParamsV2$a Companion;
    public static final long serialVersionUID;

    static {
       PendantCommonParamsV2.Companion = new PendantCommonParamsV2$a(null);
    }
    public void PendantCommonParamsV2(){
       super();
       this.mPendantX = Integer.MIN_VALUE;
       this.mPendantY = Integer.MIN_VALUE;
    }
    public final int getMCloseCount(){
       return this.mCloseCount;
    }
    public final boolean getMIsAdsorbedStatus(){
       return this.mIsAdsorbedStatus;
    }
    public final int getMPendantX(){
       return this.mPendantX;
    }
    public final int getMPendantY(){
       return this.mPendantY;
    }
    public final void setMCloseCount(int p0){
       this.mCloseCount = p0;
    }
    public final void setMIsAdsorbedStatus(boolean p0){
       this.mIsAdsorbedStatus = p0;
    }
    public final void setMPendantX(int p0){
       this.mPendantX = p0;
    }
    public final void setMPendantY(int p0){
       this.mPendantY = p0;
    }
}
