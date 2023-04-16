package hj0.b;
import com.kuaishou.krn.instance.JsFramework;
import java.lang.Enum;

public final class b	// class@0026ea
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsFramework.values().length];
       b.a = ointArray;
       ointArray[JsFramework.REACT.ordinal()] = 1;
       ointArray[JsFramework.VUE.ordinal()] = 2;
    }
}
