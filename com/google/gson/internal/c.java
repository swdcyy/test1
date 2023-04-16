package com.google.gson.internal.c;
import com.google.gson.internal.f;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.Class;

public class c extends f	// class@0005b6
{
    public final Method a;
    public final Object b;

    public void c(Method p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object b(Class p0){
       f.a(p0);
       Object[] objArray = new Object[]{p0};
       return this.a.invoke(this.b, objArray);
    }
}
