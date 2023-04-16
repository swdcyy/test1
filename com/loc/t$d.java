package com.loc.t$d;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class t$d extends Enum	// class@00146a
{
    public int d;
    public static final t$d a;
    public static final t$d b;
    public static final t$d c;
    public static final t$d[] e;

    static {
       t$d uod = new t$d("Unknow", 0, -1);
       t$d.a = uod;
       t$d uod1 = new t$d("NotShow", 1, 0);
       t$d.b = uod1;
       t$d uod2 = new t$d("DidShow", 2, 1);
       t$d.c = uod2;
       t$d[] uodArray = new t$d[]{uod,uod1,uod2};
       t$d.e = uodArray;
    }
    public void t$d(String p0,int p1,int p2){
       this.d = p2;
    }
    public static t$d a(int p0){
       t$d b = t$d.b;
       if (p0 == b.a()) {
          return b;
       }
       b = t$d.c;
       if (p0 == b.a()) {
          return b;
       }
       return t$d.a;
    }
    public static t$d valueOf(String p0){
       return Enum.valueOf(t$d.class, p0);
    }
    public static t$d[] values(){
       return t$d.e.clone();
    }
    public final int a(){
       return this.d;
    }
}
