package com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$d;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ReorderPanelViewBinder$d implements Observer	// class@0011b1
{
    public final ReorderPanelViewBinder b;

    public void ReorderPanelViewBinder$d(ReorderPanelViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReorderPanelViewBinder$d.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.E(p0);
       }
       return;
    }
}
