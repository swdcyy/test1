package com.facebook.imagepipeline.producers.j$a;
import id.i0;
import com.facebook.imagepipeline.producers.j;
import id.i;
import id.e0;
import id.c0;
import java.lang.String;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Object;
import bd.d;

public class j$a extends i0	// class@001137
{
    public final ImageRequest g;
    public final e0 h;
    public final c0 i;
    public final j j;

    public void j$a(j p0,i p1,e0 p2,c0 p3,String p4,ImageRequest p5,e0 p6,c0 p7){
       this.j = p0;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       super(p1, p2, p3, p4);
    }
    public void b(Object p0){
       d.b(p0);
    }
    public Object c(){
       d uod = this.j.c(this.g);
       if (uod == null) {
          this.h.onUltimateProducerReached(this.i, this.j.e(), false);
          this.i.o("local");
          uod = null;
       }else {
          uod.x();
          this.h.onUltimateProducerReached(this.i, this.j.e(), true);
          this.i.o("local");
       }
       return uod;
    }
}
