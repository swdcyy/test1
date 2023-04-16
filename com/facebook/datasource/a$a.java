package com.facebook.datasource.a$a;
import kb.e;
import com.facebook.datasource.a$c;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import kb.c;
import java.lang.Throwable;

public final class a$a implements e	// class@001079
{
    public final a$c a;
    public final CountDownLatch b;
    public final a$c c;

    public void a$a(a$c p0,CountDownLatch p1,a$c p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onCancellation(c p0){
       this.b.countDown();
    }
    public void onFailure(c p0){
       this.c.a = p0.e();
       this.b.countDown();
    }
    public void onNewResult(c p0){
       if (!p0.a()) {
          return;
       }
       this.a.a = p0.getResult();
       this.b.countDown();
       return;
    }
    public void onProgressUpdate(c p0){
    }
}
