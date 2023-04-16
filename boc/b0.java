package boc.b0;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import qfc.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import q87.c;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class b0	// class@00043a
{
    public static SharedPreferences a;

    static {
       b0.a = b.c("resource_manager", 0);
    }
    public static boolean a(String p0){
       int i;
       p0 = "check_file_"+p0;
       try{
          i = 0;
          boolean booleanx = b0.a.getBoolean(p0, i);
          Object[] objArray = new Object[i];
          a.C().D("CategoryPreference", "[yModel][keypath][check] ", "getCheckFlag "+p0+" "+booleanx, objArray);
          return booleanx;
       }catch(java.lang.Exception e1){
          PostUtils.D("ks://"+p0, "readError", e1);
          return i;
       }
    }
    public static String b(){
       try{
          return b0.a.getString("magic_model_list", "");
       }catch(java.lang.Exception e0){
          PostUtils.D("ks://magic_model_list", "readError", e0);
          return null;
       }
    }
    public static String c(){
       String str = null;
       try{
          return b0.a.getString("resource_cdn_config", str);
       }catch(java.lang.Exception e1){
          PostUtils.D("ks://resource_cdn_config", "readError", e1);
          return str;
       }
    }
    public static String d(String p0){
       String str = null;
       try{
          String str1 = b0.a.getString(p0, str);
          Object[] objArray = new Object[0];
          a.C().w("CategoryPreference", "getConfig "+p0+" "+str1, objArray);
          return str1;
       }catch(java.lang.Exception e1){
          PostUtils.D("ks://"+p0, "readError", e1);
          return str;
       }
    }
    public static void e(String p0,boolean p1){
       p0 = "check_file_"+p0;
       try{
          Object[] objArray = new Object[0];
          a.C().D("CategoryPreference", "[yModel][keypath][check] ", "setCheckFlag "+p0+" "+p1, objArray);
          g.a(b0.a.edit().putBoolean(p0, p1));
       }catch(java.lang.Exception e6){
          PostUtils.D("ks://"+p0, "writeError", e6);
       }
       return;
    }
    public static void f(String p0){
       try{
          g.a(b0.a.edit().putString("resource_cdn_config", p0));
       }catch(java.lang.Exception e2){
          PostUtils.D("ks://resource_cdn_config", "writeError", e2);
       }
       return;
    }
}
