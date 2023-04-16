package com.loc.fi;
import java.util.ArrayList;
import android.content.Context;
import com.loc.w;
import com.loc.fj;
import java.lang.String;
import com.loc.fi$1;
import com.loc.m$a;
import com.loc.m;
import org.json.JSONObject;
import android.content.SharedPreferences$Editor;
import com.loc.fp;
import java.lang.Throwable;
import org.json.JSONArray;
import com.loc.x;
import com.loc.m$b;
import com.loc.m$b$a;
import com.loc.bq;
import com.loc.bs;
import java.lang.Math;
import com.loc.fq;
import java.lang.Double;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import com.loc.an;
import android.os.Build;
import java.lang.Integer;

public final class fi	// class@00142e
{
    public static boolean A = false;
    public static int B;
    public static boolean C;
    public static boolean D;
    public static boolean E;
    public static boolean F;
    public static long G;
    public static boolean H;
    public static int I;
    public static boolean J;
    public static int K;
    public static boolean L;
    public static String M;
    public static long N;
    public static long a;
    public static long b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static int f;
    public static int g;
    public static boolean h;
    public static boolean i;
    public static int j;
    public static int k;
    public static boolean l;
    public static int m;
    public static int n;
    public static int o;
    public static boolean p;
    public static boolean q;
    public static int r;
    public static long s;
    public static ArrayList t;
    public static ArrayList u;
    public static boolean v;
    public static boolean w;
    public static long x;
    public static boolean y;
    public static double z;

