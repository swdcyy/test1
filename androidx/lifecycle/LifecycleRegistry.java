package androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import y0.a;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import java.lang.Object;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.LifecycleRegistry$1;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleRegistry$ObserverWithState;
import java.util.Iterator;
import y0.b;
import y0.b$e;
import java.util.Map$Entry;
import y0.b$c;
import y0.b$d;
import java.lang.IllegalStateException;

public class LifecycleRegistry extends Lifecycle	// class@00024e
{
    public int mAddingObserverCounter;
    public boolean mHandlingEvent;
    public final WeakReference mLifecycleOwner;
    public boolean mNewEventOccurred;
    public a mObserverMap;
    public ArrayList mParentStates;
    public Lifecycle$State mState;

    public void LifecycleRegistry(LifecycleOwner p0){
       super();
       this.mObserverMap = new a();
       this.mAddingObserverCounter = 0;
       this.mHandlingEvent = false;
       this.mNewEventOccurred = false;
       this.mParentStates = new ArrayList();
       this.mLifecycleOwner = new WeakReference(p0);
       this.mState = Lifecycle$State.INITIALIZED;
    }
    public static Lifecycle$Event downEvent(Lifecycle$State p0){
       int i = LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[p0.ordinal()];
       if (i == 1) {
          throw new IllegalArgumentException();
       }
       if (i == 2) {
          return Lifecycle$Event.ON_DESTROY;
       }
       if (i == 3) {
          return Lifecycle$Event.ON_STOP;
       }
       if (i == 4) {
          return Lifecycle$Event.ON_PAUSE;
       }
       if (i != 5) {
          throw new IllegalArgumentException("Unexpected state value "+p0);
       }
       throw new IllegalArgumentException();
    }
    public static Lifecycle$State getStateAfter(Lifecycle$Event p0){
       switch (LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[p0.ordinal()]){
           case 1:
           case 2:
             return Lifecycle$State.CREATED;
           case 3:
           case 4:
             return Lifecycle$State.STARTED;
           case 5:
             return Lifecycle$State.RESUMED;
           case 6:
             return Lifecycle$State.DESTROYED;
           default:
             throw new IllegalArgumentException("Unexpected event value "+p0);
       }
    }
    public static Lifecycle$State min(Lifecycle$State p0,Lifecycle$State p1){
       if (p1 != null && p1.compareTo(p0) < 0) {
          p0 = p1;
       }
       return p0;
    }
    public static Lifecycle$Event upEvent(Lifecycle$State p0){
       int i = LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i != 5) {
                      throw new IllegalArgumentException("Unexpected state value "+p0);
                   }
                }else {
                   throw new IllegalArgumentException();
                }
             }else {
                return Lifecycle$Event.ON_RESUME;
             }
          }else {
             return Lifecycle$Event.ON_START;
          }
       }
       return Lifecycle$Event.ON_CREATE;
    }
    public void addObserver(LifecycleObserver p0){
       int i;
       Lifecycle$State dESTROYED = Lifecycle$State.DESTROYED;
       if (this.mState == dESTROYED) {
       }else {
          dESTROYED = Lifecycle$State.INITIALIZED;
       }
       LifecycleRegistry$ObserverWithState observerWith = new LifecycleRegistry$ObserverWithState(p0, dESTROYED);
       if (this.mObserverMap.p(p0, observerWith) != null) {
          return;
       }else {
          LifecycleOwner lifecycleOwn = this.mLifecycleOwner.get();
          if (lifecycleOwn == null) {
             return;
          }else if(this.mAddingObserverCounter != null || this.mHandlingEvent != null){
             i = 1;
          }else {
             i = 0;
          }
          this.mAddingObserverCounter = this.mAddingObserverCounter + 1;
          for (Lifecycle$State state = this.calculateTargetState(p0); observerWith.mState.compareTo(state) < 0 && this.mObserverMap.contains(p0); state = this.calculateTargetState(p0)) {
             this.pushParentState(observerWith.mState);
             observerWith.dispatchEvent(lifecycleOwn, LifecycleRegistry.upEvent(observerWith.mState));
             this.popParentState();
          }
          if (!i) {
             this.sync();
          }
          this.mAddingObserverCounter = this.mAddingObserverCounter - 1;
          return;
       }
    }
    public final void backwardPass(LifecycleOwner p0){
       Iterator iterator = this.mObserverMap.descendingIterator();
       Iterator iterator1 = iterator;
       while (iterator1.hasNext() && this.mNewEventOccurred == null) {
          Map$Entry uEntry = iterator1.next();
          LifecycleRegistry$ObserverWithState value = uEntry.getValue();
          while (value.mState.compareTo(this.mState) > 0 && (this.mNewEventOccurred == null && this.mObserverMap.contains(uEntry.getKey()))) {
             Lifecycle$Event uEvent = LifecycleRegistry.downEvent(value.mState);
             this.pushParentState(LifecycleRegistry.getStateAfter(uEvent));
             value.dispatchEvent(p0, uEvent);
             this.popParentState();
          }
       }
       return;
    }
    public final Lifecycle$State calculateTargetState(LifecycleObserver p0){
       Map$Entry uEntry = this.mObserverMap.r(p0);
       LifecycleRegistry lifecycleReg = null;
       LifecycleRegistry$ObserverWithState mState = (uEntry != null)? uEntry.getValue().mState: lifecycleReg;
       if (!this.mParentStates.isEmpty()) {
          lifecycleReg = this.mParentStates;
          lifecycleReg = lifecycleReg.get((lifecycleReg.size() - 1));
       }
       return LifecycleRegistry.min(LifecycleRegistry.min(this.mState, mState), lifecycleReg);
    }
    public final void forwardPass(LifecycleOwner p0){
       b$d uod = this.mObserverMap.l();
       while (uod.hasNext() && this.mNewEventOccurred == null) {
          Map$Entry uEntry = uod.next();
          LifecycleRegistry$ObserverWithState value = uEntry.getValue();
          while (value.mState.compareTo(this.mState) < 0 && (this.mNewEventOccurred == null && this.mObserverMap.contains(uEntry.getKey()))) {
             this.pushParentState(value.mState);
             value.dispatchEvent(p0, LifecycleRegistry.upEvent(value.mState));
             this.popParentState();
          }
       }
       return;
    }
    public Lifecycle$State getCurrentState(){
       return this.mState;
    }
    public int getObserverCount(){
       return this.mObserverMap.size();
    }
    public void handleLifecycleEvent(Lifecycle$Event p0){
       this.moveToState(LifecycleRegistry.getStateAfter(p0));
    }
    public final boolean isSynced(){
       boolean b = true;
       if (!this.mObserverMap.size()) {
          return b;
       }
       LifecycleRegistry$ObserverWithState mState = this.mObserverMap.m().getValue().mState;
       if (this.mObserverMap.b().getValue().mState != mState || this.mState != mState) {
          b = false;
       }
       return b;
    }
    public void markState(Lifecycle$State p0){
       this.setCurrentState(p0);
    }
    public final void moveToState(Lifecycle$State p0){
       if (this.mState == p0) {
          return;
       }
       this.mState = p0;
       if (this.mHandlingEvent != null || this.mAddingObserverCounter != null) {
          this.mNewEventOccurred = true;
          return;
       }else {
          this.mHandlingEvent = true;
          this.sync();
          this.mHandlingEvent = false;
          return;
       }
    }
    public final void popParentState(){
       LifecycleRegistry tmParentStat = this.mParentStates;
       tmParentStat.remove((tmParentStat.size() - 1));
    }
    public final void pushParentState(Lifecycle$State p0){
       this.mParentStates.add(p0);
    }
    public void removeObserver(LifecycleObserver p0){
       this.mObserverMap.q(p0);
    }
    public void setCurrentState(Lifecycle$State p0){
       this.moveToState(p0);
    }
    public final void sync(){
       LifecycleOwner lifecycleOwn = this.mLifecycleOwner.get();
       if (lifecycleOwn == null) {
       label_0053 :
          throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
       }
       boolean b = false;
       while (!this.isSynced()) {
          this.mNewEventOccurred = b;
          if (this.mState.compareTo(this.mObserverMap.b().getValue().mState) < 0) {
             this.backwardPass(lifecycleOwn);
          }
          Map$Entry uEntry = this.mObserverMap.m();
          if (this.mNewEventOccurred == null && (uEntry != null && this.mState.compareTo(uEntry.getValue().mState) > 0)) {
             this.forwardPass(lifecycleOwn);
          }
       }
       this.mNewEventOccurred = b;
       return;
    }
}
