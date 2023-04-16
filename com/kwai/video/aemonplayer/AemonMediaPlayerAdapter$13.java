package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$13;
import java.lang.Runnable;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import ai7.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.aemonplayer.JavaAttrList;
import com.kwai.video.aemonplayer.AemonMediaPlayer;
import com.kwai.player.qos.KwaiPlayerResultQos;

public class AemonMediaPlayerAdapter$13 implements Runnable	// class@00199e
{
    public final AemonMediaPlayerAdapter this$0;
    public final e val$listener;

    public void AemonMediaPlayerAdapter$13(AemonMediaPlayerAdapter p0,e p1){
       this.this$0 = p0;
       this.val$listener = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter$13.class, "1")) {
          return;
       }
       this.this$0.shutdownWaitStop();
       if (this.val$listener != null) {
          JavaAttrList javaAttrList = this.this$0.mAemonMediaPlayer.newJavaAttrList();
          KwaiPlayerResultQos kwaiPlayerRe = new KwaiPlayerResultQos();
          javaAttrList.SetObjectValue("resultQos", kwaiPlayerRe);
          this.this$0.mAemonMediaPlayer.bizInvoke(0xc35b, javaAttrList);
          javaAttrList.Destroy();
          if (kwaiPlayerRe.videoStatJson == null || kwaiPlayerRe.briefVideoStatJson == null) {
             kwaiPlayerRe.videoStatJson = "N/A";
             kwaiPlayerRe.briefVideoStatJson = "N/A";
             kwaiPlayerRe.videoAvgFps = 0xbf800000;
          }
          this.val$listener.onRelease(kwaiPlayerRe);
       }
       this.this$0.release();
       return;
    }
}
