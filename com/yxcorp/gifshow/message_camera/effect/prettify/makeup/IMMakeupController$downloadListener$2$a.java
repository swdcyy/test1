package com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController$downloadListener$2$a;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController$downloadListener$2;
import java.lang.Object;
import boc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController;
import h1c.c;
import boc.z;
import java.lang.Throwable;

public final class IMMakeupController$downloadListener$2$a implements n$c	// class@001dcf
{
    public final IMMakeupController$downloadListener$2 a;

    public void IMMakeupController$downloadListener$2$a(IMMakeupController$downloadListener$2 p0){
       this.a = p0;
       super();
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMMakeupController$downloadListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "category");
       IMMakeupController$downloadListener$2 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(p0, this$0, IMMakeupController.class, "15")) {
          this$0.e.h(p0);
       }
       return;
    }
    public void b(b p0,float p1){
       z.c(this, p0, p1);
    }
    public void c(b p0){
       z.a(this, p0);
    }
    public void d(b p0,Throwable p1){
       z.b(this, p0, p1);
    }
}
