package com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$d;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$d$a;
import java.lang.Runnable;
import ekd.k1;

public final class LiveLiteMultiChatModel$d implements IKwaiMediaPlayer$OnLiveInterActiveListener	// class@001d7a
{
    public final LiveLiteMultiChatModel b;

    public void LiveLiteMultiChatModel$d(LiveLiteMultiChatModel p0){
       this.b = p0;
       super();
    }
    public void onParseAdSei(long p0,int p1,String p2){
    }
    public void onTsptInfo(byte[] p0,int p1){
       if (PatchProxy.isSupport(LiveLiteMultiChatModel$d.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveLiteMultiChatModel$d.class, "1")) {
          return;
       }
       k1.p(new LiveLiteMultiChatModel$d$a(this, p0), this.b);
       return;
    }
    public void onVideoFrameRender(long p0){
    }
}
