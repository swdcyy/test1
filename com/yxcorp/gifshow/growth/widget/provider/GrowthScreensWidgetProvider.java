package com.yxcorp.gifshow.growth.widget.provider.GrowthScreensWidgetProvider;
import android.appwidget.AppWidgetProvider;
import com.yxcorp.gifshow.growth.widget.provider.GrowthScreensWidgetProvider$mWidgetManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import lra.c;
import lra.c$a;
import hra.c;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import hra.c$a;
import android.appwidget.AppWidgetManager;

public final class GrowthScreensWidgetProvider extends AppWidgetProvider	// class@001604
{
    public final p a;

    public void GrowthScreensWidgetProvider(){
       super();
       this.a = s.c(GrowthScreensWidgetProvider$mWidgetManager$2.INSTANCE);
    }
    public final GrowthWidgetManager a(){
       Object obj = PatchProxy.apply(null, this, GrowthScreensWidgetProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public void onDisabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthScreensWidgetProvider.class, "3")) {
          return;
       }
       super.onDisabled(p0);
       c.b.e(false);
       c.a.g(WidgetType.SCREENS);
       return;
    }
    public void onEnabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthScreensWidgetProvider.class, "2")) {
          return;
       }
       super.onEnabled(p0);
       c.b.e(true);
       if (!this.a().d()) {
          c.a.e(WidgetType.SCREENS, false);
       }
       return;
    }
    public void onUpdate(Context p0,AppWidgetManager p1,int[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GrowthScreensWidgetProvider.class, "4")) {
          return;
       }
       super.onUpdate(p0, p1, p2);
       this.a().i();
       return;
    }
}
