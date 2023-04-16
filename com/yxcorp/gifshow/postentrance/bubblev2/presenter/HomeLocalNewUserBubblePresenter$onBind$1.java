package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import eda.l;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import a0c.g;
import java.lang.StringBuilder;
import an6.l;
import an6.o;
import q87.c;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils;
import java.lang.Integer;
import xf6.d;
import o56.c;
import o56.a;
import xf6.l;

public final class HomeLocalNewUserBubblePresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@001018
{

    public void HomeLocalNewUserBubblePresenter$onBind$1(HomeLocalNewUserBubblePresenter p0){
       super(1, p0, HomeLocalNewUserBubblePresenter.class, "handleLoginEvent", "handleLoginEvent\(Lcom/yxcorp/gifshow/events/LoginEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalNewUserBubblePresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, HomeLocalNewUserBubblePresenter.class, "3")) {
          int i = 0;
          Object[] objArray = new Object[i];
          g.C().w("home_entrance_bubble", "BaseBubblePresenter handleLoginEvent priority "+treceiver.V8().getPriority(), objArray);
          if (!CameraEntranceUtils.h.b(Integer.valueOf(3))) {
             if (a.a().c() && l.c("key_post_entrance_enable_show_new_user_bubble", i)) {
                i = 1;
             }
             if (!i && p0.a == null) {
             label_0072 :
                return;
             }
          }
       label_0070 :
          treceiver.u = true;
          goto label_0072 ;
       }
    }
}
