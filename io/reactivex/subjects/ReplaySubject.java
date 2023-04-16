package io.reactivex.subjects.ReplaySubject;
import mrd.c;
import io.reactivex.subjects.ReplaySubject$ReplayDisposable;
import java.lang.Object;
import io.reactivex.subjects.ReplaySubject$a;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.subjects.ReplaySubject$UnboundedReplayBuffer;
import io.reactivex.subjects.ReplaySubject$SizeBoundReplayBuffer;
import java.lang.Throwable;
import io.reactivex.internal.util.NotificationLite;
import java.lang.System;
import java.lang.String;
import io.reactivex.internal.functions.a;
import ird.a;
import crd.b;
import brd.y;

public final class ReplaySubject extends c	// class@0014f2
{
    public final ReplaySubject$a b;
    public final AtomicReference c;
    public boolean d;
    public static final ReplaySubject$ReplayDisposable[] e;
    public static final ReplaySubject$ReplayDisposable[] f;
    public static final Object[] g;

    static {
       ReplaySubject$ReplayDisposable[] replayDispos = new ReplaySubject$ReplayDisposable[0];
       ReplaySubject.e = replayDispos;
       replayDispos = new ReplaySubject$ReplayDisposable[0];
       ReplaySubject.f = replayDispos;
       Object[] objArray = new Object[0];
       ReplaySubject.g = objArray;
    }
    public void ReplaySubject(ReplaySubject$a p0){
       super();
       this.b = p0;
       this.c = new AtomicReference(ReplaySubject.e);
    }
    public static ReplaySubject g(){
       return new ReplaySubject(new ReplaySubject$UnboundedReplayBuffer(16));
    }
    public static ReplaySubject h(int p0){
       return new ReplaySubject(new ReplaySubject$UnboundedReplayBuffer(p0));
    }
    public static ReplaySubject i(int p0){
       return new ReplaySubject(new ReplaySubject$SizeBoundReplayBuffer(p0));
    }
    public Throwable b(){
       Object obj = this.b.get();
       if (NotificationLite.isError(obj)) {
          return NotificationLite.getError(obj);
       }
       return null;
    }
    public boolean c(){
       return NotificationLite.isComplete(this.b.get());
    }
    public boolean d(){
       boolean b = (this.c.get().length)? true: false;
       return b;
    }
    public boolean e(){
       return NotificationLite.isError(this.b.get());
    }
    public void j(ReplaySubject$ReplayDisposable p0){
       ReplaySubject$ReplayDisposable[] e;
       ReplaySubject$ReplayDisposable[] replayDispos = this.c.get();
       while (replayDispos != ReplaySubject.f && replayDispos != ReplaySubject.e) {
          int len = replayDispos.length;
          ReplaySubject replaySubjec = null;
          int i = 0;
          while (true) {
             if (i < len) {
                if (replayDispos[i] == p0) {
                label_001f :
                   if (i < 0) {
                      return;
                   }
                   object oobject = 1;
                   if (len == oobject) {
                      e = ReplaySubject.e;
                   }else {
                      int i1 = len - 1;
                      ReplaySubject$ReplayDisposable[] replayDispos1 = new ReplaySubject$ReplayDisposable[i1];
                      System.arraycopy(replayDispos, replaySubjec, replayDispos1, replaySubjec, i);
                      int i2 = i + 1;
                      len = len - i;
                      len = len - oobject;
                      System.arraycopy(replayDispos, i2, replayDispos1, i, len);
                      e = replayDispos1;
                   }
                   if (this.c.compareAndSet(replayDispos, e)) {
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
    public ReplaySubject$ReplayDisposable[] k(Object p0){
       if (this.b.compareAndSet(null, p0)) {
          return this.c.getAndSet(ReplaySubject.f);
       }
       return ReplaySubject.f;
    }
    public void onComplete(){
       if (this.d != null) {
          return;
       }
       this.d = true;
       ReplaySubject$ReplayDisposable[] obj = NotificationLite.complete();
       ReplaySubject tb = this.b;
       tb.addFinal(obj);
       obj = this.k(obj);
       int len = obj.length;
       for (int i = 0; i < len; i = i + 1) {
          tb.replay(obj[i]);
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
          p0 = NotificationLite.error(p0);
          ReplaySubject tb = this.b;
          tb.addFinal(p0);
          ReplaySubject$ReplayDisposable[] replayDispos = this.k(p0);
          int len = replayDispos.length;
          for (int i = 0; i < len; i = i + 1) {
             tb.replay(replayDispos[i]);
          }
          return;
       }
    }
    public void onNext(Object p0){
       a.c(p0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
       if (this.d != null) {
          return;
       }
       ReplaySubject tb = this.b;
       tb.add(p0);
       p0 = this.c.get();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          tb.replay(p0[i]);
       }
       return;
    }
    public void onSubscribe(b p0){
       if (this.d != null) {
          p0.dispose();
       }
       return;
    }
    public void subscribeActual(y p0){
       ReplaySubject$ReplayDisposable replayDispos = new ReplaySubject$ReplayDisposable(p0, this);
       p0.onSubscribe(replayDispos);
       if (replayDispos.cancelled == null) {
          while (true) {
             ReplaySubject$ReplayDisposable[] replayDispos1 = this.c.get();
             int i = 0;
             if (replayDispos1 != ReplaySubject.f) {
                int len = replayDispos1.length;
                int i1 = len + 1;
                ReplaySubject$ReplayDisposable[] replayDispos2 = new ReplaySubject$ReplayDisposable[i1];
                System.arraycopy(replayDispos1, i, replayDispos2, i, len);
                replayDispos2[len] = replayDispos;
                if (this.c.compareAndSet(replayDispos1, replayDispos2)) {
                   i = 1;
                }
             }
             if (i && replayDispos.cancelled != null) {
                this.j(replayDispos);
                return;
             }else {
                this.b.replay(replayDispos);
                break ;
             }
          }
       }
       return;
    }
}
