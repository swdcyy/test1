package com.kuaishou.merchant.actionreport.ActionReport;
import java.lang.Object;
import com.kuaishou.merchant.actionreport.ActionReport$actionReportConfigMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.merchant.actionreport.ActionReport$actionComponentMap$2;
import com.kuaishou.merchant.actionreport.ActionReport$popupStateService$2;
import android.os.Handler;
import com.kuaishou.merchant.actionreport.ActionReport$dcmListener$2;
import com.kuaishou.merchant.actionreport.ActionReport$reportRunnable$2;
import com.kuaishou.merchant.actionreport.ActionReport$dcmActionList$2;
import java.lang.String;
import java.lang.Throwable;
import java.util.Map;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.actionreport.ActionReport$a;
import sr3.a;
import p74.a;
import o74.a;
import java.lang.Boolean;
import sr3.b;
import com.kuaishou.merchant.actionreport.ActionReport$ActionType;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Integer;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.merchant.actionreport.model.ReportActionItem$PendantInfo;
import ot3.u0;
import qrd.l1;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import ma4.d;
import ma4.c;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Runnable;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import com.kuaishou.merchant.actionreport.model.ReportActionItem;
import fg6.a;
import com.google.gson.Gson;
import xa4.c;
import xa4.b;
import com.kuaishou.merchant.actionreport.model.ReportActionRequest;
import brd.t;
import com.kuaishou.merchant.actionreport.ActionReport$b;
import com.kuaishou.merchant.actionreport.ActionReport$c;
import erd.g;
import crd.b;

public final class ActionReport	// class@0014d5
{
    public final p a;
    public final p b;
    public final p c;
    public final Handler d;
    public String e;
    public String f;
    public String g;
    public String h;
    public final p i;
    public final p j;
    public final p k;
    public ActionReport$a l;

    public void ActionReport(){
       super();
       this.a = s.c(ActionReport$actionReportConfigMap$2.INSTANCE);
       this.b = s.c(ActionReport$actionComponentMap$2.INSTANCE);
       this.c = s.c(ActionReport$popupStateService$2.INSTANCE);
       this.d = new Handler();
       this.i = s.c(new ActionReport$dcmListener$2(this));
       this.j = s.c(new ActionReport$reportRunnable$2(this));
       this.k = s.c(ActionReport$dcmActionList$2.INSTANCE);
    }
    public static void b(ActionReport p0,String p1,Throwable p2,Map p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = null;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidThreeRefs(p1, p2, null, p0, ActionReport.class, "17")) {
          p0 = p0.l;
          if (p0 != null) {
             p0.a(p1, p2, null);
          }else {
             a.o(a.b, "ActionReport", p1, p2, null);
          }
       }
       return;
    }
    public static void j(ActionReport p0,String p1,Map p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(ActionReport.class) || !PatchProxy.applyVoidThreeRefs(p1, null, Boolean.valueOf(p3), p0, ActionReport.class, "16")) {
          p0 = p0.l;
          if (p0 != null) {
             p0.b(p1, null, p3);
          }else {
             a.x(b.b, "ActionReport", p1, null);
          }
       }
       return;
    }
    public final void a(String p0,String p1,ActionReport$ActionType p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ActionReport.class, "11")) {
          return;
       }
       try{
          if (p0 != null) {
             if (this.c().get(Integer.valueOf(p2.getAction())) == null) {
                this.c().put(Integer.valueOf(p2.getAction()), new CopyOnWriteArrayList());
             }
             CopyOnWriteArrayList uCopyOnWrite = this.c().get(Integer.valueOf(p2.getAction()));
             if (uCopyOnWrite != null) {
                ReportActionItem$PendantInfo pendantInfo = new ReportActionItem$PendantInfo();
                pendantInfo.setPendantCode(p0);
                pendantInfo.setUniqueId(p1);
                pendantInfo.setTimeStamp(u0.b());
                uCopyOnWrite.add(pendantInfo);
             }
          }
          ActionReport.j(this, "addComponentAction "+p0+' '+p2, null, false, 6, null);
       }catch(java.lang.Exception e7){
          Throwable throwable = e7;
          ActionReport.b(this, "addComponentAction error", throwable, null, 4, null);
       }
       return;
    }
    public final ConcurrentHashMap c(){
       Object obj = PatchProxy.apply(null, this, ActionReport.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final Map d(){
       Object obj = PatchProxy.apply(null, this, ActionReport.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final List e(){
       Object obj = PatchProxy.apply(null, this, ActionReport.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final d f(){
       Object obj = PatchProxy.apply(null, this, ActionReport.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final c g(){
       Object obj = PatchProxy.apply(null, this, ActionReport.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final long h(){
       Object obj = PatchProxy.apply(null, this, ActionReport.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       long l1 = a.t().b("ComponentActionReportTimeInterval", l);
       l1 = (l1 - l <= 0)? 0x2710: l1 * (long)1000;
       return l1;
    }
    public final Runnable i(){
       Object obj = PatchProxy.apply(null, this, ActionReport.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final void k(){
       ReportActionItem reportAction;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ActionReport.class, "12")) {
          return;
       }
       try{
          ActionReport.j(this, "start try reportAction", null, false, 6, null);
          super();
          Iterator iterator = this.c().entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             ArrayList uArrayList = new ArrayList();
             Iterator iterator1 = uEntry.getValue().iterator();
             while (iterator1.hasNext()) {
                Object obj = iterator1.next();
                Object obj1 = obj;
                List list = this.d().get(uEntry.getKey());
                if (list == null) {
                   list = new ArrayList();
                }
                if (CollectionsKt___CollectionsKt.H1(list, obj1.getPendantCode())) {
                   uArrayList.add(obj);
                }
             }
             List list1 = CollectionsKt___CollectionsKt.J5(uArrayList);
             reportAction = (list1 == null || list1.isEmpty())? 1: null;
             if (!reportAction) {
                reportAction = new ReportActionItem();
                reportAction.setActionType(uEntry.getKey().intValue());
                reportAction.setPendants(list1);
             }else {
                Object[] objArray1 = objArray;
             }
             if (reportAction != null) {
                this.add(reportAction);
             }
          }
          if (this.isEmpty()) {
             return;
          }
          ActionReport.j(this, "report component action:"+a.a.q(this), null, true, 2, null);
          ReportActionRequest reportAction1 = new ReportActionRequest();
          reportAction1.setSellerId(this.e);
          reportAction1.setLiveStreamId(this.g);
          reportAction1.setActions(this);
          t ot = b.b().c(reportAction1);
          ot.subscribe(new ActionReport$b(this), new ActionReport$c(this));
          this.c().clear();
       }catch(java.lang.Exception e0){
          ActionReport.b(this, "DAC reportComponentAction error", e0, null, 4, null);
       }
       return;
    }
}
