package com.yxcorp.gifshow.growth.widget.provider.GrowthEatWidgetProvider;
import android.appwidget.AppWidgetProvider;
import com.yxcorp.gifshow.growth.widget.provider.GrowthEatWidgetProvider$a;
import nsd.u;
import com.yxcorp.gifshow.growth.widget.provider.GrowthEatWidgetProvider$mWidgetManager$2;
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
import android.appwidget.AppWidgetManager;
import android.os.Bundle;
import java.lang.Integer;
import android.app.Application;
import o56.a;
import android.content.SharedPreferences;
import k85.c;
import kotlin.jvm.internal.a;
import com.kwai.android.common.ext.SharePreferenceExtKt;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.growth.widget.provider.GrowthEatWidgetProvider$onAppWidgetOptionsChanged$1;
import com.kwai.android.common.ext.ContextExtKt;
import lra.c;
import lra.c$a;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$a;
import crd.b;
import java.util.Objects;

public final class GrowthEatWidgetProvider extends AppWidgetProvider	// class@0015fe
{
    public final p a;
    public b b;
    public static GrowthScreensTodayEatWidgetResponse c;
    public static final GrowthEatWidgetProvider$a d;

    static {
       GrowthEatWidgetProvider.d = new GrowthEatWidgetProvider$a(null);
    }
    public void GrowthEatWidgetProvider(){
       super();
       this.a = s.c(GrowthEatWidgetProvider$mWidgetManager$2.INSTANCE);
    }
    public final GrowthWidgetManager a(){
       Object obj = PatchProxy.apply(null, this, GrowthEatWidgetProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public void onAppWidgetOptionsChanged(Context p0,AppWidgetManager p1,int p2,Bundle p3){
       if (PatchProxy.isSupport(GrowthEatWidgetProvider.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, GrowthEatWidgetProvider.class, "5")) {
          return;
       }
       super.onAppWidgetOptionsChanged(p0, p1, p2, p3);
       int i = 0;
       int intx = (p3 != null)? p3.getInt("appWidgetMaxWidth"): 0;
       SharedPreferences sharedPrefer = c.a(a.b(), "SP_NAME_GROWTH_WIDGET", i);
       a.o(sharedPrefer, "KwaiSharedPreferences.ob¡­xt\n        .MODE_PRIVATE\)");
       SharePreferenceExtKt.put(sharedPrefer, "SP_KEY_WIDGET_MAX_WIDTH", intx);
       Object[] objArray = new Object[i];
       w.C().w("GrowthEatWidgetProvider", "max width="+intx, objArray);
       ContextExtKt.runOnUiThread(new GrowthEatWidgetProvider$onAppWidgetOptionsChanged$1(this, intx));
       return;
    }
    public void onDisabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthEatWidgetProvider.class, "4")) {
          return;
       }
       super.onDisabled(p0);
       c.b.d(-1);
       GrowthEatWidgetProvider.c = null;
       return;
    }
    public void onEnabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthEatWidgetProvider.class, "2")) {
          return;
       }
       super.onEnabled(p0);
       c.b.d(1);
       return;
    }
    public void onUpdate(Context p0,AppWidgetManager p1,int[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GrowthEatWidgetProvider.class, "3")) {
          return;
       }
       super.onUpdate(p0, p1, p2);
       int i = 0;
       int intx = c.a(a.b(), "SP_NAME_GROWTH_WIDGET", i).getInt("SP_KEY_WIDGET_MAX_WIDTH", -1);
       if (n.z(p0) > 1080) {
          GrowthWidgetManager growthWidget = 340;
          if (true > intx || growthWidget < intx) {
             growthWidget = this.a();
             WidgetType tODAY_EAT = WidgetType.TODAY_EAT;
             if (intx == -1 && !GrowthWidgetManager.k.a()) {
                i = true;
             }
             this.b = growthWidget.l(tODAY_EAT, i);
          label_0066 :
             return;
          }
       }
       GrowthEatWidgetProvider tb = this.b;
       if (tb != null) {
          tb.dispose();
       }
       this.a().l(WidgetType.TODAY_EAT_SMALL, i);
       Objects.requireNonNull(GrowthWidgetManager.k);
       GrowthWidgetManager.j = true;
       goto label_0066 ;
    }
}
