package com.yxcorp.gifshow.widget.adv.c;
import java.lang.Cloneable;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class c implements Cloneable	// class@00191b
{
    public final Action$Type b;
    public final int c;
    public double d;
    public double e;
    public int f;
    public boolean g;
    public boolean h;

    public void c(){
       super();
       this.d = -10.00f;
       this.g = true;
       this.h = true;
       this.b = Action$Type.NONE;
       this.c = -1;
    }
    public void c(Action$Type p0,int p1,double p2,double p3){
       super();
       this.d = -10.00f;
       this.g = true;
       this.h = true;
       this.b = p0;
       this.c = -1;
       this.f = p1;
       this.d = p2;
       this.e = p3;
    }
    public void c(Action$Type p0,int p1,int p2,double p3,double p4){
       super();
       this.d = -10.00f;
       this.g = true;
       this.h = true;
       this.b = p0;
       this.c = p1;
       this.f = p2;
       this.d = p3;
       this.e = p4;
    }
    public double a(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return (this.c() + this.d());
    }
    public int b(){
       return this.c;
    }
    public double c(){
       return this.d;
    }
    public double d(){
       return this.e;
    }
    public Action$Type e(){
       return this.b;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof c) {
          return b;
       }
       if (this.b == p0.b && (this.h == p0.h && (this.g == p0.g && (this.f == p0.f && (!this.e - p0.e && !this.d - p0.d))))) {
          b = true;
       }
    label_0031 :
       return b;
    }
    public void f(boolean p0){
       this.h = p0;
    }
    public void g(double p0){
       this.d = p0;
    }
    public void h(double p0){
       this.e = p0;
    }
}
