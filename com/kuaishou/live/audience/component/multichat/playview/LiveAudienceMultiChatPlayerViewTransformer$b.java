package com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer$b;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import aq5.d;
import fe3.a;
import mrd.a;

public final class LiveAudienceMultiChatPlayerViewTransformer$b implements IMediaPlayer$OnVideoSizeChangedListener	// class@000ba6
{
    public final LiveAudienceMultiChatPlayerViewTransformer b;

    public void LiveAudienceMultiChatPlayerViewTransformer$b(LiveAudienceMultiChatPlayerViewTransformer p0){
       this.b = p0;
       super();
    }
    public final void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveAudienceMultiChatPlayerViewTransformer$b.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiChatPlayerViewTransformer$b.class, "1")) {
             return;
          }
       }
       if (this.b.r.r2(AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW)) {
          Object[] objArray1 = new Object[]{"width",Integer.valueOf(p1),"height",Integer.valueOf(p2)};
          this.b.j("video size changed", objArray1);
          this.b.d.onNext(new a(p1, p2));
       }
       return;
    }
}
