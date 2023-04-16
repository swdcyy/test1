package com.yxcorp.gifshow.action.config.c;
import zv8.b;
import com.yxcorp.gifshow.action.startup.FeedRealActionsBizConfig;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageConfig;
import aw.a$b;
import com.yxcorp.gifshow.action.model.RealActionFeed;
import aw.a$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.action.model.RealActionFeed$RealActionExtParams;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonObject;
import zv8.j;
import java.lang.Long;
import java.lang.Number;
import com.google.gson.JsonElement;

public class c extends b	// class@001315
{

    public void c(){
       super();
    }
    public FeedRealActionsPageConfig[] a(FeedRealActionsBizConfig p0){
       return p0.mNewsSlideActions;
    }
    public void c(a$b p0,RealActionFeed p1,a$c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "1")) {
          return;
       }
       RealActionFeed mActionType = p1.mActionType;
       if (mActionType == 15 || mActionType == 17) {
          mActionType = p1.mExtParams;
          if (mActionType != null) {
             p0.g = TextUtils.k(mActionType.mClientExpTag);
          }
       }
       mActionType = p1.mExtParams;
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, mActionType, this, c.class, "2")) {
          JsonObject[] jsonObjectAr = new JsonObject[1];
          j oj = new j(jsonObjectAr, p0);
          if (!PatchProxy.applyVoidThreeRefs(p1, mActionType, oj, this, c.class, "3")) {
             if (mActionType != null && mActionType.mHyperTagRecoLogInfo != null) {
                oj.get().c0("reco_log_info", mActionType.mHyperTagRecoLogInfo);
             }
             if (mActionType != null && 13 == p1.mActionType) {
                oj.get().a0("playDuration", Long.valueOf(mActionType.mActualPlayDuration));
             }
             if (mActionType != null && 18 == p1.mActionType) {
                oj.get().c0("photo_id", p1.mFeedId);
                oj.get().c0("llsid", p1.mLlsid);
                oj.get().c0("exp_tag", mActionType.mClientExpTag);
             }
             if (mActionType != null) {
                JsonObject jsonObject = oj.get();
                String str = (p1.mExtParams.mIsFromCache != null)? "TRUE": "FALSE";
                jsonObject.c0("is_cache", str);
             }
          }
          int i = 0;
          if (jsonObjectAr[i] != null) {
             p0.j = jsonObjectAr[i].toString();
          }
       }
       return;
    }
    public boolean disableSourceFilter(){
       return true;
    }
    public String subBiz(){
       return "NEWS_SLIDE";
    }
}
