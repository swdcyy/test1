package com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$f;
import erd.g;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import java.lang.Object;
import com.yxcorp.gifshow.growth.model.response.GrowthScreensWidgetResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.appwidget.AppWidgetManager;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import android.content.ComponentName;
import lra.c;
import com.yxcorp.gifshow.growth.model.response.GrowthScreensWidgetResponse$DesktopWidgetData;
import android.widget.RemoteViews;
import lra.c$a;

public final class GrowthWidgetManager$f implements g	// class@0015ce
{
    public final GrowthWidgetManager b;

    public void GrowthWidgetManager$f(GrowthWidgetManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthWidgetManager$f.class, "1")) {
       }else {
          a.p(p0, "response");
          p0 = p0.desktopWidget;
          this.b.c().updateAppWidget(this.b.a(WidgetType.SCREENS), c.b.g(p0.title, p0.badgeCount, p0.iconUrl));
          PatchProxy.onMethodExit(GrowthWidgetManager$f.class, "1");
       }
       return;
    }
}
