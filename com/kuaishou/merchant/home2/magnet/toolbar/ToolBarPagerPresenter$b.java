package com.kuaishou.merchant.home2.magnet.toolbar.ToolBarPagerPresenter$b;
import ub.a;
import com.kuaishou.merchant.home2.magnet.toolbar.ToolBarPagerPresenter;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class ToolBarPagerPresenter$b extends a	// class@0017f8
{
    public final ToolBarPagerPresenter b;

    public void ToolBarPagerPresenter$b(ToolBarPagerPresenter p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ToolBarPagerPresenter$b.class, "1")) {
          return;
       }
       this.b.P8(p1);
       return;
    }
    public void onIntermediateImageFailed(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ToolBarPagerPresenter$b.class, "2")) {
          return;
       }
       this.b.P8(p1);
       return;
    }
}
