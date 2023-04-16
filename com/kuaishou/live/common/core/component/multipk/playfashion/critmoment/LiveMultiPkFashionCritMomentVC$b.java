package com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkFashionCritMomentVC$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkFashionCritMomentVC;
import java.lang.Object;
import kt1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kt1.d;

public final class LiveMultiPkFashionCritMomentVC$b implements Observer	// class@001663
{
    public final LiveMultiPkFashionCritMomentVC b;

    public void LiveMultiPkFashionCritMomentVC$b(LiveMultiPkFashionCritMomentVC p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkFashionCritMomentVC$b.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.p.b(p0);
       }
       return;
    }
}
