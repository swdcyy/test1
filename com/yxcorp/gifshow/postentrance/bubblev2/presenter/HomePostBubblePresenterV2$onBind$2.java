package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import ujc.e;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import a0c.g;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;

public final class HomePostBubblePresenterV2$onBind$2 extends FunctionReferenceImpl implements l	// class@001023
{

    public void HomePostBubblePresenterV2$onBind$2(HomePostBubblePresenterV2 p0){
       super(1, p0, HomePostBubblePresenterV2.class, "handleSplashEvent", "handleSplashEvent\(Lcom/yxcorp/gifshow/splash/event/HomeSplashStateEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostBubblePresenterV2$onBind$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, HomePostBubblePresenterV2.class, "12")) {
          Object[] objArray = new Object[0];
          g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 handleSplashEvent state "+p0.a, objArray);
          p0 = p0.a;
          if (p0 != 2 && p0 != 3) {
             if (p0 != 4) {
                if (p0 == 6) {
                }
             }else {
                treceiver.t.k(1);
             }
          }else {
          }
       }
    label_005c :
       return;
    }
}
