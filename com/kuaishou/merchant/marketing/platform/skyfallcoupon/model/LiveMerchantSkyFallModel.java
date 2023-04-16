package com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallModel;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import com.kuaishou.merchant.marketing.base.activitydispather.model.LiveMerchantPendentModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.marketing.base.activitydispather.model.LiveMerchantActivityModel;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.marketing.base.activitydispather.model.LiveMerchantAnimationModel;
import java.lang.Boolean;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopLiveActivityPendant;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopLiveActivityInfo;
import java.util.List;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallModel$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Number;
import java.lang.Integer;
import ot3.u0;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantReceiveSkyFallResponseModel;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantReceiveSkyFallModel;

public class LiveMerchantSkyFallModel implements Serializable, a	// class@001b4e
{
    public long mActivityEndTime;
    public String mActivityId;
    public String mActivitySessionId;
    public long mActivityStartTime;
    public int mActivityType;
    public List mAfterOpenMainTitleUrls;
    public String mAfterPopSubtitleColor;
    public List mBeforeOpenMainTitleUrls;
    public String mBuyerCouponId;
    public String mCarrierType;
    public int mChallengeChestMagicId;
    public int mChannelType;
    public String mCouponDisplayTitle;
    public String mCouponId;
    public int mCouponPrice;
    public int mCouponUseType;
    public long mExpireTime;
    public Map mExtraMap;
    public String mJumpLink;
    public String mJumpUrl;
    public List mKwaiLogoUrls;
    public LiveMerchantSkyFallStyleConfig mLiveMerchantSkyFallStyleConfig;
    public String mLottieUrl;
    public String mPendantBgImg;
    public int mPopUpStyle;
    public String mRequestId;
    public int mShowType;
    public String mSpliceActivityId;
    public int mStatus;
    public int mType;
    public String mUseConditionTitle;
    public String mUseRangeTitle;
    public static final long serialVersionUID = 0x7c3eab83694d274d;

