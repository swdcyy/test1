package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$2;
import msd.r;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter;
import java.lang.Object;
import java.lang.Number;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import vz8.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ToggleState;
import io.reactivex.subjects.PublishSubject;

public final class ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$2 extends Lambda implements r	// class@001576
{
    public final ThanosAdActionBarTKPresenter this$0;

    public void ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$2(ThanosAdActionBarTKPresenter p0){
       this.this$0 = p0;
       super(4);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3){
       this.invoke(p0.intValue(), p1.intValue(), p2.booleanValue(), p3.booleanValue());
       return l1.a;
    }
    public final void invoke(int p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$2.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$2.class, "1")) {
          return;
       }
       ThanosAdActionBarTKPresenter p = this.this$0.P;
       if (p == null) {
          a.S("mCardToggleStateSubject");
       }
       p.onNext(new g(ToggleState.TOGGLE_STATE_INFO_TO_CARD, p2, p3));
       return;
    }
}
