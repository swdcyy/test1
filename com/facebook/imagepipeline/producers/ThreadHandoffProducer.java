package com.facebook.imagepipeline.producers.ThreadHandoffProducer;
import id.b0;
import id.k0;
import java.lang.Object;
import ab.e;
import id.c0;
import java.lang.String;
import cd.a;
import cd.a$a;
import java.lang.StringBuilder;
import id.i;
import kd.b;
import id.e0;
import com.facebook.imagepipeline.producers.ThreadHandoffProducer$a;
import com.facebook.imagepipeline.producers.ThreadHandoffProducer$b;
import id.i0;
import id.d0;
import java.lang.Runnable;

public class ThreadHandoffProducer implements b0	// class@001127
{
    public final b0 mInputProducer;
    public final k0 mThreadHandoffProducerQueue;

    public void ThreadHandoffProducer(b0 p0,k0 p1){
       super();
       e.d(p0);
       this.mInputProducer = p0;
       this.mThreadHandoffProducerQueue = p1;
    }
    public static String getInstrumentationTag(c0 p0){
       a$a a = a.a;
       StringBuilder str = (a == null)? null: a.b();
       String str1 = (str)? "ThreadHandoffProducer_produceResults_"+p0.getId(): null;
       return str1;
    }
    public void produceResults(i p0,c0 p1){
       if (b.d()) {
          b.a("ThreadHandoffProducer#produceResults");
       }
       e0 uoe0 = p1.l();
       ThreadHandoffProducer$a uoa = new ThreadHandoffProducer$a(this, p0, uoe0, p1, "BackgroundThreadHandoffProducer", uoe0, p1, p0);
       p1.k(new ThreadHandoffProducer$b(this, v9));
       this.mThreadHandoffProducerQueue.c(a.a(v9, ThreadHandoffProducer.getInstrumentationTag(p1)));
       if (b.d()) {
          b.b();
       }
       return;
    }
}
