package io.reactivex.internal.operators.observable.ObservableReplay$UnboundedReplayBuffer;
import io.reactivex.internal.operators.observable.ObservableReplay$e;
import java.util.ArrayList;
import java.lang.Object;
import io.reactivex.internal.util.NotificationLite;
import java.lang.Throwable;
import io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Integer;
import brd.y;

public final class ObservableReplay$UnboundedReplayBuffer extends ArrayList implements ObservableReplay$e	// class@001345
{
    public int size;
    public static final long serialVersionUID = 0x62057d556fa2a2d8;

    public void ObservableReplay$UnboundedReplayBuffer(int p0){
       super(p0);
    }
    public void complete(){
       this.add(NotificationLite.complete());
       this.size = this.size + 1;
    }
    public void error(Throwable p0){
       this.add(NotificationLite.error(p0));
       this.size = this.size + 1;
    }
    public void next(Object p0){
       this.add(NotificationLite.next(p0));
       this.size = this.size + 1;
    }
    public void replay(ObservableReplay$InnerDisposable p0){
       if (p0.getAndIncrement()) {
          return;
       }
       ObservableReplay$InnerDisposable child = p0.child;
       int i = 1;
       while (true) {
          if (p0.isDisposed()) {
          }else {
             ObservableReplay$UnboundedReplayBuffer tsize = this.size;
             Integer integer = p0.index();
             int i1 = (integer != null)? integer.intValue(): 0;
             while (true) {
                if (i1 < tsize) {
                   if (NotificationLite.accept(this.get(i1), child)) {
                      return;
                   }else if(p0.isDisposed()){
                      return;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   p0.index = Integer.valueOf(i1);
                   i = - i;
                   if (!p0.addAndGet(i)) {
                   }else {
                      continue ;
                   }
                }
             }
             return;
          }
       }
       return;
    }
}
