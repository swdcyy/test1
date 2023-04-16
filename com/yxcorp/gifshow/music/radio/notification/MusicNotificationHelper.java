package com.yxcorp.gifshow.music.radio.notification.MusicNotificationHelper;
import rm9.a;
import com.yxcorp.gifshow.music.radio.notification.MusicRadioForegroundService;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.yxcorp.gifshow.music.radio.notification.MusicNotificationHelper$mBroadcastReceiver$1;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import ypb.a;
import com.kuaishou.android.model.feed.MusicRadioFeed;
import android.content.BroadcastReceiver;
import java.lang.Number;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import fqb.a;
import com.yxcorp.gifshow.music.radio.notification.MusicRadioNotificationStatus;
import nsd.u;
import java.lang.Long;

public final class MusicNotificationHelper extends a	// class@002072
{
    public BroadcastReceiver k;
    public a l;

    public void MusicNotificationHelper(MusicRadioForegroundService p0){
       a.p(p0, "musicRadioForegroundService");
       super(p0);
       this.k = new MusicNotificationHelper$mBroadcastReceiver$1(this);
    }
    public Music e(){
       Object[] objArray1;
       Object[] objArray = null;
       MusicNotificationHelper obj = PatchProxy.apply(objArray, this, MusicNotificationHelper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj != null) {
          QPhoto qPhoto = obj.p0();
          if (qPhoto != null) {
             qPhoto = qPhoto.mEntity;
          label_001e :
             if (!qPhoto instanceof MusicRadioFeed) {
                objArray1 = objArray;
             }
             if (objArray1 != null) {
                objArray = objArray1.mRaveView;
             }
             return objArray;
          }
       }
       objArray1 = objArray;
       goto label_001e ;
    }
    public BroadcastReceiver h(){
       return this.k;
    }
    public boolean k(){
       boolean b = (this.l != null)? true: false;
       return b;
    }
    public long l(){
       MusicNotificationHelper obj = PatchProxy.apply(null, this, MusicNotificationHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       if (this.g() - l) {
          return this.g();
       }
       obj = this.l;
       if (obj != null) {
          IWaynePlayer iWaynePlayer = obj.q0();
          if (iWaynePlayer != null) {
             l = iWaynePlayer.getCurrentPosition();
          }
       }
       return l;
    }
    public boolean m(){
       MusicNotificationHelper obj = PatchProxy.apply(null, this, MusicNotificationHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.l;
       boolean b = true;
       if (obj != null) {
          IWaynePlayer iWaynePlayer = obj.q0();
          if (iWaynePlayer != null && iWaynePlayer.isPlaying() == b) {
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, MusicNotificationHelper.class, "3")) {
          return;
       }
       a uoa = new a(MusicRadioNotificationStatus.CLICK, 0, null, 6, null);
       RxBus.f.b(v8);
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, MusicNotificationHelper.class, "4")) {
          return;
       }
       RxBus.f.b(new a(MusicRadioNotificationStatus.NEXT, 0, this.w()));
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, MusicNotificationHelper.class, "2")) {
          return;
       }
       a uoa = new a(MusicRadioNotificationStatus.PAUSE, 0, null, 6, null);
       RxBus.f.b(v8);
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, MusicNotificationHelper.class, "1")) {
          return;
       }
       a uoa = new a(MusicRadioNotificationStatus.PLAY, 0, null, 6, null);
       RxBus.f.b(v8);
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, MusicNotificationHelper.class, "5")) {
          return;
       }
       RxBus.f.b(new a(MusicRadioNotificationStatus.PRE, 0, this.w()));
       return;
    }
    public void s(long p0){
       MusicNotificationHelper musicNotific = MusicNotificationHelper.class;
       if (PatchProxy.isSupport(musicNotific) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, musicNotific, "6")) {
          return;
       }
       a uoa = new a(MusicRadioNotificationStatus.SEEK, p0, null, 4, null);
       RxBus.f.b(v8);
       return;
    }
    public final String w(){
       String photoId;
       MusicNotificationHelper obj = PatchProxy.apply(null, this, MusicNotificationHelper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj != null) {
          QPhoto qPhoto = obj.p0();
          if (qPhoto != null) {
             photoId = qPhoto.getPhotoId();
             if (photoId != null) {
             label_0023 :
                return photoId;
             }
          }
       }
       photoId = "";
       goto label_0023 ;
    }
}
