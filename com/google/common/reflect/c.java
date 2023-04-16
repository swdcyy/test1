package com.google.common.reflect.c;
import java.lang.Object;
import com.google.common.reflect.c$c;
import com.google.common.reflect.c$a;
import java.util.Map;
import java.lang.reflect.Type;
import wk.d;
import ok.n;
import java.lang.reflect.TypeVariable;
import java.util.Objects;
import com.google.common.reflect.d;
import java.lang.reflect.ParameterizedType;
import java.lang.Class;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import com.google.common.reflect.Types$WildcardTypeImpl;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.common.reflect.c$d;
import java.lang.String;

public final class c	// class@00191d
{
    public final c$c a;

    public void c(){
       super();
       this.a = new c$c();
    }
    public void c(c$c p0){
       super();
       this.a = p0;
    }
    public void c(c$c p0,c$a p1){
       super(p0);
    }
    public static void a(Map p0,Type p1,Type p2){
       if (p1.equals(p2)) {
          return;
       }
       Type[] typeArray = new Type[]{p1};
       new c$a(p0, p2).a(typeArray);
       return;
    }
    public Type b(Type p0){
       n.j(p0);
       if (p0 instanceof TypeVariable) {
          c ta = this.a;
          Objects.requireNonNull(ta);
          return ta.a(p0, new d(ta, p0, ta));
       }else if(p0 instanceof ParameterizedType){
          Type ownerType = p0.getOwnerType();
          ownerType = (ownerType == null)? null: this.b(ownerType);
          return Types.g(ownerType, this.b(p0.getRawType()), this.c(p0.getActualTypeArguments()));
       }else if(p0 instanceof GenericArrayType){
          return Types.d(this.b(p0.getGenericComponentType()));
       }else if(p0 instanceof WildcardType){
          return new Types$WildcardTypeImpl(this.c(p0.getLowerBounds()), this.c(p0.getUpperBounds()));
       }else {
          return p0;
       }
    }
    public Type[] c(Type[] p0){
       Type[] typeArray = new Type[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          typeArray[i] = this.b(p0[i]);
       }
       return typeArray;
    }
    public c d(Map p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       ImmutableMap$b uob = ImmutableMap.builder();
       uob.f(ta.a);
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          c$d key = uEntry.getKey();
          Type value = uEntry.getValue();
          int i = key.a(value) ^ 0x01;
          n.g(i, "Type variable %s bound to itself", key);
          uob.c(key, value);
       }
       return new c(new c$c(uob.a()));
    }
}
