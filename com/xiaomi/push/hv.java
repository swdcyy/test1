package com.xiaomi.push.hv;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class hv extends Enum	// class@00111e
{
    public final int a;
    public static final hv a;
    public static final hv[] a;
    public static final hv b;
    public static final hv c;

    static {
       hv ohv = new hv("RegIdExpired", 0, 0);
       hv.a = ohv;
       hv ohv1 = new hv("PackageUnregistered", 1, 1);
       hv.b = ohv1;
       hv ohv2 = new hv("Init", 2, 2);
       hv.c = ohv2;
       hv[] ohvArray = new hv[]{ohv,ohv1,ohv2};
       hv.a = ohvArray;
    }
    public void hv(String p0,int p1,int p2){
       this.a = p2;
    }
    public static hv a(int p0){
       if (!p0) {
          return hv.a;
       }
       if (p0 == 1) {
          return hv.b;
       }
       if (p0 != 2) {
          return null;
       }
       return hv.c;
    }
    public static hv valueOf(String p0){
       return Enum.valueOf(hv.class, p0);
    }
    public static hv[] values(){
       return hv.a.clone();
    }
    public int a(){
       return this.a;
    }
}
