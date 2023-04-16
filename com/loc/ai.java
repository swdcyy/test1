package com.loc.ai;
import java.util.Properties;
import java.lang.Object;
import com.loc.ah;
import android.os.Build;
import java.lang.String;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.lang.Exception;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.Integer;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.lang.Runtime;
import java.lang.Process;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import android.os.Build$VERSION;

public final class ai	// class@001368
{
    public static ah a;
    public static Properties b;

    static {
       ai.b = ai.b();
    }
    public void ai(){
       super();
    }
    public static ah a(){
       if (ai.a == null) {
          ai uoai = ai.class;
          _monitor_enter(uoai);
          if (ai.a == null) {
             try{
                ah uoah = ai.a(Build.MANUFACTURER);
                if (("").equals(uoah.a())) {
                   String[] stringArray = new String[11];
                   stringArray[0] = ah.a.a();
                   stringArray[1] = ah.b.a();
                   stringArray[2] = ah.c.a();
                   stringArray[3] = ah.d.a();
                   stringArray[4] = ah.e.a();
                   stringArray[5] = ah.f.a();
                   stringArray[6] = ah.g.a();
                   stringArray[7] = ah.i.a();
                   stringArray[8] = ah.j.a();
                   stringArray[9] = ah.k.a();
                   stringArray[10] = ah.l.a();
                   Iterator iterator = Arrays.asList(stringArray).iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         ah uoah1 = ai.a(iterator.next());
                         if (!("").equals(uoah1.a())) {
                            uoah = uoah1;
                         }
                      }else {
                         uoah = ah.m;
                      }
                   }
                }
                ai.a = uoah;
             }catch(java.lang.Exception e1){
                e1.printStackTrace();
             }
          }
       }
       return ai.a;
    }
    public static ah a(String p0){
       if (p0 == null || p0.length() <= 0) {
          return ah.m;
       }
       ah a = ah.a;
       if (p0.equals(a.a())) {
          if (ai.a(a)) {
             return a;
          }
       }else {
          a = ah.b;
          if (p0.equals(a.a())) {
             if (ai.b(a)) {
                return a;
             }
          }else {
             a = ah.c;
             if (p0.equals(a.a())) {
                if (ai.c(a)) {
                   return a;
                }
             }else {
                a = ah.d;
                if (p0.equals(a.a())) {
                   if (ai.d(a)) {
                      return a;
                   }
                }else {
                   a = ah.e;
                   if (p0.equals(a.a())) {
                      if (ai.e(a)) {
                         return a;
                      }
                   }else {
                      a = ah.f;
                      if (p0.equals(a.a())) {
                         if (ai.f(a)) {
                            return a;
                         }
                      }else {
                         a = ah.g;
                         if (p0.equals(a.a())) {
                            if (ai.g(a)) {
                               return a;
                            }
                         }else {
                            a = ah.h;
                            if (p0.equals(a.a())) {
                               if (ai.h(a)) {
                                  return a;
                               }
                            }else {
                               a = ah.i;
                               if (p0.equals(a.a())) {
                                  if (ai.i(a)) {
                                     return a;
                                  }
                               }else {
                                  a = ah.j;
                                  if (p0.equals(a.a())) {
                                     if (ai.j(a)) {
                                        return a;
                                     }
                                  }else {
                                     a = ah.k;
                                     if (p0.equals(a.a())) {
                                        if (ai.k(a)) {
                                           return a;
                                        }
                                     }else {
                                        a = ah.l;
                                        if (p0.equals(a.a()) && ai.l(a)) {
                                           return a;
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return ah.m;
    }
    public static void a(ah p0,String p1){
       Matcher matcher = Pattern.compile("\([\\d.]+\)[^\\d]*").matcher(p1);
       if (matcher.find()) {
          int i = 1;
          try{
             matcher = matcher.group(i);
             p0.a(matcher);
             p0.a(Integer.parseInt(matcher.split("\\.")[0]));
             return;
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
          return;
       }else {
          goto label_002d ;
       }
    }
    public static boolean a(ah p0){
       if (TextUtils.isEmpty(ai.b("ro.miui.ui.version.name"))) {
          return false;
       }
       String str = ai.b("ro.build.version.incremental");
       ai.a(p0, str);
       p0.b(str);
       return true;
    }
    public static String b(String p0){
       String property = ai.b.getProperty("["+p0+"]", null);
       if (TextUtils.isEmpty(property)) {
          return ai.c(p0);
       }
       return (property.replace("[", "")).replace("]", "");
    }
    public static Properties b(){
       Properties properties;
       try{
          properties = new Properties();
          properties.load(Runtime.getRuntime().exec("getprop").getInputStream());
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return properties;
    }
    public static boolean b(ah p0){
       String str = ai.b("ro.meizu.setupwizard.flyme");
       if (TextUtils.isEmpty(ai.b("ro.flyme.published")) && TextUtils.isEmpty(str)) {
          return false;
       }
       String str1 = ai.b("ro.build.display.id");
       ai.a(p0, str1);
       p0.b(str1);
       return true;
    }
    public static String c(String p0){
       BufferedReader uBufferedRea;
       String str = null;
       try{
          InputStreamReader inputStreamR = new InputStreamReader(Runtime.getRuntime().exec(("getprop ").concat(String.valueOf(p0))).getInputStream());
          int i = 1024;
          try{
             uBufferedRea = new BufferedReader(inputStreamR, i);
             i = uBufferedRea.readLine();
             try{
                uBufferedRea.close();
                uBufferedRea.close();
                return i;
             }catch(java.io.IOException e0){
             }
          }catch(java.io.IOException e0){
             try{
                if (uBufferedRea) {
                   uBufferedRea.close();
                }
                return e0;
             }catch(java.io.IOException e0){
             }
          }
       }catch(java.io.IOException e0){
          uBufferedRea = e0;
          goto label_0039 ;
       }
    }
    public static boolean c(ah p0){
       String str = ai.b("ro.build.version.emui");
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       ai.a(p0, str);
       p0.b(str);
       return true;
    }
    public static boolean d(ah p0){
       String str = ai.b("ro.build.version.opporom");
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       ai.a(p0, str);
       p0.b(str);
       return true;
    }
    public static boolean e(ah p0){
       String str = ai.b("ro.vivo.os.build.display.id");
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       ai.a(p0, str);
       p0.b(str);
       return true;
    }
    public static boolean f(ah p0){
       String str = ai.b("ro.smartisan.version");
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       ai.a(p0, str);
       p0.b(str);
       return true;
    }
    public static boolean g(ah p0){
       String str = ai.b("ro.build.display.id");
       if (TextUtils.isEmpty(str) || !str.matches("amigo\([\\d.]+\)[a-zA-Z]*")) {
          return false;
       }
       ai.a(p0, str);
       p0.b(str);
       return true;
    }
    public static boolean h(ah p0){
       String str = ai.b("ro.letv.release.version");
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       ai.a(p0, str);
       p0.b(str);
       return true;
    }
    public static boolean i(ah p0){
       String str = ai.b("ro.build.sense.version");
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       ai.a(p0, str);
       p0.b(str);
       return true;
    }
    public static boolean j(ah p0){
       String str = ai.b("sys.lge.lgmdm_version");
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       ai.a(p0, str);
       p0.b(str);
       return true;
    }
    public static boolean k(ah p0){
       if (!("android-google").equals(ai.b("ro.com.google.clientidbase"))) {
          return false;
       }
       p0.a(Build$VERSION.SDK_INT);
       p0.b(ai.b("ro.build.version.release"));
       return true;
    }
    public static boolean l(ah p0){
       String str = ai.b("ro.build.nubia.rom.code");
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       ai.a(p0, str);
       p0.b(str);
       return true;
    }
}
