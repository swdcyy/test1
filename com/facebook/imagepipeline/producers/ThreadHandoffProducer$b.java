package com.facebook.imagepipeline.producers.ThreadHandoffProducer$b;
import id.e;
import com.facebook.imagepipeline.producers.ThreadHandoffProducer;
import id.i0;
import ya.h;
import java.lang.Runnable;
import id.k0;

public class ThreadHandoffProducer$b extends e	// class@001126
{
    public final i0 a;
    public final ThreadHandoffProducer b;

    public void ThreadHandoffProducer$b(ThreadHandoffProducer p0,i0 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void c(){
       this.a.a();
       this.b.mThreadHandoffProducerQueue.a(this.a);
    }
}
