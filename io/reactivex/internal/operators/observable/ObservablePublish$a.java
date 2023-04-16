package io.reactivex.internal.operators.observable.ObservablePublish$a;
import brd.y;
import crd.b;
import io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.System;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import ird.a;

public final class ObservablePublish$a implements y, b	// class@00132b
{
    public final AtomicReference b;
    public final AtomicReference c;
    public final AtomicBoolean d;
    public final AtomicReference e;
    public static final ObservablePublish$InnerDisposable[] f;
    public static final ObservablePublish$InnerDisposable[] g;

    static {
       ObservablePublish$InnerDisposable[] innerDisposa = new ObservablePublish$InnerDisposable[0];
       ObservablePublish$a.f = innerDisposa;
       ObservablePublish$InnerDisposable[] innerDisposa1 = new ObservablePublish$InnerDisposable[0];
       ObservablePublish$a.g = innerDisposa1;
    }
    public void ObservablePublish$a(AtomicReference p0){
       super();
       this.e = new AtomicReference();
       this.c = new AtomicReference(ObservablePublish$a.f);
       this.b = p0;
       this.d = new AtomicBoolean();
    }
    public void a(ObservablePublish$InnerDisposable p0){
       ObservablePublish$InnerDisposable[] f;
       while (true) {
          ObservablePublish$InnerDisposable[] innerDisposa = this.c.get();
          int len = innerDisposa.length;
          if (!len) {
          }else {
             ObservablePublish$a uoa = null;
             int i = 0;
             while (true) {
                if (i < len) {
                   if (innerDisposa[i].equals(p0)) {
                   label_001d :
                      if (i < 0) {
                         return;
                      }
                      object oobject = 1;
                      if (len == oobject) {
                         f = ObservablePublish$a.f;
                      }else {
                         int i1 = len - 1;
                         ObservablePublish$InnerDisposable[] innerDisposa1 = new ObservablePublish$InnerDisposable[i1];
                         System.arraycopy(innerDisposa, uoa, innerDisposa1, uoa, i);
                         int i2 = i + 1;
                         len = len - i;
                         len = len - oobject;
                         System.arraycopy(innerDisposa, i2, innerDisposa1, i, len);
                         f = innerDisposa1;
                      }
                      if (this.c.compareAndSet(innerDisposa, f)) {
                      }
                   }else {
                      i = i + 1;
                   }
                }else {
                   i = -1;
                   goto label_001d ;
                }
             }
             return;
          }
       }
       return;
    }
    public void dispose(){
       ObservablePublish$InnerDisposable[] g = ObservablePublish$a.g;
       if (this.c.getAndSet(g) != g) {
          this.b.compareAndSet(this, null);
          DisposableHelper.dispose(this.e);
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.c.get() == ObservablePublish$a.g)? true: false;
       return b;
    }
    public void onComplete(){
       this.b.compareAndSet(this, null);
       ObservablePublish$InnerDisposable[] andSet = this.c.getAndSet(ObservablePublish$a.g);
       int len = andSet.length;
       for (int i = 0; i < len; i = i + 1) {
          andSet[i].child.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       this.b.compareAndSet(this, null);
       ObservablePublish$InnerDisposable[] andSet = this.c.getAndSet(ObservablePublish$a.g);
       if (andSet.length) {
          int len = andSet.length;
          for (int i = 0; i < len; i = i + 1) {
             andSet[i].child.onError(p0);
          }
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       ObservablePublish$InnerDisposable[] innerDisposa = this.c.get();
       int len = innerDisposa.length;
       for (int i = 0; i < len; i = i + 1) {
          innerDisposa[i].child.onNext(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.e, p0);
    }
}
