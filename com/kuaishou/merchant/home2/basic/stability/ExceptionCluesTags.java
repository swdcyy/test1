package com.kuaishou.merchant.home2.basic.stability.ExceptionCluesTags;
import java.lang.Enum;
import java.lang.String;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.model.FeedPage;
import com.kwai.framework.exceptionhandler.ExceptionClues;
import zk.f;
import com.google.gson.JsonElement;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.JsonArray;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo;

public final class ExceptionCluesTags extends Enum	// class@0016ec
{
    public final String value;
    public static final ExceptionCluesTags[] $VALUES;
    public static final ExceptionCluesTags MerchantFeedPage;
    public static final ExceptionCluesTags MerchantFeedPageCache;
    public static final ExceptionCluesTags MerchantHomePage;
    public static final ExceptionCluesTags MerchantHomePageCache;
    public static final ExceptionCluesTags MerchantHomePageError;
    public static WeakReference homePageJsonRef;

    static {
       ExceptionCluesTags uExceptionCl = new ExceptionCluesTags("MerchantHomePageCache", 0, "MerchantHomePageCache");
       ExceptionCluesTags.MerchantHomePageCache = uExceptionCl;
       ExceptionCluesTags uExceptionCl1 = new ExceptionCluesTags("MerchantHomePageError", 1, "MerchantHomePageError");
       ExceptionCluesTags.MerchantHomePageError = uExceptionCl1;
       ExceptionCluesTags uExceptionCl2 = new ExceptionCluesTags("MerchantHomePage", 2, "MerchantHomePage");
       ExceptionCluesTags.MerchantHomePage = uExceptionCl2;
       ExceptionCluesTags uExceptionCl3 = new ExceptionCluesTags("MerchantFeedPageCache", 3, "MerchantFeedPageCache");
       ExceptionCluesTags.MerchantFeedPageCache = uExceptionCl3;
       ExceptionCluesTags uExceptionCl4 = new ExceptionCluesTags("MerchantFeedPage", 4, "MerchantFeedPage");
       ExceptionCluesTags.MerchantFeedPage = uExceptionCl4;
       ExceptionCluesTags[] uExceptionCl5 = new ExceptionCluesTags[]{uExceptionCl,uExceptionCl1,uExceptionCl2,uExceptionCl3,uExceptionCl4};
       ExceptionCluesTags.$VALUES = uExceptionCl5;
       ExceptionCluesTags.homePageJsonRef = new WeakReference(null);
    }
    public void ExceptionCluesTags(String p0,int p1,String p2){
       super(p0, p1);
       this.value = p2;
    }
    public static String getHomePageJson(){
       Object obj = PatchProxy.apply(null, null, ExceptionCluesTags.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ExceptionCluesTags.homePageJsonRef.get();
    }
    public static void logFeed(ExceptionCluesTags p0,FeedPage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ExceptionCluesTags.class, "6")) {
          return;
       }
       if (p1 == null) {
          ExceptionClues.c.c(p0.toString(), f.a);
          return;
       }else {
          boolean b = a.t().d("AnotherWayForMerchantHomeCache", false);
          JsonArray jsonArray = new JsonArray();
          if (!q.f(p1.mFeeds)) {
             Iterator iterator = p1.mFeeds.iterator();
             while (iterator.hasNext()) {
                BaseFeed uBaseFeed = iterator.next();
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("id", uBaseFeed.getId());
                jsonObject.a0("type", Integer.valueOf(uBaseFeed.mType));
                jsonArray.G(jsonObject);
             }
          }
          JsonObject jsonObject1 = new JsonObject();
          jsonObject1.a0("timeMils", Long.valueOf(p1.mResponseTime));
          jsonObject1.H("isAnotherWay", Boolean.valueOf(b));
          jsonObject1.G("feeds", jsonArray);
          ExceptionClues.c.c(p0.toString(), jsonObject1);
          return;
       }
    }
    public static void logPage(ExceptionCluesTags p0,HomePage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ExceptionCluesTags.class, "7")) {
          return;
       }
       if (p1 == null) {
          ExceptionClues.c.c(p0.toString(), f.a);
          return;
       }else {
          JsonArray jsonArray = new JsonArray();
          if (!q.f(p1.mFeedChannelList)) {
             Iterator iterator = p1.mFeedChannelList.iterator();
             while (iterator.hasNext()) {
                FeedChannelInfo uFeedChannel = iterator.next();
                JsonObject jsonObject = new JsonObject();
                jsonObject.a0("id", Integer.valueOf(uFeedChannel.mChannelId));
                jsonObject.c0("text", uFeedChannel.mChannelName);
                jsonArray.G(jsonObject);
             }
          }
          JsonObject jsonObject1 = new JsonObject();
          jsonObject1.a0("timeMils", Long.valueOf(p1.mResponseTime));
          jsonObject1.G("recoTab", jsonArray);
          ExceptionClues.c.c(p0.toString(), jsonObject1);
          return;
       }
    }
    public static void onActivityDestroyed(){
       if (PatchProxy.applyVoid(null, null, ExceptionCluesTags.class, "3")) {
          return;
       }
       ExceptionCluesTags[] uExceptionCl = ExceptionCluesTags.values();
       int len = uExceptionCl.length;
       for (int i = 0; i < len; i = i + 1) {
          ExceptionClues.c.b(uExceptionCl[i].toString());
       }
       ExceptionCluesTags.homePageJsonRef.clear();
       return;
    }
    public static void setHomePageJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ExceptionCluesTags.class, "5")) {
          return;
       }
       ExceptionCluesTags.homePageJsonRef = new WeakReference(p0);
       return;
    }
    public static ExceptionCluesTags valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ExceptionCluesTags.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ExceptionCluesTags.class, p0);
    }
    public static ExceptionCluesTags[] values(){
       Object obj = PatchProxy.apply(null, null, ExceptionCluesTags.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ExceptionCluesTags.$VALUES.clone();
    }
    public String toString(){
       return this.value;
    }
}
