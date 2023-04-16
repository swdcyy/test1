package io.reactivex.internal.operators.flowable.FlowableFromArray$ArraySubscription;
import io.reactivex.internal.operators.flowable.FlowableFromArray$BaseArraySubscription;
import cxd.c;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableFromArray$ArraySubscription extends FlowableFromArray$BaseArraySubscription	// class@001233
{
    public final c actual;
    public static final long serialVersionUID = 0x23e7f25903d0c345;

    public void FlowableFromArray$ArraySubscription(c p0,Object[] p1){
       super(p1);
       this.actual = p0;
    }
    public void fastPath(){
       FlowableFromArray$BaseArraySubscription tarray = this.array;
       int len = tarray.length;
       FlowableFromArray$ArraySubscription tactual = this.actual;
       FlowableFromArray$BaseArraySubscription tindex = this.index;
       while (true) {
          if (tindex != len) {
             if (this.cancelled != null) {
                break ;
             }else {
                object oobject = tarray[tindex];
                if (oobject == null) {
                   tactual.onError(new NullPointerException("array element is null"));
                   return;
                }else {
                   tactual.onNext(oobject);
                   tindex = tindex + 1;
                }
             }
          }else if(this.cancelled != null){
             return;
          }else {
             tactual.onComplete();
             return;
          }
       }
       return;
    }
    public void slowPath(long p0){
       FlowableFromArray$BaseArraySubscription tarray = this.array;
       int len = tarray.length;
       FlowableFromArray$BaseArraySubscription tindex = this.index;
       FlowableFromArray$ArraySubscription tactual = this.actual;
       int i = 0;
       while (true) {
          long l = i;
          while (true) {
             if (l - p0 && tindex != len) {
                if (this.cancelled != null) {
                   return;
                }else {
                   object oobject = tarray[tindex];
                   if (oobject == null) {
                      tactual.onError(new NullPointerException("array element is null"));
                      return;
                   }else {
                      tactual.onNext(oobject);
                      l = l + 1;
                      tindex = tindex + 1;
                   }
                }
             }else if(tindex == len){
                if (this.cancelled == null) {
                   tactual.onComplete();
                   break ;
                }
                break ;
             }else {
                p0 = this.get();
                if (!l - p0) {
                   this.index = tindex;
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
