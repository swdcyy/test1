package com.airbnb.lottie.RenderMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RenderMode extends Enum	// class@000d8f
{
    public static final RenderMode[] $VALUES;
    public static final RenderMode AUTOMATIC;
    public static final RenderMode HARDWARE;
    public static final RenderMode SOFTWARE;

    static {
       RenderMode renderMode = new RenderMode("AUTOMATIC", 0);
       RenderMode.AUTOMATIC = renderMode;
       RenderMode renderMode1 = new RenderMode("HARDWARE", 1);
       RenderMode.HARDWARE = renderMode1;
       RenderMode renderMode2 = new RenderMode("SOFTWARE", 2);
       RenderMode.SOFTWARE = renderMode2;
       RenderMode[] renderModeAr = new RenderMode[]{renderMode,renderMode1,renderMode2};
       RenderMode.$VALUES = renderModeAr;
    }
    public void RenderMode(String p0,int p1){
       super(p0, p1);
    }
    public static RenderMode valueOf(String p0){
       return Enum.valueOf(RenderMode.class, p0);
    }
    public static RenderMode[] values(){
       return RenderMode.$VALUES.clone();
    }
}
