package xf6.h;
import java.lang.String;
import xf6.l;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o56.c;
import o56.a;

public final class h	// class@0027f8
{

    public static void A(String p0){
       l.k("sogame_pay_test_idc", p0);
    }
    public static void B(String p0){
       l.k("sogame_test_idc", p0);
    }
    public static String a(){
       return h.d("test_idc");
    }
    public static String b(){
       return l.g("gamecenter_idc", "");
    }
    public static String c(){
       return l.g("gateway_debug_host", "www.kuaishoupay.com");
    }
    public static String d(String p0){
       String str = null;
       if (!h.v()) {
          return str;
       }
       p0 = l.g(p0, "");
       if (!TextUtils.x(p0)) {
          str = p0;
       }
       return str;
    }
    public static String e(){
       return l.g("laneId", "");
    }
    public static String f(){
       return h.d("live_test_idc");
    }
    public static String g(){
       return h.d("merchant_idc");
    }
    public static String h(){
       return l.g("report_debug_host", "app.m.kuaishou.com");
    }
    public static String i(){
       return l.g("webapp_idc", "");
    }
    public static String j(){
       return l.g("web_esp_mobile_idc", "");
    }
    public static String k(){
       return l.g("live_web_test_idc", "");
    }
    public static String l(){
       return l.g("web_merchant_im_idc", "");
    }
    public static String m(){
       return l.g("web_merchant_idc", "");
    }
    public static String n(){
       return h.d("web_idc");
    }
    public static String o(){
       return l.g("webwallet_idc", "");
    }
    public static boolean p(){
       return l.c("disable_https", false);
    }
    public static boolean q(){
       return l.c("disable_test_hook", false);
    }
    public static boolean r(){
       return l.c("enable_staging", false);
    }
    public static boolean s(){
       return l.c("enable_test", false);
    }
    public static boolean t(){
       return l.c("enable_test_pay", false);
    }
    public static boolean u(){
       return l.c("key_gateway_pay_debug", false);
    }
    public static boolean v(){
       return a.a().c();
    }
    public static boolean w(){
       return l.c("enable_header_trace_id", false);
    }
    public static void x(String p0){
       l.k("test_idc", p0);
    }
    public static void y(String p0){
       l.k("sogame_channel_test_idc", p0);
    }
    public static void z(String p0){
       l.k("sogame_middle_idc", p0);
    }
}
