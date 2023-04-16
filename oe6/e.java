package oe6.e;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.List;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.StringBuilder;
import java.util.Set;

public final class e	// class@002015
{
    public static final SharedPreferences a;

    static {
       e.a = b.b("DefaultPreferenceHelper");
    }
    public static List A(Type p0){
       String str = e.a.getString("lastThirdPlatformUserHeadUrls", "[]");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static void A0(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("pretty_guide_processing", p0);
       g.a(uEditor);
    }
    public static String B(){
       return e.a.getString("LastUserEmail", "");
    }
    public static void B0(int p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putInt(b.d("user")+"profile_tab_id", p0);
       g.a(uEditor);
    }
    public static String C(){
       return e.a.getString("LastUserName", "");
    }
    public static void C0(String p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("ShareGuidePlatform", p0);
       g.a(uEditor);
    }
    public static long D(){
       return e.a.getLong(b.d("user")+"latest_fans_insert_time", 0);
    }
    public static long E(){
       return e.a.getLong("like_reason_collect_interval", 0x5265c00);
    }
    public static long F(){
       return e.a.getLong(b.d("user")+"live_background_play_minutes", 0x2760);
    }
    public static String G(){
       return e.a.getString("live_beautify_configs", "");
    }
    public static long H(){
       return e.a.getLong("live_treasure_box_next_show_time", -1);
    }
    public static boolean I(){
       return e.a.getBoolean("long_press_extract_text_guide_has_shown", false);
    }
    public static int J(){
       return e.a.getInt("memory_frame_mode", 0);
    }
    public static boolean K(){
       return e.a.getBoolean("more_operation_guide_has_shown", false);
    }
    public static int L(){
       return e.a.getInt("new_user_swipe_guide_type", 0);
    }
    public static boolean M(){
       return e.a.getBoolean("pretty_guide_processing", false);
    }
    public static int N(){
       return e.a.getInt(b.d("user")+"profile_tab_id", 0);
    }
    public static String O(){
       return e.a.getString(b.d("user")+"profile_user_id", "");
    }
    public static boolean P(){
       return e.a.getBoolean(b.d("user")+"ReceiveMissUBefore", false);
    }
    public static float Q(){
       return e.a.getFloat("SettingsFontScale", 0xbf800000);
    }
    public static int R(){
       return e.a.getInt(b.d("user")+"user_avatar_size", 0);
    }
    public static boolean S(){
       return e.a.getBoolean("user_initiative_change_lang", false);
    }
    public static int T(){
       return e.a.getInt("video_quality_selected", 0);
    }
    public static void U(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("AccountAlreadyLogin", p0);
       g.a(uEditor);
    }
    public static void V(long p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putLong("action_survey_showed_last_time", p0);
       g.a(uEditor);
    }
    public static void W(String p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("beautify_configs", p0);
       g.a(uEditor);
    }
    public static void X(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("double_tab_like_guide_has_shown_for_back_flow_user", p0);
       g.a(uEditor);
    }
    public static void Y(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("double_tap_like_guide_has_shown", p0);
       g.a(uEditor);
    }
    public static void Z(long p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putLong("feed_hot_list_request_times", p0);
       g.a(uEditor);
    }
    public static boolean a(){
       return e.a.getBoolean("default_camera_front_facing", false);
    }
    public static void a0(long p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putLong("first_story_post_deadline", p0);
       g.a(uEditor);
    }
    public static boolean b(){
       return e.a.getBoolean("double_tab_like_guide_has_shown_for_back_flow_user", false);
    }
    public static void b0(int p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putInt("frame_mode", p0);
       g.a(uEditor);
    }
    public static long c(){
       return e.a.getLong("double_tap_like_guide_collect_last_time", 0);
    }
    public static void c0(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean(b.d("user")+"had_popup_reduce_similar_photo_pop", p0);
       g.a(uEditor);
    }
    public static boolean d(){
       return e.a.getBoolean("double_tap_like_guide_has_shown", false);
    }
    public static void d0(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("has_left_swipe_to_profile_guide_shown_for_back_flow_user", p0);
       g.a(uEditor);
    }
    public static boolean e(){
       return e.a.getBoolean("EnableFollowSystemFontScale", false);
    }
    public static void e0(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("HasShowNewBeautifyConfigPage", p0);
       g.a(uEditor);
    }
    public static Set f(Type p0){
       String str = e.a.getString(b.d("user")+"fansSharedPhotos", "{}");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static void f0(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("HasShownSetAliasHint", p0);
       g.a(uEditor);
    }
    public static long g(){
       return e.a.getLong("feed_hot_list_request_times", 0);
    }
    public static void g0(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("HomePageShouldToastRegisterStatus", p0);
       g.a(uEditor);
    }
    public static boolean h(){
       return e.a.getBoolean("finish_contacts_friends_guide", false);
    }
    public static void h0(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean(b.d("user")+"is_live_advance_beautify_manually_off", p0);
       g.a(uEditor);
    }
    public static boolean i(){
       return e.a.getBoolean("first_login", true);
    }
    public static void i0(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("is_live_floating_window_switch_on", p0);
       g.a(uEditor);
    }
    public static long j(){
       return e.a.getLong("first_story_post_deadline", 0);
    }
    public static void j0(String p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("last_beautify_config", p0);
       g.a(uEditor);
    }
    public static int k(){
       return e.a.getInt("frame_mode", 0);
    }
    public static void k0(String p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("lastFeedInfo", p0);
       g.a(uEditor);
    }
    public static boolean l(){
       return e.a.getBoolean("has_left_swipe_to_profile_guide_shown_for_back_flow_user", false);
    }
    public static void l0(String p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("last_live_beautify_config", p0);
       g.a(uEditor);
    }
    public static boolean m(){
       return e.a.getBoolean("has_show_medical_beautify_bubble", false);
    }
    public static void m0(long p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putLong("LastPhotoRateShownTime", p0);
       g.a(uEditor);
    }
    public static boolean n(){
       return e.a.getBoolean("has_show_medical_beauty_item", false);
    }
    public static void n0(String p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("LastPushSettingsInfo", p0);
       g.a(uEditor);
    }
    public static boolean o(){
       return e.a.getBoolean("HasShowNewBeautifyConfigPage", false);
    }
    public static void o0(long p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putLong("LastScanMediaTime", p0);
       g.a(uEditor);
    }
    public static boolean p(){
       return e.a.getBoolean("HasShownSetAliasHint", false);
    }
    public static void p0(List p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("lastThirdPlatformUserHeadUrls", b.e(p0));
       g.a(uEditor);
    }
    public static boolean q(){
       return e.a.getBoolean("is_home_new_video_bubble_showing", false);
    }
    public static void q0(long p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putLong("last_upload_contacts_time", p0);
       g.a(uEditor);
    }
    public static boolean r(){
       return e.a.getBoolean(b.d("user")+"is_live_advance_beautify_manually_off", false);
    }
    public static void r0(String p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("LastUserEmail", p0);
       g.a(uEditor);
    }
    public static boolean s(){
       return e.a.getBoolean("is_live_floating_window_switch_on", false);
    }
    public static void s0(String p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("LastUserName", p0);
       g.a(uEditor);
    }
    public static boolean t(){
       return e.a.getBoolean("is_live_treasure_box_switch_on", true);
    }
    public static void t0(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("left_swipe_to_profile_guide_has_shown", p0);
       g.a(uEditor);
    }
    public static int u(){
       return e.a.getInt("language_setting", 0);
    }
    public static void u0(String p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("live_beautify_configs", p0);
       g.a(uEditor);
    }
    public static String v(){
       return e.a.getString("lastFeedInfo", "");
    }
    public static void v0(String p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString(b.d("user")+"live_stream_status", p0);
       g.a(uEditor);
    }
    public static String w(){
       return e.a.getString("last_live_beautify_config", "");
    }
    public static void w0(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("long_press_extract_text_guide_has_shown", p0);
       g.a(uEditor);
    }
    public static long x(){
       return e.a.getLong("LastPhotoRateShownTime", 0);
    }
    public static void x0(int p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putInt("memory_frame_mode", p0);
       g.a(uEditor);
    }
    public static String y(){
       return e.a.getString("LastPushSettingsInfo", "");
    }
    public static void y0(int p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putInt("new_user_swipe_guide_type", p0);
       g.a(uEditor);
    }
    public static int z(){
       return e.a.getInt("LastThirdPlatform", -1);
    }
    public static void z0(long p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putLong("PidNextRefreshTime", p0);
       g.a(uEditor);
    }
}
