package com.yxcorp.gifshow.growth.widget.provider.GrowthDarkRankWidgetProvider;
import android.appwidget.AppWidgetProvider;
import com.yxcorp.gifshow.growth.widget.provider.GrowthDarkRankWidgetProvider$mWidgetManager$2;
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

public final class GrowthDarkRankWidgetProvider extends AppWidgetProvider	// class@0015f8
{
    public final p a;
    public boolean b;

    public void GrowthDarkRankWidgetProvider(){
       super();
       this.a = s.c(GrowthDarkRankWidgetProvider$mWidgetManager$2.INSTANCE);
    }
    public final GrowthWidgetManager a(){
       Object obj = PatchProxy.apply(null, this, GrowthDarkRankWidgetProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public void onDisabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthDarkRankWidgetProvider.class, "4")) {
          return;
       }
       super.onDisabled(p0);
       c.b.d(-1);
       c.a.g(WidgetType.RANK_DARK);
       Object[] objArray = new Object[0];
       w.C().w("GrowthDarkRankWidgetProvider", "onDisabled", objArray);
       return;
    }
    public void onEnabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthDarkRankWidgetProvider.class, "2")) {
          return;
       }
       super.onEnabled(p0);
       c.b.d(1);
       WidgetType rANK_DARK = WidgetType.RANK_DARK;
       c.a.e(rANK_DARK, false);
       Object[] objArray = new Object[false];
       w.C().w("GrowthDarkRankWidgetProvider", "onEnabled", objArray);
       this.a().h(rANK_DARK);
       return;
    }
    public void onUpdate(Context p0,AppWidgetManager p1,int[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GrowthDarkRankWidgetProvider.class, "3")) {
          return;
       }
       super.onUpdate(p0, p1, p2);
       if (this.b != null) {
          return;
       }
       this.b = true;
       Object[] objArray = new Object[0];
       w.C().w("GrowthDarkRankWidgetProvider", "onUpdate", objArray);
       this.a().h(WidgetType.RANK_DARK);
       return;
    }
}
