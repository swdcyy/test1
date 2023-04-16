package com.kwai.live.gzone.bridge.function.LiveGzoneThirdPlatformParams;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.live.gzone.bridge.function.LiveGzoneThirdPlatformParams$ThirdPlatform;

public class LiveGzoneThirdPlatformParams implements Serializable	// class@000c84
{
    public LiveGzoneThirdPlatformParams$Params mParams;
    public int mPlatform;
    public static final long serialVersionUID = 0xe2b8d3fc4d0d38a0;

    public void LiveGzoneThirdPlatformParams(){
       super();
       this.mPlatform = LiveGzoneThirdPlatformParams$ThirdPlatform.LIVELINK.mValue;
    }
}
