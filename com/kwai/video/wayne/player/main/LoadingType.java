package com.kwai.video.wayne.player.main.LoadingType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LoadingType extends Enum	// class@000d6e
{
    public static final LoadingType[] $VALUES;
    public static final LoadingType STATE_BUFFEREND;
    public static final LoadingType STATE_BUFFERSTART;
    public static final LoadingType STATE_ERRORRETRYING;
    public static final LoadingType STATE_FIRSTFRAME;
    public static final LoadingType STATE_INITFETCHSOURCE;
    public static final LoadingType STATE_INITFETCHSOURCE_CANCEL;
    public static final LoadingType STATE_INITFETCHSOURCE_FAIL;
    public static final LoadingType STATE_PAUSE;
    public static final LoadingType STATE_PREPARE_START;
    public static final LoadingType STATE_RESET;
    public static final LoadingType STATE_SEEKEND;
    public static final LoadingType STATE_SEEKSTART;
    public static final LoadingType STATE_START;
    public static final LoadingType UNKNOW;

    static {
       LoadingType[] loadingTypeA = new LoadingType[14];
       LoadingType loadingType = new LoadingType("STATE_FIRSTFRAME", 0);
       LoadingType.STATE_FIRSTFRAME = loadingType;
       loadingTypeA[0] = loadingType;
       loadingType = new LoadingType("STATE_BUFFERSTART", 1);
       LoadingType.STATE_BUFFERSTART = loadingType;
       loadingTypeA[1] = loadingType;
       loadingType = new LoadingType("STATE_BUFFEREND", 2);
       LoadingType.STATE_BUFFEREND = loadingType;
       loadingTypeA[2] = loadingType;
       loadingType = new LoadingType("STATE_RESET", 3);
       LoadingType.STATE_RESET = loadingType;
       loadingTypeA[3] = loadingType;
       loadingType = new LoadingType("STATE_ERRORRETRYING", 4);
       LoadingType.STATE_ERRORRETRYING = loadingType;
       loadingTypeA[4] = loadingType;
       loadingType = new LoadingType("STATE_PREPARE_START", 5);
       LoadingType.STATE_PREPARE_START = loadingType;
       loadingTypeA[5] = loadingType;
       loadingType = new LoadingType("STATE_SEEKEND", 6);
       LoadingType.STATE_SEEKEND = loadingType;
       loadingTypeA[6] = loadingType;
       loadingType = new LoadingType("STATE_SEEKSTART", 7);
       LoadingType.STATE_SEEKSTART = loadingType;
       loadingTypeA[7] = loadingType;
       loadingType = new LoadingType("STATE_PAUSE", 8);
       LoadingType.STATE_PAUSE = loadingType;
       loadingTypeA[8] = loadingType;
       loadingType = new LoadingType("STATE_START", 9);
       LoadingType.STATE_START = loadingType;
       loadingTypeA[9] = loadingType;
       loadingType = new LoadingType("STATE_INITFETCHSOURCE", 10);
       LoadingType.STATE_INITFETCHSOURCE = loadingType;
       loadingTypeA[10] = loadingType;
       loadingType = new LoadingType("STATE_INITFETCHSOURCE_FAIL", 11);
       LoadingType.STATE_INITFETCHSOURCE_FAIL = loadingType;
       loadingTypeA[11] = loadingType;
       loadingType = new LoadingType("STATE_INITFETCHSOURCE_CANCEL", 12);
       LoadingType.STATE_INITFETCHSOURCE_CANCEL = loadingType;
       loadingTypeA[12] = loadingType;
       loadingType = new LoadingType("UNKNOW", 13);
       LoadingType.UNKNOW = loadingType;
       loadingTypeA[13] = loadingType;
       LoadingType.$VALUES = loadingTypeA;
    }
    public void LoadingType(String p0,int p1){
       super(p0, p1);
    }
    public static LoadingType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LoadingType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LoadingType.class, p0);
    }
    public static LoadingType[] values(){
       Object obj = PatchProxy.apply(null, null, LoadingType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LoadingType.$VALUES.clone();
    }
}
