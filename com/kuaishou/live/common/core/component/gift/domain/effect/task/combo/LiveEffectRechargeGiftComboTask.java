package com.kuaishou.live.common.core.component.gift.domain.effect.task.combo.LiveEffectRechargeGiftComboTask;
import com.kuaishou.live.common.core.component.gift.domain.effect.task.combo.LiveEffectComboTask;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import java.util.Map;
import g03.a;
import hi1.a;
import gi1.a;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashSet;
import java.lang.Integer;
import oz2.e;
import java.lang.Boolean;
import pz2.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.domain.effect.task.combo.LiveEffectComboTask$BizExtraInfo;
import com.kuaishou.live.common.core.component.gift.domain.effect.task.combo.LiveEffectRechargeGiftComboTask$RechargeableGiftInfo;
import crd.b;
import lnc.b9;
import kz2.a;
import pz2.a;
import java.lang.Math;
import com.kuaishou.live.common.core.component.gift.domain.effect.bean.LiveEffectRechargeGiftData;
import com.kuaishou.live.common.core.component.gift.domain.effect.bean.MagicSdkProtocol;
import java.lang.System;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ji1.b;
import erd.g;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.google.gson.JsonObject;
import ekd.k0;
import li1.c;
import ji1.a;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.StringBuilder;

public class LiveEffectRechargeGiftComboTask extends LiveEffectComboTask	// class@0011c3
{
    public b w;
    public a x;
    public static final List y;

