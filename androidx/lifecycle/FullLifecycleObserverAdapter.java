package androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.FullLifecycleObserver;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.FullLifecycleObserverAdapter$1;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class FullLifecycleObserverAdapter implements LifecycleEventObserver	// class@000243
{
    public final FullLifecycleObserver mFullLifecycleObserver;
    public final LifecycleEventObserver mLifecycleEventObserver;

    public void FullLifecycleObserverAdapter(FullLifecycleObserver p0,LifecycleEventObserver p1){
       super();
       this.mFullLifecycleObserver = p0;
       this.mLifecycleEventObserver = p1;
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       switch (FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[p1.ordinal()]){
           case 1:
             this.mFullLifecycleObserver.onCreate(p0);
          label_0037 :
             FullLifecycleObserverAdapter tmLifecycleE = this.mLifecycleEventObserver;
             if (tmLifecycleE != null) {
                tmLifecycleE.onStateChanged(p0, p1);
             }
             return;
             break;
           case 2:
             this.mFullLifecycleObserver.onStart(p0);
             goto label_0037 ;
             break;
           case 3:
             this.mFullLifecycleObserver.onResume(p0);
             goto label_0037 ;
             break;
           case 4:
             this.mFullLifecycleObserver.onPause(p0);
             goto label_0037 ;
             break;
           case 5:
             this.mFullLifecycleObserver.onStop(p0);
             goto label_0037 ;
             break;
           case 6:
             this.mFullLifecycleObserver.onDestroy(p0);
             goto label_0037 ;
             break;
           case 7:
           default:
             goto label_0037 ;
       }
       throw new IllegalArgumentException("ON_ANY must not been send by anybody");
    }
}
