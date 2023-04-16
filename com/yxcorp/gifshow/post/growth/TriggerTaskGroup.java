package com.yxcorp.gifshow.post.growth.TriggerTaskGroup;
import com.yxcorp.gifshow.post.growth.TriggerTaskGroup$a;
import nsd.u;
import azb.n;
import s36.b;
import java.util.Map;
import java.util.List;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.post.growth.TriggerTaskGroup$b;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import i36.b;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import com.google.gson.JsonObject;
import java.util.concurrent.CopyOnWriteArrayList;
import i36.d;
import java.lang.Integer;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import lnc.d7;
import lq.i;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.kwai.feature.post.api.flywheel.logger.FlyWheeFailedLoggerParams;
import com.kwai.feature.post.api.flywheel.logger.BaseFlyWheeLoggerParams;
import kotlin.Pair;
import nsd.s0;
import java.util.LinkedHashMap;
import azb.o;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import z36.a;
import com.yxcorp.gifshow.post.growth.TriggerTaskGroup$createGuideTaskAndExecute$1;
import com.yxcorp.gifshow.post.growth.TriggerTaskGroup$createGuideTaskAndExecute$2;
import msd.l;
import java.util.Collection;
import java.lang.Number;

public final class TriggerTaskGroup	// class@000ffd
{
    public final List a;
    public boolean b;
    public final TriggerTaskGroup$b c;
    public final n d;
    public final b e;
    public final Map f;
    public final List g;
    public final Map h;
    public final a i;
    public static final TriggerTaskGroup$a j;

