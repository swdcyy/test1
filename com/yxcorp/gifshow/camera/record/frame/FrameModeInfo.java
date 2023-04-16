package com.yxcorp.gifshow.camera.record.frame.FrameModeInfo;
import java.lang.Enum;
import lnc.s6;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FrameModeInfo extends Enum	// class@000dd4
{
    public String mFrameLogMode;
    public int mFrameMode;
    public int mIconRes;
    public int mText;
    public static final FrameModeInfo[] $VALUES;
    public static final FrameModeInfo MODE_1_1;
    public static final FrameModeInfo MODE_3_4;
    public static final FrameModeInfo MODE_9_16;
    public static final FrameModeInfo MODE_ALL_SCREEN;
    public static final FrameModeInfo MODE_FULL;

    static {
       int i = (s6.m())? 0x7f082028: 0x7f082027;
       FrameModeInfo uFrameModeIn = new FrameModeInfo("MODE_ALL_SCREEN", 0, i, 5, "full_frame_v2", 0x7f10049a);
       FrameModeInfo.MODE_ALL_SCREEN = v7;
       int i1 = 1;
       int i2 = (s6.m())? 0x7f082028: 0x7f082027;
       FrameModeInfo uFrameModeIn1 = new FrameModeInfo("MODE_FULL", i1, i2, 4, "full_frame", 0x7f10049a);
       FrameModeInfo.MODE_FULL = uFrameModeIn;
       int i3 = 2;
       int i4 = (s6.m())? 0x7f082026: 0x7f082025;
       FrameModeInfo uFrameModeIn2 = new FrameModeInfo("MODE_9_16", i3, i4, 1, "9_16", 0x7f100498);
       FrameModeInfo.MODE_9_16 = v1;
       int i5 = (s6.m())? 0x7f082024: 0x7f082023;
       FrameModeInfo uFrameModeIn3 = new FrameModeInfo("MODE_3_4", 3, i5, 2, "4_3", 0x7f100497);
       FrameModeInfo.MODE_3_4 = v2;
       int i6 = (s6.m())? 0x7f082022: 0x7f082021;
       FrameModeInfo uFrameModeIn4 = new FrameModeInfo("MODE_1_1", 4, i6, 3, "1_1", 0x7f100496);
       FrameModeInfo.MODE_1_1 = i;
       FrameModeInfo[] uFrameModeIn5 = new FrameModeInfo[]{v7,uFrameModeIn,v1,v2,i};
       FrameModeInfo.$VALUES = uFrameModeIn5;
    }
    public void FrameModeInfo(String p0,int p1,int p2,int p3,String p4,int p5){
       super(p0, p1);
       this.mIconRes = p2;
       this.mFrameMode = p3;
       this.mFrameLogMode = p4;
       this.mText = p5;
    }
    public static FrameModeInfo valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FrameModeInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FrameModeInfo.class, p0);
    }
    public static FrameModeInfo[] values(){
       Object obj = PatchProxy.apply(null, null, FrameModeInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FrameModeInfo.$VALUES.clone();
    }
}
