package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$g;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class DanmakuElement$g implements IMediaPlayer$OnPreparedListener	// class@0013df
{
    public final DanmakuElement b;

    public void DanmakuElement$g(DanmakuElement p0){
       this.b = p0;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuElement$g.class, "1")) {
          return;
       }
       this.b.E0();
       return;
    }
}
