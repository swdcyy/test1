package com.google.common.reflect.TypeToken;
import java.io.Serializable;
import wk.b;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.String;
import java.lang.Object;
import ok.n;
import java.lang.Class;
import com.google.common.reflect.TypeToken$a;
import com.google.common.reflect.TypeToken$e;
import com.google.common.reflect.Types$JavaVersion;
import com.google.common.reflect.TypeToken$SimpleTypeToken;
import com.google.common.reflect.Types;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$a;
import java.lang.reflect.Constructor;
import com.google.common.reflect.b;
import com.google.common.reflect.TypeToken$b;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.reflect.WildcardType;
import com.google.common.collect.ImmutableSet;
import qk.t0;
import java.util.Iterator;
import com.google.common.collect.ImmutableSet$a;
import com.google.common.reflect.TypeToken$d;
import wk.d;
import com.google.common.reflect.c;
import java.util.HashMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.lang.NullPointerException;
import com.google.common.reflect.TypeToken$TypeSet;
import java.lang.reflect.GenericArrayType;
import qk.p;
import java.lang.reflect.Method;
import com.google.common.reflect.TypeToken$c;
import com.google.common.reflect.c$b;
import com.google.common.reflect.c$e;
import com.google.common.collect.ImmutableMap;
import vk.b;
import java.util.Set;
import wk.c;
import com.google.common.reflect.c$d;

public abstract class TypeToken extends b implements Serializable	// class@0018fe
{
    public c b;
    public final Type runtimeType;

