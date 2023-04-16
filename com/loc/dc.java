package com.loc.dc;
import com.loc.ft;
import com.loc.fs;

public final class dc extends ft	// class@0013dc
{

    public static int a(fs p0){
       return p0.b();
    }
    public static int a(fs p0,byte p1,int p2){
       p0.b(2);
       dc.a(p0, p2);
       dc.a(p0, p1);
       return dc.a(p0);
    }
    public static int a(fs p0,byte[] p1){
       int i = 1;
       p0.a(i, p1.length, i);
       for (int i1 = p1.length - i; i1 >= 0; i1 = i1 - 1) {
          p0.a(p1[i1]);
       }
       return p0.a();
    }
    public static void a(fs p0,byte p1){
       p0.a(0, p1);
    }
    public static void a(fs p0,int p1){
       p0.b(1, p1);
    }
}
