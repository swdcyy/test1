package com.kwai.video.wayne.player.main.RepresentationProcessor$mOnPreparedListener$1;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.main.RepresentationProcessor;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.wayne.player.main.WaynePlayer;
import java.util.Iterator;
import java.util.Set;
import com.kwai.video.wayne.player.listeners.OnQualityChangeListener;
import com.kwai.video.wayne.player.main._1_AbstractMediaPlayerApiDelegate;
import com.kwai.player.KwaiRepresentation;

public final class RepresentationProcessor$mOnPreparedListener$1 implements IMediaPlayer$OnPreparedListener	// class@000d8f
{
    public final RepresentationProcessor this$0;

    public void RepresentationProcessor$mOnPreparedListener$1(RepresentationProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RepresentationProcessor$mOnPreparedListener$1.class, "1")) {
          return;
       }
       if (this.this$0.isAttach()) {
          RepresentationProcessor$mOnPreparedListener$1 tthis$0 = this.this$0;
          if (tthis$0.mIsSwitching != null) {
             tthis$0.mIsSwitching = false;
             if (tthis$0.getMediaPlayer().isShortManifestSource$kp_mid_release()) {
                Iterator iterator = this.this$0.mOnQualityChangeListeners.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onUserSwitchEnd(this.this$0.mUserRepresentationId);
                }
                tthis$0 = this.this$0;
                tthis$0.mRealRepresentationId = tthis$0.getMediaPlayer().getVodAdaptiveRepID();
                iterator = this.this$0.mOnQualityChangeListeners.iterator();
                while (iterator.hasNext()) {
                   OnQualityChangeListener onQualityCha = iterator.next();
                   RepresentationProcessor$mOnPreparedListener$1 tthis$01 = this.this$0;
                   RepresentationProcessor mRealReprese = tthis$01.mRealRepresentationId;
                   boolean b = (tthis$01.mUserRepresentationId == KwaiRepresentation.AUTO_ID)? true: false;
                   onQualityCha.onRealQualityIdSelect(mRealReprese, b);
                }
             }
          }
       }
       return;
    }
}
