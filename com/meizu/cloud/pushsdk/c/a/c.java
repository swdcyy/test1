package com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.c.b.a;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.c.k;

public class c	// class@0014c0
{
    public final Object a;
    public final a b;
    public k c;

    public void c(a p0){
       super();
       this.a = null;
       this.b = p0;
    }
    public void c(Object p0){
       super();
       this.a = p0;
       this.b = null;
    }
    public static c a(a p0){
       return new c(p0);
    }
    public static c a(Object p0){
       return new c(p0);
    }
    public Object a(){
       return this.a;
    }
    public void a(k p0){
       this.c = p0;
    }
    public boolean b(){
       boolean b = (this.b == null)? true: false;
       return b;
    }
    public a c(){
       return this.b;
    }
}
