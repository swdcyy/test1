package com.facebook.imagepipeline.producers.m;
import id.b0;
import com.facebook.common.memory.b;
import eb.a;
import com.facebook.imagepipeline.producers.n;
import java.lang.Object;
import eb.g;
import uc.a;
import id.i;
import id.c0;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.Closeable;
import com.facebook.common.references.a;
import bd.d;
import com.facebook.imagepipeline.image.EncodedImageOrigin;
import id.s;
import id.e0;
import java.lang.String;
import java.util.Map;
import android.os.SystemClock;
import java.io.InputStream;
import eb.e;
import java.io.OutputStream;
import java.lang.Math;
import com.facebook.imagepipeline.producers.m$a;
import com.facebook.imagepipeline.producers.n$a;

public class m implements b0	// class@00113d
{
    public final b a;
    public final a b;
    public final n c;

    public void m(b p0,a p1,n p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static void d(g p0,int p1,a p2,i p3,c0 p4){
       a uoa = a.o(p0.a());
       d uod = new d(uoa);
       uod.z(p2);
       uod.x();
       p4.j(EncodedImageOrigin.NETWORK);
       p3.d(uod, p1);
       d.b(uod);
       a.f(uoa);
    }
    public void b(g p0,s p1){
       int i = p0.size();
       Map map = (!p1.c().requiresExtraMap(p1.b(), "NetworkFetchProducer"))? null: this.c.d(p1, i);
       e0 uoe0 = p1.c();
       uoe0.onProducerFinishWithSuccess(p1.b(), "NetworkFetchProducer", map);
       uoe0.onUltimateProducerReached(p1.b(), "NetworkFetchProducer", true);
       p1.b().o("network");
       m.d(p0, (p1.d() | true), p1.e(), p1.a(), p1.b());
       return;
    }
    public void c(g p0,s p1){
       long l = SystemClock.uptimeMillis();
       s os = (!p1.b().i())? null: this.c.c(p1);
       if (os && (l - p1.c) - 100 >= 0) {
          p1.c = l;
          p1.c().onProducerEvent(p1.b(), "NetworkFetchProducer", "intermediate_result");
          int i = p1.d();
          a uoa = p1.e();
          i oi = p1.a();
          m.d(p0, i, uoa, oi, p1.b());
       }
       return;
    }
    public void e(s p0,InputStream p1,int p2){
       float f;
       g og = (p2 > 0)? this.a.f(p2): this.a.d();
       byte[] uobyteArray = this.b.get(0x4000);
       int i = p1.read(uobyteArray);
       while (i >= 0) {
          if (i > 0) {
             og.write(uobyteArray, 0, i);
             this.c(og, p0);
             i = og.size();
             if (p2 > 0) {
                f = (float)i / (float)p2;
             }else {
                i = - i;
                double d = (double)i / 50000.00f;
                f = 0x3f800000 - (float)Math.exp(d);
             }
             p0.a().a(f);
          }
       }
       this.c.b(p0, og.size());
       this.b(og, p0);
       this.b.a(uobyteArray);
       og.close();
       return;
    }
    public void produceResults(i p0,c0 p1){
       p1.l().onProducerStart(p1, "NetworkFetchProducer");
       s os = this.c.a(p0, p1);
       this.c.e(os, new m$a(this, os));
    }
}
