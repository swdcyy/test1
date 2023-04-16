package com.jakewharton.rxrelay2.ReplayRelay;
import dn.b;
import com.jakewharton.rxrelay2.ReplayRelay$ReplayDisposable;
import java.lang.Object;
import com.jakewharton.rxrelay2.ReplayRelay$a;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.String;
import java.util.Objects;
import java.lang.System;
import brd.y;
import crd.b;

public final class ReplayRelay extends b	// class@0006d6
{
    public final ReplayRelay$a b;
    public final AtomicReference c;
    public static final ReplayRelay$ReplayDisposable[] d;
    public static final Object[] e;

    static {
       ReplayRelay$ReplayDisposable[] replayDispos = new ReplayRelay$ReplayDisposable[0];
       ReplayRelay.d = replayDispos;
       Object[] objArray = new Object[0];
       ReplayRelay.e = objArray;
    }
    public void ReplayRelay(ReplayRelay$a p0){
       super();
       this.b = p0;
       this.c = new AtomicReference(ReplayRelay.d);
    }
    public void accept(Object p0){
       Objects.requireNonNull(p0, "value == null");
       ReplayRelay tb = this.b;
       tb.add(p0);
       p0 = this.c.get();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          tb.a(p0[i]);
       }
       return;
    }
    public boolean b(){
       boolean b = (this.c.get().length)? true: false;
       return b;
    }
    public void d(ReplayRelay$ReplayDisposable p0){
       ReplayRelay$ReplayDisposable[] d;
       while (true) {
          ReplayRelay$ReplayDisposable[] replayDispos = this.c.get();
          if (replayDispos == ReplayRelay.d) {
          }else {
             int len = replayDispos.length;
             ReplayRelay replayRelay = null;
             int i = 0;
             while (true) {
                if (i < len) {
                   if (replayDispos[i] == p0) {
                   label_001b :
                      if (i < 0) {
                         return;
                      }
                      object oobject = 1;
                      if (len == oobject) {
                         d = ReplayRelay.d;
                      }else {
                         int i1 = len - 1;
                         ReplayRelay$ReplayDisposable[] replayDispos1 = new ReplayRelay$ReplayDisposable[i1];
                         System.arraycopy(replayDispos, replayRelay, replayDispos1, replayRelay, i);
                         int i2 = i + 1;
                         len = len - i;
                         len = len - oobject;
                         System.arraycopy(replayDispos, i2, replayDispos1, i, len);
                         d = replayDispos1;
                      }
                      if (this.c.compareAndSet(replayDispos, d)) {
                      }
                   }else {
                      i = i + 1;
                   }
                }else {
                   i = -1;
                   goto label_001b ;
                }
             }
             return;
          }
       }
       return;
    }
    public void subscribeActual(y p0){
       ReplayRelay$ReplayDisposable[] replayDispos1;
       ReplayRelay$ReplayDisposable[] replayDispos2;
       ReplayRelay$ReplayDisposable replayDispos = new ReplayRelay$ReplayDisposable(p0, this);
       p0.onSubscribe(replayDispos);
       if (replayDispos.cancelled == null) {
          do {
             replayDispos1 = this.c.get();
             int len = replayDispos1.length;
             int i = len + 1;
             replayDispos2 = new ReplayRelay$ReplayDisposable[i];
             System.arraycopy(replayDispos1, 0, replayDispos2, 0, len);
             replayDispos2[len] = replayDispos;
          } while (this.c.compareAndSet(replayDispos1, replayDispos2));
          if (replayDispos.cancelled != null) {
             this.d(replayDispos);
             return;
          }else {
             this.b.a(replayDispos);
          }
       }
       return;
    }
}
