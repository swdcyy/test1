package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$g;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class AdDanmakuElement$g implements IMediaPlayer$OnPreparedListener	// class@0016fd
{
    public final AdDanmakuElement b;

    public void AdDanmakuElement$g(AdDanmakuElement p0){
       this.b = p0;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDanmakuElement$g.class, "1")) {
          return;
       }
       this.b.C0();
       return;
    }
}
