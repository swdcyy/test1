package com.kwaishou.merchant.troubleshooting.core.TroubleShooting;
import java.util.concurrent.ConcurrentHashMap;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting$reportConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting$isWorkInSubThread$2;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting$singleThreadPoolExecutor$2;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import java.util.Objects;
import u08.c;
import java.lang.StringBuilder;
import com.yxcorp.utility.uri.Uri;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.router.b;
import t08.b;
import t08.b$a;
import java.lang.Throwable;
import java.util.Map;
import android.app.Application;
import com.kwaishou.merchant.troubleshooting.core.model.RubasParams;
import com.kwaishou.merchant.troubleshooting.core.model.LogLevel;
import java.lang.System;
import r08.f;
import java.lang.Runnable;
import r08.k;
import r08.g;
import com.kwaishou.merchant.troubleshooting.core.model.Node;
import r08.e;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.kwai.soc.arch.rubas.base.Rubas;
import dt7.d;
import r08.b;
import s08.b;
import f55.e;
import com.kwai.bridge.a;
import t08.a;
import r08.h;
import t45.e;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import com.kwaishou.merchant.troubleshooting.core.model.ComponentNode;
import r08.a;
import com.kwaishou.merchant.troubleshooting.core.model.KeyNode;
import r08.c;
import r08.d;
import java.lang.CharSequence;
import zsd.u;
import com.kwaishou.merchant.troubleshooting.core.model.LogModel;
import com.kwaishou.merchant.troubleshooting.core.model.LogType;
import com.kwaishou.merchant.troubleshooting.core.model.State;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import com.kwaishou.merchant.troubleshooting.core.model.PageLogContext;
import com.kwaishou.merchant.troubleshooting.core.model.NodeType;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import r08.j;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting$ReportConfig;

public final class TroubleShooting	// class@00134d
{
    public static final TroubleShooting a;
    public static final Map b;
    public static final ConcurrentHashMap c;
    public static a d;
    public static boolean e;
    public static boolean f;
    public static final p g;
    public static final p h;
    public static final String i;
    public static final p j;

