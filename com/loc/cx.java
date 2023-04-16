package com.loc.cx;
import com.loc.ft;
import com.loc.fs;

public final class cx extends ft	// class@0013d0
{

    public static int a(fs p0){
       return p0.b();
    }
    public static int a(fs p0,int p1,int p2,int p3){
       p0.b(3);
       cx.c(p0, p3);
       cx.b(p0, p2);
       cx.a(p0, p1);
       return cx.a(p0);
    }
    public static int a(fs p0,byte[] p1){
       int i = 1;
       p0.a(i, p1.length, i);
       for (int i1 = p1.length - i; i1 >= 0; i1 = i1 - 1) {
          p0.a(p1[i1]);
       }
       return p0.a();
    }
    public static int a(fs p0,int[] p1){
       p0.a(4, p1.length, 4);
       for (int i = p1.length - 1; i >= 0; i = i - 1) {
          p0.a(p1[i]);
       }
       return p0.a();
    }
    public static void a(fs p0,int p1){
       p0.b(0, p1);
    }
    public static int b(fs p0,byte[] p1){
       int i = 1;
       p0.a(i, p1.length, i);
       for (int i1 = p1.length - i; i1 >= 0; i1 = i1 - 1) {
          p0.a(p1[i1]);
       }
       return p0.a();
    }
    public static void b(fs p0,int p1){
       p0.b(1, p1);
    }
    public static void c(fs p0,int p1){
       p0.b(2, p1);
    }
}
