package com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit$2;
import android.os.IBinder$DeathRecipient;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit;
import java.lang.Object;
import java.lang.String;
import com.huawei.multimedia.audiokit.utils.LogUtils;
import android.os.IBinder;
import com.huawei.multimedia.audiokit.interfaces.FeatureKitManager;

public class HwAudioKaraokeFeatureKit$2 implements IBinder$DeathRecipient	// class@0006c6
{
    public final HwAudioKaraokeFeatureKit a;

    public void HwAudioKaraokeFeatureKit$2(HwAudioKaraokeFeatureKit p0){
       this.a = p0;
       super();
    }
    public void binderDied(){
       LogUtils.a("HwAudioKit.HwAudioKaraokeFeatureKit", "binderDied");
       HwAudioKaraokeFeatureKit.e(this.a).unlinkToDeath(HwAudioKaraokeFeatureKit.d(this.a), 0);
       HwAudioKaraokeFeatureKit.b(this.a).a(1003);
       HwAudioKaraokeFeatureKit.b(this.a, null);
    }
}
