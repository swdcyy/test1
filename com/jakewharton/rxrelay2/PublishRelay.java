package com.jakewharton.rxrelay2.PublishRelay;
import dn.b;
import com.jakewharton.rxrelay2.PublishRelay$PublishDisposable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.System;
import brd.y;
import crd.b;

public final class PublishRelay extends b	// class@0005d4
{
    public final AtomicReference b;
    public static final PublishRelay$PublishDisposable[] c;

    static {
       PublishRelay$PublishDisposable[] publishDispo = new PublishRelay$PublishDisposable[0];
       PublishRelay.c = publishDispo;
    }
    public void PublishRelay(){
       super();
       this.b = new AtomicReference(PublishRelay.c);
    }
    public static PublishRelay d(){
       return new PublishRelay();
    }
    public void accept(Object p0){
       Objects.requireNonNull(p0, "value == null");
       PublishRelay$PublishDisposable[] publishDispo = this.b.get();
       int len = publishDispo.length;
       for (int i = 0; i < len; i = i + 1) {
          publishDispo[i].onNext(p0);
       }
       return;
    }
    public boolean b(){
       boolean b = (this.b.get().length)? true: false;
       return b;
    }
    public void e(PublishRelay$PublishDisposable p0){
       PublishRelay$PublishDisposable[] c;
       while (true) {
          PublishRelay$PublishDisposable[] publishDispo = this.b.get();
          if (publishDispo == PublishRelay.c) {
          }else {
             int len = publishDispo.length;
             PublishRelay publishRelay = null;
             int i = 0;
             while (true) {
                if (i < len) {
                   if (publishDispo[i] == p0) {
                   label_001b :
                      if (i < 0) {
                         return;
                      }
                      object oobject = 1;
                      if (len == oobject) {
                         c = PublishRelay.c;
                      }else {
                         int i1 = len - 1;
                         PublishRelay$PublishDisposable[] publishDispo1 = new PublishRelay$PublishDisposable[i1];
                         System.arraycopy(publishDispo, publishRelay, publishDispo1, publishRelay, i);
                         int i2 = i + 1;
                         len = len - i;
                         len = len - oobject;
                         System.arraycopy(publishDispo, i2, publishDispo1, i, len);
                         c = publishDispo1;
                      }
                      if (this.b.compareAndSet(publishDispo, c)) {
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
       PublishRelay$PublishDisposable[] publishDispo1;
       PublishRelay$PublishDisposable[] publishDispo2;
       PublishRelay$PublishDisposable publishDispo = new PublishRelay$PublishDisposable(p0, this);
       p0.onSubscribe(publishDispo);
       do {
          publishDispo1 = this.b.get();
          int len = publishDispo1.length;
          int i = len + 1;
          publishDispo2 = new PublishRelay$PublishDisposable[i];
          System.arraycopy(publishDispo1, 0, publishDispo2, 0, len);
          publishDispo2[len] = publishDispo;
       } while (this.b.compareAndSet(publishDispo1, publishDispo2));
       if (publishDispo.isDisposed()) {
          this.e(publishDispo);
       }
       return;
    }
}
