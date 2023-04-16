package com.yxcorp.gifshow.util.resource.n$a;
import com.yxcorp.gifshow.util.resource.n$c;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import boc.b;
import boc.z;
import java.lang.Throwable;

public class n$a implements n$c	// class@000cf2
{
    public final CountDownLatch a;

    public void n$a(CountDownLatch p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       this.a.countDown();
    }
    public void b(b p0,float p1){
       z.c(this, p0, p1);
    }
    public void c(b p0){
       this.a.countDown();
    }
    public void d(b p0,Throwable p1){
       this.a.countDown();
    }
}
