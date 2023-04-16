package com.loc.dh;
import com.loc.ft;
import com.loc.fs;

public final class dh extends ft	// class@0013e1
{

    public static int a(fs p0,int p1,int p2,short p3){
       p0.b(4);
       dh.b(p0, p2);
       dh.a(p0, p1);
       dh.a(p0, p3);
       dh.a(p0);
       return dh.b(p0);
    }
    public static void a(fs p0){
       p0.a(0, 1);
    }
    public static void a(fs p0,int p1){
       p0.a(1, p1);
    }
    public static void a(fs p0,short p1){
       p0.a(3, p1);
    }
    public static int b(fs p0){
       return p0.b();
    }
    public static void b(fs p0,int p1){
       p0.a(2, p1);
    }
}
