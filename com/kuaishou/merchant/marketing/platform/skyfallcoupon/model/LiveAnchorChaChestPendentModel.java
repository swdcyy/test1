package com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveAnchorChaChestPendentModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.kuaishou.merchant.marketing.platform.MerchantMarketingPlatformLogBiz;
import java.lang.StringBuilder;
import java.lang.Exception;
import p74.a;
import o74.a;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopLiveActivityPendant;

public class LiveAnchorChaChestPendentModel implements Serializable	// class@001b46
{
    public String mActivityIds;
    public int mActivityType;
    public int mTreasureBoxNum;
    public static final long serialVersionUID = 0xd3a8caa9e53bee59;

    public void LiveAnchorChaChestPendentModel(){
       super();
    }
    public static int a(Map p0,String p1){
       String str;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveAnchorChaChestPendentModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          if (p0 == null || TextUtils.isEmpty(p1)) {
          }else {
             str = p0.get(p1);
             if (TextUtils.isEmpty(str)) {
                return 0;
             }
             return Integer.parseInt(str);
          }
       }catch(java.lang.Exception e5){
          a.g(MerchantMarketingPlatformLogBiz.CHALLENGE_CHEST, "parse_string_to_int_error", "value is "+str+"\n"+e5.getMessage());
       }
       return 0;
    }
    public void update(LiveRoomSignalMessage$SCKwaishopLiveActivityPendant p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorChaChestPendentModel.class, "1")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.extraMap;
          if (p0 != null) {
             this.mTreasureBoxNum = LiveAnchorChaChestPendentModel.a(p0, "activityAmount");
             this.mActivityIds = p0.get("activityIds");
             this.mActivityType = LiveAnchorChaChestPendentModel.a(p0, "activityType");
          }
       }
       return;
    }
}
