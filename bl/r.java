package bl.r;
import java.lang.reflect.Type;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Byte;
import java.lang.Double;
import java.lang.Long;
import java.lang.Character;
import java.lang.Boolean;
import java.lang.Short;
import java.lang.Void;

public final class r	// class@000300
{

    public static boolean a(Type p0){
       boolean b = (p0 instanceof Class && p0.isPrimitive())? true: false;
       return b;
    }
    public static Class b(Class p0){
       Void void;
       if (p0 == Integer.TYPE) {
          return Integer.class;
       }
       if (p0 == Float.TYPE) {
          return Float.class;
       }
       if (p0 == Byte.TYPE) {
          return Byte.class;
       }
       if (p0 == Double.TYPE) {
          return Double.class;
       }
       if (p0 == Long.TYPE) {
          return Long.class;
       }
       if (p0 == Character.TYPE) {
          return Character.class;
       }
       if (p0 == Boolean.TYPE) {
          return Boolean.class;
       }
       if (p0 == Short.TYPE) {
          return Short.class;
       }
       if (p0 == Void.TYPE) {
          void = Void.class;
       }
       return void;
    }
}
