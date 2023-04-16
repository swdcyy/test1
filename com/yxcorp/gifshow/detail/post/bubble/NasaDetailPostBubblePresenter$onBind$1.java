package com.yxcorp.gifshow.detail.post.bubble.NasaDetailPostBubblePresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.detail.post.bubble.NasaDetailPostBubblePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import nk9.e;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import u4a.a;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;

public final class NasaDetailPostBubblePresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@0016ac
{

    public void NasaDetailPostBubblePresenter$onBind$1(NasaDetailPostBubblePresenter p0){
       super(1, p0, NasaDetailPostBubblePresenter.class, "handleCommentShowEvent", "handleCommentShowEvent\(Lcom/yxcorp/gifshow/comment/event/CommentPanelShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaDetailPostBubblePresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, NasaDetailPostBubblePresenter.class, "5")) {
          NasaDetailPostBubblePresenter r = treceiver.r;
          boolean b = p0.a();
          if (b) {
             r.a = true;
          }
          r.b = b;
          if (p0.a()) {
             treceiver.q.f(true);
          }
       }
       return;
    }
}
