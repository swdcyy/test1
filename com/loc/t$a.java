package com.loc.t$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class t$a extends Enum	// class@001467
{
    public int d;
    public static final t$a a;
    public static final t$a b;
    public static final t$a c;
    public static final t$a[] e;

    static {
       t$a uoa = new t$a("Unknow", 0, -1);
       t$a.a = uoa;
       t$a uoa1 = new t$a("NotAgree", 1, 0);
       t$a.b = uoa1;
       t$a uoa2 = new t$a("DidAgree", 2, 1);
       t$a.c = uoa2;
       t$a[] uoaArray = new t$a[]{uoa,uoa1,uoa2};
       t$a.e = uoaArray;
    }
    public void t$a(String p0,int p1,int p2){
       this.d = p2;
    }
    public static t$a a(int p0){
       t$a b = t$a.b;
       if (p0 == b.a()) {
          return b;
       }
       b = t$a.c;
       if (p0 == b.a()) {
          return b;
       }
       return t$a.a;
    }
    public static t$a valueOf(String p0){
       return Enum.valueOf(t$a.class, p0);
    }
    public static t$a[] values(){
       return t$a.e.clone();
    }
    public final int a(){
       return this.d;
    }
}
