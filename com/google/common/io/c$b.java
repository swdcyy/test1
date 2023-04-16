package com.google.common.io.c$b;
import com.google.common.io.c$c;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Object;
import java.io.Closeable;
import com.google.common.io.c$a;

public final class c$b implements c$c	// class@0018e8
{
    public static final c$b a;
    public static final Method b;

    static {
       c$b.a = new c$b();
       Class[] uClassArray = new Class[]{Throwable.class};
       Method method = Throwable.class.getMethod("addSuppressed", uClassArray);
       c$b.b = method;
    }
    public void c$b(){
       super();
    }
    public void a(Closeable p0,Throwable p1,Throwable p2){
       if (p1 == p2) {
          return;
       }
       Object[] objArray = new Object[]{p2};
       c$b.b.invoke(p1, objArray);
       return;
    }
}
