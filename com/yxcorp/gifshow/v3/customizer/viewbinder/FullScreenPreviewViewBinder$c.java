package com.yxcorp.gifshow.v3.customizer.viewbinder.FullScreenPreviewViewBinder$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.customizer.viewbinder.FullScreenPreviewViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uoc.g;
import com.kuaishou.viewbinder.BaseViewBinder;
import kotlin.jvm.internal.a;
import c35.c;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import android.view.View;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;

public final class FullScreenPreviewViewBinder$c implements Runnable	// class@000d6f
{
    public final FullScreenPreviewViewBinder b;

    public void FullScreenPreviewViewBinder$c(FullScreenPreviewViewBinder p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, FullScreenPreviewViewBinder$c.class, "1")) {
          return;
       }
       BaseViewBinder d = this.b.d;
       a.o(d, "rootView");
       g og = new g(d, this.b.G(), false, 4, null);
       FullScreenPreviewViewBinder$c tb = this.b;
       v0.a(tb.I, tb.N());
       return;
    }
}
