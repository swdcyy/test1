package oe6.b;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import com.kwai.framework.preference.startup.RefluxConfig;
import com.kwai.framework.preference.startup.GameCenterConfig;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.framework.preference.startup.ActionSurveyConfig;
import com.kwai.framework.preference.startup.AvatarPendantConfig;
import com.kwai.framework.preference.startup.MagicFaceAuthorH5Info;

public final class b	// class@002013
{
    public static final SharedPreferences a;

    static {
       b.a = b.b("AppStartupPreference");
    }
    public static int A(){
       return b.a.getInt("PhoneLoginMode", 0);
    }
    public static RefluxConfig B(Type p0){
       String str = b.a.getString("reflux_config", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static boolean C(){
       return b.a.getBoolean("showAtMeTabPhotoPrivacySettings", false);
    }
    public static long D(){
       return b.a.getLong("slide_trigger_prefetch_size", 0);
    }
    public static long E(){
       return b.a.getLong("stackSampleIntervalMillis", 100);
    }
    public static float F(){
       return b.a.getFloat("sync_ntp_success_log_ratio", 0.01f);
    }
    public static int G(){
       return b.a.getInt("tag_hash_type", 0);
    }
    public static String H(){
       return b.a.getString("tagMusicBillboardH5Url", "");
    }
    public static String I(){
       return b.a.getString("TaoPassRegex", "");
    }
    public static int J(){
       return b.a.getInt("units_int", 0);
    }
    public static String K(){
       return b.a.getString("videoModelCrowdTag", "");
    }
    public static void L(GameCenterConfig p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putString("GameCenterConfigV2", b.e(p0));
       g.a(uEditor);
    }
    public static void M(int p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putInt("units_int", p0);
       g.a(uEditor);
    }
    public static ActionSurveyConfig a(Type p0){
       String str = b.a.getString("actionSurveyConfig", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static boolean b(){
       return b.a.getBoolean("allow_adv_private_option", false);
    }
    public static AvatarPendantConfig c(Type p0){
       String str = b.a.getString("avatarPendantConfig", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static long d(){
       return b.a.getLong("blockTimeThresholdMillis", 1000);
    }
    public static boolean e(){
       return b.a.getBoolean("DisableAutoUploadUserLog", false);
    }
    public static boolean f(){
       return b.a.getBoolean("DisableDownloadCenter", false);
    }
    public static boolean g(){
       return b.a.getBoolean("DisableKtvChorus", false);
    }
    public static int h(){
       return b.a.getInt("DisableMusicFavorite", 0);
    }
    public static boolean i(){
       return b.a.getBoolean("DisableShareOriginalSoundTrack", false);
    }
    public static boolean j(){
       return b.a.getBoolean("disableSoundTrackChangeName", false);
    }
    public static boolean k(){
       return b.a.getBoolean("DisableUseOldToken", false);
    }
    public static boolean l(){
       return b.a.getBoolean("disableWebviewEvaluateJavascript", false);
    }
    public static String m(){
       return b.a.getString("disclaimer_toast", "");
    }
    public static String n(){
       return b.a.getString("DraftOffLineBubbleText", "");
    }
    public static boolean o(){
       return b.a.getBoolean("EnableAdvancedMakeup", true);
    }
    public static boolean p(){
       return b.a.getBoolean("enable_merchant_entrance", true);
    }
    public static boolean q(){
       return b.a.getBoolean("enableMoment", false);
    }
    public static boolean r(){
       return b.a.getBoolean("enableOpenedAppStat", false);
    }
    public static boolean s(){
       return b.a.getBoolean("enable_upload_music", false);
    }
    public static int t(){
       return b.a.getInt("fansTopPromoteType", 0);
    }
    public static int u(){
       return b.a.getInt("feed_cover_prefetch_count", 4);
    }
    public static String v(){
       return b.a.getString("feedbackAndHelpLinkUrl", "");
    }
    public static boolean w(){
       return b.a.getBoolean("HoldShareTokenDialog", false);
    }
    public static String x(){
       return b.a.getString("kwai_musician_plan_h5_url", "");
    }
    public static MagicFaceAuthorH5Info y(Type p0){
       String str = b.a.getString("magicFaceAuthorH5Info", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static String z(){
       return b.a.getString("OriginalProtectionUrl", "");
    }
}
