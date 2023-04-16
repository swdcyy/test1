package com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.postentrance.util.d;
import com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils$localFrequencyCfg$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils$globalFrequencyCfg$2;
import com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils$minShowInterValInMills$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import ezb.k;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import k2b.u1;
import java.lang.Long;
import java.lang.Boolean;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils;
import java.lang.Integer;
import com.yxcorp.gifshow.postentrance.bubblev2.model.HomePostBubbleFrequencyConfig;
import a0c.g;
import java.lang.StringBuilder;
import q87.c;
import java.lang.System;
import xf6.d;
import java.util.Map;
import cn6.a;
import a0c.h;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils$OperationBubbleShowRecord;
import com.yxcorp.gifshow.postentrance.util.b;
import pm6.m;
import rq.a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.LinkedHashMap;
import nsd.u;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.HomeExtraBubbleInfo;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import km8.b;

public final class HomePostBubbleFrequencyControlUtils	// class@001080
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static int d;
    public static long e;
    public static int f;
    public static final HomePostBubbleFrequencyControlUtils g;

    static {
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       HomePostBubbleFrequencyControlUtils.g = new HomePostBubbleFrequencyControlUtils();
       HomePostBubbleFrequencyControlUtils.a = s.c(HomePostBubbleFrequencyControlUtils$localFrequencyCfg$2.INSTANCE);
       HomePostBubbleFrequencyControlUtils.b = s.c(HomePostBubbleFrequencyControlUtils$globalFrequencyCfg$2.INSTANCE);
       HomePostBubbleFrequencyControlUtils.c = s.c(HomePostBubbleFrequencyControlUtils$minShowInterValInMills$2.INSTANCE);
       Object obj = PatchProxy.apply(null, null, uod, "9");
       long l = (obj != patchProxyRe)? obj.longValue(): k.a.getLong("post_entrance_bubble_last_show_time", 0);
       HomePostBubbleFrequencyControlUtils.e = l;
       int i = 0;
       try{
          if (DateUtils.J(l)) {
             Object obj1 = PatchProxy.apply(null, null, uod, "12");
             int i1 = (obj1 != patchProxyRe)? obj1.intValue(): k.a.getInt("post_entrance_bubble_daily_show_count", i);
             i = i1;
          }
       }catch(java.lang.Exception e0){
          u1.R("DateUtils_isOfSameDay", "homeBubble", 2);
       }
       HomePostBubbleFrequencyControlUtils.f = i;
    }
    public void HomePostBubbleFrequencyControlUtils(){
       super();
    }
    public final boolean a(long p0){
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomePostBubbleFrequencyControlUtils homePostBubb = HomePostBubbleFrequencyControlUtils.class;
       if (PatchProxy.isSupport(homePostBubb)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, homePostBubb, "9");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (CameraEntranceUtils.c(CameraEntranceUtils.h, null, 1, null)) {
          return 1;
       }else if(HomePostBubbleFrequencyControlUtils.f >= this.d().getDailyShowTimes()){
          objArray = new Object[0];
          g.C().w("home_entrance_bubble", "FrequencyControl, failed_show_bubble: can\'t show, dailyShowTimes = "+HomePostBubbleFrequencyControlUtils.f, objArray);
          return 0;
       }else if(HomePostBubbleFrequencyControlUtils.d >= this.d().getLifeCycleShowTimes()){
          objArray = new Object[0];
          g.C().w("home_entrance_bubble", "FrequencyControl, failed_show_bubble: can\'t show, lifeCycleShowTimes ="+HomePostBubbleFrequencyControlUtils.d, objArray);
          return 0;
       }else {
          p0 = p0 - HomePostBubbleFrequencyControlUtils.e;
          Number number = PatchProxy.apply(null, this, homePostBubb, "3");
          if (number == patchProxyRe) {
             number = HomePostBubbleFrequencyControlUtils.c.getValue();
          }
          if (p0 - number.longValue() < 0) {
             objArray = new Object[0];
             g.C().w("home_entrance_bubble", "FrequencyControl, failed_show_bubble: can\'t show, bubble has showed in "+this.d().getShowInterval()+" minutes", objArray);
             return 0;
          }else {
             return 1;
          }
       }
    }
    public final boolean b(int p0){
       Object[] objArray;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomePostBubbleFrequencyControlUtils homePostBubb = HomePostBubbleFrequencyControlUtils.class;
       if (PatchProxy.isSupport(homePostBubb)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, homePostBubb, "5");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (CameraEntranceUtils.h.b(Integer.valueOf(p0))) {
          return b;
       }else {
          long l = System.currentTimeMillis();
          if (!this.a(l)) {
             return false;
          }else if(d.U()){
             return b;
          }else {
             Map obj1 = PatchProxy.apply(null, this, homePostBubb, "1");
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = HomePostBubbleFrequencyControlUtils.a.getValue();
             }
             a uoa = obj1.get(String.valueOf(p0));
             if (uoa != null) {
                if (uoa.a() <= 0) {
                   objArray = new Object[false];
                   g.C().w("home_entrance_bubble", "FrequencyControl local bubble disabled, dayInterval <= 0", objArray);
                   return false;
                }else if(uoa.disableAfterPost != null && this.e()){
                   objArray = new Object[false];
                   g.C().w("home_entrance_bubble", "FrequencyControl local bubble disabled, has published today", objArray);
                   return false;
                }else {
                   obj1 = d.d();
                   if (obj1 != null) {
                      h oh = obj1.get(String.valueOf(p0));
                      if (oh != null) {
                         if (uoa.a() > b) {
                            if (DateUtils.r(oh.a(), l) < uoa.a()) {
                               b = false;
                            }
                            if (!b) {
                               objArray1 = new Object[false];
                               g.C().w("home_entrance_bubble", "FrequencyControl local bubble disabled, has shown in "+uoa.a()+" days", objArray1);
                            }
                            return b;
                         }else if(uoa.b() <= 0){
                            objArray = new Object[false];
                            g.C().w("home_entrance_bubble", "FrequencyControl local bubble disabled, timesPerDay invalid", objArray);
                            return false;
                         }else if(DateUtils.J(oh.a()) && (oh.b() >= uoa.b() || oh.d - oh.a() < 0)){
                            objArray1 = new Object[false];
                            g.C().w("home_entrance_bubble", "FrequencyControl local bubble disabled, has shown "+uoa.b()+" times", objArray1);
                            return false;
                         }
                      }
                   }
                }
             }
             return b;
          }
       }
    }
    public final boolean c(PublishGuideInfo p0){
       Object[] objArray;
       Object obj = PatchProxy.applyOneRefs(p0, this, HomePostBubbleFrequencyControlUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          objArray = new Object[0];
          g.C().w("home_entrance_bubble", "FrequencyControl can\'t show, guideInfo is null", objArray);
          return 0;
       }else {
          boolean b = true;
          if (CameraEntranceUtils.h.b(Integer.valueOf(p0.mType))) {
             return b;
          }
          long l = System.currentTimeMillis();
          if (!this.a(l)) {
             return 0;
          }
          if (!d.U() && d.J() != p0.mType) {
             if (p0.mDisableAfterPost != null && this.e()) {
                objArray = new Object[0];
                g.C().w("home_entrance_bubble", "FrequencyControl operate bubble disabled, has published today", objArray);
                return 0;
             }else {
                Map map = d.e();
                if (map != null) {
                   HomePostBubbleFrequencyControlUtils$OperationBubbleShowRecord operationBub = map.get(p0.mId);
                   if (operationBub != null && DateUtils.r(operationBub.getLastShowTime(), l) < operationBub.getShowInterval()) {
                      String str = "operate bubble disabled, has showed in "+operationBub.getShowInterval()+" day";
                      Object[] objArray1 = new Object[0];
                      g.C().w("home_entrance_bubble", "FrequencyControl, "+str, objArray1);
                      b.g(p0.mId, b, str);
                      return 0;
                   }
                }
             }
          }
          return b;
       }
    }
    public final HomePostBubbleFrequencyConfig d(){
       Object obj = PatchProxy.apply(null, this, HomePostBubbleFrequencyControlUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HomePostBubbleFrequencyControlUtils.b.getValue();
    }
    public final boolean e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, HomePostBubbleFrequencyControlUtils.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, m.class, "6");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): DateUtils.J(a.J());
       return b;
    }
    public final void f(long p0){
       d uod = d.class;
       HomePostBubbleFrequencyControlUtils homePostBubb = HomePostBubbleFrequencyControlUtils.class;
       String str = "13";
       if (PatchProxy.isSupport(homePostBubb) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, homePostBubb, str)) {
          return;
       }
       int i = 1;
       HomePostBubbleFrequencyControlUtils.f = (DateUtils.J(HomePostBubbleFrequencyControlUtils.e))? HomePostBubbleFrequencyControlUtils.f + i: i;
       HomePostBubbleFrequencyControlUtils.e = p0;
       HomePostBubbleFrequencyControlUtils.d = HomePostBubbleFrequencyControlUtils.d + i;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), null, uod, str)) {
          SharedPreferences$Editor uEditor1 = k.a.edit();
          uEditor1.putLong("post_entrance_bubble_last_show_time", p0);
          g.a(uEditor1);
       }
       int f = HomePostBubbleFrequencyControlUtils.f;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(f), null, uod, "11")) {
          SharedPreferences$Editor uEditor = k.a.edit();
          uEditor.putInt("post_entrance_bubble_daily_show_count", f);
          g.a(uEditor);
       }
       Object[] objArray = new Object[0];
       g.C().w("home_entrance_bubble", "Bubble show, dailyShowCount = "+HomePostBubbleFrequencyControlUtils.f+", "+"lifeCycleShowCount = "+HomePostBubbleFrequencyControlUtils.d, objArray);
       return;
    }
    public final void g(int p0){
       HomePostBubbleFrequencyControlUtils homePostBubb = HomePostBubbleFrequencyControlUtils.class;
       if (PatchProxy.isSupport(homePostBubb) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, homePostBubb, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.C().w("home_entrance_bubble", "updateLocalBubbleClickRecord "+p0, objArray);
       long l = System.currentTimeMillis();
       Map map = d.d();
       if (map == null) {
          map = new LinkedHashMap();
       }
       h oh = map.get(String.valueOf(p0));
       if (oh == null) {
          Object[] objArray1 = new Object[0];
          g.C().w("home_entrance_bubble", "updateLocalBubbleClickRecord failed", objArray1);
          return;
       }else {
          oh.c(l);
          d.h(map);
          return;
       }
    }
    public final void h(int p0){
       HomePostBubbleFrequencyControlUtils homePostBubb = HomePostBubbleFrequencyControlUtils.class;
       if (PatchProxy.isSupport(homePostBubb) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, homePostBubb, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.C().w("home_entrance_bubble", "updateLocalBubbleShownRecord "+p0, objArray);
       long l = System.currentTimeMillis();
       this.f(l);
       Map map = d.d();
       if (map == null) {
          map = new LinkedHashMap();
       }
       String str = String.valueOf(p0);
       h oh = map.get(String.valueOf(p0));
       if (oh != null) {
          if (DateUtils.J(oh.a())) {
             oh.d(l);
             oh.e((oh.b() + 1));
          }else {
             oh.d(l);
             oh.c(0);
             oh.e(1);
          }
       }else {
          h oh1 = new h(p0, l, 1, 0, 8, null);
       }
       map.put(str, oh);
       d.h(map);
       return;
    }
    public final void i(PublishGuideInfo p0,long p1){
       HomePostBubbleFrequencyControlUtils homePostBubb = HomePostBubbleFrequencyControlUtils.class;
       if (PatchProxy.isSupport(homePostBubb) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, homePostBubb, "11")) {
          return;
       }
       PublishGuideInfo mId = p0.mId;
       a.o(mId, "curBubbleId");
       HomePostBubbleFrequencyControlUtils$OperationBubbleShowRecord operationBub = new HomePostBubbleFrequencyControlUtils$OperationBubbleShowRecord(mId, p1, p0.mExtParams.mMinDisplayInterval);
       Map map = d.e();
       if (map == null) {
          map = new LinkedHashMap();
       }
       map.put(mId, operationBub);
       if (!PatchProxy.isSupport(homePostBubb) || !PatchProxy.applyVoidTwoRefs(map, Long.valueOf(p1), this, homePostBubb, "14")) {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Object obj = (DateUtils.r(uEntry.getValue().getLastShowTime(), p1) < uEntry.getValue().getShowInterval())? 1: null;
             if (obj) {
                linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
             }
          }
          if (!PatchProxy.applyVoidOneRefs(linkedHashMa, null, d.class, "10")) {
             SharedPreferences$Editor uEditor = k.a.edit();
             uEditor.putString("post_entrance_bubble_show_record_map", b.e(linkedHashMa));
             g.a(uEditor);
          }
       }
       Object[] objArray = new Object[0];
       g.C().w("home_entrance_bubble", "OperationBubble show, id = "+mId, objArray);
       return;
    }
}
