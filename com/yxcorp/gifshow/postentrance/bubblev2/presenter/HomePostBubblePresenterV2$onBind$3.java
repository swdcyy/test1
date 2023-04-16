package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$onBind$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import zca.b;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;

public final class HomePostBubblePresenterV2$onBind$3 extends FunctionReferenceImpl implements l	// class@001024
{

    public void HomePostBubblePresenterV2$onBind$3(HomePostBubblePresenterV2 p0){
       super(1, p0, HomePostBubblePresenterV2.class, "handleChildLockDialogEvent", "handleChildLockDialogEvent\(Lcom/yxcorp/gifshow/event/ChildLockDialogEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostBubblePresenterV2$onBind$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, HomePostBubblePresenterV2.class, "13")) {
          if (p0.a != null) {
             treceiver.t.d(3);
          }else {
             treceiver.t.k(3);
          }
       }
       return;
    }
}
