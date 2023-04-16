package com.kwai.video.wayne.player.main.ProgressProcessor;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import android.os.Handler;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import android.os.Looper;
import android.content.Context;
import com.kwai.video.wayne.player.main.ProgressProcessor$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import com.kwai.video.wayne.player.main._1_AbstractMediaPlayerApiDelegate;
import java.lang.Long;
import java.lang.Exception;
import com.kwai.video.wayne.player.util.DebugLog;
import java.lang.Runnable;

public class ProgressProcessor extends AbsKpMidProcessor	// class@000d8c
{
    public final String TAG;
    public Handler mProgressHandler;
    public Runnable mProgressRunable;
    public static int PROGRESS_INTERVAL = 200;

    public void ProgressProcessor(){
       super();
       this.TAG = "ProgressProcessor";
       this.mProgressHandler = new Handler(WaynePlayerInitor.APP_CONTEXT.getMainLooper());
       this.mProgressRunable = new ProgressProcessor$1(this);
    }
    public void dispatchProgressEvent(){
       if (PatchProxy.applyVoid(null, this, ProgressProcessor.class, "3")) {
          return;
       }
       try{
          if (this.getMediaPlayer() != null && (this.getMediaPlayer().isActualPlaying() && this.getMediaPlayer().hasProgressChangeListener())) {
             this.getMediaPlayer().notifyWaynePlayerProgressChange(Long.valueOf(this.getMediaPlayer().getCurrentPosition()), Long.valueOf(this.getMediaPlayer().getDuration()));
          }
       }catch(java.lang.Exception e0){
          DebugLog.e("ProgressProcessor", e0.getMessage());
       }
       return;
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, ProgressProcessor.class, "1")) {
          return;
       }
       this.mProgressHandler.removeCallbacks(this.mProgressRunable);
       this.mProgressHandler.postDelayed(this.mProgressRunable, (long)ProgressProcessor.PROGRESS_INTERVAL);
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, ProgressProcessor.class, "2")) {
          return;
       }
       this.mProgressHandler.removeCallbacks(this.mProgressRunable);
       return;
    }
}
