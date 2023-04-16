package com.kwai.robust.Reflect$a;
import java.lang.reflect.InvocationHandler;
import com.kwai.robust.Reflect;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.String;
import java.lang.Class;
import java.util.Map;

public class Reflect$a implements InvocationHandler	// class@0013fe
{
    public final boolean b;
    public final Reflect c;

    public void Reflect$a(Reflect p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       p0 = p1.getName();
       try{
          Reflect$a tc = this.c;
          return Reflect.on(tc.type, tc.object).call(p0, p2).get();
       }catch(com.kwai.robust.Reflect$ReflectException e7){
          if (this.b != null) {
             Reflect object = this.c.object;
             String str = (p2 == null)? null: p2.length;
             if (!str && p0.startsWith("get")) {
                return object.get(Reflect.property(p0.substring(3)));
             }else if(!str && p0.startsWith("is")){
                return object.get(Reflect.property(p0.substring(2)));
             }else if(str == 1 && p0.startsWith("set")){
                object.put(Reflect.property(p0.substring(3)), p2[0]);
                return null;
             }
          }
       label_0072 :
          throw e7;
       }
    }
}
