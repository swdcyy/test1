package androidx.activity.ImmLeaksCleaner;
import androidx.lifecycle.LifecycleEventObserver;
import android.app.Activity;
import java.lang.Object;
import android.view.inputmethod.InputMethodManager;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import android.view.View;

public final class ImmLeaksCleaner implements LifecycleEventObserver	// class@00054f
{
    public Activity b;
    public static int c;
    public static Field d;
    public static Field e;
    public static Field f;

    public void ImmLeaksCleaner(Activity p0){
       super();
       this.b = p0;
    }
    public static void a(){
       int i = 2;
       try{
          ImmLeaksCleaner.c = i;
          Field declaredFiel = InputMethodManager.class.getDeclaredField("mServedView");
          ImmLeaksCleaner.e = declaredFiel;
          declaredFiel.setAccessible(true);
          declaredFiel = InputMethodManager.class.getDeclaredField("mNextServedView");
          ImmLeaksCleaner.f = declaredFiel;
          declaredFiel.setAccessible(true);
          declaredFiel = InputMethodManager.class.getDeclaredField("mH");
          ImmLeaksCleaner.d = declaredFiel;
          declaredFiel.setAccessible(true);
          ImmLeaksCleaner.c = 1;
          return;
       }catch(java.lang.NoSuchFieldException e0){
       }
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (p1 != Lifecycle$Event.ON_DESTROY) {
          return;
       }
       if (!ImmLeaksCleaner.c) {
          ImmLeaksCleaner.a();
       }
       if (ImmLeaksCleaner.c == 1) {
          InputMethodManager systemServic = this.b.getSystemService("input_method");
          try{
             p1 = ImmLeaksCleaner.d.get(systemServic);
             if (p1 == null) {
                return;
             }else {
                _monitor_enter(p1);
                try{
                   View view = ImmLeaksCleaner.e.get(systemServic);
                   if (view == null) {
                      _monitor_exit(p1);
                      return;
                   }else if(view.isAttachedToWindow()){
                      _monitor_exit(p1);
                      return;
                   }else {
                      try{
                         ImmLeaksCleaner.f.set(systemServic, null);
                         _monitor_exit(p1);
                         systemServic.isActive();
                      }catch(java.lang.IllegalAccessException e0){
                         _monitor_exit(p1);
                         return;
                      }
                   }
                }catch(java.lang.IllegalAccessException e0){
                   _monitor_exit(p1);
                   return;
                }catch(java.lang.ClassCastException e0){
                   _monitor_exit(p1);
                   return;
                }
             }
          }catch(java.lang.IllegalAccessException e0){
          }
       }
       return;
    }
}
