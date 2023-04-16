package io.reactivex.internal.operators.observable.ObservableReplay$SizeAndTimeBoundReplayBuffer;
import io.reactivex.internal.operators.observable.ObservableReplay$BoundedReplayBuffer;
import java.util.concurrent.TimeUnit;
import brd.z;
import java.lang.Object;
import lrd.c;
import io.reactivex.internal.operators.observable.ObservableReplay$Node;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.util.NotificationLite;

public final class ObservableReplay$SizeAndTimeBoundReplayBuffer extends ObservableReplay$BoundedReplayBuffer	// class@001343
{
    public final int limit;
    public final long maxAge;
    public final z scheduler;
    public final TimeUnit unit;
    public static final long serialVersionUID = 0x2ffd21f3bea38aac;

    public void ObservableReplay$SizeAndTimeBoundReplayBuffer(int p0,long p1,TimeUnit p2,z p3){
       super();
       this.scheduler = p3;
       this.limit = p0;
       this.maxAge = p1;
       this.unit = p2;
    }
    public Object enterTransform(Object p0){
       return new c(p0, this.scheduler.c(this.unit), this.unit);
    }
    public ObservableReplay$Node getHead(){
       long l = this.scheduler.c(this.unit) - this.maxAge;
       ObservableReplay$Node node = this.get();
       ObservableReplay$Node node1 = node.get();
       node1 = node;
       node = node1;
       while (node != null) {
          ObservableReplay$Node value = node.value;
          if (NotificationLite.isComplete(value.b()) || (!NotificationLite.isError(value.b()) && value.a() - l <= 0)) {
             node1 = node.get();
          }else {
             break ;
          }
       }
    label_0045 :
       return node1;
    }
    public Object leaveTransform(Object p0){
       return p0.b();
    }
    public void truncate(){
       long l = this.scheduler.c(this.unit) - this.maxAge;
       ObservableReplay$Node node = this.get();
       ObservableReplay$Node node1 = node.get();
       int i = 0;
       while (true) {
          node1 = node;
          node = node1;
          if (node != null) {
             ObservableReplay$BoundedReplayBuffer tsize = this.size;
             if (tsize > this.limit) {
                i = i + 1;
                int i1 = tsize - 1;
                this.size = i1;
                node1 = node.get();
             }else if(node.value.a() - l <= 0){
                i = i + 1;
                int i2 = this.size - 1;
                this.size = i2;
                node1 = node.get();
             }else if(i){
                this.setFirst(node1);
                break ;
             }
             break ;
          }else {
             goto label_004b ;
          }
       }
       return;
    }
    public void truncateFinal(){
       long l = this.scheduler.c(this.unit) - this.maxAge;
       ObservableReplay$Node node = this.get();
       ObservableReplay$Node node1 = node.get();
       int i = 0;
       node1 = node;
       node = node1;
       while (node != null && (this.size > 1 && node.value.a() - l <= 0)) {
          i = i + 1;
          int i1 = this.size - 1;
          this.size = i1;
          node1 = node.get();
       }
       if (i) {
          this.setFirst(node1);
       }
       return;
    }
}
