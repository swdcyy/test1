package com.kuaishou.merchant.transaction.live.dynamic.service.MtPurchasePanelPageCtxBuildingViewBinder$mParamBuilder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.live.dynamic.service.PageInfoParamBuilder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;

public final class MtPurchasePanelPageCtxBuildingViewBinder$mParamBuilder$2 extends Lambda implements a	// class@0007b9
{
    public final Fragment $fragment;

    public void MtPurchasePanelPageCtxBuildingViewBinder$mParamBuilder$2(Fragment p0){
       this.$fragment = p0;
       super(0);
    }
    public final PageInfoParamBuilder invoke(){
       Object obj = PatchProxy.apply(null, this, MtPurchasePanelPageCtxBuildingViewBinder$mParamBuilder$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PageInfoParamBuilder(this.$fragment.getContext());
    }
    public Object invoke(){
       return this.invoke();
    }
}
