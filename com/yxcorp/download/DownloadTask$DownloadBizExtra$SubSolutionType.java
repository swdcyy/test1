package com.yxcorp.download.DownloadTask$DownloadBizExtra$SubSolutionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DownloadTask$DownloadBizExtra$SubSolutionType extends Enum	// class@0011ac
{
    public static final DownloadTask$DownloadBizExtra$SubSolutionType[] $VALUES;
    public static final DownloadTask$DownloadBizExtra$SubSolutionType Design;
    public static final DownloadTask$DownloadBizExtra$SubSolutionType Dynamic_KRN;
    public static final DownloadTask$DownloadBizExtra$SubSolutionType Dynamic_TK;
    public static final DownloadTask$DownloadBizExtra$SubSolutionType Dynamic_Yoda;
    public static final DownloadTask$DownloadBizExtra$SubSolutionType MMU;
    public static final DownloadTask$DownloadBizExtra$SubSolutionType Plugin;
    public static final DownloadTask$DownloadBizExtra$SubSolutionType Video;
    public static final DownloadTask$DownloadBizExtra$SubSolutionType Warmup;
    public static final DownloadTask$DownloadBizExtra$SubSolutionType Y_Tech;

    static {
       DownloadTask$DownloadBizExtra$SubSolutionType uDownloadBiz = new DownloadTask$DownloadBizExtra$SubSolutionType("Dynamic_Yoda", 0);
       DownloadTask$DownloadBizExtra$SubSolutionType.Dynamic_Yoda = uDownloadBiz;
       DownloadTask$DownloadBizExtra$SubSolutionType uDownloadBiz1 = new DownloadTask$DownloadBizExtra$SubSolutionType("Dynamic_KRN", 1);
       DownloadTask$DownloadBizExtra$SubSolutionType.Dynamic_KRN = uDownloadBiz1;
       DownloadTask$DownloadBizExtra$SubSolutionType uDownloadBiz2 = new DownloadTask$DownloadBizExtra$SubSolutionType("Dynamic_TK", 2);
       DownloadTask$DownloadBizExtra$SubSolutionType.Dynamic_TK = uDownloadBiz2;
       DownloadTask$DownloadBizExtra$SubSolutionType uDownloadBiz3 = new DownloadTask$DownloadBizExtra$SubSolutionType("Plugin", 3);
       DownloadTask$DownloadBizExtra$SubSolutionType.Plugin = uDownloadBiz3;
       DownloadTask$DownloadBizExtra$SubSolutionType uDownloadBiz4 = new DownloadTask$DownloadBizExtra$SubSolutionType("Warmup", 4);
       DownloadTask$DownloadBizExtra$SubSolutionType.Warmup = uDownloadBiz4;
       DownloadTask$DownloadBizExtra$SubSolutionType uDownloadBiz5 = new DownloadTask$DownloadBizExtra$SubSolutionType("Video", 5);
       DownloadTask$DownloadBizExtra$SubSolutionType.Video = uDownloadBiz5;
       DownloadTask$DownloadBizExtra$SubSolutionType uDownloadBiz6 = new DownloadTask$DownloadBizExtra$SubSolutionType("Y_Tech", 6);
       DownloadTask$DownloadBizExtra$SubSolutionType.Y_Tech = uDownloadBiz6;
       DownloadTask$DownloadBizExtra$SubSolutionType uDownloadBiz7 = new DownloadTask$DownloadBizExtra$SubSolutionType("MMU", 7);
       DownloadTask$DownloadBizExtra$SubSolutionType.MMU = uDownloadBiz7;
       DownloadTask$DownloadBizExtra$SubSolutionType uDownloadBiz8 = new DownloadTask$DownloadBizExtra$SubSolutionType("Design", 8);
       DownloadTask$DownloadBizExtra$SubSolutionType.Design = uDownloadBiz8;
       DownloadTask$DownloadBizExtra$SubSolutionType[] uDownloadBiz9 = new DownloadTask$DownloadBizExtra$SubSolutionType[9];
       uDownloadBiz9[0] = uDownloadBiz;
       uDownloadBiz9[1] = uDownloadBiz1;
       uDownloadBiz9[2] = uDownloadBiz2;
       uDownloadBiz9[3] = uDownloadBiz3;
       uDownloadBiz9[4] = uDownloadBiz4;
       uDownloadBiz9[5] = uDownloadBiz5;
       uDownloadBiz9[6] = uDownloadBiz6;
       uDownloadBiz9[7] = uDownloadBiz7;
       uDownloadBiz9[8] = uDownloadBiz8;
       DownloadTask$DownloadBizExtra$SubSolutionType.$VALUES = uDownloadBiz9;
    }
    public void DownloadTask$DownloadBizExtra$SubSolutionType(String p0,int p1){
       super(p0, p1);
    }
    public static DownloadTask$DownloadBizExtra$SubSolutionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DownloadTask$DownloadBizExtra$SubSolutionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DownloadTask$DownloadBizExtra$SubSolutionType.class, p0);
    }
    public static DownloadTask$DownloadBizExtra$SubSolutionType[] values(){
       Object obj = PatchProxy.apply(null, null, DownloadTask$DownloadBizExtra$SubSolutionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DownloadTask$DownloadBizExtra$SubSolutionType.$VALUES.clone();
    }
}
