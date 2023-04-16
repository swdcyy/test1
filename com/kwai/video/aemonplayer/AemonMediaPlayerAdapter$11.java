package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$11;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnBizInfoListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.aemonplayer.JavaAttrList;
import java.lang.Integer;
import com.kwai.video.hodor.util.Timber;
import com.kwai.video.player.IMediaPlayer$OnLiveEventListener;
import java.lang.Long;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnLiveVoiceCommentListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSrvTsptInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import java.util.List;
import com.kwai.video.aemonplayer.AemonMediaPlayer;
import java.nio.ByteBuffer;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import com.kwai.video.player.IMediaPlayer$OnVideoRawDataListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveExtraInfoListener;
import com.kwai.video.player.AbstractMediaPlayer;

public class AemonMediaPlayerAdapter$11 implements AemonMediaPlayerListener$OnBizInfoListener	// class@00199c
{
    public final AemonMediaPlayerAdapter this$0;

    public void AemonMediaPlayerAdapter$11(AemonMediaPlayerAdapter p0){
       this.this$0 = p0;
       super();
    }
    public void onBizInfo(Message p0){
       AemonMediaPlayerAdapter$11 tthis$0;
       Message arg1;
       byte[] uobyteArray;
       AemonMediaPlayerAdapter mOnLiveEvent;
       long l;
       AemonMediaPlayerAdapter mOnLiveVoice;
       int i4;
       int i5;
       AemonMediaPlayerAdapter$11 tthis$03;
       int i8;
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter$11.class, "1")) {
          return;
       }
       Message what = p0.what;
       String str = 5;
       if (what != str) {
          if (what != 0x2711) {
             if (what != 0x277b) {
                if (what != 0x32cc) {
                   int i = 2;
                   int b = true;
                   if (what != 0x3a98) {
                      if (what != 300) {
                         if (what != 301) {
                            switch (what){
                                case 0x2ee1:
                                  this.this$0.notifyRepresentationChangeStart(p0.arg1, p0.arg2, false);
                                  break;
                                case 0x2ee2:
                                  tthis$0 = this.this$0;
                                  arg1 = p0.arg1;
                                  if (p0.arg2 == null) {
                                     b = false;
                                  }
                                  tthis$0.notifyRepresentationChangeEnd(arg1, b);
                                  break;
                                case 0x2ee3:
                                  tthis$0 = this.this$0;
                                  arg1 = p0.arg1;
                                  if (p0.arg2 == null) {
                                     b = false;
                                  }
                                  tthis$0.notifyRepresentationSelected(arg1, b);
                                  break;
                                default:
                            }
                         }else {
                            p0 = p0.obj;
                            if (p0 != null) {
                               uobyteArray = p0.GetByteBufferValue("content");
                               Object[] objArray = new Object[b];
                               objArray[0] = Integer.valueOf(uobyteArray.length);
                               Timber.i("MEDIA_LIVE_EVENT, live_event_content: %d", objArray);
                               mOnLiveEvent = this.this$0.mOnLiveEventListener;
                               if (mOnLiveEvent != null) {
                                  mOnLiveEvent.onLiveEventChange(uobyteArray);
                               }
                            }
                         }
                      }else {
                         l = ((long)p0.arg1 << 32) | (long)p0.arg2;
                         String kwaiLiveVoic = this.this$0.getKwaiLiveVoiceComment(l);
                         Object[] objArray1 = new Object[i];
                         objArray1[0] = Long.valueOf(l);
                         objArray1[b] = kwaiLiveVoic;
                         Timber.i("MEDIA_LIVE_VC_TIME, vc_time:%d, voice_comment:%s", objArray1);
                         tthis$0 = this.this$0;
                         mOnLiveVoice = tthis$0.mOnLiveVoiceCommentListener;
                         if (mOnLiveVoice != null) {
                            mOnLiveVoice.onLiveVoiceCommentChange(tthis$0, kwaiLiveVoic);
                         }
                      }
                   }else {
                      what = p0.arg1;
                      if (what == b) {
                         mOnLiveEvent = this.this$0.mOnLiveInterActiveListener;
                         if (mOnLiveEvent != null) {
                            p0 = p0.obj;
                            if (p0 != null) {
                               uobyteArray = p0.GetByteBufferValue("tspt_buf");
                               mOnLiveEvent.onTsptInfo(uobyteArray, uobyteArray.length);
                            }
                         }
                      }else {
                         String str1 = "pts";
                         if (what == i) {
                            mOnLiveEvent = this.this$0.mOnLiveInterActiveListener;
                            if (mOnLiveEvent != null) {
                               p0 = p0.obj;
                               if (p0 != null) {
                                  mOnLiveEvent.onVideoFrameRender(p0.GetLongValue(str1));
                               }
                            }
                         }else if(what == 3){
                            mOnLiveEvent = this.this$0.mOnLiveInterActiveListener;
                            if (mOnLiveEvent != null) {
                               p0 = p0.obj;
                               if (p0 != null) {
                                  mOnLiveEvent.onParseAdSei(p0.GetLongValue(str1), p0.GetIntValue("method"), p0.GetStringValue("json"));
                               }
                            }
                         }else if(what == 4){
                            mOnLiveEvent = this.this$0.onLiveSrvTsptInfoListener;
                            if (mOnLiveEvent != null) {
                               p0 = p0.obj;
                               if (p0 != null) {
                                  uobyteArray = p0.GetByteBufferValue("srvtspt_buf");
                                  mOnLiveEvent.onSrvTsptInfo(uobyteArray, uobyteArray.length);
                               }
                            }
                         }else if(what == str){
                            mOnLiveEvent = this.this$0.mOnLiveSeiInfoListener;
                            if (mOnLiveEvent != null) {
                               p0 = p0.obj;
                               if (p0 != null) {
                                  byte[] uobyteArray1 = p0.GetByteBufferValue("seiinfo_buf");
                                  mOnLiveEvent.onSeiInfo(uobyteArray1, uobyteArray1.length, p0.GetIntValue("payload_type"));
                               }
                            }
                         }else if(what == 6){
                            Object obj = p0.obj.GetObjectValue("video_reps");
                            AemonMediaPlayerAdapter$11 tthis$01 = this.this$0;
                            if (tthis$01.mKwaiRepresentationListener != null && p0.obj != null) {
                               this.this$0.mAemonMediaPlayer.setPropertyInt(0x9c72, tthis$01.notifyOnSelectRepresentation(obj));
                            }
                         }else if(what == 7){
                            p0 = p0.obj;
                            l = p0.GetLongValue(str1);
                            int i1 = p0.GetIntValue("channels");
                            int i2 = p0.GetIntValue("sample_rate");
                            int i3 = p0.GetIntValue("fmt");
                            float f = p0.GetFloatValue("latency");
                            AemonMediaPlayerAdapter$11 tthis$02 = this.this$0;
                            AemonMediaPlayerAdapter mOnAudioProc = tthis$02.mOnAudioProcessPCMListener;
                            if (mOnAudioProc != null) {
                               mOnAudioProc.onAudioProcessPCMAvailable(tthis$02, tthis$02.mProcessPCMBuffer, (l / 1000), i1, i2, i3, (double)f);
                            }
                         }else if(what == 8){
                            p0 = p0.obj;
                            p0.GetLongValue("v-ready-pts");
                            b = p0.GetIntValue("v-ready-size");
                            i4 = p0.GetIntValue("v-ready-width");
                            i5 = p0.GetIntValue("v-ready-height");
                            int i6 = p0.GetIntValue("v-ready-format");
                            tthis$03 = this.this$0;
                            mOnLiveVoice = tthis$03.mOnVideoRawDataListener;
                            if (mOnLiveVoice != null) {
                               mOnLiveVoice.onVideoRawDataAvailable(tthis$03, tthis$03.mVideoRawBuffer, b, i4, i5, i6);
                            }
                         }else if(what == 9){
                            p0 = p0.obj;
                            b = p0.GetIntValue("v-raw-width");
                            i4 = p0.GetIntValue("v-raw-height");
                            i = p0.GetIntValue("v-raw-size");
                            i5 = p0.GetIntValue("pixelBufferBytesPerRowAlignment");
                            tthis$03 = this.this$0;
                            mOnLiveVoice = tthis$03.mOnVideoRawDataListener;
                            if (mOnLiveVoice != null) {
                               mOnLiveVoice.onVideoRawDataSize(tthis$03, i, b, i4, i5);
                            }
                         }else if(what == 10){
                            p0 = p0.obj;
                            int i7 = p0.GetIntValue("callback-width");
                            i8 = p0.GetIntValue("callback-height");
                            mOnLiveVoice = this.this$0.mOnLiveExtraInfoListener;
                            if (mOnLiveVoice != null) {
                               mOnLiveVoice.onVideoSizeChangeExtra(i7, i8);
                            }
                         }else if(what == 11){
                            i8 = p0.obj.GetIntValue("callback-live-type");
                            mOnLiveEvent = this.this$0.mOnLiveExtraInfoListener;
                            if (mOnLiveEvent != null) {
                               mOnLiveEvent.onLiveTypeChangeExtra(i8);
                            }
                         }
                      }
                      return;
                   }
                }else {
                   this.this$0.notifySubtitleStateChangeEnd(p0.arg1, p0.arg2);
                }
             }else {
                this.this$0.notifyABLoopEndOfCounter();
             }
          }else {
             tthis$0 = this.this$0;
             arg1 = p0.arg1;
             tthis$0.mVideoSarNum = arg1;
             p0 = p0.arg2;
             tthis$0.mVideoSarDen = p0;
             tthis$0.notifyOnVideoSizeChanged(tthis$0.mVideoWidth, tthis$0.mVideoHeight, arg1, p0);
          }
          return;
       }else {
          tthis$0 = this.this$0;
          arg1 = p0.arg2;
          tthis$0.mVideoHeight = arg1;
          tthis$0.mVideoWidth = (tthis$0.mIsLive != null && tthis$0.mIsVR != null)? (int)((double)arg1 * 0x3fe2000000000000): p0.arg1;
          tthis$0.notifyOnVideoSizeChanged(tthis$0.mVideoWidth, arg1, tthis$0.mVideoSarNum, tthis$0.mVideoSarDen);
          AemonMediaPlayerAdapter$11 tthis$04 = this.this$0;
          tthis$04.resizeVideo(tthis$04.mVideoWidth, tthis$04.mVideoHeight);
          return;
       }
    }
}
