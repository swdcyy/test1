package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$InfoListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.waynelive.debug.Logger;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.util.Iterator;
import java.util.List;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.listeners.LivePlayerKwaivppListener;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import com.kwai.video.waynelive.listeners.LivePlayerRenderAfterBufferStartListener;
import com.kwai.video.waynelive.wayneplayer.StaticsProcessor;
import com.kwai.video.player.IKwaiMediaPlayer;

public class WayneLivePlayer$InfoListener implements IMediaPlayer$OnInfoListener	// class@000e47
{
    public final WayneLivePlayer this$0;

    public void WayneLivePlayer$InfoListener(WayneLivePlayer p0){
       this.this$0 = p0;
       super();
    }
    public void WayneLivePlayer$InfoListener(WayneLivePlayer p0,WayneLivePlayer$1 p1){
       super(p0);
    }
    public final void handlePkStreamTypeChange(int p0){
       WayneLivePlayer$InfoListener infoListener = WayneLivePlayer$InfoListener.class;
       if (PatchProxy.isSupport(infoListener) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, infoListener, "2")) {
          return;
       }
       if (!p0 || p0 == -1) {
          this.this$0.mLogger.i("liveStreamTypeChange clear mSeiTempBizCache");
          this.this$0.mPkSeiCache = null;
       }
       infoListener = this.this$0;
       infoListener.mPkLiveStreamTypeCache = p0;
       LivePlayerStatusMonitorImpl mPkStreamTyp = infoListener.mPkStreamTypeChangeListener;
       if (mPkStreamTyp != null) {
          mPkStreamTyp.onLiveTypeChange(p0);
       }
       return;
    }
    public boolean onInfo(IMediaPlayer p0,int p1,int p2){
       WayneLivePlayer$InfoListener tthis$0;
       WayneLivePlayer mPlayTexture;
       Iterator iterator;
       if (PatchProxy.isSupport(WayneLivePlayer$InfoListener.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, WayneLivePlayer$InfoListener.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       DebugLog.i(this.this$0.getTag(), "mediaPlayer onInfo what "+p1+" extra "+p2);
       StringBuilder str = 1;
       if (p1 != 3) {
          if (p1 != 0x2712) {
             if (p1 != 0x2776) {
                if (p1 != 0x2778) {
                   if (p1 != 0x2780) {
                      if (p1 != 701) {
                         if (p1 != 702) {
                            if (p1 != 0x277c) {
                               if (p1 == 0x277d) {
                                  tthis$0 = this.this$0;
                                  if (tthis$0.mLiveMediaPlayer != null) {
                                     mPlayTexture = tthis$0.mPlayTextureView;
                                     if (mPlayTexture != null) {
                                        mPlayTexture.e();
                                     }
                                     iterator = this.this$0.mRenderListenerList.iterator();
                                     while (iterator.hasNext()) {
                                        iterator.next().onRenderingStartAfterResume();
                                     }
                                     DebugLog.i(this.this$0.getTag(), "medialPlayer onInfo video render after resume");
                                  }
                               }
                            }else {
                               DebugLog.i(this.this$0.getTag(), "kwaivpp apply success requestId"+p2);
                               tthis$0 = this.this$0;
                               tthis$0.mLatestKwaiVppRequestId = p2;
                               iterator = tthis$0.mKwaivppListeners.iterator();
                               while (iterator.hasNext()) {
                                  iterator.next().onApplySuccess(p2);
                               }
                            }
                         }else {
                            tthis$0 = this.this$0;
                            tthis$0.mIsBuffering = false;
                            iterator = tthis$0.mLivePlayerBufferListenerList.iterator();
                            while (iterator.hasNext()) {
                               iterator.next().onBufferEnd();
                            }
                         }
                      }else {
                         DebugLog.i(this.this$0.getTag(), "buffering start");
                         tthis$0 = this.this$0;
                         tthis$0.mIsBuffering = str;
                         iterator = tthis$0.mLivePlayerBufferListenerList.iterator();
                         while (iterator.hasNext()) {
                            iterator.next().onBufferStart();
                         }
                      }
                   }else {
                      DebugLog.i(this.this$0.getTag(), "mediaPlayer video rending start after buffer");
                      iterator = this.this$0.mRenderAfterBufferStartList.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().onVideoRenderingStartAfterBuffering();
                      }
                   }
                }else {
                   iterator = this.this$0.mRenderListenerList.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().onSwitchToVideoStreamFromAudioStream();
                   }
                   DebugLog.i(this.this$0.getTag(), "medialPlayer onInfo reload video render start");
                }
             }else {
                p0.mCurrentLiveStreamType = p2;
                this.handlePkStreamTypeChange(p2);
                iterator = this.this$0.mLivePlayerTypeChangeListenerList.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onLiveTypeChange(this.this$0.mCurrentLiveStreamType);
                }
                DebugLog.i(this.this$0.getTag(), "medialPlayer onInfo liveType changedmCurrentLiveType "+this.this$0.mCurrentLiveStreamType);
             }
          }else {
             iterator = this.this$0.mRenderListenerList.iterator();
             while (iterator.hasNext()) {
                iterator.next().onAudioRenderingStart();
             }
          }
       }else {
          tthis$0 = this.this$0;
          if (tthis$0.mLiveMediaPlayer != null) {
             mPlayTexture = tthis$0.mPlayTextureView;
             if (mPlayTexture != null) {
                mPlayTexture.e();
             }
             this.this$0.getProcessor(StaticsProcessor.class).onRenderStart();
             tthis$0 = this.this$0;
             if (tthis$0.mIsInAudioOnlyMode != null && tthis$0.isSupportAudioOnlyMode()) {
                this.this$0.mLiveMediaPlayer.audioOnly(str);
                iterator = this.this$0.mRenderListenerList.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onSwitchToAudioStreamFromVideoStream();
                }
                DebugLog.i(this.this$0.getTag(), "medialPlayer onInfo video render start, start audioOnlyMode");
             }else {
                iterator = this.this$0.mRenderListenerList.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onVideoRenderingStart();
                }
                tthis$0 = this.this$0;
                tthis$0.mIsVideoRenderingStarted = str;
                tthis$0.tryCallOnLivePlayViewShow();
                DebugLog.i(this.this$0.getTag(), "medialPlayer onInfo video render start");
             }
          }
       }
       DebugLog.i(this.this$0.getTag(), "mediaPlayer onInfo what "+p1+" extra "+p2);
       return false;
    }
}
