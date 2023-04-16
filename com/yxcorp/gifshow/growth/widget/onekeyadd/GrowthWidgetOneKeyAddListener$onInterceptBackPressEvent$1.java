package com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$onInterceptBackPressEvent$1;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hra.c;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import ira.e;
import hra.c$a;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import java.util.Objects;
import java.lang.Boolean;
import android.appwidget.AppWidgetManager;
import wkd.b;
import android.content.ComponentName;
import android.app.Application;
import o56.a;
import android.content.SharedPreferences;
import k85.c;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public final class GrowthWidgetOneKeyAddListener$onInterceptBackPressEvent$1 extends BroadcastReceiver	// class@0015e9
{
    public final GrowthWidgetOneKeyAddListener a;

    public void GrowthWidgetOneKeyAddListener$onInterceptBackPressEvent$1(GrowthWidgetOneKeyAddListener p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       int b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthWidgetOneKeyAddListener$onInterceptBackPressEvent$1.class, "1")) {
          return;
       }
       if (p1 != null) {
          int i = 0;
          if (!a.g("ACTION_GROWTH_WIDGET_ONE_KEY_ADD", p1.getAction())) {
             b = i;
          }
          if (p1) {
             c.a.f(this.a.c(), true, GrowthWidgetOneKeyAddListener.b(this.a).d());
             GrowthWidgetManager growthWidget = GrowthWidgetOneKeyAddListener.a(this.a);
             b = GrowthWidgetOneKeyAddListener.b(this.a).d();
             Objects.requireNonNull(growthWidget);
             GrowthWidgetManager growthWidget1 = GrowthWidgetManager.class;
             if (!PatchProxy.isSupport(growthWidget1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), growthWidget, growthWidget1, "6")) {
                int[] appWidIds = growthWidget.c().getAppWidgetIds(growthWidget.a(b.a(0x5c40f583).c()));
                if (appWidIds != null) {
                   int i1 = (!appWidIds.length)? 1: 0;
                   if (i1 ^ true) {
                      i = appWidIds;
                   }
                   if (i != null) {
                      g.a(c.a(a.b(), "SP_NAME_GROWTH_WIDGET", 0).edit().putInt("SP_KEY_WIDGET_AUTOMATICAL_ID", i[0]).putBoolean("SP_KEY_WIDGET_AUTO_ADD_EXP_TYPE", b));
                   }
                }
             }
             GrowthWidgetOneKeyAddListener.a(this.a).j(this.a.c());
             growthWidget.c = true;
          }
       }
       UniversalReceiver.f(a.b(), this);
       return;
    }
}
