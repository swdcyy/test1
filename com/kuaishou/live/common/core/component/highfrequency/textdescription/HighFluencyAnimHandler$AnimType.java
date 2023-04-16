package com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyAnimHandler$AnimType;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyAnimHandler$AnimType$1;
import java.lang.String;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyAnimHandler$AnimType$2;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyAnimHandler$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedList;

public abstract class HighFluencyAnimHandler$AnimType extends Enum	// class@00133d
{
    public static final HighFluencyAnimHandler$AnimType[] $VALUES;
    public static final HighFluencyAnimHandler$AnimType Random;
    public static final HighFluencyAnimHandler$AnimType Uniform;

    static {
       HighFluencyAnimHandler$AnimType$1 uAnimType$1 = new HighFluencyAnimHandler$AnimType$1("Random", 0);
       HighFluencyAnimHandler$AnimType.Random = uAnimType$1;
       HighFluencyAnimHandler$AnimType$2 uAnimType$2 = new HighFluencyAnimHandler$AnimType$2("Uniform", 1);
       HighFluencyAnimHandler$AnimType.Uniform = uAnimType$2;
       HighFluencyAnimHandler$AnimType[] uAnimTypeArr = new HighFluencyAnimHandler$AnimType[]{uAnimType$1,uAnimType$2};
       HighFluencyAnimHandler$AnimType.$VALUES = uAnimTypeArr;
    }
    public void HighFluencyAnimHandler$AnimType(String p0,int p1){
       super(p0, p1);
    }
    public void HighFluencyAnimHandler$AnimType(String p0,int p1,HighFluencyAnimHandler$a p2){
       super(p0, p1);
    }
    public static HighFluencyAnimHandler$AnimType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HighFluencyAnimHandler$AnimType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HighFluencyAnimHandler$AnimType.class, p0);
    }
    public static HighFluencyAnimHandler$AnimType[] values(){
       Object obj = PatchProxy.apply(null, null, HighFluencyAnimHandler$AnimType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HighFluencyAnimHandler$AnimType.$VALUES.clone();
    }
    public abstract LinkedList computeSteps(int p0,int p1,int p2);
}
