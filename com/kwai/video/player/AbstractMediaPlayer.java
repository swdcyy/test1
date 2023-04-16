package com.kwai.video.player.AbstractMediaPlayer;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import java.lang.StringBuilder;
import com.kwai.video.player.pragma.DebugLog;
import com.kwai.video.player.IMediaPlayer$OnDecodeFirstFrameListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.hodor.util.Timber;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.IMediaPlayer$OnFftDataCaptureListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.OnInfoExtra;
import com.kwai.video.player.IMediaPlayer$OnInfoExtraListener;
import com.kwai.video.player.IMediaPlayer$OnLogEventListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.IMediaPlayer$OnRenderingStartListener;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.player.misc.IMediaDataSource;
import java.lang.UnsupportedOperationException;

public abstract class AbstractMediaPlayer implements IMediaPlayer	// class@000aa3
{
    public IMediaPlayer$OnBufferingUpdateListener mOnBufferingUpdateListener;
    public IMediaPlayer$OnCompletionListener mOnCompletionListener;
    public IMediaPlayer$OnDecodeFirstFrameListener mOnDecodeFirstFrameListener;
    public IMediaPlayer$OnErrorListener mOnErrorListener;
    public IMediaPlayer$OnFftDataCaptureListener mOnFftDataCaptureListener;
    public IMediaPlayer$OnInfoExtraListener mOnInfoExtraListener;
    public IMediaPlayer$OnInfoListener mOnInfoListener;
    public IMediaPlayer$OnLogEventListener mOnLogEventListener;
    public IMediaPlayer$OnPreparedListener mOnPreparedListener;
    public IMediaPlayer$OnRenderingStartListener mOnRenderingStartListener;
    public IMediaPlayer$OnSeekCompleteListener mOnSeekCompleteListener;
    public IMediaPlayer$OnVideoSizeChangedListener mOnVideoSizeChangedListener;

