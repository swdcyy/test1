package io.reactivex.subjects.SingleSubject;
import brd.d0;
import brd.a0;
import io.reactivex.subjects.SingleSubject$SingleDisposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import crd.b;
import java.lang.System;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import ird.a;

public final class SingleSubject extends a0 implements d0	// class@0014f4
{
    public final AtomicReference b;
    public final AtomicBoolean c;
    public Object d;
    public Throwable e;
    public static final SingleSubject$SingleDisposable[] f;
    public static final SingleSubject$SingleDisposable[] g;

    static {
       SingleSubject$SingleDisposable[] singleDispos = new SingleSubject$SingleDisposable[0];
       SingleSubject.f = singleDispos;
       SingleSubject$SingleDisposable[] singleDispos1 = new SingleSubject$SingleDisposable[0];
       SingleSubject.g = singleDispos1;
    }
    public void SingleSubject(){
       super();
       this.c = new AtomicBoolean();
       this.b = new AtomicReference(SingleSubject.f);
    }
    public static SingleSubject k0(){
       return new SingleSubject();
    }
    public void S(d0 p0){
       SingleSubject$SingleDisposable singleDispos = new SingleSubject$SingleDisposable(p0, this);
       p0.onSubscribe(singleDispos);
       while (true) {
          SingleSubject$SingleDisposable[] singleDispos1 = this.b.get();
          int i = 0;
          if (singleDispos1 != SingleSubject.g) {
             int len = singleDispos1.length;
             int i1 = len + 1;
             SingleSubject$SingleDisposable[] singleDispos2 = new SingleSubject$SingleDisposable[i1];
             System.arraycopy(singleDispos1, i, singleDispos2, i, len);
             singleDispos2[len] = singleDispos;
             if (this.b.compareAndSet(singleDispos1, singleDispos2)) {
                i = 1;
             }
          }
          if (i) {
             if (singleDispos.isDisposed()) {
                this.l0(singleDispos);
                break ;
             }
          }else {
             SingleSubject te = this.e;
             if (te != null) {
                p0.onError(te);
                break ;
             }else {
                p0.onSuccess(this.d);
                break ;
             }
          }
          break ;
       }
       return;
    }
    public void l0(SingleSubject$SingleDisposable p0){
       SingleSubject$SingleDisposable[] f;
       while (true) {
          SingleSubject$SingleDisposable[] singleDispos = this.b.get();
          int len = singleDispos.length;
          if (!len) {
          }else {
             SingleSubject singleSubjec = null;
             int i = 0;
             while (true) {
                if (i < len) {
                   if (singleDispos[i] == p0) {
                   label_0019 :
                      if (i < 0) {
                         return;
                      }
                      object oobject = 1;
                      if (len == oobject) {
                         f = SingleSubject.f;
                      }else {
                         int i1 = len - 1;
                         SingleSubject$SingleDisposable[] singleDispos1 = new SingleSubject$SingleDisposable[i1];
                         System.arraycopy(singleDispos, singleSubjec, singleDispos1, singleSubjec, i);
                         int i2 = i + 1;
                         len = len - i;
                         len = len - oobject;
                         System.arraycopy(singleDispos, i2, singleDispos1, i, len);
                         f = singleDispos1;
                      }
                      if (this.b.compareAndSet(singleDispos, f)) {
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
    public void onError(Throwable p0){
       a.c(p0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
       boolean b = false;
       if (this.c.compareAndSet(b, true)) {
          this.e = p0;
          SingleSubject$SingleDisposable[] andSet = this.b.getAndSet(SingleSubject.g);
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
       if (this.b.get() == SingleSubject.g) {
          p0.dispose();
       }
       return;
    }
    public void onSuccess(Object p0){
       a.c(p0, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
       boolean b = false;
       if (this.c.compareAndSet(b, true)) {
          this.d = p0;
          SingleSubject$SingleDisposable[] andSet = this.b.getAndSet(SingleSubject.g);
          int len = andSet.length;
          for (; b < len; b = b + 1) {
             andSet[b].actual.onSuccess(p0);
          }
       }
       return;
    }
}
