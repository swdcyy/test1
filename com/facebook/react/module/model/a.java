package com.facebook.react.module.model.a;
import ge.a;
import java.util.HashMap;
import java.lang.Void;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Short;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.util.List;
import com.facebook.react.bridge.Promise;
import java.util.HashSet;
import java.util.ArrayList;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.lang.reflect.Method;
import com.facebook.react.bridge.ReactMethod;
import java.lang.annotation.Annotation;
import com.facebook.react.module.model.MethodDescriptor;
import com.facebook.react.module.model.MethodDescriptor$MethodValueKind;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableArray;
import java.lang.IllegalArgumentException;

public class a extends a	// class@00126d
{
    public final Class a;
    public static final HashMap b;

    static {
       HashMap hashMap = new HashMap();
       a.b = hashMap;
       hashMap.put(Void.TYPE.getName(), "V");
       hashMap.put(Boolean.TYPE.getName(), "Z");
       hashMap.put(Byte.TYPE.getName(), "B");
       hashMap.put(Character.TYPE.getName(), "C");
       hashMap.put(Short.TYPE.getName(), "S");
       hashMap.put(Integer.TYPE.getName(), "I");
       hashMap.put(Long.TYPE.getName(), "J");
       hashMap.put(Float.TYPE.getName(), "F");
       hashMap.put(Double.TYPE.getName(), "D");
    }
    public void a(Class p0){
       super();
       this.a = p0;
    }
    public static String b(Class p0){
       String name;
       StringBuilder str = "";
       if (p0.isArray()) {
          name = p0.getComponentType().getName();
          str = str+"[";
       }else {
          name = p0.getName();
       }
       HashMap b = a.b;
       str = (b.containsKey(name))? str+b.get(name): str+"L"+name.replace(".", "/")+";";
       return str;
    }
    public List a(){
       MethodDescriptor methodDescri;
       MethodDescriptor$MethodValueKind booleanKind;
       Promise promise = Promise.class;
       HashSet hashSet = new HashSet();
       ArrayList uArrayList = new ArrayList();
       a ta = this.a;
       Class superclass = ta.getSuperclass();
       if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
          ta = superclass;
       }
       Method[] declaredMeth = ta.getDeclaredMethods();
       int len = declaredMeth.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return uArrayList;
          }
          object oobject = declaredMeth[i];
          if (oobject.getAnnotation(ReactMethod.class) != null) {
             Class[] parameterTyp = oobject.getParameterTypes();
             methodDescri = new MethodDescriptor();
             methodDescri.name = oobject.getName();
             Class returnType = oobject.getReturnType();
             if (returnType == Boolean.TYPE || returnType == Boolean.class) {
                booleanKind = MethodDescriptor$MethodValueKind.BooleanKind;
             }else if(returnType != Integer.TYPE && (returnType != Integer.class && (returnType != Double.TYPE && (returnType != Double.class && (returnType != Float.TYPE && (returnType != Float.class && (returnType == Long.class || returnType == Long.TYPE))))))){
                booleanKind = MethodDescriptor$MethodValueKind.NumberKind;
             }else if(returnType == String.class){
                booleanKind = MethodDescriptor$MethodValueKind.StringKind;
             }else if(returnType == Void.TYPE || returnType == Void.class){
                booleanKind = MethodDescriptor$MethodValueKind.VoidKind;
             }else if(returnType == WritableMap.class){
                booleanKind = MethodDescriptor$MethodValueKind.ObjectKind;
             }else if(returnType == WritableArray.class){
                booleanKind = MethodDescriptor$MethodValueKind.ArrayKind;
             }else if(returnType == promise){
                booleanKind = MethodDescriptor$MethodValueKind.PromiseKind;
             }else {
                booleanKind = MethodDescriptor$MethodValueKind.FunctionKind;
             }
             methodDescri.retKind = booleanKind;
             Class returnType1 = oobject.getReturnType();
             StringBuilder str = "\(";
             int len1 = parameterTyp.length;
             for (int i1 = 0; i1 < len1; i1 = i1 + 1) {
                str = str+a.b(parameterTyp[i1]);
             }
             methodDescri.signature = str+"\)"+a.b(returnType1);
             methodDescri.argCount = parameterTyp.length;
             if (!hashSet.contains(methodDescri.a())) {
                hashSet.add(methodDescri.a());
                int len2 = parameterTyp.length;
                int i2 = 0;
                while (i2 < len2) {
                   if ((parameterTyp[i2].getName()).equals(promise.getName())) {
                      methodDescri.retKind = MethodDescriptor$MethodValueKind.PromiseKind;
                      len2 = methodDescri.argCount - 1;
                      methodDescri.argCount = len2;
                      break ;
                   }
                   i2 = i2 + 1;
                }
                uArrayList.add(methodDescri);
             }else {
             }
          }
          i = i + 1;
       }
       throw new IllegalArgumentException("TurboModule method "+methodDescri.a()+" already registered");
    }
}
