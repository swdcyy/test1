package com.meizu.cloud.pushsdk.d.b.b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class b extends Enum	// class@00150c
{
    public final int d;
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b[] e;

    static {
       b uob = new b("Single", 0, 1);
       b.a = uob;
       b uob1 = new b("DefaultGroup", 1, 3);
       b.b = uob1;
       b uob2 = new b("HeavyGroup", 2, 25);
       b.c = uob2;
       b[] uobArray = new b[]{uob,uob1,uob2};
       b.e = uobArray;
    }
    public void b(String p0,int p1,int p2){
       this.d = p2;
    }
    public static b valueOf(String p0){
       return Enum.valueOf(b.class, p0);
    }
    public static b[] values(){
       return b.e.clone();
    }
    public int a(){
       return this.d;
    }
}
