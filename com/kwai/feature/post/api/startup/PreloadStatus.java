package com.kwai.feature.post.api.startup.PreloadStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PreloadStatus extends Enum	// class@00143d
{
    public static final PreloadStatus[] $VALUES;
    public static final PreloadStatus CONSUME_DAY;
    public static final PreloadStatus CONSUME_LAUNCH;
    public static final PreloadStatus INSTALLING;
    public static final PreloadStatus INVALID_DAY;
    public static final PreloadStatus INVALID_LAUNCH;
    public static final PreloadStatus START;

    static {
       PreloadStatus preloadStatu1;
       PreloadStatus[] preloadStatu = new PreloadStatus[]{preloadStatu1,preloadStatu1,preloadStatu1,preloadStatu1,preloadStatu1,preloadStatu1};
       preloadStatu1 = new PreloadStatus("START", 0);
       PreloadStatus.START = preloadStatu1;
       preloadStatu1 = new PreloadStatus("CONSUME_LAUNCH", 1);
       PreloadStatus.CONSUME_LAUNCH = preloadStatu1;
       preloadStatu1 = new PreloadStatus("CONSUME_DAY", 2);
       PreloadStatus.CONSUME_DAY = preloadStatu1;
       preloadStatu1 = new PreloadStatus("INVALID_LAUNCH", 3);
       PreloadStatus.INVALID_LAUNCH = preloadStatu1;
       preloadStatu1 = new PreloadStatus("INVALID_DAY", 4);
       PreloadStatus.INVALID_DAY = preloadStatu1;
       preloadStatu1 = new PreloadStatus("INSTALLING", 5);
       PreloadStatus.INSTALLING = preloadStatu1;
       PreloadStatus.$VALUES = preloadStatu;
    }
    public void PreloadStatus(String p0,int p1){
       super(p0, p1);
    }
    public static PreloadStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PreloadStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PreloadStatus.class, p0);
    }
    public static PreloadStatus[] values(){
       Object obj = PatchProxy.apply(null, null, PreloadStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PreloadStatus.$VALUES.clone();
    }
}
