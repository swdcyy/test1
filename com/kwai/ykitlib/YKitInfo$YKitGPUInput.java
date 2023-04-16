package com.kwai.ykitlib.YKitInfo$YKitGPUInput;
import java.io.Serializable;
import java.lang.Object;

public class YKitInfo$YKitGPUInput implements Serializable	// class@001156
{
    public int gpuType;
    public int height;
    public boolean mirrored;
    public int rotate;
    public long texture;
    public int width;

    public void YKitInfo$YKitGPUInput(){
       super();
       this.width = 0;
       this.height = 0;
       this.mirrored = false;
       this.rotate = 0;
       this.texture = 0;
       this.gpuType = 0;
    }
}
