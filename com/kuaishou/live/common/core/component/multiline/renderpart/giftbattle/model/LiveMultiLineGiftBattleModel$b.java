package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel$b;
import lf3.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCLiveScoreLineChatStatistic;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import pr1.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleState;
import pr1.e;
import java.util.List;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import pr1.c;
import z1.a;
import oh3.a;
import lf3.f;

public final class LiveMultiLineGiftBattleModel$b implements g	// class@00156c
{
    public final LiveMultiLineGiftBattleModel b;

    public void LiveMultiLineGiftBattleModel$b(LiveMultiLineGiftBattleModel p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineGiftBattleModel$b.class, "1")) {
       }else if(p0 == null){
          LiveMultiLineGiftBattleModel$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveMultiLineGiftBattleModel.class, "9")) {
             if (tb.X().i == LiveMultiLineGiftBattleState.COMMUNICATE) {
                b.r(e.a, "vote is end, ignore lineStatisticSignal update");
             }else {
                int i = 1;
                if (a.g(p0.scoreLineChatId, tb.c) ^ i) {
                   b.T(e.a, "scoreLineChatId is not same", "currentChatModeId", tb.c, "scoreLineChatId", p0.scoreLineChatId);
                }else {
                   SCLiveScoreLineChatStatistic team = p0.team;
                   if (team != null) {
                      c uoc = (!team.length)? 1: null;
                      if (!uoc) {
                         i = 0;
                      }
                   }
                   if (i) {
                      b.r(e.a, "team is null");
                   }else {
                      tb.e = p0;
                      tb.Q(new c(p0));
                   }
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
