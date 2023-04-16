package com.loc.bj$a;
import java.lang.Cloneable;
import java.lang.Comparable;
import com.loc.bj$c;
import java.lang.Object;
import com.loc.bl$b;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.bc;
import com.loc.p;
import com.loc.bj;

public final class bj$a implements Cloneable, Comparable	// class@001395
{
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public int h;
    public long i;
    public AtomicInteger j;

    public void bj$a(bj$c p0){
       super();
       this.b = p0.c;
       this.c = p0.e;
       this.e = p0.d;
       this.f = p0.m;
       this.g = p0.n;
       this.h = p0.b.a();
       this.d = p0.a;
       this.i = p0.f;
       this.j = new AtomicInteger(1);
       if (this.f == 10) {
          this.a = 0;
       }
       return;
    }
    public final bj$a a(){
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          return null;
       }
    }
    public final String b(){
       String str = "#";
       try{
          String str1 = this.f+str;
          String str2 = "-#";
          StringBuilder str3 = (!TextUtils.isEmpty(this.e))? str1+this.e+str: str1+str2;
          str1 = str3;
          str1 = str1+this.h+str+this.j+str;
          str3 = (!TextUtils.isEmpty(this.b))? str1+this.b+str: str1+str2;
          str1 = str3;
          str3 = (this.f == 1)? str1+this.d+str: str1+str2;
          str1 = str3;
          str3 = (this.f == 1)? str1+this.i+str: str1+str2;
          str1 = str3;
          bj.a();
          return p.b(bc.a((str1+this.c+str+this.g).getBytes(), ("YXBtX25ldHdvcmtf").getBytes()));
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public final Object clone(){
       return this.a();
    }
    public final int compareTo(Object p0){
       return (this.a - p0.a);
    }
}
