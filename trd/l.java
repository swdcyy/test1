package trd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Arrays;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.nio.charset.Charset;
import java.util.Collection;

public class l	// class@002573
{

    public void l(){
       super();
    }
    public static final Object[] a(Object[] p0,int p1){
       a.p(p0, "reference");
       p0 = Array.newInstance(p0.getClass().getComponentType(), p1);
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Array<T>");
       return p0;
    }
    public static final int b(Object[] p0){
       return Arrays.deepHashCode(p0);
    }
    public static final void c(int p0,int p1){
       if (p0 <= p1) {
          return;
       }
       throw new IndexOutOfBoundsException("toIndex \("+p0+"\) is greater than size \("+p1+"\).");
    }
    public static final Object[] d(Object[] p0){
       if (p0 != null) {
       }else {
          a.y(0, "T?");
          p0 = new Object[0];
       }
       return p0;
    }
    public static final String e(byte[] p0,Charset p1){
       return new String(p0, p1);
    }
    public static final Object[] f(Collection p0){
       a.p(p0, "$this$toTypedArray");
       a.y(0, "T?");
       Object[] objArray = new Object[0];
       Object[] objArray1 = p0.toArray(objArray);
       Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
       return objArray1;
    }
}
