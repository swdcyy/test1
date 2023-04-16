package androidx.lifecycle.Lifecycling;
import java.util.HashMap;
import java.lang.Object;
import java.lang.reflect.Constructor;
import androidx.lifecycle.GeneratedAdapter;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Package;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.Lifecycling$1;
import java.util.Map;
import java.lang.Integer;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.FullLifecycleObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import java.util.List;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import java.util.Collections;
import androidx.lifecycle.ClassesInfoCache;
import java.util.ArrayList;
import java.util.Collection;

public class Lifecycling	// class@000250
{
    public static Map sCallbackCache;
    public static Map sClassToAdapters;

    static {
       Lifecycling.sCallbackCache = new HashMap();
       Lifecycling.sClassToAdapters = new HashMap();
    }
    public void Lifecycling(){
       super();
    }
    public static GeneratedAdapter createGeneratedAdapter(Constructor p0,Object p1){
       int i = 1;
       try{
          Object[] objArray = new Object[i];
          objArray[0] = p1;
          return p0.newInstance(objArray);
       }catch(java.lang.IllegalAccessException e2){
          throw new RuntimeException(e2);
       }catch(java.lang.InstantiationException e2){
          throw new RuntimeException(e2);
       }catch(java.lang.reflect.InvocationTargetException e2){
          throw new RuntimeException(e2);
       }
    }
    public static Constructor generatedConstructor(Class p0){
       try{
          Package package = p0.getPackage();
          String canonicalNam = p0.getCanonicalName();
          String name = (package != null)? package.getName(): "";
          if (!name.isEmpty()) {
             canonicalNam = canonicalNam.substring((name.length() + 1));
          }
          canonicalNam = Lifecycling.getAdapterName(canonicalNam);
          if (!name.isEmpty()) {
             canonicalNam = name+"."+canonicalNam;
          }
          Class[] uClassArray = new Class[]{p0};
          Constructor declaredCons = Class.forName(canonicalNam).getDeclaredConstructor(uClassArray);
          if (!declaredCons.isAccessible()) {
             declaredCons.setAccessible(1);
          }
          return declaredCons;
       }catch(java.lang.ClassNotFoundException e0){
          return null;
       }catch(java.lang.NoSuchMethodException e4){
          throw new RuntimeException(e4);
       }
    }
    public static String getAdapterName(String p0){
       return p0.replace(".", "_")+"_LifecycleAdapter";
    }
    public static GenericLifecycleObserver getCallback(Object p0){
       return new Lifecycling$1(Lifecycling.lifecycleEventObserver(p0));
    }
    public static int getObserverConstructorType(Class p0){
       Integer integer = Lifecycling.sCallbackCache.get(p0);
       if (integer != null) {
          return integer.intValue();
       }
       int i = Lifecycling.resolveObserverCallbackType(p0);
       Lifecycling.sCallbackCache.put(p0, Integer.valueOf(i));
       return i;
    }
    public static boolean isLifecycleParent(Class p0){
       boolean b = (p0 != null && LifecycleObserver.class.isAssignableFrom(p0))? true: false;
       return b;
    }
    public static LifecycleEventObserver lifecycleEventObserver(Object p0){
       v0 = p0 instanceof LifecycleEventObserver;
       v1 = p0 instanceof FullLifecycleObserver;
       if (v0 && v1) {
          return new FullLifecycleObserverAdapter(p0, p0);
       }
       if (v1) {
          return new FullLifecycleObserverAdapter(p0, null);
       }
       if (v0) {
          return p0;
       }
       Class class = p0.getClass();
       if (Lifecycling.getObserverConstructorType(class) != 2) {
          return new ReflectiveGenericLifecycleObserver(p0);
       }
       List list = Lifecycling.sClassToAdapters.get(class);
       int i = 0;
       if (list.size() == 1) {
          return new SingleGeneratedAdapterObserver(Lifecycling.createGeneratedAdapter(list.get(i), p0));
       }
       GeneratedAdapter[] generatedAda = new GeneratedAdapter[list.size()];
       for (; i < list.size(); i = i + 1) {
          generatedAda[i] = Lifecycling.createGeneratedAdapter(list.get(i), p0);
       }
       return new CompositeGeneratedAdaptersObserver(generatedAda);
    }
    public static int resolveObserverCallbackType(Class p0){
       int i = 1;
       if (p0.getCanonicalName() == null) {
          return i;
       }
       Constructor uConstructor = Lifecycling.generatedConstructor(p0);
       if (uConstructor != null) {
          Lifecycling.sClassToAdapters.put(p0, Collections.singletonList(uConstructor));
          return 2;
       }else if(ClassesInfoCache.sInstance.hasLifecycleMethods(p0)){
          return i;
       }else {
          Class superclass = p0.getSuperclass();
          int i1 = 0;
          if (Lifecycling.isLifecycleParent(superclass)) {
             if (Lifecycling.getObserverConstructorType(superclass) == i) {
                return i;
             }else {
                i1 = new ArrayList(Lifecycling.sClassToAdapters.get(superclass));
             }
          }
          Class[] interfaces = p0.getInterfaces();
          int len = interfaces.length;
          int i2 = 0;
          while (true) {
             if (i2 < len) {
                object oobject = interfaces[i2];
                if (Lifecycling.isLifecycleParent(oobject)) {
                   if (Lifecycling.getObserverConstructorType(oobject) == i) {
                      break ;
                   }else if(i1 == null){
                      i1 = new ArrayList();
                   }
                   i1.addAll(Lifecycling.sClassToAdapters.get(oobject));
                }
                i2 = i2 + 1;
             }else if(i1 != null){
                Lifecycling.sClassToAdapters.put(p0, i1);
                return 2;
             }else {
                return i;
             }
          }
          return i;
       }
    }
}
