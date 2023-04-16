package com.google.gson.internal.d;
import com.google.gson.internal.f;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.Object;
import java.lang.Integer;

public class d extends f	// class@001959
{
    public final Method a;
    public final int b;

    public void d(Method p0,int p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object b(Class p0){
       f.a(p0);
       Object[] objArray = new Object[]{p0,Integer.valueOf(this.b)};
       return this.a.invoke(null, objArray);
    }
}
