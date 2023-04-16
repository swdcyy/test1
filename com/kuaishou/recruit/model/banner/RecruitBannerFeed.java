package com.kuaishou.recruit.model.banner.RecruitBannerFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.recruit.model.banner.b;
import com.kuaishou.android.model.feed.PhotoType$a;
import com.kuaishou.recruit.model.banner.a;
import ok.h;
import kp.w1;
import com.kuaishou.recruit.model.banner.RecruitBannerInfo;
import com.kwai.robust.PatchProxyResult;
import zt4.e;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class RecruitBannerFeed extends BaseFeed	// class@000edd
{
    public CommonMeta mCommonMeta;
    public ExtMeta mExtMeta;
    public RecruitBannerInfo mJobInfo;
    public static final long serialVersionUID = 0xab72ab6a59a6d8ad;

    public void RecruitBannerFeed(){
       super();
    }
    public static PhotoType lambda$registerPhotoTypeProvider$0(BaseFeed p0){
       return PhotoType.RECRUIT_BANNER_STYLE;
    }
    public static void registerBaseFeedProvider(){
       if (PatchProxy.applyVoid(null, null, RecruitBannerFeed.class, "1")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.RECRUIT_BANNER_STYLE, b.a);
       return;
    }
    public static void registerPhotoTypeProvider(){
       if (PatchProxy.applyVoid(null, null, RecruitBannerFeed.class, "2")) {
          return;
       }
       w1.u(RecruitBannerFeed.class, a.b);
       return;
    }
    public String getId(){
       return this.mJobInfo.mFeedId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecruitBannerFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, RecruitBannerFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(RecruitBannerFeed.class, new e());
       }else {
          obj.put(RecruitBannerFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecruitBannerFeed.class, "3")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
