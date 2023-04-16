package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$j;
import z1.a;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter;
import java.lang.Object;
import xr6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.kcube.TabIdentifier;
import kotlin.jvm.internal.a;
import wra.b;
import mrd.c;
import wra.a;
import brd.y;

public final class KCubeBlockTabPresenter$j implements a	// class@001672
{
    public final KCubeBlockTabPresenter a;

    public void KCubeBlockTabPresenter$j(KCubeBlockTabPresenter p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeBlockTabPresenter$j.class, "1")) {
       }else if(a.g("ato_operate", p0.a().getType())){
          KCubeBlockTabPresenter.R8(this.a).a().onNext(a.e);
       }
       return;
    }
}
