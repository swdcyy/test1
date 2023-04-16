package com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController$a;
import hc9.e$a;
import com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController$a$a;
import java.lang.Runnable;
import ekd.k1;

public final class GrowthFloatingGuideController$a implements e$a	// class@000df1
{
    public final GrowthFloatingGuideController b;

    public void GrowthFloatingGuideController$a(GrowthFloatingGuideController p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(int p0){
       GrowthFloatingGuideController$a uoa = GrowthFloatingGuideController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0 != 3 && (p0 != 7 && (p0 == 5 || p0 == 4))) {
          k1.r(new GrowthFloatingGuideController$a$a(this), 0);
       }
       return;
    }
}
