package com.facebook.imagepipeline.producers.b$c;
import id.k;
import com.facebook.imagepipeline.producers.b;
import id.i;
import id.c0;
import id.e0;
import com.facebook.imagepipeline.request.ImageRequest;
import uc.b;
import com.facebook.imagepipeline.producers.b$c$a;
import com.facebook.imagepipeline.producers.JobScheduler;
import java.util.concurrent.Executor;
import com.facebook.imagepipeline.producers.JobScheduler$d;
import com.facebook.imagepipeline.producers.b$c$b;
import id.d0;
import java.lang.Throwable;
import java.lang.Object;
import bd.d;
import kd.b;
import java.lang.String;
import id.b;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.imagepipeline.image.a;
import bd.h;
import java.util.Map;
import bd.c;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import java.util.HashMap;
import com.facebook.common.internal.ImmutableMap;
import vc.a;
import com.facebook.common.references.a;
import com.facebook.common.references.a$c;
import fb.c;
import ab.h;
import java.lang.Boolean;
import yc.b;
import java.lang.Runnable;
import java.lang.System;
import java.lang.Integer;
import bd.b;
import android.graphics.Bitmap$Config;

public abstract class b$c extends k	// class@00112d
{
    public final String c;
    public final c0 d;
    public final e0 e;
    public final b f;
    public boolean g;
    public final JobScheduler h;
    public final b i;

    public void b$c(b p0,i p1,c0 p2,boolean p3,int p4){
       this.i = p0;
       super(p1);
       this.c = "ProgressiveDecoder";
       this.d = p2;
       this.e = p2.l();
       b uob = p2.b().g();
       this.f = uob;
       this.g = false;
       this.h = new JobScheduler(p0.b, new b$c$a(this, p0, p2, p4), uob.a);
       p2.k(new b$c$b(this, p0, p3));
    }
    public void g(){
       this.r();
    }
    public void h(Throwable p0){
       this.s(p0);
    }
    public void i(Object p0,int p1){
       boolean b;
       if (b.d()) {
          b.a("DecodeProducer#onNewResultImpl");
       }
       b = b.e(p1);
       if (b) {
          if (p0 == null) {
             this.s(new ExceptionWithNoStacktrace("Encoded image is null."));
             if (b.d()) {
             label_0025 :
                b.b();
             }
          }else if(!p0.u()){
             this.s(new ExceptionWithNoStacktrace("Encoded image is not valid."));
             if (b.d()) {
                goto label_0025 ;
             }
          }else if(!this.x(p0, p1)){
             if (b.d()) {
                goto label_0025 ;
             }
          }else {
             boolean b1 = b.m(p1, 4);
             if (!b && (b1 || this.d.i())) {
                this.h.e();
             }
             if (b.d()) {
                goto label_0025 ;
             }
          }
       }else {
          goto label_0040 ;
       }
       return;
    }
    public void j(float p0){
       super.j((p0 * 0x3f7d70a4));
    }
    public final Map o(a p0,long p1,h p2,boolean p3,String p4,String p5,String p6,String p7){
       b$c uoc = this;
       c uoc1 = p0;
       Object obj = p4;
       Object obj1 = p5;
       Object obj2 = p6;
       int i = p7;
       if (!uoc.e.requiresExtraMap(uoc.d, "DecodeProducer")) {
          return null;
       }
       String str = String.valueOf(p1);
       String str1 = String.valueOf(p2.b());
       String str2 = String.valueOf(p3);
       String str3 = "queueTime";
       if (uoc1 instanceof c) {
          Bitmap uBitmap = uoc1.g();
          Bitmap uBitmap1 = uBitmap;
          HashMap hashMap = new HashMap(8);
          hashMap.put("bitmapSize", uBitmap.getWidth()+"x"+uBitmap.getHeight());
          hashMap.put(str3, str);
          hashMap.put("hasGoodQuality", str1);
          hashMap.put("isFinal", str2);
          hashMap.put("encodedImageSize", obj1);
          hashMap.put("imageFormat", obj);
          hashMap.put("requestedImageSize", obj2);
          hashMap.put("sampleSize", p7);
          hashMap.put("byteCount", uBitmap1.getByteCount()+"");
          return ImmutableMap.copyOf(hashMap);
       }else {
          HashMap hashMap1 = new HashMap(7);
          hashMap1.put(str3, str);
          hashMap1.put("hasGoodQuality", str1);
          hashMap1.put("isFinal", str2);
          hashMap1.put("encodedImageSize", obj1);
          hashMap1.put("imageFormat", obj);
          hashMap1.put("requestedImageSize", obj2);
          hashMap1.put("sampleSize", i);
          return ImmutableMap.copyOf(hashMap1);
       }
    }
    public abstract int p(d p0);
    public abstract h q();
    public void r(){
       this.v(true);
       this.n().b();
    }
    public final void s(Throwable p0){
       this.v(true);
       this.n().onFailure(p0);
    }
    public final void t(a p0,int p1){
       a a = this.i.j.a;
       Throwable throwable = null;
       if (p0 == null) {
       }else {
          c h = a.h;
          if (a.a()) {
             throwable = new Throwable();
          }
          throwable = a.s(p0, h, a, throwable);
       }
       this.v(b.e(p1));
       this.n().d(throwable, p1);
       a.f(throwable);
       return;
    }
    public final a u(d p0,int p1,h p2){
       a uoa;
       b$c ti = this.i;
       ti = (ti.k != null && ti.l.get().booleanValue())? 1: 0;
       try{
          uoa = this.i.c.decode(p0, p1, p2, this.f);
       }catch(java.lang.OutOfMemoryError e1){
          if (ti) {
             this.i.k.run();
             System.gc();
             uoa = this.i.c.decode(uoa, p1, p2, this.f);
          }else {
             throw e1;
          }
       }
       return uoa;
    }
    public final void v(boolean p0){
       _monitor_enter(this);
       if (!p0 || this.g != null) {
          _monitor_exit(this);
          return;
       }else {
          this.n().a(0x3f800000);
          this.g = true;
          _monitor_exit(this);
          this.h.a();
          return;
       }
    }
    public final void w(d p0,a p1){
       this.d.m("encoded_width", Integer.valueOf(p0.getWidth()));
       this.d.m("encoded_height", Integer.valueOf(p0.getHeight()));
       this.d.m("encoded_size", Integer.valueOf(p0.p()));
       if (p1 instanceof b) {
          Bitmap uBitmap = p1.g();
          Bitmap$Config uConfig = (uBitmap == null)? null: uBitmap.getConfig();
          this.d.m("bitmap_config", String.valueOf(uConfig));
       }
       if (p1 != null) {
          p1.f(this.d.getExtras());
       }
       return;
    }
    public boolean x(d p0,int p1){
       return this.h.g(p0, p1);
    }
}
