package io.reactivex.internal.operators.observable.ObservableReplay$BoundedReplayBuffer;
import io.reactivex.internal.operators.observable.ObservableReplay$e;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableReplay$Node;
import java.lang.Object;
import java.util.Collection;
import io.reactivex.internal.util.NotificationLite;
import java.lang.Throwable;
import io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import brd.y;

public abstract class ObservableReplay$BoundedReplayBuffer extends AtomicReference implements ObservableReplay$e	// class@00133f
{
    public int size;
    public ObservableReplay$Node tail;
    public static final long serialVersionUID = 0x2090aef8efde5e9e;

    public void ObservableReplay$BoundedReplayBuffer(){
       super();
       ObservableReplay$Node node = new ObservableReplay$Node(null);
       this.tail = node;
       this.set(node);
    }
    public final void addLast(ObservableReplay$Node p0){
       this.tail.set(p0);
       this.tail = p0;
       this.size = this.size + 1;
    }
    public final void collect(Collection p0){
       ObservableReplay$Node head = this.getHead();
       head = head.get();
       while (head != null) {
          Object obj = this.leaveTransform(head.value);
          if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
             break ;
          }else {
             p0.add(NotificationLite.getValue(obj));
          }
       }
       return;
    }
    public final void complete(){
       this.addLast(new ObservableReplay$Node(this.enterTransform(NotificationLite.complete())));
       this.truncateFinal();
    }
    public Object enterTransform(Object p0){
       return p0;
    }
    public final void error(Throwable p0){
       this.addLast(new ObservableReplay$Node(this.enterTransform(NotificationLite.error(p0))));
       this.truncateFinal();
    }
    public ObservableReplay$Node getHead(){
       return this.get();
    }
    public boolean hasCompleted(){
       ObservableReplay$Node value = this.tail.value;
       boolean b = (value != null && NotificationLite.isComplete(this.leaveTransform(value)))? true: false;
       return b;
    }
    public boolean hasError(){
       ObservableReplay$Node value = this.tail.value;
       boolean b = (value != null && NotificationLite.isError(this.leaveTransform(value)))? true: false;
       return b;
    }
    public Object leaveTransform(Object p0){
       return p0;
    }
    public final void next(Object p0){
       this.addLast(new ObservableReplay$Node(this.enterTransform(NotificationLite.next(p0))));
       this.truncate();
    }
    public final void removeFirst(){
       this.size = this.size - 1;
       this.setFirst(this.get().get());
    }
    public final void removeSome(int p0){
       ObservableReplay$Node node = this.get();
       while (p0 > 0) {
          node = node.get();
          p0--;
          int i = this.size - 1;
          this.size = i;
       }
       this.setFirst(node);
       return;
    }
    public final void replay(ObservableReplay$InnerDisposable p0){
       if (p0.getAndIncrement()) {
          return;
       }
       int i = 1;
       do {
          ObservableReplay$Node node = p0.index();
          if (node == null) {
             node = this.getHead();
             p0.index = node;
          }
          while (true) {
             if (p0.isDisposed()) {
                return;
             }
             ObservableReplay$Node node1 = node.get();
             if (node1 != null) {
                if (NotificationLite.accept(this.leaveTransform(node1.value), p0.child)) {
                   p0.index = null;
                   return;
                }else {
                   node = node1;
                }
             }else {
                p0.index = node;
                i = - i;
                if (!p0.addAndGet(i)) {
                   break ;
                }else {
                   continue ;
                }
             }
          }
          return;
       } while (!p0.addAndGet(i));
    }
    public final void setFirst(ObservableReplay$Node p0){
       this.set(p0);
    }
    public final void trimHead(){
       ObservableReplay$Node node = this.get();
       if (node.value != null) {
          ObservableReplay$Node node1 = new ObservableReplay$Node(null);
          node1.lazySet(node.get());
          this.set(node1);
       }
       return;
    }
    public abstract void truncate();
    public void truncateFinal(){
       this.trimHead();
    }
}
