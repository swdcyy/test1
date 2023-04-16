package com.facebook.imagepipeline.producers.r;
import id.b0;
import java.util.concurrent.Executor;
import com.facebook.common.memory.b;
import ld.d;
import java.lang.Object;
import ab.e;
import id.i;
import id.c0;
import com.facebook.imagepipeline.producers.r$a;

public class r implements b0	// class@001147
{
    public final Executor a;
    public final b b;
    public final b0 c;
    public final boolean d;
    public final d e;

    public void r(Executor p0,b p1,b0 p2,boolean p3,d p4){
       super();
       e.d(p0);
       this.a = p0;
       e.d(p1);
       this.b = p1;
       e.d(p2);
       this.c = p2;
       e.d(p4);
       this.e = p4;
       this.d = p3;
    }
    public void produceResults(i p0,c0 p1){
       r$a uoa = new r$a(this, p0, p1, this.d, this.e);
       this.c.produceResults(v7, p1);
    }
}
