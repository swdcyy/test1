package com.yxcorp.gifshow.common_music_player.notification.MusicNotificationHelper$MusicNotificationBroadcastReceiver;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.common_music_player.notification.MusicNotificationHelper$MusicNotificationBroadcastReceiver$a;
import nsd.u;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qm9.f;
import q87.c;
import com.yxcorp.gifshow.common_music_player.notification.MusicNotificationHelper$MusicNotificationBroadcastReceiver$b;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Exception;

public final class MusicNotificationHelper$MusicNotificationBroadcastReceiver extends BroadcastReceiver	// class@001194
{
    public static final MusicNotificationHelper$MusicNotificationBroadcastReceiver$a a;

    static {
       MusicNotificationHelper$MusicNotificationBroadcastReceiver.a = new MusicNotificationHelper$MusicNotificationBroadcastReceiver$a(null);
    }
    public void MusicNotificationHelper$MusicNotificationBroadcastReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicNotificationHelper$MusicNotificationBroadcastReceiver.class, "1")) {
          return;
       }
       try{
          String action = (p1 != null)? p1.getAction(): null;
          f uof = f.C();
          String str = (action != null)? action: "";
          Object[] objArray = new Object[0];
          uof.s("MusicNotificationBroadcastReceiver", str, objArray);
          k1.o(new MusicNotificationHelper$MusicNotificationBroadcastReceiver$b(action));
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return;
    }
}
