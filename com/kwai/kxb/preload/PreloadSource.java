package com.kwai.kxb.preload.PreloadSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PreloadSource extends Enum	// class@0007dd
{
    public final String logValue;
    public static final PreloadSource[] $VALUES;
    public static final PreloadSource BACKGROUND;
    public static final PreloadSource COLD_START;
    public static final PreloadSource FOREGROUND;
    public static final PreloadSource FOUR_TAB;
    public static final PreloadSource LOOP;
    public static final PreloadSource NETWORK_CONNECT;
    public static final PreloadSource PUSH;
    public static final PreloadSource TEST;

    static {
       PreloadSource preloadSourc1;
       PreloadSource[] preloadSourc = new PreloadSource[]{preloadSourc1,preloadSourc1,preloadSourc1,preloadSourc1,preloadSourc1,preloadSourc1,preloadSourc1,preloadSourc1};
       preloadSourc1 = new PreloadSource("COLD_START", 0, "ColdStart");
       PreloadSource.COLD_START = preloadSourc1;
       preloadSourc1 = new PreloadSource("BACKGROUND", 1, "Background");
       PreloadSource.BACKGROUND = preloadSourc1;
       preloadSourc1 = new PreloadSource("FOREGROUND", 2, "Foreground");
       PreloadSource.FOREGROUND = preloadSourc1;
       preloadSourc1 = new PreloadSource("LOOP", 3, "Looper");
       PreloadSource.LOOP = preloadSourc1;
       preloadSourc1 = new PreloadSource("PUSH", 4, "Push");
       PreloadSource.PUSH = preloadSourc1;
       preloadSourc1 = new PreloadSource("NETWORK_CONNECT", 5, "NetworkConnect");
       PreloadSource.NETWORK_CONNECT = preloadSourc1;
       preloadSourc1 = new PreloadSource("FOUR_TAB", 6, "4tab");
       PreloadSource.FOUR_TAB = preloadSourc1;
       preloadSourc1 = new PreloadSource("TEST", 7, "Test");
       PreloadSource.TEST = preloadSourc1;
       PreloadSource.$VALUES = preloadSourc;
    }
    public void PreloadSource(String p0,int p1,String p2){
       super(p0, p1);
       this.logValue = p2;
    }
    public static PreloadSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PreloadSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PreloadSource.class, p0);
    }
    public static PreloadSource[] values(){
       Object obj = PatchProxy.apply(null, null, PreloadSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PreloadSource.$VALUES.clone();
    }
    public final String getLogValue(){
       return this.logValue;
    }
}
