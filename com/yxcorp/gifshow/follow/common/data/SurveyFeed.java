package com.yxcorp.gifshow.follow.common.data.SurveyFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.common.data.g;
import com.yxcorp.gifshow.entity.QPhoto$b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.PhotoType;
import com.yxcorp.gifshow.follow.common.data.f;
import com.kuaishou.android.model.feed.PhotoType$a;
import yp.q;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.robust.PatchProxyResult;
import nga.p;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class SurveyFeed extends BaseFeed	// class@00102a
{
    public CommonMeta mCommonMeta;
    public SurveyMeta mSurveyMeta;
    public static final long serialVersionUID = 0xfec08701206af47d;

    public void SurveyFeed(){
       super();
    }
    public static void addInvalidFeedChecker(){
       if (PatchProxy.applyVoid(null, null, SurveyFeed.class, "3")) {
          return;
       }
       QPhoto.addInvalidFeedChecker(g.a);
       return;
    }
    public static Boolean lambda$addInvalidFeedChecker$0(BaseFeed p0){
       if (p0 instanceof SurveyFeed) {
          return Boolean.FALSE;
       }
       return null;
    }
    public static void registerBaseFeedProvider(){
       if (PatchProxy.applyVoid(null, null, SurveyFeed.class, "2")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.SURVEY_FEED, f.a);
       return;
    }
    public static void registerFeedCheckerClass(){
       if (PatchProxy.applyVoid(null, null, SurveyFeed.class, "1")) {
          return;
       }
       q.d(SurveyFeed.class);
       return;
    }
    public String getId(){
       return this.mCommonMeta.mSurveyId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SurveyFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, SurveyFeed.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(SurveyFeed.class, new p());
       }else {
          obj.put(SurveyFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SurveyFeed.class, "4")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