    static {
       TroubleShooting.a = new TroubleShooting();
       TroubleShooting.b = new ConcurrentHashMap();
       TroubleShooting.c = new ConcurrentHashMap();
       TroubleShooting.e = true;
       TroubleShooting.g = s.c(TroubleShooting$reportConfig$2.INSTANCE);
       TroubleShooting.h = s.c(TroubleShooting$isWorkInSubThread$2.INSTANCE);
       TroubleShooting.i = "TroubleShootingSDK";
       TroubleShooting.j = s.c(TroubleShooting$singleThreadPoolExecutor$2.INSTANCE);
    }
    public void TroubleShooting(){
       super();
    }
    public static void D(TroubleShooting p0,Activity p1,String p2,String p3,String p4,String p5,int p6,Object p7){
       if (p6 & 0x04) {
          p3 = null;
       }
       if (p6 & 0x08) {
          p4 = null;
       }
       try{
          Objects.requireNonNull(p0);
          if (TroubleShooting.e && c.e()) {
             b.o(p2, p1, a.C("kwaimerchant://link?renderUrl=", Uri.b("kwai://krn?bundleId=KwaishopTroubleShooting&componentName=troubleShooting&resourceType=60&liveStreamId=&resourceType=60&liveStreamId="+p3+"&pageId="+p4+"&group="+null)));
          }
       }catch(java.lang.Exception e0){
          b$a.c(b.a, "TroubleShooting openTroubleShootingFloating error", e0, null, 4, null);
       }
       return;
    }
    public static void G(TroubleShooting p0,Application p1,String p2,boolean p3,int p4,Object p5){
       if (p4 & 0x01) {
          p1 = null;
       }
       if (p4 & 0x04) {
          p3 = true;
       }
       p0.F(p1, p2, p3);
       return;
    }
    public static void e(TroubleShooting p0,String p1,String p2,String p3,String p4,String p5,Map p6,boolean p7,RubasParams p8,int p9,long p10,boolean p11,int p12,Object p13){
       int i = p12;
       int i1 = 0;
       Map map = (i & 0x20)? i1: p6;
       boolean b = (i & 0x40)? false: p7;
       RubasParams rubasParams = (i & 0x0080)? i1: p8;
       int i2 = (i & 0x0100)? LogLevel.NORMAL.getLevel(): p9;
       long l = (i & 0x0200)? System.currentTimeMillis(): p10;
       boolean b1 = (i & 0x0400)? true: p11;
       Objects.requireNonNull(p0);
       a.p(p3, "biz");
       a.p(p4, "tag");
       Object obj = p5;
       a.p(obj, "msg");
       f uof = new f(p0, p1, p2, p3, p4, obj, map, b, rubasParams, i2, l, b1);
       p0.t(i);
       return;
    }
    public static void h(TroubleShooting p0,String p1,String p2,String p3,String p4,String p5,Throwable p6,Map p7,boolean p8,RubasParams p9,long p10,boolean p11,int p12,Object p13){
       int i = p12;
       int i1 = 0;
       Map map = (i & 0x40)? i1: p7;
       boolean b = (i & 0x0080)? false: p8;
       RubasParams rubasParams = (i & 0x0100)? i1: p9;
       long l = (i & 0x0200)? System.currentTimeMillis(): p10;
       boolean b1 = (i & 0x0400)? true: p11;
       Objects.requireNonNull(p0);
       a.p(p3, "belong");
       a.p(p4, "tag");
       Object obj = p5;
       a.p(obj, "msg");
       k ok = new k(p1, p2, b1, map, l, obj, p3, p4, p6, rubasParams, b);
       p0.t(i);
       return;
    }
    public static void i(TroubleShooting p0,String p1,String p2,String p3,String p4,String p5,Map p6,boolean p7,RubasParams p8,long p9,boolean p10,int p11,Object p12){
       int i = p11;
       int i1 = 0;
       Map map = (i & 0x20)? i1: p6;
       boolean b = (i & 0x40)? false: p7;
       RubasParams rubasParams = (i & 0x0080)? i1: p8;
       long l = (i & 0x0100)? System.currentTimeMillis(): p9;
       boolean b1 = (i & 0x0200)? true: p10;
       Objects.requireNonNull(p0);
       a.p(p3, "biz");
       a.p(p4, "tag");
       Object obj = p5;
       a.p(obj, "msg");
       g og = new g(p0, p1, p2, p3, p4, obj, map, b, rubasParams, l, b1);
       p0.t(i);
       return;
    }
    public static void l(TroubleShooting p0,String p1,String p2,String p3,String p4,String p5,Map p6,boolean p7,RubasParams p8,int p9,long p10,boolean p11,boolean p12,int p13,Object p14){
       int i = p13;
       Map map = (i & 0x20)? null: p6;
       boolean b = (i & 0x40)? false: p7;
       RubasParams rubasParams = (i & 0x0080)? null: p8;
       int i1 = (i & 0x0100)? LogLevel.NORMAL.getLevel(): p9;
       long l = (i & 0x0200)? System.currentTimeMillis(): p10;
       boolean b1 = (i & 0x0400)? true: p11;
       boolean b2 = (i & 0x0800)? false: p12;
       p0.k(p1, p2, p3, p4, p5, map, b, rubasParams, i1, l, b1, b2);
       return;
    }
    public static boolean n(TroubleShooting p0,String p1,String p2,Node p3,boolean p4,boolean p5,int p6,Object p7){
       if (p6 & 0x02) {
          p2 = null;
       }
       String str = p2;
       boolean b = (p6 & 0x08)? false: p4;
       boolean b1 = (p6 & 0x10)? false: p5;
       return p0.m(p1, str, p3, b, b1);
    }
    public static void s(TroubleShooting p0,String p1,String p2,String p3,String p4,String p5,Map p6,RubasParams p7,long p8,boolean p9,int p10,Object p11){
       int i = p10;
       int i1 = 0;
       Map map = (i & 0x20)? i1: p6;
       RubasParams rubasParams = (i & 0x40)? i1: p7;
       long l = (i & 0x0080)? System.currentTimeMillis(): p8;
       boolean b = (i & 0x0100)? true: p9;
       Objects.requireNonNull(p0);
       a.p(p3, "biz");
       a.p(p4, "tag");
       Object obj = p5;
       a.p(obj, "msg");
       e uoe = new e(p0, p1, p2, p3, p4, obj, map, rubasParams, l, b);
       p0.t(i);
       return;
    }
    public final boolean A(String p0,String p1){
       boolean b = (this.v(p0, p1) != null)? true: false;
       return b;
    }
    public final boolean B(){
       return TroubleShooting.h.getValue().booleanValue();
    }
    public final void C(Activity p0,String p1,String p2,String p3){
       TroubleShooting.D(this, p0, p1, p2, p3, null, 16, null);
    }
    public final void E(RubasParams p0){
       if (p0 == null) {
          return;
       }
       try{
          if (!a.t().d("merchant_dynamic_rubas_active", false)) {
             return;
          }else {
             d uod = Rubas.c.a();
             String event = p0.getEvent();
             if (event == null) {
                event = "";
             }
             uod.b(event, p0.getDimensions(), p0.getToken(), p0.getContainerType());
          }
       }catch(java.lang.Exception e7){
          b$a.c(b.a, "publishRubas error", e7, null, 4, null);
       }
       return;
    }
    public final void F(Application p0,String p1,boolean p2){
       this.t(new b(p2, p0, p1));
    }
    public final void H(Application p0){
       if (c.e() && !TroubleShooting.f) {
          a.j(new b(p0));
          TroubleShooting.f = true;
       }
       return;
    }
    public synchronized final void I(a p0){
       if (TroubleShooting.d != null) {
          return;
       }
       TroubleShooting.d = p0;
       return;
    }
    public final void J(String p0){
       this.t(new h(p0));
       if (this.B()) {
          b$a a = b.a;
          StringBuilder str = "pageContext unRegister[liveId:"+p0+"][taskCurrentSize:";
          BlockingQueue queue = this.z().getQueue();
          int i = (queue == null)? 0: queue.size();
          b$a.f(a, str+i+"][Ïß³ÌÊý:"+this.z().getPoolSize()+"][completedTaskCount:"+this.z().getCompletedTaskCount()+']', null, 2, null);
       }
       return;
    }
    public final boolean a(String p0,String p1,ComponentNode p2){
       if (!c.e()) {
          return false;
       }
       this.t(new a(this, p0, p1, p2));
       return true;
    }
    public final void b(String p0,String p1,String p2,String p3,String p4,Map p5){
       Object obj = p2;
       a.p(obj, "biz");
       Object obj1 = p3;
       a.p(obj1, "tag");
       Object obj2 = p4;
       a.p(obj2, "msg");
       TroubleShooting.e(this, p0, p1, obj, obj1, obj2, p5, false, null, 0, 0, false, 1984, null);
    }
    public final void c(String p0,String p1,String p2,String p3,String p4,Map p5,boolean p6){
       Object obj = p2;
       a.p(obj, "biz");
       Object obj1 = p3;
       a.p(obj1, "tag");
       Object obj2 = p4;
       a.p(obj2, "msg");
       TroubleShooting.e(this, p0, p1, obj, obj1, obj2, p5, p6, null, 0, 0, false, 1920, null);
    }
    public final void d(String p0,String p1,String p2,String p3,String p4,Map p5,boolean p6,RubasParams p7,int p8,long p9){
       Object obj = p2;
       a.p(obj, "biz");
       Object obj1 = p3;
       a.p(obj1, "tag");
       Object obj2 = p4;
       a.p(obj2, "msg");
       TroubleShooting.e(this, p0, p1, obj, obj1, obj2, p5, p6, p7, p8, p9, false, 1024, null);
    }
    public final boolean f(String p0,KeyNode p1,String p2){
       if (!c.e()) {
          return false;
       }
       this.t(new c(this, p0, p2, p1));
       return true;
    }
    public final void g(String p0,String p1,String p2,String p3,String p4,Throwable p5,Map p6,boolean p7,RubasParams p8,long p9){
       Object obj = p2;
       a.p(obj, "belong");
       Object obj1 = p3;
       a.p(obj1, "tag");
       Object obj2 = p4;
       a.p(obj2, "msg");
       TroubleShooting.h(this, p0, p1, obj, obj1, obj2, p5, p6, p7, p8, p9, false, 1024, null);
    }
    public final boolean j(String p0,String p1,KeyNode p2){
       if (!c.e()) {
          return false;
       }
       this.t(new d(this, p0, p1, p2));
       return true;
    }
    public final void k(String p0,String p1,String p2,String p3,String p4,Map p5,boolean p6,RubasParams p7,int p8,long p9,boolean p10,boolean p11){
       LogType wARNING;
       TroubleShooting troubleShoot = this;
       LogModel obj = p0;
       Object obj1 = p1;
       String str = p2;
       String str1 = p3;
       String str2 = p4;
       Map map = p5;
       boolean b = p6;
       int i = p8;
       long l = p9;
       try{
          Node node = this.v(p0, p1);
          if (p10) {
             String str3 = (node != null)? node.getTag()+' '+str2+" pageId:"+obj+" componentId:"+node.getId()+" timeStamp:"+l: str2+" pageId:"+obj+" timeStamp:"+l;
             b.a.d(str, str1, str3, map);
          label_006e :
             troubleShoot.E(p7);
             if (!c.e()) {
                return;
             }else if(node == null){
                str3 = (!obj1 || u.S1(p1))? 1: 0;
                if (!str3) {
                   b$a.f(b.a, "addLog not found nodeId:"+obj1+" msg:"+str2, null, 2, null);
                   return;
                }else {
                   node = troubleShoot.v(obj, str1);
                   if (node == null) {
                      node = new ComponentNode(str1, str1);
                      troubleShoot.a(obj, null, node);
                   }
                }
             }
             obj = new LogModel();
             obj.setBelong(str);
             obj.setTag(str1);
             obj.setMsg(str2);
             obj.setParams(map);
             obj.setTimeStamp(l);
             obj.setLogLevel(i);
             if (p11) {
                wARNING = LogType.WARNING;
             }else if(i >= LogLevel.HIGH.getLevel()){
                wARNING = LogType.KEY;
             }else {
                wARNING = LogType.DETAIL;
             }
             obj.setLogType(wARNING);
             obj.setMarkSuccessLog(b);
             node.addExtraInfo(obj);
             if (node instanceof KeyNode && b) {
                node.setState(State.SUCCESS);
             }
          }else {
             goto label_006e ;
          }
       }catch(java.lang.Exception e0){
          Pair[] pairArray = new Pair[]{r0.a("nodeId", obj1)};
          b.a.b("addLog error", e0, t0.j0(pairArray));
       }
       return;
    }
    public final boolean m(String p0,String p1,Node p2,boolean p3,boolean p4){
       b$a a;
       Iterator iterator;
       Map map;
       boolean b = false;
       try{
          if (!c.e()) {
             return b;
          }
          boolean b1 = true;
          PageLogContext pageLogConte = (p0 == null || u.S1(p0))? 1: null;
          if (pageLogConte) {
             a = b.a;
             p1 = "addNode pageId is null:";
             String str = (p2 == null)? null: p2.getId();
             b$a.f(a, a.C(p1, str), null, 2, null);
             return b;
          }else if(p2 == null){
             return b;
          }else {
             this.p(p0, p2);
             pageLogConte = this.x(p0);
             String str1 = (p1 == null || u.S1(p1))? 1: null;
             if (str1) {
                if (p3) {
                   b$a.f(b.a, a.C(p2.getId(), " must has parent:parentId is null"), null, 2, null);
                }else if(p4){
                   p2.setNodeType(NodeType.ENV_NODE);
                   if (p2 instanceof KeyNode) {
                      iterator = pageLogConte.getEnv().iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            map = iterator.next();
                            if (!a.g(map.getId(), p2.getId())) {
                               continue ;
                            }
                         }else {
                            map = null;
                         }
                         if (map == null) {
                            pageLogConte.getEnv().add(p2);
                            b$a.f(b.a, p2.getId()+" has add in EnvKeyNode,pageId:"+p0, null, 2, null);
                            break ;
                         }
                         break ;
                      }
                      return b1;
                   }else {
                      return b;
                   }
                }else {
                   p2.setNodeType(NodeType.BUSINESS_NODE);
                   iterator = pageLogConte.getNodeList().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         map = iterator.next();
                         if (!a.g(map.getId(), p2.getId())) {
                            continue ;
                         }
                      }else {
                         map = null;
                      }
                      if (map == null) {
                         pageLogConte.getNodeList().add(p2);
                         b$a.f(b.a, p2.getId()+" has add in nodeList,pageId:"+p0, null, 2, null);
                      }
                   }
                   return b;
                }
             }else {
                Node node = this.v(p0, p1);
                if (node == null) {
                   b$a.f(b.a, p2.getId()+"not find parentNode "+p1+",pageId:"+p0, null, 2, null);
                   goto label_0178 ;
                }else {
                   node.addChildrenNode(p2);
                   p2.setTag(node.getTag());
                   p2.setNodeType(node.getNodeType());
                   b$a.f(b.a, p2.getTag()+' '+p2.getId()+" has add in parentNode:"+p1+",pageId:"+p0, null, 2, null);
                }
             }
             b = true;
             goto label_0178 ;
          }
       }catch(java.lang.Exception e8){
          b$a.c(b.a, "addNode error", e8, null, 4, null);
          return b;
       }
    }
    public final void o(String p0,String p1,String p2,String p3,String p4){
       a.p(p1, "name");
       a.p(p2, "type");
       a.p(p3, "keyMsg");
       a.p(p4, "content");
       j oj = new j(p0, p1, p2, p4, p3);
       this.t(v0);
    }
    public final void p(String p0,Node p1){
       String str = (p0 == null || u.S1(p0))? 1: null;
       if (!str) {
          str = p1.getId();
          ConcurrentHashMap c = TroubleShooting.c;
          ConcurrentHashMap uConcurrentH = c.get(p0);
          if (uConcurrentH == null) {
             uConcurrentH = new ConcurrentHashMap();
             uConcurrentH.put(str, p1);
             b$a.f(b.a, p1.getId()+" has add in nodesTemp,pageId:"+p0, null, 2, null);
             c.put(p0, uConcurrentH);
          }else if(uConcurrentH.get(str) != null){
             return;
          }else {
             uConcurrentH.put(str, p1);
             b$a.f(b.a, p1.getId()+" has add in nodesTemp,pageId:"+p0, null, 2, null);
          }
       }
       return;
    }
    public final void q(String p0,String p1,String p2,String p3,String p4,Map p5){
       Object obj = p2;
       a.p(obj, "biz");
       Object obj1 = p3;
       a.p(obj1, "tag");
       Object obj2 = p4;
       a.p(obj2, "msg");
       TroubleShooting.s(this, p0, p1, obj, obj1, obj2, p5, null, 0, false, 448, null);
    }
    public final void r(String p0,String p1,String p2,String p3,String p4,Map p5,RubasParams p6,long p7){
       Object obj = p2;
       a.p(obj, "biz");
       Object obj1 = p3;
       a.p(obj1, "tag");
       Object obj2 = p4;
       a.p(obj2, "msg");
       TroubleShooting.s(this, p0, p1, obj, obj1, obj2, p5, p6, p7, false, 256, null);
    }
    public final void t(Runnable p0){
       if (!this.B()) {
          p0.run();
       }else {
          this.z().execute(p0);
       }
       return;
    }
    public final a u(){
       return TroubleShooting.d;
    }
    public final Node v(String p0,String p1){
       Node node = null;
       if (c.e()) {
          ConcurrentHashMap uConcurrentH = null;
          boolean b = (p0 == null || u.S1(p0))? true: false;
          if (!b) {
             if (p1 == null || u.S1(p1)) {
                uConcurrentH = 1;
             }
             if (!uConcurrentH) {
                ConcurrentHashMap uConcurrentH1 = TroubleShooting.c.get(p0);
                if (uConcurrentH1 != null) {
                   node = uConcurrentH1.get(p1);
                }
             }
          }
       }
    label_0035 :
       return node;
    }
    public final PageLogContext w(String p0){
       PageLogContext pageLogConte = null;
       try{
          if (c.e()) {
             Map map = (p0 == null || u.S1(p0))? 1: null;
             if (!map) {
                return TroubleShooting.b.get(p0);
             }
          }
          return pageLogConte;
       }catch(java.lang.Exception e8){
          b$a.c(b.a, "getPageLogContext error", e8, null, 4, null);
          return pageLogConte;
       }
    }
    public final PageLogContext x(String p0){
       Map b;
       try{
          String str = (p0 == null || u.S1(p0))? 1: null;
          if (str) {
             b$a.f(b.a, "getPageLogContext pageId is null", null, 2, null);
             return new PageLogContext();
          }else {
             b = TroubleShooting.b;
             PageLogContext pageLogConte = b.get(p0);
             if (pageLogConte == null) {
                pageLogConte = new PageLogContext();
                b.put(p0, pageLogConte);
                a.C("createPageLogContext and put,pageId:", p0);
             }
             return pageLogConte;
          }
       }catch(java.lang.Exception e7){
          Throwable throwable = e7;
          b$a.c(b.a, "getPageLogContextInner error", throwable, null, 4, null);
          return new PageLogContext();
       }
    }
    public final TroubleShooting$ReportConfig y(){
       Object value = TroubleShooting.g.getValue();
       a.o(value, "<get-reportConfig>\(...\)");
       return value;
    }
    public final e z(){
       return TroubleShooting.j.getValue();
    }
}
