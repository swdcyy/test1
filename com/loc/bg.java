package com.loc.bg;
import java.lang.Object;
import com.loc.m;
import com.loc.bl;
import android.os.SystemClock;
import com.loc.bl$a;
import java.lang.Math;
import com.loc.bm;
import com.loc.bl$b;
import com.loc.bj;
import java.lang.Throwable;
import com.loc.k;
import java.lang.String;
import com.loc.bl$c;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.net.URL;

public final class bg	// class@00138f
{
    public static int a = 0;
    public static String b = "";
    public static HashMap c;
    public static HashMap d;
    public static HashMap e;
    public static bg f;

    public void bg(){
       super();
       m.e();
    }
    public static int a(bl p0,long p1){
       bg.d(p0);
       long l = 0;
       if (!p1 - l) {
       }else {
          l = SystemClock.elapsedRealtime() - p1;
       }
       int i = p0.n();
       if (p0.p() == bl$a.d || p0.p() == bl$a.e) {
          return i;
       }else {
          i = (long)i;
          if (l - i < 0) {
             i = i - l;
             if (i - 1000 >= 0) {
                return (int)i;
             }
          }
          return Math.min(1000, p0.n());
       }
    }
    public static bg a(){
       if (bg.f == null) {
          bg.f = new bg();
       }
       return bg.f;
    }
    public static bm a(bl p0){
       return bg.a(p0, p0.s());
    }
    public static bm a(bl p0,bl$b p1,int p2){
       try{
          bg.d(p0);
          p0.a(p1);
          p0.c(p2);
          return new bj().a(p0);
       }catch(com.loc.k e0){
          throw e0;
       }
    }
    public static bm a(bl p0,boolean p1){
       boolean b2;
       bg.d(p0);
       bl$c b = (p1)? bl$c.b: bl$c.a;
       p0.a(b);
       bm uobm = null;
       long l = 0;
       if (bg.b(p0)) {
          boolean b1 = bg.c(p0);
          try{
             l = SystemClock.elapsedRealtime();
             uobm = bg.a(p0, bg.b(p0, b1), bg.d(p0, b1));
          }catch(com.loc.k e2){
             if (e2.f() != 21 || p0.p() != bl$a.b) {
                if (b1) {
                   b2 = true;
                }else {
                   throw e2;
                }
             }else {
                throw e2;
             }
          }
       }
       if (uobm != null) {
          bm a = uobm.a;
          if (a != null && a.length > 0) {
             return uobm;
          }
       }
       try{
          return bg.a(p0, bg.c(p0, b2), bg.a(p0, l));
       }catch(com.loc.k e7){
          throw e7;
       }
    }
    public static bl$b b(bl p0,boolean p1){
       if (p0.p() == bl$a.d) {
          return bl$b.e;
       }
       if (p0.p() == bl$a.e) {
          return bl$b.b;
       }
       if (p1) {
          return bl$b.a;
       }
       return bl$b.b;
    }
    public static boolean b(bl p0){
       bg.d(p0);
       String str = p0.c();
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       str = new URL(str).getHost();
       if (!TextUtils.isEmpty(p0.g())) {
          str = p0.g();
       }
       return m.d(str);
    }
    public static bl$b c(bl p0,boolean p1){
       if (p0.p() == bl$a.d) {
          if (p1) {
             return bl$b.f;
          }
          return bl$b.g;
       }else if(p1){
          return bl$b.c;
       }else {
          return bl$b.d;
       }
    }
    public static boolean c(bl p0){
       bg.d(p0);
       if (!bg.b(p0)) {
          return true;
       }
       if ((p0.b()).equals(p0.c())) {
          return false;
       }
       if (p0.p() == bl$a.e) {
          return false;
       }
       if (!m.h) {
          return false;
       }
       return true;
    }
    public static int d(bl p0,boolean p1){
       bg.d(p0);
       int i = p0.n();
       int e = m.e;
       if (p0.p() != bl$a.d && p0.p() != bl$a.e) {
          if (i < e) {
             return i;
          }else if(p1){
             return e;
          }
       }
       return i;
    }
    public static void d(bl p0){
       if (p0 == null) {
          throw new k("requeust is null");
       }
       if (p0.b() != null && !("").equals(p0.b())) {
          return;
       }
       throw new k("request url is empty");
    }
}
