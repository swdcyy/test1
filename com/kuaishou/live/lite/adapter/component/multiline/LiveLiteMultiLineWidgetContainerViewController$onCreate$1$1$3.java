package com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import h83.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.util.HashMap;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$3 extends FunctionReferenceImpl implements l	// class@001e12
{

    public void LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$3(c p0){
       super(1, p0, c.class, "handleDeleteUser", "handleDeleteUser\(Ljava/lang/String;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, c.class, "6")) {
          ViewController viewControll = treceiver.j.remove(p0);
          if (viewControll != null) {
             a.o(viewControll, "it");
             treceiver.O2(viewControll);
          }
          treceiver.k.remove(p0);
       }
       return;
    }
}
