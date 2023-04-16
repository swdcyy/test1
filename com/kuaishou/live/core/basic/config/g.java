package com.kuaishou.live.core.basic.config.g;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kuaishou.live.core.basic.config.f;
import ok.x;
import java.lang.Object;
import s02.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.Gson;
import pp.c;
import com.kuaishou.android.live.log.b;
import jp3.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kuaishou.live.common.core.basic.liveconfig.LiveConfig;
import com.kuaishou.live.common.course.model.LiveCourseConfig;
import s02.a;

public class g extends ConfigAutoParseJsonConsumer	// class@000830
{

    public void g(){
       super(f.b);
    }
    public void b(Object p0){
       SharedPreferences a;
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
       }else {
          b.Z(LiveLogTag.STATISTICS, "startup result: "+a.a.q(p0));
          a = a.a;
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putString("adConversionStartConfig", b.e(p0.mAdConversionStartConfig));
          uEditor.putBoolean("disableAudioOnlyWhenBackground", p0.mDisableAudioOnlyWhenBackground);
          uEditor.putBoolean("disable_live_watching_user_offline_display_for_author", p0.mDisableLiveWatchingUserOfflineDisplayForAuthor);
          uEditor.putBoolean("displayGiftAvatar", p0.mDisplayGiftAvatar);
          uEditor.putBoolean("enableLiveChat", p0.mEnableLiveChat);
          uEditor.putBoolean("enable_live_watching_user_offline_display", p0.mEnableLiveWatchingUserOfflineDisplay);
          uEditor.putBoolean("enable_live_watching_user_offline_display_for_audience", p0.mEnableLiveWatchingUserOfflineDisplayForAudience);
          uEditor.putBoolean("enable_real_time_qos_log", p0.mEnableRealtimeQosLog);
          uEditor.putLong("giftComboExpireSeconds", p0.mGiftComboExpireMs);
          uEditor.putLong("live_author_rt_qos_interval", p0.mLiveAuthorRTQosInterval);
          uEditor.putInt(b.d("user")+"live_comment_max_length", p0.mLiveCommentMaxLength);
          uEditor.putBoolean("LivePlayOpenglOn", p0.mLivePlayOpenglOn);
          uEditor.putString(b.d("user")+"LiveSettingEntrance", b.e(p0.mLiveSettingEntrance));
          uEditor.putBoolean("live_comments_long_press_copy", p0.mLiveStreamEnableLongPressCopy);
          uEditor.putBoolean("live_watermark_on", p0.mLiveWatermarkOn);
          uEditor.putString("redPackDomain", p0.mRedPackDomain);
          g.a(uEditor);
          e mLiveConfig = p0.mLiveConfig;
          if (mLiveConfig != null) {
             SharedPreferences$Editor uEditor1 = a.edit();
             uEditor1.putBoolean("disableAudienceWishList", mLiveConfig.mDisableAudienceWishList);
             uEditor1.putBoolean("disableAutoPauseDelayed", mLiveConfig.mDisableAutoPauseDelayed);
             uEditor1.putBoolean("disableFansTop", mLiveConfig.mDisableFansTop);
             uEditor1.putBoolean("disableFloatingWindow", mLiveConfig.mDisableFloatingWindow);
             uEditor1.putBoolean("disableForbidVoiceCommentInPkAndChat", mLiveConfig.mDisableForbidVoiceCommentInPkAndChat);
             uEditor1.putBoolean("disableLiveKaraokeGrade", mLiveConfig.mDisableLiveKaraokeGrade);
             uEditor1.putBoolean("disableLiveKtv", mLiveConfig.mDisableLiveKtv);
             uEditor1.putBoolean("disableLiveTreasureBox", mLiveConfig.mDisableLiveTreasureBox);
             uEditor1.putBoolean("disablePkCloseOtherPlayerVoice", mLiveConfig.mDisablePkCloseOtherPlayerVoice);
             uEditor1.putBoolean("disablePkDetest", mLiveConfig.mDisablePkDetest);
             uEditor1.putBoolean("disablePkHistory", mLiveConfig.mDisablePkHistory);
             uEditor1.putBoolean("disableShowGuessRecord", mLiveConfig.mDisableShowGuessRecord);
             uEditor1.putBoolean("disableStartPk", mLiveConfig.mDisableStartPk);
             uEditor1.putBoolean("disableWishList", mLiveConfig.mDisableWishList);
             uEditor1.putBoolean("enableCameraVerticalFlip", mLiveConfig.mEnableCameraVerticalFlip);
             uEditor1.putBoolean("enable_live_game_adaptive_qos_collect", mLiveConfig.mEnableLiveGameAdaptiveQosCollect);
             uEditor1.putBoolean("enable_live_game_adaptive_qos_plus_collect", mLiveConfig.mEnableLiveGameAdaptiveQosPlusCollect);
             uEditor1.putBoolean("enableTuhaoOfflineConfigurable", mLiveConfig.mEnableTuhaoOfflineConfigurable);
             uEditor1.putLong("live_game_adaptive_qos_collect_interval", mLiveConfig.mLiveGameAdaptiveQosCollectInterval);
             uEditor1.putBoolean("supportAryaHeadphoneMonitor", mLiveConfig.mSupportAryaHeadphoneMonitor);
             g.a(uEditor1);
          }
          p0 = p0.mLiveCourseConfig;
          if (p0 != null) {
             SharedPreferences$Editor uEditor2 = a.edit();
             uEditor2.putString("courseAdsAudienceButtonNormal", p0.mCourseAdsAudienceButtonNormal);
             uEditor2.putString("courseAdsAudienceButtonPressed", p0.mCourseAdsAudienceButtonPressed);
             uEditor2.putBoolean("isTeacher", p0.mIsTeacher);
             g.a(uEditor2);
          }
          a.a(true);
       }
       return;
    }
}
