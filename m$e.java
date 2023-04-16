package m$e;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Build;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.IllegalAccessException;
import java.lang.NoSuchMethodException;
import java.lang.ClassNotFoundException;

public class m$e	// class@002599
{
    public static String a;
    public static String b;

    public static boolean a(String p0){
       String str2;
       String a;
       String str = "EMUI";
       String str1 = "ro.build.version.emui";
       if (m$e.a == null) {
          str2 = m$e.b("ro.build.version.opporom");
          m$e.b = str2;
          if (!TextUtils.isEmpty(str2)) {
             str2 = "OPPO";
          }else {
             str2 = m$e.b("ro.vivo.os.version");
             m$e.b = str2;
             if (!TextUtils.isEmpty(str2)) {
                str2 = "VIVO";
             }else {
                str2 = m$e.b(str1);
                m$e.b = str2;
                if (!TextUtils.isEmpty(str2)) {
                   str2 = str;
                }else {
                   str2 = m$e.b("ro.miui.ui.version.name");
                   m$e.b = str2;
                   if (!TextUtils.isEmpty(str2)) {
                      str2 = "MIUI";
                   }else {
                      str2 = m$e.b("ro.product.system.manufacturer");
                      m$e.b = str2;
                      if (!TextUtils.isEmpty(str2)) {
                         str2 = "OnePlus";
                      }else {
                         str2 = m$e.b("ro.smartisan.version");
                         m$e.b = str2;
                         if (!TextUtils.isEmpty(str2)) {
                            str2 = "SMARTISAN";
                         }else {
                            a = "SAMSUNG";
                            if (!((m$e.b("ro.product.manufacturer")).toUpperCase()).contains(a)) {
                               str2 = Build.DISPLAY;
                               m$e.b = str2;
                               a = "FLYME";
                               if (!(str2.toUpperCase()).contains(a)) {
                                  m$e.b = "unknown";
                                  str2 = (Build.MANUFACTURER).toUpperCase();
                               }
                            }
                            m$e.a = a;
                         }
                      }
                   }
                }
             }
          }
          m$e.a = str2;
       }
       str2 = "EMOTION";
       if (p0.equals(str2) || p0.equals("MAGIC")) {
          str1 = m$e.b(str1);
          a = m$e.a;
          if (a == null) {
             str2 = "";
          }else if(!a.equals(str)){
             if (!str1.contains("EmotionUI")) {
                if (str1.contains("MagicUI")) {
                   str2 = "MAGIC";
                }
             }
          }
          str2 = m$e.a;
          return str2.equals(p0);
       }else {
          return (m$e.a).equals(p0);
       }
    }
    public static String b(String p0){
       try{
          Class uClass = Class.forName("android.os.SystemProperties");
          Class[] uClassArray = new Class[]{String.class};
          Object[] objArray = new Object[]{p0};
          p0 = uClass.getDeclaredMethod("get", uClassArray).invoke(uClass, objArray);
       label_0033 :
          if (p0 == null) {
             p0 = "";
          }
          return p0;
       }catch(java.lang.ClassNotFoundException e6){
          e6.printStackTrace();
       }catch(java.lang.NoSuchMethodException e6){
          e6.printStackTrace();
       }catch(java.lang.IllegalAccessException e6){
          e6.printStackTrace();
       }catch(java.lang.reflect.InvocationTargetException e6){
          e6.printStackTrace();
       }
       p0 = null;
       goto label_0033 ;
    }
    public static boolean c(){
       boolean b = true;
       if (m$e.a("EMUI")) {
          return b;
       }
       if (!m$e.a("EMOTION") && !m$e.a("MAGIC")) {
          b = false;
       }
       return b;
    }
}
