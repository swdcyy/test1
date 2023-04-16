package com.kuaishou.live.core.show.profilecard.http.LiveMerchantShopEntranceInfo$ShopScoreInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.show.profilecard.http.LiveMerchantShopEntranceInfo$TextStyle;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;

public class LiveMerchantShopEntranceInfo$ShopScoreInfo implements Serializable	// class@000dc3
{
    public String mExpLevelStr;
    public String mExpScoreStr;
    public boolean mHidden;
    public String mShowName;
    public LiveMerchantShopEntranceInfo$TextStyle mStyle;
    public static final long serialVersionUID = 0x937c76287d446d97;

    public void LiveMerchantShopEntranceInfo$ShopScoreInfo(){
       super();
    }
    public int getTextColor(){
       LiveMerchantShopEntranceInfo$ShopScoreInfo obj = PatchProxy.apply(null, this, LiveMerchantShopEntranceInfo$ShopScoreInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mStyle;
       int i = 0x7f061da9;
       if (obj == null || TextUtils.x(obj.mFontColor)) {
          return a1.a(i);
       }
       return TextUtils.J(this.mStyle.mFontColor, a1.a(i));
    }
}
