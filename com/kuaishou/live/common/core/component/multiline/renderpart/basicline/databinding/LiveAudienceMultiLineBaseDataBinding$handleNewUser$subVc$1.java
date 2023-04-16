package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.LiveAudienceMultiLineBaseDataBinding$handleNewUser$subVc$1;
import msd.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.live.common.multiinteract.view.LiveInteractWidgetContainer$a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kuaishou.live.common.multiinteract.view.LiveInteractWidgetContainer;

public final class LiveAudienceMultiLineBaseDataBinding$handleNewUser$subVc$1 extends FunctionReferenceImpl implements p	// class@00154c
{

    public void LiveAudienceMultiLineBaseDataBinding$handleNewUser$subVc$1(a p0){
       super(2, p0, a.class, "onUpdateViewPosition", "onUpdateViewPosition\(Ljava/lang/String;Lcom/kuaishou/live/common/multiinteract/view/LiveInteractWidgetContainer$ViewPosition;\)V", 0);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(String p0,LiveInteractWidgetContainer$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceMultiLineBaseDataBinding$handleNewUser$subVc$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       a.p(p1, "p2");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, treceiver, a.class, "8")) {
          treceiver.c.a(p0, p1);
       }
       return;
    }
}
