package androidx.activity.OnBackPressedDispatcher;
import java.lang.Runnable;
import java.lang.Object;
import java.util.ArrayDeque;
import androidx.lifecycle.LifecycleOwner;
import o0.b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import o0.a;
import androidx.activity.OnBackPressedDispatcher$a;
import java.util.Iterator;

public final class OnBackPressedDispatcher	// class@000552
{
    public final Runnable a;
    public final ArrayDeque b;

    public void OnBackPressedDispatcher(){
       super(null);
    }
    public void OnBackPressedDispatcher(Runnable p0){
       super();
       this.b = new ArrayDeque();
       this.a = p0;
    }
    public void a(LifecycleOwner p0,b p1){
       Lifecycle lifecycle = p0.getLifecycle();
       if (lifecycle.getCurrentState() == Lifecycle$State.DESTROYED) {
          return;
       }
       p1.a(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, p1));
       return;
    }
    public void b(b p0){
       this.c(p0);
    }
    public a c(b p0){
       this.b.add(p0);
       OnBackPressedDispatcher$a uoa = new OnBackPressedDispatcher$a(this, p0);
       p0.a(uoa);
       return uoa;
    }
    public void d(){
       Iterator iterator = this.b.descendingIterator();
       while (true) {
          if (iterator.hasNext()) {
             b uob = iterator.next();
             if (uob.c()) {
                uob.b();
                return;
             }
          }else {
             OnBackPressedDispatcher ta = this.a;
             if (ta != null) {
                ta.run();
                break ;
             }
             break ;
          }
       }
       return;
    }
}
