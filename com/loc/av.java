package com.loc.av;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.s;
import android.content.Context;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.Throwable;
import com.loc.an;
import android.content.SharedPreferences$Editor;
import com.loc.ak;
import com.loc.x;
import oe6.g;
import com.loc.l;
import com.loc.p;
import java.util.Arrays;

public final class av	// class@00137a
{
    public String c;
    public static byte[] a;
    public static byte[] b;

    public void av(String p0){
       super();
       if (TextUtils.isDigitsOnly(p0)) {
          p0 = "SPUtil";
       }
       this.c = s.a(p0);
       return;
    }
    public static int a(Context p0,String p1,String p2,int p3){
       return o.c(p0, p1, 0).getInt(p2, p3);
    }
    public static SharedPreferences$Editor a(Context p0,String p1){
       if (p0 == null || TextUtils.isEmpty(p1)) {
          return null;
       }
       return o.c(p0, p1, 0).edit();
    }
    public static String a(Context p0,String p1,String p2){
       String str = "";
       if (p0 == null) {
          return str;
       }
       return x.a(av.b(p0, x.d(o.c(p0, p1, 0).getString(p2, str))));
    }
    public static void a(Context p0,String p1,String p2,String p3){
       if (p0 == null || (!TextUtils.isEmpty(p2) && !TextUtils.isEmpty(p3))) {
          SharedPreferences$Editor uEditor = o.c(p0, p1, 0).edit();
          uEditor.putString(p2, x.g(av.a(p0, x.a(p3))));
          av.a(uEditor);
       }
    label_002a :
       return;
    }
    public static void a(SharedPreferences$Editor p0){
       if (p0 == null) {
          return;
       }
       g.a(p0);
       return;
    }
    public static void a(SharedPreferences$Editor p0,String p1){
       if (p0 == null || TextUtils.isEmpty(p1)) {
          return;
       }
       p0.remove(p1);
       return;
    }
    public static void a(SharedPreferences$Editor p0,String p1,int p2){
       p0.putInt(p1, p2);
    }
    public static void a(SharedPreferences$Editor p0,String p1,long p2){
       if (p0 == null || TextUtils.isEmpty(p1)) {
          return;
       }
       p0.putLong(p1, p2);
       return;
    }
    public static void a(SharedPreferences$Editor p0,String p1,String p2){
       if (p0 != null && (TextUtils.isEmpty(p1) || TextUtils.isEmpty(p2))) {
          return;
       }
       p0.putString(p1, p2);
       return;
    }
    public static void a(SharedPreferences$Editor p0,String p1,boolean p2){
       p0.putBoolean(p1, p2);
    }
    public static boolean a(Context p0,String p1,String p2,boolean p3){
       return o.c(p0, p1, 0).getBoolean(p2, p3);
    }
    public static byte[] a(Context p0){
       byte[] uobyteArray;
       if (p0 == null) {
          uobyteArray = new byte[0];
          return uobyteArray;
       }else {
          byte[] a = av.a;
          if (a != null && a.length > 0) {
             return a;
          }
          uobyteArray = (l.f(p0)).getBytes();
          av.a = uobyteArray;
          return uobyteArray;
       }
    }
    public static byte[] a(Context p0,byte[] p1){
       return p.b(av.a(p0), p1, av.b(p0));
    }
    public static long b(Context p0,String p1,String p2){
       return o.c(p0, p1, 0).getLong(p2, 0);
    }
    public static String b(Context p0,String p1,String p2,String p3){
       if (p0 == null) {
          return null;
       }
       return o.c(p0, p1, 0).getString(p2, p3);
    }
    public static byte[] b(Context p0){
       byte[] b = av.b;
       if (b != null && b.length > 0) {
          return b;
       }
       byte[] uobyteArray = Arrays.copyOfRange(av.a(p0), 0, (av.a(p0).length / 2));
       av.b = uobyteArray;
       return uobyteArray;
    }
    public static byte[] b(Context p0,byte[] p1){
       try{
          return p.a(av.a(p0), p1, av.b(p0));
       }catch(java.lang.Exception e0){
          byte[] uobyteArray = new byte[0];
          return uobyteArray;
       }
    }
}
