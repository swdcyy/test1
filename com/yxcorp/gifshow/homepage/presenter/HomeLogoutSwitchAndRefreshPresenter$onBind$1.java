package com.yxcorp.gifshow.homepage.presenter.HomeLogoutSwitchAndRefreshPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.homepage.presenter.HomeLogoutSwitchAndRefreshPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import eda.n;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import hn5.z;
import tkd.b;
import tkd.d;
import ayb.i;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import ko5.b;
import gsa.m0;
import io.reactivex.subjects.PublishSubject;

public final class HomeLogoutSwitchAndRefreshPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@00178f
{

    public void HomeLogoutSwitchAndRefreshPresenter$onBind$1(HomeLogoutSwitchAndRefreshPresenter p0){
       super(1, p0, HomeLogoutSwitchAndRefreshPresenter.class, "onLogoutEventMainThread", "onLogoutEventMainThread\(Lcom/yxcorp/gifshow/events/LogoutEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(n p0){
       TabIdentifier b;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLogoutSwitchAndRefreshPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, HomeLogoutSwitchAndRefreshPresenter.class, "3") && (p0.a == null && z.a())) {
          b uob = d.a(0x4f878389);
          a.o(uob, "PluginManager.get\(GrowthPlugin::class.java\)");
          if (uob.op() && b.c.equals(treceiver.q.f())) {
             HomeLogoutSwitchAndRefreshPresenter p = treceiver.p;
             a.m(p);
             b = b.b;
             a.o(b, "HomeTabIdentifier.HOT");
             p.onNext(new m0(b, "LogoutSwtichFromFollow", true, true));
          }
       }
    label_0065 :
       return;
    }
}
