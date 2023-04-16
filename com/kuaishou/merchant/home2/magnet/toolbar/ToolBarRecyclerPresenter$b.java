package com.kuaishou.merchant.home2.magnet.toolbar.ToolBarRecyclerPresenter$b;
import ub.a;
import com.kuaishou.merchant.home2.magnet.toolbar.ToolBarRecyclerPresenter;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class ToolBarRecyclerPresenter$b extends a	// class@0017fe
{
    public final ToolBarRecyclerPresenter b;

    public void ToolBarRecyclerPresenter$b(ToolBarRecyclerPresenter p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ToolBarRecyclerPresenter$b.class, "1")) {
          return;
       }
       this.b.P8(p1);
       return;
    }
    public void onIntermediateImageFailed(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ToolBarRecyclerPresenter$b.class, "2")) {
          return;
       }
       this.b.P8(p1);
       return;
    }
}
