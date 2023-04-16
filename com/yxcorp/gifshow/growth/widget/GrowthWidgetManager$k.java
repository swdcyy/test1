package com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$k;
import erd.g;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import lra.c;
import spa.c;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import lra.c$a;

public final class GrowthWidgetManager$k implements g	// class@0015d3
{
    public final GrowthWidgetManager b;
    public final WidgetType c;
    public final boolean d;

    public void GrowthWidgetManager$k(GrowthWidgetManager p0,WidgetType p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthWidgetManager$k.class, "1")) {
       }else {
          this.b.c().updateAppWidget(this.b.a(WidgetType.TODAY_EAT), c.b.i(null, this.c, null));
          PatchProxy.onMethodExit(GrowthWidgetManager$k.class, "1");
       }
       return;
    }
}
