package ak2.a;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import yp5.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.live.model.LiveAudienceSkinActivityConfig;
import com.kuaishou.android.live.model.LiveAudienceCustomSkinConfig;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import xp5.a;
import u53.b;
import tma.c;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig;

public class a	// class@0000e3
{

    public void a(){
       super();
    }
    public static a$a a(LiveStreamFeedWrapper p0){
       LiveStreamFeedWrapper mEntity;
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       a$a obj = PatchProxy.applyOneRefs(p0, null, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new a$a();
       int i = 1;
       if (p0 != null) {
          mEntity = p0.mEntity;
          if (mEntity != null) {
             LiveStreamFeed mLiveStreamM = mEntity.mLiveStreamModel;
             if (mLiveStreamM != null && mLiveStreamM.mLiveAudienceSkinActivityConfig != null) {
                mEntity = 1;
             label_0028 :
                if (mEntity) {
                   mEntity = p0.mEntity;
                   LiveStreamModel mLiveAudienc = mEntity.mLiveStreamModel.mLiveAudienceSkinActivityConfig;
                   obj.a = mEntity.mConfig.mPatternType;
                   obj.g = mLiveAudienc.mEnableHorizontalScreen;
                   obj.f = mLiveAudienc.mEnableHorizontalScreenBarrage;
                   obj.h = mLiveAudienc.mEnableRequestChainLiveInfo;
                   obj.i = mLiveAudienc.mEnableRequestUserStatus;
                   b = (mLiveAudienc.mShowGiftSlotCount == i)? true: false;
                   obj.e = b;
                   obj.j = mLiveAudienc.mSendCommentRatio;
                   obj.k = mLiveAudienc.mSendLikeRatio;
                   obj.l = mLiveAudienc.mMaxDelayGetPlayUrlActivityMillis;
                   obj.m = mLiveAudienc.mMaxDelayMsGetLivingWidgets;
                   obj.n = mLiveAudienc.mProgrammeListUrl;
                   obj.o = mLiveAudienc.mProgramListUrlPopMode;
                   obj.p = mLiveAudienc.mSkinCoverCDNUrls;
                   obj.q = mLiveAudienc.mSkinLiveMarkCDNUrls;
                   obj.r = mLiveAudienc.mSkinBannerCDNUrls;
                   obj.s = mLiveAudienc.mActivityLiveEndText;
                   obj.t = mLiveAudienc.mLiveMarkText;
                }
                if (a.b(p0)) {
                   LiveStreamModel mLiveAudienc1 = p0.mEntity.mLiveStreamModel.mLiveAudienceCustomSkinConfig;
                   obj.u = mLiveAudienc1.mCustomSkinBackgroundCDNUrls;
                   obj.v = mLiveAudienc1.mCustomSkinLiveHeartCDNUrls;
                   obj.w = mLiveAudienc1.mCustomSkinBackgroundColors;
                   obj.d(mLiveAudienc1.mUpAtmosphereImg);
                   obj.c(mLiveAudienc1.mDownAtmosphereImg);
                   obj.b(mLiveAudienc1.mBottomBackgroundImg);
                }
                if (!a.b(p0)) {
                   LiveGzoneAudienceCustomSkinConfig obj1 = PatchProxy.applyOneRefs(p0, null, uoa, "2");
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else if(p0 != null){
                      mEntity = p0.mEntity;
                      if (mEntity != null) {
                         LiveStreamFeed mConfig1 = mEntity.mConfig;
                         if (mConfig1 != null && b.b(mConfig1, r1.U1(mEntity)).b()) {
                            b = true;
                         }
                      }
                   }
                   b = false;
                   if (b) {
                      obj1 = PatchProxy.applyOneRefs(p0, null, uoa, "4");
                      if (obj1 != patchProxyRe) {
                         b = obj1.booleanValue();
                      }else if(p0 != null && c.a.a(p0.mEntity) != null){
                         b = true;
                      }else {
                         b = false;
                      }
                      if (b) {
                         obj1 = c.a.a(p0.mEntity);
                         if (obj1 != null) {
                            LiveStreamFeed obj2 = PatchProxy.applyOneRefs(p0, null, uoa, "3");
                            if (obj2 != patchProxyRe) {
                               b1 = obj2.booleanValue();
                            }else {
                               LiveStreamFeedWrapper mEntity1 = p0.mEntity;
                               if (mEntity1 != null) {
                                  obj2 = mEntity1.mConfig;
                                  if (obj2 != null && b.b(obj2, r1.U1(mEntity1)).f()) {
                                  label_0125 :
                                     b1 = i;
                                  }
                               }
                               i = 0;
                               goto label_0125 ;
                            }
                            if (b1) {
                               obj.d(obj1.mCompetitionTopPicUrls);
                            }else {
                               obj.d(obj1.mTopPicUrls);
                            }
                            a$a x = obj.x;
                            if (x != null && x.length > 0) {
                               obj.c(obj1.mBottomPicUrls);
                               obj.b(obj1.mBottomBgPicUrls);
                            }
                         }
                      }
                   }
                }
             label_0144 :
                if (p0 != null) {
                   p0 = p0.mEntity;
                   if (p0 != null) {
                      LiveStreamFeed mConfig = p0.mConfig;
                      if (mConfig != null && mConfig.mPatternType == 4) {
                         obj.b = false;
                         obj.c = false;
                         obj.d = false;
                      }
                   }
                }
                return obj;
             }
          }
       }
       mEntity = null;
       goto label_0028 ;
    }
    public static boolean b(LiveStreamFeedWrapper p0){
       boolean b;
       if (p0 != null) {
          p0 = p0.mEntity;
          if (p0 != null) {
             LiveStreamFeed mLiveStreamM = p0.mLiveStreamModel;
             if (mLiveStreamM != null && mLiveStreamM.mLiveAudienceCustomSkinConfig != null) {
                b = true;
             label_0011 :
                return b;
             }
          }
       }
       b = false;
       goto label_0011 ;
    }
}
