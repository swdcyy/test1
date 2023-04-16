package com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter$VideoLifecycleObserver;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.ref.WeakReference;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.event.PlayerVolumeEvent;
import com.yxcorp.gifshow.event.PlayerVolumeEvent$Status;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter;
import h04.c;
import java.lang.StringBuilder;
import android.view.TextureView;
import q87.c;
import com.kwai.framework.player.core.b;

public class MerchantInterpretationPlayerPresenter$VideoLifecycleObserver implements DefaultLifecycleObserver	// class@00184c
{
    public final WeakReference b;

    public void MerchantInterpretationPlayerPresenter$VideoLifecycleObserver(WeakReference p0){
       super();
       this.b = p0;
    }
    public void onCreate(LifecycleOwner p0){
    }
    public void onDestroy(LifecycleOwner p0){
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantInterpretationPlayerPresenter$VideoLifecycleObserver.class, "2")) {
          return;
       }
       a.d().k(new PlayerVolumeEvent(PlayerVolumeEvent$Status.UN_MUTE));
       MerchantInterpretationPlayerPresenter$VideoLifecycleObserver videoLifecyc = null;
       MerchantInterpretationPlayerPresenter$VideoLifecycleObserver tb = this.b;
       if (tb != null && tb.get() != null) {
          videoLifecyc = this.b.get();
       }
       if (videoLifecyc == null) {
          return;
       }else {
          c uoc = c.C();
          Object[] objArray = new Object[2];
          int i = 0;
          objArray[0] = "mIsManualStopVideo = "+videoLifecyc.M;
          StringBuilder str = "mPlayerTextureView is VISIBLE";
          if (!videoLifecyc.s.getVisibility()) {
             i = true;
          }
          objArray[1] = str+i;
          uoc.w("MerchantInterpretationPlayerPresenter", "onPause", objArray);
          if (!videoLifecyc.s.getVisibility()) {
             MerchantInterpretationPlayerPresenter d = videoLifecyc.D;
             if (d != null && d.isPlaying()) {
                videoLifecyc.h9();
             }
          }
          return;
       }
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantInterpretationPlayerPresenter$VideoLifecycleObserver.class, "1")) {
          return;
       }
       a.d().k(new PlayerVolumeEvent(PlayerVolumeEvent$Status.MUTE));
       MerchantInterpretationPlayerPresenter$VideoLifecycleObserver videoLifecyc = null;
       MerchantInterpretationPlayerPresenter$VideoLifecycleObserver tb = this.b;
       if (tb != null && tb.get() != null) {
          videoLifecyc = this.b.get();
       }
       if (videoLifecyc == null) {
          return;
       }else {
          c uoc = c.C();
          Object[] objArray = new Object[2];
          int i = 0;
          objArray[0] = "mIsManualStopVideo = "+videoLifecyc.M;
          StringBuilder str = "mPlayerTextureView is VISIBLE";
          if (!videoLifecyc.s.getVisibility()) {
             i = true;
          }
          objArray[1] = str+i;
          uoc.w("MerchantInterpretationPlayerPresenter", "onResume", objArray);
          if (!videoLifecyc.s.getVisibility()) {
             MerchantInterpretationPlayerPresenter d = videoLifecyc.D;
             if (d != null && (videoLifecyc.M == null && (d.isPaused() && videoLifecyc.D.isPrepared()))) {
                videoLifecyc.d9();
             }
          }
       label_0091 :
          return;
       }
    }
    public void onStart(LifecycleOwner p0){
    }
    public void onStop(LifecycleOwner p0){
    }
}
