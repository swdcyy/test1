package com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkFashionCritMomentVC$c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkFashionCritMomentVC;
import java.lang.Object;
import sw1.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yt1.e;

public final class LiveMultiPkFashionCritMomentVC$c implements Observer	// class@001664
{
    public final LiveMultiPkFashionCritMomentVC b;

    public void LiveMultiPkFashionCritMomentVC$c(LiveMultiPkFashionCritMomentVC p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkFashionCritMomentVC$c.class, "1")) {
       }else {
          this.b.q.C(p0);
       }
       return;
    }
}
