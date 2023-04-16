package com.kuaishou.merchant.api.core.model.Commodity$CommodityActivityInfo;
import java.io.Serializable;
import java.lang.Object;

public class Commodity$CommodityActivityInfo implements Serializable	// class@001513
{
    public long mCurrent;
    public String mId;
    public String mRestrictiveDesc;
    public long mRestrictiveThreshold;
    public int mRestrictiveType;
    public int mShowType;
    public int mSoldStatus;
    public int mSoldStock;
    public int mStatus;
    public String mStatusDesc;
    public String mTip;
    public int mTotalStock;
    public List mWelfareLabelInfos;
    public static final long serialVersionUID = 0xa0e12bdfc6bdd4ae;

    public void Commodity$CommodityActivityInfo(){
       super();
    }
    public boolean isShareAndNotAvailable(){
       boolean b = (this.mRestrictiveType == 9 && this.mStatus == null)? true: false;
       return b;
    }
    public boolean isWatchTime(){
       Commodity$CommodityActivityInfo tmShowType = this.mShowType;
       boolean b = true;
       if (tmShowType != b && tmShowType != 2) {
          tmShowType = this.mRestrictiveType;
          if (tmShowType != b && tmShowType != 8) {
             b = false;
          }
       }
       return b;
    }
}
