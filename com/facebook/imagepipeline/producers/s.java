package com.facebook.imagepipeline.producers.s;
import id.i0;
import com.facebook.imagepipeline.producers.t;
import id.i;
import id.e0;
import id.c0;
import java.lang.String;
import bd.d;
import java.lang.Object;
import eb.g;
import com.facebook.common.memory.b;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.Closeable;
import com.facebook.common.references.a;
import java.lang.Exception;

public class s extends i0	// class@001148
{
    public final d g;
    public final t h;

    public void s(t p0,i p1,e0 p2,c0 p3,String p4,d p5){
       this.h = p0;
       this.g = p5;
       super(p1, p2, p3, p4);
    }
    public void b(Object p0){
       d.b(p0);
    }
    public Object c(){
       g og = this.h.b.d();
       t.b(this.g, og);
       a uoa = a.o(og.a());
       d uod = new d(uoa);
       uod.c(this.g);
       a.f(uoa);
       og.close();
       return uod;
    }
    public void d(){
       d.b(this.g);
       super.d();
    }
    public void e(Exception p0){
       d.b(this.g);
       super.e(p0);
    }
    public void f(Object p0){
       d.b(this.g);
       super.f(p0);
    }
}
