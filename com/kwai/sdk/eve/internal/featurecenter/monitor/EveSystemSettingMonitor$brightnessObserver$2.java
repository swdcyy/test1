package com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$brightnessObserver$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$brightnessObserver$2$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Handler;

public final class EveSystemSettingMonitor$brightnessObserver$2 extends Lambda implements a	// class@00152e
{
    public final EveSystemSettingMonitor this$0;

    public void EveSystemSettingMonitor$brightnessObserver$2(EveSystemSettingMonitor p0){
       this.this$0 = p0;
       super(0);
    }
    public final EveSystemSettingMonitor$brightnessObserver$2$1 invoke(){
       Object obj = PatchProxy.apply(null, this, EveSystemSettingMonitor$brightnessObserver$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EveSystemSettingMonitor$brightnessObserver$2$1(this, EveSystemSettingMonitor.access$getHandler$p(this.this$0));
    }
    public Object invoke(){
       return this.invoke();
    }
}
