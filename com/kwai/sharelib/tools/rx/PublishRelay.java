package com.kwai.sharelib.tools.rx.PublishRelay;
import lp7.b;
import com.kwai.sharelib.tools.rx.PublishRelay$PublishDisposable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;
import brd.y;
import crd.b;

public final class PublishRelay extends b	// class@001704
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
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PublishRelay.class, "5")) {
          return;
       }
       Objects.requireNonNull(p0, "value == null");
       PublishRelay$PublishDisposable[] publishDispo = this.b.get();
       int len = publishDispo.length;
       for (int i = 0; i < len; i = i + 1) {
          publishDispo[i].onNext(p0);
       }
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, PublishRelay.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.get().length)? true: false;
       return b;
    }
    public void c(PublishRelay$PublishDisposable p0){
       PublishRelay$PublishDisposable[] c;
       if (PatchProxy.applyVoidOneRefs(p0, this, PublishRelay.class, "4")) {
          return;
       }
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
                   label_0026 :
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
                      }else {
                         continue ;
                      }
                   }else {
                      i = i + 1;
                   }
                }else {
                   i = -1;
                   goto label_0026 ;
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
       PublishRelay publishRelay = PublishRelay.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, publishRelay, "2")) {
          return;
       }
       PublishRelay$PublishDisposable publishDispo = new PublishRelay$PublishDisposable(p0, this);
       p0.onSubscribe(publishDispo);
       if (!PatchProxy.applyVoidOneRefs(publishDispo, this, publishRelay, "3")) {
          do {
             publishDispo1 = this.b.get();
             int len = publishDispo1.length;
             int i = len + 1;
             publishDispo2 = new PublishRelay$PublishDisposable[i];
             System.arraycopy(publishDispo1, 0, publishDispo2, 0, len);
             publishDispo2[len] = publishDispo;
          } while (this.b.compareAndSet(publishDispo1, publishDispo2));
       }
       if (publishDispo.isDisposed()) {
          this.c(publishDispo);
       }
       return;
    }
}
