package com.kwai.video.aemonplayer.AemonMediaPlayer$EventHandler;
import android.os.Handler;
import com.kwai.video.aemonplayer.AemonMediaPlayer;
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
import com.kwai.video.aemonplayer.JavaAttrList;
import java.lang.StringBuilder;
import com.kwai.video.aemonplayer.AemonNativeLogger;

public class AemonMediaPlayer$EventHandler extends Handler	// class@001999
{
    public final WeakReference mWeakPlayer;

    public void AemonMediaPlayer$EventHandler(AemonMediaPlayer p0,Looper p1){
       super(p1);
       this.mWeakPlayer = new WeakReference(p0);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayer$EventHandler.class, "1")) {
          return;
       }
       AemonMediaPlayer uAemonMediaP = this.mWeakPlayer.get();
       if (uAemonMediaP == null || !uAemonMediaP.mNativeMediaPlayer - null) {
          AemonNativeLogger.e("AemonMediaPlayer", "AbstractNativeMediaPlayer went away with unhandled events: what\("+p0.what+"\) arg1\("+p0.arg1+"\)");
          p0 = p0.obj;
          if (p0 != null) {
             p0.Destroy();
          }
          return;
       }else if(p0.arg1 == 0x2712){
          uAemonMediaP.mExtraQosInfo.put("csmCostAudio", Long.toString((SystemClock.elapsedRealtime() - uAemonMediaP.stForAudioFistFrame)));
       }
       if (p0.arg1 == 3) {
          uAemonMediaP.mExtraQosInfo.put("csmCostVideo", Long.toString((SystemClock.elapsedRealtime() - uAemonMediaP.stForVideoFistFrame)));
       }
       uAemonMediaP.onReceivePostEvent(p0);
       p0 = p0.obj;
       if (p0 != null) {
          p0.Destroy();
       }
       return;
    }
}
