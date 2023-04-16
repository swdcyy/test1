package com.kuaishou.android.vader.Algorithm;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Algorithm extends Enum	// class@000704
{
    public int value;
    public static final Algorithm[] $VALUES;
    public static final Algorithm GZIP;
    public static final Algorithm NO_COMPRESS;

    static {
       Algorithm uAlgorithm = new Algorithm("NO_COMPRESS", 0, 0);
       Algorithm.NO_COMPRESS = uAlgorithm;
       Algorithm uAlgorithm1 = new Algorithm("GZIP", 1, 1);
       Algorithm.GZIP = uAlgorithm1;
       Algorithm[] uAlgorithmAr = new Algorithm[]{uAlgorithm,uAlgorithm1};
       Algorithm.$VALUES = uAlgorithmAr;
    }
    public void Algorithm(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Algorithm valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Algorithm.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Algorithm.class, p0);
    }
    public static Algorithm[] values(){
       Object obj = PatchProxy.apply(null, null, Algorithm.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Algorithm.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
