package fsd.l;
import fsd.k;
import hsd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.NullPointerException;
import java.lang.ClassLoader;
import java.lang.ClassCastException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import gsd.a;
import qrd.n;
import java.lang.System;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Integer;

public final class l	// class@000e68
{
    public static final k a;

    static {
       Throwable obj;
       Throwable obj1;
       Throwable throwable;
       k ok = k.class;
       int i = l.c();
       if (i >= 0x10008) {
          try{
             obj = a.class.newInstance();
             a.o(obj, "Class.forName\(\"kotlin.in¡­entations\"\).newInstance\(\)");
             if (obj != null) {
             }else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
             }
          }catch(java.lang.ClassNotFoundException e0){
             try{
                obj = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                a.o(obj, "Class.forName\(\"kotlin.in¡­entations\"\).newInstance\(\)");
                if (obj != null) {
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
             }catch(java.lang.ClassNotFoundException e0){
             }catch(java.lang.ClassCastException e8){
                obj = new ClassCastException("Instance classloader: "+obj.getClass().getClassLoader()+", base type classloader: "+e0.getClassLoader()).initCause(e8);
                a.o(obj, "ClassCastException\(\"Inst¡­baseTypeCL\"\).initCause\(e\)");
                throw obj;
             }
          }catch(java.lang.ClassCastException e8){
             obj = new ClassCastException("Instance classloader: "+obj.getClass().getClassLoader()+", base type classloader: "+ok.getClassLoader()).initCause(e8);
             a.o(obj, "ClassCastException\(\"Inst¡­baseTypeCL\"\).initCause\(e\)");
             throw obj;
          }
       }
    }
    public static final boolean a(int p0,int p1,int p2){
       return n.f.f(p0, p1, p2);
    }
    public static final Object b(Object p0){
       int i = 1;
       try{
          a.y(i, "T");
          return p0;
       }catch(java.lang.ClassCastException e1){
          a.y(4, v0);
          p0 = new ClassCastException("Instance classloader: "+p0.getClass().getClassLoader()+", base type classloader: "+Object.class.getClassLoader()).initCause(e1);
          a.o(p0, "ClassCastException\(\"Inst¡­baseTypeCL\"\).initCause\(e\)");
          throw p0;
       }
    }
    public static final int c(){
       String property = System.getProperty("java.specification.version");
       int i = 0x10006;
       if (property != null) {
          int i1 = StringsKt__StringsKt.h3(property, '.', 0, false, 6, null);
          if (i1 < 0) {
             try{
                i = Integer.parseInt(property) * 0x10000;
                return i;
             }catch(java.lang.NumberFormatException e0){
             }
          }else {
             int i2 = i1 + 1;
             int i3 = StringsKt__StringsKt.h3(property, '.', i2, false, 4, null);
             if (i3 < 0) {
                i3 = property.length();
             }
             String str = property.substring(0, i1);
             a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             property = property.substring(i2, i3);
             try{
                a.o(property, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                i = (Integer.parseInt(str) * 0x10000) + Integer.parseInt(property);
             }catch(java.lang.NumberFormatException e0){
             }
          }
       }
       return i;
    }
}
