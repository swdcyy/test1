package com.facebook.imagepipeline.producers.ThreadHandoffProducer$a;
import id.i0;
import com.facebook.imagepipeline.producers.ThreadHandoffProducer;
import id.i;
import id.e0;
import id.c0;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import id.b0;

public class ThreadHandoffProducer$a extends i0	// class@001125
{
    public final e0 g;
    public final c0 h;
    public final i i;
    public final ThreadHandoffProducer j;

    public void ThreadHandoffProducer$a(ThreadHandoffProducer p0,i p1,e0 p2,c0 p3,String p4,e0 p5,c0 p6,i p7){
       this.j = p0;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       super(p1, p2, p3, p4);
    }
    public void b(Object p0){
    }
    public Object c(){
       return null;
    }
    public void f(Object p0){
       this.g.onProducerFinishWithSuccess(this.h, "BackgroundThreadHandoffProducer", null);
       this.j.mInputProducer.produceResults(this.i, this.h);
    }
}
