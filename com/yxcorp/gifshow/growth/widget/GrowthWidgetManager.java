package com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$mManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import hra.a;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$c;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$b;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import cra.w;
import java.lang.Exception;
import q87.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.app.Application;
import o56.a;
import hra.d;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import com.yxcorp.gifshow.growth.widget.provider.GrowthEatWidgetProvider;
import android.content.Context;
import com.yxcorp.gifshow.growth.widget.provider.GrowthScreensWidgetProvider;
import com.yxcorp.gifshow.growth.widget.provider.GrowthLightRankWidgetProvider;
import com.yxcorp.gifshow.growth.widget.provider.GrowthDarkRankWidgetProvider;
import com.yxcorp.gifshow.growth.widget.provider.GrowthLightSearchWidgetProvider;
import com.yxcorp.gifshow.growth.widget.provider.GrowthDarkSearchWidgetProvider;
import java.lang.System;
import android.content.Intent;
import qrd.l1;
import android.app.PendingIntent;
import android.os.Bundle;
import qe6.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.p;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$onInit$1;
import hra.e;
import msd.l;
import erd.g;
import crd.b;
import wkd.b;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener;
import lra.c;
import lra.c$a;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import android.appwidget.AppWidgetProviderInfo;
import java.util.Collection;
import trd.u;
import nyb.h;
import com.yxcorp.gifshow.plugin.impl.search.util.SearchLoadPolicy;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$d;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$e;
import cra.x;
import yma.a;
import yma.b;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$f;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$g;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$h;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$i;
import com.yxcorp.gifshow.growth.model.response.GrowthScreensTodayEatWidgetResponse;
import android.graphics.Bitmap;
import spa.c;
import com.yxcorp.gifshow.growth.model.response.GrowthScreensTodayEatWidgetResponse$DesktopWidgetData;
import android.widget.RemoteViews;
import java.lang.Long;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$j;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$k;
import java.lang.CharSequence;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$l;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import com.yxcorp.gifshow.growth.widget.provider.GrowthEatWidgetProvider$a;

public class GrowthWidgetManager	// class@0015d7
{
    public final p a;
    public final a b;
    public boolean c;
    public boolean d;
    public long e;
    public b f;
    public final Runnable g;
    public final Runnable h;
    public static boolean i;
    public static boolean j;
    public static final GrowthWidgetManager$a k;

