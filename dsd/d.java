package dsd.d;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.Object;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.a;
import java.lang.Class;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.lang.StackTraceElement;
import dsd.f;

public final class d	// class@0014e9
{

    public static final void a(int p0,int p1){
       if (p1 <= p0) {
          return;
       }
       throw new IllegalStateException("Debug metadata version mismatch. Expected: "+p0+", got "+p1+". Please update the Kotlin standard library.".toString());
    }
    public static final a b(BaseContinuationImpl p0){
       return p0.getClass().getAnnotation(a.class);
    }
    public static final int c(BaseContinuationImpl p0){
       int i;
       try{
          Field declaredFiel = p0.getClass().getDeclaredField("label");
          a.o(declaredFiel, "field");
          declaredFiel.setAccessible(true);
          p0 = declaredFiel.get(p0);
          if (!p0 instanceof Integer) {
             p0 = null;
          }
          i = (p0 != null)? p0.intValue(): 0;
          i = i - true;
       }catch(java.lang.Exception e0){
          i = -1;
       }
       return i;
    }
    public static final String[] d(BaseContinuationImpl p0){
       a.p(p0, "$this$getSpilledVariableFieldMapping");
       a uoa = d.b(p0);
       if (uoa == null) {
          return null;
       }
       d.a(1, uoa.v());
       ArrayList uArrayList = new ArrayList();
       int i = d.c(p0);
       int[] ointArray = uoa.i();
       int len = ointArray.length;
       int i1 = 0;
       while (i1 < len) {
          if (ointArray[i1] == i) {
             uArrayList.add(uoa.s()[i1]);
             uArrayList.add(uoa.n()[i1]);
          }
          i1 = i1 + 1;
       }
       String[] stringArray = new String[0];
       Object[] objArray = uArrayList.toArray(stringArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       return objArray;
    }
    public static final StackTraceElement e(BaseContinuationImpl p0){
       a.p(p0, "$this$getStackTraceElementImpl");
       a uoa = d.b(p0);
       if (uoa == null) {
          return null;
       }
       d.a(1, uoa.v());
       int i = d.c(p0);
       i = (i < 0)? -1: uoa.l()[i];
       String str = f.c.b(p0);
       str = (str == null)? uoa.c(): str+'/'+uoa.c();
       return new StackTraceElement(str, uoa.m(), uoa.f(), i);
    }
}
