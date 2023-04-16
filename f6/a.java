package f6.a;
import java.lang.reflect.Type;
import java.lang.Class;
import java.lang.reflect.ParameterizedType;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Double;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Short;
import java.lang.Character;
import java.lang.Byte;
import java.lang.Void;

public final class a	// class@001fd6
{

    public static Class a(Type p0){
       while (true) {
          if (p0 instanceof Class) {
             return p0;
          }
          if (p0 instanceof ParameterizedType) {
             p0 = p0.getRawType();
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("TODO");
    }
    public static boolean b(Class p0){
       if (p0.isPrimitive()) {
          return true;
       }
       if (p0.equals(String.class)) {
          return true;
       }
       if (p0.equals(Integer.class)) {
          return true;
       }
       if (p0.equals(Long.class)) {
          return true;
       }
       if (p0.equals(Double.class)) {
          return true;
       }
       if (p0.equals(Float.class)) {
          return true;
       }
       if (p0.equals(Boolean.class)) {
          return true;
       }
       if (p0.equals(Short.class)) {
          return true;
       }
       if (p0.equals(Character.class)) {
          return true;
       }
       if (p0.equals(Byte.class)) {
          return true;
       }
       if (p0.equals(Void.class)) {
          return true;
       }
       return false;
    }
}
