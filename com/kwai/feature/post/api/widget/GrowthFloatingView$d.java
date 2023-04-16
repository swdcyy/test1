package com.kwai.feature.post.api.widget.GrowthFloatingView$d;
import erd.g;
import com.kwai.feature.post.api.widget.GrowthFloatingView;
import java.lang.Object;
import w16.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import kotlin.jvm.internal.a;
import lnc.p3;
import java.lang.StringBuilder;
import com.google.gson.JsonObject;
import q87.c;

public final class GrowthFloatingView$d implements g	// class@00146b
{
    public final GrowthFloatingView b;

    public void GrowthFloatingView$d(GrowthFloatingView p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthFloatingView$d.class, "1")) {
       }else if(a.g(this.b.i.getGuideItemId(), p0.a())){
          p0 = p3.D();
          StringBuilder str = "GrowthFloatingView dismiss by GrowthGuideCloseEvent ";
          JsonObject originInfo = this.b.i.getOriginInfo();
          int i = 0;
          int i1 = (originInfo != null)? originInfo.hashCode(): 0;
          Object[] objArray = new Object[i];
          p0.w("PostGrowth", str+i1, objArray);
          this.b.a(true);
       }
       return;
    }
}
