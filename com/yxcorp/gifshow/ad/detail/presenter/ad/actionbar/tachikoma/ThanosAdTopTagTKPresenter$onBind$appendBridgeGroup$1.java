package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1$1;

public final class ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1 extends Lambda implements l	// class@001587
{
    public final ThanosAdTopTagTKPresenter this$0;

    public void ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1(ThanosAdTopTagTKPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TkBridgeGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1.class, "1")) {
          return;
       }
       a.p(p0, "bridgeGroup");
       p0.j("preRenderConfig", new ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1$1(this));
       return;
    }
}
