package com.kuaishou.live.core.show.quiz.manager.g;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveQuiz2SyncMessage;
import dg2.g;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class g implements LivePlayerEventListener	// class@000e15
{
    public final j b;

    public void g(j p0){
       this.b = p0;
    }
    public final void onLiveEventChange(byte[] p0){
       g tb = this.b;
       if (tb.f == null) {
       }else {
          try{
             LiveFlvStream$LiveFlvStreamMessage liveFlvStrea = LiveFlvStream$LiveFlvStreamMessage.parseFrom(p0);
             if (liveFlvStrea != null && liveFlvStrea.messageType == 5) {
                LiveFlvStream$LiveFlvStreamMessage quiz2Sync = liveFlvStrea.quiz2Sync;
                if (quiz2Sync != null && quiz2Sync.syncMessageType != null) {
                   k1.p(new g(tb, liveFlvStrea), "LiveQuizAudienceManager");
                }
             }
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e5){
             b.y(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager"), "initAacEventListener failed", e5);
          }
       }
    }
}
