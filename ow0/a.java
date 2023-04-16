package ow0.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger$LiveGiftBoxAnimationStrategyModel;
import java.lang.StringBuilder;
import java.util.HashMap;
import java.util.Map;
import s21.a;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a	// class@0035b1
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static int a(){
       return a.a.getInt("CommentShowTimes", 0);
    }
    public static int b(){
       return a.a.getInt("DurationShowTimes", 0);
    }
    public static boolean c(){
       return a.a.getBoolean("enable_real_time_qos_log", false);
    }
    public static long d(){
       return a.a.getLong("LastCommentToastDate", 0);
    }
    public static long e(){
       return a.a.getLong("LastDurationToastDate", 0);
    }
    public static boolean f(){
       return a.a.getBoolean("liveAsrIsLastCompleteFromAsr", true);
    }
    public static LiveAudienceBottomBarGiftAnimationManger$LiveGiftBoxAnimationStrategyModel g(Type p0){
       String str = a.a.getString(b.d("user")+"live_audience_gift_box_animation_strategy_model", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static HashMap h(Type p0){
       String str = a.a.getString(b.d("user")+"live_audience_gift_recharge_anim_show_times_map", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static long i(){
       return a.a.getLong(b.d("user")+"live_audience_last_open_gift_box_time", 0);
    }
    public static Map j(Type p0){
       String str = a.a.getString(b.d("user")+"liveFirstSendBulletCommentTips", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static boolean k(){
       return a.a.getBoolean("liveIsActivityGiftDialogConfirmWithoutNoticeChecked", false);
    }
    public static HashMap l(Type p0){
       String str = a.a.getString("livePendantViewsLastHideTime", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static HashMap m(Type p0){
       String str = a.a.getString("livePendantViewsShowedDuration", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static Map n(Type p0){
       String str = a.a.getString(b.d("user")+"liveRightTopPendantRedDotHideTime", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static void o(a p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("CommentShowTimes", p0.d);
       uEditor.putInt("DurationShowTimes", p0.c);
       uEditor.putLong("LastCommentToastDate", p0.b);
       uEditor.putLong("LastDurationToastDate", p0.a);
       g.a(uEditor);
    }
    public static void p(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("liveAsrIsLastCompleteFromAsr", p0);
       g.a(uEditor);
    }
    public static void q(HashMap p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString(b.d("user")+"live_audience_gift_recharge_anim_show_times_map", b.e(p0));
       g.a(uEditor);
    }
    public static void r(long p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong(b.d("user")+"live_audience_last_open_gift_box_time", p0);
       g.a(uEditor);
    }
    public static void s(int p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt(b.d("user")+"live_comment_editor_panel_last_selected_tab", p0);
       g.a(uEditor);
    }
}
