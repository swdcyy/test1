package com.google.android.material.circularreveal.c$b;
import android.animation.TypeEvaluator;
import java.lang.Object;
import com.google.android.material.circularreveal.c$e;
import com.google.android.material.circularreveal.c$a;
import dk.a;

public class c$b implements TypeEvaluator	// class@001682
{
    public final c$e a;
    public static final TypeEvaluator b;

    static {
       c$b.b = new c$b();
    }
    public void c$b(){
       super();
       this.a = new c$e(null);
    }
    public c$e a(float p0,c$e p1,c$e p2){
       this.a.b(a.d(p1.a, p2.a, p0), a.d(p1.b, p2.b, p0), a.d(p1.c, p2.c, p0));
       return this.a;
    }
    public Object evaluate(float p0,Object p1,Object p2){
       return this.a(p0, p1, p2);
    }
}
