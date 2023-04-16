package com.meizu.cloud.pushsdk.d.c.a$a;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.System;
import java.lang.String;
import com.meizu.cloud.pushsdk.d.f.e;
import java.util.List;

public abstract class a$a	// class@001513
{
    public List a;
    public long b;
    public String c;

    public void a$a(){
       super();
       this.a = new LinkedList();
       this.b = System.currentTimeMillis();
       this.c = e.b();
    }
    public static List a(a$a p0){
       return p0.a;
    }
    public static String b(a$a p0){
       return p0.c;
    }
    public static long c(a$a p0){
       return p0.b;
    }
    public abstract a$a a();
    public a$a a(long p0){
       this.b = p0;
       return this.a();
    }
}
