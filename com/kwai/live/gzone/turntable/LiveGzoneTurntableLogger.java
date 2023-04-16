package com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import java.lang.Object;
import java.util.UUID;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import androidx.collection.ArraySet;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger$TurntablePrizeItem;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger$a;
import java.lang.Integer;
import fg6.a;
import com.google.gson.Gson;
import lnc.i3;
import java.lang.Number;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntableTask;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger$TurntableTaskItem;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.u1;
import java.lang.Boolean;
import q2b.h$b;

public abstract class LiveGzoneTurntableLogger	// class@000e29
{
    public boolean a;
    public boolean b;
    public final String c;
    public final String d;
    public Set e;

    public void LiveGzoneTurntableLogger(){
       super();
       this.a = true;
       this.b = true;
       String str = UUID.randomUUID().toString();
       this.c = str;
       String str1 = PatchProxy.applyOneRefs(str, null, LiveGzoneTurntableLogger.class, "37");
       if (str1 != PatchProxyResult.class) {
       }else {
          str1 = "{\"uuid\":\""+str+"\"}";
       }
       this.d = str1;
       this.e = new ArraySet();
       return;
    }
    public static void f(String p0,String[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveGzoneTurntableLogger.class, "24")) {
          return;
       }
       b.c0(LiveLogTag.GZONE, "LiveGzoneTurntableLogger", p0, p1);
       return;
    }
    public final ClientEvent$ElementPackage a(String p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneTurntableLogger.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = p0;
       obj.type = 1;
       return obj;
    }
    public final String b(LiveGzoneTurntablePrize p0){
       LiveGzoneTurntableLogger$TurntablePrizeItem obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneTurntableLogger.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return this.d;
       }
       obj = new LiveGzoneTurntableLogger$TurntablePrizeItem(this, null);
       obj.mName = p0.mName;
       obj.mPrizeType = Integer.valueOf(p0.mPrizeTypeValue);
       obj.mPrizeDesc = p0.mTips;
       obj.mPrizeId = p0.mPrizeId;
       obj.mPrizeCount = Integer.valueOf(p0.mBatchSize);
       obj.mUuid = this.c;
       return a.a.q(obj);
    }
    public final ClientEvent$ElementPackage c(int p0){
       ClientEvent$ElementPackage obj;
       LiveGzoneTurntableLogger liveGzoneTur = LiveGzoneTurntableLogger.class;
       if (PatchProxy.isSupport(liveGzoneTur)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveGzoneTur, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "LUCKY_EGG_MACHINE_REDPOINT";
       i3 oi3 = i3.f();
       oi3.c("redpoint_type", Integer.valueOf(p0));
       obj.params = oi3.e();
       return obj;
    }
    public final String d(LiveGzoneTurntableTask p0){
       LiveGzoneTurntableLogger$TurntableTaskItem obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneTurntableLogger.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveGzoneTurntableLogger$TurntableTaskItem(this, null);
       obj.mTaskId = p0.mTaskId;
       obj.mTaskName = p0.mTip;
       obj.mElementIndex = Integer.valueOf(p0.mListIndex);
       obj.mLimit = Integer.valueOf(p0.mDayLimit);
       obj.mNum = Integer.valueOf(p0.mObtainedDrawCount);
       obj.mUuid = this.c;
       obj.mStatus = Integer.valueOf(p0.getStatus());
       return a.a.q(obj);
    }
    public final String e(String p0,String p1,LiveGzoneTurntableTask p2){
       i3 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGzoneTurntableLogger.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("author_id", p0);
       obj.d("room_id", p1);
       obj.d("imei_or_idfa", TextUtils.k(SystemUtil.m(a.B)));
       obj.d("sceneId", "128");
       obj.d("game_id", TextUtils.k(p2.mGameId));
       obj.c("game_position", Integer.valueOf((p2.mListIndex + 1)));
       obj.d("task_id", p2.mTaskId);
       obj.d("task_name", p2.mTip);
       return obj.e();
    }
    public ClientContent$ContentPackage g(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, LiveGzoneTurntableLogger.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = this.h();
       return obj;
    }
    public abstract ClientContent$LiveStreamPackage h();
    public final void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableLogger.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = this.a(p0);
       uElementPack.params = this.d;
       u1.u(1, uElementPack, this.g());
       return;
    }
    public final void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableLogger.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = this.a(p0);
       uElementPack.params = this.d;
       u1.u0(6, uElementPack, this.g());
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableLogger.class, "18")) {
          return;
       }
       if (this.a != null) {
          this.a = false;
          this.j("LIVE_TURNTABLE_TASK_PANEL");
       }
       return;
    }
    public void l(LiveGzoneTurntablePrize p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableLogger.class, "14")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = this.a("SHOW_LIVE_TURNTABLE_PRIZE_DIALOG");
       uElementPack.params = this.b(p0);
       u1.u0(4, uElementPack, this.g());
       return;
    }
    public void m(String p0,String p1,LiveGzoneTurntableTask p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGzoneTurntableLogger.class, "26")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = this.a("CLICK_DOWNLOAD");
       uElementPack.params = this.e(p0, p1, p2);
       u1.u(1, uElementPack, this.g());
       return;
    }
    public void n(){
       LiveGzoneTurntableLogger liveGzoneTur = LiveGzoneTurntableLogger.class;
       if (PatchProxy.applyVoid(null, this, liveGzoneTur, "20")) {
          return;
       }
       this.j("LIVE_TURNTABLE_PANEL");
       if (!PatchProxy.applyVoid(null, this, liveGzoneTur, "23")) {
          this.j("LIVE_TURNTABLE_RECORD_BUTTON");
       }
       if (!PatchProxy.applyVoid(null, this, liveGzoneTur, "16")) {
          this.j("LIVE_TURNTABLE_GAME_RULE_BUTTON");
       }
       if (!PatchProxy.applyVoid(null, this, liveGzoneTur, "22")) {
          this.j("LIVE_TURNTABLE_OBTAIN_BUTTON");
       }
       return;
    }
    public void o(LiveGzoneTurntablePrize p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableLogger.class, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = this.a("SHOW_LIVE_TURNTABLE_PRIZE_ITEM");
       uElementPack.params = this.b(p0);
       u1.u0(3, uElementPack, this.g());
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableLogger.class, "19")) {
          return;
       }
       if (this.b != null) {
          this.b = false;
          this.j("LIVE_TURNTABLE_BONUS_TASK_PANEL");
       }
       return;
    }
    public void q(boolean p0){
       LiveGzoneTurntableLogger liveGzoneTur = LiveGzoneTurntableLogger.class;
       if (PatchProxy.isSupport(liveGzoneTur) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveGzoneTur, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = "LIVE_TURNTABLE_RESULT";
       uElementPack.action2 = str;
       i3 oi3 = i3.f();
       String str1 = (p0)? "success": "fail";
       oi3.d("result", str1);
       uElementPack.params = oi3.e();
       int i = (p0)? 7: 8;
       h$b uob = h$b.e(i, str);
       uob.h(this.g());
       uob.k(uElementPack);
       u1.r0(uob);
       return;
    }
}
