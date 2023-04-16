package androidx.savedstate.Recreator;
import androidx.lifecycle.GenericLifecycleObserver;
import y2.b;
import java.lang.Object;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Class;
import androidx.savedstate.SavedStateRegistry$a;
import java.lang.reflect.Constructor;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.savedstate.SavedStateRegistry;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.AssertionError;

public final class Recreator implements GenericLifecycleObserver	// class@000985
{
    public final b b;

    public void Recreator(b p0){
       super();
       this.b = p0;
    }
    public final void a(String p0){
       Constructor declaredCons;
       try{
          boolean b = false;
          Class uClass = Class.forName(p0, b, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry$a.class);
          try{
             Class[] uClassArray = new Class[b];
             declaredCons = uClass.getDeclaredConstructor(uClassArray);
             boolean b1 = true;
             try{
                declaredCons.setAccessible(b1);
                Object[] objArray = new Object[b];
                declaredCons.newInstance(objArray).a(this.b);
                return;
             }catch(java.lang.Exception e0){
                throw new RuntimeException("Failed to instantiate "+p0, e0);
             }
          }catch(java.lang.NoSuchMethodException e5){
             throw new IllegalStateException("Class"+declaredCons.getSimpleName()+" must have default constructor in order to be automatically recreated", e5);
          }
       }catch(java.lang.ClassNotFoundException e0){
          throw new RuntimeException("Class "+p0+" wasn\'t found", e0);
       }
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (p1 != Lifecycle$Event.ON_CREATE) {
          throw new AssertionError("Next event must be ON_CREATE");
       }
       p0.getLifecycle().removeObserver(this);
       Bundle uBundle = this.b.getSavedStateRegistry().a("androidx.savedstate.Restarter");
       if (uBundle == null) {
          return;
       }
       ArrayList stringArrayL = uBundle.getStringArrayList("classes_to_restore");
       if (stringArrayL == null) {
          throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
       }
       Iterator iterator = stringArrayL.iterator();
       while (iterator.hasNext()) {
          this.a(iterator.next());
       }
       return;
    }
}
