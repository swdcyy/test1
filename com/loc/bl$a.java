package com.loc.bl$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class bl$a extends Enum	// class@00139d
{
    public int f;
    public static final bl$a a;
    public static final bl$a b;
    public static final bl$a c;
    public static final bl$a d;
    public static final bl$a e;
    public static final bl$a[] g;

    static {
       bl$a uoa = new bl$a("NORMAL", 0, 0);
       bl$a.a = uoa;
       bl$a uoa1 = new bl$a("INTERRUPT_IO", 1, 1);
       bl$a.b = uoa1;
       bl$a uoa2 = new bl$a("NEVER", 2, 2);
       bl$a.c = uoa2;
       bl$a uoa3 = new bl$a("FIX", 3, 3);
       bl$a.d = uoa3;
       bl$a uoa4 = new bl$a("SINGLE", 4, 4);
       bl$a.e = uoa4;
       bl$a[] uoaArray = new bl$a[]{uoa,uoa1,uoa2,uoa3,uoa4};
       bl$a.g = uoaArray;
    }
    public void bl$a(String p0,int p1,int p2){
       this.f = p2;
    }
    public static bl$a valueOf(String p0){
       return Enum.valueOf(bl$a.class, p0);
    }
    public static bl$a[] values(){
       return bl$a.g.clone();
    }
}
