package com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$d;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lz1.g;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import sz1.m;
import com.kuaishou.live.common.multiinteract.biz.adapter.a;

public final class LiveAudienceMultiInteractManagerImpl$d implements IKwaiMediaPlayer$OnLiveSeiInfoListener	// class@0017f2
{
    public final LiveAudienceMultiInteractManagerImpl a;

    public void LiveAudienceMultiInteractManagerImpl$d(LiveAudienceMultiInteractManagerImpl p0){
       this.a = p0;
       super();
    }
    public final void onSeiInfo(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveAudienceMultiInteractManagerImpl$d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveAudienceMultiInteractManagerImpl$d.class, "1")) {
          return;
       }
       LiveStageProto$LayoutConfig layoutConfig = g.a.b(p0, p1, p2);
       if (layoutConfig != null) {
          this.a.h.U(layoutConfig);
       }
       return;
    }
}