    static {
       fi.t = new ArrayList();
       fi.u = new ArrayList();
       fi.v = false;
       fi.w = true;
       fi.x = 0x493e0;
       fi.y = false;
       fi.z = 0x3fe3c6a7ef9db22d;
       fi.A = true;
       fi.B = 80;
       fi.a = 0x36ee80;
       fi.C = false;
       fi.D = true;
       fi.E = false;
       fi.b = 0;
       fi.c = true;
       fi.F = true;
       fi.G = -1;
       fi.H = true;
       fi.I = 1;
       fi.J = false;
       fi.K = 5;
       fi.L = false;
       fi.M = "CMjAzLjEwNy4xLjEvMTU0MDgxL2Q";
       fi.N = 0;
       fi.d = false;
       fi.e = false;
       fi.f = 0x5000;
       fi.g = 0xa4cb80;
    }
    public static void a(Context p0){
       if (fi.h) {
          return;
       }
       fi.h = true;
       m.a(p0, fj.c(), fj.d(), new fi$1(p0));
       return;
    }
    public static void a(Context p0,JSONObject p1,SharedPreferences$Editor p2){
       String str = "asw";
       p1 = p1.optJSONObject("13S");
       if (p1 != null) {
          long l = (long)((p1.optInt("at", 123) * 60) * 1000);
          fi.a = l;
          fp.a(p2, "13S_at", l);
          fi.d(p1, p2);
          boolean b = m.a(p1.optString("nla"), true);
          fi.D = b;
          fp.a(p2, "13S_nla", b);
          boolean b1 = m.a(p1.optString(str), true);
          fi.F = b1;
          fp.a(p2, str, b1);
          JSONArray jSONArray = p1.optJSONArray("mlpl");
          if (jSONArray != null && (jSONArray.length() > 0 && p0 != null)) {
             fp.a(p2, "13S_mlpl", x.b(jSONArray.toString()));
             fi.E = fi.a(p0, jSONArray);
             return;
          }else {
             fi.E = false;
             fp.a(p2, "13S_mlpl");
          }
       }
       return;
    }
    public static void a(m$b p0,SharedPreferences$Editor p1){
       p0 = p0.g;
       if (p0 != null) {
          m$b$a a = p0.a;
          fi.i = a;
          fp.a(p1, "exception", a);
          m$b$a c = p0.c;
          if (c != null) {
             fi.j = c.optInt("fn", fi.j);
             int i = c.optInt("mpn", fi.k);
             fi.k = i;
             boolean i1 = 500;
             if (i > i1) {
                fi.k = i1;
             }
             i1 = 30;
             if (fi.k < i1) {
                fi.k = i1;
             }
             i1 = false;
             fi.l = m.a(c.optString("igu"), i1);
             fi.m = c.optInt("ms", fi.m);
             fi.o = c.optInt("rot", i1);
             fi.n = c.optInt("pms", i1);
          }
          bq.a(fi.j, fi.l, fi.m, fi.n);
          bs.a(fi.l, fi.n);
          fp.a(p1, "fn", fi.j);
          fp.a(p1, "mpn", fi.k);
          fp.a(p1, "igu", fi.l);
          fp.a(p1, "ms", fi.m);
          fp.a(p1, "rot", fi.o);
          fp.a(p1, "pms", fi.n);
       }
       return;
    }
    public static void a(JSONObject p0,SharedPreferences$Editor p1){
       p0 = p0.optJSONObject("11G");
       if (p0 != null) {
          boolean b = m.a(p0.optString("able"), true);
          fi.w = b;
          if (b) {
             fi.x = (long)(p0.optInt("c", 300) * 1000);
          }
          fi.y = m.a(p0.optString("fa"), false);
          fi.z = Math.min(0x3ff0000000000000, Math.max(0x3fc999999999999a, p0.optDouble("ms", 0x3fe3c6a7ef9db22d)));
          fp.a(p1, "ca", fi.w);
          fp.a(p1, "ct", fi.x);
          fp.a(p1, "11G_fa", fi.y);
          fp.a(p1, "11G_ms", String.valueOf(fi.z));
       }
       return;
    }
    public static boolean a(){
       return fi.i;
    }
    public static boolean a(long p0){
       if (!fi.w) {
          return false;
       }
       long l = fq.a() - p0;
       p0 = fi.x;
       if (p0 < 0 || l - p0 < 0) {
          return true;
       }
       return false;
    }
    public static boolean a(Context p0,m$b p1){
       SharedPreferences$Editor uEditor = fp.a(p0, "pref");
       fi.a(p1, uEditor);
       fi.c(p0);
       p1 = p1.f;
       if (p1 == null) {
          if (uEditor != null) {
             fp.a(uEditor);
          }
          return true;
       }else {
          fi.a(p0, p1, uEditor);
          fi.a(p1, uEditor);
          fi.c(p1, uEditor);
          fi.e(p1, uEditor);
          fi.g(p1, uEditor);
          fi.f(p1, uEditor);
          fi.h(p1, uEditor);
          fi.b(p1, uEditor);
          if (uEditor != null) {
             fp.a(uEditor);
          }
          return true;
       }
    }
    public static boolean a(Context p0,JSONArray p1){
       if (p1 != null && (p1.length() > 0 && p0 != null)) {
          int i = 0;
          while (i < p1.length()) {
             if (fq.b(p0, p1.getString(i))) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public static int b(){
       return fi.k;
    }
    public static void b(Context p0){
       String str = "";
       String str1 = "pref";
       if (fi.v) {
          return;
       }
       fi.v = true;
       fi.i = fp.a(p0, str1, "exception", fi.i);
       fi.c(p0);
       int i = 0;
       fi.j = fp.a(p0, str1, "fn", fi.j);
       fi.k = fp.a(p0, str1, "mpn", fi.k);
       fi.l = fp.a(p0, str1, "igu", fi.l);
       fi.m = fp.a(p0, str1, "ms", fi.m);
       fi.o = fp.a(p0, str1, "rot", i);
       int i1 = fp.a(p0, str1, "pms", i);
       fi.n = i1;
       bq.a(fi.j, fi.l, fi.m, i1);
       bs.a(fi.l, fi.n);
       fi.w = fp.a(p0, str1, "ca", fi.w);
       fi.x = fp.a(p0, str1, "ct", fi.x);
       fi.y = fp.a(p0, str1, "11G_fa", fi.y);
       double d = Double.valueOf(fp.a(p0, str1, "11G_ms", String.valueOf(fi.z))).doubleValue();
       fi.z = d;
       fi.z = Math.max(0x3fc999999999999a, d);
       fi.c = fp.a(p0, str1, "fr", fi.c);
       fi.F = fp.a(p0, str1, "asw", fi.F);
       fi.G = fp.a(p0, str1, "awsi", fi.G);
       fi.H = fp.a(p0, str1, "15ua", fi.H);
       fi.I = fp.a(p0, str1, "15un", fi.I);
       fi.N = fp.a(p0, str1, "15ust", fi.N);
       fi.J = fp.a(p0, str1, "ok9", fi.J);
       fi.K = fp.a(p0, str1, "ok10", fi.K);
       fi.M = fp.a(p0, str1, "ok11", fi.M);
       fi.d = fp.a(p0, str1, "17ya", i);
       fi.e = fp.a(p0, str1, "17ym", i);
       fi.g = ((fp.a(p0, str1, "17yi", 2) * 60) * 60) * 1000;
       fi.f = fp.a(p0, str1, "17yx", 100) * 1024;
       fi.b = fq.b();
       fi.a = fp.a(p0, str1, "13S_at", fi.a);
       fi.D = fp.a(p0, str1, "13S_nla", fi.D);
       fi.A = fp.a(p0, str1, "13J_able", fi.A);
       fi.B = fp.a(p0, str1, "13J_c", fi.B);
       m.b(p0);
       String str2 = fp.a(p0, str1, "13S_mlpl", null);
       if (!TextUtils.isEmpty(str2)) {
          fi.E = fi.a(p0, new JSONArray(x.c(str2)));
       }
       String str3 = fp.a(p0, str1, "197dv", str);
       String str4 = fp.a(p0, str1, "197tv", str);
       if (fp.a(p0, str1, "197a", i) && (fj.a).equals(str3)) {
          String[] b = fj.b;
          int len = b.length;
          while (i < len) {
             if ((b[i]).equals(str4)) {
                fj.a = str4;
             }
             i = i + 1;
          }
       }
       return;
    }
    public static void b(JSONObject p0,SharedPreferences$Editor p1){
       if (p0 == null) {
          return;
       }
       p0 = p0.getJSONObject("197");
       if (p0 != null) {
          boolean b = m.a(p0.optString("able"), false);
          fp.a(p1, "197a", b);
          if (b) {
             fp.a(p1, "197dv", p0.optString("sv", ""));
             fp.a(p1, "197tv", p0.optString("tv", ""));
             return;
          }else {
             fp.a(p1, "197dv", "");
             fp.a(p1, "197tv", "");
          }
       }
       return;
    }
    public static int c(){
       if (fi.o < 0) {
          fi.o = 0;
       }
       return fi.o;
    }
    public static void c(Context p0){
       w ow = fj.c();
       ow.a(fi.i);
       an.a(p0, ow);
    }
    public static void c(JSONObject p0,SharedPreferences$Editor p1){
       p0 = p0.optJSONObject("13J");
       if (p0 != null) {
          boolean b = m.a(p0.optString("able"), true);
          fi.A = b;
          if (b) {
             fi.B = p0.optInt("c", fi.B);
          }
          fp.a(p1, "13J_able", fi.A);
          fp.a(p1, "13J_c", fi.B);
       }
       return;
    }
    public static long d(){
       return fi.x;
    }
    public static void d(JSONObject p0,SharedPreferences$Editor p1){
       if (p0 == null) {
          return;
       }
       boolean b = m.a(p0.optString("re"), true);
       fi.c = b;
       fp.a(p1, "fr", b);
       return;
    }
    public static void e(JSONObject p0,SharedPreferences$Editor p1){
       p0 = p0.optJSONObject("15O");
       if (p0 != null) {
          if (m.a(p0.optString("able"), false)) {
             JSONArray jSONArray = p0.optJSONArray("fl");
             if (jSONArray != null && (jSONArray.length() <= 0 || (jSONArray.toString()).contains(Build.MANUFACTURER))) {
                fi.G = (long)(p0.optInt("iv", 30) * 1000);
             label_0041 :
                fp.a(p1, "awsi", fi.G);
             }
          }
          fi.G = -1;
          goto label_0041 ;
       }
       return;
    }
    public static boolean e(){
       return fi.w;
    }
    public static void f(JSONObject p0,SharedPreferences$Editor p1){
       if (p0 == null) {
          return;
       }
       p0 = p0.getJSONObject("17Y");
       if (p0 != null) {
          int b = m.a(p0.optString("able"), false);
          fi.d = b;
          fp.a(p1, "17ya", b);
          b = m.a(p0.optString("mup"), false);
          fi.e = b;
          fp.a(p1, "17ym", b);
          b = p0.optInt("max", 20);
          if (b > 0) {
             fp.a(p1, "17yx", b);
             fi.f = b * 1024;
          }
          int i = p0.optInt("inv", 3);
          if (i > 0) {
             fp.a(p1, "17yi", i);
             fi.g = ((i * 60) * 60) * 1000;
          }
       }
       return;
    }
    public static boolean f(){
       return fi.y;
    }
    public static double g(){
       return fi.z;
    }
    public static void g(JSONObject p0,SharedPreferences$Editor p1){
       p0 = p0.optJSONObject("15U");
       if (p0 != null) {
          fi.N = p0.optLong("sysTime", fi.N);
          fp.a(p1, "15ua", m.a(p0.optString("able"), true));
          fp.a(p1, "15un", p0.optInt("yn", fi.I));
          fp.a(p1, "15ust", fi.N);
       }
       return;
    }
    public static void h(JSONObject p0,SharedPreferences$Editor p1){
       if (p0 == null) {
          return;
       }
       p0 = p0.optJSONObject("17J");
       if (p0 != null) {
          boolean b = m.a(p0.optString("able"), false);
          fi.J = b;
          fp.a(p1, "ok9", b);
          if (b) {
             String str = p0.optString("ht");
             fi.M = str;
             fp.a(p1, "ok11", str);
             m.a(p0.optString("auth"), false);
             fi.L = m.a(p0.optString("nr"), false);
             String str1 = p0.optString("tm");
             if (!TextUtils.isEmpty(str1)) {
                int i = Integer.parseInt(str1);
                if (i > 0 && i < 20) {
                   fi.K = i;
                   fp.a(p1, "ok10", i);
                }
             }
          }
       }
       return;
    }
    public static boolean h(){
       return fi.A;
    }
    public static int i(){
       return fi.B;
    }
    public static boolean j(){
       return fi.D;
    }
    public static boolean k(){
       return fi.E;
    }
    public static boolean l(){
       return fi.c;
    }
    public static boolean m(){
       return fi.F;
    }
    public static long n(){
       return fi.G;
    }
    public static boolean o(){
       return fi.L;
    }
    public static boolean p(){
       return fi.J;
    }
    public static String q(){
       return x.c(fi.M);
    }
    public static boolean r(){
       if (fi.H && fi.I > 0) {
          return true;
       }
       return false;
    }
    public static int s(){
       return fi.I;
    }
    public static long t(){
       return fi.N;
    }
}
