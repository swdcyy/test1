package com.xiaomi.push.n;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class n extends Enum	// class@001140
{
    public static final n a;
    public static final n[] a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;

    static {
       n on = new n("China", 0);
       n.a = on;
       n on1 = new n("Global", 1);
       n.b = on1;
       n on2 = new n("Europe", 2);
       n.c = on2;
       n on3 = new n("Russia", 3);
       n.d = on3;
       n on4 = new n("India", 4);
       n.e = on4;
       n[] onArray = new n[]{on,on1,on2,on3,on4};
       n.a = onArray;
    }
    public void n(String p0,int p1){
       super(p0, p1);
    }
    public static n valueOf(String p0){
       return Enum.valueOf(n.class, p0);
    }
    public static n[] values(){
       return n.a.clone();
    }
}
