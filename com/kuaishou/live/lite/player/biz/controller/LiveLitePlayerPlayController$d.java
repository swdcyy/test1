package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$d;
import lf3.g;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.socket.nano.SocketMessages$SCInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.waynelive.LiveRestartReason;
import lf3.f;

public final class LiveLitePlayerPlayController$d implements g	// class@000a91
{
    public final LiveLitePlayerPlayController b;

    public void LiveLitePlayerPlayController$d(LiveLitePlayerPlayController p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayerPlayController$d.class, "1")) {
       }else {
          a.p(p0, "scInfo");
          LiveLitePlayerPlayController$d tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveLitePlayerPlayController.class, "10")) {
             LiveLiteLogTag pLAYER = LiveLiteLogTag.PLAYER;
             pLAYER.appendTag(tb.j);
             b.T(pLAYER, "handleSCInfo", "code", Integer.valueOf(p0.code), "msg", p0.msg);
             if (p0.code == 6111) {
                pLAYER.appendTag(tb.j);
                b.P(pLAYER, "restartPlay ANCHOR_FALL_BACK");
                tb.z.setPlayerReleaseReason(13);
                tb.z.restartPlay(LiveRestartReason.ANCHOR_FALL_BACK);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
