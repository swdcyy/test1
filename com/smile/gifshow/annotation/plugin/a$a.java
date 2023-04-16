package com.smile.gifshow.annotation.plugin.a$a;
import java.lang.reflect.InvocationHandler;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Class;
import com.smile.gifshow.annotation.plugin.a;
import java.lang.Boolean;
import java.lang.String;
import p0.a;
import java.lang.annotation.Annotation;
import wk.a;
import java.lang.Integer;

public class a$a implements InvocationHandler	// class@000c43
{

    public void a$a(){
       super();
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       p0 = p1.getReturnType();
       int i = 0;
       if (a.b(p0) || a.a(p0)) {
          return Integer.valueOf(i);
       }
       String str = (p0 == Boolean.TYPE || p0 == Boolean.class)? 1: null;
       if (str) {
          return Boolean.FALSE;
       }else if(p0 == String.class){
          i = 1;
       }
       if (i) {
          return "";
       }else {
          Object obj = null;
          if (p0.isInterface() && p1.getAnnotation(a.class) != null) {
             obj = a.a(p0, this);
          }
          return obj;
       }
    }
}
