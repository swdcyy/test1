package io.reactivex.internal.operators.flowable.FlowableFromIterable$IteratorSubscription;
import io.reactivex.internal.operators.flowable.FlowableFromIterable$BaseRangeSubscription;
import cxd.c;
import java.util.Iterator;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;
import drd.a;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableFromIterable$IteratorSubscription extends FlowableFromIterable$BaseRangeSubscription	// class@001238
{
    public final c actual;
    public static final long serialVersionUID = 0xac6ab341e79abf01;

    public void FlowableFromIterable$IteratorSubscription(c p0,Iterator p1){
       super(p1);
       this.actual = p0;
    }
    public void fastPath(){
       FlowableFromIterable$BaseRangeSubscription tit = this.it;
       FlowableFromIterable$IteratorSubscription tactual = this.actual;
       while (true) {
          if (this.cancelled != null) {
             return;
          }
          Object obj = tit.next();
          if (this.cancelled != null) {
             return;
          }
          if (obj == null) {
             tactual.onError(new NullPointerException("Iterator.next\(\) returned a null value"));
             return;
          }else {
             tactual.onNext(obj);
             if (this.cancelled != null) {
                return;
             }
             if (!tit.hasNext()) {
                if (this.cancelled == null) {
                   tactual.onComplete();
                   break ;
                }
                break ;
             }
          }
       }
       return;
    }
    public void slowPath(long p0){
       FlowableFromIterable$BaseRangeSubscription tit = this.it;
       FlowableFromIterable$IteratorSubscription tactual = this.actual;
       int i = 0;
       while (true) {
          long l = i;
          while (true) {
             if (l - p0) {
                if (this.cancelled != null) {
                   return;
                }
                Object obj = tit.next();
                if (this.cancelled != null) {
                   return;
                }
                if (obj == null) {
                   tactual.onError(new NullPointerException("Iterator.next\(\) returned a null value"));
                   return;
                }else {
                   tactual.onNext(obj);
                   if (this.cancelled != null) {
                      return;
                   }
                   if (!tit.hasNext()) {
                      if (this.cancelled == null) {
                         tactual.onComplete();
                         break ;
                      }
                      break ;
                   }else {
                      l = l + 1;
                   }
                }
             }else {
                p0 = this.get();
                if (!l - p0) {
                   p0 = - l;
                   p0 = this.addAndGet(p0);
                   if (!p0 - i) {
                      return;
                   }
                   continue ;
                }
             }
          }
          return;
       }
    }
}
