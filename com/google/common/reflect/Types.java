package com.google.common.reflect.Types;
import com.google.common.reflect.Types$a;
import java.lang.String;
import com.google.common.base.a;
import java.lang.reflect.Type;
import java.lang.Class;
import java.lang.Object;
import ok.n;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;
import com.google.common.reflect.Types$b;
import wk.d;
import java.lang.reflect.WildcardType;
import com.google.common.reflect.Types$WildcardTypeImpl;
import com.google.common.reflect.Types$JavaVersion;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;
import com.google.common.reflect.Types$d;
import com.google.common.reflect.Types$e;
import java.lang.reflect.InvocationHandler;
import wk.a;
import java.lang.reflect.ParameterizedType;
import com.google.common.reflect.Types$ParameterizedTypeImpl;
import com.google.common.reflect.Types$ClassOwnership;
import java.util.Collection;

public final class Types	// class@001913
{
    public static final h a;
    public static final a b;

    static {
       Types.a = new Types$a();
       Types.b = a.g(", ").j("null");
    }
    public static void a(Type[] p0,String p1){
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject instanceof Class) {
             int i1 = oobject.isPrimitive() ^ 0x01;
             n.h(i1, "Primitive type \'%s\' used as %s", oobject, p1);
          }
          i = i + 1;
       }
       return;
    }
    public static Class b(Class p0){
       return Array.newInstance(p0, 0).getClass();
    }
    public static Type c(Type p0){
       n.j(p0);
       AtomicReference uAtomicRefer = new AtomicReference();
       Type[] typeArray = new Type[]{p0};
       new Types$b(uAtomicRefer).a(typeArray);
       return uAtomicRefer.get();
    }
    public static Type d(Type p0){
       Type[] typeArray1;
       if (!p0 instanceof WildcardType) {
          return Types$JavaVersion.CURRENT.newArrayType(p0);
       }
       Type[] lowerBounds = p0.getLowerBounds();
       int i = 1;
       boolean b = (lowerBounds.length <= i)? true: false;
       n.c(b, "Wildcard cannot have more than one lower bounds.");
       if (lowerBounds.length == i) {
          Type[] typeArray = new Type[i];
          typeArray[0] = Types.d(lowerBounds[0]);
          typeArray1 = new Type[i];
          typeArray1[0] = Object.class;
          return new Types$WildcardTypeImpl(typeArray, typeArray1);
       }else {
          typeArray1 = p0.getUpperBounds();
          if (typeArray1.length != i) {
             i = false;
          }
          n.c(i, "Wildcard should have only one upper bound.");
          return Types.h(Types.d(typeArray1[0]));
       }
    }
    public static TypeVariable e(GenericDeclaration p0,String p1,Type[] p2){
       if (!p2.length) {
          p2 = new Type[]{Object.class};
       }
       return a.a(TypeVariable.class, new Types$e(new Types$d(p0, p1, p2)));
    }
    public static ParameterizedType f(Class p0,Type[] p1){
       return new Types$ParameterizedTypeImpl(Types$ClassOwnership.JVM_BEHAVIOR.getOwnerType(p0), p0, p1);
    }
    public static ParameterizedType g(Type p0,Class p1,Type[] p2){
       if (p0 == null) {
          return Types.f(p1, p2);
       }
       n.j(p2);
       boolean b = (p1.getEnclosingClass() != null)? true: false;
       n.g(b, "Owner type for unenclosed %s", p1);
       return new Types$ParameterizedTypeImpl(p0, p1, p2);
    }
    public static WildcardType h(Type p0){
       Type[] typeArray = new Type[0];
       Type[] typeArray1 = new Type[]{p0};
       return new Types$WildcardTypeImpl(typeArray, typeArray1);
    }
    public static Type i(Type[] p0){
       Type type;
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          type = Types.c(p0[i]);
          if (type != null) {
             if (type instanceof Class) {
                Type type1 = type;
                if (type1.isPrimitive()) {
                   return type1;
                }
             }
             break ;
          }else {
             i = i + 1;
          }
       }
       return Types.h(type);
    }
    public static Type[] j(Collection p0){
       Type[] typeArray = new Type[p0.size()];
       return p0.toArray(typeArray);
    }
    public static String k(Type p0){
       String name = (p0 instanceof Class)? p0.getName(): p0.toString();
       return name;
    }
}
