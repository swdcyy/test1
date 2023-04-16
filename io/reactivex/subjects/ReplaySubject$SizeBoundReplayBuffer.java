package io.reactivex.subjects.ReplaySubject$SizeBoundReplayBuffer;
import io.reactivex.subjects.ReplaySubject$a;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.subjects.ReplaySubject$Node;
import java.lang.Object;
import io.reactivex.internal.util.NotificationLite;
import java.lang.Class;
import java.lang.reflect.Array;
import io.reactivex.subjects.ReplaySubject$ReplayDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import brd.y;
import java.lang.Throwable;

public final class ReplaySubject$SizeBoundReplayBuffer extends AtomicReference implements ReplaySubject$a	// class@0014ef
{
    public boolean done;
    public ReplaySubject$Node head;
    public final int maxSize;
    public int size;
    public ReplaySubject$Node tail;
    public static final long serialVersionUID = 0xf5f291fe2c1030b;

    public void ReplaySubject$SizeBoundReplayBuffer(int p0){
       super();
       a.d(p0, "maxSize");
       this.maxSize = p0;
       ReplaySubject$Node node = new ReplaySubject$Node(null);
       this.tail = node;
       this.head = node;
    }
    public void add(Object p0){
       ReplaySubject$Node node = new ReplaySubject$Node(p0);
       p0 = this.tail;
       this.tail = node;
       this.size = this.size + 1;
       p0.set(node);
       this.trim();
    }
    public void addFinal(Object p0){
       ReplaySubject$Node node = new ReplaySubject$Node(p0);
       p0 = this.tail;
       this.tail = node;
       this.size = this.size + 1;
       p0.lazySet(node);
       this.trimHead();
       this.done = true;
    }
    public Object getValue(){
       ReplaySubject$Node value;
       ReplaySubject$SizeBoundReplayBuffer thead = this.head;
       Object obj = null;
       ReplaySubject$Node node = obj;
       ReplaySubject$Node node1 = thead.get();
       while (node1 != null) {
          node = thead;
          value = node1;
       }
       value = thead.value;
       if (value == null) {
          return obj;
       }
       if (NotificationLite.isComplete(value) || NotificationLite.isError(value)) {
          return node.value;
       }
       return value;
    }
    public Object[] getValues(Object[] p0){
       ReplaySubject$SizeBoundReplayBuffer thead = this.head;
       int i = this.size();
       int i1 = 0;
       if (!i) {
          if (p0.length) {
             p0[i1] = null;
          }
       }else if(p0.length < i){
          p0 = Array.newInstance(p0.getClass().getComponentType(), i);
       }
       while (i1 != i) {
          p0[i1] = thead.get().value;
          i1 = i1 + 1;
       }
       if (p0.length > i) {
          p0[i] = null;
       }
       return p0;
    }
    public void replay(ReplaySubject$ReplayDisposable p0){
       if (p0.getAndIncrement()) {
          return;
       }
       ReplaySubject$ReplayDisposable actual = p0.actual;
       ReplaySubject$ReplayDisposable index = p0.index;
       if (index == null) {
          index = this.head;
       }
       int i = 1;
       while (true) {
          if (p0.cancelled != null) {
             p0.index = null;
             return;
          }else {
             ReplaySubject$Node node = index.get();
             if (node == null) {
                if (index.get() != null) {
                   continue ;
                }else {
                   p0.index = index;
                   i = - i;
                   if (!p0.addAndGet(i)) {
                      return;
                   }
                }
             }else {
                ReplaySubject$Node value = node.value;
                if (this.done != null && node.get() == null) {
                   if (NotificationLite.isComplete(value)) {
                      actual.onComplete();
                      break ;
                   }else {
                      actual.onError(NotificationLite.getError(value));
                      break ;
                   }
                }else {
                   actual.onNext(value);
                   value = node;
                }
             }
          }
       }
       p0.index = null;
       p0.cancelled = true;
       return;
    }
    public int size(){
       ReplaySubject$Node value;
       ReplaySubject$SizeBoundReplayBuffer thead = this.head;
       int i = 0;
       while (i != Integer.MAX_VALUE) {
          ReplaySubject$Node node = thead.get();
          if (node == null) {
             value = thead.value;
             if (NotificationLite.isComplete(value) || NotificationLite.isError(value)) {
                i = i - 1;
                break ;
             }else {
                break ;
             }
          }else {
             i = i + 1;
             value = node;
          }
       }
       return i;
    }
    public void trim(){
       ReplaySubject$SizeBoundReplayBuffer tsize = this.size;
       if (tsize > this.maxSize) {
          this.size = tsize - 1;
          this.head = this.head.get();
       }
       return;
    }
    public void trimHead(){
       ReplaySubject$SizeBoundReplayBuffer thead = this.head;
       if (thead.value != null) {
          ReplaySubject$Node node = new ReplaySubject$Node(null);
          node.lazySet(thead.get());
          this.head = node;
       }
       return;
    }
}
