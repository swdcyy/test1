package com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$volumeChangeReceiver$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$volumeChangeReceiver$2$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveSystemSettingMonitor$volumeChangeReceiver$2 extends Lambda implements a	// class@001533
{
    public final EveSystemSettingMonitor this$0;

    public void EveSystemSettingMonitor$volumeChangeReceiver$2(EveSystemSettingMonitor p0){
       this.this$0 = p0;
       super(0);
    }
    public final EveSystemSettingMonitor$volumeChangeReceiver$2$1 invoke(){
       Object obj = PatchProxy.apply(null, this, EveSystemSettingMonitor$volumeChangeReceiver$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EveSystemSettingMonitor$volumeChangeReceiver$2$1(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
