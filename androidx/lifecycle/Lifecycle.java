package androidx.lifecycle.Lifecycle;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Lifecycle$State;

public abstract class Lifecycle	// class@000248
{
    public AtomicReference mInternalScopeRef;

    public void Lifecycle(){
       super();
       this.mInternalScopeRef = new AtomicReference();
    }
    public abstract void addObserver(LifecycleObserver p0);
    public abstract Lifecycle$State getCurrentState();
    public abstract void removeObserver(LifecycleObserver p0);
}
