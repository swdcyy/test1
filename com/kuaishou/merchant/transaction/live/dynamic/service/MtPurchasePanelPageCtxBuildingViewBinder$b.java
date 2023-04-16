package com.kuaishou.merchant.transaction.live.dynamic.service.MtPurchasePanelPageCtxBuildingViewBinder$b;
import erd.b;
import com.kuaishou.merchant.transaction.live.dynamic.service.MtPurchasePanelPageCtxBuildingViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.dynamic.LoadingViewModel;
import androidx.fragment.app.Fragment;
import rk0.b;
import com.kuaishou.merchant.transaction.base.dynamic.LoadingViewModel$a;
import androidx.lifecycle.MutableLiveData;
import lnc.a1;

public final class MtPurchasePanelPageCtxBuildingViewBinder$b implements b	// class@0007b8
{
    public final MtPurchasePanelPageCtxBuildingViewBinder b;

    public void MtPurchasePanelPageCtxBuildingViewBinder$b(MtPurchasePanelPageCtxBuildingViewBinder p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MtPurchasePanelPageCtxBuildingViewBinder$b.class, "1")) {
       }else {
          p1 = LoadingViewModel.i.a(this.b.R8()).p0();
          p0 = (p0.booleanValue())? a1.p(R.string.arg_RES_7f10340b): null;
          p1.postValue(p0);
       }
       return;
    }
}
