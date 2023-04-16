package com.kuaishou.commercial.splash.SplashPredictHelper$b;
import p49.a;
import com.kuaishou.commercial.splash.SplashPredictHelper;
import java.util.List;
import java.lang.Object;
import q35.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Boolean;
import com.google.gson.JsonArray;
import java.util.Iterator;
import com.kuaishou.commercial.splash.SplashModel;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.SplashInfo;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo;
import com.yxcorp.gifshow.util.DateUtils;
import o49.g;
import com.kwai.framework.model.feed.BaseFeed;
import com.google.gson.JsonElement;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;

public final class SplashPredictHelper$b implements a	// class@00158d
{
    public final SplashPredictHelper a;
    public final boolean b;
    public final List c;

    public void SplashPredictHelper$b(SplashPredictHelper p0,boolean p1,List p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void a(c$a p0){
       PhotoAdvertisement photoAdverti;
       SplashBaseInfo mStartTime;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, SplashPredictHelper$b.class, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       Map map = obj.a.a();
       Gson gson = (map == null || map.isEmpty())? 1: null;
       if (!gson) {
          jsonObject.c0("predict_list", a.a.q(obj.a.a()));
       }
       jsonObject.H("is_filter", Boolean.valueOf(obj.b));
       JsonArray jsonArray = new JsonArray();
       Iterator iterator = obj.c.iterator();
       while (iterator.hasNext()) {
          SplashModel splashModel = iterator.next();
          if (splashModel != null) {
             JsonObject jsonObject1 = new JsonObject();
             SplashModel mBaseFeed = splashModel.mBaseFeed;
             PhotoAdvertisement$AdData uAdData = null;
             if (mBaseFeed != null) {
                photoAdverti = (mBaseFeed != null)? mBaseFeed.get("AD"): uAdData;
             }else {
                photoAdverti = splashModel.mNonEyeMaxData;
             }
             if (photoAdverti != null) {
                photoAdverti = photoAdverti.mAdData;
                if (photoAdverti != null) {
                   uAdData = photoAdverti.mSplashInfo;
                }
             }
             jsonObject1.c0("splash_id", splashModel.mSplashId);
             SplashBaseInfo splashBaseIn = null;
             if (uAdData != null) {
                SplashInfo mSplashBaseI = uAdData.mSplashBaseInfo;
                if (mSplashBaseI != null) {
                   mStartTime = mSplashBaseI.mStartTime;
                label_0092 :
                   long l = 1000;
                   long l1 = mStartTime * l;
                   String str = "";
                   jsonObject1.c0("start_time", DateUtils.j(l1, str));
                   if (uAdData != null) {
                      SplashInfo mSplashBaseI1 = uAdData.mSplashBaseInfo;
                      if (mSplashBaseI1 != null) {
                         splashBaseIn = mSplashBaseI1.mEndTime;
                      }
                   }
                   long l2 = splashBaseIn * l;
                   str = DateUtils.j(l2, str);
                   jsonObject1.c0("end_time", str);
                   boolean b = (uAdData != null && uAdData.mIsFakeSplash == 1)? true: false;
                   jsonObject1.H("is_empty", Boolean.valueOf(b));
                   b = (uAdData != null && uAdData.mSplashAdType == 1)? true: false;
                   jsonObject1.H("is_eyemax", Boolean.valueOf(b));
                   g.b(g.a, splashModel.mBaseFeed, jsonObject1, 0, 0, 12, null);
                   jsonArray.G(jsonObject1);
                }
             }
             mStartTime = splashBaseIn;
             goto label_0092 ;
          }
       }
       if (jsonArray.size() > 0) {
          jsonObject.G("predict_fliter_list", jsonArray);
       }
       obj1.d(BusinessType.SPLASH);
       obj1.g(SubBusinessType.OTHER);
       obj1.h("SplashPredictHelper");
       obj1.f(jsonObject);
       return;
    }
}
