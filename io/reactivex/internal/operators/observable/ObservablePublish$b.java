package io.reactivex.internal.operators.observable.ObservablePublish$b;
import brd.w;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import brd.y;
import io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable;
import crd.b;
import io.reactivex.internal.operators.observable.ObservablePublish$a;
import java.lang.System;

public final class ObservablePublish$b implements w	// class@00132c
{
    public final AtomicReference b;

    public void ObservablePublish$b(AtomicReference p0){
       super();
       this.b = p0;
    }
    public void subscribe(y p0){
       ObservablePublish$a uoa;
       ObservablePublish$InnerDisposable innerDisposa = new ObservablePublish$InnerDisposable(p0);
       p0.onSubscribe(innerDisposa);
       while (true) {
          uoa = this.b.get();
          if (uoa == null || uoa.isDisposed()) {
             ObservablePublish$a uoa1 = new ObservablePublish$a(this.b);
             if (!this.b.compareAndSet(uoa, uoa1)) {
                continue ;
             }else {
                uoa = uoa1;
             }
          }
          ObservablePublish$InnerDisposable[] innerDisposa1 = uoa.c.get();
          int i = 0;
          while (innerDisposa1 != ObservablePublish$a.g) {
             int len = innerDisposa1.length;
             int i1 = len + 1;
             ObservablePublish$InnerDisposable[] innerDisposa2 = new ObservablePublish$InnerDisposable[i1];
             System.arraycopy(innerDisposa1, i, innerDisposa2, i, len);
             innerDisposa2[len] = innerDisposa;
             if (uoa.c.compareAndSet(innerDisposa1, innerDisposa2)) {
                i = 1;
             }else {
                continue ;
             }
          }
          if (i) {
          }
       }
       innerDisposa.setParent(uoa);
       return;
    }
}
