package butterknife.ButterKnife;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.lang.Object;
import java.lang.AssertionError;
import android.app.Activity;
import butterknife.Unbinder;
import android.view.Window;
import android.view.View;
import android.app.Dialog;
import butterknife.ViewBindingProvider;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.RuntimeException;
import java.lang.Error;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.HashSet;
import butterknife.ButterKnifeBindingIndex;
import java.lang.ClassLoader;
import java.lang.IllegalStateException;

public final class ButterKnife	// class@000b8b
{
    public static final Map BINDINGS;
    public static final HashSet UNFOUND_CLASSES;
    public static boolean debug;

    static {
       ButterKnife.BINDINGS = new LinkedHashMap();
       ButterKnife.UNFOUND_CLASSES = new LinkedHashSet();
    }
    public void ButterKnife(){
       super();
       throw new AssertionError("No instances.");
    }
    public static Unbinder bind(Activity p0){
       return ButterKnife.bind(p0, p0.getWindow().getDecorView());
    }
    public static Unbinder bind(Dialog p0){
       return ButterKnife.bind(p0, p0.getWindow().getDecorView());
    }
    public static Unbinder bind(View p0){
       return ButterKnife.bind(p0, p0);
    }
    public static Unbinder bind(Object p0,Activity p1){
       return ButterKnife.bind(p0, p1.getWindow().getDecorView());
    }
    public static Unbinder bind(Object p0,Dialog p1){
       return ButterKnife.bind(p0, p1.getWindow().getDecorView());
    }
    public static Unbinder bind(Object p0,View p1){
       if (p0 instanceof ViewBindingProvider) {
          Unbinder binder = p0.getBinder(p0, p1);
          if (binder != null) {
             return binder;
          }
       }
       Constructor uConstructor = ButterKnife.findBindingConstructorForClass(p0.getClass());
       if (uConstructor == null) {
          return Unbinder.EMPTY;
       }else {
          int i = 2;
          try{
             Object[] objArray = new Object[i];
             objArray[0] = p0;
             objArray[1] = p1;
             return uConstructor.newInstance(objArray);
          }catch(java.lang.IllegalAccessException e4){
             throw new RuntimeException(v0+uConstructor, e4);
          }catch(java.lang.InstantiationException e4){
             throw new RuntimeException(v0+uConstructor, e4);
          }catch(java.lang.reflect.InvocationTargetException e4){
             p0 = e4.getCause();
             if (!p0 instanceof RuntimeException) {
                if (p0 instanceof Error) {
                   throw p0;
                }else {
                   throw new RuntimeException("Unable to create binding instance.", p0);
                }
             }else {
                throw p0;
             }
          }
       }
    }
    public static Constructor findBindingConstructorForClass(Class p0){
       Constructor uConstructor2;
       String str = "_ViewBinding";
       Map bINDINGS = ButterKnife.BINDINGS;
       Constructor uConstructor = bINDINGS.get(p0);
       if (uConstructor != null || bINDINGS.containsKey(p0)) {
          return uConstructor;
       }
       String name = p0.getName();
       Constructor uConstructor1 = null;
       if (!name.startsWith("android.") && (name.startsWith("java.") || name.startsWith("androidx."))) {
          return uConstructor1;
       }
       try{
          if (!ButterKnife.UNFOUND_CLASSES.contains(p0)) {
             if (!ButterKnifeBindingIndex.isClassExistInIndex(name+str)) {
                return uConstructor1;
             }else {
                Class[] uClassArray = new Class[]{p0,View.class};
                uConstructor2 = p0.getClassLoader().loadClass(name+str).getConstructor(uClassArray);
                boolean debug = ButterKnife.debug;
             }
          }else {
             throw new IllegalStateException("class in the black list");
          }
       }catch(java.lang.ClassNotFoundException e0){
          if (ButterKnife.debug) {
             p0.getSuperclass().getName();
          }
          uConstructor2 = ButterKnife.findBindingConstructorForClass(p0.getSuperclass());
       }catch(java.lang.IllegalStateException e0){
          if (ButterKnife.debug) {
             p0.getSuperclass().getName();
          }
          uConstructor2 = ButterKnife.findBindingConstructorForClass(p0.getSuperclass());
       }catch(java.lang.NoSuchMethodException e5){
          throw new RuntimeException("Unable to find binding constructor for "+name, e5);
       }
       if (uConstructor2 == null) {
          ButterKnife.UNFOUND_CLASSES.add(p0);
       }else {
          ButterKnife.BINDINGS.put(p0, uConstructor2);
       }
       return uConstructor2;
    }
    public static void setDebug(boolean p0){
       ButterKnife.debug = p0;
    }
}
