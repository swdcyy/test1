package com.huawei.multimedia.audiokit.interfaces.HwAudioKit$1;
import android.content.ServiceConnection;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKit;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import com.huawei.multimedia.audioengine.IHwAudioEngine;
import com.huawei.multimedia.audioengine.IHwAudioEngine$Stub;
import java.lang.String;
import com.huawei.multimedia.audiokit.utils.LogUtils;
import com.huawei.multimedia.audiokit.interfaces.FeatureKitManager;
import android.content.Context;

public class HwAudioKit$1 implements ServiceConnection	// class@0006c9
{
    public final HwAudioKit a;

    public void HwAudioKit$1(HwAudioKit p0){
       this.a = p0;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       HwAudioKit.a(this.a, IHwAudioEngine$Stub.a(p1));
       String str = "HwAudioKit.HwAudioKit";
       LogUtils.b(str, "onServiceConnected");
       if (HwAudioKit.a(this.a) != null) {
          HwAudioKit.a(this.a, true);
          LogUtils.b(str, "onServiceConnected, mIHwAudioEngine is not null");
          HwAudioKit.b(this.a).a(0);
          HwAudioKit$1 ta = this.a;
          HwAudioKit.a(ta, HwAudioKit.c(ta).getPackageName(), "1.0.1");
          HwAudioKit.a(this.a, p1);
       }
       return;
    }
    public void onServiceDisconnected(ComponentName p0){
       LogUtils.b("HwAudioKit.HwAudioKit", "onServiceDisconnected");
       HwAudioKit.a(this.a, null);
       HwAudioKit.a(this.a, false);
       HwAudioKit.b(this.a).a(4);
    }
}
