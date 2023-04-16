package com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPresenter$a;
import d6a.a;
import com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import ayb.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class GrowthFreeTrafficPresenter$a extends a	// class@001380
{
    public final GrowthFreeTrafficPresenter b;

    public void GrowthFreeTrafficPresenter$a(GrowthFreeTrafficPresenter p0){
       this.b = p0;
       super();
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, GrowthFreeTrafficPresenter$a.class, "1")) {
          return;
       }
       int i = 0x4d672e6e;
       if (d.a(i).dp()) {
          d.a(i).xq(this.b.getActivity(), this.b.r);
       }
       return;
    }
}
