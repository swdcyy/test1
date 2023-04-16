package com.yxcorp.gifshow.music.radio.notification.MusicNotificationHelper$mBroadcastReceiver$1;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.music.radio.notification.MusicNotificationHelper;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import fqb.a;
import com.yxcorp.gifshow.music.radio.notification.MusicRadioNotificationStatus;
import java.lang.Exception;

public final class MusicNotificationHelper$mBroadcastReceiver$1 extends BroadcastReceiver	// class@002071
{
    public final MusicNotificationHelper a;

    public void MusicNotificationHelper$mBroadcastReceiver$1(MusicNotificationHelper p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       String action;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicNotificationHelper$mBroadcastReceiver$1.class, "1")) {
          return;
       }
       try{
          if (p1 != null) {
             action = p1.getAction();
          label_0015 :
             if (action != null) {
                int i = action.hashCode();
                if (i != -1375903882) {
                   if (i != 0x436946f2) {
                      if (i == 0x436a4733 && action.equals("com.yxcorp.gifshow.common_music_player.notification.play")) {
                         RxBus.f.b(new a(MusicRadioNotificationStatus.CLICK, 0, this.a.w()));
                      }
                   }else if(action.equals("com.yxcorp.gifshow.common_music_player.notification.next")){
                      RxBus.f.b(new a(MusicRadioNotificationStatus.NEXT, 0, this.a.w()));
                   }
                }else if(action.equals("com.yxcorp.gifshow.common_music_player.notification.previous")){
                   RxBus.f.b(new a(MusicRadioNotificationStatus.PRE, 0, this.a.w()));
                }
             }
          }else {
             action = null;
             goto label_0015 ;
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return;
    }
}
