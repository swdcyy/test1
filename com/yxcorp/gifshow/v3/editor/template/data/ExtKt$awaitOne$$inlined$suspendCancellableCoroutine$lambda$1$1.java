package com.yxcorp.gifshow.v3.editor.template.data.ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import crd.b;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1$1 extends Lambda implements l	// class@001317
{
    public final b $sub;

    public void ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1$1(b p0){
       this.$sub = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1$1.class, "1")) {
          return;
       }
       this.$sub.dispose();
       PatchProxy.onMethodExit(ExtKt$awaitOne$$inlined$suspendCancellableCoroutine$lambda$1$1.class, "1");
       return;
    }
}
