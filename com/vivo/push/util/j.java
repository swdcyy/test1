package com.vivo.push.util.j;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import com.vivo.push.util.p;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.Exception;
import android.os.Build;
import com.vivo.push.util.z;

public final class j	// class@0010b8
{
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static Method e;
    public static String f;
    public static String g;

    static {
       j.a = j.b("rom_1.0");
       j.b = j.b("rom_2.0");
       j.c = j.b("rom_2.5");
       j.d = j.b("rom_3.0");
       j.f = null;
       j.g = null;
    }
    public static synchronized String a(){
       String str = String.class;
       _monitor_enter(j.class);
       if (j.f == null && j.g == null) {
          try{
             Class[] uClassArray = new Class[]{str,str};
             Method declaredMeth = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", uClassArray);
             j.e = declaredMeth;
             declaredMeth.setAccessible(1);
             Object[] objArray = new Object[]{"ro.vivo.rom","@><@"};
             j.f = j.e.invoke(null, objArray);
             objArray = new Object[]{"ro.vivo.rom.version","@><@"};
             j.g = j.e.invoke(null, objArray);
          }catch(java.lang.Exception e0){
             p.b("Device", "getRomCode error");
          }
       }
    }
    public static String a(String p0){
       String str = null;
       if (TextUtils.isEmpty(p0)) {
          return str;
       }
       int i = 2;
       Matcher matcher = Pattern.compile("rom_\([\\d]*\).?\([\\d]*\)", i).matcher(p0);
       if (!matcher.find()) {
          return str;
       }
       StringBuilder str1 = matcher.group(1);
       matcher = (TextUtils.isEmpty(matcher.group(i)))? "0": (matcher.group(i)).substring(0, 1);
       return str1+matcher;
    }
    public static String a(String p0,String p1){
       try{
          Class[] uClassArray = new Class[]{String.class};
          Object[] objArray = new Object[]{p0};
          p0 = Class.forName("android.os.SystemProperties").getMethod("get", uClassArray).invoke(null, objArray);
       }catch(java.lang.Exception e6){
          e6.printStackTrace();
          p0 = p1;
       }
       if (p0 != null && p0.length()) {
          p1 = p0;
       }
       return p1;
    }
    public static boolean b(){
       String mANUFACTURER = Build.MANUFACTURER;
       String str = "Device";
       if (TextUtils.isEmpty(mANUFACTURER)) {
          p.d(str, "Build.MANUFACTURER is null");
          return false;
       }else {
          p.d(str, "Build.MANUFACTURER is "+mANUFACTURER);
          if ((mANUFACTURER.toLowerCase()).contains("bbk") || (mANUFACTURER.toLowerCase()).startsWith("vivo")) {
             return true;
          }
          return false;
       }
    }
    public static boolean b(String p0){
       String str = z.b("ro.vivo.rom", "");
       String str1 = z.b("ro.vivo.rom.version", "");
       p.d("Device", "ro.vivo.rom = "+str+" ; ro.vivo.rom.version = "+str1);
       if (str == null || (str.contains(p0) || (str1 != null && str1.contains(p0)))) {
          return true;
       }
       return false;
    }
}
