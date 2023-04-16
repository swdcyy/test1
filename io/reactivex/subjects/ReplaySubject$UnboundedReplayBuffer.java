package io.reactivex.subjects.ReplaySubject$UnboundedReplayBuffer;
import io.reactivex.subjects.ReplaySubject$a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.lang.Object;
import java.util.List;
import io.reactivex.internal.util.NotificationLite;
import java.lang.Class;
import java.lang.reflect.Array;
import io.reactivex.subjects.ReplaySubject$ReplayDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Integer;
import brd.y;
import java.lang.Throwable;

public final class ReplaySubject$UnboundedReplayBuffer extends AtomicReference implements ReplaySubject$a	// class@0014f0
{
    public final List buffer;
    public boolean done;
    public int size;
    public static final long serialVersionUID = 0xf5d0bf9738c41b4d;

    public void ReplaySubject$UnboundedReplayBuffer(int p0){
       super();
       a.d(p0, "capacityHint");
       this.buffer = new ArrayList(p0);
    }
    public void add(Object p0){
       this.buffer.add(p0);
       this.size = this.size + 1;
    }
    public void addFinal(Object p0){
       this.buffer.add(p0);
       this.trimHead();
       this.size = this.size + 1;
       this.done = true;
    }
    public Object getValue(){
       ReplaySubject$UnboundedReplayBuffer tsize = this.size;
       if (tsize == null) {
          return null;
       }
       ReplaySubject$UnboundedReplayBuffer tbuffer = this.buffer;
       Object obj = tbuffer.get((tsize - 1));
       if (!NotificationLite.isComplete(obj) && !NotificationLite.isError(obj)) {
          return obj;
       }
       if (tsize == 1) {
          return null;
       }
       return tbuffer.get((tsize - 2));
    }
    public Object[] getValues(Object[] p0){
       ReplaySubject$UnboundedReplayBuffer tsize = this.size;
       int i = 0;
       if (tsize == null) {
          if (p0.length) {
             p0[i] = null;
          }
          return p0;
       }else {
          ReplaySubject$UnboundedReplayBuffer tbuffer = this.buffer;
          int i1 = tsize - 1;
          Object obj = tbuffer.get(i1);
          if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
             tsize = tsize - 1;
             if (!tsize) {
                if (p0.length) {
                   p0[i] = null;
                }
                return p0;
             }
          }
          if (p0.length < tsize) {
             p0 = Array.newInstance(p0.getClass().getComponentType(), tsize);
          }
          while (i < tsize) {
             p0[i] = tbuffer.get(i);
             i = i + 1;
          }
          if (p0.length > tsize) {
             p0[tsize] = null;
          }
          return p0;
       }
    }
    public void replay(ReplaySubject$ReplayDisposable p0){
       if (p0.getAndIncrement()) {
          return;
       }
       ReplaySubject$UnboundedReplayBuffer tbuffer = this.buffer;
       ReplaySubject$ReplayDisposable actual = p0.actual;
       ReplaySubject$ReplayDisposable index = p0.index;
       int i = 0;
       if (index != null) {
          i = index.intValue();
       }else {
          p0.index = Integer.valueOf(i);
       }
       int i1 = 1;
       while (true) {
          if (p0.cancelled != null) {
             p0.index = null;
             return;
          }else {
             ReplaySubject$UnboundedReplayBuffer tsize = this.size;
             while (true) {
                if (tsize != i) {
                   if (p0.cancelled != null) {
                      p0.index = null;
                      return;
                   }else {
                      Object obj = tbuffer.get(i);
                      if (this.done != null) {
                         int i2 = i + 1;
                         if (i2 == tsize) {
                            tsize = this.size;
                            if (i2 == tsize) {
                               if (NotificationLite.isComplete(obj)) {
                                  actual.onComplete();
                                  break ;
                               }else {
                                  actual.onError(NotificationLite.getError(obj));
                                  break ;
                               }
                            }
                         }
                      }
                      actual.onNext(obj);
                      i = i + 1;
                   }
                }else if(i != this.size){
                   continue ;
                }else {
                   p0.index = Integer.valueOf(i);
                   i1 = - i1;
                   if (!p0.addAndGet(i1)) {
                      return;
                   }else {
                      continue ;
                   }
                }
             }
             p0.index = null;
             p0.cancelled = true;
             return;
          }
       }
    }
    public int size(){
       ReplaySubject$UnboundedReplayBuffer tsize = this.size;
       if (tsize == null) {
          return 0;
       }
       int i = tsize - 1;
       Object obj = this.buffer.get(i);
       if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
          return i;
       }
       return tsize;
    }
    public void trimHead(){
    }
}
