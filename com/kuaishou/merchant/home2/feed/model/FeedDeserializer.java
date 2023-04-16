package com.kuaishou.merchant.home2.feed.model.FeedDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import com.google.gson.JsonObject;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import com.kuaishou.merchant.home2.feed.model.UnknownFeed;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import java.lang.Integer;
import p74.a;
import o74.a;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.home2.feed.model.PhotoFeed;
import com.kuaishou.merchant.home2.feed.model.LiveFeed;
import com.kuaishou.merchant.home2.feed.model.ActivityVideoFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Throwable;

public class FeedDeserializer implements b	// class@0008fa
{

    public void FeedDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       BaseFeed uBaseFeed;
       LiveFeed mFeedLogCtx;
       try{
          uBaseFeed = PatchProxy.applyThreeRefs(p0, p1, p2, this, FeedDeserializer.class, "2");
          if (uBaseFeed != PatchProxyResult.class) {
          }else {
             String str = "type";
             int i = p0.r().e0(str).p();
             Class clazz = FeedType.fromInt(i).getClazz();
             if (clazz == UnknownFeed.class) {
                a.h(MerchantHomeLogBiz.Feed, "Feed", "unknown feed", str, Integer.valueOf(i));
             }
             BaseFeed uBaseFeed1 = a.a.d(p0, clazz);
             try{
                LiveFeed liveFeed = null;
                if (i != FeedType.LIVE.mType && (i == FeedType.ACTIVITY_LIVE.mType || i == FeedType.BRAND_LIVE_CARD.mType)) {
                   liveFeed = uBaseFeed1.mQPhoto;
                   mFeedLogCtx = uBaseFeed1.mFeedLogCtx;
                }else if(i == FeedType.PHOTO.mType){
                   liveFeed = uBaseFeed1.mQPhoto;
                   mFeedLogCtx = uBaseFeed1.mFeedLogCtx;
                }else if(i == FeedType.ACTIVITY_VIDEO.mType){
                   liveFeed = uBaseFeed1.mVideoQPhoto;
                   mFeedLogCtx = uBaseFeed1.mFeedLogCtx;
                }else {
                   mFeedLogCtx = liveFeed;
                }
                if (liveFeed != null) {
                   liveFeed.setListLoadSequenceID(uBaseFeed1.mListLoadSequenceID);
                   CommonMeta commonMeta = liveFeed.getCommonMeta();
                   if (commonMeta != null) {
                      commonMeta.mFeedLogCtx = mFeedLogCtx;
                   }
                }
             }catch(java.lang.Exception e10){
                a.l(MerchantHomeLogBiz.Feed, "Feed", "failed to get QPhoto", e10);
             }
          label_009d :
             uBaseFeed = uBaseFeed1;
          }
       }catch(java.lang.Exception e9){
          a.l(MerchantHomeLogBiz.Feed, "Feed", "unknown feed", e9);
          uBaseFeed = new UnknownFeed();
       }
       return uBaseFeed;
    }
}
