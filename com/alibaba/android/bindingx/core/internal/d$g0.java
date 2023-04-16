package com.alibaba.android.bindingx.core.internal.d$g0;
import android.view.animation.Interpolator;
import java.lang.Object;
import c2.a;

public class d$g0 implements Interpolator	// class@000e08
{
    public float a;
    public float b;
    public float c;
    public float d;
    public Interpolator e;

    public void d$g0(float p0,float p1,float p2,float p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = a.b(p0, p1, p2, p3);
    }
    public float getInterpolation(float p0){
       return this.e.getInterpolation(p0);
    }
}
