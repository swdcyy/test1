package com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity$initFrag$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import sw5.a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerView;
import android.view.View;

public final class LocalLifeHalfContainerActivity$initFrag$1 extends FunctionReferenceImpl implements l	// class@001492
{

    public void LocalLifeHalfContainerActivity$initFrag$1(LocalLifeHalfContainerActivity p0){
       super(1, p0, LocalLifeHalfContainerActivity.class, "processDisplayRNView", "processDisplayRNView\(Lcom/kwai/feature/api/social/nearby/event/LlhcRNViewReadyEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeHalfContainerActivity$initFrag$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, LocalLifeHalfContainerActivity.class, "9") && p0.a == treceiver) {
          LocalLifeHalfContainerActivity z = treceiver.z;
          if (z == null) {
             a.S("containerView");
          }
          z.setRnViewReady(true);
          z = treceiver.E;
          if (z == null) {
             a.S("fragmentContainer");
          }
          z.setVisibility(0);
          z = treceiver.C;
          if (z == null) {
             a.S("loadingView");
          }
          z.setVisibility(8);
          treceiver.P = true;
       }
       return;
    }
}
