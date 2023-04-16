package com.huawei.multimedia.audiokit.interfaces.HwAudioKit$2;
import android.os.IBinder$DeathRecipient;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKit;
import java.lang.Object;
import android.os.IBinder;
import com.huawei.multimedia.audiokit.interfaces.FeatureKitManager;
import java.lang.String;
import com.huawei.multimedia.audiokit.utils.LogUtils;

public class HwAudioKit$2 implements IBinder$DeathRecipient	// class@0006ca
{
    public final HwAudioKit a;

    public void HwAudioKit$2(HwAudioKit p0){
       this.a = p0;
       super();
    }
    public void binderDied(){
       HwAudioKit.e(this.a).unlinkToDeath(HwAudioKit.d(this.a), 0);
       HwAudioKit.b(this.a).a(6);
       LogUtils.a("HwAudioKit.HwAudioKit", "service binder died");
       HwAudioKit.b(this.a, null);
    }
}
