package com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$initBridgeGroup$3;
import msd.r;
import kotlin.jvm.internal.Lambda;
import y49.h;
import java.lang.Object;
import java.lang.Number;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class ThanosAdWebCardTachikomaPresenter$initBridgeGroup$3 extends Lambda implements r	// class@001626
{
    public final h $callback;

    public void ThanosAdWebCardTachikomaPresenter$initBridgeGroup$3(h p0){
       this.$callback = p0;
       super(4);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3){
       this.invoke(p0.intValue(), p1.intValue(), p2.booleanValue(), p3.booleanValue());
       return l1.a;
    }
    public final void invoke(int p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(ThanosAdWebCardTachikomaPresenter$initBridgeGroup$3.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, ThanosAdWebCardTachikomaPresenter$initBridgeGroup$3.class, "1")) {
          return;
       }
       this.$callback.a(p0, p1, p2, p3);
       return;
    }
}
