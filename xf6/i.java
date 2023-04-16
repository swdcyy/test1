package xf6.i;
import java.lang.String;
import xf6.l;
import java.lang.Boolean;
import o56.c;
import o56.a;

public class i	// class@0027f9
{
    public static Boolean a;
    public static Boolean b;

    public static boolean a(){
       return l.c("KEY_ENABLE_MESSAGE_CHATPAGE_LAUNCH_OPTIMIZE", false);
    }
    public static boolean b(){
       return l.c("KEY_ENABLE_PRELOAD_OFFICIAL_BIG_EMOTION", false);
    }
    public static boolean c(String p0){
       return l.c(p0, false);
    }
    public static int d(){
       return l.e("ENABLE_FOLLOW_LIVE_AUTO_PLAY_CARD", 0);
    }
    public static int e(){
       return l.e("ENABLE_FOLLOW_LIVE_BULLET_SCREEN", 0);
    }
    public static int f(){
       return l.e("pay_test_url_debug", 0);
    }
    public static int g(String p0){
       return l.e(p0, 0);
    }
    public static String h(String p0){
       return l.g(p0, "");
    }
    public static boolean i(){
       return l.c("KEY_ENABLE_FOLLOW_DEBUG_INFO", false);
    }
    public static boolean j(){
       return l.c("ENABLE_FOLLOW_IGNORE_FILTER_BUBBLE_TIMES", false);
    }
    public static boolean k(){
       return l.c("KEY_ENABLE_SHARE_WX_MINI_PROGRAM_DEBUG", false);
    }
    public static boolean l(){
       if (i.a == null) {
          i.a = Boolean.valueOf(l.c("pay_test_url_debug_info", false));
       }
       return i.a.booleanValue();
    }
    public static boolean m(){
       boolean b = false;
       if (a.a().c() && l.c("enableSocialDebugInfo", b)) {
          b = true;
       }
       return b;
    }
    public static boolean n(){
       return l.c("KEY_IM_WHATS_UP_USER_ONLINE_IGNORE", false);
    }
}
