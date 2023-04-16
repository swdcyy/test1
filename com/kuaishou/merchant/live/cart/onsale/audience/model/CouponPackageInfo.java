package com.kuaishou.merchant.live.cart.onsale.audience.model.CouponPackageInfo;
import mkd.a;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class CouponPackageInfo implements a, Serializable	// class@001953
{
    public String mCount;
    public String mCountUnit;
    public String mCouponId;
    public String mCouponName;
    public int mCouponPackageStatus;
    public int mCouponType;
    public String mCouponTypeMsg;
    public String mFirstNotice;
    public String mPrice;
    public String mPriceUnit;
    public String mPurchasePattern;
    public String mPurchaseText;
    public static final long serialVersionUID = 0xc049d2ae3bf02c9d;

    public void CouponPackageInfo(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, CouponPackageInfo.class, "1")) {
          return;
       }
       this.mPurchasePattern = (!TextUtils.x(this.mPurchasePattern))? (this.mPurchasePattern).replace("${0}", "%s"): "";
       return;
    }
}
