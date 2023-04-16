package com.kwai.components.playerkit.QPhotoPlayerKitDataSource$a;
import com.kwai.video.wayne.player.listeners.InnerPlayerLifeCycleListener;
import com.kwai.components.playerkit.QPhotoPlayerKitDataSource;
import java.lang.Object;
import com.kwai.video.player.IKwaiMediaPlayer;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import wkd.b;
import com.yxcorp.gifshow.w;
import com.kwai.video.player.kwai_player.KwaiPlayerVodBuilder;
import com.kwai.video.wayne.player.InstancePriority;

public class QPhotoPlayerKitDataSource$a implements InnerPlayerLifeCycleListener	// class@000cd7
{
    public final QPhotoPlayerKitDataSource a;

    public void QPhotoPlayerKitDataSource$a(QPhotoPlayerKitDataSource p0){
       this.a = p0;
       super();
    }
    public void onPlayerCreated(IKwaiMediaPlayer p0,int p1,String p2){
       if (PatchProxy.isSupport(QPhotoPlayerKitDataSource$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, QPhotoPlayerKitDataSource$a.class, "1")) {
          return;
       }
       b.a(-1343064608).o0();
       return;
    }
    public void onPlayerCreating(KwaiPlayerVodBuilder p0){
    }
    public void onPlayerPriorityChanged(InstancePriority p0,InstancePriority p1){
    }
    public void onPlayerReleased(){
    }
}
