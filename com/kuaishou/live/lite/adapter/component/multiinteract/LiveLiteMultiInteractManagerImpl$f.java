package com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$f;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lz1.g;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import sz1.m;
import com.kuaishou.live.common.multiinteract.biz.adapter.a;

public final class LiveLiteMultiInteractManagerImpl$f implements IKwaiMediaPlayer$OnLiveSeiInfoListener	// class@001dfd
{
    public final LiveLiteMultiInteractManagerImpl a;

    public void LiveLiteMultiInteractManagerImpl$f(LiveLiteMultiInteractManagerImpl p0){
       this.a = p0;
       super();
    }
    public final void onSeiInfo(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveLiteMultiInteractManagerImpl$f.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveLiteMultiInteractManagerImpl$f.class, "1")) {
          return;
       }
       LiveStageProto$LayoutConfig layoutConfig = g.a.b(p0, p1, p2);
       if (layoutConfig != null) {
          this.a.h.U(layoutConfig);
       }
       return;
    }
}