    static {
       LiveEffectRechargeGiftComboTask.y = LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectRechargeGiftComboTask");
    }
    public void LiveEffectRechargeGiftComboTask(LiveCommonEffectInfo p0,long p1,Map p2,a p3,a p4,a p5,int p6){
       this.x = p5;
    }
    public Set C(){
       HashSet obj = PatchProxy.apply(null, this, LiveEffectRechargeGiftComboTask.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashSet();
       obj.add(Integer.valueOf(2501));
       return obj;
    }
    public boolean F(int p0,e p1){
       LiveEffectRechargeGiftComboTask liveEffectRe = LiveEffectRechargeGiftComboTask.class;
       if (PatchProxy.isSupport(liveEffectRe)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, liveEffectRe, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       c uoc = p1.b();
       boolean b = false;
       if (!super.F(p0, p1)) {
          return b;
       }else if(!uoc instanceof LiveEffectRechargeGiftComboTask){
          b.P(LiveEffectRechargeGiftComboTask.y, "[onHandlePlayStep]: renderingTask is not LiveEffectRechargeGiftComboTask");
          return b;
       }else if(this.N()){
          b.S(LiveEffectRechargeGiftComboTask.y, "[onHandlePlayStep]: BizExtraInfo Invalid", "mBizExtraInfo", this.r);
          return true;
       }else if(this.O()){
          b.P(LiveEffectRechargeGiftComboTask.y, "[onHandlePlayStep]: receive HighLightMoment when rendering");
          return true;
       }else {
          c uoc1 = uoc;
          if (uoc1.q != null) {
             String str = this.M();
             this.x.a(uoc1, str);
             uoc1.Q(this.r.mRechargeableGiftInfo.mEffectMaxDisplayTimeS);
             b.T(LiveEffectRechargeGiftComboTask.y, "[onHandlePlayStep] task resolved. SendStreamRenderMessage", "rendering task", uoc, "sendMsg", str);
          }else {
             this.P(uoc1);
             b.P(LiveEffectRechargeGiftComboTask.y, "[onHandlePlayStep] task resolved. mergeInQueueEffectTasks");
          }
          return true;
       }
    }
    public int G(){
       return 1;
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, LiveEffectRechargeGiftComboTask.class, "10")) {
          return;
       }
       b9.a(this.w);
       c uoc = this.x.H();
       if (uoc == null) {
          b.r(LiveEffectRechargeGiftComboTask.y, "[clearRenderingTask]: renderingTask == null");
          return;
       }else if(!this.equals(uoc)){
          b.r(LiveEffectRechargeGiftComboTask.y, "[clearRenderingTask]: renderingTask is not count down task");
          return;
       }else if(!this.b() - uoc.b()){
          b.r(LiveEffectRechargeGiftComboTask.y, "[clearRenderingTask]: call LiveEffectService.clearRenderingEffectTask");
          this.x.D();
       }
       return;
    }
    public final String M(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveEffectComboTask obj = PatchProxy.apply(null, this, LiveEffectRechargeGiftComboTask.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.r;
       String str = "";
       if (obj != null) {
          LiveEffectComboTask$BizExtraInfo mRechargeabl = obj.mRechargeableGiftInfo;
          if (mRechargeabl != null) {
             LiveEffectRechargeGiftData liveEffectRe = new LiveEffectRechargeGiftData(Math.max(mRechargeabl.mBatchedCount, 0), Math.max(mRechargeabl.mCountLimit, 0), Math.max(mRechargeabl.mCountdown, 0), this.r.mRechargeableGiftInfo.mHighlightMoment);
             int i = 2500;
             if (PatchProxy.isSupport(LiveEffectComboTask.class)) {
                Object obj1 = PatchProxy.applyTwoRefs(liveEffectRe, Integer.valueOf(i), this, LiveEffectComboTask.class, "5");
                if (obj1 != patchProxyRe) {
                   str = obj1;
                }else {
                label_0053 :
                   long l = System.currentTimeMillis();
                   MagicSdkProtocol magicSdkProt = patchProxyRe;
                   try{
                      magicSdkProt = new MagicSdkProtocol("", 2500, liveEffectRe, l);
                      str = a.a.q(patchProxyRe);
                   }catch(java.lang.Exception e0){
                      b.y(LiveEffectComboTask.v, "[getMagicSdkProtocolJsonString] toJson fail.", e0);
                   }
                }
             }else {
                goto label_0053 ;
             }
          }
       }
       b.S(LiveEffectRechargeGiftComboTask.y, "[getGiftInfoJsonString]", "mBizExtraInfo", obj);
       return str;
    }
    public final boolean N(){
       LiveEffectComboTask tr = this.r;
       boolean b = (tr == null || tr.mRechargeableGiftInfo == null)? true: false;
       return b;
    }
    public final boolean O(){
       return this.r.mRechargeableGiftInfo.mHighlightMoment;
    }
    public final boolean P(LiveEffectRechargeGiftComboTask p0){
       LiveEffectComboTask$BizExtraInfo obj = PatchProxy.applyOneRefs(p0, this, LiveEffectRechargeGiftComboTask.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b.S(LiveEffectRechargeGiftComboTask.y, "[tryMergeInQueueEffectTasks] merge success", "extraInfo", this.r);
       LiveEffectComboTask$BizExtraInfo mRechargeabl = p0.r.mRechargeableGiftInfo;
       obj = this.r.mRechargeableGiftInfo;
       mRechargeabl.mBatchedCount = mRechargeabl.mBatchedCount + obj.mBatchedCount;
       mRechargeabl.mCountdown = obj.mCountdown;
       mRechargeabl.mCountLimit = obj.mCountLimit;
       return true;
    }
    public void Q(int p0){
       LiveEffectRechargeGiftComboTask liveEffectRe = LiveEffectRechargeGiftComboTask.class;
       if (PatchProxy.isSupport(liveEffectRe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveEffectRe, "4")) {
          return;
       }
       b9.a(this.w);
       b.T(LiveEffectRechargeGiftComboTask.y, "countDown£¬start", "time", Integer.valueOf(p0), "task", this);
       this.w = t.timer((long)p0, TimeUnit.SECONDS).observeOn(d.a).subscribe(new b(this));
       return;
    }
    public void g(String p0,int p1){
       LiveEffectRechargeGiftComboTask liveEffectRe = LiveEffectRechargeGiftComboTask.class;
       if (PatchProxy.isSupport(liveEffectRe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveEffectRe, "5")) {
          return;
       }
       List y = LiveEffectRechargeGiftComboTask.y;
       String str = "[receiveMagicFaceMessage] ";
       String str1 = "json";
       try{
          b.S(y, str, str1, p0);
          c uoc = a.a.c(k0.e(c.d(TextUtils.k(p0)).r(), "data"), c.class);
          if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "2")) {
          label_004c :
             if (p1 == 2501) {
                int i = 1;
                if (uoc.a() == i && uoc.b() == 2) {
                   a.a("CHARGING_MODE_TASK", i, this.u.a());
                }
                if (uoc.a() == 2 && uoc.b() == 3) {
                   a.a("CHARGING_MODE_TASK", 7, this.u.a());
                }
                if (uoc.a() == 2 && uoc.b() == 4) {
                   a.a("CHARGING_MODE_TASK", 8, this.u.a());
                }
                if (uoc.gameOver != null) {
                   this.L();
                   b.P(y, "[receiveMagicFaceMessage] receive reqType="+p1+", clear rendering effect task");
                }
             }
          }else {
             u1.R("CHARGING_MODE_TASK_CUSTOM_EVENT", p0, 3);
             goto label_004c ;
          }
       }catch(java.lang.Exception e7){
          b.y(LiveEffectRechargeGiftComboTask.y, "[receiveMagicFaceMessage] resolve sdk effect msg error", e7);
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, LiveEffectRechargeGiftComboTask.class, "3")) {
          return;
       }
       super.m();
       if (this.N()) {
          b.S(LiveEffectRechargeGiftComboTask.y, "[onEffectRenderStart]: BizExtraInfo Invalid", "mBizExtraInfo", this.r);
          this.L();
          return;
       }else {
          this.Q(this.r.mRechargeableGiftInfo.mEffectMaxDisplayTimeS);
          if (this.s != null) {
             String str = this.M();
             this.x.a(this, str);
             b.T(LiveEffectRechargeGiftComboTask.y, "[onEffectRenderStart] task resolved. SendStreamRenderMessage", "task", this, "sendMsg", str);
          }
          if (this.O()) {
             a.a("CHARGING_MODE_MMU_TASK", 10, this.u.a());
          }
          return;
       }
    }
    public boolean o(int p0,e p1){
       LiveEffectRechargeGiftComboTask liveEffectRe = LiveEffectRechargeGiftComboTask.class;
       if (PatchProxy.isSupport(liveEffectRe)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, liveEffectRe, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (!super.o(p0, p1)) {
          b.P(LiveEffectRechargeGiftComboTask.y, "[onHandlePreEnqueueStep]: super method return false");
          return b;
       }else {
          c uoc = p1.a();
          if (!uoc instanceof LiveEffectRechargeGiftComboTask) {
             b.S(LiveEffectRechargeGiftComboTask.y, "[tryMergeInQueueEffectTasks] cannot merge. inQueueTask is not LiveEffectRechargeGiftComboTask", "inQueueTask", uoc);
             return b;
          }else if(this.N()){
             b.S(LiveEffectRechargeGiftComboTask.y, "[onHandlePreEnqueueStep]: BizExtraInfo Invalid", "mBizExtraInfo", this.r);
             return true;
          }else if(this.O()){
             b.P(LiveEffectRechargeGiftComboTask.y, "[onHandlePreEnqueueStep]: receive HighLightMoment when preEnqueue");
             return true;
          }else {
             return this.P(uoc);
          }
       }
    }
    public void q(boolean p0,String p1){
       if (PatchProxy.isSupport(LiveEffectRechargeGiftComboTask.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LiveEffectRechargeGiftComboTask.class, "6")) {
          return;
       }
       b9.a(this.w);
       return;
    }
    public int x(){
       return 1;
    }
}
