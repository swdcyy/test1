package nsd.s$a;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.s;
import java.util.HashMap;
import java.lang.StringBuilder;
import java.lang.reflect.Method;
import kotlin.text.StringsKt__StringsKt;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Number;
import nsd.s0;
import vsd.d;
import lsd.a;

public final class s$a	// class@001f75
{

    public void s$a(){
       super();
    }
    public void s$a(u p0){
       super();
    }
    public final String a(Class p0){
       a.p(p0, "jClass");
       String str = null;
       if (p0.isAnonymousClass()) {
       }else if(p0.isLocalClass()){
          if (p0.isArray()) {
             p0 = p0.getComponentType();
             if (p0.isPrimitive()) {
                String str1 = s.f.get(p0.getName());
                if (str1 != null) {
                   str = str1+"Array";
                }
             }
             if (str == null) {
                str = "kotlin.Array";
             }
          }else {
             str = s.f.get(p0.getName());
             if (str == null) {
                str = p0.getCanonicalName();
             }
          }
       }
       return str;
    }
    public final String b(Class p0){
       a.p(p0, "jClass");
       String str = "Array";
       String str1 = null;
       if (p0.isAnonymousClass()) {
       label_000e :
          str = str1;
       }else if(p0.isLocalClass()){
          String simpleName = p0.getSimpleName();
          Method enclosingMet = p0.getEnclosingMethod();
          if (enclosingMet != null) {
             a.o(simpleName, "name");
             str = StringsKt__StringsKt.b5(simpleName, enclosingMet.getName()+"$", str1, 2, str1);
             if (str == null) {
             label_0043 :
                Constructor enclosingCon = p0.getEnclosingConstructor();
                if (enclosingCon != null) {
                   a.o(simpleName, "name");
                   str = StringsKt__StringsKt.b5(simpleName, enclosingCon.getName()+"$", str1, 2, str1);
                }else {
                   str = str1;
                }
             }
          }else {
             goto label_0043 ;
          }
          if (str == null) {
             a.o(simpleName, "name");
             str = StringsKt__StringsKt.a5(simpleName, '$', str1, 2, str1);
          }
       }else if(p0.isArray()){
          p0 = p0.getComponentType();
          if (p0.isPrimitive()) {
             String str2 = s.g.get(p0.getName());
             if (str2 != null) {
                str1 = str2+str;
             }
          }
          if (str1 != null) {
             goto label_000e ;
          }
       }else {
          str = s.g.get(p0.getName());
          if (str == null) {
             str = p0.getSimpleName();
          }
       }
       return str;
    }
    public final boolean c(Object p0,Class p1){
       a.p(p1, "jClass");
       Map c = s.c;
       Objects.requireNonNull(c, "null cannot be cast to non-null type kotlin.collections.Map<K, V>");
       Integer integer = c.get(p1);
       if (integer != null) {
          return s0.B(p0, integer.intValue());
       }
       if (p1.isPrimitive()) {
          p1 = a.e(a.g(p1));
       }
       return p1.isInstance(p0);
    }
}
