package dyd.a;
import retrofit2.h$a;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import retrofit2.q;
import retrofit2.h;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Short;
import retrofit2.converter.scalars.ScalarRequestBodyConverter;
import retrofit2.converter.scalars.ScalarResponseBodyConverters$StringResponseBodyConverter;
import retrofit2.converter.scalars.ScalarResponseBodyConverters$ShortResponseBodyConverter;
import retrofit2.converter.scalars.ScalarResponseBodyConverters$LongResponseBodyConverter;
import retrofit2.converter.scalars.ScalarResponseBodyConverters$IntegerResponseBodyConverter;
import retrofit2.converter.scalars.ScalarResponseBodyConverters$FloatResponseBodyConverter;
import retrofit2.converter.scalars.ScalarResponseBodyConverters$DoubleResponseBodyConverter;
import retrofit2.converter.scalars.ScalarResponseBodyConverters$CharacterResponseBodyConverter;
import retrofit2.converter.scalars.ScalarResponseBodyConverters$ByteResponseBodyConverter;
import retrofit2.converter.scalars.ScalarResponseBodyConverters$BooleanResponseBodyConverter;

public final class a extends h$a	// class@000cf0
{

    public void a(){
       super();
    }
    public static a a(){
       return new a();
    }
    public h requestBodyConverter(Type p0,Annotation[] p1,Annotation[] p2,q p3){
       if (p0 != String.class && (p0 != Boolean.TYPE && (p0 != Boolean.class && (p0 != Byte.TYPE && (p0 != Byte.class && (p0 != Character.TYPE && (p0 != Character.class && (p0 != Double.TYPE && (p0 != Double.class && (p0 != Float.TYPE && (p0 != Float.class && (p0 != Integer.TYPE && (p0 != Integer.class && (p0 != Long.TYPE && (p0 != Long.class && (p0 == Short.TYPE || p0 == Short.class)))))))))))))))) {
          return ScalarRequestBodyConverter.INSTANCE;
       }
       return null;
    }
    public h responseBodyConverter(Type p0,Annotation[] p1,q p2){
       if (p0 == String.class) {
          return ScalarResponseBodyConverters$StringResponseBodyConverter.INSTANCE;
       }
       if (p0 == Boolean.class || p0 == Boolean.TYPE) {
          return ScalarResponseBodyConverters$BooleanResponseBodyConverter.INSTANCE;
       }
       if (p0 == Byte.class || p0 == Byte.TYPE) {
          return ScalarResponseBodyConverters$ByteResponseBodyConverter.INSTANCE;
       }
       if (p0 == Character.class || p0 == Character.TYPE) {
          return ScalarResponseBodyConverters$CharacterResponseBodyConverter.INSTANCE;
       }
       if (p0 == Double.class || p0 == Double.TYPE) {
          return ScalarResponseBodyConverters$DoubleResponseBodyConverter.INSTANCE;
       }
       if (p0 == Float.class || p0 == Float.TYPE) {
          return ScalarResponseBodyConverters$FloatResponseBodyConverter.INSTANCE;
       }
       if (p0 == Integer.class || p0 == Integer.TYPE) {
          return ScalarResponseBodyConverters$IntegerResponseBodyConverter.INSTANCE;
       }
       if (p0 == Long.class || p0 == Long.TYPE) {
          return ScalarResponseBodyConverters$LongResponseBodyConverter.INSTANCE;
       }
       if (p0 == Short.class || p0 == Short.TYPE) {
          return ScalarResponseBodyConverters$ShortResponseBodyConverter.INSTANCE;
       }
       return null;
    }
}
