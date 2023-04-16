package okhttp3.internal.platform.AndroidPlatform$CloseGuard;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;

public final class AndroidPlatform$CloseGuard	// class@0020d4
{
    public final Method getMethod;
    public final Method openMethod;
    public final Method warnIfOpenMethod;

    public void AndroidPlatform$CloseGuard(Method p0,Method p1,Method p2){
       super();
       this.getMethod = p0;
       this.openMethod = p1;
       this.warnIfOpenMethod = p2;
    }
    public static AndroidPlatform$CloseGuard get(){
       Method method2;
       Method method3;
       Method method = null;
       try{
          Class uClass = Class.forName("dalvik.system.CloseGuard");
          Class[] uClassArray = new Class[0];
          Method method1 = uClass.getMethod("get", uClassArray);
          Class[] uClassArray1 = new Class[]{String.class};
          method2 = uClass.getMethod("open", uClassArray1);
          Class[] uClassArray2 = new Class[0];
          method3 = uClass.getMethod("warnIfOpen", uClassArray2);
          method = method1;
       }catch(java.lang.Exception e0){
          method3 = e0;
          method2 = method3;
       }
       return new AndroidPlatform$CloseGuard(e0, method2, method3);
    }
    public Object createAndOpen(String p0){
       AndroidPlatform$CloseGuard tgetMethod = this.getMethod;
       if (tgetMethod == null) {
          return v1;
       }
       int i = 0;
       try{
          Object[] objArray = new Object[i];
          Object obj = tgetMethod.invoke(null, objArray);
          Object[] objArray1 = new Object[]{p0};
          this.openMethod.invoke(obj, objArray1);
          return obj;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean warnIfOpen(Object p0){
       int i = 0;
       if (p0 != null) {
          try{
             Object[] objArray = new Object[i];
             this.warnIfOpenMethod.invoke(p0, objArray);
             i = true;
          }catch(java.lang.Exception e0){
          }
       }
       return e0;
    }
}
