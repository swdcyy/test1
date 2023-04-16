package com.kuaishou.pagedy.container.component.DynamicRootListComponent$setupCeilingView$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.pagedy.container.widget.DynamicRootListContainer;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import android.view.ViewGroup;

public final class DynamicRootListComponent$setupCeilingView$2 extends Lambda implements l	// class@000a57
{
    public final DynamicRootListContainer $rootListContainer;

    public void DynamicRootListComponent$setupCeilingView$2(DynamicRootListContainer p0){
       this.$rootListContainer = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(DynamicRootListComponent$setupCeilingView$2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DynamicRootListComponent$setupCeilingView$2.class, "1")) {
          return;
       }
       if (p0) {
          this.$rootListContainer.getCeilingViewContainer().setVisibility(0);
       }else {
          this.$rootListContainer.getCeilingViewContainer().setVisibility(8);
       }
       return;
    }
}
