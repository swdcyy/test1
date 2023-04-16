package com.yxcorp.gifshow.growth.c;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.growth.GrowthInitModule;
import wkd.b;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iqa.b;
import java.util.Set;
import nsd.u;
import java.lang.Integer;
import java.util.Map;
import com.kwai.sdk.switchconfig.a;
import cra.w;
import q87.c;
import jqa.a;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.growth.push.permission.CommonGrowthUpPushGuideConfig;
import com.kwai.framework.abtest.f;
import fg6.a;
import com.yxcorp.gifshow.growth.push.permission.GrowthUpNotifyGuideConfig;
import com.google.gson.Gson;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionRecord;
import com.yxcorp.gifshow.util.DateUtils;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.growth.push.model.PushPermissionValidPlayConfig;
import java.lang.StringBuilder;
import java.lang.System;
import java.util.LinkedHashMap;

public final class c implements Runnable	// class@0012f5
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       PushPermissionValidPlayConfig pushPermissi1;
       Object[] objArray5;
       PushPermissionManager pushPermissi = b.a(-870998025);
       Objects.requireNonNull(pushPermissi);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, pushPermissi, PushPermissionManager.class, "4")) {
       }else {
          b uob = new b(false, null, null, false, false, false, 63, null);
          int i = 90;
          pushPermissi.i.put(Integer.valueOf(i), v1);
          pushPermissi.i.put(Integer.valueOf(82), v1);
          int i1 = 2;
          b uob1 = new b(0, null, 0, 0, 0, 0, 63, 0);
          pushPermissi.i.put(Integer.valueOf(i1), v7);
          String str = a.t().c("pushPermissionGuideDialog", objArray);
          if (str == null) {
             objArray5 = new Object[0];
             w.C().w("PushPermissionManager", "没拉到配置= 消费", objArray5);
             str = "";
          }
          pushPermissi.g = a.t().getValue("growthupPushGuildeFrequency", a.class, objArray);
          pushPermissi.h = f.b("all_sousuo_1", CommonGrowthUpPushGuideConfig.class, objArray);
          GrowthUpNotifyGuideConfig growthUpNoti = a.a.h(str, GrowthUpNotifyGuideConfig.class);
          pushPermissi.f = growthUpNoti;
          GrowthUpNotifyGuideConfig momentLike = (growthUpNoti != null)? growthUpNoti.momentLike: 5;
          pushPermissi.b = momentLike;
          if (!pushPermissi.e().getLastPushPermissionAlertTime()) {
             pushPermissi.e().reset();
          }else if(!DateUtils.J(pushPermissi.e().getLastLikeTime())){
             pushPermissi.e().setLikeTimes(0);
          }
          if (!DateUtils.J(pushPermissi.e().getLastValidPlayTime())) {
             pushPermissi.e().setValidPlayTimes(0);
          }
          Iterator iterator = pushPermissi.e().getValidPlayConfigMap().values().iterator();
          while (iterator.hasNext()) {
             pushPermissi1 = iterator.next();
             if (!DateUtils.J(pushPermissi1.getLastValidPlayTime())) {
                pushPermissi1.setValidPlayTimes(0);
             }
          }
          PushPermissionManager g = pushPermissi.g;
          if (g != null) {
             int i2 = pushPermissi.d(pushPermissi.e().getLastPushPermissionAlertTime());
             a frequencyX = g.frequencyX;
             Object[] objArray2 = new Object[0];
             w.C().w("PushPermissionManager", "短周期 diffShort="+i2+"  X="+frequencyX, objArray2);
             if ((long)i2 - frequencyX > 0) {
                pushPermissi.e().setLastPushPermissionAlertTime(System.currentTimeMillis());
                pushPermissi.e().setPushPermissionShowTimes(0);
                Object[] objArray3 = new Object[0];
                w.C().w("PushPermissionManager", "短周期 清零", objArray3);
             }
             frequencyX = g.frequencyM;
             Object[] objArray4 = new Object[0];
             w.C().w("PushPermissionManager", "长周期 diffLong="+i2+"  M="+frequencyX, objArray4);
             if ((long)pushPermissi.d(pushPermissi.e().getLastPushPermissionAlertTimeLongPeriod()) - frequencyX > 0) {
                pushPermissi.e().setLastPushPermissionAlertTimeLongPeriod(System.currentTimeMillis());
                pushPermissi.e().setPushPermissionShowTimesLongPeriod(0);
                objArray5 = new Object[0];
                w.C().w("PushPermissionManager", "长周期 清零", objArray5);
             }
          }
          if (pushPermissi.e().getValidPlayConfigMap().isEmpty()) {
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             pushPermissi1 = new PushPermissionValidPlayConfig(0, 0, 3, null);
             v14.setLastValidPlayTime(pushPermissi.e().getLastValidPlayTime());
             v14.setValidPlayTimes(pushPermissi.e().getValidPlayTimes());
             linkedHashMa.put(Integer.valueOf(i), v14);
             linkedHashMa.put(Integer.valueOf(82), v14);
             PushPermissionValidPlayConfig pushPermissi2 = new PushPermissionValidPlayConfig(0, 0, 3, null);
             linkedHashMa.put(Integer.valueOf(i1), i);
             pushPermissi.e().getValidPlayConfigMap().putAll(linkedHashMa);
          }else {
             pushPermissi1 = new PushPermissionValidPlayConfig(0, 0, 3, null);
             growthUpNoti.setLastValidPlayTime(pushPermissi.e().getLastValidPlayTime());
             growthUpNoti.setValidPlayTimes(pushPermissi.e().getValidPlayTimes());
             pushPermissi.e().getValidPlayConfigMap().put(Integer.valueOf(i), growthUpNoti);
             pushPermissi.e().getValidPlayConfigMap().put(Integer.valueOf(82), growthUpNoti);
          }
          pushPermissi.m();
          Object[] objArray1 = new Object[0];
          w.C().w("PushPermissionManager", "page=2 是搜索页", objArray1);
          objArray1 = new Object[0];
          w.C().w("PushPermissionManager", "消费 拉到的配置="+str, objArray1);
          objArray1 = new Object[0];
          w.C().w("PushPermissionManager", "频控 拉到的配置="+pushPermissi.g, objArray1);
          objArray = new Object[0];
          w.C().w("PushPermissionManager", "搜索 拉到的配置="+pushPermissi.h, objArray);
       }
       return;
    }
}
