package com.yxcorp.gifshow.camera.record.mix.MixSendTipController$onViewCreated$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.camera.record.mix.MixSendTipController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class MixSendTipController$onViewCreated$1 extends FunctionReferenceImpl implements l	// class@000e63
{

    public void MixSendTipController$onViewCreated$1(MixSendTipController p0){
       super(1, p0, MixSendTipController.class, "handlePanelShowEvent", "handlePanelShowEvent\(Lcom/kwai/gifshow/post/api/core/event/PanelShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(PanelShowEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixSendTipController$onViewCreated$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, MixSendTipController.class, "7") && !TextUtils.x(treceiver.r)) {
          treceiver.g2((p0.a ^ 1), 1);
       }
       return;
    }
}
