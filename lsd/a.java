package lsd.a;
import java.lang.annotation.Annotation;
import vsd.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import java.util.Objects;
import nsd.r;
import java.lang.Short;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Void;
import java.lang.Long;
import java.lang.Character;
import java.lang.Byte;
import java.lang.Integer;
import java.lang.Double;
import nsd.m0;

public final class a	// class@001cac
{

    public static final d a(Annotation p0){
       a.p(p0, "$this$annotationClass");
       d uod = a.g(p0.annotationType());
       Objects.requireNonNull(uod, "null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
       return uod;
    }
    public static final Class b(Object p0){
       a.p(p0, "$this$javaClass");
       return p0.getClass();
    }
    public static final Class c(d p0){
       a.p(p0, "$this$java");
       Class uClass = p0.j();
       Objects.requireNonNull(uClass, "null cannot be cast to non-null type java.lang.Class<T>");
       return uClass;
    }
    public static void d(d p0){
    }
    public static final Class e(d p0){
       a.p(p0, "$this$javaObjectType");
       Class uClass = p0.j();
       if (!uClass.isPrimitive()) {
          return uClass;
       }
       String name = uClass.getName();
       switch (name.hashCode()){
           case 0xb0f77bd1:
             if (name.equals("double")) {
                uClass = Double.class;
             }
             break;
           case 0x197ef:
             if (name.equals("int")) {
                uClass = Integer.class;
             }
             break;
           case 0x2e6108:
             if (name.equals("byte")) {
                uClass = Byte.class;
             }
             break;
           case 0x2e9356:
             if (name.equals("char")) {
                uClass = Character.class;
             }
             break;
           case 0x32c67c:
             if (name.equals("long")) {
                uClass = Long.class;
             }
             break;
           case 0x375194:
             if (name.equals("void")) {
                uClass = Void.class;
             }
             break;
           case 0x3db6c28:
             if (name.equals("boolean")) {
                uClass = Boolean.class;
             }
             break;
           case 0x5d0225c:
             if (name.equals("float")) {
                uClass = Float.class;
             }
             break;
           case 0x685847c:
             if (name.equals("short")) {
                uClass = Short.class;
             }
             break;
           default:
       }
    label_0080 :
       return uClass;
    }
    public static final Class f(d p0){
       a.p(p0, "$this$javaPrimitiveType");
       Class uClass = p0.j();
       if (uClass.isPrimitive()) {
          return uClass;
       }
       String name = uClass.getName();
       switch (name.hashCode()){
           case 0x8567756a:
             if (name.equals("java.lang.Integer")) {
                uClass = Integer.TYPE;
             }else {
             label_0082 :
                uClass = null;
             }
             break;
           case 0xe0893188:
             if (name.equals("java.lang.Float")) {
                uClass = Float.TYPE;
             }else {
                goto label_0082 ;
             }
             break;
           case 0xe13e93a8:
             if (name.equals("java.lang.Short")) {
                uClass = Short.TYPE;
             }else {
                goto label_0082 ;
             }
             break;
           case 0x9415455:
             if (name.equals("java.lang.Character")) {
                uClass = Character.TYPE;
             }else {
                goto label_0082 ;
             }
             break;
           case 0x148d6054:
             if (name.equals("java.lang.Boolean")) {
                uClass = Boolean.TYPE;
             }else {
                goto label_0082 ;
             }
             break;
           case 0x17c0bc5c:
             if (name.equals("java.lang.Byte")) {
                uClass = Byte.TYPE;
             }else {
                goto label_0082 ;
             }
             break;
           case 0x17c521d0:
             if (name.equals("java.lang.Long")) {
                uClass = Long.TYPE;
             }else {
                goto label_0082 ;
             }
             break;
           case 0x17c9ace8:
             if (name.equals("java.lang.Void")) {
                uClass = Void.TYPE;
             }else {
                goto label_0082 ;
             }
             break;
           case 0x2d605225:
             if (name.equals("java.lang.Double")) {
                uClass = Double.TYPE;
             }else {
                goto label_0082 ;
             }
             break;
           default:
             goto label_0082 ;
       }
       return uClass;
    }
    public static final d g(Class p0){
       a.p(p0, "$this$kotlin");
       return m0.d(p0);
    }
    public static final Class h(d p0){
       a.p(p0, "$this$javaClass");
       return p0.getClass();
    }
    public static void i(d p0){
    }
    public static final boolean j(Object[] p0){
       a.p(p0, "$this$isArrayOf");
       a.y(4, "T");
       return Object.class.isAssignableFrom(p0.getClass().getComponentType());
    }
}
