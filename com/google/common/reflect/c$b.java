package com.google.common.reflect.c$b;
import wk.d;
import com.google.common.reflect.c$e;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;
import com.google.common.collect.Maps;
import java.lang.Class;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import ok.n;
import com.google.common.reflect.c$d;
import java.lang.Object;
import java.util.Map;
import java.lang.reflect.WildcardType;

public final class c$b extends d	// class@001919
{
    public final Map b;
    public static final c$e c;

    static {
       c$b.c = new c$e(new AtomicInteger());
    }
    public void c$b(){
       super();
       this.b = Maps.s();
    }
    public void b(Class p0){
       Type[] typeArray = new Type[]{p0.getGenericSuperclass()};
       this.a(typeArray);
       this.a(p0.getGenericInterfaces());
    }
    public void d(ParameterizedType p0){
       Class rawType = p0.getRawType();
       TypeVariable[] typeParamete = rawType.getTypeParameters();
       Type[] actualTypeAr = p0.getActualTypeArguments();
       int b = (typeParamete.length == actualTypeAr.length)? true: false;
       n.n(b);
       b = 0;
       while (b < typeParamete.length) {
          c$d uod = new c$d(typeParamete[b]);
          object oobject = actualTypeAr[b];
          if (!this.b.containsKey(uod)) {
             object oobject1 = oobject;
             while (true) {
                if (oobject1 != null) {
                   if (uod.a(oobject1)) {
                      while (oobject != null) {
                         oobject = this.b.remove(c$d.c(oobject));
                      }
                   }else {
                      oobject1 = this.b.get(c$d.c(oobject1));
                   }
                }else {
                   this.b.put(uod, oobject);
                }
             }
          }
          b = b + 1;
       }
       Type[] typeArray = new Type[]{rawType};
       this.a(typeArray);
       Type[] typeArray1 = new Type[]{p0.getOwnerType()};
       this.a(typeArray1);
       return;
    }
    public void e(TypeVariable p0){
       this.a(p0.getBounds());
    }
    public void f(WildcardType p0){
       this.a(p0.getUpperBounds());
    }
}
