package com.yxcorp.gifshow.detail.post.bubble.DetailPostEntranceNotifyRecoBubblePresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.detail.post.bubble.DetailPostEntranceNotifyRecoBubblePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import nk9.e;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;

public final class DetailPostEntranceNotifyRecoBubblePresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@0016a8
{

    public void DetailPostEntranceNotifyRecoBubblePresenter$onBind$1(DetailPostEntranceNotifyRecoBubblePresenter p0){
       super(1, p0, DetailPostEntranceNotifyRecoBubblePresenter.class, "handleCommentShowEvent", "handleCommentShowEvent\(Lcom/yxcorp/gifshow/comment/event/CommentPanelShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailPostEntranceNotifyRecoBubblePresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, DetailPostEntranceNotifyRecoBubblePresenter.class, "6") && !p0.a()) {
          treceiver.V8();
       }
       return;
    }
}
