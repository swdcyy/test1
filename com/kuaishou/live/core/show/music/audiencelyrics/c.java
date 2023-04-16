package com.kuaishou.live.core.show.music.audiencelyrics.c;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import com.kuaishou.live.core.show.music.audiencelyrics.d;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvSyncLyricsMessage;
import java.lang.String;
import java.lang.StringBuilder;
import com.google.protobuf.nano.MessageNano;
import z12.e;
import qc2.d;
import java.lang.Runnable;
import android.os.Handler;
import qc2.c;
import qc2.g;
import java.io.IOException;

public final class c implements LivePlayerEventListener	// class@000d2e
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void onLiveEventChange(byte[] p0){
       int i;
       c tb = this.b;
       Objects.requireNonNull(tb);
       try{
          i = 0;
          LiveFlvStream$LiveFlvStreamMessage liveFlvStrea = LiveFlvStream$LiveFlvStreamMessage.parseFrom(p0);
          if (liveFlvStrea != null) {
             g og = 2;
             if (liveFlvStrea.messageType == og) {
                LiveFlvStream$LiveFlvStreamMessage syncLyrics = liveFlvStrea.syncLyrics;
                if (syncLyrics != null && syncLyrics.syncLyricsType == og) {
                   String[] stringArray1 = new String[1];
                   stringArray1[i] = "message: "+liveFlvStrea.toString();
                   e.c(d.V, "onLiveEventChange:", stringArray1);
                   LiveFlvStream$LiveFlvSyncLyricsMessage syncState = liveFlvStrea.syncLyrics.syncState;
                   if (syncState != 1) {
                      if (syncState != og) {
                         if (syncState == 3) {
                            tb.F.post(new d(tb));
                         }
                      }else {
                         tb.F.post(new c(tb));
                      }
                   }else {
                      tb.F.post(new g(tb, liveFlvStrea));
                   }
                }
             }
          }
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e10){
          e10.printStackTrace();
          String[] stringArray = new String[i];
          e.b(d.V, "LiveFlvStreamMessage parseFrom exception!!!", stringArray);
       }
       return;
    }
}
