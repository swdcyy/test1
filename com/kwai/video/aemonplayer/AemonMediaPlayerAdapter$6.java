package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$6;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnInfoListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import java.lang.Object;
import com.kwai.video.aemonplayer.AemonMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.player.AbstractMediaPlayer;
import java.lang.System;

public class AemonMediaPlayerAdapter$6 implements AemonMediaPlayerListener$OnInfoListener	// class@0019a6
{
    public final AemonMediaPlayerAdapter this$0;

    public void AemonMediaPlayerAdapter$6(AemonMediaPlayerAdapter p0){
       this.this$0 = p0;
       super();
    }
    public boolean onInfo(AemonMediaPlayer p0,int p1,int p2){
       AemonMediaPlayerAdapter$6 tthis$0;
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter$6.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AemonMediaPlayerAdapter$6.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 != 701) {
          if (p1 != 702) {
             if (p1 == 0x2774) {
                this.this$0.notifyOnSeekComplete();
             }
          }else {
             tthis$0 = this.this$0;
             tthis$0.mTotalBufferingTime = tthis$0.mTotalBufferingTime + (int)(System.currentTimeMillis() - tthis$0.mStartBufferingTime);
          }
       }else {
          tthis$0 = this.this$0;
          tthis$0.mBufferingCount = tthis$0.mBufferingCount + 1;
          tthis$0.mStartBufferingTime = System.currentTimeMillis();
       }
       this.this$0.notifyOnInfo(p1, p2);
       return false;
    }
}
