package com.yxcorp.gifshow.hot.stagger.secondfloor.presenter.HotSecondFloorGuidePresenter$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.hot.stagger.secondfloor.presenter.HotSecondFloorGuidePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import jsa.a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import pfa.b;

public final class HotSecondFloorGuidePresenter$onBind$2 extends FunctionReferenceImpl implements l	// class@0018d6
{

    public void HotSecondFloorGuidePresenter$onBind$2(HotSecondFloorGuidePresenter p0){
       super(1, p0, HotSecondFloorGuidePresenter.class, "handleBlockTabBubbleEvent", "handleBlockTabBubbleEvent\(Lcom/yxcorp/gifshow/homepage/event/BlockTabBubbleEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSecondFloorGuidePresenter$onBind$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, HotSecondFloorGuidePresenter.class, "4") && p0.a != null) {
          treceiver.v = false;
          HotSecondFloorGuidePresenter r = treceiver.r;
          if (r == null) {
             a.S("mSecondFloorState");
          }
          if (r.b()) {
             treceiver.W8();
          }
       }
    label_003b :
       return;
    }
}
