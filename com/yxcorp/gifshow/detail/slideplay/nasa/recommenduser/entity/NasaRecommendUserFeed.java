package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.b;
import com.kuaishou.android.model.feed.PhotoType$a;
import yp.q;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.a;
import ok.h;
import kp.w1;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserMeta;
import com.kwai.robust.PatchProxyResult;
import l6a.d;
import java.util.Map;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserCoverMeta;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class NasaRecommendUserFeed extends BaseFeed	// class@001760
{
    public String mCacheCursor;
    public List mCacheUserList;
    public List mCacheUserWrapperList;
    public CommonMeta mCommonMeta;
    public RecommendUserMeta mRecommendUserMeta;
    public static final long serialVersionUID = 0xfd804f937d220b02;

    public void NasaRecommendUserFeed(){
       super();
    }
    public static PhotoType lambda$registerPhotoTypeProvider$0(BaseFeed p0){
       return PhotoType.NASA_FEATURED_RECOMMEND_USER;
    }
    public static void registerBaseFeedProvider(){
       if (PatchProxy.applyVoidWithListener(null, null, NasaRecommendUserFeed.class, "2")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.NASA_FEATURED_RECOMMEND_USER, b.a);
       PatchProxy.onMethodExit(NasaRecommendUserFeed.class, "2");
       return;
    }
    public static void registerFeedCheckerClass(){
       if (PatchProxy.applyVoidWithListener(null, null, NasaRecommendUserFeed.class, "1")) {
          return;
       }
       q.d(NasaRecommendUserFeed.class);
       PatchProxy.onMethodExit(NasaRecommendUserFeed.class, "1");
       return;
    }
    public static void registerPhotoTypeProvider(){
       if (PatchProxy.applyVoidWithListener(null, null, NasaRecommendUserFeed.class, "3")) {
          return;
       }
       w1.u(NasaRecommendUserFeed.class, a.b);
       PatchProxy.onMethodExit(NasaRecommendUserFeed.class, "3");
       return;
    }
    public String getId(){
       RecommendUserMeta mPrsid = this.mRecommendUserMeta.mPrsid;
       if (mPrsid == null) {
          mPrsid = "";
       }
       return mPrsid;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaRecommendUserFeed.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(NasaRecommendUserFeed.class, "7");
          return new d();
       }else {
          PatchProxy.onMethodExit(NasaRecommendUserFeed.class, "7");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaRecommendUserFeed.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(NasaRecommendUserFeed.class, new d());
       }else {
          obj.put(NasaRecommendUserFeed.class, null);
       }
       PatchProxy.onMethodExit(NasaRecommendUserFeed.class, "8");
       return obj;
    }
    public boolean isSlideType(){
       NasaRecommendUserFeed obj = PatchProxy.applyWithListener(null, this, NasaRecommendUserFeed.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mRecommendUserMeta;
       boolean b = false;
       if (obj != null && obj.mUsersWrapper != null) {
          Iterator iterator = obj.getUsers().iterator();
          while (iterator.hasNext()) {
             User user = iterator.next();
             if (user == null) {
                PatchProxy.onMethodExit(NasaRecommendUserFeed.class, "6");
                return b;
             }
          }
       }
       PatchProxy.onMethodExit(NasaRecommendUserFeed.class, "6");
       return b;
    }
    public boolean isVideoRecommend(){
       NasaRecommendUserFeed obj = PatchProxy.applyWithListener(null, this, NasaRecommendUserFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mRecommendUserMeta;
       boolean b = false;
       if (obj != null && obj.mUsersWrapper != null) {
          Iterator iterator = obj.getUsers().iterator();
          while (iterator.hasNext()) {
             User user = iterator.next();
             if (user == null) {
                PatchProxy.onMethodExit(NasaRecommendUserFeed.class, "5");
                return b;
             }else {
                user = user.mCoverMeta;
                if (user != null && user.mPhotoID != null) {
                   UserCoverMeta mCoverThumbn = user.mCoverThumbnailUrls;
                   if (mCoverThumbn != null && mCoverThumbn.length) {
                      PatchProxy.onMethodExit(NasaRecommendUserFeed.class, "5");
                      return true;
                   }
                }
             }
          }
       }
       PatchProxy.onMethodExit(NasaRecommendUserFeed.class, "5");
       return b;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaRecommendUserFeed.class, "4")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       PatchProxy.onMethodExit(NasaRecommendUserFeed.class, "4");
       return;
    }
}
