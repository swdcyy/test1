package com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer$a;
import id.k;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer;
import id.i;
import com.facebook.cache.common.CacheKey;
import java.lang.Object;
import com.facebook.common.references.a;
import kd.b;
import java.lang.String;
import id.b;
import com.facebook.imagepipeline.image.a;
import tc.v;
import bd.h;

public class BitmapMemoryCacheProducer$a extends k	// class@001115
{
    public final CacheKey c;
    public final boolean d;
    public final BitmapMemoryCacheProducer e;

    public void BitmapMemoryCacheProducer$a(BitmapMemoryCacheProducer p0,i p1,CacheKey p2,boolean p3){
       this.e = p0;
       this.c = p2;
       this.d = p3;
       super(p1);
    }
    public void i(Object p0,int p1){
       boolean b;
       if (b.d()) {
          b.a("BitmapMemoryCacheProducer#onNewResultImpl");
       }
       b = b.e(p1);
       a uoa = null;
       if (p0 == null) {
          if (b) {
             this.n().d(uoa, p1);
          }
          if (b.d()) {
          label_0023 :
             b.b();
          }
       }else if(p0.j().e() || b.m(p1, 8)){
          this.n().d(p0, p1);
          if (b.d()) {
             goto label_0023 ;
          }
       }else if(!b){
          a uoa1 = this.e.mMemoryCache.get(this.c);
          if (uoa1 != null) {
             h oh = p0.j().a();
             h oh1 = uoa1.j().a();
             if (oh1.a() || oh1.getQuality() >= oh.getQuality()) {
                this.n().d(uoa1, p1);
                a.f(uoa1);
                if (b.d()) {
                   goto label_0023 ;
                }
             }else {
                a.f(uoa1);
             }
          }
       }
       if (this.d != null) {
          uoa = this.e.mMemoryCache.j(this.c, p0);
       }
       if (b) {
          this.n().a(0x3f800000);
       }
       i oi = this.n();
       if (uoa != null) {
          p0 = uoa;
       }
       oi.d(p0, p1);
       a.f(uoa);
       if (b.d()) {
          goto label_0023 ;
       }
       return;
    }
}
