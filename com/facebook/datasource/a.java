package com.facebook.datasource.a;
import java.lang.Throwable;
import kb.c;
import kb.i;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;
import com.facebook.datasource.a$c;
import kb.d;
import com.facebook.datasource.a$a;
import com.facebook.datasource.a$b;
import kb.e;
import java.util.concurrent.Executor;

public class a	// class@00107c
{

    public static c a(Throwable p0){
       i oi = i.p();
       oi.k(p0);
       return oi;
    }
    public static Object b(c p0){
       CountDownLatch uCountDownLa = new CountDownLatch(1);
       a$c uoc = new a$c(null);
       a$c uoc1 = new a$c(null);
       p0.f(new a$a(uoc, uCountDownLa, uoc1), new a$b());
       uCountDownLa.await();
       a$c a = uoc1.a;
       if (a == null) {
          return uoc.a;
       }
       throw a;
    }
}
