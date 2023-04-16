package com.google.gson.internal.e;
import com.google.gson.internal.f;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.Object;

public class e extends f	// class@00195a
{
    public final Method a;

    public void e(Method p0){
       this.a = p0;
       super();
    }
    public Object b(Class p0){
       f.a(p0);
       Object[] objArray = new Object[]{p0,Object.class};
       return this.a.invoke(null, objArray);
    }
}
