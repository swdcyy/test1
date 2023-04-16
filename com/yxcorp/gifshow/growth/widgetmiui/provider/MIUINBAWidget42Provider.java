package com.yxcorp.gifshow.growth.widgetmiui.provider.MIUINBAWidget42Provider;
import android.appwidget.AppWidgetProvider;
import com.yxcorp.gifshow.growth.widgetmiui.provider.MIUINBAWidget42Provider$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.widgetmiui.util.NBAWidgetNetworkDectector;
import java.util.Objects;
import pra.a;
import pra.a$a;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import android.content.IntentFilter;
import android.content.Intent;
import java.lang.Exception;
import kotlin.jvm.internal.a;
import android.appwidget.AppWidgetManager;
import com.yxcorp.gifshow.growth.widgetmiui.NBAWidgetProviderManager;
import java.lang.System;

public final class MIUINBAWidget42Provider extends AppWidgetProvider	// class@00161c
{
    public boolean a;
    public static long b;
    public static final MIUINBAWidget42Provider$a c;

    static {
       MIUINBAWidget42Provider.c = new MIUINBAWidget42Provider$a(null);
    }
    public void MIUINBAWidget42Provider(){
       super();
    }
    public void onDisabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MIUINBAWidget42Provider.class, "4")) {
          return;
       }
       super.onDisabled(p0);
       NBAWidgetNetworkDectector c = NBAWidgetNetworkDectector.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(null, c, NBAWidgetNetworkDectector.class, "2")) {
          UniversalReceiver.f(a.a.a(), NBAWidgetNetworkDectector.b);
       }
       return;
    }
    public void onEnabled(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MIUINBAWidget42Provider.class, "3")) {
          return;
       }
       super.onEnabled(p0);
       NBAWidgetNetworkDectector c = NBAWidgetNetworkDectector.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(null, c, NBAWidgetNetworkDectector.class, "1")) {
          try{
             UniversalReceiver.e(a.a.a(), NBAWidgetNetworkDectector.b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public void onReceive(Context p0,Intent p1){
       String action;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MIUINBAWidget42Provider.class, "1")) {
          return;
       }
       try{
          boolean b = false;
          if (p1 != null) {
             b = p1.getBooleanExtra("manual_update", b);
          label_0017 :
             this.a = b;
             String str = "android.appwidget.action.APPWIDGET_UPDATE";
             String str1 = null;
             action = (p1 != null)? p1.getAction(): str1;
             if (!a.g(str, action)) {
                str = "miui.appwidget.action.APPWIDGET_UPDATE";
                if (p1 != null) {
                   str1 = p1.getAction();
                }
                if (!a.g(str, str1)) {
                   super.onReceive(p0, p1);
                }
             }
             this.onUpdate(p0, AppWidgetManager.getInstance(p0), p1.getIntArrayExtra("appWidgetIds"));
          }else {
             goto label_0017 ;
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          NBAWidgetProviderManager.b.c();
       }
       return;
    }
    public void onUpdate(Context p0,AppWidgetManager p1,int[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MIUINBAWidget42Provider.class, "2")) {
          return;
       }
       if (this.a != null) {
          long l = System.currentTimeMillis();
          if ((l - MIUINBAWidget42Provider.b) - (long)1000 >= 0) {
             NBAWidgetProviderManager.b.c();
             MIUINBAWidget42Provider.b = l;
          }
       }else {
          NBAWidgetProviderManager.b.c();
       }
       return;
    }
}
