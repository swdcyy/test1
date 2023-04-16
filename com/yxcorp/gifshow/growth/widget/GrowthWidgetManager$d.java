package com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$d;
import erd.g;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cra.w;
import q87.c;
import tkd.b;
import tkd.d;
import ayb.o;
import lra.d;
import lra.d$a;
import brd.t;
import t45.d;
import brd.z;
import hra.f;
import crd.b;

public final class GrowthWidgetManager$d implements g	// class@0015cc
{
    public final GrowthWidgetManager b;
    public final WidgetType c;

    public void GrowthWidgetManager$d(GrowthWidgetManager p0,WidgetType p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthWidgetManager$d.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          w.C().w(this.b.getClass().getSimpleName(), "GrowthWidgetPlugin load success", objArray);
          p0 = d.a(-660017555);
          if (p0 != null) {
             p0 = p0.f7(d.a.a());
             if (p0 != null) {
                z c = d.c;
                p0 = p0.subscribeOn(c).observeOn(c);
                p0.subscribe(new f(this));
             }
          }
       }
       return;
    }
}
