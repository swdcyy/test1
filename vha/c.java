package vha.c;
import y8c.g;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import jv5.a;
import com.kwai.framework.model.user.User;
import kga.c;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import com.kwai.framework.model.feed.BaseFeed;

public abstract class c extends g	// class@0045a6
{
    public final List w;
    public boolean x;

    public void c(){
       super();
       this.w = new ArrayList();
       this.x = false;
       this.G0(true);
       this.p = false;
    }
    public void Z0(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       if (this.x == null) {
          super.Z0();
       }
       return;
    }
    public long d0(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       FollowingUserBannerFeed$UserBannerInfo userBannerIn = this.N0(p0);
       long l = 0;
       if (userBannerIn == null) {
          return l;
       }else {
          FollowingUserBannerFeed$UserBannerInfo mExtraModel = userBannerIn.mExtraModel;
          if (mExtraModel != null) {
             return mExtraModel.c;
          }else {
             userBannerIn = userBannerIn.mUser;
             if (userBannerIn == null) {
                return l;
             }else {
                return c.a(userBannerIn);
             }
          }
       }
    }
    public final int f0(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       FollowingUserBannerFeed$UserBannerInfo userBannerIn = this.N0(p0);
       if (userBannerIn != null) {
          userBannerIn = userBannerIn.mExtraModel;
          if (userBannerIn != null) {
             return userBannerIn.d;
          }
       }
       return 1;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       super.Z0();
       return;
    }
    public List r1(){
       return this.w;
    }
    public void s1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.w.clear();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          FollowingUserBannerFeed$UserBannerInfo userBannerIn = iterator.next();
          if (userBannerIn != null && userBannerIn.isLiveStream()) {
             this.w.add(new QPhoto(userBannerIn.mAvatarInfo.mLiveStreamFeed));
          }
       }
       return;
    }
    public void t1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.W0(p0);
       this.k0();
       return;
    }
}
