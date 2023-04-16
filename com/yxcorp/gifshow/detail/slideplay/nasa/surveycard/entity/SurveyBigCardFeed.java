package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.b;
import com.yxcorp.gifshow.entity.QPhoto$b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import r6a.e;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardMeta;
import java.util.List;
import com.kuaishou.android.model.feed.PhotoType;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.a;
import com.kuaishou.android.model.feed.PhotoType$a;
import yp.q;
import com.yxcorp.utility.TextUtils;
import r6a.d;
import java.util.Map;

public class SurveyBigCardFeed extends BaseFeed	// class@0017c5
{
    public CommonMeta mCommonMeta;
    public SurveyBigCardMeta mSurveyBigCardMeta;
    public static final long serialVersionUID = 0xfadcd957923b1b3b;

    public void SurveyBigCardFeed(){
       super();
    }
    public static void addInvalidFeedChecker(){
       if (PatchProxy.applyVoidWithListener(null, null, SurveyBigCardFeed.class, "3")) {
          return;
       }
       QPhoto.addInvalidFeedChecker(b.a);
       PatchProxy.onMethodExit(SurveyBigCardFeed.class, "3");
       return;
    }
    public static Boolean lambda$addInvalidFeedChecker$0(BaseFeed p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefsWithListener(p0, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          int i = 0;
          if (!p0 instanceof SurveyBigCardFeed) {
             PatchProxy.onMethodExit(e.class, "2");
             b = false;
          }else {
             Object obj1 = PatchProxy.applyOneRefsWithListener(p0, null, e.class, "1");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else if(p0 != null){
                SurveyBigCardFeed mSurveyBigCa = p0.mSurveyBigCardMeta;
                if (mSurveyBigCa != null) {
                   SurveyBigCardMeta mQuestions = mSurveyBigCa.mQuestions;
                   if (mQuestions != null && mQuestions.size() > 0) {
                      i = 1;
                   }
                }
             }
             PatchProxy.onMethodExit(e.class, "1");
             b = i;
             PatchProxy.onMethodExit(e.class, "2");
          }
       }
       if (b) {
          return Boolean.FALSE;
       }else {
          return null;
       }
    }
    public static void registerBaseFeedProvider(){
       if (PatchProxy.applyVoidWithListener(null, null, SurveyBigCardFeed.class, "2")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.SURVEY_BIG_CARD, a.a);
       PatchProxy.onMethodExit(SurveyBigCardFeed.class, "2");
       return;
    }
    public static void registerFeedCheckerClass(){
       if (PatchProxy.applyVoidWithListener(null, null, SurveyBigCardFeed.class, "1")) {
          return;
       }
       q.d(SurveyBigCardFeed.class);
       PatchProxy.onMethodExit(SurveyBigCardFeed.class, "1");
       return;
    }
    public String getId(){
       Object obj = PatchProxy.applyWithListener(null, this, SurveyBigCardFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(SurveyBigCardFeed.class, "4");
       return TextUtils.I(this.mSurveyBigCardMeta.mFeedId);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, SurveyBigCardFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(SurveyBigCardFeed.class, "5");
          return new d();
       }else {
          PatchProxy.onMethodExit(SurveyBigCardFeed.class, "5");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefsWithListener(p0, this, SurveyBigCardFeed.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(SurveyBigCardFeed.class, new d());
       }else {
          obj.put(SurveyBigCardFeed.class, null);
       }
       PatchProxy.onMethodExit(SurveyBigCardFeed.class, "6");
       return obj;
    }
}
