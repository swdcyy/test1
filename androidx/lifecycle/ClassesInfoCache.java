package androidx.lifecycle.ClassesInfoCache;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.reflect.Method;
import androidx.lifecycle.ClassesInfoCache$CallbackInfo;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import androidx.lifecycle.ClassesInfoCache$MethodReference;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.annotation.Annotation;
import androidx.lifecycle.LifecycleOwner;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Throwable;
import java.lang.StringBuilder;

public final class ClassesInfoCache	// class@0007b9
{
    public final Map mCallbackMap;
    public final Map mHasLifecycleMethods;
    public static ClassesInfoCache sInstance;

    static {
       ClassesInfoCache.sInstance = new ClassesInfoCache();
    }
    public void ClassesInfoCache(){
       super();
       this.mCallbackMap = new HashMap();
       this.mHasLifecycleMethods = new HashMap();
    }
    public final ClassesInfoCache$CallbackInfo createInfo(Class p0,Method[] p1){
       object oobject1;
       Class superclass = p0.getSuperclass();
       HashMap hashMap = new HashMap();
       if (superclass != null) {
          ClassesInfoCache$CallbackInfo info = this.getInfo(superclass);
          if (info != null) {
             hashMap.putAll(info.mHandlerToEvent);
          }
       }
       Class[] interfaces = p0.getInterfaces();
       int len = interfaces.length;
       int i = 0;
       while (i < len) {
          Iterator iterator = this.getInfo(interfaces[i]).mHandlerToEvent.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             ClassesInfoCache$MethodReference key = uEntry.getKey();
             this.verifyAndPutHandler(hashMap, key, uEntry.getValue(), p0);
          }
          i = i + 1;
       }
       if (p1 == null) {
          p1 = this.getDeclaredMethods(p0);
       }
       int len1 = p1.length;
       len = 0;
       Class[] uClassArray = null;
       while (true) {
          if (len < len1) {
             object oobject = p1[len];
             OnLifecycleEvent annotation = oobject.getAnnotation(OnLifecycleEvent.class);
             if (annotation != null) {
                uClassArray = oobject.getParameterTypes();
                if (uClassArray.length > 0) {
                   if (uClassArray[0].isAssignableFrom(LifecycleOwner.class)) {
                      oobject1 = 1;
                   }else {
                      throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                   }
                }else {
                   oobject1 = null;
                }
                Lifecycle$Event uEvent = annotation.value();
                if (uClassArray.length > 1) {
                   if (uClassArray[1].isAssignableFrom(Lifecycle$Event.class)) {
                      if (uEvent == Lifecycle$Event.ON_ANY) {
                         oobject1 = 2;
                      }else {
                         throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                      }
                   }else {
                      throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                   }
                }
                if (uClassArray.length <= 2) {
                   this.verifyAndPutHandler(hashMap, new ClassesInfoCache$MethodReference(oobject1, oobject), uEvent, p0);
                   uClassArray = 1;
                }else {
                   break ;
                }
             }
             len = len + 1;
          }else {
             ClassesInfoCache$CallbackInfo uCallbackInf = new ClassesInfoCache$CallbackInfo(hashMap);
             this.mCallbackMap.put(p0, uCallbackInf);
             this.mHasLifecycleMethods.put(p0, Boolean.valueOf(uClassArray));
             return uCallbackInf;
          }
       }
       throw new IllegalArgumentException("cannot have more than 2 params");
    }
    public final Method[] getDeclaredMethods(Class p0){
       try{
          return p0.getDeclaredMethods();
       }catch(java.lang.NoClassDefFoundError e3){
          throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
       }
    }
    public ClassesInfoCache$CallbackInfo getInfo(Class p0){
       ClassesInfoCache$CallbackInfo uCallbackInf = this.mCallbackMap.get(p0);
       if (uCallbackInf != null) {
          return uCallbackInf;
       }
       return this.createInfo(p0, null);
    }
    public boolean hasLifecycleMethods(Class p0){
       Boolean uBoolean = this.mHasLifecycleMethods.get(p0);
       if (uBoolean != null) {
          return uBoolean.booleanValue();
       }
       Method[] declaredMeth = this.getDeclaredMethods(p0);
       int len = declaredMeth.length;
       int i = 0;
       while (true) {
          if (i < len) {
             if (declaredMeth[i].getAnnotation(OnLifecycleEvent.class) != null) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             this.mHasLifecycleMethods.put(p0, Boolean.FALSE);
             return false;
          }
       }
       this.createInfo(p0, declaredMeth);
       return true;
    }
    public final void verifyAndPutHandler(Map p0,ClassesInfoCache$MethodReference p1,Lifecycle$Event p2,Class p3){
       Lifecycle$Event uEvent = p0.get(p1);
       if (uEvent != null && p2 != uEvent) {
          throw new IllegalArgumentException("Method "+p1.mMethod.getName()+" in "+p3.getName()+" already declared with different @OnLifecycleEvent value: previous value "+uEvent+", new value "+p2);
       }
       if (uEvent == null) {
          p0.put(p1, p2);
       }
       return;
    }
}
