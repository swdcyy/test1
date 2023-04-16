package com.google.common.cache.Striped64$a;
import ym.a;
import com.google.common.cache.Striped64;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Error;
import java.lang.Throwable;
import java.lang.Object;

public final class Striped64$a	// class@001782
{
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public static final a p;
    public static final long q;

    static {
       try{
          a unsafe = Striped64.getUnsafe();
          Striped64$a.p = unsafe;
          Striped64$a.q = unsafe.d(Striped64$a.class.getDeclaredField("h"));
       }catch(java.lang.Exception e0){
          throw new Error(e0);
       }
    }
    public void Striped64$a(long p0){
       super();
       this.h = p0;
    }
    public final boolean a(long p0,long p1){
       return Striped64$a.p.b(this, Striped64$a.q, p0, p1);
    }
}
