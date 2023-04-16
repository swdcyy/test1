package com.kuaishou.merchant.live.basic.model.GeneralCouponInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveGeneralCouponSignal;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$GeneralCouponInfo;

public class GeneralCouponInfo implements Serializable	// class@001894
{
    public GeneralCouponInfo$Button mButton;
    public String mCouponId;
    public String mCouponName;
    public String mCouponPrice;
    public int mCurrency;
    public String mDesc;
    public String mEndTime;
    public long mExpireTime;
    public String mJumpUrl;
    public long mNextShowTime;
    public String mPrefix;
    public String mShowBackgroundColor;
    public String mShowChineseColor;
    public String mShowNumberColor;
    public int mShowTime;
    public int mStatus;
    public String mSuffix;
    public String mTotal;
    public int mType;
    public String mUseConditionTitle;
    public String mUseRangeTitle;
    public static final GeneralCouponInfo EMPTY;
    public static final long serialVersionUID;

    static {
       GeneralCouponInfo.EMPTY = new GeneralCouponInfo();
    }
    public void GeneralCouponInfo(){
       super();
    }
    public static GeneralCouponInfo parse(LiveRoomSignalMessage$LiveGeneralCouponSignal p0){
       GeneralCouponInfo obj = PatchProxy.applyOneRefs(p0, null, GeneralCouponInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GeneralCouponInfo();
       obj.mCouponId = p0.couponId;
       p0 = p0.couponInfo;
       if (p0 == null) {
          return obj;
       }
       obj.mCouponName = p0.couponName;
       obj.mCouponPrice = p0.couponPrice;
       obj.mEndTime = p0.endTime;
       obj.mUseRangeTitle = p0.useRangeTitle;
       obj.mUseConditionTitle = p0.useConditionTitle;
       return obj;
    }
}
