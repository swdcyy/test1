package com.facebook.imagepipeline.producers.c;
import bolts.a;
import id.m;
import id.e0;
import id.c0;
import id.i;
import java.lang.Object;
import bolts.Task;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.lang.String;
import java.util.Map;
import java.lang.Throwable;
import id.b0;
import bd.d;

public class c implements a	// class@00112f
{
    public final e0 a;
    public final c0 b;
    public final i c;
    public final m d;

    public void c(m p0,e0 p1,c0 p2,i p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public Object a(Task p0){
       c uoc = 1;
       c uoc1 = null;
       c uoc2 = (p0.isCancelled() || (p0.isFaulted() && p0.getError() instanceof CancellationException))? 1: null;
       if (uoc2) {
          this.a.onProducerFinishWithCancellation(this.b, "DiskCacheProducer", null);
          this.c.b();
       }else if(p0.isFaulted()){
          this.a.onProducerFinishWithFailure(this.b, "DiskCacheProducer", p0.getError(), null);
          this.d.d.produceResults(this.c, this.b);
       }else {
          d result = p0.getResult();
          if (result != null) {
             uoc2 = this.a;
             uoc1 = this.b;
             uoc2.onProducerFinishWithSuccess(uoc1, "DiskCacheProducer", m.b(uoc2, uoc1, uoc, result.p()));
             this.a.onUltimateProducerReached(this.b, "DiskCacheProducer", uoc);
             this.b.o("disk");
             this.c.a(0x3f800000);
             this.c.d(result, uoc);
             result.close();
          }else {
             c ta = this.a;
             uoc2 = this.b;
             ta.onProducerFinishWithSuccess(uoc2, "DiskCacheProducer", m.b(ta, uoc2, uoc1, uoc1));
             this.d.d.produceResults(this.c, this.b);
          }
       }
       return null;
    }
}
