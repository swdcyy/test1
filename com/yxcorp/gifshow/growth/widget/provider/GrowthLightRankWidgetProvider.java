package com.yxcorp.gifshow.growth.widget.provider.GrowthLightRankWidgetProvider;
import android.appwidget.AppWidgetProvider;
import com.yxcorp.gifshow.growth.widget.provider.GrowthLightRankWidgetProvider$mWidgetManager$2;
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

public final class GrowthLightRankWidgetProvider extends AppWidgetProvider	// class@001600
{
    public final p a;
    public boolean b;

    public void GrowthLightRankWidgetProvider(){
       super();
       this.a = s.c(GrowthLightRankWidgetProvider$mWidgetManager$2.INSTANCE);
    }
    public final GrowthWidgetManager a(){
       Object obj = PatchProxy.apply(null, this, GrowthLightRankWidgetProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public void onDisabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthLightRankWidgetProvider.class, "4")) {
          return;
       }
       super.onDisabled(p0);
       c.b.d(-1);
       c.a.g(WidgetType.RANK_LIGHT);
       return;
    }
    public void onEnabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthLightRankWidgetProvider.class, "2")) {
          return;
       }
       super.onEnabled(p0);
       c.b.d(1);
       WidgetType rANK_LIGHT = WidgetType.RANK_LIGHT;
       c.a.e(rANK_LIGHT, false);
       this.a().h(rANK_LIGHT);
       return;
    }
    public void onUpdate(Context p0,AppWidgetManager p1,int[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GrowthLightRankWidgetProvider.class, "3")) {
          return;
       }
       super.onUpdate(p0, p1, p2);
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.a().h(WidgetType.RANK_LIGHT);
       return;
    }
}
