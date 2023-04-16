package io.reactivex.subjects.CompletableSubject;
import brd.d;
import brd.a;
import io.reactivex.subjects.CompletableSubject$CompletableDisposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.System;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import ird.a;
import crd.b;

public final class CompletableSubject extends a implements d	// class@0014eb
{
    public final AtomicReference b;
    public final AtomicBoolean c;
    public Throwable d;
    public static final CompletableSubject$CompletableDisposable[] e;
    public static final CompletableSubject$CompletableDisposable[] f;

    static {
       CompletableSubject$CompletableDisposable[] uCompletable = new CompletableSubject$CompletableDisposable[0];
       CompletableSubject.e = uCompletable;
       CompletableSubject$CompletableDisposable[] uCompletable1 = new CompletableSubject$CompletableDisposable[0];
       CompletableSubject.f = uCompletable1;
    }
    public void CompletableSubject(){
       super();
       this.c = new AtomicBoolean();
       this.b = new AtomicReference(CompletableSubject.e);
    }
    public static CompletableSubject A(){
       return new CompletableSubject();
    }
    public boolean B(){
       boolean b = (this.b.get() == CompletableSubject.f && this.d == null)? true: false;
       return b;
    }
    public void C(CompletableSubject$CompletableDisposable p0){
       CompletableSubject$CompletableDisposable[] e;
       while (true) {
          CompletableSubject$CompletableDisposable[] uCompletable = this.b.get();
          int len = uCompletable.length;
          if (!len) {
          }else {
             CompletableSubject uCompletable1 = null;
             int i = 0;
             while (true) {
                if (i < len) {
                   if (uCompletable[i] == p0) {
                   label_0019 :
                      if (i < 0) {
                         return;
                      }
                      object oobject = 1;
                      if (len == oobject) {
                         e = CompletableSubject.e;
                      }else {
                         int i1 = len - 1;
                         CompletableSubject$CompletableDisposable[] uCompletable2 = new CompletableSubject$CompletableDisposable[i1];
                         System.arraycopy(uCompletable, uCompletable1, uCompletable2, uCompletable1, i);
                         int i2 = i + 1;
                         len = len - i;
                         len = len - oobject;
                         System.arraycopy(uCompletable, i2, uCompletable2, i, len);
                         e = uCompletable2;
                      }
                      if (this.b.compareAndSet(uCompletable, e)) {
                      }
                   }else {
                      i = i + 1;
                   }
                }else {
                   i = -1;
                   goto label_0019 ;
                }
             }
             return;
          }
       }
       return;
    }
    public void onComplete(){
       boolean b = false;
       if (this.c.compareAndSet(b, true)) {
          CompletableSubject$CompletableDisposable[] andSet = this.b.getAndSet(CompletableSubject.f);
          int len = andSet.length;
          for (; b < len; b = b + 1) {
             andSet[b].actual.onComplete();
          }
       }
       return;
    }
    public void onError(Throwable p0){
       a.c(p0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
       boolean b = false;
       if (this.c.compareAndSet(b, true)) {
          this.d = p0;
          CompletableSubject$CompletableDisposable[] andSet = this.b.getAndSet(CompletableSubject.f);
          int len = andSet.length;
          for (; b < len; b = b + 1) {
             andSet[b].actual.onError(p0);
          }
       }else {
          a.l(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       if (this.b.get() == CompletableSubject.f) {
          p0.dispose();
       }
       return;
    }
    public void v(d p0){
       CompletableSubject$CompletableDisposable uCompletable = new CompletableSubject$CompletableDisposable(p0, this);
       p0.onSubscribe(uCompletable);
       while (true) {
          CompletableSubject$CompletableDisposable[] uCompletable1 = this.b.get();
          int i = 0;
          if (uCompletable1 != CompletableSubject.f) {
             int len = uCompletable1.length;
             int i1 = len + 1;
             CompletableSubject$CompletableDisposable[] uCompletable2 = new CompletableSubject$CompletableDisposable[i1];
             System.arraycopy(uCompletable1, i, uCompletable2, i, len);
             uCompletable2[len] = uCompletable;
             if (this.b.compareAndSet(uCompletable1, uCompletable2)) {
                i = 1;
             }
          }
          if (i) {
             if (uCompletable.isDisposed()) {
                this.C(uCompletable);
                break ;
             }
          }else {
             CompletableSubject td = this.d;
             if (td != null) {
                p0.onError(td);
                break ;
             }else {
                p0.onComplete();
                break ;
             }
          }
          break ;
       }
       return;
    }
}
