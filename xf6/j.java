package xf6.j;
import java.lang.String;
import xf6.l;
import xf6.a;
import o56.c;
import o56.a;

public class j	// class@0027fa
{

    public static boolean a(){
       return l.c("enable_debug_log", false);
    }
    public static boolean b(){
       boolean b = false;
       if (j.e() && l.c("enable_plain_ad_log", b)) {
          b = true;
       }
       return b;
    }
    public static boolean c(){
       return l.c("KEY_MOCK_SEARCH_PLUGIN_FAIL", false);
    }
    public static boolean d(){
       return l.c("show_exp_tag", false);
    }
    public static boolean e(){
       if (a.a != null) {
          return false;
       }
       return a.a().c();
    }
}