    static {
       TriggerTaskGroup.j = new TriggerTaskGroup$a(null);
    }
    public void TriggerTaskGroup(n p0,b p1,Map p2,List p3,Map p4,a p5){
       a.p(p0, "taskGroupListener");
       a.p(p1, "outerGuideListener");
       a.p(p2, "pendingGuideItemCfgMap");
       a.p(p3, "taskTypes");
       a.p(p4, "triggerParams");
       a.p(p5, "showingTasks");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.a = new ArrayList();
       this.c = new TriggerTaskGroup$b(this);
    }
    public final boolean a(GrowthGuideItemConfig p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, TriggerTaskGroup.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0.getConditions() != null) {
          obj = b.b;
          List conditions = p0.getConditions();
          a.m(conditions);
          Objects.requireNonNull(obj);
          JsonObject obj1 = PatchProxy.applyTwoRefs(conditions, p0, obj, b.class, "1");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             a.p(conditions, "configJsonList");
             Iterator iterator = conditions.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   obj1 = iterator.next();
                   d uod = null;
                   Iterator iterator1 = b.a.iterator();
                   while (iterator1.hasNext()) {
                      uod = iterator1.next().b(obj1, p0);
                      if (uod != null) {
                         break ;
                      }
                   }
                   int i = a.g(uod, Boolean.TRUE) ^ 1;
                   if (i) {
                      b1 = false;
                   }
                }else {
                   b1 = true;
                }
             }
             return b;
          }
          if (!b1) {
          }
       }
       b = true;
       goto label_0075 ;
    }
    public final void b(int p0,List p1){
       Object[] objArray1;
       d7 a;
       int i;
       Map map;
       Object obj = this;
       TriggerTaskGroup triggerTaskG = TriggerTaskGroup.class;
       if (PatchProxy.isSupport(triggerTaskG)) {
          if (PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, obj, triggerTaskG, "3")) {
             return;
          }
       }else {
          int i2 = p1;
       }
       Object[] objArray = new Object[0];
       p3.D().A("PostGrowth", "TriggerTaskGroup "+this.hashCode()+" createGuideTaskAndExecute, size "+p1.size(), objArray);
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       String str = null;
       if (uActivity == null) {
          Objects.requireNonNull(d7.a);
          if (i.h()) {
             i oi = i.m();
             a.o(oi, "PostSession.current\(\)");
             uActivity = oi.G();
          }else {
             uActivity = str;
          }
       }
       if (uActivity == null) {
          objArray1 = new Object[0];
          p3.D().A("PostGrowth", "TriggerTaskGroup createGuideTaskAndExecute, can not get activity", objArray1);
          obj.d(Integer.valueOf(p0));
          return;
       }else {
          Iterator iterator = p1.iterator();
          objArray = 0;
          while (iterator.hasNext()) {
             GrowthGuideItemConfig growthGuideI = iterator.next();
             Object[] objArray2 = new Object[0];
             p3.D().A("PostGrowth", "TriggerTaskGroup createGuideTaskAndExecute,", objArray2);
             a = d7.a;
             i = a.g();
             if (!growthGuideI.getUnlockable() && (i != Integer.MIN_VALUE && i != growthGuideI.getTaskType())) {
                Object[] objArray3 = new Object[0];
                p3.D().A("PostGrowth", "TriggerTaskGroup locked, currentTaskType: "+i+", createGuideTaskAndExecute taskType: "+growthGuideI.getTaskType(), objArray3);
                new FlyWheeFailedLoggerParams().setFailedReason(0, "other task blocked").bindFlyWheelConfig(growthGuideI).logEvent();
             }else {
                Pair pair = PatchProxy.applyOneRefs(growthGuideI, obj, triggerTaskG, "4");
                if (pair != PatchProxyResult.class) {
                }else {
                   Objects.requireNonNull(a);
                   if (i.h()) {
                      map = s0.k(i.m().z("guideItemShowCount"));
                      if (map == null) {
                         map = new LinkedHashMap();
                      }
                   }else {
                      map = new LinkedHashMap();
                   }
                   Integer integer = map.get(growthGuideI.getGuideItemId());
                   int i1 = (integer != null)? integer.intValue(): null;
                   Optional optional = y.y(obj.i.invoke(), new o(growthGuideI));
                   a.o(optional, "Iterables.tryFind\(showin¡­ItemCfg.guideItemId\n    }");
                   if (optional.isPresent()) {
                      pair = new Pair(Boolean.FALSE, "config is showing");
                   }else if(growthGuideI.getShowTimes() && growthGuideI.getShowTimes() <= i1){
                      pair = new Pair(Boolean.FALSE, "showTimes limited");
                   }else if(!obj.a(growthGuideI)){
                      pair = new Pair(Boolean.FALSE, "check condition error");
                   }else {
                      pair = new Pair(Boolean.TRUE, str);
                   }
                }
                if (!pair.getFirst().booleanValue()) {
                   Object[] objArray4 = new Object[0];
                   p3.D().A("PostGrowth", "TriggerTaskGroup createGuideTaskAndExecute, condition not fit item "+growthGuideI.getOriginInfo(), objArray4);
                   new FlyWheeFailedLoggerParams().setFailedReason(0, pair.getSecond()).bindFlyWheelConfig(growthGuideI).logEvent();
                }else {
                   objArray = 1;
                   a uoa = v15;
                   a uoa1 = v15;
                   uoa = new a(new TriggerTaskGroup$createGuideTaskAndExecute$1(growthGuideI), new TriggerTaskGroup$createGuideTaskAndExecute$2(obj, uActivity), obj.c, null, 8, null);
                   TriggerTaskGroup e = obj.e;
                   uoa = a.class;
                   if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(e, Boolean.TRUE, uoa1, uoa, "6")) {
                      a.p(e, "listener");
                      uoa1.a.add(0, e);
                   }
                   obj.a.add(uoa1);
                   uoa1.e();
                }
             }
             str = null;
          }
          if (!objArray) {
             objArray1 = new Object[0];
             p3.D().A("PostGrowth", "build task failed, can\'t execute task", objArray1);
             obj.d(Integer.valueOf(p0));
          }
          return;
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, TriggerTaskGroup.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostGrowth", "TriggerTaskGroup "+this.hashCode()+" tryNotifyFinish", objArray);
       if (this.a.isEmpty() && this.f.isEmpty()) {
          this.b = false;
          this.d.a(this);
       }
       return;
    }
    public final void d(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TriggerTaskGroup.class, "5")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w("PostGrowth", "TriggerTaskGroup "+this.hashCode()+" tryProcessPendingGuideItemCfg", objArray);
       if (this.a.isEmpty() ^ 1) {
          return;
       }
       if (p0 == null) {
          this.c();
          return;
       }else {
          int i1 = this.g.indexOf(p0);
          int i2 = this.g.size() - 1;
          while (i1 < i2) {
             i1++;
             i2 = this.g.get(i1).intValue();
             List list = this.f.get(Integer.valueOf(i2));
             Integer integer = (list == null || list.isEmpty())? 1: null;
             if (!integer) {
                this.f.remove(Integer.valueOf(i2));
                this.b(i2, list);
                i = 1;
                break ;
             }
          }
          if (!i) {
             this.c();
          }
          return;
       }
    }
}
