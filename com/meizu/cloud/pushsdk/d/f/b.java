package com.meizu.cloud.pushsdk.d.f.b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class b extends Enum	// class@001527
{
    public final int e;
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b[] f;

    static {
       b uob = new b("OFF", 0, 0);
       b.a = uob;
       b uob1 = new b("ERROR", 1, 1);
       b.b = uob1;
       b uob2 = new b("DEBUG", 2, 2);
       b.c = uob2;
       b uob3 = new b("VERBOSE", 3, 3);
       b.d = uob3;
       b[] uobArray = new b[]{uob,uob1,uob2,uob3};
       b.f = uobArray;
    }
    public void b(String p0,int p1,int p2){
       this.e = p2;
    }
    public static b valueOf(String p0){
       return Enum.valueOf(b.class, p0);
    }
    public static b[] values(){
       return b.f.clone();
    }
    public int a(){
       return this.e;
    }
}
