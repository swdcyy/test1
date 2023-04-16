package a2c.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$c;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import com.yxcorp.gifshow.profile.model.UserProfileBgMedia$BackgroundVideo;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.profile.model.UserProfileBgMedia$PlayArea;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import kotlin.collections.ArraysKt___ArraysKt;
import qrd.l1;

public final class x	// class@000055
{
    public static final x a;

    static {
       x.a = new x();
    }
    public void x(){
       super();
    }
    public static final boolean b(){
       ProfileBgVideoInfo obj = PatchProxy.apply(null, null, x.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = ProfileBackgroundPublishManager.j.a().i();
       boolean b = true;
       if (obj == null || obj.getStatus() != b) {
          b = false;
       }
       return b;
    }
    public final ProfileBgVideoInfo a(UserProfileBgMedia$BackgroundVideo p0){
       String id;
       float f1;
       ProfileBgVideoInfo obj = PatchProxy.applyOneRefs(p0, this, x.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "backgroundVideo");
       obj = new ProfileBgVideoInfo();
       UserProfileBgMedia$BackgroundVideo mPhotoId = p0.mPhotoId;
       String str = "";
       if (mPhotoId == null) {
          id = str;
       }
       obj.setZtPhotoId(mPhotoId);
       mPhotoId = p0.mVideoUrls;
       int i = 0;
       mPhotoId = (mPhotoId == null || mPhotoId.isEmpty())? 1: null;
       List list = null;
       if (!mPhotoId) {
          Iterator iterator = p0.mVideoUrls.iterator();
          while (iterator.hasNext()) {
             CDNUrl uCDNUrl = iterator.next();
             CDNUrl mUrl = (uCDNUrl != null)? uCDNUrl.mUrl: list;
             String str1 = (mUrl == null || !mUrl.length())? 1: null;
             if (!str1) {
                mUrl = (!(obj.getPath()).length())? 1: null;
                if (mUrl) {
                   if (uCDNUrl != null) {
                      uCDNUrl = uCDNUrl.mUrl;
                      if (uCDNUrl != null) {
                      label_0074 :
                         obj.setPath(uCDNUrl);
                      }
                   }
                   String str2 = str;
                   goto label_0074 ;
                }else {
                   a.o(uCDNUrl, "videoUrl");
                   obj.getExtraPaths().add(uCDNUrl);
                }
             }
          }
       }
       obj.setCoverUrls(p0.mCoverThumbnailUrls);
       mPhotoId = p0.mPlayArea;
       UserProfileBgMedia$PlayArea mShowAreaCen = (mPhotoId != null)? mPhotoId.mShowAreaCenterYRadio: 0x3f000000;
       obj.setShowAreaCenterYRadio(mShowAreaCen);
       mPhotoId = p0.mPlayArea;
       UserProfileBgMedia$PlayArea playArea = null;
       mShowAreaCen = (mPhotoId != null)? mPhotoId.mClipStart: 0;
       float f = (float)1000;
       obj.setClipStart((long)(mShowAreaCen * f));
       mPhotoId = p0.mPlayArea;
       if (mPhotoId != null) {
          playArea = mPhotoId.mClipDuration;
       }
       obj.setClipDuration((long)(playArea * f));
       int i1 = (p0.mIsAuditing != null)? 4: 5;
       obj.setStatus(i1);
       obj.setUser(p0.mUser);
       p0 = p0.mFeed;
       if (p0 != null) {
          if (!(obj.getZtPhotoId()).length()) {
             i = 1;
          }
          if (i) {
             obj.setUseFeedPlay(true);
             id = p0.getId();
             a.o(id, "id");
             obj.setZtPhotoId(id);
             CDNUrl[] uCDNUrlArray = r1.F0(p0);
             if (uCDNUrlArray != null) {
                list = ArraysKt___ArraysKt.uy(uCDNUrlArray);
             }
             obj.setCoverUrls(list);
             if (obj.getUser() == null) {
                obj.setUser(r1.T1(p0));
             }
          }
          list = p0;
       }
       obj.setFeed(list);
       return obj;
    }
}
