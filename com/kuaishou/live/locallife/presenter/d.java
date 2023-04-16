package com.kuaishou.live.locallife.presenter.d;
import lf3.g;
import com.kuaishou.live.locallife.presenter.f;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.locallife.presenter.c;
import ff3.k;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.locallife.log.biz.LocalLifeLiveLogBiz;
import mr3.b;
import lr3.b;
import com.kuaishou.live.locallife.stat.LocalLifeStatLogger$MessageData;
import com.kuaishou.live.locallife.stat.LocalLifeStatLogger;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.live.locallife.model.LocalLifeLiveIconMessage;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import tkd.b;
import tkd.d;
import xx5.d;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Map;
import java.lang.Throwable;
import tj3.k;
import tj3.e;
import com.google.common.collect.ImmutableMap;
import lf3.f;

public final class d implements g	// class@000c4c
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       int i;
       int i1;
       f uof1;
       String str1;
       long l;
       d tb = this.b;
       Objects.requireNonNull(tb);
       f uof = f.class;
       LocalLifeStatLogger$MessageData obj = PatchProxy.applyOneRefs(p0, tb, uof, "13");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): k0.b(p0, c.a, new k(p0)).or(Boolean.FALSE).booleanValue();
       String str = "LiveAudienceLocalLifeBottomBarPresenter";
       if (b) {
          b.f(LocalLifeLiveLogBiz.LIVE_ROOM, str, "message button error");
       }else {
          obj = new LocalLifeStatLogger$MessageData();
          if (!PatchProxy.applyVoidTwoRefs(p0, obj, tb, uof, "17")) {
             obj.receiveTimePeriod = tb.W0.calculatePeriodTime();
             if (p0 != null) {
                obj.signalType = (p0.signalType == null)? "show": "hide";
                try{
                   obj.messageContent = a.a.q(p0);
                }catch(java.lang.Exception e0){
                   b.f(LocalLifeLiveLogBiz.LIVE_ROOM, str, "parse message content error");
                }
             }
          }
       }
    label_01a4 :
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
