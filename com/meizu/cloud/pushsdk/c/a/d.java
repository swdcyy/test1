package com.meizu.cloud.pushsdk.c.a.d;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class d extends Enum	// class@0014c1
{
    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d[] e;

    static {
       d uod = new d("LOW", 0);
       d.a = uod;
       d uod1 = new d("MEDIUM", 1);
       d.b = uod1;
       d uod2 = new d("HIGH", 2);
       d.c = uod2;
       d uod3 = new d("IMMEDIATE", 3);
       d.d = uod3;
       d[] uodArray = new d[]{uod,uod1,uod2,uod3};
       d.e = uodArray;
    }
    public void d(String p0,int p1){
       super(p0, p1);
    }
    public static d valueOf(String p0){
       return Enum.valueOf(d.class, p0);
    }
    public static d[] values(){
       return d.e.clone();
    }
}
