package com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$j;
import erd.g;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;

public final class ThanosAdWebCardTachikomaPresenter$j implements g	// class@001628
{
    public final int b;

    public void ThanosAdWebCardTachikomaPresenter$j(int p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdWebCardTachikomaPresenter$j.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          p0.P = this.b;
       }
       return;
    }
}
