package com.yxcorp.gifshow.growth.widgetmiui.NBAWidgetProviderManager;
import com.yxcorp.gifshow.growth.widgetmiui.NBAWidgetProviderManager$manager$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.appwidget.AppWidgetManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import com.yxcorp.gifshow.growth.widgetmiui.NBAWidgetProviderManager$a;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.growth.widgetmiui.NBAWidgetProviderManager$b;
import erd.g;
import crd.b;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.app.Application;
import o56.a;
import trd.u;
import com.yxcorp.gifshow.growth.widgetmiui.provider.MIUINBAWidget42Provider;
import android.content.Context;
import java.lang.System;
import com.yxcorp.gifshow.growth.widgetmiui.model.NBAWidgetBean;
import pra.d$a;
import java.lang.Integer;
import pra.d;
import java.util.Objects;
import android.widget.RemoteViews;
import pra.a;
import pra.a$a;
import android.content.Intent;
import android.app.PendingIntent;
import ora.a;
import ora.c;
import java.lang.CharSequence;
import pra.b;
import pra.b$a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.growth.widgetmiui.model.MiuiWidgetNBADeepLink;
import com.yxcorp.gifshow.growth.widgetmiui.model.MiuiWidgetNBAKuaiShou;
import nra.a;
import android.os.Bundle;

public final class NBAWidgetProviderManager	// class@001617
{
    public static final p a;
    public static final NBAWidgetProviderManager b;

