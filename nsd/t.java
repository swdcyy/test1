package nsd.t;
import java.lang.Object;
import java.util.Collection;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.OutOfMemoryError;
import java.util.Arrays;
import java.util.Objects;
import java.lang.Class;
import java.lang.reflect.Array;
import msd.a;
import msd.l;
import msd.p;
import java.lang.Integer;

public final class t	// class@001edd
{
    public static final Object[] a;

    static {
       Object[] objArray = new Object[0];
       t.a = objArray;
    }
    public static final Object[] a(Collection p0){
       Object[] a;
       a.p(p0, "collection");
       int i = p0.size();
       if (!i) {
       label_000b :
          a = t.a;
       }else {
          Iterator iterator = p0.iterator();
          if (!iterator.hasNext()) {
             goto label_000b ;
          }else {
             Object[] objArray = new Object[i];
             int i1 = 0;
             while (true) {
                int i2 = i1 + 1;
                objArray[i1] = iterator.next();
                if (i2 >= objArray.length) {
                   if (!iterator.hasNext()) {
                      a = objArray;
                      break ;
                   }else {
                      i1 = i2 * 3;
                      i1 = i1 + 1;
                      i1 = i1 >> 1;
                      Object obj = 0x7ffffffd;
                      if (i1 <= i2) {
                         if (i2 < obj) {
                            i1 = 0x7ffffffd;
                         }else {
                            throw new OutOfMemoryError();
                         }
                      }
                      objArray = Arrays.copyOf(objArray, i1);
                      a.o(objArray, "Arrays.copyOf\(result, newSize\)");
                   label_0060 :
                      i1 = i2;
                   }
                }else if(!iterator.hasNext()){
                   a = Arrays.copyOf(objArray, i2);
                   a.o(a, "Arrays.copyOf\(result, size\)");
                   break ;
                }else {
                   goto label_0060 ;
                }
             }
          }
       }
       return a;
    }
    public static final Object[] b(Collection p0,Object[] p1){
       Object[] objArray;
       a.p(p0, "collection");
       Objects.requireNonNull(p1);
       int i = p0.size();
       int i1 = 0;
       if (!i) {
          if (p1.length > 0) {
             p1[i1] = null;
          }
       }else {
          Iterator iterator = p0.iterator();
          if (!iterator.hasNext()) {
             if (p1.length > 0) {
                p1[i1] = null;
             }
          }else if(i <= p1.length){
             objArray = p1;
          }else {
             objArray = Array.newInstance(p1.getClass().getComponentType(), i);
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
          }
          while (true) {
             int i2 = i1 + 1;
             objArray[i1] = iterator.next();
             if (i2 >= objArray.length) {
                if (!iterator.hasNext()) {
                   p1 = objArray;
                   break ;
                }else {
                   i1 = i2 * 3;
                   i1 = i1 + 1;
                   i1 = i1 >> 1;
                   Object obj = 0x7ffffffd;
                   if (i1 <= i2) {
                      if (i2 < obj) {
                         i1 = 0x7ffffffd;
                      }else {
                         throw new OutOfMemoryError();
                      }
                   }
                   objArray = Arrays.copyOf(objArray, i1);
                   a.o(objArray, "Arrays.copyOf\(result, newSize\)");
                label_0088 :
                   i1 = i2;
                }
             }else if(!iterator.hasNext()){
                if (objArray == p1) {
                   p1[i2] = null;
                   break ;
                }else {
                   p1 = Arrays.copyOf(objArray, i2);
                   a.o(p1, "Arrays.copyOf\(result, size\)");
                   break ;
                }
             }else {
                goto label_0088 ;
             }
          }
       }
       return p1;
    }
    public static final Object[] c(Collection p0,a p1,l p2,p p3){
       int i = p0.size();
       if (!i) {
          return p1.invoke();
       }
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return p1.invoke();
       }
       Object[] objArray = p2.invoke(Integer.valueOf(i));
       int i1 = 0;
       while (true) {
          i = i1 + 1;
          objArray[i1] = iterator.next();
          if (i >= objArray.length) {
             if (!iterator.hasNext()) {
                break ;
             }else {
                i1 = i * 3;
                i1++;
                i1 = i1 >> 1;
                Object obj = 0x7ffffffd;
                if (i1 <= i) {
                   if (i < obj) {
                      i1 = 0x7ffffffd;
                   }else {
                      throw new OutOfMemoryError();
                   }
                }
                objArray = Arrays.copyOf(objArray, i1);
                a.o(objArray, "Arrays.copyOf\(result, newSize\)");
             label_006d :
                i1 = i;
             }
          }else if(!iterator.hasNext()){
             return p3.invoke(objArray, Integer.valueOf(i));
          }else {
             goto label_006d ;
          }
       }
       return objArray;
    }
}
