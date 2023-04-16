package com.yxcorp.gifshow.common_music_player.notification.MusicNotificationHelper$MusicNotificationBroadcastReceiver$b;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import kob.r;

public final class MusicNotificationHelper$MusicNotificationBroadcastReceiver$b implements Runnable	// class@001193
{
    public final String b;

    public void MusicNotificationHelper$MusicNotificationBroadcastReceiver$b(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MusicNotificationHelper$MusicNotificationBroadcastReceiver$b.class, "1")) {
          return;
       }
       r or = d.a(-1687636538);
       if (or != null) {
          MusicNotificationHelper$MusicNotificationBroadcastReceiver$b tb = this.b;
          if (tb != null) {
             int i = tb.hashCode();
             if (i != -1375903882) {
                if (i != 0x436946f2) {
                   if (i == 0x436a4733 && tb.equals("com.yxcorp.gifshow.common_music_player.notification.play")) {
                      if (or.isPlaying()) {
                         or.pause();
                      }else {
                         or.start();
                      }
                   }
                }else if(tb.equals("com.yxcorp.gifshow.common_music_player.notification.next")){
                   or.next();
                   or.start();
                }
             }else if(tb.equals("com.yxcorp.gifshow.common_music_player.notification.previous")){
                or.previous();
                or.start();
             }
          }
       }
       return;
    }
}
