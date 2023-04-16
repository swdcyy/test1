package com.facebook.react.uimanager.m$k;
import java.lang.Object;
import com.facebook.react.uimanager.m$k$a;
import com.facebook.react.uimanager.m$k$b;
import af.a;
import java.lang.String;
import java.lang.reflect.Method;
import com.facebook.react.uimanager.m$a;
import af.b;
import java.lang.Integer;

public abstract class m$k	// class@001385
{
    public final String a;
    public final String b;
    public final Method c;
    public final Integer d;
    public static final Object[] e;
    public static final Object[] f;
    public static ThreadLocal g;
    public static ThreadLocal h;

    static {
       Object[] objArray = new Object[2];
       m$k.e = objArray;
       objArray = new Object[3];
       m$k.f = objArray;
       m$k.g = new m$k$a();
       m$k.h = new m$k$b();
    }
    public void m$k(a p0,String p1,Method p2,m$a p3){
       super();
       this.a = p0.name();
       if (("__default_type__").equals(p0.customType())) {
       }else {
          p1 = p0.customType();
       }
       this.b = p1;
       this.c = p2;
       this.d = null;
       return;
    }
    public void m$k(b p0,String p1,Method p2,int p3,m$a p4){
       super();
       this.a = p0.names()[p3];
       if (("__default_type__").equals(p0.customType())) {
       }else {
          p1 = p0.customType();
       }
       this.b = p1;
       this.c = p2;
       this.d = Integer.valueOf(p3);
       return;
    }
    public String a(){
       return this.a;
    }
    public String b(){
       return this.b;
    }
    public abstract Object c(Object p0);
}
