package com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$volumeChangeReceiver$2$1;
import android.content.BroadcastReceiver;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$volumeChangeReceiver$2;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor;

public final class EveSystemSettingMonitor$volumeChangeReceiver$2$1 extends BroadcastReceiver	// class@001532
{
    public final EveSystemSettingMonitor$volumeChangeReceiver$2 this$0;

    public void EveSystemSettingMonitor$volumeChangeReceiver$2$1(EveSystemSettingMonitor$volumeChangeReceiver$2 p0){
       this.this$0 = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveSystemSettingMonitor$volumeChangeReceiver$2$1.class, "1")) {
          return;
       }
       this.this$0.this$0.updateVolume();
       return;
    }
}
