package com.facebook.imagepipeline.producers.b$b;
import com.facebook.imagepipeline.producers.b$c;
import com.facebook.imagepipeline.producers.b;
import id.i;
import id.c0;
import yc.e;
import yc.d;
import java.lang.Object;
import ab.e;
import bd.d;
import bd.h;
import id.b;
import com.facebook.imageformat.a;
import nc.a;

public class b$b extends b$c	// class@00112a
{
    public final e j;
    public final d k;
    public int l;
    public final b m;

    public void b$b(b p0,i p1,c0 p2,e p3,d p4,boolean p5,int p6){
       this.m = p0;
       super(p0, p1, p2, p5, p6);
       e.d(p3);
       this.j = p3;
       e.d(p4);
       this.k = p4;
       this.l = 0;
    }
    public int p(d p0){
       return this.j.f;
    }
    public h q(){
       return this.k.b(this.j.b());
    }
    public synchronized boolean x(d p0,int p1){
       boolean b = super.x(p0, p1);
       if (b.f(p1) || (b.m(p1, 8) && (!b.m(p1, 4) && (d.v(p0) && p0.j() == a.a)))) {
          if (!this.j.d(p0)) {
             return false;
          }else {
             int i = this.j.b();
             b$b tl = this.l;
             if (i <= tl) {
                return false;
             }else if(i < this.k.a(tl) && this.j.g == null){
                return false;
             }else {
                this.l = i;
             }
          }
       }
       return b;
    }
}
