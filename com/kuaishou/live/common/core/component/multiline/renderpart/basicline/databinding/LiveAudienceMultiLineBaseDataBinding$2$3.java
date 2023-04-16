package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.LiveAudienceMultiLineBaseDataBinding$2$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;
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
import hr1.a;
import j83.d;

public final class LiveAudienceMultiLineBaseDataBinding$2$3 extends FunctionReferenceImpl implements l	// class@00154b
{

    public void LiveAudienceMultiLineBaseDataBinding$2$3(a p0){
       super(1, p0, a.class, "handleDeleteUser", "handleDeleteUser\(Ljava/lang/String;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineBaseDataBinding$2$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, a.class, "6")) {
          ViewController viewControll = treceiver.a.remove(p0);
          if (viewControll != null) {
             a.o(viewControll, "it");
             treceiver.h.o1(viewControll);
          }
          d uod = treceiver.b.remove(p0);
          if (uod != null) {
             uod.o();
          }
          treceiver.e(p0);
       }
       return;
    }
}