    public void TypeToken(){
       super();
       Type type = this.capture();
       this.runtimeType = type;
       n.r((type instanceof TypeVariable ^ 0x01), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>\(getClass\(\)\) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of\(\) instead.", type);
    }
    public void TypeToken(Class p0){
       super();
       Type type = super.capture();
       this.runtimeType = (type instanceof Class)? type: TypeToken.of(p0).resolveType(type).runtimeType;
       return;
    }
    public void TypeToken(Type p0){
       super();
       n.j(p0);
       this.runtimeType = p0;
    }
    public void TypeToken(Type p0,TypeToken$a p1){
       super(p0);
    }
    public static TypeToken$e a(Type[] p0){
       return new TypeToken$e(p0, true);
    }
    public static TypeToken$e d(Type[] p0){
       return new TypeToken$e(p0, false);
    }
    public static Type f(Type p0){
       return Types$JavaVersion.JAVA7.newArrayType(p0);
    }
    public static TypeToken of(Class p0){
       return new TypeToken$SimpleTypeToken(p0);
    }
    public static TypeToken of(Type p0){
       return new TypeToken$SimpleTypeToken(p0);
    }
    public static TypeToken toGenericType(Class p0){
       if (p0.isArray()) {
          return TypeToken.of(Types.d(TypeToken.toGenericType(p0.getComponentType()).runtimeType));
       }
       TypeVariable[] typeParamete = p0.getTypeParameters();
       TypeToken runtimeType = (p0.isMemberClass() && !Modifier.isStatic(p0.getModifiers()))? TypeToken.toGenericType(p0.getEnclosingClass()).runtimeType: null;
       if (typeParamete.length > 0 || (runtimeType != null && runtimeType != p0.getEnclosingClass())) {
          return TypeToken.of(Types.g(runtimeType, p0, typeParamete));
       }else {
          return TypeToken.of(p0);
       }
    }
    public final TypeToken b(Type p0){
       TypeToken typeToken = TypeToken.of(p0);
       if (typeToken.getRawType().isInterface()) {
          typeToken = null;
       }
       return typeToken;
    }
    public final ImmutableList c(Type[] p0){
       ImmutableList$a uoa = ImmutableList.builder();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          TypeToken typeToken = TypeToken.of(p0[i]);
          if (typeToken.getRawType().isInterface()) {
             uoa.h(typeToken);
          }
          i = i + 1;
       }
       return uoa.i();
    }
    public final b constructor(Constructor p0){
       boolean b = (p0.getDeclaringClass() == this.getRawType())? true: false;
       n.h(b, "%s not declared by %s", p0, this.getRawType());
       return new TypeToken$b(this, p0);
    }
    public final TypeToken e(Class p0,Type[] p1){
       TypeToken typeToken;
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             throw new IllegalArgumentException(p0+" isn\'t a super type of "+this);
          }
          typeToken = TypeToken.of(p1[i]);
          if (typeToken.isSubtypeOf(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return typeToken.getSupertype(p0);
    }
    public boolean equals(Object p0){
       if (p0 instanceof TypeToken) {
          return this.runtimeType.equals(p0.runtimeType);
       }
       return false;
    }
    public final TypeToken g(Type p0){
       TypeToken typeToken = this.resolveType(p0);
       typeToken.b = this.b;
       return typeToken;
    }
    public final TypeToken getComponentType(){
       Type type = Types.c(this.runtimeType);
       if (type == null) {
          return null;
       }
       return TypeToken.of(type);
    }
    public final ImmutableList getGenericInterfaces(){
       TypeToken truntimeType = this.runtimeType;
       if (truntimeType instanceof TypeVariable) {
          return this.c(truntimeType.getBounds());
       }
       if (truntimeType instanceof WildcardType) {
          return this.c(truntimeType.getUpperBounds());
       }
       ImmutableList$a uoa = ImmutableList.builder();
       Type[] genericInter = this.getRawType().getGenericInterfaces();
       int len = genericInter.length;
       for (int i = 0; i < len; i = i + 1) {
          uoa.h(this.g(genericInter[i]));
       }
       return uoa.i();
    }
    public final TypeToken getGenericSuperclass(){
       TypeToken truntimeType = this.runtimeType;
       if (truntimeType instanceof TypeVariable) {
          return this.b(truntimeType.getBounds()[0]);
       }
       if (truntimeType instanceof WildcardType) {
          return this.b(truntimeType.getUpperBounds()[0]);
       }
       Type genericSuper = this.getRawType().getGenericSuperclass();
       if (genericSuper == null) {
          return null;
       }
       return this.g(genericSuper);
    }
    public final Class getRawType(){
       return this.getRawTypes().iterator().next();
    }
    public ImmutableSet getRawTypes(){
       ImmutableSet$a uoa = ImmutableSet.builder();
       Type[] typeArray = new Type[]{this.runtimeType};
       new TypeToken$d(this, uoa).a(typeArray);
       return uoa.k();
    }
    public final TypeToken getSubtype(Class p0){
       Type type;
       n.g((this.runtimeType instanceof TypeVariable ^ 0x01), "Cannot get subtype of type variable <%s>", this);
       TypeToken truntimeType = this.runtimeType;
       if (truntimeType instanceof WildcardType) {
          Type[] lowerBounds = truntimeType.getLowerBounds();
          if (lowerBounds.length > 0) {
             return TypeToken.of(lowerBounds[0]).getSubtype(p0);
          }else {
             throw new IllegalArgumentException(p0+" isn\'t a subclass of "+this);
          }
       }else if(this.isArray()){
          return TypeToken.of(TypeToken.f(this.getComponentType().getSubtype(p0.getComponentType()).runtimeType));
       }else {
          n.h(this.getRawType().isAssignableFrom(p0), "%s isn\'t a subclass of %s", p0, this);
          if (!this.runtimeType instanceof Class || (p0.getTypeParameters().length && !this.getRawType().getTypeParameters().length)) {
             TypeToken typeToken = TypeToken.toGenericType(p0);
             truntimeType = typeToken.getSupertype(this.getRawType()).runtimeType;
             TypeToken truntimeType1 = this.runtimeType;
             HashMap hashMap = Maps.s();
             n.j(truntimeType);
             n.j(truntimeType1);
             c.a(hashMap, truntimeType, truntimeType1);
             type = new c().d(hashMap).b(typeToken.runtimeType);
          }
          return TypeToken.of(p0);
       }
    }
    public final TypeToken getSupertype(Class p0){
       n.h(this.h(p0), "%s is not a super class of %s", p0, this);
       TypeToken truntimeType = this.runtimeType;
       if (truntimeType instanceof TypeVariable) {
          return this.e(p0, truntimeType.getBounds());
       }
       if (truntimeType instanceof WildcardType) {
          return this.e(p0, truntimeType.getUpperBounds());
       }
       if (!p0.isArray()) {
          return this.g(TypeToken.toGenericType(p0).runtimeType);
       }
       truntimeType = this.getComponentType();
       if (truntimeType != null) {
          return TypeToken.of(TypeToken.f(truntimeType.getSupertype(p0.getComponentType()).runtimeType));
       }
       Object[] objArray = new Object[]{p0,this};
       throw new NullPointerException(n.s("%s isn\'t a super type of %s", objArray));
    }
    public final Type getType(){
       return this.runtimeType;
    }
    public final TypeToken$TypeSet getTypes(){
       return new TypeToken$TypeSet(this);
    }
    public final boolean h(Class p0){
       t0 ot0 = this.getRawTypes().iterator();
       while (true) {
          if (!ot0.hasNext()) {
             return false;
          }
          if (p0.isAssignableFrom(ot0.next())) {
             break ;
          }
       }
       return true;
    }
    public int hashCode(){
       return this.runtimeType.hashCode();
    }
    public final boolean isArray(){
       boolean b = (this.getComponentType() != null)? true: false;
       return b;
    }
    public final boolean isPrimitive(){
       TypeToken truntimeType = this.runtimeType;
       boolean b = (truntimeType instanceof Class && truntimeType.isPrimitive())? true: false;
       return b;
    }
    public final boolean isSubtypeOf(TypeToken p0){
       return this.isSubtypeOf(p0.getType());
    }
    public final boolean isSubtypeOf(Type p0){
       TypeToken typeToken;
       TypeToken runtimeType;
       Type ownerType;
       n.j(p0);
       if (p0 instanceof WildcardType) {
          return TypeToken.a(p0.getLowerBounds()).b(this.runtimeType);
       }
       TypeToken truntimeType = this.runtimeType;
       if (truntimeType instanceof WildcardType) {
          return TypeToken.a(truntimeType.getUpperBounds()).a(p0);
       }
       boolean b = true;
       boolean b1 = false;
       if (truntimeType instanceof TypeVariable) {
          if (!truntimeType.equals(p0) && !TypeToken.a(this.runtimeType.getBounds()).a(p0)) {
             b = false;
          }
          return b;
       }else if(truntimeType instanceof GenericArrayType){
          typeToken = TypeToken.of(p0);
          truntimeType = this.runtimeType;
          runtimeType = typeToken.runtimeType;
          if (runtimeType instanceof Class) {
             b1 = (!runtimeType.isArray())? runtimeType.isAssignableFrom(Object[].class): TypeToken.of(truntimeType.getGenericComponentType()).isSubtypeOf(runtimeType.getComponentType());
          }else if(runtimeType instanceof GenericArrayType){
             b1 = TypeToken.of(truntimeType.getGenericComponentType()).isSubtypeOf(typeToken.runtimeType.getGenericComponentType());
          }
          return b1;
       }else if(p0 instanceof Class){
          return this.h(p0);
       }else if(p0 instanceof ParameterizedType){
          Class rawType = TypeToken.of(p0).getRawType();
          if (this.h(rawType)) {
             TypeVariable[] typeParamete = rawType.getTypeParameters();
             Type[] actualTypeAr = p0.getActualTypeArguments();
             int i = 0;
             while (true) {
                if (i < typeParamete.length) {
                   TypeToken typeToken1 = this.resolveType(typeParamete[i]);
                   object oobject = actualTypeAr[i];
                   int i1 = (typeToken1.runtimeType.equals(oobject) || (oobject instanceof WildcardType && (TypeToken.d(oobject.getUpperBounds()).b(typeToken1.runtimeType) && TypeToken.d(oobject.getLowerBounds()).a(typeToken1.runtimeType))))? 1: 0;
                   if (i1) {
                      i = i + 1;
                   }
                }else if(!Modifier.isStatic(p0.getRawType().getModifiers()) && p0.getOwnerType() != null){
                   p0 = p0.getOwnerType();
                   Iterator iterator = this.getTypes().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         runtimeType = iterator.next().runtimeType;
                         if (runtimeType instanceof ParameterizedType) {
                            ownerType = runtimeType.getOwnerType();
                         }else if(runtimeType instanceof Class){
                            ownerType = runtimeType.getEnclosingClass();
                         }else {
                            ownerType = null;
                         }
                         if (ownerType != null && TypeToken.of(ownerType).isSubtypeOf(p0)) {
                            typeToken = 1;
                         }else {
                            continue ;
                         }
                      }else {
                         typeToken = 0;
                      }
                      if (!typeToken) {
                         b = 0;
                      }
                   }
                }
             label_0160 :
                b1 = b;
                break ;
             }
          }
          return b1;
       }else if(p0 instanceof GenericArrayType){
          if (truntimeType instanceof Class) {
             if (truntimeType.isArray()) {
                b1 = TypeToken.of(truntimeType.getComponentType()).isSubtypeOf(p0.getGenericComponentType());
             }
          }else if(truntimeType instanceof GenericArrayType){
             b1 = TypeToken.of(truntimeType.getGenericComponentType()).isSubtypeOf(p0.getGenericComponentType());
          }
       }
       return b1;
    }
    public final boolean isSupertypeOf(TypeToken p0){
       return p0.isSubtypeOf(this.getType());
    }
    public final boolean isSupertypeOf(Type p0){
       return TypeToken.of(p0).isSubtypeOf(this.getType());
    }
    public final b method(Method p0){
       n.h(this.h(p0.getDeclaringClass()), "%s not declared by %s", p0, this);
       return new TypeToken$a(this, p0);
    }
    public final TypeToken rejectTypeVariables(){
       Type[] typeArray = new Type[]{this.runtimeType};
       new TypeToken$c(this).a(typeArray);
       return this;
    }
    public Type[] resolveInPlace(Type[] p0){
       for (int i = 0; i < p0.length; i = i + 1) {
          p0[i] = this.resolveType(p0[i]).getType();
       }
       return p0;
    }
    public final TypeToken resolveType(Type p0){
       n.j(p0);
       TypeToken tb = this.b;
       if (tb == null) {
          c$b uob = new c$b();
          Type[] typeArray = new Type[]{c$b.c.a(this.runtimeType)};
          uob.a(typeArray);
          tb = new c().d(ImmutableMap.copyOf(uob.b));
          this.b = tb;
       }
       return TypeToken.of(tb.b(p0));
    }
    public String toString(){
       return Types.k(this.runtimeType);
    }
    public final TypeToken unwrap(){
       Map b = b.b;
       if (!b.keySet().contains(this.runtimeType)) {
          return this;
       }
       TypeToken truntimeType = this.runtimeType;
       n.j(truntimeType);
       Class uClass = b.get(truntimeType);
       if (uClass != null) {
          truntimeType = uClass;
       }
       return TypeToken.of(truntimeType);
    }
    public final TypeToken where(c p0,TypeToken p1){
       return new TypeToken$SimpleTypeToken(new c().d(ImmutableMap.of(new c$d(p0.a), p1.runtimeType)).b(this.runtimeType));
    }
    public final TypeToken where(c p0,Class p1){
       return this.where(p0, TypeToken.of(p1));
    }
    public final TypeToken wrap(){
       if (!this.isPrimitive()) {
          return this;
       }
       TypeToken truntimeType = this.runtimeType;
       n.j(truntimeType);
       Class uClass = b.a.get(truntimeType);
       if (uClass != null) {
          truntimeType = uClass;
       }
       return TypeToken.of(truntimeType);
    }
    public Object writeReplace(){
       return TypeToken.of(new c().b(this.runtimeType));
    }
}
