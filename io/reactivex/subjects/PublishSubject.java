package io.reactivex.subjects.PublishSubject;
import mrd.c;
import io.reactivex.subjects.PublishSubject$PublishDisposable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.System;
import java.lang.String;
import io.reactivex.internal.functions.a;
import ird.a;
import crd.b;
import brd.y;

public final class PublishSubject extends c	// class@00195b
{
    public final AtomicReference b;
    public Throwable c;
    public static final PublishSubject$PublishDisposable[] d;
    public static final PublishSubject$PublishDisposable[] e;

    static {
       PublishSubject$PublishDisposable[] publishDispo = new PublishSubject$PublishDisposable[0];
       PublishSubject.d = publishDispo;
       PublishSubject$PublishDisposable[] publishDispo1 = new PublishSubject$PublishDisposable[0];
       PublishSubject.e = publishDispo1;
    }
    public void PublishSubject(){
       super();
       this.b = new AtomicReference(PublishSubject.e);
    }
    public static PublishSubject g(){
       return new PublishSubject();
    }
    public Throwable b(){
       if (this.b.get() == PublishSubject.d) {
          return this.c;
       }
       return null;
    }
    public boolean c(){
       boolean b = (this.b.get() == PublishSubject.d && this.c == null)? true: false;
       return b;
    }
    public boolean d(){
       boolean b = (this.b.get().length)? true: false;
       return b;
    }
    public boolean e(){
       boolean b = (this.b.get() == PublishSubject.d && this.c != null)? true: false;
       return b;
    }
    public void h(PublishSubject$PublishDisposable p0){
       PublishSubject$PublishDisposable[] e;
       PublishSubject$PublishDisposable[] publishDispo = this.b.get();
       while (publishDispo != PublishSubject.d && publishDispo != PublishSubject.e) {
          int len = publishDispo.length;
          PublishSubject publishSubje = null;
          int i = 0;
          while (true) {
             if (i < len) {
                if (publishDispo[i] == p0) {
                label_001f :
                   if (i < 0) {
                      return;
                   }
                   object oobject = 1;
                   if (len == oobject) {
                      e = PublishSubject.e;
                   }else {
                      int i1 = len - 1;
                      PublishSubject$PublishDisposable[] publishDispo1 = new PublishSubject$PublishDisposable[i1];
                      System.arraycopy(publishDispo, publishSubje, publishDispo1, publishSubje, i);
                      int i2 = i + 1;
                      len = len - i;
                      len = len - oobject;
                      System.arraycopy(publishDispo, i2, publishDispo1, i, len);
                      e = publishDispo1;
                   }
                   if (this.b.compareAndSet(publishDispo, e)) {
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
       PublishSubject$PublishDisposable[] d = PublishSubject.d;
       if (this.b.get() == d) {
          return;
       }
       PublishSubject$PublishDisposable[] andSet = this.b.getAndSet(d);
       int len = andSet.length;
       for (int i = 0; i < len; i = i + 1) {
          andSet[i].onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       a.c(p0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
       PublishSubject$PublishDisposable[] d = PublishSubject.d;
       if (this.b.get() == d) {
          a.l(p0);
          return;
       }else {
          this.c = p0;
          PublishSubject$PublishDisposable[] andSet = this.b.getAndSet(d);
          int len = andSet.length;
          for (int i = 0; i < len; i = i + 1) {
             andSet[i].onError(p0);
          }
          return;
       }
    }
    public void onNext(Object p0){
       a.c(p0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
       PublishSubject$PublishDisposable[] publishDispo = this.b.get();
       int len = publishDispo.length;
       for (int i = 0; i < len; i = i + 1) {
          publishDispo[i].onNext(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       if (this.b.get() == PublishSubject.d) {
          p0.dispose();
       }
       return;
    }
    public void subscribeActual(y p0){
       PublishSubject$PublishDisposable publishDispo = new PublishSubject$PublishDisposable(p0, this);
       p0.onSubscribe(publishDispo);
       while (true) {
          PublishSubject$PublishDisposable[] publishDispo1 = this.b.get();
          int i = 0;
          if (publishDispo1 != PublishSubject.d) {
             int len = publishDispo1.length;
             int i1 = len + 1;
             PublishSubject$PublishDisposable[] publishDispo2 = new PublishSubject$PublishDisposable[i1];
             System.arraycopy(publishDispo1, i, publishDispo2, i, len);
             publishDispo2[len] = publishDispo;
             if (this.b.compareAndSet(publishDispo1, publishDispo2)) {
                i = 1;
             }
          }
          if (i) {
             if (publishDispo.isDisposed()) {
                this.h(publishDispo);
                break ;
             }
          }else {
             PublishSubject tc = this.c;
             if (tc != null) {
                p0.onError(tc);
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
