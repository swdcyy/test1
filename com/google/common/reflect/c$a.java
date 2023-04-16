package com.google.common.reflect.c$a;
import wk.d;
import java.util.Map;
import java.lang.reflect.Type;
import java.lang.Class;
import java.lang.reflect.WildcardType;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import java.lang.reflect.GenericArrayType;
import com.google.common.reflect.Types;
import ok.n;
import com.google.common.reflect.c;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import com.google.common.reflect.c$d;

public final class c$a extends d	// class@001918
{
    public final Map b;
    public final Type c;

    public void c$a(Map p0,Type p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void b(Class p0){
       if (this.c instanceof WildcardType) {
          return;
       }
       throw new IllegalArgumentException("No type mapping from "+p0+" to "+this.c);
    }
    public void c(GenericArrayType p0){
       c$a tc = this.c;
       if (tc instanceof WildcardType) {
          return;
       }
       Type type = Types.c(tc);
       boolean b = (type != null)? true: false;
       n.g(b, "%s is not an array type.", this.c);
       c.a(this.b, p0.getGenericComponentType(), type);
       return;
    }
    public void d(ParameterizedType p0){
       c$a tc = this.c;
       if (tc instanceof WildcardType) {
          return;
       }
       ParameterizedType parameterize = ParameterizedType.class;
       try{
          ParameterizedType parameterize1 = parameterize.cast(tc);
          if (p0.getOwnerType() != null && parameterize1.getOwnerType() != null) {
             c.a(this.b, p0.getOwnerType(), parameterize1.getOwnerType());
          }
          n.h(p0.getRawType().equals(parameterize1.getRawType()), "Inconsistent raw type: %s vs. %s", p0, this.c);
          Type[] actualTypeAr = p0.getActualTypeArguments();
          Type[] actualTypeAr1 = parameterize1.getActualTypeArguments();
          int i = 0;
          boolean b = (actualTypeAr.length == actualTypeAr1.length)? true: false;
          n.h(b, "%s not compatible with %s", p0, parameterize1);
          for (; i < actualTypeAr.length; i = i + 1) {
             c.a(this.b, actualTypeAr[i], actualTypeAr1[i]);
          }
          return;
       }catch(java.lang.ClassCastException e0){
          throw new IllegalArgumentException(e0+" is not a "+p0.getOwnerType().getSimpleName());
       }
    }
    public void e(TypeVariable p0){
       this.b.put(new c$d(p0), this.c);
    }
    public void f(WildcardType p0){
       c$a tc = this.c;
       if (!tc instanceof WildcardType) {
          return;
       }
       Type[] upperBounds = p0.getUpperBounds();
       Type[] upperBounds1 = tc.getUpperBounds();
       Type[] lowerBounds = p0.getLowerBounds();
       Type[] lowerBounds1 = tc.getLowerBounds();
       int i = 0;
       boolean b = (upperBounds.length == upperBounds1.length && lowerBounds.length == lowerBounds1.length)? true: false;
       n.h(b, "Incompatible type: %s vs. %s", p0, this.c);
       for (int i1 = 0; i1 < upperBounds.length; i1++) {
          c.a(this.b, upperBounds[i1], upperBounds1[i1]);
       }
       for (; i < lowerBounds.length; i = i + 1) {
          c.a(this.b, lowerBounds[i], lowerBounds1[i]);
       }
       return;
    }
}
