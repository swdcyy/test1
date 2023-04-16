package com.xiaomi.push.hi;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class hi extends Enum	// class@001111
{
    public final int a;
    public static final hi a;
    public static final hi[] a;
    public static final hi b;

    static {
       hi ohi = new hi("START", 0, 0);
       hi.a = ohi;
       hi ohi1 = new hi("BIND", 1, 1);
       hi.b = ohi1;
       hi[] ohiArray = new hi[]{ohi,ohi1};
       hi.a = ohiArray;
    }
    public void hi(String p0,int p1,int p2){
       this.a = p2;
    }
    public static hi valueOf(String p0){
       return Enum.valueOf(hi.class, p0);
    }
    public static hi[] values(){
       return hi.a.clone();
    }
    public int a(){
       return this.a;
    }
}
