package com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$f;
import lf3.g;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveLocalLifeExplainCardSignal;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.locallife.stat.LocalLifeStatLogger$MessageData;
import java.util.Objects;
import com.kuaishou.live.locallife.stat.LocalLifeStatLogger;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.locallife.log.biz.LocalLifeLiveLogBiz;
import mr3.b;
import java.util.Map;
import java.lang.Throwable;
import lr3.b;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage$a;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import p91.m;
import gf3.a;
import java.lang.Integer;
import com.google.common.collect.ImmutableMap;
import kotlin.jvm.internal.a;
import lf3.f;

public final class BaseLiveLocalLifeExplainPresenter$f implements g	// class@000c44
{
    public final BaseLiveLocalLifeExplainPresenter b;

    public void BaseLiveLocalLifeExplainPresenter$f(BaseLiveLocalLifeExplainPresenter p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       BaseLiveLocalLifeExplainPresenter$f tb1;
       BaseLiveLocalLifeExplainPresenter v;
       ImmutableMap immutableMap;
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveLocalLifeExplainPresenter$f.class, "1")) {
       }else {
          LocalLifeStatLogger$MessageData messageData = new LocalLifeStatLogger$MessageData();
          BaseLiveLocalLifeExplainPresenter$f tb = this.b;
          Objects.requireNonNull(tb);
          String str = "BaseLiveLocalLifeExplainPresenter";
          LiveSceneType liveSceneTyp = null;
          if (!PatchProxy.applyVoidTwoRefs(p0, messageData, tb, BaseLiveLocalLifeExplainPresenter.class, "26")) {
             messageData.receiveTimePeriod = tb.O.calculatePeriodTime();
             if (p0 != null) {
                SCLiveLocalLifeExplainCardSignal signalType = p0.signalType;
                if (signalType == 1) {
                   messageData.signalType = "show";
                }else if(signalType == 2){
                   messageData.signalType = "empty";
                }else {
                   messageData.signalType = "hide";
                }
                try{
                   messageData.messageContent = a.a.q(p0);
                }catch(java.lang.Exception e2){
                   b.h(LocalLifeLiveLogBiz.LIVE_ROOM, str, "parse explain message error", liveSceneTyp, e2);
                }
             }
          }
          if (p0 == null || !this.b.V8()) {
             b.c(LocalLifeLiveLogBiz.LIVE_ROOM, str, "can not show explain");
          }else {
             LocalLifeLiveExplainMessage localLifeLiv = LocalLifeLiveExplainMessage.Companion.a(p0);
             if (localLifeLiv != null) {
                if (this.b.d9(localLifeLiv)) {
                   messageData.completeActionTimePeriod = this.b.O.calculatePeriodTime();
                   tb1 = this.b;
                   v = tb1.v;
                   if (v != null) {
                      liveSceneTyp = v.u5();
                   }
                   immutableMap = ImmutableMap.of("scene", Integer.valueOf(a.b(liveSceneTyp)));
                   a.o(immutableMap, "ImmutableMap.of\(\"scene\",\x20\x02mLiveContext?.sceneType\)\)\x00");
                   tb1.k9("ExplainCardHide", immutableMap);
                }else {
                   this.b.n9(localLifeLiv);
                   if (!localLifeLiv.getMQueryApiType()) {
                      this.b.l9();
                   }else {
                      this.b.W8();
                   }
                   messageData.completeActionTimePeriod = this.b.O.calculatePeriodTime();
                   tb1 = this.b;
                   v = tb1.v;
                   if (v != null) {
                      liveSceneTyp = v.u5();
                   }
                   immutableMap = ImmutableMap.of("scene", Integer.valueOf(a.b(liveSceneTyp)), "data", a.a.q(this.b.X8()));
                   a.o(immutableMap, "ImmutableMap.of\(\n       ¡­plainMessage\(\)\)\n        \)");
                   tb1.k9("ReceiveExplainCardSignal", immutableMap);
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
