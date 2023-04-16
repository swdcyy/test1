package com.kuaishou.android.live.log.b;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Map;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pp.a;
import q87.c;
import pp.c;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class b	// class@0007d8
{
    public static b$a a;

    public void b(){
       super();
    }
    public static void A(List p0,String p1,Map p2,Map p3,Throwable p4){
       b uob = b.class;
       int i = 1;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uob, "30")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       objArray1[0] = b.b(p0, p1, p2, p3);
       a.C().u(b.N(p0), p4, objArray1);
       return;
    }
    public static void B(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "15")) {
          return;
       }
       b.D(p0, p1, null, null, null);
       return;
    }
    public static void C(c p0,String p1,c$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "17")) {
          return;
       }
       b.D(p0, p1, p2, null, null);
       return;
    }
    public static void D(c p0,String p1,c$b p2,c$b p3,Throwable p4){
       b uob = b.class;
       int i = 1;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,null,p4};
          if (PatchProxy.applyVoid(objArray, null, uob, "19")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       objArray1[0] = b.c(p0, p1, p2, null);
       a.C().u(b.O(p0), p4, objArray1);
       return;
    }
    public static void E(c p0,String p1,c$b p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "18")) {
          return;
       }
       b.D(p0, p1, p2, null, p3);
       return;
    }
    public static void F(c p0,String p1,String p2,Object p3,String p4,Object p5,String p6,Object p7,Throwable p8){
       object oobject = p0;
       object oobject1 = p1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = null;
          if (PatchProxy.applyVoid(objArray, null, uob, "45")) {
             return;
          }
       }
       b.E(p0, p1, c.l(p2, b.M(p3), p4, b.M(p5), p6, b.M(p7)), null);
       return;
    }
    public static void G(c p0,String p1,String p2,Object p3,String p4,Object p5,Throwable p6){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, null, uob, "43")) {
             return;
          }
       }
       b.E(p0, p1, c.k(p2, b.M(p3), p4, b.M(p5)), p6);
       return;
    }
    public static void H(c p0,String p1,String p2,Object p3,Throwable p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uob, "41")) {
             return;
          }
       }
       b.E(p0, p1, c.j(p2, b.M(p3)), p4);
       return;
    }
    public static void I(c p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "16")) {
          return;
       }
       b.D(p0, p1, null, null, p2);
       return;
    }
    public static void J(c p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "25")) {
          return;
       }
       b.L(p0, p1, p2, null, null);
       return;
    }
    public static void K(c p0,String p1,Map p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "26")) {
          return;
       }
       b.L(p0, p1, p2, null, p3);
       return;
    }
    public static void L(c p0,String p1,Map p2,Map p3,Throwable p4){
       b uob = b.class;
       int i = 1;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,null,p4};
          if (PatchProxy.applyVoid(objArray, null, uob, "27")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       objArray1[0] = b.d(p0, p1, p2, null);
       a.C().u(b.O(p0), p4, objArray1);
       return;
    }
    public static String M(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (p0 == null)? "null": p0.toString();
       return p0;
    }
    public static String N(List p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 != null && !p0.isEmpty()) {
          obj = p0.get(0);
       }
       return b.O(obj);
    }
    public static String O(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String name = (p0 != null)? p0.getName(): "Live";
       return name;
    }
    public static void P(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "7")) {
          return;
       }
       b.Q(p0, p1, null);
       return;
    }
    public static void Q(List p0,String p1,c$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "9")) {
          return;
       }
       b.R(p0, p1, p2, null);
       return;
    }
    public static void R(List p0,String p1,c$b p2,c$b p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, null, null, b.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w(b.N(p0), b.g(p0, p1, p2, null), objArray);
       return;
    }
    public static void S(List p0,String p1,String p2,Object p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "34")) {
          return;
       }
       b.Q(p0, p1, c.j(p2, b.M(p3)));
       return;
    }
    public static void T(List p0,String p1,String p2,Object p3,String p4,Object p5){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, uob, "36")) {
             return;
          }
       }
       b.Q(p0, p1, c.k(p2, b.M(p3), p4, b.M(p5)));
       return;
    }
    public static void U(List p0,String p1,String p2,Object p3,String p4,Object p5,String p6,Object p7){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, null, uob, "38")) {
             return;
          }
       }
       b.Q(p0, p1, c.l(p2, b.M(p3), p4, b.M(p5), p6, b.M(p7)));
       return;
    }
    public static void V(List p0,String p1,String p2,Object p3,String p4,Object p5,String p6,Object p7,String p8,Object p9){
       object oobject = p0;
       object oobject1 = p1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[10];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          if (PatchProxy.applyVoid(objArray, null, uob, "40")) {
             return;
          }
       }
       b.Q(p0, p1, c.m(p2, b.M(p3), p4, b.M(p5), p6, b.M(p7), p8, b.M(p9)));
       return;
    }
    public static void W(List p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "8")) {
          return;
       }
       a.C().v(b.N(p0), b.g(p0, p1, null, null), p2);
       return;
    }
    public static void X(List p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "13")) {
          return;
       }
       b.Y(p0, p1, p2, null);
       return;
    }
    public static void Y(List p0,String p1,Map p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w(b.N(p0), b.h(p0, p1, p2, p3), objArray);
       return;
    }
    public static void Z(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "1")) {
          return;
       }
       b.a0(p0, p1, null);
       return;
    }
    public static String a(List p0,String p1,c$b p2,c$b p3){
       StringBuilder obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, b.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.e()+"[KSLiveFT]"+"[e:Error]";
       b.p(obj, p0);
       b.o(obj, p1);
       b.f(obj, "[params:{", p2);
       b.f(obj, "[context:{", p3);
       return obj+"[/KSLiveFT]";
    }
    public static void a0(c p0,String p1,c$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "3")) {
          return;
       }
       b.b0(p0, p1, p2, null);
       return;
    }
    public static String b(List p0,String p1,Map p2,Map p3){
       StringBuilder obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, b.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.e()+"[KSLiveFT]"+"[e:Error]";
       b.p(obj, p0);
       b.o(obj, p1);
       b.e(obj, "[params:{", p2);
       b.e(obj, "[context:{", p3);
       return obj+"[/KSLiveFT]";
    }
    public static void b0(c p0,String p1,c$b p2,c$b p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, null, null, b.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w(b.O(p0), b.i(p0, p1, p2, null), objArray);
       return;
    }
    public static String c(c p0,String p1,c$b p2,c$b p3){
       StringBuilder obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, b.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.e()+"[KSLiveFT]"+"[e:Error]";
       b.q(obj, p0);
       b.o(obj, p1);
       b.f(obj, "[params:{", p2);
       b.f(obj, "[context:{", p3);
       return obj+"[/KSLiveFT]";
    }
    public static void c0(c p0,String p1,String p2,Object p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "33")) {
          return;
       }
       b.a0(p0, p1, c.j(p2, b.M(p3)));
       return;
    }
    public static String d(c p0,String p1,Map p2,Map p3){
       StringBuilder obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, b.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.e()+"[KSLiveFT]"+"[e:Error]";
       b.q(obj, p0);
       b.o(obj, p1);
       b.e(obj, "[params:{", p2);
       b.e(obj, "[context:{", p3);
       return obj+"[/KSLiveFT]";
    }
    public static void d0(c p0,String p1,String p2,Object p3,String p4,Object p5){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, uob, "35")) {
             return;
          }
       }
       b.a0(p0, p1, c.k(p2, b.M(p3), p4, b.M(p5)));
       return;
    }
    public static void e(StringBuilder p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "63")) {
          return;
       }
       if (p2 != null && !p2.isEmpty()) {
          p0 = p0+p1;
          int i = 0;
          Iterator iterator = p2.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (i > 0) {
                p0 = p0+",";
             }
             p0 = p0+"\""+uEntry.getKey()+"\":"+uEntry.getValue();
             i++;
          }
          p0+"}]";
       }
       return;
    }
    public static void e0(c p0,String p1,String p2,Object p3,String p4,Object p5,String p6,Object p7){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, null, uob, "37")) {
             return;
          }
       }
       b.a0(p0, p1, c.l(p2, b.M(p3), p4, b.M(p5), p6, b.M(p7)));
       return;
    }
    public static void f(StringBuilder p0,String p1,c$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "62")) {
          return;
       }
       if (p2 != null) {
          p0 = p0+p1;
          p2.a(p0);
          p0+"}]";
       }
       return;
    }
    public static void f0(c p0,String p1,String p2,Object p3,String p4,Object p5,String p6,Object p7,String p8,Object p9){
       object oobject = p0;
       object oobject1 = p1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[10];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          if (PatchProxy.applyVoid(objArray, null, uob, "39")) {
             return;
          }
       }
       b.a0(p0, p1, c.m(p2, b.M(p3), p4, b.M(p5), p6, b.M(p7), p8, b.M(p9)));
       return;
    }
    public static String g(List p0,String p1,c$b p2,c$b p3){
       StringBuilder obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, b.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.e()+"[KSLiveFT]";
       b.p(obj, p0);
       b.o(obj, p1);
       b.f(obj, "[params:{", p2);
       b.f(obj, "[context:{", p3);
       return obj+"[/KSLiveFT]";
    }
    public static void g0(c p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "2")) {
          return;
       }
       a.C().v(b.O(p0), b.i(p0, p1, null, null), p2);
       return;
    }
    public static String h(List p0,String p1,Map p2,Map p3){
       StringBuilder obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, b.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.e()+"[KSLiveFT]";
       b.p(obj, p0);
       b.o(obj, p1);
       b.e(obj, "[params:{", p2);
       b.e(obj, "[context:{", p3);
       return obj+"[/KSLiveFT]";
    }
    public static void h0(c p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "11")) {
          return;
       }
       b.i0(p0, p1, p2, null);
       return;
    }
    public static String i(c p0,String p1,c$b p2,c$b p3){
       StringBuilder obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, b.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.e()+"[KSLiveFT]";
       b.q(obj, p0);
       b.o(obj, p1);
       b.f(obj, "[params:{", p2);
       b.f(obj, "[context:{", p3);
       return obj+"[/KSLiveFT]";
    }
    public static void i0(c p0,String p1,Map p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w(b.O(p0), b.j(p0, p1, p2, p3), objArray);
       return;
    }
    public static String j(c p0,String p1,Map p2,Map p3){
       StringBuilder obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, b.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.e()+"[KSLiveFT]";
       b.q(obj, p0);
       b.o(obj, p1);
       b.e(obj, "[params:{", p2);
       b.e(obj, "[context:{", p3);
       return obj+"[/KSLiveFT]";
    }
    public static void j0(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "31")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().A(b.O(p0), b.i(p0, p1, null, null), objArray);
       return;
    }
    public static void k(StringBuilder p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "64")) {
          return;
       }
       p0+"\""+p1+"\":"+p2;
       return;
    }
    public static void k0(c p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "32")) {
          return;
       }
       a.C().z(b.O(p0), b.i(p0, p1, null, null), p2);
       return;
    }
    public static void l(StringBuilder p0,Object p1,Object p2,Object p3,Object p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uob, "65")) {
             return;
          }
       }
       p0+"\""+p1+"\":"+p2+","+"\""+p3+"\":"+p4;
       return;
    }
    public static void m(StringBuilder p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, null, uob, "66")) {
             return;
          }
       }
       p0+"\""+p1+"\":"+p2+","+"\""+p3+"\":"+p4+","+"\""+p5+"\":"+p6;
       return;
    }
    public static void n(StringBuilder p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, uob, "67")) {
             return;
          }
       }
       p0+"\""+p1+"\":"+p2+","+"\""+p3+"\":"+p4+","+"\""+p5+"\":"+p6+","+"\""+p7+"\":"+p8;
       return;
    }
    public static void o(StringBuilder p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "61")) {
          return;
       }
       p0+"[desc:"+p1+"]";
       return;
    }
    public static void p(StringBuilder p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "60")) {
          return;
       }
       if (p1 != null && !p1.isEmpty()) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             p0+"[biz:"+iterator.next().getName()+"]";
          }
       }
       return;
    }
    public static void q(StringBuilder p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "59")) {
          return;
       }
       if (p1 != null) {
          p0+"[biz:"+p1.getName()+"]";
       }
       return;
    }
    public static void r(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "20")) {
          return;
       }
       b.t(p0, p1, null, null, null);
       return;
    }
    public static void s(List p0,String p1,c$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "22")) {
          return;
       }
       b.t(p0, p1, p2, null, null);
       return;
    }
    public static void t(List p0,String p1,c$b p2,c$b p3,Throwable p4){
       b uob = b.class;
       int i = 1;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,null,p4};
          if (PatchProxy.applyVoid(objArray, null, uob, "24")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       objArray1[0] = b.a(p0, p1, p2, null);
       a.C().u(b.N(p0), p4, objArray1);
       return;
    }
    public static void u(List p0,String p1,c$b p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "23")) {
          return;
       }
       b.t(p0, p1, p2, null, p3);
       return;
    }
    public static void v(List p0,String p1,String p2,Object p3,String p4,Object p5,String p6,Object p7,Throwable p8){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, uob, "46")) {
             return;
          }
       }
       b.u(p0, p1, c.l(p2, b.M(p3), p4, b.M(p5), p6, b.M(p7)), p8);
       return;
    }
    public static void w(List p0,String p1,String p2,Object p3,String p4,Object p5,Throwable p6){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, null, uob, "44")) {
             return;
          }
       }
       b.u(p0, p1, c.k(p2, b.M(p3), p4, b.M(p5)), p6);
       return;
    }
    public static void x(List p0,String p1,String p2,Object p3,Throwable p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uob, "42")) {
             return;
          }
       }
       b.u(p0, p1, c.j(p2, b.M(p3)), p4);
       return;
    }
    public static void y(List p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "21")) {
          return;
       }
       b.t(p0, p1, null, null, p2);
       return;
    }
    public static void z(List p0,String p1,Map p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, null, null, b.class, "29")) {
          return;
       }
       b.A(p0, p1, p2, null, null);
       return;
    }
}
