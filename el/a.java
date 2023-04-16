package el.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Type;
import com.google.gson.internal.$Gson$Types;
import bl.a;
import java.lang.AssertionError;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.RuntimeException;
import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.TypeVariable;

public class a	// class@001575
{
    public final int hashCode;
    public final Class rawType;
    public final Type type;

    public void a(){
       super();
       Type superclassTy = a.getSuperclassTypeParameter(this.getClass());
       this.type = superclassTy;
       this.rawType = $Gson$Types.g(superclassTy);
       this.hashCode = superclassTy.hashCode();
    }
    public void a(Type p0){
       super();
       a.b(p0);
       p0 = $Gson$Types.b(p0);
       this.type = p0;
       this.rawType = $Gson$Types.g(p0);
       this.hashCode = p0.hashCode();
    }
    public static AssertionError buildUnexpectedTypeError(Type p0,Class[] p1){
       String str = "Unexpected type. Expected one of: ";
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          str = str+p1[i].getName()+", ";
       }
       return new AssertionError(str+"but got: "+p0.getClass().getName()+", for type token: "+p0.toString()+'.');
    }
    public static a get(Class p0){
       return new a(p0);
    }
    public static a get(Type p0){
       return new a(p0);
    }
    public static a getArray(Type p0){
       return new a($Gson$Types.a(p0));
    }
    public static a getParameterized(Type p0,Type[] p1){
       return new a($Gson$Types.i(null, p0, p1));
    }
    public static Type getSuperclassTypeParameter(Class p0){
       Type genericSuper = p0.getGenericSuperclass();
       if (!genericSuper instanceof Class) {
          return $Gson$Types.b(genericSuper.getActualTypeArguments()[0]);
       }
       throw new RuntimeException("Missing type parameter.");
    }
    public static boolean isAssignableFrom(Type p0,GenericArrayType p1){
       Type genericCompo = p1.getGenericComponentType();
       if (!genericCompo instanceof ParameterizedType) {
          return true;
       }
       if (p0 instanceof GenericArrayType) {
          p0 = p0.getGenericComponentType();
       }else if(p0 instanceof Class){
          while (p0.isArray()) {
             Class componentTyp = p0.getComponentType();
          }
       }
       return a.isAssignableFrom(p0, genericCompo, new HashMap());
    }
    public static boolean isAssignableFrom(Type p0,ParameterizedType p1,Map p2){
       Type[] actualTypeAr;
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p1.equals(p0)) {
          return true;
       }
       Class uClass = $Gson$Types.g(p0);
       ParameterizedType parameterize = null;
       if (p0 instanceof ParameterizedType) {
          parameterize = p0;
       }
       if (parameterize) {
          actualTypeAr = parameterize.getActualTypeArguments();
          TypeVariable[] typeParamete = uClass.getTypeParameters();
          for (int i = 0; i < actualTypeAr.length; i = i + 1) {
             object oobject = actualTypeAr[i];
             object oobject1 = typeParamete[i];
             while (oobject instanceof TypeVariable) {
                oobject = p2.get(oobject.getName());
             }
             p2.put(oobject1.getName(), oobject);
          }
          if (a.typeEquals(parameterize, p1, p2)) {
             return true;
          }
       }
       actualTypeAr = uClass.getGenericInterfaces();
       int len = actualTypeAr.length;
       while (true) {
          if (b >= len) {
             return a.isAssignableFrom(uClass.getGenericSuperclass(), p1, new HashMap(p2));
          }
          if (a.isAssignableFrom(actualTypeAr[b], p1, new HashMap(p2))) {
             break ;
          }else {
             b = b + 1;
          }
       }
       return true;
    }
    public static boolean matches(Type p0,Type p1,Map p2){
       boolean b = (p1.equals(p0) || (p0 instanceof TypeVariable && p1.equals(p2.get(p0.getName()))))? true: false;
       return b;
    }
    public static boolean typeEquals(ParameterizedType p0,ParameterizedType p1,Map p2){
       if (!p0.getRawType().equals(p1.getRawType())) {
          return false;
       }
       Type[] actualTypeAr = p0.getActualTypeArguments();
       Type[] actualTypeAr1 = p1.getActualTypeArguments();
       int i = 0;
       while (true) {
          if (i >= actualTypeAr.length) {
             return true;
          }
          if (!a.matches(actualTypeAr[i], actualTypeAr1[i], p2)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof a && $Gson$Types.d(this.type, p0.type))? true: false;
       return b;
    }
    public final Class getRawType(){
       return this.rawType;
    }
    public final Type getType(){
       return this.type;
    }
    public final int hashCode(){
       return this.hashCode;
    }
    public boolean isAssignableFrom(a p0){
       return this.isAssignableFrom(p0.getType());
    }
    public boolean isAssignableFrom(Class p0){
       return this.isAssignableFrom(p0);
    }
    public boolean isAssignableFrom(Type p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       boolean b1 = true;
       if (this.type.equals(p0)) {
          return b1;
       }
       a ttype = this.type;
       if (ttype instanceof Class) {
          return this.rawType.isAssignableFrom($Gson$Types.g(p0));
       }
       if (ttype instanceof ParameterizedType) {
          return a.isAssignableFrom(p0, ttype, new HashMap());
       }
       if (ttype instanceof GenericArrayType) {
          if (this.rawType.isAssignableFrom($Gson$Types.g(p0)) && a.isAssignableFrom(p0, this.type)) {
             b = true;
          }
          return b;
       }else {
          Class[] uClassArray = new Class[]{Class.class,ParameterizedType.class,GenericArrayType.class};
          throw a.buildUnexpectedTypeError(ttype, uClassArray);
       }
    }
    public final String toString(){
       return $Gson$Types.l(this.type);
    }
}
