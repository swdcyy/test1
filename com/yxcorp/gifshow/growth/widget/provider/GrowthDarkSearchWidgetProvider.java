package com.yxcorp.gifshow.growth.widget.provider.GrowthDarkSearchWidgetProvider;
import android.appwidget.AppWidgetProvider;
import com.yxcorp.gifshow.growth.widget.provider.GrowthDarkSearchWidgetProvider$mWidgetManager$2;
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
import cra.w;
import q87.c;
import android.appwidget.AppWidgetManager;

public final class GrowthDarkSearchWidgetProvider extends AppWidgetProvider	// class@0015fa
{
    public final p a;
    public boolean b;

    public void GrowthDarkSearchWidgetProvider(){
       super();
       this.a = s.c(GrowthDarkSearchWidgetProvider$mWidgetManager$2.INSTANCE);
    }
    public final GrowthWidgetManager a(){
       Object obj = PatchProxy.apply(null, this, GrowthDarkSearchWidgetProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public void onDisabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthDarkSearchWidgetProvider.class, "4")) {
          return;
       }
       super.onDisabled(p0);
       c.b.d(-1);
       c.a.g(WidgetType.SEARCH_DARK);
       Object[] objArray = new Object[0];
       w.C().w("GrowthDarkSearchWidgetProvider", "onDisabled", objArray);
       return;
    }
    public void onEnabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthDarkSearchWidgetProvider.class, "2")) {
          return;
       }
       super.onEnabled(p0);
       c.b.d(1);
       boolean b = false;
       if (!this.a().d()) {
          c.a.e(WidgetType.SEARCH_DARK, b);
       }
       Object[] objArray = new Object[b];
       w.C().w("GrowthDarkSearchWidgetProvider", "onEnabled", objArray);
       this.a().j(WidgetType.SEARCH_DARK);
       return;
    }
    public void onUpdate(Context p0,AppWidgetManager p1,int[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GrowthDarkSearchWidgetProvider.class, "3")) {
          return;
       }
       super.onUpdate(p0, p1, p2);
       if (this.b != null) {
          return;
       }
       this.b = true;
       Object[] objArray = new Object[0];
       w.C().w("GrowthDarkSearchWidgetProvider", "onUpdate", objArray);
       this.a().j(WidgetType.SEARCH_DARK);
       return;
    }
}
