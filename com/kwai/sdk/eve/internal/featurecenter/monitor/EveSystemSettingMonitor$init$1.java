package com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$init$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.IntentFilter;
import android.content.Context;
import com.kwai.sdk.eve.internal.featurecenter.monitor.FeatureMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$volumeChangeReceiver$2$1;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.Settings$System;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$brightnessObserver$2$1;
import android.database.ContentObserver;

public final class EveSystemSettingMonitor$init$1 implements Runnable	// class@001531
{
    public final Handler $handler;
    public final EveSystemSettingMonitor this$0;

    public void EveSystemSettingMonitor$init$1(EveSystemSettingMonitor p0,Handler p1){
       this.this$0 = p0;
       this.$handler = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveSystemSettingMonitor$init$1.class, "1")) {
          return;
       }
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
       intentFilter.addAction("android.intent.action.HEADSET_PLUG");
       intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
       intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
       this.this$0.getContext().registerReceiver(this.this$0.getVolumeChangeReceiver(), intentFilter, objArray, this.$handler);
       this.this$0.updateVolume();
       this.this$0.getContext().getContentResolver().registerContentObserver(Settings$System.getUriFor("screen_brightness"), false, this.this$0.getBrightnessObserver());
       this.this$0.updateBrightness();
       return;
    }
}
