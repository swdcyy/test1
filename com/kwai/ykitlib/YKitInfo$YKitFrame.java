package com.kwai.ykitlib.YKitInfo$YKitFrame;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.ykitlib.YKitInfo$YKitImage;
import com.kwai.ykitlib.YKitInfo$YKitGPUInput;

public class YKitInfo$YKitFrame implements Serializable	// class@001155
{
    public long anyPtr;
    public long cpuOutAny;
    public YKitInfo$YKitFaceData faceData;
    public long faceInfoAny;
    public long frameIndex;
    public YKitInfo$YKitGPUInput gpuIn;
    public YKitInfo$YKitImage imageIn;
    public boolean isFrontCamera;
    public float timeStamp;

    public void YKitInfo$YKitFrame(){
       super();
       this.imageIn = new YKitInfo$YKitImage();
       this.gpuIn = new YKitInfo$YKitGPUInput();
       this.anyPtr = 0;
       this.faceInfoAny = 0;
       this.cpuOutAny = 0;
       this.timeStamp = 0;
       this.isFrontCamera = false;
       this.frameIndex = 0;
       this.faceData = null;
    }
}
