package com.kwai.ykitlib.YKitInfo$YKitFaceInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.LinkedList;

public class YKitInfo$YKitFaceInfo implements Serializable	// class@001153
{
    public float confidence;
    public float height;
    public long index;
    public float left;
    public float pitch;
    public LinkedList pos;
    public float roll;
    public float top;
    public float width;
    public float yaw;

    public void YKitInfo$YKitFaceInfo(){
       super();
       this.index = -1;
       this.pos = new LinkedList();
       this.left = 0;
       this.top = 0;
       this.width = 0;
       this.height = 0;
       this.confidence = 0;
       this.yaw = 0;
       this.pitch = 0;
       this.roll = 0;
    }
}
