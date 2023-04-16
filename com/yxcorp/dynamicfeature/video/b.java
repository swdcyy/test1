package com.yxcorp.dynamicfeature.video.b;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.dynamicfeature.video.VideoPluginInitModule;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager;

public final class b implements Runnable	// class@0011d2
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void run(){
       DPHardwareConfigManager.getInstance().init();
    }
}
