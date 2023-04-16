package com.kwai.video.westeros.stentorplugin.AsrConfig$AsrControl;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AsrConfig$AsrControl extends Enum	// class@0010b8
{
    public static final AsrConfig$AsrControl[] $VALUES;
    public static final AsrConfig$AsrControl AsrPause;
    public static final AsrConfig$AsrControl AsrRemain;
    public static final AsrConfig$AsrControl AsrResume;
    public static final AsrConfig$AsrControl AsrStart;
    public static final AsrConfig$AsrControl AsrStop;

    static {
       AsrConfig$AsrControl uAsrControl = new AsrConfig$AsrControl("AsrRemain", 0);
       AsrConfig$AsrControl.AsrRemain = uAsrControl;
       AsrConfig$AsrControl uAsrControl1 = new AsrConfig$AsrControl("AsrStart", 1);
       AsrConfig$AsrControl.AsrStart = uAsrControl1;
       AsrConfig$AsrControl uAsrControl2 = new AsrConfig$AsrControl("AsrStop", 2);
       AsrConfig$AsrControl.AsrStop = uAsrControl2;
       AsrConfig$AsrControl uAsrControl3 = new AsrConfig$AsrControl("AsrPause", 3);
       AsrConfig$AsrControl.AsrPause = uAsrControl3;
       AsrConfig$AsrControl uAsrControl4 = new AsrConfig$AsrControl("AsrResume", 4);
       AsrConfig$AsrControl.AsrResume = uAsrControl4;
       AsrConfig$AsrControl[] uAsrControlA = new AsrConfig$AsrControl[]{uAsrControl,uAsrControl1,uAsrControl2,uAsrControl3,uAsrControl4};
       AsrConfig$AsrControl.$VALUES = uAsrControlA;
    }
    public void AsrConfig$AsrControl(String p0,int p1){
       super(p0, p1);
    }
    public static AsrConfig$AsrControl valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AsrConfig$AsrControl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AsrConfig$AsrControl.class, p0);
    }
    public static AsrConfig$AsrControl[] values(){
       Object obj = PatchProxy.apply(null, null, AsrConfig$AsrControl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AsrConfig$AsrControl.$VALUES.clone();
    }
}
