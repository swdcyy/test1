package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import nk9.e;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import a0c.g;
import java.lang.StringBuilder;
import q87.c;
import kzb.a;
import pr6.d;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;

public final class HomePostBubblePresenterV2$onBind$1 extends FunctionReferenceImpl implements l	// class@001022
{

    public void HomePostBubblePresenterV2$onBind$1(HomePostBubblePresenterV2 p0){
       super(1, p0, HomePostBubblePresenterV2.class, "handCommentPanelShowEvent", "handCommentPanelShowEvent\(Lcom/yxcorp/gifshow/comment/event/CommentPanelShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostBubblePresenterV2$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, HomePostBubblePresenterV2.class, "11")) {
          Object[] objArray = new Object[0];
          g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 handCommentPanelShowEvent is show "+p0.a(), objArray);
          treceiver.u.b = p0.a();
          if (p0.a() && treceiver.E.l()) {
             treceiver.t.f(true);
          }
       }
       return;
    }
}
