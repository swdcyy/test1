package com.facebook.drawee.controller.AbstractDraweeControllerBuilder$b;
import ab.h;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import java.lang.String;
import java.lang.Object;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder$CacheLevel;
import kb.c;
import ab.d$b;
import ab.d;

public class AbstractDraweeControllerBuilder$b implements h	// class@001088
{
    public final a a;
    public final String b;
    public final Object c;
    public final Object d;
    public final AbstractDraweeControllerBuilder$CacheLevel e;
    public final AbstractDraweeControllerBuilder f;

    public void AbstractDraweeControllerBuilder$b(AbstractDraweeControllerBuilder p0,a p1,String p2,Object p3,Object p4,AbstractDraweeControllerBuilder$CacheLevel p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public Object get(){
       return this.f.g(this.a, this.b, this.c, this.d, this.e);
    }
    public String toString(){
       d$b uob = d.c(this);
       uob.b("request", this.c.toString());
       return uob.toString();
    }
}
