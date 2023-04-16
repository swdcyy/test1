package com.google.common.reflect.c$e;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.reflect.Type;
import ok.n;
import java.lang.Class;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.GenericArrayType;
import com.google.common.reflect.Types;
import java.lang.reflect.ParameterizedType;
import com.google.common.reflect.e;
import java.lang.reflect.WildcardType;
import java.lang.AssertionError;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.common.base.a;
import java.lang.reflect.GenericDeclaration;

public class c$e	// class@00191c
{
    public final AtomicInteger a;

    public void c$e(){
       super(new AtomicInteger());
    }
    public void c$e(AtomicInteger p0){
       super();
       this.a = p0;
    }
    public final Type a(Type p0){
       TypeVariable typeVariable;
       n.j(p0);
       if (p0 instanceof Class) {
          return p0;
       }
       if (p0 instanceof TypeVariable) {
          return p0;
       }
       if (p0 instanceof GenericArrayType) {
          return Types.d(this.c().a(p0.getGenericComponentType()));
       }
       if (p0 instanceof ParameterizedType) {
          Class rawType = p0.getRawType();
          TypeVariable[] typeParamete = rawType.getTypeParameters();
          Type[] actualTypeAr = p0.getActualTypeArguments();
          for (int i = 0; i < actualTypeAr.length; i = i + 1) {
             actualTypeAr[i] = new e(this, this.a, typeParamete[i]).a(actualTypeAr[i]);
          }
          c$e uoe = this.c();
          p0 = p0.getOwnerType();
          p0 = (p0 == null)? null: uoe.a(p0);
          return Types.g(p0, rawType, actualTypeAr);
       }else if(p0 instanceof WildcardType){
          WildcardType wildcardType = p0;
          if (!wildcardType.getLowerBounds().length) {
             typeVariable = this.b(wildcardType.getUpperBounds());
          }
          return typeVariable;
       }else {
          throw new AssertionError("must have been one of the known types");
       }
    }
    public TypeVariable b(Type[] p0){
       return Types.e(c$e.class, "capture#"+this.a.incrementAndGet()+"-of ? extends "+a.f('&').e(p0), p0);
    }
    public final c$e c(){
       return new c$e(this.a);
    }
}
