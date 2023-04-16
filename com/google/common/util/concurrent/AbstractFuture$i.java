package com.google.common.util.concurrent.AbstractFuture$i;
import com.google.common.util.concurrent.AbstractFuture$b;
import com.google.common.util.concurrent.AbstractFuture$j;
import ym.a;
import com.google.common.util.concurrent.AbstractFuture;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Throwable;
import com.google.common.base.b;
import java.lang.RuntimeException;
import com.google.common.util.concurrent.AbstractFuture$a;
import com.google.common.util.concurrent.AbstractFuture$d;
import java.lang.Object;
import java.lang.Thread;

public final class AbstractFuture$i extends AbstractFuture$b	// class@00192b
{
    public static final a a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
       AbstractFuture$j oj = AbstractFuture$j.class;
       try{
          a uoa = new a();
          AbstractFuture$i.c = uoa.d(AbstractFuture.class.getDeclaredField("d"));
          AbstractFuture$i.b = uoa.d(AbstractFuture.class.getDeclaredField("c"));
          AbstractFuture$i.d = uoa.d(AbstractFuture.class.getDeclaredField("b"));
          AbstractFuture$i.e = uoa.d(oj.getDeclaredField("a"));
          AbstractFuture$i.f = uoa.d(oj.getDeclaredField("b"));
          AbstractFuture$i.a = uoa;
       }catch(java.lang.Exception e0){
          b.e(e0);
          throw new RuntimeException(e0);
       }
    }
    public void AbstractFuture$i(){
       super(null);
    }
    public void AbstractFuture$i(AbstractFuture$a p0){
       super(null);
    }
    public boolean a(AbstractFuture p0,AbstractFuture$d p1,AbstractFuture$d p2){
       return AbstractFuture$i.a.c(p0, AbstractFuture$i.b, p1, p2);
    }
    public boolean b(AbstractFuture p0,Object p1,Object p2){
       return AbstractFuture$i.a.c(p0, AbstractFuture$i.d, p1, p2);
    }
    public boolean c(AbstractFuture p0,AbstractFuture$j p1,AbstractFuture$j p2){
       return AbstractFuture$i.a.c(p0, AbstractFuture$i.c, p1, p2);
    }
    public void d(AbstractFuture$j p0,AbstractFuture$j p1){
       AbstractFuture$i.a.e(p0, AbstractFuture$i.f, p1);
    }
    public void e(AbstractFuture$j p0,Thread p1){
       AbstractFuture$i.a.e(p0, AbstractFuture$i.e, p1);
    }
}
