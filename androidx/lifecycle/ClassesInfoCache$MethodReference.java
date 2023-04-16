package androidx.lifecycle.ClassesInfoCache$MethodReference;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.String;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;

public final class ClassesInfoCache$MethodReference	// class@0007b8
{
    public final int mCallType;
    public final Method mMethod;

    public void ClassesInfoCache$MethodReference(int p0,Method p1){
       super();
       this.mCallType = p0;
       this.mMethod = p1;
       p1.setAccessible(true);
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof ClassesInfoCache$MethodReference) {
          return false;
       }
       if (this.mCallType != p0.mCallType || !(this.mMethod.getName()).equals(p0.mMethod.getName())) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return ((this.mCallType * 31) + (this.mMethod.getName()).hashCode());
    }
    public void invokeCallback(LifecycleOwner p0,Lifecycle$Event p1,Object p2){
       try{
          ClassesInfoCache$MethodReference tmCallType = this.mCallType;
          if (tmCallType != null) {
             if (tmCallType != 1) {
                int i = 2;
                if (tmCallType == i) {
                   Object[] objArray = new Object[i];
                   objArray[0] = p0;
                   objArray[1] = p1;
                   this.mMethod.invoke(p2, objArray);
                }
             }else {
                Object[] objArray1 = new Object[]{p0};
                this.mMethod.invoke(p2, objArray1);
             }
          }else {
             Object[] objArray2 = new Object[0];
             this.mMethod.invoke(p2, objArray2);
          }
          return;
       }catch(java.lang.reflect.InvocationTargetException e5){
          throw new RuntimeException("Failed to call observer method", e5.getCause());
       }catch(java.lang.IllegalAccessException e5){
          throw new RuntimeException(e5);
       }
    }
}
