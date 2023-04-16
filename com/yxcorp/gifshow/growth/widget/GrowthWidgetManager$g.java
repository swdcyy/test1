package com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$g;
import erd.g;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.appwidget.AppWidgetManager;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import android.content.ComponentName;
import lra.c;
import android.widget.RemoteViews;
import lra.c$a;

public final class GrowthWidgetManager$g implements g	// class@0015cf
{
    public final GrowthWidgetManager b;

    public void GrowthWidgetManager$g(GrowthWidgetManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthWidgetManager$g.class, "1")) {
       }else {
          this.b.c().updateAppWidget(this.b.a(WidgetType.SCREENS), c.b.g("", -1, ""));
          PatchProxy.onMethodExit(GrowthWidgetManager$g.class, "1");
       }
       return;
    }
}
