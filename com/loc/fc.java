package com.loc.fc;
import android.content.Context;
import java.lang.Object;
import java.util.ArrayList;
import com.loc.el;
import java.lang.String;
import org.json.JSONArray;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.loc.ff;
import com.loc.fi;
import java.net.URL;
import com.loc.m;
import java.util.Map;
import com.loc.bl;
import android.content.SharedPreferences$Editor;
import com.loc.fp;
import java.lang.System;
import java.lang.Thread;
import java.lang.StackTraceElement;
import java.lang.StringBuffer;
import com.loc.cj;
import com.loc.fc$1;
import com.loc.ck;
import com.loc.cl;

public final class fc	// class@001427
{
    public long c;
    public boolean d;
    public ArrayList f;
    public el g;
    public el h;
    public long i;
    public Context j;
    public String k;
    public boolean l;
    public static int a = 1;
    public static int b = 2;
    public static fc e;

    public void fc(Context p0){
       super();
       this.c = 0;
       this.d = false;
       this.f = new ArrayList();
       this.g = new el();
       this.h = new el();
       this.i = 0x1d4c0;
       this.l = false;
       this.j = p0;
    }
    public static long a(fc p0,long p1){
       p0.i = p1;
       return p1;
    }
    public static Context a(fc p0){
       return p0.j;
    }
    public static el a(fc p0,int p1){
       return p0.b(p1);
    }
    public static synchronized fc a(Context p0){
       _monitor_enter(fc.class);
       if (fc.e == null) {
          fc.e = new fc(p0);
       }
       _monitor_exit(fc.class);
       return fc.e;
    }
    public static boolean a(String[] p0,String[] p1){
       return fc.b(p0, p1);
    }
    public static String[] a(JSONArray p0,int p1){
       return fc.b(p0, p1);
    }
    public static void b(fc p0,int p1){
       p0.f(p1);
    }
    public static boolean b(String[] p0,String[] p1){
       if (p0 == null || (p0.length && (p1 == null || !p1.length))) {
          return false;
       }
       if (p0.length != p1.length) {
          return false;
       }
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if (!(p0[i]).equals(p1[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static String[] b(JSONArray p0,int p1){
       int i = 0;
       if (p0 == null || !p0.length()) {
          String[] stringArray = new String[i];
          return stringArray;
       }else {
          int i1 = p0.length();
          String[] stringArray1 = new String[i1];
          while (i < i1) {
             String str = p0.getString(i);
             if (!TextUtils.isEmpty(str)) {
                if (p1 == fc.b) {
                   str = "["+str+"]";
                }
                stringArray1[i] = str;
             }
             i = i + 1;
          }
          return stringArray1;
       }
    }
    public static String c(int p0){
       if (p0 == fc.b) {
          return "last_ip_6";
       }
       return "last_ip_4";
    }
    public final String a(ff p0,int p1){
       if (!fi.p()) {
          return null;
       }
       if (p0 != null) {
          String str = p0.b();
          String host = new URL(str).getHost();
          if (!("http://abroad.apilocate.amap.com/mobile/binary").equals(str) && !("abroad.apilocate.amap.com").equals(host)) {
             String str1 = (("apilocate.amap.com").equalsIgnoreCase(host))? "httpdns.apilocate.amap.com": host;
             if (!m.d(str1)) {
                return null;
             }else {
                String str2 = this.e(p1);
                if (!TextUtils.isEmpty(str2)) {
                   p0.d(str.replace(host, str2));
                   p0.a().put("host", str1);
                   p0.e(str1);
                   boolean b = (p1 == fc.b)? true: false;
                   p0.a(b);
                   return str2;
                }
             }
          }
       }
       return null;
    }
    public final void a(int p0){
       if (!this.b(p0).e()) {
          this.f.add(this.b(p0).b());
          this.d(p0);
          this.b(true, p0);
          return;
       }else {
          this.d(p0);
          return;
       }
    }
    public final void a(boolean p0,int p1){
       this.b(p1).b(p0);
       if (p0) {
          String str = this.b(p1).c();
          String str1 = this.b(p1).b();
          if (!TextUtils.isEmpty(str1) && !str1.equals(str)) {
             SharedPreferences$Editor uEditor = fp.a(this.j, "cbG9jaXA");
             fp.a(uEditor, fc.c(p1), str1);
             fp.a(uEditor);
          }
       }
       return;
    }
    public final el b(int p0){
       if (p0 == fc.b) {
          return this.h;
       }
       return this.g;
    }
    public synchronized final void b(boolean p0,int p1){
       if (!p0 && (!fi.o() && this.l != null)) {
          return;
       }
       if (this.c - null) {
          long l = System.currentTimeMillis();
          fc tc = this.c;
          if ((l - tc) - this.i < 0) {
             return;
          }else if((l - tc) - 0xea60 < 0){
             return;
          }
       }
       this.c = System.currentTimeMillis();
       this.l = true;
       StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
       StringBuffer str = "";
       int len = stackTrace.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = stackTrace[i];
          str = str+oobject.getClassName()+"\("+oobject.getMethodName()+":"+oobject.getLineNumber()+"\),";
       }
       cj.a().b(new fc$1(this, p1));
       return;
    }
    public final void d(int p0){
       if (this.b(p0).d()) {
          SharedPreferences$Editor uEditor = fp.a(this.j, "cbG9jaXA");
          fp.a(uEditor, fc.c(p0));
          fp.a(uEditor);
          this.b(p0).a(false);
       }
       return;
    }
    public final String e(int p0){
       object oobject;
       boolean b = false;
       this.b(b, p0);
       String[] stringArray = this.b(p0).a();
       if (stringArray != null && stringArray.length > 0) {
          int len = stringArray.length;
          while (true) {
             if (b < len) {
                oobject = stringArray[b];
                if (!this.f.contains(oobject)) {
                label_0024 :
                   if (TextUtils.isEmpty(oobject)) {
                      break ;
                   }else {
                      this.b(p0).a(oobject);
                      return oobject;
                   }
                }else {
                   b = b + 1;
                }
             }else {
                oobject = null;
                goto label_0024 ;
             }
          }
          return null;
       }else {
          this.g(p0);
          return this.b(p0).b();
       }
    }
    public final void f(int p0){
       if (this.b(p0).a() != null && this.b(p0).a().length > 0) {
          object oobject = this.b(p0).a()[0];
          if (!oobject.equals(this.k) && !this.f.contains(oobject)) {
             this.k = oobject;
             SharedPreferences$Editor uEditor = fp.a(this.j, "cbG9jaXA");
             fp.a(uEditor, fc.c(p0), oobject);
             fp.a(uEditor);
          }
       }
       return;
    }
    public final void g(int p0){
       String str = fp.a(this.j, "cbG9jaXA", fc.c(p0), null);
       if (!TextUtils.isEmpty(str) && !this.f.contains(str)) {
          this.b(p0).a(str);
          this.b(p0).b(str);
          this.b(p0).a(true);
       }
       return;
    }
}
