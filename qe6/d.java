package qe6.d;
import java.util.Locale;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import oe6.e;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Integer;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class d	// class@00226a
{
    public static final Locale a;

    static {
       d.a = new Locale("zh", "HK");
    }
    public void d(){
       super();
    }
    public static String a(Locale p0){
       String obj = PatchProxy.applyOneRefs(p0, null, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.c(p0);
       String str = d.b(p0);
       if (!TextUtils.isEmpty(str)) {
          return obj+"-"+str.toLowerCase();
       }
       return obj;
    }
    public static String b(Locale p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = d.e(p0);
       if (i == 1) {
          return "CN";
       }
       if (i != 2) {
          return "US";
       }
       return "TW";
    }
    public static String c(Locale p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = d.e(p0);
       if (i != 1 && i != 2) {
          return "en";
       }
       return "zh";
    }
    public static Locale d(Locale p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!e.u()) {
          return p0;
       }
       int i = e.u();
       if (i == 1) {
          return Locale.SIMPLIFIED_CHINESE;
       }
       if (i != 2) {
          return Locale.ENGLISH;
       }
       return Locale.TRADITIONAL_CHINESE;
    }
    public static int e(Locale p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (e.u()) {
          return e.u();
       }
       if (d.f(p0, Locale.SIMPLIFIED_CHINESE)) {
          return 1;
       }
       if (d.f(p0, Locale.TRADITIONAL_CHINESE) || d.f(p0, d.a)) {
          return 2;
       }
       d.f(p0, Locale.ENGLISH);
       return 3;
    }
    public static boolean f(Locale p0,Locale p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || (p1 != null && ((p0.getLanguage()).equals(p1.getLanguage()) && (p0.getCountry()).equals(p1.getCountry())))) {
          b = true;
       }
    label_0037 :
       return b;
    }
    public static boolean g(Locale p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!e.u()) {
          if (!d.f(p0, Locale.SIMPLIFIED_CHINESE) && (!d.f(p0, Locale.TRADITIONAL_CHINESE) && (!d.f(p0, d.a) && !d.f(p0, Locale.ENGLISH)))) {
             b = true;
          }
       label_003d :
          return b;
       }else {
          int i = e.u();
          if (i == 1) {
             return (d.f(p0, Locale.SIMPLIFIED_CHINESE) ^ 1);
          }
          if (i != 2) {
             return (d.f(p0, Locale.ENGLISH) ^ 1);
          }
          if (!d.f(p0, Locale.TRADITIONAL_CHINESE) && !d.f(p0, d.a)) {
             b = true;
          }
          return b;
       }
    }
    public static void h(int p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), null, uod, "7")) {
          return;
       }
       SharedPreferences a = e.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putBoolean("user_initiative_change_lang", p1);
       g.a(uEditor);
       SharedPreferences$Editor uEditor1 = a.edit();
       uEditor1.putInt("language_setting", p0);
       g.a(uEditor1);
       return;
    }
}
