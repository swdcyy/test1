package io.reactivex.internal.operators.flowable.FlowableFromArray$ArrayConditionalSubscription;
import io.reactivex.internal.operators.flowable.FlowableFromArray$BaseArraySubscription;
import io.reactivex.internal.fuseable.a;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;
import cxd.c;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableFromArray$ArrayConditionalSubscription extends FlowableFromArray$BaseArraySubscription	// class@001232
{
    public final a actual;
    public static final long serialVersionUID = 0x23e7f25903d0c345;

    public void FlowableFromArray$ArrayConditionalSubscription(a p0,Object[] p1){
       super(p1);
       this.actual = p0;
    }
    public void fastPath(){
       FlowableFromArray$BaseArraySubscription tarray = this.array;
       int len = tarray.length;
       FlowableFromArray$ArrayConditionalSubscription tactual = this.actual;
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
                   tactual.d(oobject);
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
       FlowableFromArray$ArrayConditionalSubscription tactual = this.actual;
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
                   }else if(tactual.d(oobject)){
                      l = l + 1;
                   }
                   tindex = tindex + 1;
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
