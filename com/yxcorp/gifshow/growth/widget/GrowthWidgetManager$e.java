package com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$e;
import erd.g;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cra.w;
import q87.c;

public final class GrowthWidgetManager$e implements g	// class@0015cd
{
    public final GrowthWidgetManager b;

    public void GrowthWidgetManager$e(GrowthWidgetManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthWidgetManager$e.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          w.C().w(this.b.getClass().getSimpleName(), "GrowthWidgetPlugin load failure", objArray);
       }
       return;
    }
}