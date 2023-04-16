package io.reactivex.processors.ReplayProcessor;
import jrd.a;
import java.lang.Object;
import io.reactivex.processors.ReplayProcessor$ReplaySubscription;
import io.reactivex.processors.ReplayProcessor$a;
import java.util.concurrent.atomic.AtomicReference;
import cxd.c;
import cxd.d;
import java.lang.System;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import ird.a;

public final class ReplayProcessor extends a	// class@0014e5
{
    public final ReplayProcessor$a c;
    public boolean d;
    public final AtomicReference e;
    public static final Object[] f;
    public static final ReplayProcessor$ReplaySubscription[] g;
    public static final ReplayProcessor$ReplaySubscription[] h;

    static {
       Object[] objArray = new Object[0];
       ReplayProcessor.f = objArray;
       ReplayProcessor$ReplaySubscription[] replaySubscr = new ReplayProcessor$ReplaySubscription[0];
       ReplayProcessor.g = replaySubscr;
       ReplayProcessor$ReplaySubscription[] replaySubscr1 = new ReplayProcessor$ReplaySubscription[0];
       ReplayProcessor.h = replaySubscr1;
    }
    public void ReplayProcessor(ReplayProcessor$a p0){
       super();
       this.c = p0;
       this.e = new AtomicReference(ReplayProcessor.g);
    }
    public void D(c p0){
       ReplayProcessor$ReplaySubscription replaySubscr = new ReplayProcessor$ReplaySubscription(p0, this);
       p0.onSubscribe(replaySubscr);
       while (true) {
          ReplayProcessor$ReplaySubscription[] replaySubscr1 = this.e.get();
          int i = 0;
          if (replaySubscr1 != ReplayProcessor.h) {
             int len = replaySubscr1.length;
             int i1 = len + 1;
             ReplayProcessor$ReplaySubscription[] replaySubscr2 = new ReplayProcessor$ReplaySubscription[i1];
             System.arraycopy(replaySubscr1, i, replaySubscr2, i, len);
             replaySubscr2[len] = replaySubscr;
             if (this.e.compareAndSet(replaySubscr1, replaySubscr2)) {
                i = 1;
             }
          }
          if (i && replaySubscr.cancelled != null) {
             break ;
          }else {
             this.c.a(replaySubscr);
             return;
          }
       }
       this.M(replaySubscr);
       return;
    }
    public Throwable I(){
       ReplayProcessor tc = this.c;
       if (tc.isDone()) {
          return tc.getError();
       }
       return null;
    }
    public boolean J(){
       ReplayProcessor tc = this.c;
       boolean b = (tc.isDone() && tc.getError() == null)? true: false;
       return b;
    }
    public boolean K(){
       boolean b = (this.e.get().length)? true: false;
       return b;
    }
    public boolean L(){
       ReplayProcessor tc = this.c;
       boolean b = (tc.isDone() && tc.getError() != null)? true: false;
       return b;
    }
    public void M(ReplayProcessor$ReplaySubscription p0){
       ReplayProcessor$ReplaySubscription[] g;
       ReplayProcessor$ReplaySubscription[] replaySubscr = this.e.get();
       while (replaySubscr != ReplayProcessor.h && replaySubscr != ReplayProcessor.g) {
          int len = replaySubscr.length;
          ReplayProcessor replayProces = null;
          int i = 0;
          while (true) {
             if (i < len) {
                if (replaySubscr[i] == p0) {
                label_001f :
                   if (i < 0) {
                      return;
                   }
                   object oobject = 1;
                   if (len == oobject) {
                      g = ReplayProcessor.g;
                   }else {
                      int i1 = len - 1;
                      ReplayProcessor$ReplaySubscription[] replaySubscr1 = new ReplayProcessor$ReplaySubscription[i1];
                      System.arraycopy(replaySubscr, replayProces, replaySubscr1, replayProces, i);
                      int i2 = i + 1;
                      len = len - i;
                      len = len - oobject;
                      System.arraycopy(replaySubscr, i2, replaySubscr1, i, len);
                      g = replaySubscr1;
                   }
                   if (this.e.compareAndSet(replaySubscr, g)) {
                      break ;
                   }
                }else {
                   i = i + 1;
                }
             }else {
                i = -1;
                goto label_001f ;
             }
          }
          return;
       }
    }
    public void onComplete(){
       if (this.d != null) {
          return;
       }
       this.d = true;
       ReplayProcessor tc = this.c;
       tc.complete();
       ReplayProcessor$ReplaySubscription[] andSet = this.e.getAndSet(ReplayProcessor.h);
       int len = andSet.length;
       for (int i = 0; i < len; i = i + 1) {
          tc.a(andSet[i]);
       }
       return;
    }
    public void onError(Throwable p0){
       a.c(p0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
       if (this.d != null) {
          a.l(p0);
          return;
       }else {
          this.d = true;
          ReplayProcessor tc = this.c;
          tc.error(p0);
          ReplayProcessor$ReplaySubscription[] andSet = this.e.getAndSet(ReplayProcessor.h);
          int len = andSet.length;
          for (int i = 0; i < len; i = i + 1) {
             tc.a(andSet[i]);
          }
          return;
       }
    }
    public void onNext(Object p0){
       a.c(p0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
       if (this.d != null) {
          return;
       }
       ReplayProcessor tc = this.c;
       tc.next(p0);
       p0 = this.e.get();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          tc.a(p0[i]);
       }
       return;
    }
    public void onSubscribe(d p0){
       if (this.d != null) {
          p0.cancel();
          return;
       }else {
          p0.request(Long.MAX_VALUE);
          return;
       }
    }
}
