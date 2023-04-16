package androidx.lifecycle.ClassesInfoCache$CallbackInfo;
import java.util.Map;
import java.lang.Object;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import androidx.lifecycle.Lifecycle$Event;
import java.util.List;
import java.util.ArrayList;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ClassesInfoCache$MethodReference;

public class ClassesInfoCache$CallbackInfo	// class@0007b7
{
    public final Map mEventToHandlers;
    public final Map mHandlerToEvent;

    public void ClassesInfoCache$CallbackInfo(Map p0){
       super();
       this.mHandlerToEvent = p0;
       this.mEventToHandlers = new HashMap();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Lifecycle$Event value = uEntry.getValue();
          List list = this.mEventToHandlers.get(value);
          if (list == null) {
             list = new ArrayList();
             this.mEventToHandlers.put(value, list);
          }
          list.add(uEntry.getKey());
       }
       return;
    }
    public static void invokeMethodsForEvent(List p0,LifecycleOwner p1,Lifecycle$Event p2,Object p3){
       if (p0 != null) {
          for (int i = p0.size() - 1; i >= 0; i = i - 1) {
             p0.get(i).invokeCallback(p1, p2, p3);
          }
       }
       return;
    }
    public void invokeCallbacks(LifecycleOwner p0,Lifecycle$Event p1,Object p2){
       ClassesInfoCache$CallbackInfo.invokeMethodsForEvent(this.mEventToHandlers.get(p1), p0, p1, p2);
       ClassesInfoCache$CallbackInfo.invokeMethodsForEvent(this.mEventToHandlers.get(Lifecycle$Event.ON_ANY), p0, p1, p2);
    }
}
