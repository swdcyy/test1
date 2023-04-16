package com.xiaomi.push.g$b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class g$b extends Enum	// class@001109
{
    public final int a;
    public static final g$b a;
    public static final g$b[] a;
    public static final g$b b;
    public static final g$b c;

    static {
       g$b uob = new g$b("UNKNOWN", 0, 0);
       g$b.a = uob;
       g$b uob1 = new g$b("ALLOWED", 1, 1);
       g$b.b = uob1;
       g$b uob2 = new g$b("NOT_ALLOWED", 2, 2);
       g$b.c = uob2;
       g$b[] uobArray = new g$b[]{uob,uob1,uob2};
       g$b.a = uobArray;
    }
    public void g$b(String p0,int p1,int p2){
       this.a = p2;
    }
    public static g$b valueOf(String p0){
       return Enum.valueOf(g$b.class, p0);
    }
    public static g$b[] values(){
       return g$b.a.clone();
    }
    public int a(){
       return this.a;
    }
}
