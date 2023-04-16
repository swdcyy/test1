package com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Number;
import java.lang.NumberFormatException;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import android.net.Uri;
import ekd.x0;
import java.util.Collection;
import ekd.q;

public class MerchantAudienceParams implements Serializable	// class@001527
{
    public boolean mAnchoredOnce;
    public String mBrotherGroupBuyActivityId;
    public String mBrotherGroupBuyGroupId;
    public String mBrotherGroupBuyShareUserId;
    public long mBubbleDisplayMills;
    public long mCommodityAnchorDuration;
    public String mCommodityId;
    public String mGlobalMerchantExtraInfo;
    public String mJumpLink;
    public String mLiveShareToken;
    public int mLiveSourceType;
    public String mLiveStreamId;
    public String mMerchantDeliveryId;
    public String mMerchantExtraInfo;
    public int mMerchantFromType;
    public String mMerchantMarketingBizExtraInfo;
    public int mMerchantMarketingBizType;
    public int mMerchantPendantType;
    public int mMerchantRequestType;
    public int mMerchantSource;
    public String mPendantEventData;
    public int mPendantSourceType;
    public Map mQueryParamsMap;
    public String mRedPacketId;
    public String mSellerId;
    public String mShareSubBiz;
    public String mShareToken;
    public String mSharerId;
    public int mShowActionByServer;
    public String mSourceTag;
    public static final long serialVersionUID = 0xc6140c7df728b3d7;

    public void MerchantAudienceParams(){
       super();
       this.mAnchoredOnce = false;
       this.mLiveSourceType = 0;
       this.mQueryParamsMap = new HashMap();
    }
    public static MerchantAudienceParams a(Map p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       MerchantAudienceParams obj1 = PatchProxy.applyOneRefs(p0, obj, MerchantAudienceParams.class, "3");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = new MerchantAudienceParams();
       if (p0 != null && !p0.isEmpty()) {
          obj1.mQueryParamsMap = p0;
          obj1.mCommodityId = p0.get("itemId");
          obj1.mSellerId = p0.get("sellerId");
          obj1.mMerchantDeliveryId = p0.get("merchantDeliveryId");
          int i = MerchantAudienceParams.b(p0.get("merchantSource"), 0);
          obj1.mMerchantSource = i;
          if (i == 3) {
             obj1.mLiveSourceType = 123;
          }else if(i == 2){
             obj1.mLiveSourceType = 124;
          }
          obj1.mMerchantRequestType = MerchantAudienceParams.b(p0.get("merchantRequestType"), 0);
          String str = p0.get("itemTwinkleIntervalMills");
          long l = 0;
          if (PatchProxy.isSupport(MerchantAudienceParams.class)) {
             obj = PatchProxy.applyTwoRefs(str, Long.valueOf(l), obj, MerchantAudienceParams.class, "7");
             if (obj != patchProxyRe) {
                l = obj.longValue();
             }else {
                try{
                label_0092 :
                   l = Long.parseLong(str);
                }catch(java.lang.NumberFormatException e0){
                   e0.printStackTrace();
                }
             }
          }else {
             goto label_0092 ;
          }
       }
    label_0160 :
       return obj1;
    }
    public static int b(String p0,int p1){
       if (PatchProxy.isSupport(MerchantAudienceParams.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, MerchantAudienceParams.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return Integer.parseInt(p0);
       }catch(java.lang.NumberFormatException e4){
          e4.printStackTrace();
          return p1;
       }
    }
    public static MerchantAudienceParams parseMerchantExtraInfo(String p0){
       JsonObject obj = PatchProxy.applyOneRefs(p0, null, MerchantAudienceParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return new MerchantAudienceParams();
       }
       try{
          obj = a.a.h(p0, JsonObject.class);
       }catch(java.lang.Exception e0){
          obj = new JsonObject();
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = obj.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          try{
             hashMap.put(uEntry.getKey(), uEntry.getValue().w());
          }catch(java.lang.Exception e0){
             hashMap.put(uEntry.getKey(), uEntry.getValue().toString());
             goto label_0039 ;
          }
       }
       hashMap.put("merchantExtraInfo", p0);
       return MerchantAudienceParams.a(hashMap);
    }
    public static MerchantAudienceParams parseUri(Uri p0){
       MerchantAudienceParams merchantAudi;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MerchantAudienceParams obj = PatchProxy.applyOneRefs(p0, null, MerchantAudienceParams.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new MerchantAudienceParams();
       if (p0 == null) {
          return obj;
       }
       String queryParamet = p0.getQueryParameter("merchantExtraInfo");
       if (!TextUtils.x(queryParamet)) {
          merchantAudi = MerchantAudienceParams.parseMerchantExtraInfo(queryParamet);
       }else {
          HashMap hashMap = PatchProxy.applyOneRefs(p0, null, MerchantAudienceParams.class, "5");
          if (hashMap != patchProxyRe) {
          }else {
             hashMap = new HashMap();
             Set set = x0.c(p0);
             if (!q.f(set)) {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   if (!TextUtils.x(str)) {
                      String str1 = x0.a(p0, str);
                      if (!TextUtils.x(str1)) {
                         hashMap.put(str, str1);
                      }
                   }
                }
             }
          }
          merchantAudi = MerchantAudienceParams.a(hashMap);
       }
       try{
          if (!PatchProxy.applyVoidTwoRefs(merchantAudi, p0, null, MerchantAudienceParams.class, "4")) {
             queryParamet = p0.toString();
             merchantAudi.mJumpLink = queryParamet;
             merchantAudi.mLiveStreamId = p0.getLastPathSegment();
          }
          return merchantAudi;
       }catch(java.lang.Exception e0){
       }
    }
}
