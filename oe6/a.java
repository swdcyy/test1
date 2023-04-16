package oe6.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.StringBuilder;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.framework.preference.startup.MyCourseConfig;

public final class a	// class@002012
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("AppSharedPreference");
    }
    public static long A(){
       return a.a.getLong("rewardTipsShowTimeNasa", 0);
    }
    public static boolean B(){
       return a.a.getBoolean("ShouldShowAggregateLikeHint", true);
    }
    public static boolean C(){
       return a.a.getBoolean("ShouldShowLongPressCollectHint", true);
    }
    public static boolean D(){
       return a.a.getBoolean("ShouldShowPressControlSpeedHint", true);
    }
    public static boolean E(){
       return a.a.getBoolean("ShouldShowSimilarPhotoHint", true);
    }
    public static boolean F(){
       return a.a.getBoolean("ShouldShowSlidePlayBottomFollowHint", true);
    }
    public static boolean G(){
       return a.a.getBoolean("ShouldShowSlideScaleCleanHint", true);
    }
    public static boolean H(){
       return a.a.getBoolean("ShouldShowSlideV2AtlasLeftSlideHint", true);
    }
    public static boolean I(){
       return a.a.getBoolean("ShouldShowSlideV2GotoProfileHint", true);
    }
    public static boolean J(){
       return a.a.getBoolean("ShouldShowSlideV2LeftSlideHint", true);
    }
    public static boolean K(){
       return a.a.getBoolean("ShouldShowSlideV2LeftUpSlideHint", true);
    }
    public static boolean L(){
       return a.a.getBoolean("ShouldShowSlideV2UpSlideHint", true);
    }
    public static boolean M(){
       return a.a.getBoolean("show_comment_gif_emotion_guide_bubble_v2", false);
    }
    public static List N(Type p0){
       String str = a.a.getString("sleep_intervals", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static Map O(Type p0){
       String str = a.a.getString("today_notice_times", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static Map P(Type p0){
       String str = a.a.getString("use_time_record", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static boolean Q(){
       return a.a.getBoolean("video_quality_switch_guide_shown", false);
    }
    public static final HashMap R(){
       SharedPreferences a;
       HashMap hashMap = new HashMap();
       hashMap.put("AgreePrivacyDialog", Boolean.valueOf(a.a()));
       hashMap.put("AppVersionBeforeLastUpload", a.b());
       hashMap.put("AtlasProgressDragGuideHint", Boolean.valueOf(a.c()));
       hashMap.put("CameraPermissionGuideShow", Boolean.valueOf(a.g()));
       a = a.a;
       hashMap.put("ClickBrowseSettingFromDialog", Boolean.valueOf(a.getBoolean("ClickBrowseSettingFromDialog", false)));
       hashMap.put("CollectPhotoCnt", Integer.valueOf(a.getInt("collectPhotoCnt", false)));
       hashMap.put("CountryIso", a.h());
       hashMap.put("DisableSettingPrivacyClip", Boolean.valueOf(a.i()));
       hashMap.put("EGID", a.j());
       hashMap.put("FirstShowMusicStationGuide", Boolean.valueOf(a.getBoolean("first_show_music_station_guide", true)));
       hashMap.put("HasRequestedQqFriendsPermission", Boolean.valueOf(a.k()));
       hashMap.put("HistoryUpdateVersionRecord", a.l());
       hashMap.put("IgnoreSleepDate", Long.valueOf(a.m()));
       hashMap.put("ImageFileMaxSize", Integer.valueOf(a.n()));
       hashMap.put("IsPrivacyDialogNewUser", Boolean.valueOf(a.o()));
       hashMap.put("IsReeditMusicTipShown", Boolean.valueOf(a.p()));
       hashMap.put("IsReeditTipShown", Boolean.valueOf(a.q()));
       hashMap.put("LastAppUploadTime", Long.valueOf(a.r()));
       hashMap.put("LastAppVersion", a.s());
       hashMap.put("LastSaveTime", Long.valueOf(a.t()));
       hashMap.put("MiniDeviceInfo", a.u());
       hashMap.put("BindMobile", a.d());
       hashMap.put("BindMobileCountryCode", a.e());
       hashMap.put("MusicStationLastWatchedPhotoId", a.getString("music_station_last_watched_photo_id", ""));
       hashMap.put("MusicStationOpenEntranceDialogShowedCount", Integer.valueOf(a.getInt("music_station_open_entrance_dialog_showed_count", false)));
       hashMap.put("MusicStationOpenEntranceDialogShowedTimeMs", Long.valueOf(a.getLong("music_station_open_entrance_dialog_showed_time_ms", 0)));
       hashMap.put("NeedDisplayPrivacyDialog", Boolean.valueOf(a.v()));
       hashMap.put("OpenPrivacyClipLastShowTime", Long.valueOf(a.w()));
       hashMap.put("BindPhone", a.f());
       hashMap.put("PlayDuration", Long.valueOf(a.x()));
       hashMap.put("PrivacyPolicyWatched", Boolean.valueOf(a.getBoolean("privacyPolicyWatched", false)));
       hashMap.put("RestInterval", Integer.valueOf(a.y()));
       hashMap.put("RewardTipsShowCountNasa", Integer.valueOf(a.z()));
       hashMap.put("RewardTipsShowTimeNasa", Long.valueOf(a.A()));
       hashMap.put("ShouldLowActiveUpGuideShowedHint", Boolean.valueOf(a.getBoolean("ShouldLowActiveUpGuideShowedHint", true)));
       hashMap.put("ShouldShowAggregateLikeHint", Boolean.valueOf(a.B()));
       hashMap.put("ShouldShowAggregateUpSlideHintV2", Boolean.valueOf(a.getBoolean("ShouldShowAggregateUpSlideHintV2", true)));
       hashMap.put("ShouldShowLandscapeAnimation", Boolean.valueOf(a.getBoolean("ShouldShowLandscapeAnimation", true)));
       hashMap.put("ShouldShowLongPressCollectHint", Boolean.valueOf(a.C()));
       hashMap.put("ShouldShowOverallSlideGuideAgain", Boolean.valueOf(a.getBoolean("ShouldShowOverallSlideGuideAgain", true)));
       hashMap.put("ShouldShowPressControlSpeedHint", Boolean.valueOf(a.D()));
       hashMap.put("ShouldShowScreenClearHint", Boolean.valueOf(a.getBoolean("ShouldShowScreenClearHint", true)));
       hashMap.put("ShouldShowSidebarSimilarAuthorHint", Boolean.valueOf(a.getBoolean("ShouldShowSidebarSimilarAuthorHint", true)));
       hashMap.put("ShouldShowSimilarPhotoHint", Boolean.valueOf(a.E()));
       hashMap.put("ShouldShowSimilarUpSlideHint", Boolean.valueOf(a.getBoolean("ShouldShowSimilarUpSlideHint", true)));
       hashMap.put("ShouldShowSlidePlayBottomFollowHint", Boolean.valueOf(a.F()));
       hashMap.put("ShouldShowSlidePlayDoubleClickLikeHint", Boolean.valueOf(a.getBoolean("ShouldShowSlidePlayDoubleClickLikeHint", true)));
       hashMap.put("ShouldShowSlidePlayGotoProfileHint", Boolean.valueOf(a.getBoolean("ShouldShowSlidePlayGotoProfileHint", true)));
       hashMap.put("ShouldShowSlidePlayLeftSlideHint", Boolean.valueOf(a.getBoolean("ShouldShowSlidePlayLeftSlideHint", true)));
       hashMap.put("ShouldShowSlidePlayLeftUpSlideHint", Boolean.valueOf(a.getBoolean("ShouldShowSlidePlayLeftUpSlideHint", true)));
       hashMap.put("ShouldShowSlidePlayRightFollowHint", Boolean.valueOf(a.getBoolean("ShouldShowSlidePlayRightFollowHint", true)));
       hashMap.put("ShouldShowSlidePlaySingleTapClearScreenHint", Boolean.valueOf(a.getBoolean("ShouldShowSlidePlaySingleTapClearScreenHint", true)));
       hashMap.put("ShouldShowSlidePlayUpSlideHint", Boolean.valueOf(a.getBoolean("ShouldShowSlidePlayUpSlideHint", true)));
       hashMap.put("ShouldShowSlideScaleCleanHint", Boolean.valueOf(a.G()));
       hashMap.put("ShouldShowSlideV2AtlasLeftSlideHint", Boolean.valueOf(a.H()));
       hashMap.put("ShouldShowSlideV2GotoProfileHint", Boolean.valueOf(a.I()));
       hashMap.put("ShouldShowSlideV2LeftSlideHint", Boolean.valueOf(a.J()));
       hashMap.put("ShouldShowSlideV2LeftUpSlideHint", Boolean.valueOf(a.K()));
       hashMap.put("ShouldShowSlideV2UpSlideHint", Boolean.valueOf(a.L()));
       hashMap.put("ShowCommentGifEmotionGuideBubbleV2", Boolean.valueOf(a.M()));
       hashMap.put("SmallAvatarToasted", Boolean.valueOf(a.getBoolean(b.d("user")+"smallAvatarToasted", false)));
       hashMap.put("SpecialBubbleShownCount", Integer.valueOf(a.getInt("specialBubbleShownCount", false)));
       hashMap.put("SpecialBubbleShownTime", Long.valueOf(a.getLong("specialBubbleShownTime", 0)));
       hashMap.put("StartTime", Long.valueOf(a.getLong("start_time", 0)));
       hashMap.put("VideoQualitySwitchGuideShown", Boolean.valueOf(a.Q()));
       return hashMap;
    }
    public static void S(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("agree_privacy_dialog", p0);
       g.a(uEditor);
    }
    public static void T(String p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("bind_mobile_country_code", p0);
       g.a(uEditor);
    }
    public static void U(String p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("bind_phone", p0);
       g.a(uEditor);
    }
    public static void V(String p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("EGID", p0);
       g.a(uEditor);
    }
    public static void W(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("has_requested_qq_friends_permission", p0);
       g.a(uEditor);
    }
    public static void X(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("is_reedit_tip_shown", p0);
       g.a(uEditor);
    }
    public static void Y(String p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("MiniDeviceInfo", p0);
       g.a(uEditor);
    }
    public static void Z(MyCourseConfig p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("myCourseIsOpen", b.e(p0));
       g.a(uEditor);
    }
    public static boolean a(){
       return a.a.getBoolean("agree_privacy_dialog", false);
    }
    public static void a0(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("need_display_privacy_dialog", p0);
       g.a(uEditor);
    }
    public static String b(){
       return a.a.getString("app_version_before_last_upload", "");
    }
    public static void b0(long p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong("play_duration", p0);
       g.a(uEditor);
    }
    public static boolean c(){
       return a.a.getBoolean("AtlasProgressDragGuideHint", true);
    }
    public static void c0(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("ShouldShowAggregateLikeHint", p0);
       g.a(uEditor);
    }
    public static String d(){
       return a.a.getString("bind_mobile", "");
    }
    public static void d0(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("ShouldShowSlideV2GotoProfileHint", p0);
       g.a(uEditor);
    }
    public static String e(){
       return a.a.getString("bind_mobile_country_code", "");
    }
    public static void e0(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("ShouldShowSlideV2LeftSlideHint", p0);
       g.a(uEditor);
    }
    public static String f(){
       return a.a.getString("bind_phone", "");
    }
    public static void f0(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("show_comment_gif_emotion_guide_bubble_v2", p0);
       g.a(uEditor);
    }
    public static boolean g(){
       return a.a.getBoolean("camera_permission_guide_show", false);
    }
    public static String h(){
       return a.a.getString("country_iso", "CN");
    }
    public static boolean i(){
       return a.a.getBoolean("disable_setting_privacy_clip", false);
    }
    public static String j(){
       return a.a.getString("EGID", "");
    }
    public static boolean k(){
       return a.a.getBoolean("has_requested_qq_friends_permission", false);
    }
    public static String l(){
       return a.a.getString("history_update_version_record", "");
    }
    public static long m(){
       return a.a.getLong("ignore_sleep_date", 0);
    }
    public static int n(){
       return a.a.getInt("image_file_max_size", 0);
    }
    public static boolean o(){
       return a.a.getBoolean("is_privacy_dialog_new_user", true);
    }
    public static boolean p(){
       return a.a.getBoolean("is_reedit_music_tip_shown", false);
    }
    public static boolean q(){
       return a.a.getBoolean("is_reedit_tip_shown", false);
    }
    public static long r(){
       return a.a.getLong("last_app_upload_time", 0);
    }
    public static String s(){
       return a.a.getString("last_app_version", "");
    }
    public static long t(){
       return a.a.getLong("last_save_time", 0);
    }
    public static String u(){
       return a.a.getString("MiniDeviceInfo", "");
    }
    public static boolean v(){
       return a.a.getBoolean("need_display_privacy_dialog", true);
    }
    public static long w(){
       return a.a.getLong("open_privacy_clip_last_show_time", 0);
    }
    public static long x(){
       return a.a.getLong("play_duration", 0);
    }
    public static int y(){
       return a.a.getInt("rest_interval", 0);
    }
    public static int z(){
       return a.a.getInt("rewardTipsShowCountNasa", 0);
    }
}
