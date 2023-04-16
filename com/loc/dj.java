package com.loc.dj;
import com.loc.ft;
import com.loc.fs;

public final class dj extends ft	// class@0013e3
{

    public static int a(fs p0){
       return p0.b();
    }
    public static int a(fs p0,int p1){
       p0.b(1);
       dj.b(p0, p1);
       return dj.a(p0);
    }
    public static int a(fs p0,int[] p1){
       p0.a(4, p1.length, 4);
       for (int i = p1.length - 1; i >= 0; i = i - 1) {
          p0.a(p1[i]);
       }
       return p0.a();
    }
    public static void b(fs p0,int p1){
       p0.b(0, p1);
    }
}
