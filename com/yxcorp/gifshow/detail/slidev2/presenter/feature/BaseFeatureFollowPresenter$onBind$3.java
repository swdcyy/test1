package com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter$onBind$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Boolean;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import kotlin.jvm.internal.a;
import brd.y;

public final class BaseFeatureFollowPresenter$onBind$3 extends FunctionReferenceImpl implements l	// class@00190d
{

    public void BaseFeatureFollowPresenter$onBind$3(BaseFeatureFollowPresenter p0){
       super(1, p0, BaseFeatureFollowPresenter.class, "updateFollowVisible", "updateFollowVisible\(Z\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       BaseFeatureFollowPresenter v;
       if (PatchProxy.isSupport(BaseFeatureFollowPresenter$onBind$3.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseFeatureFollowPresenter$onBind$3.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       BaseFeatureFollowPresenter uBaseFeature = BaseFeatureFollowPresenter.class;
       if (!PatchProxy.isSupport(uBaseFeature) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), treceiver, uBaseFeature, "25")) {
          if (p0) {
             v = treceiver.v;
             if (v == null) {
                a.S("mSlidePlayFollowAnimStatusObserver");
             }
             v.onNext(Boolean.FALSE);
          }else {
             v = treceiver.v;
             if (v == null) {
                a.S("mSlidePlayFollowAnimStatusObserver");
             }
             v.onNext(Boolean.TRUE);
          }
       }
       return;
    }
}
