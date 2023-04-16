package com.meizu.cloud.pushsdk.d.b.d;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class d extends Enum	// class@00150e
{
    public static final d a;
    public static final d b;
    public static final d[] c;

    static {
       d uod = new d("GET", 0);
       d.a = uod;
       d uod1 = new d("POST", 1);
       d.b = uod1;
       d[] uodArray = new d[]{uod,uod1};
       d.c = uodArray;
    }
    public void d(String p0,int p1){
       super(p0, p1);
    }
    public static d valueOf(String p0){
       return Enum.valueOf(d.class, p0);
    }
    public static d[] values(){
       return d.c.clone();
    }
}
