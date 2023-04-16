package com.facebook.imagepipeline.producers.r$a$a;
import com.facebook.imagepipeline.producers.JobScheduler$d;
import com.facebook.imagepipeline.producers.r$a;
import com.facebook.imagepipeline.producers.r;
import java.lang.Object;
import bd.d;
import com.facebook.imageformat.a;
import ld.c;
import ld.d;
import ab.e;
import id.e0;
import id.c0;
import java.lang.String;
import com.facebook.imagepipeline.request.ImageRequest;
import eb.g;
import com.facebook.common.memory.b;
import uc.e;
import uc.d;
import java.lang.Integer;
import java.io.OutputStream;
import ld.b;
import java.util.Map;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.Closeable;
import com.facebook.common.references.a;
import nc.a;
import id.i;
import id.k;
import java.lang.RuntimeException;
import java.lang.Throwable;
import id.b;

public class r$a$a implements JobScheduler$d	// class@001144
{
    public final r a;
    public final r$a b;

    public void r$a$a(r$a p0,r p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(d p0,int p1){
       int i;
       r$a$a tb = this.b;
       c uoc = tb.d.createImageTranscoder(p0.j(), this.b.c);
       e.d(uoc);
       tb.e.l().onProducerStart(tb.e, "ResizeAndRotateProducer");
       ImageRequest imageRequest = tb.e.b();
       g og = tb.h.b.d();
       try{
          i = 0;
          b uob = uoc.c(p0, og, imageRequest.q(), imageRequest.p(), null, Integer.valueOf(85));
          if (uob.a() != 2) {
             a uoa = a.o(og.a());
             d uod = new d(uoa);
             uod.A(a.a);
             uod.x();
             tb.e.l().onProducerFinishWithSuccess(tb.e, "ResizeAndRotateProducer", tb.p(p0, imageRequest.p(), uob, uoc.getIdentifier()));
             if (uob.a() != 1) {
                p1 = p1 | 0x10;
             }
             tb.n().d(uod, p1);
             d.b(uod);
             a.f(uoa);
          }else {
             throw new RuntimeException("Error while transcoding the image");
          }
       }catch(java.lang.Exception e14){
          tb.e.l().onProducerFinishWithFailure(tb.e, "ResizeAndRotateProducer", e14, i);
          if (b.e(p1)) {
             tb.n().onFailure(e14);
          }
       }
       og.close();
       return;
    }
}
