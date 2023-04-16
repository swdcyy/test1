package com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$brightnessObserver$2$1;
import android.database.ContentObserver;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$brightnessObserver$2;
import android.os.Handler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor;

public final class EveSystemSettingMonitor$brightnessObserver$2$1 extends ContentObserver	// class@00152d
{
    public final EveSystemSettingMonitor$brightnessObserver$2 this$0;

    public void EveSystemSettingMonitor$brightnessObserver$2$1(EveSystemSettingMonitor$brightnessObserver$2 p0,Handler p1){
       this.this$0 = p0;
       super(p1);
    }
    public void onChange(boolean p0){
       if (PatchProxy.isSupport(EveSystemSettingMonitor$brightnessObserver$2$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EveSystemSettingMonitor$brightnessObserver$2$1.class, "1")) {
          return;
       }
       this.this$0.this$0.updateBrightness();
       return;
    }
}
