package com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$h;
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
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.SharedPreferences;
import k85.c;
import tkd.b;
import tkd.d;
import ayb.o;
import lra.d;
import lra.d$a;
import brd.t;
import t45.d;
import brd.z;
import hra.g;
import hra.h;
import crd.b;

public final class GrowthWidgetManager$h implements g	// class@0015d0
{
    public final GrowthWidgetManager b;
    public final WidgetType c;

    public void GrowthWidgetManager$h(GrowthWidgetManager p0,WidgetType p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       z c;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthWidgetManager$h.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          w.C().w(this.b.getClass().getSimpleName(), "GrowthWidgetPlugin load success", objArray);
          int intx = c.a(a.b(), "SP_NAME_GROWTH_WIDGET", 0).getInt("SP_KEY_WIDGET_AUTOMATICAL_ID", -1);
          boolean booleanx = c.a(a.b(), "SP_NAME_GROWTH_WIDGET", 0).getBoolean("SP_KEY_WIDGET_AUTO_ADD_EXP_TYPE", 0);
          o oo = d.a(-660017555);
          if (oo != null) {
             t ot = oo.IX(d.a.a());
             if (ot != null) {
                c = d.c;
                ot = ot.subscribeOn(c).observeOn(c);
                ot.subscribe(new g(this, intx, booleanx), new h(this, intx, booleanx));
             }
          }
       }
       return;
    }
}