    public void AbstractMediaPlayer(){
       super();
    }
    public final void notifyOnBufferingUpdate(int p0){
       AbstractMediaPlayer uAbstractMed = AbstractMediaPlayer.class;
       if (PatchProxy.isSupport(uAbstractMed) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAbstractMed, "3")) {
          return;
       }
       uAbstractMed = this.mOnBufferingUpdateListener;
       if (uAbstractMed != null) {
          uAbstractMed.onBufferingUpdate(this, p0);
       }
       return;
    }
    public final void notifyOnCompletion(){
       if (PatchProxy.applyVoid(null, this, AbstractMediaPlayer.class, "2")) {
          return;
       }
       AbstractMediaPlayer tmOnCompleti = this.mOnCompletionListener;
       if (tmOnCompleti != null) {
          tmOnCompleti.onCompletion(this);
       }
       return;
    }
    public final void notifyOnDecodeFirstFrame(int p0,int p1){
       AbstractMediaPlayer uAbstractMed = AbstractMediaPlayer.class;
       if (PatchProxy.isSupport(uAbstractMed) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAbstractMed, "10")) {
          return;
       }
       DebugLog.i("AbstractMediaPlayer", "notifyOnDecodeFirstFrame var1:"+p0+" var2: "+p1);
       uAbstractMed = this.mOnDecodeFirstFrameListener;
       if (uAbstractMed != null) {
          uAbstractMed.onDecodeFirstFrame(this, p0, p1);
       }
       return;
    }
    public final boolean notifyOnError(int p0,int p1){
       Object[] obj;
       AbstractMediaPlayer uAbstractMed = AbstractMediaPlayer.class;
       if (PatchProxy.isSupport(uAbstractMed)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAbstractMed, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1)};
       int i = 0;
       Timber.d("notifyOnError, what:%d, extra:%d", obj);
       uAbstractMed = this.mOnErrorListener;
       if (uAbstractMed != null && uAbstractMed.onError(this, p0, p1)) {
          i = true;
       }
       return i;
    }
    public final void notifyOnFftDataCapture(float[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractMediaPlayer.class, "12")) {
          return;
       }
       AbstractMediaPlayer tmOnFftDataC = this.mOnFftDataCaptureListener;
       if (tmOnFftDataC != null) {
          tmOnFftDataC.onFftDataCapture(p0);
       }
       return;
    }
    public final boolean notifyOnInfo(int p0,int p1){
       AbstractMediaPlayer uAbstractMed = AbstractMediaPlayer.class;
       if (PatchProxy.isSupport(uAbstractMed)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAbstractMed, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       DebugLog.i("AbstractMediaPlayer", "notifyOnInfo var1:"+p0+" var2: "+p1);
       uAbstractMed = this.mOnInfoListener;
       boolean b = (uAbstractMed != null && uAbstractMed.onInfo(this, p0, p1))? true: false;
       return b;
    }
    public final boolean notifyOnInfoExtra(int p0,OnInfoExtra p1){
       AbstractMediaPlayer uAbstractMed = AbstractMediaPlayer.class;
       if (PatchProxy.isSupport(uAbstractMed)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uAbstractMed, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uAbstractMed = this.mOnInfoExtraListener;
       boolean b = (uAbstractMed != null && uAbstractMed.OnInfoExtra(this, p0, p1))? true: false;
       return b;
    }
    public final void notifyOnLogEvent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractMediaPlayer.class, "11")) {
          return;
       }
       AbstractMediaPlayer tmOnLogEvent = this.mOnLogEventListener;
       if (tmOnLogEvent != null) {
          tmOnLogEvent.onLogEvent(this, p0);
       }
       return;
    }
    public final void notifyOnPrepared(){
       if (PatchProxy.applyVoid(null, this, AbstractMediaPlayer.class, "1")) {
          return;
       }
       AbstractMediaPlayer tmOnPrepared = this.mOnPreparedListener;
       if (tmOnPrepared != null) {
          tmOnPrepared.onPrepared(this);
       }
       return;
    }
    public final void notifyOnRenderingStart(int p0,int p1){
       AbstractMediaPlayer uAbstractMed = AbstractMediaPlayer.class;
       if (PatchProxy.isSupport(uAbstractMed) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAbstractMed, "9")) {
          return;
       }
       DebugLog.i("AbstractMediaPlayer", "notifyOnRenderingStart var1:"+p0+" var2: "+p1);
       uAbstractMed = this.mOnRenderingStartListener;
       if (uAbstractMed != null) {
          uAbstractMed.onRenderingStart(this, p0, p1);
       }
       return;
    }
    public final void notifyOnSeekComplete(){
       if (PatchProxy.applyVoid(null, this, AbstractMediaPlayer.class, "4")) {
          return;
       }
       AbstractMediaPlayer tmOnSeekComp = this.mOnSeekCompleteListener;
       if (tmOnSeekComp != null) {
          tmOnSeekComp.onSeekComplete(this);
       }
       return;
    }
    public final void notifyOnVideoSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(AbstractMediaPlayer.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, AbstractMediaPlayer.class, "5")) {
          return;
       }
       AbstractMediaPlayer tmOnVideoSiz = this.mOnVideoSizeChangedListener;
       if (tmOnVideoSiz != null) {
          tmOnVideoSiz.onVideoSizeChanged(this, p0, p1, p2, p3);
       }
       return;
    }
    public void resetListeners(){
       this.mOnPreparedListener = null;
       this.mOnBufferingUpdateListener = null;
       this.mOnCompletionListener = null;
       this.mOnSeekCompleteListener = null;
       this.mOnVideoSizeChangedListener = null;
       this.mOnErrorListener = null;
       this.mOnInfoListener = null;
       this.mOnRenderingStartListener = null;
       this.mOnDecodeFirstFrameListener = null;
       this.mOnLogEventListener = null;
       this.mOnFftDataCaptureListener = null;
    }
    public void setDataSource(IMediaDataSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractMediaPlayer.class, "13")) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public final void setOnBufferingUpdateListener(IMediaPlayer$OnBufferingUpdateListener p0){
       this.mOnBufferingUpdateListener = p0;
    }
    public final void setOnCompletionListener(IMediaPlayer$OnCompletionListener p0){
       this.mOnCompletionListener = p0;
    }
    public final void setOnDecodeFirstFrameListener(IMediaPlayer$OnDecodeFirstFrameListener p0){
       this.mOnDecodeFirstFrameListener = p0;
    }
    public final void setOnErrorListener(IMediaPlayer$OnErrorListener p0){
       this.mOnErrorListener = p0;
    }
    public final void setOnFftDataCaptureListener(IMediaPlayer$OnFftDataCaptureListener p0){
       this.mOnFftDataCaptureListener = p0;
    }
    public final void setOnInfoExtraListener(IMediaPlayer$OnInfoExtraListener p0){
       this.mOnInfoExtraListener = p0;
    }
    public final void setOnInfoListener(IMediaPlayer$OnInfoListener p0){
       this.mOnInfoListener = p0;
    }
    public final void setOnLogEventListener(IMediaPlayer$OnLogEventListener p0){
       this.mOnLogEventListener = p0;
    }
    public final void setOnPreparedListener(IMediaPlayer$OnPreparedListener p0){
       this.mOnPreparedListener = p0;
    }
    public final void setOnRenderingStartListener(IMediaPlayer$OnRenderingStartListener p0){
       this.mOnRenderingStartListener = p0;
    }
    public final void setOnSeekCompleteListener(IMediaPlayer$OnSeekCompleteListener p0){
       this.mOnSeekCompleteListener = p0;
    }
    public final void setOnVideoSizeChangedListener(IMediaPlayer$OnVideoSizeChangedListener p0){
       this.mOnVideoSizeChangedListener = p0;
    }
}
