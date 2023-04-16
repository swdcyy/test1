package b66.r;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import b66.q;
import ok.x;
import java.lang.Object;
import com.kwai.framework.preference.startup.StartupCommonPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.preference.startup.PerformanceSdkConfig;
import oe6.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kwai.framework.preference.startup.FrequentSearchWord;
import km8.b;
import java.lang.StringBuilder;
import com.kwai.framework.preference.startup.MyCourseConfig;
import oe6.a;
import java.lang.reflect.Type;
import java.lang.System;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.ProfilePageInfo;

public class r extends ConfigAutoParseJsonConsumer	// class@00042d
{

    public void r(){
       super(q.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
       }else {
          StartupCommonPojo mPerformance = p0.mPerformanceSdkConfig;
          if (mPerformance == null) {
             mPerformance = new PerformanceSdkConfig();
          }
          SharedPreferences a = b.a;
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putFloat("activityLaunchMonitorRatio", mPerformance.mActivityLaunchMonitorRatio);
          uEditor.putFloat("batteryMonitorSwitchRatio", mPerformance.mBatteryMonitorSwitchRatio);
          uEditor.putInt("bitmapAllocateMonitorCheckInterval", mPerformance.mBitmapAllocateMonitorCheckInterval);
          uEditor.putInt("bitmapAllocateMonitorDumpMemoryLimit", mPerformance.mBitmapAllocateMonitorDumpMemoryLimit);
          uEditor.putInt("bitmapAllocateMonitorMaxExistTime", mPerformance.mBitmapAllocateMonitorMaxExistTime);
          uEditor.putInt("bitmapAllocateMonitorMemoryMoreThan", mPerformance.mBitmapAllocateMonitorMemoryMoreThan);
          uEditor.putFloat("bitmapAllocateMonitorSwitchRatio", mPerformance.mBitmapAllocateMonitorSwitchRatio);
          uEditor.putFloat("blockMonitorSwitchRatio", mPerformance.mBlockMonitorSwitchRatio);
          uEditor.putLong("blockTimeThresholdMillis", mPerformance.mBlockTimeThresholdMillis);
          uEditor.putBoolean("enablePerformanceMonitorModule", mPerformance.mEnablePerformanceMonitorModule);
          uEditor.putFloat("fdCountRatioThreshold", mPerformance.mFdCountRatioThreshold);
          uEditor.putFloat("fdMonitorSwitchRatio", mPerformance.mFdMonitorSwitchRatio);
          uEditor.putFloat("frameMetricMonitorSwitchRatio", mPerformance.mFrameMetricMonitorSwitchRatio);
          uEditor.putFloat("frameRateSwitchRatio", mPerformance.mFrameRateSwitchRatio);
          uEditor.putFloat("jvmHeapMonitorSwitchRatio", mPerformance.mJvmHeapMonitorSwitchRatio);
          uEditor.putFloat("jvmHeapRatioThreshold", mPerformance.mJvmHeapRatioThreshold);
          uEditor.putFloat("pageSpeedMonitorSwitchRatio", mPerformance.mPageSpeedMonitorSwitchRatio);
          uEditor.putLong("stackSampleIntervalMillis", mPerformance.mStackSampleIntervalMillis);
          uEditor.putFloat("threadCountMonitorSwitchRatio", mPerformance.mThreadCountMonitorSwitchRatio);
          uEditor.putInt("threadCountThreshold", mPerformance.mThreadCountThreshold);
          g.a(uEditor);
          mPerformance = p0.mFrequentSearchWord;
          if (mPerformance != null) {
             uEditor = a.edit();
             uEditor.putLong("IntervalInMs", mPerformance.mIntervalInMs);
             uEditor.putInt("Times", mPerformance.mTimes);
             g.a(uEditor);
          }
          SharedPreferences$Editor uEditor1 = a.edit();
          uEditor1.putBoolean("AccountProtectVisible", p0.mAccountProtectVisible);
          uEditor1.putString("actionSurveyConfig", b.e(p0.mActionSurveyConfig));
          uEditor1.putString("adCommonStartConfig", b.e(p0.mAdCommonStartConfig));
          uEditor1.putString("ad_icon_config", b.e(p0.mAdIconConfig));
          uEditor1.putString("avatarPendantConfig", b.e(p0.mAvatarPendantConfig));
          uEditor1.putString("backGroundConfig", b.e(p0.mBackGroundConfig));
          uEditor1.putString("BadgeConfig", b.e(p0.mBadgeConfig));
          uEditor1.putBoolean("block_push_sdk_invoke_app", p0.mBlockPushSdkInvokeApp);
          uEditor1.putString("boardInfoList", b.e(p0.mBoardInfoList));
          uEditor1.putString("coinRewardConfig", b.e(p0.mCoinRewardConfig));
          uEditor1.putLong("comment_carousel_first_roll_duration", p0.mCommentCarouselFirstRollDuration);
          uEditor1.putLong("comment_carousel_normal_roll_duration", p0.mCommentCarouselNormalRollDuration);
          uEditor1.putString("daGlassesBuyUrl", p0.mDaGlassesBuyUrl);
          uEditor1.putBoolean("DisableAccountAppeal", p0.mDisableAccountAppeal);
          uEditor1.putBoolean("DisableAutoUploadUserLog", p0.mDisableAutoUploadUserLog);
          uEditor1.putBoolean("disableDaGlasses", p0.mDisableDaGlasses);
          uEditor1.putBoolean("disableDaGlassesDownload", p0.mDisableDaGlassesDownload);
          uEditor1.putBoolean("DisableDownloadCenter", p0.mDisableDownloadCenter);
          uEditor1.putBoolean("DisableKtvChorus", p0.mDisableKtvChorus);
          uEditor1.putBoolean("disableLaunchOpt", p0.mDisableLaunchOpt);
          uEditor1.putInt("DisableMusicFavorite", p0.mDisableMusicFavorite);
          uEditor1.putBoolean("DisablePushSwitch", p0.mDisablePushSwitch);
          uEditor1.putBoolean(b.d("user")+"DisableRecordWhenLongVideoUpload", p0.mDisableRecordWhenLongVideoUpload);
          uEditor1.putBoolean("DisableShareOriginalSoundTrack", p0.mDisableShareOriginalSoundTrack);
          uEditor1.putBoolean("disableSoundTrackChangeName", p0.mDisableSoundTrackChangeName);
          uEditor1.putBoolean("DisableSystemThumbnail", p0.mDisableSystemThumbnail);
          uEditor1.putBoolean("DisableUseOldToken", p0.mDisableUseOldToken);
          uEditor1.putBoolean("disableWebviewEvaluateJavascript", p0.mDisableWebviewEvaluateJavascript);
          uEditor1.putString("disclaimer_toast", p0.mDisclaimerToast);
          uEditor1.putString("displayMusicianPlanMusicTypes", b.e(p0.mDisplayMusicianPlanMusicTypes));
          uEditor1.putString("DraftOffLineBubbleText", p0.mDraftOffLineBubbleText);
          uEditor1.putString("eCommercePromotionorEntrance", b.e(p0.mECommercePromotionorConfig));
          uEditor1.putBoolean("enableCollectLocalMusic", p0.mEnableCollectLocalMusic);
          uEditor1.putBoolean("EnableCollectVerticalClassification", p0.mEnableCollectVerticalClassification);
          uEditor1.putBoolean(b.d("user")+"enable_comment_show_upload", p0.mEnableCommentShowUpload);
          uEditor1.putBoolean("EnableEspMobilePromotion", p0.mEnableEspMobilePromotion);
          uEditor1.putBoolean(b.d("user")+"enableMyfollowTabNotify", p0.mEnableFollowTabNotify);
          uEditor1.putBoolean("EnableForeignAppReg", p0.mEnableForeignAppReg);
          uEditor1.putBoolean(b.d("user")+"enable_gift_unfollow_ui", p0.mEnableGiftUnfollowUI);
          uEditor1.putBoolean("EnableHotCommentNewStyle", p0.mEnableHotCommentNewStyle);
          uEditor1.putInt("EnableHotRelatedSearch", p0.mEnableHotRelatedSearch);
          uEditor1.putBoolean("enableHwSdkLoaded", p0.mEnableHwSdkLoaded);
          uEditor1.putBoolean("EnableJsRunOnUiThread", p0.mEnableJsRunOnUiThread);
          uEditor1.putBoolean("enable_merchant_entrance", p0.mEnableMerchantEntrance);
          uEditor1.putBoolean("EnableMmkv", p0.mEnableMmkv);
          uEditor1.putBoolean("enableMoment", p0.mEnableMoment);
          uEditor1.putBoolean("enableOpenedAppStat", p0.mEnableOpenedAppStat);
          uEditor1.putBoolean("EnablePYMKSectionTitle", p0.mEnablePYMKSectionTitle);
          uEditor1.putBoolean("enable_protector", p0.mEnableProtector);
          uEditor1.putBoolean("EnableStandardSSL", p0.mEnableStandardSSL);
          uEditor1.putBoolean(b.d("user")+"EnableTaoPass", p0.mEnableTaoPass);
          uEditor1.putBoolean("EnableUnifiedRedDot", p0.mEnableUnifiedRedDot);
          uEditor1.putBoolean("enable_upload_music", p0.mEnableUploadMusic);
          uEditor1.putBoolean("FallbackRealTimeLog", p0.mFallbackRealTimeLog);
          uEditor1.putString("fansTopBubbleDesc", p0.mFansTopBubbleDesc);
          uEditor1.putBoolean(b.d("user")+"isFansTopEnabled", p0.mFansTopOn);
          uEditor1.putString("fanstopPromoteText", p0.mFansTopPromoteText);
          uEditor1.putInt("fansTopPromoteType", p0.mFansTopPromoteType);
          uEditor1.putBoolean("fansTopClickable", p0.mFanstopFlameClickable);
          uEditor1.putString("feedbackAndHelpLinkUrl", p0.mFeedbackAndHelpLinkUrl);
          uEditor1.putInt("foldupCommentThreshold", p0.mFoldupCommentThreshold);
          uEditor1.putInt("FollowLiveMaxCheckNoMorePage", p0.mFollowLiveMaxCheckNoMorePage);
          uEditor1.putLong("followMomentInterval", p0.mFollowMomentInterval);
          uEditor1.putInt("followMomentPopupCloseTime", p0.mFollowMomentPopupCloseTime);
          uEditor1.putLong("FollowReservePosInSecond", p0.mFollowReservePosInSecond);
          uEditor1.putString("friend_sources", b.e(p0.mFriendSources));
          uEditor1.putBoolean("ginsight_enabled", p0.mGInsightEnabled);
          uEditor1.putString("GameCenterConfigV2", b.e(p0.mGameCenterConfig));
          uEditor1.putInt(b.d("user")+"guestFollowFansListGroup", p0.mGuestFollowFansListGroup);
          uEditor1.putBoolean("HoldShareTokenDialog", p0.mHoldShareTokenDialog);
          uEditor1.putBoolean("in_china", p0.mInChina);
          uEditor1.putBoolean("IsFanstopForFriendsEntranceEnabled", p0.mIsFanstopForFriendsEntranceEnabled);
          uEditor1.putBoolean("IsFanstopForOthersEntranceEnabled", p0.mIsFanstopForOthersEntranceEnabled);
          uEditor1.putBoolean("isH265PlayEnabled", p0.mIsH265PlayEnabled);
          uEditor1.putString("kcard_book_info", b.e(p0.mKcardBookInfo));
          uEditor1.putString("kol_invitation_info", b.e(p0.mKolInvitationInfo));
          uEditor1.putInt("kpgDecoderType", p0.mKpgDecoderType);
          uEditor1.putLong("likeReasonCollectInterval", p0.mLikeReasonCollectInterval);
          uEditor1.putBoolean("LoginAgreementUnChecked", p0.mLoginAgreementUnChecked);
          uEditor1.putString("magicFaceAuthorH5Info", b.e(p0.mMagicFaceAuthorInfo));
          uEditor1.putInt("maxBatchPhotoShareCount", p0.mMaxBatchPhotoShareCount);
          uEditor1.putInt("maxBatchUserShareCount", p0.mMaxBatchUserShareCount);
          uEditor1.putInt("maxPhotoCollectCount", p0.mMaxPhotoCollectCount);
          uEditor1.putString("MerchantShopConfig", b.e(p0.mMerchantShopConfig));
          uEditor1.putBoolean(b.d("user")+"share_to_message_disable", p0.mMessageShareDisable);
          uEditor1.putInt("minFollowMomentCount", p0.mMinFollowMomentCount);
          uEditor1.putString("tagMusicBillboardH5Url", p0.mMusicBillboardH5Url);
          uEditor1.putString("kwai_musician_plan_h5_url", p0.mMusicianPlanH5Url);
          uEditor1.putBoolean("nearbyTabShowCityName", p0.mNearbyTabShowCityName);
          uEditor1.putBoolean("disableNewRegister", p0.mNewRegister);
          uEditor1.putBoolean(b.d("user")+"not_recommend_to_contacts_option", p0.mNotRecommendToContactsOption);
          uEditor1.putBoolean(b.d("user")+"not_share_live_stream_fragment_option", p0.mNotShareLiveStreamFragmentOption);
          uEditor1.putLong("noticeCountDay", p0.mNoticeCountDay);
          uEditor1.putLong("noticeCountSession", p0.mNoticeCountSession);
          uEditor1.putString("oldClientLogWhitelist", b.e(p0.mOldClientLogWhitelist));
          uEditor1.putString("OriginalProtectionUrl", p0.mOriginalProtectionUrl);
          uEditor1.putInt("PhoneLoginMode", p0.mPhoneLoginMode);
          uEditor1.putString("PhoneOneKeyLoginConfig", b.e(p0.mPhoneOneKeyLoginConfig));
          uEditor1.putBoolean("promote_camera_preview_fps", p0.mPromoteCameraFps);
          uEditor1.putFloat("protector_ratio", p0.mProtectorRatio);
          uEditor1.putInt("qqShareType", p0.mQQShareType);
          uEditor1.putInt("qqZoneShareType", p0.mQQZoneShareType);
          uEditor1.putString("reflux_config", b.e(p0.mRefluxConfig));
          uEditor1.putString("renwokan_book_info", b.e(p0.mRenwokanBookInfo));
          uEditor1.putString("ringtoneConversion", b.e(p0.mRingtone66Config));
          uEditor1.putBoolean("roamingHotFeedExp", p0.mRoamingHotFeedExp);
          uEditor1.putBoolean(b.d("user")+"SameFrameSwitchDefaultDisabled", p0.mSameFrameSwitchDefaultDisabled);
          uEditor1.putLong("SearchSuggestInterval", p0.mSearchSuggestInterval);
          uEditor1.putString("shareTokenRegex", p0.mShareTokenRegex);
          uEditor1.putBoolean("showAtMeTabPhotoPrivacySettings", p0.mShowAtMeTabPhotoPrivacySettings);
          uEditor1.putBoolean("show_at_me_tab_settings", p0.mShowAtMeTabSettings);
          uEditor1.putBoolean("ShowDownloadCenterBadge", p0.mShowDownloadCenterBadge);
          uEditor1.putBoolean("fansTopShowOnProfile", p0.mShowFanstopProfileEntrance);
          uEditor1.putBoolean("show_recharge_first_time_dot", p0.mShowRechargeFirstTimeDot);
          uEditor1.putBoolean("ShowSameFollowButton", p0.mShowSameFollowButton);
          uEditor1.putLong("skip_slide_play_live_interval", p0.mSkipSlidePlayLiveInterval);
          uEditor1.putLong("slide_prefetch_size", p0.mSlidePrefetchSize);
          uEditor1.putLong("slide_trigger_prefetch_size", p0.mSlideTriggerPrefetchSize);
          uEditor1.putInt("snap_show_hour", p0.mSnapShowHour);
          uEditor1.putString(b.d("user")+"SocialStarConfig", b.e(p0.mSocialStarConfig));
          uEditor1.putInt("soundTrackPromoteAfterPlayTime", p0.mSoundTrackPromoteAfterPlayTime);
          uEditor1.putString("myStartupCourseIsOpen", b.e(p0.mStartupCourseConfig));
          uEditor1.putFloat("sync_ntp_success_log_ratio", p0.mSyncNtpSuccessLogRatio);
          uEditor1.putString("tagReportTasks", b.e(p0.mTagReportTasks));
          uEditor1.putString("TaoPassRegex", p0.mTaoPassRegex);
          uEditor1.putBoolean(b.d("user")+"key_testin_abtest", p0.mTestinAbTestOn);
          uEditor1.putString("activityHints", b.e(p0.mThanosActivityHits));
          uEditor1.putString(b.d("user")+"hotWordSearchConfig", b.e(p0.mThanosHotWordSearchConfig));
          uEditor1.putInt("ThirdPartySdkCrashEnableFlag", p0.mThirdPartySdkCrashEnableFlag);
          uEditor1.putBoolean("tokenShareClipboardDetectDisabled", p0.mTokenShareClipboardDetectDisabled);
          uEditor1.putInt("VideoMillisLong", p0.mVideoMillisLong);
          uEditor1.putInt("video_millis_short_startup", p0.mVideoMillisShort);
          uEditor1.putInt("wechatShareType", p0.mWechatShareType);
          uEditor1.putInt("wechatTimelineShareType", p0.mWechatTimelineShareType);
          uEditor1.putString("coinWidgetDialog", b.e(p0.mWidgetDialogConfig));
          g.a(uEditor1);
          MyCourseConfig myCourseConf = MyCourseConfig.class;
          String str = a.a.getString("myCourseIsOpen", "");
          myCourseConf = (str == null || str == "")? null: b.a(str, myCourseConf);
          if (myCourseConf == null || System.currentTimeMillis() - myCourseConf.mExpireTime >= 0) {
             a.Z(p0.mStartupCourseConfig);
          }
          if (QCurrentUser.ME != null) {
             if (p0.mProfilePageInfo != null) {
                QCurrentUser.ME.setUserType(p0.mProfilePageInfo.mUserType);
             }else {
                QCurrentUser.ME.setUserType(0);
             }
          }
       }
       return;
    }
}
