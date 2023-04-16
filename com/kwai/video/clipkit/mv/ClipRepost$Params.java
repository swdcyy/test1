package com.kwai.video.clipkit.mv.ClipRepost$Params;
import java.lang.Object;
import com.kwai.video.clipkit.mv.ClipRepost$Type;

public final class ClipRepost$Params	// class@001aad
{
    public float[] animBezier;
    public float animTime;
    public float ctHeadTime;
    public float[] ctRollBezier;
    public float ctRollSpeed;
    public float ctTailTime;
    public float frameRate;
    public List materials;
    public float minProjectTime;
    public int photoFrameHeight;
    public int photoFrameWidth;
    public ClipRepost$Type type;

    public void ClipRepost$Params(){
       super();
       this.type = ClipRepost$Type.LongPicture;
       this.photoFrameWidth = 720;
       this.photoFrameHeight = 1280;
       this.ctRollBezier = new float[4]{0x3e4ccccd,0,0x3f800000,0x3f800000};
       this.animBezier = new float[4]{0x3ecccccd,0,0x3e4ccccd,0x3f800000};
       this.animTime = 0x3f800000;
       this.ctHeadTime = 0x3f800000;
       this.ctTailTime = 0x3f800000;
       this.ctRollSpeed = 300.00f;
       this.frameRate = 0x41f00000;
       this.minProjectTime = 12.00f;
    }
}