    public void LiveMerchantSkyFallModel(){
       super();
    }
    public static LiveMerchantSkyFallModel create(LiveMerchantPendentModel p0){
       String obj = null;
       LiveMerchantPendentModel obj1 = PatchProxy.applyOneRefs(p0, obj, LiveMerchantSkyFallModel.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 != null) {
          obj1 = p0.mActivityModel;
          if (obj1 != null) {
             LiveMerchantActivityModel extraMap = obj1.extraMap;
             if (extraMap != null) {
                String str = "couponInfo";
                if (extraMap.containsKey(str)) {
                   String str1 = p0.mActivityModel.extraMap.get(str);
                   if (TextUtils.isEmpty(str1)) {
                      return obj;
                   }else {
                      obj = null;
                      p0 = p0.mLiveMerchantAnimationModel;
                      if (p0 != null) {
                         LiveMerchantAnimationModel animationSho = p0.animationShow;
                         if (animationSho != null) {
                            boolean b = animationSho.get("coupon_activity_action_photo").booleanValue();
                         }
                      }
                      LiveMerchantSkyFallModel liveMerchant = a.a.h(str1, LiveMerchantSkyFallModel.class);
                      int i = (b)? 1: 2;
                      liveMerchant.mShowType = i;
                      return liveMerchant;
                   }
                }
             }
          }
       }
       return obj;
    }
    public static LiveMerchantSkyFallModel create(LiveRoomSignalMessage$SCKwaishopLiveActivityPendant p0){
       Object obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, LiveMerchantSkyFallModel.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 != null) {
          p0 = p0.activityInfo;
          if (p0 != null) {
             LiveRoomSignalMessage$SCKwaishopLiveActivityInfo extraMap = p0.extraMap;
             if (extraMap != null) {
                obj1 = "couponInfo";
                if (extraMap.containsKey(obj1)) {
                   String str = extraMap.get(obj1);
                   if (TextUtils.isEmpty(str)) {
                      return obj;
                   }else {
                      return a.a.h(str, LiveMerchantSkyFallModel.class);
                   }
                }
             }
          }
       }
       return obj;
    }
    public final List a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantSkyFallModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = null;
       if (this.mExtraMap == null || TextUtils.isEmpty(p0)) {
          return list;
       }
       if (!this.mExtraMap.containsKey(p0)) {
          return list;
       }
       p0 = this.mExtraMap.get(p0);
       if (TextUtils.isEmpty(p0)) {
          return list;
       }
       return a.a.i(p0, new LiveMerchantSkyFallModel$a(this).getType());
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantSkyFallModel.class, "5")) {
          return;
       }
       LiveMerchantSkyFallModel tmExtraMap = this.mExtraMap;
       if (tmExtraMap != null) {
          this.mJumpLink = tmExtraMap.get("pullYellowCarLink");
          this.mKwaiLogoUrls = this.a("logoImg");
          this.mBeforeOpenMainTitleUrls = this.a("beforeOpenMainTitleImg");
          this.mAfterOpenMainTitleUrls = this.a("afterOpenMainTitleImg");
          this.mChallengeChestMagicId = this.b("magicAnimationId");
          this.mCouponUseType = this.b("couponUseType");
          this.mLottieUrl = this.mExtraMap.get("popUpWholeImgForAndroid");
          this.mPendantBgImg = this.mExtraMap.get("pendantBgImg");
          this.mAfterPopSubtitleColor = this.mExtraMap.get("subtitleBgColor");
          this.mRequestId = this.mExtraMap.get("requestId");
          this.mCarrierType = this.mExtraMap.get("carrierType");
          this.mSpliceActivityId = this.mExtraMap.get("spliceActivityId");
       }
       return;
    }
    public final int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantSkyFallModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.mExtraMap == null || TextUtils.isEmpty(p0)) {
          return -1;
       }
       if (!this.mExtraMap.containsKey(p0)) {
          return -1;
       }
       p0 = this.mExtraMap.get(p0);
       if (TextUtils.isEmpty(p0)) {
          return -1;
       }
       return Integer.parseInt(p0);
    }
    public boolean hasReceivedCoupon(){
       boolean b = true;
       if (b == this.mStatus) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isExpired(){
       LiveMerchantSkyFallModel tmExpireTime;
       Object obj = PatchProxy.apply(null, this, LiveMerchantSkyFallModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long l = u0.b();
       boolean b = false;
       if (this.mStatus == 1) {
          tmExpireTime = this.mExpireTime;
          if (tmExpireTime <= 0) {
             return b;
          }
       }else {
          tmExpireTime = this.mActivityEndTime;
       }
       if ((tmExpireTime - l) <= 0) {
          b = true;
       }
       return b;
    }
    public boolean isTheSameCouponAs(LiveMerchantSkyFallModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantSkyFallModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (TextUtils.equals(this.mActivitySessionId, p0.mActivitySessionId) && this.hasReceivedCoupon() == p0.hasReceivedCoupon()) {
          b = true;
       }
       return b;
    }
    public void updateResponse(LiveMerchantReceiveSkyFallResponseModel p0){
       if (p0 == null) {
          return;
       }
       p0 = p0.mLiveMerchantReceiveSkyFallModel;
       if (p0 == null) {
          return;
       }
       this.mStatus = 1;
       this.mCouponId = p0.mCouponId;
       this.mBuyerCouponId = p0.mBuyerCouponId;
       this.mCouponDisplayTitle = p0.mCouponDisplayTitle;
       this.mCouponPrice = p0.mCouponPrice;
       this.mUseConditionTitle = p0.mUseConditionTitle;
       this.mUseRangeTitle = p0.mUseRangeTitle;
       this.mType = p0.mType;
       this.mChannelType = p0.mChannelType;
       this.mExpireTime = p0.mExpireTime;
       this.mJumpLink = p0.mJumpLink;
       return;
    }
}
