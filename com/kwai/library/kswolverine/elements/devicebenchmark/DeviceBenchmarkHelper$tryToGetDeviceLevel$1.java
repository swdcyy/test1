package com.kwai.library.kswolverine.elements.devicebenchmark.DeviceBenchmarkHelper$tryToGetDeviceLevel$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.devicepersona.config.DeviceConfigManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public final class DeviceBenchmarkHelper$tryToGetDeviceLevel$1 extends Lambda implements a	// class@000847
{
    public final String $sceneKey;
    public final DeviceConfigManager $this_tryToGetDeviceLevel;

    public void DeviceBenchmarkHelper$tryToGetDeviceLevel$1(DeviceConfigManager p0,String p1){
       this.$this_tryToGetDeviceLevel = p0;
       this.$sceneKey = p1;
       super(0);
    }
    public final int invoke(){
       return this.$this_tryToGetDeviceLevel.getDeviceLevel(this.$sceneKey);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
