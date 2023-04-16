package com.tencent.open.b.d;
import java.lang.String;
import android.content.Context;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import android.view.WindowManager;
import android.view.Display;
import java.lang.StringBuilder;
import java.util.Locale;
import android.util.DisplayMetrics;
import android.os.Build;
import android.os.Build$VERSION;
import com.tencent.open.b.a;
import android.os.Environment;

public class d	// class@000f47
{
    public static String a;
    public static String b;

    public static String a(){
       return "";
    }
    public static String a(Context p0){
       if (!TextUtils.isEmpty(d.a)) {
          return d.a;
       }
       String str = "";
       if (p0 == null) {
          return str;
       }
       d.a = str;
       WindowManager systemServic = p0.getSystemService("window");
       if (systemServic != null) {
          d.a = systemServic.getDefaultDisplay().getWidth()+"x"+systemServic.getDefaultDisplay().getHeight();
       }
       return d.a;
    }
    public static String b(){
       return Locale.getDefault().getLanguage();
    }
    public static String b(Context p0){
       return "";
    }
    public static String c(Context p0){
       return "";
    }
    public static String d(Context p0){
       return "";
    }
    public static String e(Context p0){
       try{
          if (d.b == null) {
             DisplayMetrics uDisplayMetr = new DisplayMetrics();
             p0.getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
             StringBuilder str = "imei="+d.b(p0)+'&'+"model="+Build.MODEL+'&'+"os="+Build$VERSION.RELEASE+'&'+"apilevel="+Build$VERSION.SDK_INT+'&';
             String str1 = a.b(p0);
             if (str1 == null) {
                str1 = "";
             }
             str = str+"network="+str1+'&'+"sdcard=";
             int i = ((Environment.getExternalStorageState()).equals("mounted"))? 1: 0;
             d.b = str+i+'&'+"display="+uDisplayMetr.widthPixels+'*'+uDisplayMetr.heightPixels+'&'+"manu="+Build.MANUFACTURER+"&"+"wifi="+a.e(p0);
          }
          return d.b;
       }catch(java.lang.Exception e0){
          return null;
       }
    }
}