    static {
       NBAWidgetProviderManager.b = new NBAWidgetProviderManager();
       NBAWidgetProviderManager.a = s.c(NBAWidgetProviderManager$manager$2.INSTANCE);
    }
    public void NBAWidgetProviderManager(){
       super();
    }
    public final AppWidgetManager a(){
       Object obj = PatchProxy.apply(null, this, NBAWidgetProviderManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NBAWidgetProviderManager.a.getValue();
    }
    public final void b(int[] p0,long p1,String p2){
       if (PatchProxy.isSupport(NBAWidgetProviderManager.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, NBAWidgetProviderManager.class, "3")) {
          return;
       }
       try{
          t.create(new NBAWidgetProviderManager$a(p1, p2)).subscribeOn(d.b).observeOn(d.a).subscribe(new NBAWidgetProviderManager$b(p0));
       }catch(java.lang.Exception e0){
          this.c();
       }
       return;
    }
    public final void c(){
       NBAWidgetProviderManager nBAWidgetPro = NBAWidgetProviderManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nBAWidgetPro, "2")) {
          return;
       }
       List installedPro = this.a().getInstalledProviders();
       a.o(installedPro, "manager.installedProviders");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = installedPro.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          AppWidgetProviderInfo provider = obj.provider;
          a.o(provider, "info.provider");
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
       if (uArrayList1.contains(a.b().getString(0x7f103653))) {
          NBAWidgetProviderManager b = NBAWidgetProviderManager.b;
          AppWidgetManager uAppWidgetMa = b.a();
          ComponentName uComponentNa = PatchProxy.apply(objArray, b, nBAWidgetPro, "6");
          if (uComponentNa != PatchProxyResult.class) {
          }else {
             uComponentNa = new ComponentName(a.b(), MIUINBAWidget42Provider.class);
          }
          int[] appWidIds = uAppWidgetMa.getAppWidgetIds(uComponentNa);
          a.o(appWidIds, "array");
          int i = 1;
          int i1 = (!appWidIds.length)? 1: 0;
          if (i1 ^ i) {
             b.b(appWidIds, System.currentTimeMillis(), "NBA_4");
          }
       }
       return;
    }
    public final void d(int[] p0,NBAWidgetBean p1,int p2){
       d$a a;
       RemoteViews remoteViews;
       RemoteViews obj2;
       a uoa2;
       a$a this;
       int i1;
       String str;
       int len;
       NBAWidgetProviderManager b;
       List list3;
       RemoteViews remoteViews1;
       int[] ointArray;
       String str2;
       int i4;
       PendingIntent pendingInten;
       CharSequence uCharSequenc;
       Object obj = p0;
       List obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(NBAWidgetProviderManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, NBAWidgetProviderManager.class, "4")) {
          return;
       }
       List list = (obj1)? p1.a(): null;
       int i = 0;
       if (!p2) {
          a = d.a;
          Objects.requireNonNull(a);
          remoteViews = PatchProxy.applyTwoRefs(obj, list, a, uoa, "1");
          if (remoteViews != patchProxyRe) {
          }else {
             a.p(obj, "widgetIdArray");
             a$a a1 = a.a;
             obj2 = new RemoteViews(a1.b(), 0x7f0d1084);
             Intent intent = new Intent(a1.a(), MIUINBAWidget42Provider.class);
             intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
             intent.putExtra("appWidgetIds", obj);
             intent.putExtra("manual_update", 1);
             obj2.setOnClickPendingIntent(R.id.refresh_button, PendingIntent.getBroadcast(a1.a(), i, intent, 0x8000000));
             if (list != null) {
                Object obj3 = list.get(i);
                a uoa3 = (list.size() > 1)? list.get(1): null;
                List list1 = obj3.e();
                List list2 = (uoa3 != null)? uoa3.e(): null;
                if (list1 != null && list1.size() > 1) {
                   obj2.setTextViewText(R.id.miui_42_nba_name_one_one, list1.get(i).c());
                   obj2.setTextViewText(R.id.miui_42_nba_score_one_one, String.valueOf(list1.get(i).d()));
                   b$a c = b.c;
                   list3 = list2;
                   remoteViews1 = obj2;
                   List list4 = list1;
                   ointArray = p0;
                   c.b(list1.get(i).b(), Long.valueOf(list1.get(i).a()), R.id.miui_42_nba_avatar_one_one, remoteViews1, ointArray);
                   obj2.setTextViewText(R.id.miui_42_nba_name_one_two, list4.get(1).c());
                   obj2.setTextViewText(R.id.miui_42_nba_score_one_two, String.valueOf(list4.get(1).d()));
                   c.b(list4.get(1).b(), Long.valueOf(list4.get(1).a()), R.id.miui_42_nba_avatar_one_two, remoteViews1, ointArray);
                }else {
                   list3 = list2;
                }
                if (list3 != null && list3.size() > 1) {
                   obj2.setTextViewText(R.id.miui_42_nba_name_two_one, list3.get(i).c());
                   obj2.setTextViewText(R.id.miui_42_nba_score_two_one, String.valueOf(list3.get(i).d()));
                   b$a c1 = b.c;
                   remoteViews1 = obj2;
                   ointArray = p0;
                   c1.b(list3.get(i).b(), Long.valueOf(list3.get(i).a()), R.id.miui_42_nba_avatar_two_one, remoteViews1, ointArray);
                   obj2.setTextViewText(R.id.miui_42_nba_name_two_two, list3.get(1).c());
                   obj2.setTextViewText(R.id.miui_42_nba_score_two_two, String.valueOf(list3.get(1).d()));
                   c1.b(list3.get(1).b(), Long.valueOf(list3.get(1).a()), R.id.miui_42_nba_avatar_two_two, remoteViews1, ointArray);
                }
                str2 = "  ";
                obj2.setTextViewText(R.id.miui_42_nba_date_one, obj3.b()+str2+obj3.c());
                int i2 = 0x7f0a2b9e;
                StringBuilder str3 = "";
                String int str4 = (uoa3 != null)? uoa3.b(): null;
                str3 = str3+str4+str2;
                str2 = (uoa3 != null)? uoa3.c(): null;
                obj2.setTextViewText(i2, str3+str2);
                len = 0x7f0a2ba6;
                i1 = 0x7f0a2ba5;
                str4 = 0x7f0a2baf;
                int i3 = 0x7f0a2bae;
                i4 = 8;
                if (a.g(obj3.d(), a1.c(0x7f103655))) {
                   obj2.setViewVisibility(i3, i);
                   obj2.setViewVisibility(i1, i);
                   obj2.setViewVisibility(str4, i4);
                   obj2.setViewVisibility(len, i4);
                   obj2.setTextViewText(i3, obj3.d());
                }else {
                   obj2.setViewVisibility(i3, i4);
                   obj2.setViewVisibility(i1, i4);
                   obj2.setViewVisibility(str4, i);
                   obj2.setViewVisibility(len, i);
                   obj2.setTextViewText(str4, obj3.d());
                }
                str = (uoa3 != null)? uoa3.d(): null;
                len = 0x7f0a2ba8;
                i1 = 0x7f0a2ba7;
                str4 = 0x7f0a2bb2;
                i3 = 0x7f0a2bb1;
                if (a.g(str, a1.c(0x7f103655))) {
                   obj2.setViewVisibility(i3, i);
                   obj2.setViewVisibility(i1, i);
                   obj2.setViewVisibility(str4, i4);
                   obj2.setViewVisibility(len, i4);
                   str = (uoa3 != null)? uoa3.d(): null;
                   obj2.setTextViewText(i3, str);
                }else {
                   obj2.setViewVisibility(i3, i4);
                   obj2.setViewVisibility(i1, i4);
                   obj2.setViewVisibility(str4, i);
                   obj2.setViewVisibility(len, i);
                   str = (uoa3 != null)? uoa3.d(): null;
                   obj2.setTextViewText(str4, str);
                }
                i2 = 0x7f0a2b9a;
                uoa2 = obj3.deepLinkMap;
                if (uoa2 != null) {
                   MiuiWidgetNBADeepLink kuaishou = uoa2.kuaishou;
                   if (kuaishou != null) {
                      MiuiWidgetNBAKuaiShou nbaPage = kuaishou.nbaPage;
                      if (nbaPage != null) {
                         pendingInten = a.a(1, nbaPage);
                      label_02c7 :
                         obj2.setOnClickPendingIntent(i2, pendingInten);
                      }
                   }
                }
                pendingInten = null;
                goto label_02c7 ;
             }
             remoteViews = obj2;
          }
       }else {
          d$a a2 = d.a;
          Objects.requireNonNull(a2);
          remoteViews = PatchProxy.applyOneRefs(obj1, a2, uoa, "2");
          if (remoteViews != patchProxyRe) {
          }else {
             a$a a3 = a.a;
             remoteViews = new RemoteViews(a3.b(), 0x7f0d1086);
             NBAWidgetBean keyword = (obj1 != null)? obj1.keyword: null;
             String str5 = (keyword == null || !keyword.length())? 1: null;
             i4 = 2;
             int i5 = 0x7f0a2d0a;
             if (!str5) {
                remoteViews.setTextViewText(R.id.nab_widget_search_text, keyword);
                remoteViews.setOnClickPendingIntent(i5, a2.a(i4, a.a.a(keyword)));
             }else {
                str2 = a3.c(R.string.arg_RES_7f10382e);
                remoteViews.setTextViewText(R.id.nab_widget_search_text, str2);
                remoteViews.setOnClickPendingIntent(i5, a2.a(i4, a.a.a(str2)));
             }
             str5 = "kwai://search?keyword=NBA&openFrom=callback_android_xiaomi_ba_sjcs_nset_ks_xiaomi_miui.NBA2&returnBack=1";
             remoteViews.setOnClickPendingIntent(R.id.nab_widget_tab_news, a2.a(3, str5));
             remoteViews.setOnClickPendingIntent(R.id.nab_widget_tab_playback, a2.a(4, "kwai://live/play/~2086592412?openFrom=callback_android_xiaomi_ba_sjcs_nset_ks_xiaomi_miui.NBA2&returnBack=1"));
             remoteViews.setOnClickPendingIntent(R.id.nab_widget_tab_featured, a2.a(5, "ks://profile/2086592412?openFrom=callback_android_xiaomi_ba_sjcs_nset_ks_xiaomi_miui.NBA2&returnBack=1"));
             remoteViews.setOnClickPendingIntent(R.id.nab_widget_tab_leaderboard, a2.a(6, "kwai://webview?url=https%3A%2F%2Fchannel.m.chenzhongtech.com%2Fnc%2Fsports-channel%2Findex.html%3FhyId%3Dchannel_sports%26srcType%3Dsidebar_no2%26channelId%3D9125%26layoutType%3D4%23%2Fnba%2Fleader&hideToolBar=true&openFrom=callback_android_xiaomi_ba_sjcs_nset_ks_xiaomi_miui.NBA2&returnBack=1"));
             remoteViews.setOnClickPendingIntent(R.id.off_season_layout, a2.a(7, str5));
          }
       }
       obj2 = remoteViews;
       obj1 = (obj1)? p1.a(): null;
       if (!PatchProxy.applyVoidThreeRefs(obj2, p0, obj1, this, NBAWidgetProviderManager.class, "5")) {
          if (obj1 != null) {
             a uoa1 = obj1.get(i);
             uoa2 = (obj1.size() > 1)? obj1.get(1): null;
             this = a.a;
             if (!a.g(uoa1.d(), this.c(0x7f103655))) {
                i1 = 0x7f103654;
                if (!a.g(uoa1.d(), this.c(i1))) {
                   str = (uoa2 != null)? uoa2.d(): null;
                   if (!a.g(str, this.c(0x7f103655))) {
                      String str1 = (uoa2 != null)? uoa2.d(): null;
                      if (!a.g(str1, this.c(i1))) {
                      label_03ee :
                         str = "other";
                      label_03f0 :
                         len = obj.length;
                         for (; i < len; i = i + 1) {
                            i1 = obj[i];
                            super();
                            this.putString("miuiWidgetEventCode", str);
                            this.putString("miuiWidgetTimestamp", String.valueOf(System.currentTimeMillis()));
                            b = NBAWidgetProviderManager.b;
                            b.a().updateAppWidgetOptions(i1, this);
                            b.a().updateAppWidget(i1, obj2);
                         }
                      }
                   }
                }
             }
             str = "live";
             goto label_03f0 ;
          }else {
             goto label_03ee ;
          }
       }
       return;
    }
}
