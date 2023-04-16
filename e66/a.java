package e66.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a	// class@00150f
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static String a(){
       return a.a.getString(b.d("user")+"ABTestServiceToken", "");
    }
    public static String b(){
       return a.a.getString("KeyConfigDiffInfo", "");
    }
    public static String c(){
       return a.a.getString("ks_account_protect_private", "");
    }
    public static String d(){
       return a.a.getString("ks_account_protect_public", "");
    }
    public static int e(){
       return a.a.getInt("startup", 0);
    }
    public static String f(){
       return a.a.getString(b.d("user")+"switchesVer", "");
    }
    public static void g(String p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString(b.d("user")+"ABTestServiceToken", p0);
       g.a(uEditor);
    }
    public static void h(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("DiffInfoSwitch", p0);
       g.a(uEditor);
    }
    public static void i(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("KeyConfigDiffInfoSwitch", p0);
       g.a(uEditor);
    }
    public static void j(String p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("ks_account_protect_private", p0);
       g.a(uEditor);
    }
    public static void k(String p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("ks_account_protect_public", p0);
       g.a(uEditor);
    }
    public static void l(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("ReportIDCSwitch", p0);
       g.a(uEditor);
    }
    public static void m(int p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("startup", p0);
       g.a(uEditor);
    }
}
