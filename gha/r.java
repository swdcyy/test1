package gha.r;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import wkd.b;
import tb6.b;
import kka.h;
import com.yxcorp.gifshow.log.model.FeedLogCtx;

public class r	// class@002ae3
{

    public void r(){
       super();
    }
    public static FollowingUserBannerFeed a(String p0,String p1,int p2,FollowingUserBannerFeed$UserBannerInfo p3){
       FollowingUserBannerFeed obj;
       if (PatchProxy.isSupport(r.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, r.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new FollowingUserBannerFeed();
       CommonMeta uCommonMeta = new CommonMeta();
       uCommonMeta.mFeedId = p0;
       uCommonMeta.mType = p2;
       uCommonMeta.mExpTag = p1;
       FollowingUserBannerFeed$UserBannerInfo mAvatarInfo = p3.mAvatarInfo;
       if (mAvatarInfo != null) {
          FeedUserAvatarInfo mLiveStreamF = mAvatarInfo.mLiveStreamFeed;
          if (mLiveStreamF != null) {
             uCommonMeta.mServerExpTag = r1.I1(mLiveStreamF);
          }
       }
       uCommonMeta.mCurrentNetwork = b.a(0x13545612).a();
       uCommonMeta.mCurrentFreeTrafficType = b.a(-1592356291).c();
       uCommonMeta.mFeedLogCtx = p3.getFeedLogCtx();
       obj.mCommonMeta = uCommonMeta;
       obj.mLogUser = p3.mUser;
       return obj;
    }
}
