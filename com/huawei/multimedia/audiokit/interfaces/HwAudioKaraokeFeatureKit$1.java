package com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit$1;
import android.content.ServiceConnection;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import java.lang.String;
import com.huawei.multimedia.audiokit.utils.LogUtils;
import com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature;
import com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature$Stub;
import com.huawei.multimedia.audiokit.interfaces.FeatureKitManager;
import android.content.Context;

public class HwAudioKaraokeFeatureKit$1 implements ServiceConnection	// class@0006c5
{
    public final HwAudioKaraokeFeatureKit a;

    public void HwAudioKaraokeFeatureKit$1(HwAudioKaraokeFeatureKit p0){
       this.a = p0;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       LogUtils.b("HwAudioKit.HwAudioKaraokeFeatureKit", "onServiceConnected");
       HwAudioKaraokeFeatureKit.a(this.a, IHwAudioKaraokeFeature$Stub.a(p1));
       if (HwAudioKaraokeFeatureKit.a(this.a) != null) {
          HwAudioKaraokeFeatureKit.a(this.a, true);
          HwAudioKaraokeFeatureKit.b(this.a).a(1000);
          HwAudioKaraokeFeatureKit$1 ta = this.a;
          HwAudioKaraokeFeatureKit.a(ta, HwAudioKaraokeFeatureKit.c(ta).getPackageName());
          HwAudioKaraokeFeatureKit.a(this.a, p1);
       }
       return;
    }
    public void onServiceDisconnected(ComponentName p0){
       LogUtils.b("HwAudioKit.HwAudioKaraokeFeatureKit", "onServiceDisconnected");
       HwAudioKaraokeFeatureKit.a(this.a, false);
       if (HwAudioKaraokeFeatureKit.b(this.a) != null) {
          HwAudioKaraokeFeatureKit.b(this.a).a(1001);
       }
       return;
    }
}
