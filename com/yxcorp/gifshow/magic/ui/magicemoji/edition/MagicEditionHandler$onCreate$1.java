package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$onCreate$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import j4b.p;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;

public final class MagicEditionHandler$onCreate$1 extends FunctionReferenceImpl implements l	// class@001bc7
{

    public void MagicEditionHandler$onCreate$1(MagicEditionHandler p0){
       super(1, p0, MagicEditionHandler.class, "handleUpdateMagicSdkParameterEvent", "handleUpdateMagicSdkParameterEvent\(Lcom/yxcorp/gifshow/magic/event/UpdateMagicSdkParameterEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEditionHandler$onCreate$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, MagicEditionHandler.class, "24")) {
          a.p(p0, "event");
          if (("updateCustomSticker").equals(p0.a)) {
             treceiver.l(true);
          }
       }
       return;
    }
}
