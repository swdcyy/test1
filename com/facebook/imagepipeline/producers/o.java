package com.facebook.imagepipeline.producers.o;
import bolts.a;
import com.facebook.imagepipeline.producers.p;
import id.e0;
import id.c0;
import id.i;
import com.facebook.cache.common.CacheKey;
import java.lang.Object;
import bolts.Task;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.lang.String;
import java.util.Map;
import java.lang.Throwable;
import bd.d;
import java.lang.Boolean;
import ab.e;
import uc.a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import id.h0;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import com.facebook.imagepipeline.common.Priority;
import vc.h;

public class o implements a	// class@001140
{
    public final e0 a;
    public final c0 b;
    public final i c;
    public final CacheKey d;
    public final p e;

    public void o(p p0,e0 p1,c0 p2,i p3,CacheKey p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public Object a(Task p0){
       o a;
       o b2;
       o oo = this;
       o oo1 = null;
       Exception uException = 1;
       o oo2 = (p0.isCancelled() || (p0.isFaulted() && p0.getError() instanceof CancellationException))? 1: null;
       String str = "PartialDiskCacheProducer";
       if (oo2) {
          oo.a.onProducerFinishWithCancellation(oo.b, str, null);
          oo.c.b();
       }else if(p0.isFaulted()){
          oo.a.onProducerFinishWithFailure(oo.b, str, p0.getError(), null);
          oo.e.c(oo.c, oo.b, oo.d, null);
       }else {
          d result = p0.getResult();
          if (result != null) {
             a = oo.a;
             o b = oo.b;
             a.onProducerFinishWithSuccess(b, str, p.b(a, b, uException, result.p()));
             int i = result.p() - uException;
             boolean b1 = (i > 0)? true: false;
             e.a(Boolean.valueOf(b1));
             a uoa = new a(oo1, i);
             result.z(uoa);
             i = result.p();
             ImageRequest imageRequest = oo.b.b();
             a uoa1 = imageRequest.d();
             String str1 = (uoa1 != null && (uoa.a <= uoa1.a && uoa.b >= uoa1.b))? 1: null;
             if (str1) {
                oo.b.n("disk", "partial");
                oo.a.onUltimateProducerReached(oo.b, str, uException);
                oo.c.d(result, 9);
             }else {
                oo.c.d(result, 8);
                ImageRequestBuilder imageRequest1 = ImageRequestBuilder.d(imageRequest);
                i = i - uException;
                if (i >= 0) {
                   oo1 = true;
                }
                e.a(Boolean.valueOf(oo1));
                imageRequest1.m(new a(i, Integer.MAX_VALUE));
                b2 = oo.b;
                h0 oh0 = new h0(imageRequest1.a(), b2.getId(), b2.g(), b2.l(), b2.h(), b2.q(), b2.p(), b2.i(), b2.getPriority(), b2.c());
                oo.e.c(oo.c, oo1, oo.d, result);
             }
          }else {
             b2 = oo.a;
             a = oo.b;
             b2.onProducerFinishWithSuccess(a, str, p.b(b2, a, oo1, oo1));
             oo.e.c(oo.c, oo.b, oo.d, result);
          }
       }
       return null;
    }
}
