package com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$f;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$d;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn;
import java.lang.Object;
import com.yxcorp.gifshow.nearby.common.model.CommonBtnModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class NearbyCommonRvBtn$f implements NearbyCommonRvBtn$d	// class@00213b
{
    public final NearbyCommonRvBtn a;

    public void NearbyCommonRvBtn$f(NearbyCommonRvBtn p0){
       this.a = p0;
       super();
    }
    public void a(CommonBtnModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyCommonRvBtn$f.class, "1")) {
          return;
       }
       a.p(p0, "commonBtnModel");
       NearbyCommonRvBtn e = this.a.e;
       if (e != null) {
          e.a(p0);
       }
       return;
    }
}
