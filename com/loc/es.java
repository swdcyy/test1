package com.loc.es;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class es	// class@001417
{
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public short m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public long t;

    public void es(int p0,boolean p1){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.k = -113;
       this.l = 0;
       this.m = 0;
       this.n = false;
       this.o = 0x7fff;
       this.p = Integer.MAX_VALUE;
       this.q = Integer.MAX_VALUE;
       this.r = true;
       this.s = 99;
       this.t = 0;
       this.l = p0;
       this.n = p1;
    }
    public final long a(){
       if (this.l == 5) {
          return this.e;
       }
       return (long)this.d;
    }
    public final String b(){
       es tl = this.l;
       if (tl != 1) {
          if (tl != 2) {
             if (tl != 3 && (tl != 4 && tl != 5)) {
                return null;
             }
          }else {
             return this.f();
          }
       }
       return this.e();
    }
    public final String c(){
       String str = this.b();
       if (str != null && str.length() > 0) {
          return this.r+"#"+str;
       }
       return "";
    }
    public final Object clone(){
       return this.d();
    }
    public final es d(){
       es uoes = new es(this.l, this.n);
       uoes.a = this.a;
       uoes.b = this.b;
       uoes.c = this.c;
       uoes.d = this.d;
       uoes.e = this.e;
       uoes.f = this.f;
       uoes.g = this.g;
       uoes.h = this.h;
       uoes.i = this.i;
       uoes.j = this.j;
       uoes.k = this.k;
       uoes.m = this.m;
       uoes.o = this.o;
       uoes.p = this.p;
       uoes.q = this.q;
       uoes.r = this.r;
       uoes.s = this.s;
       uoes.t = this.t;
       return uoes;
    }
    public final String e(){
       return this.l+"#"+this.a+"#"+this.b+"#"+0+"#"+this.a();
    }
    public final boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof es) {
          es l = p0.l;
          if (l != true) {
             es uoes = 2;
             if (l != uoes) {
                uoes = 3;
                if (l != uoes) {
                   uoes = 4;
                   if (l != uoes) {
                      uoes = 5;
                      if (l != uoes) {
                         return false;
                      }else if(this.l != uoes){
                         return false;
                      }else if(p0.c == this.c && (!p0.e - this.e && p0.q == this.q)){
                         return true;
                      }else {
                         return false;
                      }
                   }else if(this.l != uoes){
                      return false;
                   }else if(p0.c == this.c && (p0.d == this.d && p0.b == this.b)){
                      return true;
                   }else {
                      return false;
                   }
                }else if(this.l != uoes){
                   return false;
                }else if(p0.c == this.c && (p0.d == this.d && p0.b == this.b)){
                   return true;
                }else {
                   return false;
                }
             }else if(this.l != uoes){
                return false;
             }else if(p0.j == this.j && (p0.i == this.i && p0.h == this.h)){
                return true;
             }else {
                return false;
             }
          }else if(this.l != true){
             return false;
          }else if(p0.c == this.c && (p0.d == this.d && p0.b == this.b)){
             return true;
          }
       }
       return false;
    }
    public final String f(){
       return this.l+"#"+this.h+"#"+this.i+"#"+this.j;
    }
    public final int hashCode(){
       int i1;
       es th;
       int i = (String.valueOf(this.l)).hashCode();
       if (this.l == 2) {
          i1 = (String.valueOf(this.j)).hashCode() + (String.valueOf(this.i)).hashCode();
          th = this.h;
       }else {
          i1 = (String.valueOf(this.c)).hashCode() + (String.valueOf(this.d)).hashCode();
          th = this.b;
       }
       return (i + (i1 + (String.valueOf(th)).hashCode()));
    }
}
