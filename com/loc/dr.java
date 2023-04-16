package com.loc.dr;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.lang.Throwable;
import com.loc.eb;
import java.lang.StringBuilder;

public abstract class dr implements Serializable	// class@0013ee
{
    public String a;
    public String b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;

    public void dr(){
       super();
       this.a = "";
       this.b = "";
       this.c = 99;
       this.d = Integer.MAX_VALUE;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.i = true;
    }
    public void dr(boolean p0,boolean p1){
       super();
       this.a = "";
       this.b = "";
       this.c = 99;
       this.d = Integer.MAX_VALUE;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.i = true;
       this.h = p0;
       this.i = p1;
    }
    public static int a(String p0){
       int i;
       try{
          i = Integer.parseInt(p0);
       }catch(java.lang.Exception e0){
          eb.a(e0);
          i = 0;
       }
       return i;
    }
    public abstract dr a();
    public final void a(dr p0){
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
    }
    public final int b(){
       return dr.a(this.a);
    }
    public final int c(){
       return dr.a(this.b);
    }
    public Object clone(){
       return this.a();
    }
    public String toString(){
       return "AmapCell{mcc="+this.a+", mnc="+this.b+", signalStrength="+this.c+", asulevel="+this.d+", lastUpdateSystemMills="+this.e+", lastUpdateUtcMills="+this.f+", age="+this.g+", main="+this.h+", newapi="+this.i+'}';
    }
}
