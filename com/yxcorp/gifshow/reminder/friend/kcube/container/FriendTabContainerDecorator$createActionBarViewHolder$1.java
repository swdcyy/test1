package com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerDecorator$createActionBarViewHolder$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerDecorator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerKCbeStripViewPager;
import android.content.Context;
import com.kwai.kcube.decorator.IContainerDecorator;
import wq6.f;
import zq6.r;
import ndc.l;
import zq6.p;
import odc.h;
import com.yxcorp.gifshow.reminder.friend.kcube.container.presenter.a;
import odc.c;
import com.yxcorp.gifshow.reminder.friend.kcube.container.presenter.FriendTabContainerActionSearchPresenter;

public final class FriendTabContainerDecorator$createActionBarViewHolder$1 extends FunctionReferenceImpl implements l	// class@001aa7
{

    public void FriendTabContainerDecorator$createActionBarViewHolder$1(FriendTabContainerDecorator p0){
       super(1, p0, FriendTabContainerDecorator.class, "onCreatePresenter", "onCreatePresenter\(Lcom/smile/gifmaker/mvps/presenter/PresenterV2;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, FriendTabContainerDecorator$createActionBarViewHolder$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefsWithListener(p0, treceiver, FriendTabContainerDecorator.class, "4")) {
          FriendTabContainerKCbeStripViewPager uFriendTabCo = new FriendTabContainerKCbeStripViewPager(treceiver.d(), treceiver.c());
          treceiver.c().e0().a(l.c.b(), uFriendTabCo);
          p0.U7(new h(uFriendTabCo, treceiver.c()));
          p0.U7(new a());
          p0.U7(new c(treceiver.c()));
          p0.U7(new FriendTabContainerActionSearchPresenter(treceiver.c()));
          PatchProxy.onMethodExit(FriendTabContainerDecorator.class, "4");
       }
       PatchProxy.onMethodExit(FriendTabContainerDecorator$createActionBarViewHolder$1.class, "1");
       return;
    }
}
