package com.unionpay.utils.UPUtils;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import java.security.MessageDigest;
import com.unionpay.utils.a;
import com.unionpay.utils.d;
import java.lang.StringBuilder;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class UPUtils	// class@001008
{

    public void UPUtils(){
       super();
    }
    public static String a(Context p0,String p1){
       String str = UPUtils.b(o.c(p0, "UnionPayPluginEx.pref", 0).getString(p1, ""), ("0000000023456789abcdef12123456786789abcd").substring(0, 32));
       if (str == null) {
          return "";
       }
       if (!str.endsWith("00000000")) {
          return "";
       }
       return str.substring(0, (str.length() - 8));
    }
    public static String a(String p0){
       try{
          MessageDigest instance = MessageDigest.getInstance("SHA-1");
          instance.reset();
          instance.update(p0.getBytes());
          return a.a(instance.digest());
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static String a(String p0,String p1){
       try{
          return a.a(d.a(a.a(p1), p0.getBytes("utf-8")));
       }catch(java.lang.Exception e0){
          return "";
       }
    }
    public static void a(Context p0,String p1,String p2){
       p1 = UPUtils.a(p1+"00000000", ("0000000023456789abcdef12123456786789abcd").substring(0, 32));
       if (p1 == null) {
          p1 = "";
       }
       SharedPreferences$Editor uEditor = o.c(p0, "UnionPayPluginEx.pref", 0).edit();
       uEditor.putString(p2, p1);
       g.b(uEditor);
       return;
    }
    public static String b(String p0,String p1){
       try{
          return (new String(d.b(a.a(p1), a.a(p0)), "utf-8")).trim();
       }catch(java.lang.Exception e0){
          return "";
       }
    }
    public static void b(Context p0,String p1){
       SharedPreferences$Editor uEditor = o.c(p0, "UnionPayPluginEx.pref", 0).edit();
       uEditor.remove(p1);
       g.b(uEditor);
    }
    public static native String forConfig(int p0,String p1);
    public static native String forUrl(int p0);
    public static native String forWap(int p0,String p1);
    public static native String getIssuer(int p0);
    public static native String getSubject(int p0);
    public static native String getTalkingDataIdForAssist(int p0);
}
