package com.facebook.imagepipeline.producers.p$a;
import id.k;
import id.i;
import tc.g;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.memory.b;
import eb.a;
import bd.d;
import com.facebook.imagepipeline.producers.o;
import java.lang.Object;
import id.b;
import uc.a;
import eb.g;
import java.lang.String;
import java.lang.Throwable;
import cb.a;
import bolts.Task;
import com.facebook.imageformat.a;
import java.io.InputStream;
import java.io.OutputStream;
import eb.e;
import java.lang.Math;
import java.io.IOException;
import java.lang.Integer;
import java.util.Locale;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.Closeable;
import com.facebook.common.references.a;

public class p$a extends k	// class@001141
{
    public final g c;
    public final CacheKey d;
    public final b e;
    public final a f;
    public final d g;

    public void p$a(i p0,g p1,CacheKey p2,b p3,a p4,d p5,o p6){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public void i(Object p0,int p1){
       if (b.f(p1)) {
       }else if(this.g != null && p0.f() != null){
          try{
             this.q(this.p(this.g, p0));
          }catch(java.io.IOException e4){
             a.h("PartialDiskCacheProducer", "Error while merging image data", e4);
             this.n().onFailure(e4);
          }
          p0.close();
          this.g.close();
          this.c.k(this.d);
       }else if(b.m(p1, 8) && (b.e(p1) && p0.j() != a.c)){
          this.c.i(this.d, p0);
          this.n().d(p0, p1);
       }else {
          this.n().d(p0, p1);
       }
       return;
    }
    public final void o(InputStream p0,OutputStream p1,int p2){
       int i = 0x4000;
       byte[] uobyteArray = this.f.get(i);
       int i1 = p2;
       while (true) {
          if (i1 > 0) {
             int i2 = p0.read(uobyteArray, 0, Math.min(i, i1));
             if (i2 >= 0) {
                if (i2 > 0) {
                   p1.write(uobyteArray, 0, i2);
                   i1 = i1 - i2;
                }
             }else {
             label_0026 :
                this.f.a(uobyteArray);
                if (i1 <= 0) {
                   return;
                }
                break ;
             }
          }else {
             goto label_0026 ;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(p2),Integer.valueOf(i1)};
       throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", objArray));
    }
    public final g p(d p0,d p1){
       g og = this.e.f((p1.p() + p1.f().a));
       this.o(p0.k(), og, p1.f().a);
       this.o(p1.k(), og, p1.p());
       return og;
    }
    public final void q(g p0){
       a uoa = a.o(p0.a());
       d uod = new d(uoa);
       uod.x();
       this.n().d(uod, 1);
       d.b(uod);
       a.f(uoa);
    }
}
