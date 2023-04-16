package com.loc.t$b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class t$b extends Enum	// class@001468
{
    public int d;
    public static final t$b a;
    public static final t$b b;
    public static final t$b c;
    public static final t$b[] e;

    static {
       t$b uob = new t$b("Unknow", 0, -1);
       t$b.a = uob;
       t$b uob1 = new t$b("NotContain", 1, 0);
       t$b.b = uob1;
       t$b uob2 = new t$b("DidContain", 2, 1);
       t$b.c = uob2;
       t$b[] uobArray = new t$b[]{uob,uob1,uob2};
       t$b.e = uobArray;
    }
    public void t$b(String p0,int p1,int p2){
       this.d = p2;
    }
    public static t$b a(int p0){
       t$b b = t$b.b;
       if (p0 == b.a()) {
          return b;
       }
       b = t$b.c;
       if (p0 == b.a()) {
          return b;
       }
       return t$b.a;
    }
    public static t$b valueOf(String p0){
       return Enum.valueOf(t$b.class, p0);
    }
    public static t$b[] values(){
       return t$b.e.clone();
    }
    public final int a(){
       return this.d;
    }
}
