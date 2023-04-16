package com.yxcorp.gifshow.v3.editor.template.data.ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1;
import brd.y;
import ftd.k;
import brd.w;
import com.yxcorp.gifshow.v3.editor.template.data.Mode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import asd.c;
import java.util.NoSuchElementException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import qrd.j0;
import kotlin.jvm.internal.a;
import ztc.g;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import crd.b;
import com.yxcorp.gifshow.v3.editor.template.data.ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1$1;
import msd.l;

public final class ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1 implements y	// class@001318
{
    public b b;
    public Object c;
    public boolean d;
    public final k e;
    public final w f;
    public final Mode g;
    public final Object h;

    public void ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1(k p0,w p1,Mode p2,Object p3){
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       super();
    }
    public void onComplete(){
       if (PatchProxy.applyVoidWithListener(null, this, ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1.class, "3")) {
          return;
       }
       if (this.d != null) {
          if (this.e.E()) {
             this.e.resumeWith(Result.constructor-impl(this.c));
          }
          PatchProxy.onMethodExit(ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1.class, "3");
          return;
       }else if(this.g == Mode.FIRST_OR_DEFAULT){
          this.e.resumeWith(Result.constructor-impl(this.h));
       }else if(this.e.E()){
          this.e.resumeWith(Result.constructor-impl(j0.a(new NoSuchElementException("No value received via onNext for "+this.g))));
       }
       PatchProxy.onMethodExit(ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1.class, "3");
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1.class, "4")) {
          return;
       }
       a.p(p0, "e");
       this.e.resumeWith(Result.constructor-impl(j0.a(p0)));
       PatchProxy.onMethodExit(ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1.class, "4");
       return;
    }
    public void onNext(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1.class, "2")) {
          return;
       }
       int i = g.a[this.g.ordinal()];
       StringBuilder str = 1;
       if (i != str && i != 2) {
          if (i == 3 || i == 4) {
             if (this.g == Mode.SINGLE && this.d != null) {
                if (this.e.E()) {
                   this.e.resumeWith(Result.constructor-impl(j0.a(new IllegalArgumentException("More than one onNext value for "+this.g))));
                }
                p0 = this.b;
                if (p0 == null) {
                   a.S("subscription");
                }
                p0.dispose();
             }else {
                this.c = p0;
                this.d = str;
             }
          }
       }else if(this.d == null){
          this.d = str;
          this.e.resumeWith(Result.constructor-impl(p0));
          p0 = this.b;
          if (p0 == null) {
             a.S("subscription");
          }
          p0.dispose();
       }
       PatchProxy.onMethodExit(ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1.class, "2");
       return;
    }
    public void onSubscribe(b p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "sub");
       this.b = p0;
       this.e.w(new ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1$1(p0));
       PatchProxy.onMethodExit(ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1.class, "1");
       return;
    }
}
