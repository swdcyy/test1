package com.google.gson.internal.$Gson$Types;
import java.lang.reflect.Type;
import java.lang.reflect.GenericArrayType;
import com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl;
import java.lang.Class;
import java.lang.reflect.ParameterizedType;
import com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl;
import java.lang.reflect.WildcardType;
import com.google.gson.internal.$Gson$Types$WildcardTypeImpl;
import bl.a;
import java.lang.Object;
import java.util.Arrays;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.GenericDeclaration;
import java.lang.String;
import java.util.Collection;
import java.lang.reflect.Array;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.HashSet;
import java.util.NoSuchElementException;

public final class $Gson$Types	// class@000565
{
    public static final Type[] a;

    static {
       Type[] typeArray = new Type[0];
       $Gson$Types.a = typeArray;
    }
    public static GenericArrayType a(Type p0){
       return new $Gson$Types$GenericArrayTypeImpl(p0);
    }
    public static Type b(Type p0){
       $Gson$Types$GenericArrayTypeImpl $Gson$Types$;
       if (p0 instanceof Class) {
          if (p0.isArray()) {
             $Gson$Types$ = new $Gson$Types$GenericArrayTypeImpl($Gson$Types.b(p0.getComponentType()));
          }
          return $Gson$Types$;
       }else if(p0 instanceof ParameterizedType){
          return new $Gson$Types$ParameterizedTypeImpl(p0.getOwnerType(), p0.getRawType(), p0.getActualTypeArguments());
       }else if(p0 instanceof GenericArrayType){
          return new $Gson$Types$GenericArrayTypeImpl(p0.getGenericComponentType());
       }else if(p0 instanceof WildcardType){
          return new $Gson$Types$WildcardTypeImpl(p0.getUpperBounds(), p0.getLowerBounds());
       }else {
          return p0;
       }
    }
    public static void c(Type p0){
       boolean b = (!p0 instanceof Class || !p0.isPrimitive())? true: false;
       a.a(b);
       return;
    }
    public static boolean d(Type p0,Type p1){
       boolean b = true;
       if (p0 == p1) {
          return b;
       }
       if (p0 instanceof Class) {
          return p0.equals(p1);
       }
       if (p0 instanceof ParameterizedType) {
          if (!p1 instanceof ParameterizedType) {
             return false;
          }else {
             Type ownerType = p0.getOwnerType();
             Type ownerType1 = p1.getOwnerType();
             ownerType = (ownerType == ownerType1 || (ownerType != null && ownerType.equals(ownerType1)))? 1: null;
             if (!ownerType || (!p0.getRawType().equals(p1.getRawType()) || !Arrays.equals(p0.getActualTypeArguments(), p1.getActualTypeArguments()))) {
                b = false;
             }
             return b;
          }
       }else if(p0 instanceof GenericArrayType){
          if (!p1 instanceof GenericArrayType) {
             return false;
          }else {
             return $Gson$Types.d(p0.getGenericComponentType(), p1.getGenericComponentType());
          }
       }else if(p0 instanceof WildcardType){
          if (!p1 instanceof WildcardType) {
             return false;
          }else if(Arrays.equals(p0.getUpperBounds(), p1.getUpperBounds()) && Arrays.equals(p0.getLowerBounds(), p1.getLowerBounds())){
             b = false;
          }
          return b;
       }else if(p0 instanceof TypeVariable){
          if (!p1 instanceof TypeVariable) {
             return false;
          }
          if (p0.getGenericDeclaration() != p1.getGenericDeclaration() || !(p0.getName()).equals(p1.getName())) {
             b = false;
          }
          return b;
       }else {
          return false;
       }
    }
    public static Type e(Type p0,Class p1){
       object oobject;
       p0 = $Gson$Types.h(p0, p1, Collection.class);
       if (p0 instanceof WildcardType) {
          oobject = p0.getUpperBounds()[0];
       }
       if (oobject instanceof ParameterizedType) {
          return oobject.getActualTypeArguments()[0];
       }else {
          return Object.class;
       }
    }
    public static Type f(Type p0,Class p1,Class p2){
       if (p2 == p1) {
          return p0;
       }
       if (p2.isInterface()) {
          Class[] interfaces = p1.getInterfaces();
          int i = 0;
          int len = interfaces.length;
          while (true) {
             if (i < len) {
                if (interfaces[i] == p2) {
                   return p1.getGenericInterfaces()[i];
                }else if(p2.isAssignableFrom(interfaces[i])){
                   return $Gson$Types.f(p1.getGenericInterfaces()[i], interfaces[i], p2);
                }else {
                   i = i + 1;
                }
             }
          }
       }
       if (!p1.isInterface()) {
          while (p1 != Object.class) {
             Class superclass = p1.getSuperclass();
             if (superclass == p2) {
                return p1.getGenericSuperclass();
             }else if(p2.isAssignableFrom(superclass)){
                return $Gson$Types.f(p1.getGenericSuperclass(), superclass, p2);
             }
             p1 = superclass;
          }
       }
       return p2;
    }
    public static Class g(Type p0){
       if (p0 instanceof Class) {
          return p0;
       }
       if (p0 instanceof ParameterizedType) {
          p0 = p0.getRawType();
          a.a(p0 instanceof Class);
          return p0;
       }else {
          int i = 0;
          if (p0 instanceof GenericArrayType) {
             return Array.newInstance($Gson$Types.g(p0.getGenericComponentType()), i).getClass();
          }
          if (p0 instanceof TypeVariable) {
             return Object.class;
          }
          if (p0 instanceof WildcardType) {
             return $Gson$Types.g(p0.getUpperBounds()[i]);
          }
          String str = (p0 == null)? "null": p0.getClass().getName();
          throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <"+p0+"> is of type "+str);
       }
    }
    public static Type h(Type p0,Class p1,Class p2){
       object oobject;
       if (p0 instanceof WildcardType) {
          oobject = p0.getUpperBounds()[0];
       }
       a.a(p2.isAssignableFrom(p1));
       return $Gson$Types.j(oobject, p1, $Gson$Types.f(oobject, p1, p2));
    }
    public static ParameterizedType i(Type p0,Type p1,Type[] p2){
       return new $Gson$Types$ParameterizedTypeImpl(p0, p1, p2);
    }
    public static Type j(Type p0,Class p1,Type p2){
       return $Gson$Types.k(p0, p1, p2, new HashSet());
    }
    public static Type k(Type p0,Class p1,Type p2,Collection p3){
       GenericArrayType obj;
       object oobject;
       Type genericCompo;
       Type[] obj1;
       Type[] lowerBounds;
       Type[] typeArray1;
       while (true) {
          int i = 0;
          if (p2 instanceof TypeVariable) {
             obj = p2;
             if (p3.contains(obj)) {
                return p2;
             }else {
                p3.add(obj);
                GenericDeclaration genericDecla = obj.getGenericDeclaration();
                if (genericDecla instanceof Class) {
                }else {
                   genericDecla = null;
                }
                if (genericDecla != null) {
                   Type type = $Gson$Types.f(p0, p1, genericDecla);
                   if (type instanceof ParameterizedType) {
                      TypeVariable[] typeParamete = genericDecla.getTypeParameters();
                      int len = typeParamete.length;
                      while (true) {
                         if (i >= len) {
                            throw new NoSuchElementException();
                         }
                         if (obj.equals(typeParamete[i])) {
                            oobject = type.getActualTypeArguments()[i];
                         label_004b :
                            if (oobject == obj) {
                               return oobject;
                            }
                            continue ;
                         }else {
                            i = i + 1;
                         }
                      }
                   }
                }
                oobject = obj;
                goto label_004b ;
             }
          }else if(p2 instanceof Class){
             obj = p2;
             if (obj.isArray()) {
                Class componentTyp = obj.getComponentType();
                p0 = $Gson$Types.k(p0, p1, componentTyp, p3);
                if (componentTyp != p0) {
                   obj = $Gson$Types.a(p0);
                   break ;
                }
                break ;
             }
          }
          if (p2 instanceof GenericArrayType) {
             genericCompo = p2.getGenericComponentType();
             p0 = $Gson$Types.k(p0, p1, genericCompo, p3);
             if (genericCompo != p0) {
                oobject = $Gson$Types.a(p0);
             }
             return p2;
          }else if(p2 instanceof ParameterizedType){
             genericCompo = p2.getOwnerType();
             Type type1 = $Gson$Types.k(p0, p1, genericCompo, p3);
             obj1 = (type1 != genericCompo)? 1: null;
             Type[] actualTypeAr = p2.getActualTypeArguments();
             int len1 = actualTypeAr.length;
             while (i < len1) {
                Type type2 = $Gson$Types.k(p0, p1, actualTypeAr[i], p3);
                if (type2 != actualTypeAr[i]) {
                   if (!obj1) {
                      actualTypeAr = actualTypeAr.clone();
                      obj1 = 1;
                   }
                   actualTypeAr[i] = type2;
                }
                i = i + 1;
             }
             if (obj1 != null) {
                oobject = $Gson$Types.i(type1, p2.getRawType(), actualTypeAr);
             }
             return oobject;
          }else if(p2 instanceof WildcardType){
             obj1 = p2.getLowerBounds();
             Type[] upperBounds = p2.getUpperBounds();
             if (obj1.length == 1) {
                p0 = $Gson$Types.k(p0, p1, obj1[i], p3);
                if (p0 != obj1[i]) {
                   if (p0 instanceof WildcardType) {
                      lowerBounds = p0.getLowerBounds();
                   }else {
                      typeArray1 = new Type[]{p0};
                      lowerBounds = typeArray1;
                   }
                   Type[] typeArray = new Type[]{Object.class};
                   return new $Gson$Types$WildcardTypeImpl(typeArray, lowerBounds);
                }
             }else if(upperBounds.length == 1){
                p0 = $Gson$Types.k(p0, p1, upperBounds[i], p3);
                if (p0 != upperBounds[i]) {
                   if (p0 instanceof WildcardType) {
                      lowerBounds = p0.getUpperBounds();
                   }else {
                      typeArray1 = new Type[]{p0};
                      lowerBounds = typeArray1;
                   }
                   return new $Gson$Types$WildcardTypeImpl(lowerBounds, $Gson$Types.a);
                }
             }
          }
          return p2;
       }
       return obj;
    }
    public static String l(Type p0){
       String name = (p0 instanceof Class)? p0.getName(): p0.toString();
       return name;
    }
}
