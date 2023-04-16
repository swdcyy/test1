package com.tencent.mm.opensdk.diffdev.a.d;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;

public final class d extends Enum	// class@000e83
{
    public int a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d[] h;

    static {
       d uod = new d("UUID_EXPIRED", 0, 402);
       d.b = uod;
       d uod1 = new d("UUID_CANCELED", 1, 403);
       d.c = uod1;
       d uod2 = new d("UUID_SCANED", 2, 404);
       d.d = uod2;
       d uod3 = new d("UUID_CONFIRM", 3, 405);
       d.e = uod3;
       d uod4 = new d("UUID_KEEP_CONNECT", 4, 408);
       d.f = uod4;
       d uod5 = new d("UUID_ERROR", 5, 500);
       d.g = uod5;
       d[] uodArray = new d[]{uod,uod1,uod2,uod3,uod4,uod5};
       d.h = uodArray;
    }
    public void d(String p0,int p1,int p2){
       this.a = p2;
    }
    public static d valueOf(String p0){
       return Enum.valueOf(d.class, p0);
    }
    public static d[] values(){
       return d.h.clone();
    }
    public int a(){
       return this.a;
    }
    public String toString(){
       return "UUIDStatusCode:"+this.a;
    }
}
