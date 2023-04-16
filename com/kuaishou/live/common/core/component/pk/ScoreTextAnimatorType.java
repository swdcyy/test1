package com.kuaishou.live.common.core.component.pk.ScoreTextAnimatorType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ScoreTextAnimatorType extends Enum	// class@001730
{
    public int scoreTextAnimatorType;
    public static final ScoreTextAnimatorType[] $VALUES;
    public static final ScoreTextAnimatorType LARGE;
    public static final ScoreTextAnimatorType NONE;
    public static final ScoreTextAnimatorType SMALL;

    static {
       ScoreTextAnimatorType scoreTextAni = new ScoreTextAnimatorType("NONE", 0, -1);
       ScoreTextAnimatorType.NONE = scoreTextAni;
       ScoreTextAnimatorType scoreTextAni1 = new ScoreTextAnimatorType("SMALL", 1, 0);
       ScoreTextAnimatorType.SMALL = scoreTextAni1;
       ScoreTextAnimatorType scoreTextAni2 = new ScoreTextAnimatorType("LARGE", 2, 1);
       ScoreTextAnimatorType.LARGE = scoreTextAni2;
       ScoreTextAnimatorType[] scoreTextAni3 = new ScoreTextAnimatorType[]{scoreTextAni,scoreTextAni1,scoreTextAni2};
       ScoreTextAnimatorType.$VALUES = scoreTextAni3;
    }
    public void ScoreTextAnimatorType(String p0,int p1,int p2){
       super(p0, p1);
       this.scoreTextAnimatorType = -1;
       this.scoreTextAnimatorType = p2;
    }
    public static ScoreTextAnimatorType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ScoreTextAnimatorType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ScoreTextAnimatorType.class, p0);
    }
    public static ScoreTextAnimatorType[] values(){
       Object obj = PatchProxy.apply(null, null, ScoreTextAnimatorType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ScoreTextAnimatorType.$VALUES.clone();
    }
    public int getScoreTextAnimatorType(){
       return this.scoreTextAnimatorType;
    }
}
