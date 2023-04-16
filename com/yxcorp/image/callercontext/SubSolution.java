package com.yxcorp.image.callercontext.SubSolution;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SubSolution extends Enum	// class@001a01
{
    public static final SubSolution[] $VALUES;
    public static final SubSolution Design;
    public static final SubSolution KRN;
    public static final SubSolution MMU;
    public static final SubSolution Plugin;
    public static final SubSolution TK;
    public static final SubSolution Unknown;
    public static final SubSolution Video;
    public static final SubSolution Warmup;
    public static final SubSolution YTech;
    public static final SubSolution Yoda;

    static {
       SubSolution subSolution = new SubSolution("Unknown", 0);
       SubSolution.Unknown = subSolution;
       SubSolution subSolution1 = new SubSolution("Yoda", 1);
       SubSolution.Yoda = subSolution1;
       SubSolution subSolution2 = new SubSolution("KRN", 2);
       SubSolution.KRN = subSolution2;
       SubSolution subSolution3 = new SubSolution("TK", 3);
       SubSolution.TK = subSolution3;
       SubSolution subSolution4 = new SubSolution("Plugin", 4);
       SubSolution.Plugin = subSolution4;
       SubSolution subSolution5 = new SubSolution("Warmup", 5);
       SubSolution.Warmup = subSolution5;
       SubSolution subSolution6 = new SubSolution("Video", 6);
       SubSolution.Video = subSolution6;
       SubSolution subSolution7 = new SubSolution("YTech", 7);
       SubSolution.YTech = subSolution7;
       SubSolution subSolution8 = new SubSolution("MMU", 8);
       SubSolution.MMU = subSolution8;
       SubSolution subSolution9 = new SubSolution("Design", 9);
       SubSolution.Design = subSolution9;
       SubSolution[] subSolutionA = new SubSolution[10];
       subSolutionA[0] = subSolution;
       subSolutionA[1] = subSolution1;
       subSolutionA[2] = subSolution2;
       subSolutionA[3] = subSolution3;
       subSolutionA[4] = subSolution4;
       subSolutionA[5] = subSolution5;
       subSolutionA[6] = subSolution6;
       subSolutionA[7] = subSolution7;
       subSolutionA[8] = subSolution8;
       subSolutionA[9] = subSolution9;
       SubSolution.$VALUES = subSolutionA;
    }
    public void SubSolution(String p0,int p1){
       super(p0, p1);
    }
    public static SubSolution valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubSolution.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SubSolution.class, p0);
    }
    public static SubSolution[] values(){
       Object obj = PatchProxy.apply(null, null, SubSolution.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubSolution.$VALUES.clone();
    }
}
