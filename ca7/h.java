package ca7.h;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import android.content.Context;
import java.io.File;
import android.os.Environment;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.regex.Matcher;
import ca7.t;
import android.content.ContentResolver;
import com.kwai.framework.deviceid.a;
import java.lang.Exception;
import ca7.u;
import java.util.Locale;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import ca7.v;
import java.util.Random;
import java.lang.Long;
import ca7.d;
import java.nio.charset.Charset;
import ca7.j;
import ca7.g;
import java.lang.Runtime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Runnable;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class h	// class@00051a
{
    public static final Pattern a;
    public static final List b;
    public static String c;
    public static ExecutorService d;

    static {
       h.a = Pattern.compile("^[0-9a-fA-F]{16}$");
       String[] stringArray = new String[]{"a5f5faddde9e9f02","8e17f7422b35fbea","b88c3c236923d9d9","cb36bf76cca443d0","5d4e49ed381836c5","cffa38e9136f93e9","62bd2daa59ea0173","b7aad49a2d5bc5d9","f2138912c5e5dd5c","330a1e81a2bf9f31","59c0f432ccbef844","521376155e535f39","aa5ec6ce14abd680","5522a09bb500d82f","6dfe4a96800edfb4","ecc9a2dded8cdf72","399f868043955b11","34dc327c00dbff94","d1b4e3862c309f8b","68bdbf71f863ccac","01558dd995085a35","351174200a06da52","fa0988506c76ff4b","8eb8ef823312c61a","a72e81be65c4638b","416d15a015c8f324","474086ea2d737519","befdddf908c8d749","780ee58a6f57aab6","cfe86fa07cae3601","704ff4d1534f0ff4","9298b9e9bbd7cdea","7b634c42f236c6e8","11eacf22b9ceab7d","2941a4f39eec5864","87d134dc5ba45550","fdd2313bb1750eb9","6560ef232d8424bb","5d876286e1064482","f66fefb916f4962d","7baf82d0ac49f596","57748921d8d88ed4","120cd57f1a50b8f5","e164f9610ddd9fc8","6256f0e8da6389de","bcb22df712476416","714fa9aff63f7adb","cb8252e4da7cf610","e18f649aa80e140c","966790a9db5ea8d8","e1769e681af901dd","d23f2574a60964a4","d717e6298d3c9cb2","f5ea5e8ba730864e","a8a0a223d1a42232","6675a4f231f5c8db","3edb7c2103e5c75a","8ce6a9a216b326c4","af606153eb3be0a7","7ae255c3d760c920","e50e94c40048c5fd","55009bca30f9dc4c","c37566487909214a","891b74f7e534d14a","726e190aae663525","df473127d30fb669","bfbcc646d92dfd48","a4a1954c44751936","da4a44a3d7c4d8be","5ff5bca4a775dd30","14917461e1917c53","14ce20d0a80955fa","a56a63de4d3f3d39","f780246adc7bd556","3495a541aea0da72","f7f205ce47fed2a5","f52db3f434279c3a","dca17088c97dee5e","dd53a8b3a2a4ccc0","52e07629290d45e4","cda522b0f8f50d9a","b85a1c8bcd51d82c","e344a00cd3f5e93a","fa59d8a66d7bdd88","68fb1f1393a216e8","4c30ab1fb10af181","b1376e0578099143","88752f72d8d305fd","fddf20078d27bf3c","dab2120bffa2be8c","c7c8dde481793471","e4b1bdbcabfc284d","b06ebfc4520b5008","2a782c9015e19bc1","aa02fbb253737fc8","ac69d74ef1ba99e4","dbd4d56770897c47","abafaa417ee08ca2","795c456a96f21c5b","a5f5faddde9e9f02","fe0b1c9868b9cd97","d9d75592d9146cbe","26d084fed86946ae","7034ad254eda67ad"
    ,"674d3e9fa3f2fa4e","3a45681de9ef1b90","f4ffa5fbd84db322","75bcc47f4ff738df","743461a0e4d0ff76","6bd6c744119b9094","39aef181a6030b79","529da8c466197e06","8e17f7422b35fbea","ee8425b2963f98ae","780e2c5023c135b5","5861b6ef90e23b25"};
       h.b = Arrays.asList(stringArray);
    }
    public static File a(Context p0){
       return new File(p0.getExternalFilesDir(""), ".kwai_did");
    }
    public static File b(Context p0){
       if (("mounted").equals(Environment.getExternalStorageState())) {
          return null;
       }
       File uFile = new File(Environment.getExternalStorageDirectory(), "."+p0.getPackageName());
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       return new File(uFile, ".kwai_did");
    }
    public static synchronized String c(Context p0){
       _monitor_enter(h.class);
       if (TextUtils.isEmpty(h.c)) {
          h.c = h.e(p0);
       }
       _monitor_exit(h.class);
       return h.c;
    }
    public static boolean d(String p0){
       boolean b = (!TextUtils.isEmpty(p0) && h.a.matcher(p0).find())? true: false;
       return b;
    }
    public static String e(Context p0){
       String str1;
       String str2;
       String str3;
       StringBuilder str4;
       int i;
       String str = "android_id";
       if (t.b == null) {
          try{
             t.b = a.g(p0.getContentResolver(), str);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public static String f(File p0){
       if (p0 == null) {
          return null;
       }
       try{
          return j.a(p0, d.c);
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public static void g(File p0,String p1){
       g og = new g(p0, p1);
       if (h.d == null) {
          h.d = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
       }
       h.d.execute(og);
       return;
    }
    public static void h(Context p0,String p1){
       g.a(PreferenceManager.getDefaultSharedPreferences(p0).edit().putString("android_id", p1));
    }
}