    static {
       GrowthWidgetManager.k = new GrowthWidgetManager$a(null);
    }
    public void GrowthWidgetManager(){
       super();
       this.a = s.c(GrowthWidgetManager$mManager$2.INSTANCE);
       this.b = new a();
       this.g = new GrowthWidgetManager$c(this);
       this.h = new GrowthWidgetManager$b(this);
    }
    public static boolean e(GrowthWidgetManager p0,WidgetType[] p1,boolean p2,int p3,Object p4){
       boolean b = false;
       if (p3 & 0x02) {
          p2 = false;
       }
       try{
          Objects.requireNonNull(p0);
          if (PatchProxy.isSupport(GrowthWidgetManager.class)) {
             String obj = PatchProxy.applyTwoRefs(p1, Boolean.valueOf(p2), p0, GrowthWidgetManager.class, "4");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
             label_0026 :
                obj = "types";
                a.p(p1, obj);
                int len = p1.length;
                int i = 0;
                while (true) {
                   if (i < len) {
                      int len1 = p0.c().getAppWidgetIds(p0.a(p1[i])).length;
                      if (!p2 || len1) {
                         if (len1 > 0) {
                         label_004b :
                            b = true;
                            break ;
                         }else {
                            i = i + 1;
                         }
                      }
                   }else if(p2){
                      goto label_004b ;
                   }
                }
             }
          }else {
             goto label_0026 ;
          }
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[b];
          w.C().t(GrowthWidgetManager.class.getSimpleName(), String.valueOf(e4.getMessage()), objArray);
          ExceptionHandler.handleCaughtException(e4);
       }
       return b;
    }
    public final ComponentName a(WidgetType p0){
       ComponentName uComponentNa;
       Application obj = PatchProxy.applyOneRefs(p0, this, GrowthWidgetManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.b();
       switch (d.a[p0.ordinal()]){
           case 1:
             uComponentNa = new ComponentName(obj, GrowthDarkSearchWidgetProvider.class);
             break;
           case 2:
             uComponentNa = new ComponentName(obj, GrowthLightSearchWidgetProvider.class);
             break;
           case 3:
             uComponentNa = new ComponentName(obj, GrowthDarkRankWidgetProvider.class);
             break;
           case 4:
             uComponentNa = new ComponentName(obj, GrowthLightRankWidgetProvider.class);
             break;
           case 5:
             uComponentNa = new ComponentName(obj, GrowthScreensWidgetProvider.class);
             break;
           case 6:
           case 7:
             uComponentNa = new ComponentName(obj, GrowthEatWidgetProvider.class);
             break;
           default:
             throw new NoWhenBranchMatchedException();
       }
       return uComponentNa;
    }
    public final boolean b(WidgetType p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, GrowthWidgetManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "widgetType");
       a.p(p1, "successAction");
       this.d = true;
       this.e = System.currentTimeMillis();
       Intent intent = new Intent();
       intent.setAction(p1);
       intent.putExtra("KEY_ONE_KEY_ADD_WIDGET_TYPE", p0.getType());
       this.c().requestPinAppWidget(this.a(p0), null, PendingIntent.getBroadcast(a.b(), 0, intent, 0x8000000));
       return true;
    }
    public final AppWidgetManager c(){
       Object obj = PatchProxy.apply(null, this, GrowthWidgetManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, GrowthWidgetManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d != null && (System.currentTimeMillis() - this.e) - 0x7530 < 0)? true: false;
       return b;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, GrowthWidgetManager.class, "2")) {
          return;
       }
       if (!b.a()) {
          if (this.f == null) {
             this.f = RxBus.f.f(p.class).observeOn(d.a).subscribe(new e(new GrowthWidgetManager$onInit$1(this)));
          }
       }else {
          b.a(0x5c40f583).e(this);
          if (c.b.f()) {
             c.b(this.g);
          }
       }
       return;
    }
    public final void g(){
       WidgetType sEARCH_DARK;
       if (PatchProxy.applyVoid(null, this, GrowthWidgetManager.class, "3")) {
          return;
       }
       if (!c.b.f()) {
          return;
       }
       List installedPro = this.c().getInstalledProviders();
       if (installedPro != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = installedPro.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             AppWidgetProviderInfo provider = obj.provider;
             a.o(provider, "provider.provider");
             Application uApplication = a.b();
             a.o(uApplication, "AppEnv.getAppContext\(\)");
             if (a.g(provider.getPackageName(), uApplication.getPackageName())) {
                uArrayList.add(obj);
             }
          }
          ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             uArrayList1.add(iterator1.next().label);
          }
          if (uArrayList1.contains(a.B.getString(0x7f10132e))) {
             sEARCH_DARK = WidgetType.SEARCH_DARK;
             if (this.c().getAppWidgetIds(this.a(sEARCH_DARK)).length > 0) {
                c.b.k(true);
                this.j(sEARCH_DARK);
             }
          }
          if (uArrayList1.contains(a.B.getString(0x7f10132f))) {
             sEARCH_DARK = WidgetType.SEARCH_LIGHT;
             if (this.c().getAppWidgetIds(this.a(sEARCH_DARK)).length > 0) {
                c.b.k(true);
                this.j(sEARCH_DARK);
             }
          }
          if (uArrayList1.contains(a.B.getString(0x7f10132c))) {
             sEARCH_DARK = WidgetType.RANK_LIGHT;
             if (this.c().getAppWidgetIds(this.a(sEARCH_DARK)).length > 0) {
                c.b.k(true);
                this.h(sEARCH_DARK);
             }
          }
          if (uArrayList1.contains(a.B.getString(0x7f10132b))) {
             sEARCH_DARK = WidgetType.RANK_DARK;
             if (this.c().getAppWidgetIds(this.a(sEARCH_DARK)).length > 0) {
                c.b.k(true);
                this.h(sEARCH_DARK);
             }
          }
          if (uArrayList1.contains(a.B.getString(0x7f10132d)) && this.c().getAppWidgetIds(this.a(WidgetType.SCREENS)).length > 0) {
             c.b.k(true);
             this.i();
          }
       }
    label_0141 :
       return;
    }
    public final void h(WidgetType p0){
       GrowthWidgetManager growthWidget = GrowthWidgetManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, growthWidget, "11")) {
          return;
       }
       a.p(p0, "widgetType");
       int i = 0;
       Object[] objArray = new Object[i];
       w.C().w(growthWidget.getSimpleName(), "before updateRankWidget", objArray);
       if (c.b.f() && (p0 == WidgetType.RANK_LIGHT || p0 == WidgetType.RANK_DARK)) {
          Object[] objArray1 = new Object[i];
          w.C().w(growthWidget.getSimpleName(), "updateRankWidget mPlugin", objArray1);
          String[] stringArray = new String[]{"search_feature"};
          b.a(0x560d43).f(SearchLoadPolicy.SILENT, stringArray).subscribe(new GrowthWidgetManager$d(this, p0), new GrowthWidgetManager$e(this));
       }
       return;
    }
    public final void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthWidgetManager.class, "12")) {
          return;
       }
       if (c.b.f()) {
          x a = x.a;
          Objects.requireNonNull(a);
          t ot = PatchProxy.apply(objArray, a, x.class, "1");
          if (ot != PatchProxyResult.class) {
          }else {
             b obj = b.a(-1257347683);
             a.o(obj, "Singleton.get\(GrowthApi::class.java\)");
             obj = obj.b();
             a.o(obj, "Singleton.get\(GrowthApi::class.java\).apiService");
             ot = obj.h();
          }
          if (ot != null) {
             ot.subscribeOn(d.c).observeOn(d.a).map(new e()).subscribe(new GrowthWidgetManager$f(this), new GrowthWidgetManager$g(this));
          }
       }
       return;
    }
    public final void j(WidgetType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthWidgetManager.class, "10")) {
          return;
       }
       a.p(p0, "widgetType");
       if (!c.b.f() || (p0 != WidgetType.RANK_DARK && p0 != WidgetType.RANK_LIGHT)) {
          String[] stringArray = new String[]{"search_feature"};
          b.a(0x560d43).f(SearchLoadPolicy.SILENT, stringArray).subscribe(new GrowthWidgetManager$h(this, p0), new GrowthWidgetManager$i(this));
       }
    label_0043 :
       return;
    }
    public final void k(GrowthScreensTodayEatWidgetResponse p0,WidgetType p1,Bitmap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GrowthWidgetManager.class, "15")) {
          return;
       }
       if (GrowthWidgetManager.j && p1 == WidgetType.TODAY_EAT) {
          return;
       }
       super();
       p0 = p0.desktopWidget;
       this.a = p0.title;
       this.b = p0.subTitle;
       this.c = p0.cuisine;
       this.d = p0.background;
       this.e = p0.linkUrl;
       this.c().updateAppWidget(this.a(WidgetType.TODAY_EAT), c.b.i(this, p1, p2));
       return;
    }
    public final b l(WidgetType p0,boolean p1){
       x obj;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GrowthWidgetManager growthWidget = GrowthWidgetManager.class;
       if (PatchProxy.isSupport(growthWidget)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, growthWidget, "13");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "widgetType");
       GrowthWidgetManager$k ok = null;
       if (c.b.f()) {
          obj = x.a;
          long l = System.currentTimeMillis();
          Objects.requireNonNull(obj);
          if (PatchProxy.isSupport(x.class)) {
             ot = PatchProxy.applyOneRefs(Long.valueOf(l), obj, x.class, "2");
             if (ot != patchProxyRe) {
             label_005d :
                if (ot != null) {
                   ok = ot.subscribeOn(d.c).observeOn(d.a).map(new e()).subscribe(new GrowthWidgetManager$j(this, p0, p1), new GrowthWidgetManager$k(this, p0, p1));
                }
             }
          }
          Object obj1 = b.a(-1257347683);
          a.o(obj1, "Singleton.get\(GrowthApi::class.java\)");
          ot = obj1.b().a(l);
          goto label_005d ;
       }
       return ok;
    }
    public final void m(GrowthScreensTodayEatWidgetResponse p0,WidgetType p1,boolean p2){
       if (PatchProxy.isSupport(GrowthWidgetManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, GrowthWidgetManager.class, "14")) {
          return;
       }
       a.p(p1, "widgetType");
       if (p0 != null) {
          this.k(p0, p1, null);
          GrowthScreensTodayEatWidgetResponse$DesktopWidgetData background = p0.desktopWidget.background;
          GrowthScreensTodayEatWidgetResponse growthScreen = (background == null || !background.length())? 1: null;
          if (!growthScreen) {
             a.e(p0.desktopWidget.background, new GrowthWidgetManager$l(p0, this, p1, p2));
          }
          if (p2) {
             GrowthEatWidgetProvider.d.a(p0);
          }
       }
       return;
    }
}
