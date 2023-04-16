package com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper$PreloadState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BeautyDataHelper$PreloadState extends Enum	// class@001100
{
    public static final BeautyDataHelper$PreloadState[] $VALUES;
    public static final BeautyDataHelper$PreloadState LOCAL_FAILED;
    public static final BeautyDataHelper$PreloadState LOCAL_REQUESTING;
    public static final BeautyDataHelper$PreloadState LOCAL_SUCCESS;
    public static final BeautyDataHelper$PreloadState NOT_START;
    public static final BeautyDataHelper$PreloadState SERVER_FAILED;
    public static final BeautyDataHelper$PreloadState SERVER_REQUESTING;
    public static final BeautyDataHelper$PreloadState SERVER_SUCCESS;

    static {
       BeautyDataHelper$PreloadState preloadState1;
       BeautyDataHelper$PreloadState[] preloadState = new BeautyDataHelper$PreloadState[]{preloadState1,preloadState1,preloadState1,preloadState1,preloadState1,preloadState1,preloadState1};
       preloadState1 = new BeautyDataHelper$PreloadState("NOT_START", 0);
       BeautyDataHelper$PreloadState.NOT_START = preloadState1;
       preloadState1 = new BeautyDataHelper$PreloadState("SERVER_REQUESTING", 1);
       BeautyDataHelper$PreloadState.SERVER_REQUESTING = preloadState1;
       preloadState1 = new BeautyDataHelper$PreloadState("SERVER_SUCCESS", 2);
       BeautyDataHelper$PreloadState.SERVER_SUCCESS = preloadState1;
       preloadState1 = new BeautyDataHelper$PreloadState("SERVER_FAILED", 3);
       BeautyDataHelper$PreloadState.SERVER_FAILED = preloadState1;
       preloadState1 = new BeautyDataHelper$PreloadState("LOCAL_REQUESTING", 4);
       BeautyDataHelper$PreloadState.LOCAL_REQUESTING = preloadState1;
       preloadState1 = new BeautyDataHelper$PreloadState("LOCAL_SUCCESS", 5);
       BeautyDataHelper$PreloadState.LOCAL_SUCCESS = preloadState1;
       preloadState1 = new BeautyDataHelper$PreloadState("LOCAL_FAILED", 6);
       BeautyDataHelper$PreloadState.LOCAL_FAILED = preloadState1;
       BeautyDataHelper$PreloadState.$VALUES = preloadState;
    }
    public void BeautyDataHelper$PreloadState(String p0,int p1){
       super(p0, p1);
    }
    public static BeautyDataHelper$PreloadState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BeautyDataHelper$PreloadState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BeautyDataHelper$PreloadState.class, p0);
    }
    public static BeautyDataHelper$PreloadState[] values(){
       Object obj = PatchProxy.apply(null, null, BeautyDataHelper$PreloadState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BeautyDataHelper$PreloadState.$VALUES.clone();
    }
}
