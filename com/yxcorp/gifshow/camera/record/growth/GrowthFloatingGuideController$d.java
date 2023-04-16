package com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController$d;
import erd.g;
import com.yxcorp.gifshow.camera.record.growth.GrowthFloatingGuideController;
import java.lang.Object;
import ed9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import wc9.v;
import com.yxcorp.gifshow.camera.record.base.b;
import android.widget.FrameLayout;

public final class GrowthFloatingGuideController$d implements g	// class@000df4
{
    public final GrowthFloatingGuideController b;

    public void GrowthFloatingGuideController$d(GrowthFloatingGuideController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthFloatingGuideController$d.class, "1")) {
       }else if(this.b.k2() && this.b.d.d(v.e).c != null){
          this.b.i2().setVisibility(0);
       }
       return;
    }
}
