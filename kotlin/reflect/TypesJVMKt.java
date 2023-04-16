package kotlin.reflect.TypesJVMKt;
import vsd.r;
import java.lang.reflect.Type;
import vsd.g;
import vsd.s;
import vsd.x;
import vsd.d;
import java.lang.Class;
import lsd.a;
import java.util.List;
import java.lang.Object;
import kotlin.collections.CollectionsKt___CollectionsKt;
import vsd.t;
import kotlin.reflect.KVariance;
import vsd.y;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.a;
import vsd.a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Collection;
import kotlin.reflect.ParameterizedTypeImpl;
import java.lang.reflect.TypeVariable;
import nsd.f0;
import vsd.z;
import vsd.z$a;
import kotlin.reflect.TypesJVMKt$typeToString$unwrap$1;
import msd.l;
import wsd.m;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.lang.CharSequence;
import zsd.u;

public final class TypesJVMKt	// class@0018b9
{

    public static final Type a(r p0,boolean p1){
       Type type;
       g og = p0.s();
       if (og instanceof s) {
          return new x(og);
       }
       if (!og instanceof d) {
          throw new UnsupportedOperationException("Unsupported type classifier: "+p0);
       }
       Class uClass = (p1)? a.e(og): a.c(og);
       List list = p0.z0();
       if (list.isEmpty()) {
          return uClass;
       }else if(uClass.isArray()){
          if (uClass.getComponentType().isPrimitive()) {
             return uClass;
          }else {
             t ot = CollectionsKt___CollectionsKt.V4(list);
             if (ot != null) {
                KVariance kVariance = ot.a();
                r or = ot.b();
                if (kVariance != null) {
                   int i = y.a[kVariance.ordinal()];
                   if (i != 1) {
                      if (i == 2 || i == 3) {
                         a.m(or);
                         type = TypesJVMKt.b(or, false, 1, null);
                         if (!type instanceof Class) {
                            uClass = new a(type);
                         }
                      }else {
                         throw new NoWhenBranchMatchedException();
                      }
                   }
                }
                return uClass;
             }else {
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: "+p0);
             }
          }
       }else {
          return TypesJVMKt.c(uClass, list);
       }
    }
    public static Type b(r p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       return TypesJVMKt.a(p0, p1);
    }
    public static final Type c(Class p0,List p1){
       ArrayList uArrayList;
       Iterator iterator;
       Class declaringCla = p0.getDeclaringClass();
       int i = 10;
       if (declaringCla != null) {
          if (Modifier.isStatic(p0.getModifiers())) {
             uArrayList = new ArrayList(u.Y(p1, i));
             iterator = p1.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(TypesJVMKt.e(iterator.next()));
             }
             return new ParameterizedTypeImpl(p0, declaringCla, uArrayList);
          }else {
             int len = p0.getTypeParameters().length;
             Type type = TypesJVMKt.c(declaringCla, p1.subList(len, p1.size()));
             p1 = p1.subList(0, len);
             uArrayList = new ArrayList(u.Y(p1, i));
             iterator = p1.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(TypesJVMKt.e(iterator.next()));
             }
             return new ParameterizedTypeImpl(p0, type, uArrayList);
          }
       }else {
          uArrayList = new ArrayList(u.Y(p1, i));
          iterator = p1.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(TypesJVMKt.e(iterator.next()));
          }
          return new ParameterizedTypeImpl(p0, null, uArrayList);
       }
    }
    public static final Type d(r p0){
       a.p(p0, "$this$javaType");
       if (p0 instanceof f0) {
          Type type = p0.n();
          if (type != null) {
             return type;
          }
       }
       return TypesJVMKt.b(p0, false, 1, null);
    }
    public static final Type e(t p0){
       z oz;
       KVariance kVariance = p0.h();
       if (kVariance == null) {
          return z.e.a();
       }
       r or = p0.g();
       a.m(or);
       int i = y.b[kVariance.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                oz = new z(TypesJVMKt.a(or, true), null);
             }else {
                throw new NoWhenBranchMatchedException();
             }
          }else {
             oz = new z(null, TypesJVMKt.a(or, true));
          }
       }else {
          oz = TypesJVMKt.a(or, true);
       }
       return oz;
    }
    public static void f(r p0){
    }
    public static void g(t p0){
    }
    public static final String h(Type p0){
       String str;
       if (p0 instanceof Class) {
          Class uClass = p0;
          if (uClass.isArray()) {
             m om = SequencesKt__SequencesKt.o(p0, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
             str = SequencesKt___SequencesKt.W0(om).getName()+u.c2("[]", SequencesKt___SequencesKt.Z(om));
          }else {
             str = uClass.getName();
          }
          a.o(str, "if \(type.isArray\) {\n    бн\n        } else type.name");
       }else {
          str = p0.toString();
       }
       return str;
    }
}
