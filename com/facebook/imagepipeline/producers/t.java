package com.facebook.imagepipeline.producers.t;
import id.b0;
import java.util.concurrent.Executor;
import com.facebook.common.memory.b;
import java.lang.Object;
import ab.e;
import bd.d;
import eb.g;
import java.io.InputStream;
import com.facebook.imageformat.a;
import com.facebook.imageformat.b;
import nc.a;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.facebook.imagepipeline.nativecode.a;
import fd.e;
import java.io.OutputStream;
import id.i;
import id.c0;
import com.facebook.imagepipeline.producers.t$a;

public class t implements b0	// class@00114a
{
    public final Executor a;
    public final b b;
    public final b0 c;

    public void t(Executor p0,b p1,b0 p2){
       super();
       e.d(p0);
       this.a = p0;
       e.d(p1);
       this.b = p1;
       e.d(p2);
       this.c = p2;
    }
    public static void b(d p0,g p1){
       InputStream inputStream = p0.k();
       a uoa = b.c(inputStream);
       if (uoa == a.f || uoa == a.h) {
          e.a().c(inputStream, p1, 80);
          p0.A(a.a);
       }else if(uoa == a.g || uoa == a.i){
          e.a().b(inputStream, p1);
          p0.A(a.b);
       }else {
          throw new IllegalArgumentException("Wrong image format");
       }
       return;
    }
    public void produceResults(i p0,c0 p1){
       this.c.produceResults(new t$a(this, p0, p1), p1);
    }
}
