package com.yxcorp.gifshow.v3.customizer.viewbinder.DefaultVideoFragmentV3ViewBinder$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.customizer.viewbinder.DefaultVideoFragmentV3ViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import uoc.g;

public final class DefaultVideoFragmentV3ViewBinder$b implements Runnable	// class@000d66
{
    public final DefaultVideoFragmentV3ViewBinder b;

    public void DefaultVideoFragmentV3ViewBinder$b(DefaultVideoFragmentV3ViewBinder p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DefaultVideoFragmentV3ViewBinder$b.class, "1")) {
          return;
       }
       DefaultVideoFragmentV3ViewBinder j = this.b.J;
       if (j == null) {
          a.S("viewAdjustHelper");
       }
       DefaultVideoFragmentV3ViewBinder$b tb = this.b;
       j.a(tb.I, tb.N());
       return;
    }
}
