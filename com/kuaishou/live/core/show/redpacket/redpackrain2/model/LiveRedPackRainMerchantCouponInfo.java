package com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainMerchantCouponInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import java.lang.StringBuilder;

public class LiveRedPackRainMerchantCouponInfo implements Serializable	// class@000f05
{
    public String couponBackgroungColor;
    public String couponEndTime;
    public String couponFrontColor;
    public String couponTypeIcon;
    public String itemTitle;
    public List mBrandBackground;
    public List mBrandIcon;
    public String mCouponName;
    public boolean mIsFreePost;
    public String mOriginalPrice;
    public String priceFrontColor;
    public String showPrice;
    public String targetUseLimit;
    public String thresholdUseLimit;
    public long validityTime;
    public int validityType;
    public static final long serialVersionUID = 0xef1fe3d0c71a4b15;

    public void LiveRedPackRainMerchantCouponInfo(){
       super();
    }
    public static LiveRedPackRainMerchantCouponInfo parseLiveRedPackRainMerchantCouponInfo(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRedPackRainMerchantCouponInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Gson().h(p0, LiveRedPackRainMerchantCouponInfo.class);
    }
    public String getOriginalPriceWithTag(){
       String str;
       LiveRedPackRainMerchantCouponInfo obj = PatchProxy.apply(null, this, LiveRedPackRainMerchantCouponInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mOriginalPrice;
       if (obj == null) {
          str = "";
       }
       if (!str.startsWith("гд")) {
          str = "гд"+str;
       }
       return str;
    }
}
