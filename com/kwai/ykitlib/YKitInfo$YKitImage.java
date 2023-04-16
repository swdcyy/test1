package com.kwai.ykitlib.YKitInfo$YKitImage;
import java.io.Serializable;
import java.lang.Object;

public class YKitInfo$YKitImage implements Serializable	// class@001157
{
    public int colorSpace;
    public int colorType;
    public byte[] data;
    public byte[] data0;
    public byte[] data1;
    public byte[] data2;
    public float fov;
    public int frameRotate;
    public int height;
    public boolean mirrored;
    public int sensorRotate;
    public boolean singleImage;
    public int stride0;
    public int stride1;
    public int stride2;
    public int totalRotate;
    public int width;

    public void YKitInfo$YKitImage(){
       super();
       this.colorType = 2;
       this.colorSpace = 0;
       this.stride0 = 0;
       this.stride1 = 0;
       this.stride2 = 0;
       this.width = 0;
       this.height = 0;
       this.mirrored = false;
       this.totalRotate = 0;
       this.frameRotate = 0;
       this.sensorRotate = 0;
       this.fov = 0;
       this.singleImage = false;
    }
}
