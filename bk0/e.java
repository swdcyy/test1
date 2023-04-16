package bk0.e;
import com.kuaishou.krn.instance.JsFramework;
import java.lang.Enum;

public final class e	// class@00039f
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsFramework.values().length];
       e.a = ointArray;
       ointArray[JsFramework.REACT.ordinal()] = 1;
       ointArray[JsFramework.VUE.ordinal()] = 2;
    }
}
