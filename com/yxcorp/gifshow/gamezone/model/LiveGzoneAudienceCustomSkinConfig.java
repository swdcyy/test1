package com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import fa6.e;
import fa6.b;
import com.kuaishou.android.live.model.LiveAudienceCustomSkinConfig;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;

public class LiveGzoneAudienceCustomSkinConfig implements Serializable	// class@0012d0
{
    public CDNUrl[] mBottomBgPicUrls;
    public CDNUrl[] mBottomPicUrls;
    public CDNUrl[] mCompetitionTopPicUrls;
    public CDNUrl[] mCustomSkinBackgroundCDNUrls;
    public LiveGzoneAudienceCustomSkinConfig$ExtensionConfig mExtensionConfig;
    public LiveGzoneAudienceCustomSkinConfig$FollowButtonConfig mFollowButtonConfig;
    public LiveGzoneAudienceCustomSkinConfig$SubTabBarConfig mSubTabBarConfig;
    public LiveGzoneAudienceCustomSkinConfig$TabBarConfig mTabBarConfig;
    public CDNUrl[] mTopPicUrls;
    public static final String PART_FIELD = "gameLiveConfig";
    public static final long serialVersionUID = 0xe3ca08e28a9d447b;

    public void LiveGzoneAudienceCustomSkinConfig(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, LiveGzoneAudienceCustomSkinConfig.class, "1")) {
          return;
       }
       e uoe = new e(LiveGzoneAudienceCustomSkinConfig.class, "gameLiveConfig", "gameLiveConfig");
       uoe.a(null);
       c.a.e(LiveStreamFeed.class, uoe);
       return;
    }
    public LiveAudienceCustomSkinConfig convertToCustomSkinConfigForLiteLive(boolean p0){
       LiveAudienceCustomSkinConfig obj;
       if (PatchProxy.isSupport(LiveGzoneAudienceCustomSkinConfig.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, LiveGzoneAudienceCustomSkinConfig.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveAudienceCustomSkinConfig();
       LiveGzoneAudienceCustomSkinConfig tmCompetitio = (p0)? this.mCompetitionTopPicUrls: this.mTopPicUrls;
       obj.mUpAtmosphereImg = tmCompetitio;
       obj.mBottomBackgroundImg = this.mBottomBgPicUrls;
       obj.mDownAtmosphereImg = this.mBottomPicUrls;
       if (tmCompetitio != null && tmCompetitio.length > 0) {
          return obj;
       }else {
          return null;
       }
    }
}
