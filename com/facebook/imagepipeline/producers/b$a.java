package com.facebook.imagepipeline.producers.b$a;
import com.facebook.imagepipeline.producers.b$c;
import com.facebook.imagepipeline.producers.b;
import id.i;
import id.c0;
import bd.d;
import bd.h;
import bd.g;
import id.b;

public class b$a extends b$c	// class@001129
{
    public final b j;

    public void b$a(b p0,i p1,c0 p2,boolean p3,int p4){
       this.j = p0;
       super(p0, p1, p2, p3, p4);
    }
    public int p(d p0){
       return p0.p();
    }
    public h q(){
       return g.c(0, 0, 0);
    }
    public synchronized boolean x(d p0,int p1){
       if (b.f(p1)) {
          return false;
       }
       return super.x(p0, p1);
    }
}
