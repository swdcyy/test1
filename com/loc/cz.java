package com.loc.cz;
import com.loc.ft;
import com.loc.fs;

public final class cz extends ft	// class@0013d2
{

    public static int a(fs p0){
       return p0.b();
    }
    public static int a(fs p0,int p1,byte p2,int p3,int p4){
       p0.b(4);
       cz.c(p0, p4);
       cz.b(p0, p3);
       cz.a(p0, p1);
       cz.a(p0, p2);
       return cz.a(p0);
    }
    public static int a(fs p0,int[] p1){
       p0.a(4, p1.length, 4);
       for (int i = p1.length - 1; i >= 0; i = i - 1) {
          p0.a(p1[i]);
       }
       return p0.a();
    }
    public static void a(fs p0,byte p1){
       p0.a(1, p1);
    }
    public static void a(fs p0,int p1){
       p0.b(0, p1);
    }
    public static int b(fs p0,int[] p1){
       p0.a(4, p1.length, 4);
       for (int i = p1.length - 1; i >= 0; i = i - 1) {
          p0.a(p1[i]);
       }
       return p0.a();
    }
    public static void b(fs p0,int p1){
       p0.b(2, p1);
    }
    public static void c(fs p0,int p1){
       p0.b(3, p1);
    }
}
