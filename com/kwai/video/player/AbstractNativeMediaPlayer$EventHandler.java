package com.kwai.video.player.AbstractNativeMediaPlayer$EventHandler;
import android.os.Handler;
import com.kwai.video.player.AbstractNativeMediaPlayer;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import java.lang.Long;
import java.util.Map;

public class AbstractNativeMediaPlayer$EventHandler extends Handler	// class@000aa5
{
    public final WeakReference mWeakPlayer;

    public void AbstractNativeMediaPlayer$EventHandler(AbstractNativeMediaPlayer p0,Looper p1){
       super(p1);
       this.mWeakPlayer = new WeakReference(p0);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractNativeMediaPlayer$EventHandler.class, "1")) {
          return;
       }
       AbstractNativeMediaPlayer uAbstractNat = this.mWeakPlayer.get();
       if (uAbstractNat != null && uAbstractNat.mNativeMediaPlayer - null) {
          if (p0.arg1 == 0x2712) {
             uAbstractNat.mExtraQosInfo.put("csmCostAudio", Long.toString((SystemClock.elapsedRealtime() - uAbstractNat.stForAudioFistFrame)));
          }
          if (p0.arg1 == 3) {
             uAbstractNat.mExtraQosInfo.put("csmCostVideo", Long.toString((SystemClock.elapsedRealtime() - uAbstractNat.stForVideoFistFrame)));
          }
          uAbstractNat.onReceivePostEvent(p0);
       }
       return;
    }
}
