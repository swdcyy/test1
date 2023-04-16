package com.yxcorp.gifshow.growth.refresh.GrowthDetailSlidePlayRefreshPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.growth.refresh.GrowthDetailSlidePlayRefreshPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import eda.l;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import ayb.i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import com.yxcorp.gifshow.refresh.RefreshType;

public final class GrowthDetailSlidePlayRefreshPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@0014bc
{

    public void GrowthDetailSlidePlayRefreshPresenter$onBind$1(GrowthDetailSlidePlayRefreshPresenter p0){
       super(1, p0, GrowthDetailSlidePlayRefreshPresenter.class, "onLoginEventMainThread", "onLoginEventMainThread\(Lcom/yxcorp/gifshow/events/LoginEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(l p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthDetailSlidePlayRefreshPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       GrowthDetailSlidePlayRefreshPresenter growthDetail = GrowthDetailSlidePlayRefreshPresenter.class;
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, growthDetail, "3") && p0.b == null) {
          Object[] objArray = null;
          b obj = PatchProxy.apply(objArray, treceiver, growthDetail, "5");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = d.a(0x4f878389);
             a.o(obj, "PluginManager.get\(GrowthPlugin::class.java\)");
             b = obj.op();
          }
          if (b && !PatchProxy.applyVoid(objArray, treceiver, growthDetail, "4")) {
             GrowthDetailSlidePlayRefreshPresenter q = treceiver.q;
             if (q == null) {
                a.S("mSlidePlayViewModel");
             }
             if (q != null) {
                q = treceiver.q;
                if (q == null) {
                   a.S("mSlidePlayViewModel");
                }
                if (q.n1()) {
                   q = treceiver.q;
                   if (q == null) {
                      a.S("mSlidePlayViewModel");
                   }
                   if (!q.o1()) {
                      q = treceiver.q;
                      if (q == null) {
                         a.S("mSlidePlayViewModel");
                      }
                      if (q.x1()) {
                         q = treceiver.q;
                         if (q == null) {
                            a.S("mSlidePlayViewModel");
                         }
                         if (q.V0() != null) {
                            q = treceiver.q;
                            if (q == null) {
                               a.S("mSlidePlayViewModel");
                            }
                            List list = q.V0();
                            a.m(list);
                            treceiver.r = list.size() - 1;
                         }
                         q = treceiver.q;
                         if (q == null) {
                            a.S("mSlidePlayViewModel");
                         }
                         q.V1(RefreshType.LOGIN_REFRESH);
                         q = treceiver.q;
                         if (q == null) {
                            a.S("mSlidePlayViewModel");
                         }
                         q.v1();
                      }
                   }
                }
             }
          }
       }
    label_00c1 :
       return;
    }
}
