package com.kwai.video.clipkit.hardware.ClipDPHardwareConfigManager$HwEncodeLimit;
import java.lang.Object;

public class ClipDPHardwareConfigManager$HwEncodeLimit	// class@001a82
{
    public float minHWEncodeSpeed;
    public int minProfile;
    public int supportAlignmentFlag;

    public void ClipDPHardwareConfigManager$HwEncodeLimit(){
       super();
       this.minHWEncodeSpeed = 0;
       this.minProfile = 0;
       this.supportAlignmentFlag = 2;
    }
    public void ClipDPHardwareConfigManager$HwEncodeLimit(float p0,int p1,int p2){
       super();
       this.minHWEncodeSpeed = 0;
       this.minProfile = 0;
       this.supportAlignmentFlag = 2;
       this.minHWEncodeSpeed = p0;
       this.minProfile = p1;
       this.supportAlignmentFlag = p2;
    }
}
