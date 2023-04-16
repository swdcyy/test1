package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import pr1.a;
import oh3.a;
import java.lang.String;
import lq1.c;
import hf3.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel$stateMachineLazy$1;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel$a;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel$c;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel$b;
import com.kuaishou.protobuf.livestream.nano.SCLiveScoreLineChatStatistic;
import java.lang.Class;
import lf3.g;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatState;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Long;
import pr1.g;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.c0;
import com.kuaishou.protobuf.livestream.nano.TargetGiftTabInfo;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeam;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTimeLine;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatVoteEnd;
import f02.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.util.Base64;
import pr1.e;
import java.util.List;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleState;
import pr1.b;
import java.lang.Enum;
import w12.a;
import pr1.f;

public final class LiveMultiLineGiftBattleModel extends a implements a	// class@00156f
{
    public String b;
    public String c;
    public LiveScoreLineChatState d;
    public SCLiveScoreLineChatStatistic e;
    public final p f;
    public final p g;
    public final LiveMultiLineGiftBattleModel$a h;
    public final LiveMultiLineGiftBattleModel$c i;
    public final g j;
    public final c k;
    public final a l;

    public void LiveMultiLineGiftBattleModel(String p0,c p1,a p2){
       a.p(p1, "coreModel");
       a.p(p2, "longConnection");
       super();
       this.k = p1;
       this.l = p2;
       p op = s.c(new LiveMultiLineGiftBattleModel$stateMachineLazy$1(this));
       this.f = op;
       this.g = op;
       LiveMultiLineGiftBattleModel$a uoa = new LiveMultiLineGiftBattleModel$a(this);
       this.h = uoa;
       this.i = new LiveMultiLineGiftBattleModel$c(this);
       LiveMultiLineGiftBattleModel$b uob = new LiveMultiLineGiftBattleModel$b(this);
       this.j = uob;
       p2.u0(1010, SCLiveScoreLineChatStatistic.class, uob);
       p1.O(uoa);
       if (p0 != null) {
          this.c0(p0);
       }
       return;
    }
    public final void S(){
       if (PatchProxy.applyVoid(null, this, LiveMultiLineGiftBattleModel.class, "7")) {
          return;
       }
       this.l.o(1010, this.j);
       this.k.R(this.h);
       this.P();
       return;
    }
    public final Integer T(){
       Object[] objArray = null;
       LiveMultiLineGiftBattleModel obj = PatchProxy.apply(objArray, this, LiveMultiLineGiftBattleModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          objArray = Integer.valueOf(obj.giftId);
       }
       return objArray;
    }
    public final UserInfos$PicUrl[] U(){
       LiveMultiLineGiftBattleModel td = this.d;
       LiveScoreLineChatState headerViewPi = (td != null)? td.headerViewPicUrl: null;
       return headerViewPi;
    }
    public final Long V(){
       Object[] objArray = null;
       LiveMultiLineGiftBattleModel obj = PatchProxy.apply(objArray, this, LiveMultiLineGiftBattleModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          objArray = Long.valueOf(obj.roomOwner);
       }
       return objArray;
    }
    public final Integer W(){
       Object[] objArray = null;
       LiveMultiLineGiftBattleModel obj = PatchProxy.apply(objArray, this, LiveMultiLineGiftBattleModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          objArray = Integer.valueOf(obj.status);
       }
       return objArray;
    }
    public final g X(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLineGiftBattleModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final GiftTab Y(){
       Object[] objArray = null;
       c0 obj = PatchProxy.apply(objArray, this, LiveMultiLineGiftBattleModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c0.a;
       LiveMultiLineGiftBattleModel td = this.d;
       if (td != null) {
          LiveScoreLineChatState targetGiftTa = td.targetGiftTabInfo;
          if (targetGiftTa != null) {
             objArray = targetGiftTa.targetGiftTab;
          }
       }
       return obj.a(objArray);
    }
    public final LiveScoreLineChatTeam[] Z(){
       LiveMultiLineGiftBattleModel td = this.d;
       LiveScoreLineChatState team = (td != null)? td.team: null;
       return team;
    }
    public final LiveScoreLineChatTimeLine a0(){
       LiveMultiLineGiftBattleModel td = this.d;
       LiveScoreLineChatState timeLine = (td != null)? td.timeLine: null;
       return timeLine;
    }
    public final LiveScoreLineChatVoteEnd b0(){
       LiveMultiLineGiftBattleModel td = this.d;
       LiveScoreLineChatState voteEndInfo = (td != null)? td.voteEndInfo: null;
       return voteEndInfo;
    }
    public final void c0(String p0){
       LiveScoreLineChatState liveScoreLin;
       List a;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineGiftBattleModel.class, "8")) {
          return;
       }
       Integer integer = null;
       try{
          liveScoreLin = PatchProxy.applyOneRefs(p0, integer, a.class, "11");
          if (liveScoreLin != PatchProxyResult.class) {
          }else if(!TextUtils.isEmpty(p0)){
             liveScoreLin = LiveScoreLineChatState.parseFrom(Base64.decode(p0, 0));
          }else {
             liveScoreLin = integer;
          }
          this.d = liveScoreLin;
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e5){
          b.y(e.a, "parse extraInfo error", e5);
       }
       a = e.a;
       LiveMultiLineGiftBattleModel td = this.d;
       Long longx = (td != null)? Long.valueOf(td.roomOwner): integer;
       b.S(a, "handleChatModeExtraInfo", "roomOwner", longx);
       td = this.d;
       if (td != null && td.status == null) {
          b.r(a, "status is unknown");
          return;
       }else if(td != null){
          liveScoreLin = td.scoreLineChatId;
       }else {
          liveScoreLin = integer;
       }
       this.c = liveScoreLin;
       StringBuilder str = "liveScoreLineChatStatus is ";
       LiveMultiLineGiftBattleModel td1 = this.d;
       Integer integer1 = (td1 != null)? Integer.valueOf(td1.status): integer;
       b.r(a, str+integer1);
       LiveMultiLineGiftBattleModel td2 = this.d;
       if (td2 != null) {
          integer = Integer.valueOf(td2.status);
       }
       LiveMultiLineGiftBattleState liveMultiLin = 1;
       if (integer != null && integer.intValue() == liveMultiLin) {
          this.d0(LiveMultiLineGiftBattleState.BATTLE);
       }else {
          liveMultiLin = 2;
          if (integer != null && integer.intValue() == liveMultiLin) {
             this.d0(LiveMultiLineGiftBattleState.COMMUNICATE);
          }
       }
       return;
    }
    public final void d0(LiveMultiLineGiftBattleState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineGiftBattleModel.class, "10")) {
          return;
       }
       int i = b.a[p0.ordinal()];
       int i1 = 1;
       if (i != i1) {
          if (i != 2) {
             if (i == 3) {
                this.X().n(2);
             }
          }else {
             this.X().n(i1);
          }
       }else {
          this.X().n(0);
       }
       return;
    }
    public void p(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineGiftBattleModel.class, "12")) {
          return;
       }
       a.p(p0, "observer");
       this.O(p0);
       return;
    }
    public void t(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineGiftBattleModel.class, "13")) {
          return;
       }
       a.p(p0, "observer");
       this.R(p0);
       return;
    }
}
