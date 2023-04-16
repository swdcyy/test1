package com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import java.util.concurrent.ConcurrentHashMap;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting$dyTroubleShootingLogger$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import com.kwaishou.merchant.daccore.log.DACKeyNode;
import java.util.Map;
import com.kwaishou.merchant.troubleshooting.core.model.RubasParams;
import java.lang.CharSequence;
import zsd.u;
import com.kwaishou.merchant.troubleshooting.core.model.KeyNode;
import com.kwaishou.merchant.troubleshooting.core.model.Node;
import f08.b;
import f08.b$a;
import java.lang.Throwable;
import java.lang.Number;
import com.kwaishou.merchant.troubleshooting.core.model.LogLevel;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting$a;
import java.util.LinkedHashMap;
import com.kwaishou.merchant.troubleshooting.core.model.ComponentNode;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import kotlin.Pair;
import java.lang.Integer;
import qrd.r0;
import trd.t0;

public final class DyTroubleShooting	// class@001320
{
    public static final ConcurrentHashMap a;
    public static final p b;
    public static final DyTroubleShooting c;

    static {
       DyTroubleShooting.c = new DyTroubleShooting();
       DyTroubleShooting.a = new ConcurrentHashMap();
       DyTroubleShooting.b = s.c(DyTroubleShooting$dyTroubleShootingLogger$2.INSTANCE);
    }
    public void DyTroubleShooting(){
       super();
    }
    public static final void b(String p0,String p1,DACKeyNode p2,String p3,Map p4,boolean p5,RubasParams p6,boolean p7){
       try{
          DyTroubleShooting uDyTroubleSh = (p1 == null || u.S1(p1))? 1: null;
          if (uDyTroubleSh || p2 != null) {
             KeyNode keyNode = DyTroubleShooting.c.n(p0, p1, p2);
             keyNode = (keyNode != null)? keyNode.getId(): null;
          }
       label_0013 :
          String str = p1;
          DyTroubleShooting.d(p0, str, p3, p4, p5, p6, p7);
       }catch(java.lang.Exception e7){
          Throwable throwable = e7;
          b$a.b(b.a, "DyTroubleShooting addDetailLog error", throwable, null, 4, null);
       }
       return;
    }
    public static final void c(String p0,String p1,String p2){
       DyTroubleShooting.g(p0, p1, p2, null, false, null, false, 120, null);
    }
    public static final void d(String p0,String p1,String p2,Map p3,boolean p4,RubasParams p5,boolean p6){
       Number number;
       TroubleShooting a;
       int i2;
       int i3;
       String str1;
       String str2;
       try{
          Map map = p3;
          if (map) {
             number = map.get("DACLogLevel");
          label_000f :
             int i = (number instanceof Number)? number.intValue(): LogLevel.NORMAL.getLevel();
             int i1 = i;
             String str = "";
             if (!p6) {
                a = TroubleShooting.a;
                i2 = (p0 != null)? p0: str;
                i3 = (p1 != null)? p1: str;
                TroubleShooting.e(a, i2, i3, "DAC", "DynamicPendant", p2, p3, p4, p5, i1, 0, false, 1536, null);
             }else {
                a = TroubleShooting.a;
                i2 = (p0 != null)? p0: str;
                i3 = (p1 != null)? p1: str;
                TroubleShooting.s(a, i2, i3, "DAC", "DynamicPendant", p2, p3, p5, 0, false, 384, null);
             }
          }else {
             number = null;
             goto label_000f ;
          }
       }catch(java.lang.Exception e0){
          b$a.b(b.a, "DyTroubleShooting addDetailLog error", e0, 0, 4, 0);
       }
       return;
    }
    public static void e(String p0,DACKeyNode p1,String p2,Map p3,boolean p4,RubasParams p5,boolean p6,int p7,Object p8){
       Map map = (p7 & 0x08)? null: p3;
       boolean b = (p7 & 0x10)? false: p4;
       boolean b1 = (p7 & 0x40)? false: p6;
       DyTroubleShooting.b(p0, null, p1, p2, map, b, null, b1);
       return;
    }
    public static void f(String p0,String p1,DACKeyNode p2,String p3,Map p4,boolean p5,RubasParams p6,boolean p7,int p8,Object p9){
       int i = p8;
       Map map = (i & 0x10)? null: p4;
       boolean b = (i & 0x20)? false: p5;
       boolean b1 = (i & 0x0080)? false: p7;
       DyTroubleShooting.b(p0, p1, p2, p3, map, b, null, b1);
       return;
    }
    public static void g(String p0,String p1,String p2,Map p3,boolean p4,RubasParams p5,boolean p6,int p7,Object p8){
       if (p7 & 0x08) {
          p3 = null;
       }
       Map map = p3;
       boolean b = (p7 & 0x10)? false: p4;
       boolean b1 = (p7 & 0x40)? false: p6;
       DyTroubleShooting.d(p0, p1, p2, map, b, null, b1);
       return;
    }
    public static final void h(String p0,String p1,DACKeyNode p2,String p3,Throwable p4,Map p5,boolean p6,RubasParams p7){
       try{
          DyTroubleShooting uDyTroubleSh = (p1 == null || u.S1(p1))? 1: null;
          if (uDyTroubleSh || p2 != null) {
             KeyNode keyNode = DyTroubleShooting.c.n(p0, p1, p2);
             keyNode = (keyNode != null)? keyNode.getId(): null;
          }
       label_0013 :
          String str = p1;
          DyTroubleShooting.i(p0, str, p3, p4, p5, p6, p7);
       }catch(java.lang.Exception e7){
          Throwable throwable = e7;
          b$a.b(b.a, "DyTroubleShooting addErrorLog error", throwable, null, 4, null);
       }
       return;
    }
    public static final void i(String p0,String p1,String p2,Throwable p3,Map p4,boolean p5,RubasParams p6){
       TroubleShooting a = TroubleShooting.a;
       String str = "";
       int i = (p0 != null)? p0: str;
       int i1 = (p1 != null)? p1: str;
       TroubleShooting.h(a, i, i1, "DAC", "DynamicPendant", p2, p3, p4, p5, p6, 0, false, 1536, null);
       return;
    }
    public static void j(String p0,DACKeyNode p1,String p2,Throwable p3,Map p4,boolean p5,RubasParams p6,int p7,Object p8){
       Throwable throwable = (p7 & 0x08)? null: p3;
       Map map = (p7 & 0x10)? null: p4;
       boolean b = (p7 & 0x20)? false: p5;
       DyTroubleShooting.h(p0, null, p1, p2, throwable, map, b, null);
       return;
    }
    public static void k(String p0,String p1,DACKeyNode p2,String p3,Throwable p4,Map p5,boolean p6,RubasParams p7,int p8,Object p9){
       Throwable throwable = (p8 & 0x10)? null: p4;
       Map map = (p8 & 0x20)? null: p5;
       boolean b = (p8 & 0x40)? false: p6;
       DyTroubleShooting.h(p0, p1, p2, p3, throwable, map, b, null);
       return;
    }
    public static void l(String p0,String p1,String p2,Throwable p3,Map p4,boolean p5,RubasParams p6,int p7,Object p8){
       if (p7 & 0x08) {
          p3 = null;
       }
       Throwable throwable = p3;
       boolean b = (p7 & 0x20)? false: p5;
       DyTroubleShooting.i(p0, p1, p2, throwable, null, b, null);
       return;
    }
    public static KeyNode o(DyTroubleShooting p0,String p1,String p2,DACKeyNode p3,int p4,Object p5){
       return p0.n(p1, null, p3);
    }
    public final void a(String p0,String p1,String p2,boolean p3){
       String str;
       try{
          ConcurrentHashMap uConcurrentH = (p0 == null || u.S1(p0))? 1: null;
          if (uConcurrentH) {
             return;
          }else {
             uConcurrentH = DyTroubleShooting.a;
             if (uConcurrentH.get(p0) == null) {
                uConcurrentH.put(p0, new DyTroubleShooting$a());
             }
             DyTroubleShooting$a uoa = uConcurrentH.get(p0);
             uConcurrentH = (uoa != null)? uoa.a(): null;
             LinkedHashMap linkedHashMa = (uConcurrentH != null)? uConcurrentH.get(p1): null;
             if (linkedHashMa != null) {
                return;
             }else {
                linkedHashMa = this.r();
                if (uConcurrentH != null) {
                   LinkedHashMap linkedHashMa1 = uConcurrentH.put(p1, linkedHashMa);
                }
                if (p3) {
                   TroubleShooting.a.a(p0, null, new ComponentNode(p1, p2));
                }
                Iterator iterator = linkedHashMa.entrySet().iterator();
                while (iterator.hasNext()) {
                   TroubleShooting.a.j(p0, p1, iterator.next().getValue());
                }
             }
          }
       }catch(java.lang.Exception e7){
          Throwable throwable = e7;
          b$a.b(b.a, "addComponentKeyNodes error", throwable, null, 4, null);
       }
       return;
    }
    public final Map m(){
       Pair[] pairArray = new Pair[]{r0.a("DACLogLevel", Integer.valueOf(LogLevel.HIGH.getLevel()))};
       return t0.j0(pairArray);
    }
    public final KeyNode n(String p0,String p1,DACKeyNode p2){
       DyTroubleShooting$a uoa;
       int i = (p1 == null || u.S1(p1))? 1: 0;
       KeyNode keyNode = null;
       if (i) {
          uoa = this.q(p0);
          if (uoa != null) {
             uoa = uoa.a;
             if (uoa != null) {
                keyNode = uoa.get(p2);
             }
          }
          return keyNode;
       }else {
          uoa = this.q(p0);
          if (uoa != null) {
             ConcurrentHashMap uConcurrentH = uoa.a();
             if (uConcurrentH != null) {
                LinkedHashMap linkedHashMa = uConcurrentH.get(p1);
                if (linkedHashMa != null) {
                   keyNode = linkedHashMa.get(p2);
                }
             }
          }
          return keyNode;
       }
    }
    public final String p(String p0,String p1,DACKeyNode p2){
       KeyNode keyNode = this.n(p0, p1, p2);
       keyNode = (keyNode != null)? keyNode.getId(): null;
       return keyNode;
    }
    public final DyTroubleShooting$a q(String p0){
       ConcurrentHashMap uConcurrentH = (p0 == null || u.S1(p0))? 1: null;
       if (uConcurrentH) {
          return null;
       }else {
          return DyTroubleShooting.a.get(p0);
       }
    }
    public final LinkedHashMap r(){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Pair[] pairArray = new Pair[]{r0.a(DACKeyNode.COMPONENT_DATA_CHECK, new KeyNode("组件数据及校验", "DAC")),r0.a(DACKeyNode.COMPONENT_SHOULD_SHOW, new KeyNode("shouldShow", "DAC")),r0.a(DACKeyNode.COMPONENT_CREATE_RENDER, new KeyNode("组件创建及渲染", "DAC")),r0.a(DACKeyNode.COMPONENT_MOUNT_UPDATE, new KeyNode("组件挂载与更新", "DAC")),r0.a(DACKeyNode.COMPONENT_BUSINESS_LOGIC, new KeyNode("组件业务逻辑", "BIZ"))};
       linkedHashMa.putAll(t0.W(pairArray));
       return linkedHashMa;
    }
    public final LinkedHashMap s(){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Pair[] pairArray = new Pair[]{r0.a(DACKeyNode.DAC_FRAMEWORK, new KeyNode("DAC环境节点", "DAC")),r0.a(DACKeyNode.DAC_ENV_INIT, new KeyNode("DAC环境初始化", "DAC")),r0.a(DACKeyNode.DAC_RECEIVER_REQUEST_DATA, new KeyNode("DAC接收或请求数据", "DAC"))};
       linkedHashMa.putAll(t0.W(pairArray));
       return linkedHashMa;
    }
}
