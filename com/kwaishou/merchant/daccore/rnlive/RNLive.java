package com.kwaishou.merchant.daccore.rnlive.RNLive;
import com.kwaishou.merchant.daccore.rnlive.RNLive$a;
import nsd.u;
import java.lang.Object;
import com.kwaishou.merchant.daccore.rnlive.RNLive$RNLiveState;
import java.lang.String;
import java.lang.Throwable;
import java.util.Map;
import c08.a;
import b08.a;
import com.kwaishou.merchant.daccore.log.DACKeyNode;
import com.kwaishou.merchant.troubleshooting.core.model.RubasParams;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import com.google.gson.JsonObject;
import kotlin.Pair;
import qrd.r0;
import java.lang.Integer;
import trd.t0;
import o08.a;
import o08.a$b;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import brd.t;
import com.kwaishou.merchant.daccore.rnlive.RNLive$b;
import io.reactivex.g;
import n08.a;
import com.kwaishou.merchant.daccore.rnlive.RNLive$c;

public final class RNLive	// class@00133d
{
    public RNHeadless a;
    public a b;
    public RNLive$RNLiveState c;
    public a d;
    public static final RNLive$a e;

    static {
       RNLive.e = new RNLive$a(null);
    }
    public void RNLive(){
       super();
       this.c = RNLive$RNLiveState.UNREADY;
    }
    public static void b(RNLive p0,String p1,String p2,Throwable p3,Map p4,int p5,Object p6){
       Throwable throwable = (p5 & 0x04)? null: p3;
       String str = a.d(p0.d);
       DACKeyNode cOMPONENT_SH = DACKeyNode.COMPONENT_SHOULD_SHOW;
       String str1 = (p2 != null)? p2: "";
       DyTroubleShooting.k(str, p1, cOMPONENT_SH, str1, throwable, null, false, null, 192, null);
       return;
    }
    public static void d(RNLive p0,String p1,String p2,Map p3,int p4,Object p5){
       p0.c(p1, p2, null);
    }
    public final void a(String p0,JsonObject p1,int p2,String p3){
       Pair[] pairArray = new Pair[3];
       if (p3 != null) {
       }else {
          p3 = "";
       }
       pairArray[0] = r0.a("componentName", p3);
       pairArray[1] = r0.a("source", Integer.valueOf(p2));
       if (p1 == null) {
          p1 = new JsonObject();
       }
       pairArray[2] = r0.a("data", p1);
       Map map = t0.j0(pairArray);
       RNLive tb = this.b;
       if (tb != null) {
          a.d(tb, p0, map, null, null, 12, null);
       }
       return;
    }
    public final void c(String p0,String p1,Map p2){
       String str = a.d(this.d);
       DACKeyNode cOMPONENT_SH = DACKeyNode.COMPONENT_SHOULD_SHOW;
       if (p1 != null) {
       }else {
          p1 = "";
       }
       DyTroubleShooting.f(str, p0, cOMPONENT_SH, p1, p2, false, null, false, 224, null);
       return;
    }
    public final t e(String p0,int p1,PendantMountInfo p2,JsonObject p3,String p4){
       RNLive.d(this, p4, "RNLive call pendantInfo", null, 4, null);
       super(this, p0, p3, p1, p2, p4);
       return t.create(this);
    }
    public final void f(RNLive$RNLiveState p0){
       this.c = p0;
    }
    public final t g(String p0,int p1,JsonObject p2,String p3,a p4){
       RNLive.d(this, p3, "RNLive call shouldShow", null, 4, null);
       super(this, p0, p2, p1, p3, p4);
       return t.create(this);
    }
    public final void onLiveEvent(String p0){
       this.onLiveEvent(p0, null);
    }
    public final void onLiveEvent(String p0,JsonObject p1){
       Pair[] pairArray = new Pair[1];
       if (p1 != null) {
       }else {
          p1 = new JsonObject();
       }
       pairArray[0] = r0.a("data", p1);
       Map map = t0.j0(pairArray);
       RNLive tb = this.b;
       if (tb != null) {
          a.d(tb, p0, map, null, null, 12, null);
       }
       return;
    }
}
