package com.facebook.imagepipeline.producers.b;
import id.b0;
import eb.a;
import java.util.concurrent.Executor;
import yc.b;
import yc.d;
import vc.a;
import java.lang.Runnable;
import ab.h;
import java.lang.Object;
import ab.e;
import id.i;
import id.c0;
import kd.b;
import java.lang.String;
import com.facebook.imagepipeline.request.ImageRequest;
import android.net.Uri;
import ib.c;
import com.facebook.imagepipeline.producers.b$a;
import yc.e;
import com.facebook.imagepipeline.producers.b$b;

public class b implements b0	// class@00112e
{
    public final a a;
    public final Executor b;
    public final b c;
    public final d d;
    public final b0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final a j;
    public final Runnable k;
    public final h l;

    public void b(a p0,Executor p1,b p2,d p3,boolean p4,boolean p5,boolean p6,b0 p7,int p8,a p9,Runnable p10,h p11){
       super();
       e.d(p0);
       this.a = p0;
       e.d(p1);
       this.b = p1;
       e.d(p2);
       this.c = p2;
       e.d(p3);
       this.d = p3;
       this.f = p4;
       this.g = p5;
       e.d(p7);
       this.e = p7;
       this.h = p6;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
    }
    public void produceResults(i p0,c0 p1){
       if (b.d()) {
          b.a("DecodeProducer#produceResults");
       }
       if (!c.k(p1.b().s())) {
          b$a uoa = new b$a(this, p0, p1, this.h, this.i);
       }else {
          b$b uob = new b$b(this, p0, p1, new e(this.a), this.d, this.h, this.i);
          uob = v8;
       }
       this.e.produceResults(v0, p1);
       if (b.d()) {
          b.b();
       }
       return;
    }
}
