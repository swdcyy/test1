package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.toptag.LiveAudienceMultiLinePuzzleTagDataBinding$bindViewModel$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceMultiLinePuzzleTagDataBinding$bindViewModel$1 extends Lambda implements p	// class@0015b1
{
    public static final LiveAudienceMultiLinePuzzleTagDataBinding$bindViewModel$1 INSTANCE;

    static {
       LiveAudienceMultiLinePuzzleTagDataBinding$bindViewModel$1.INSTANCE = new LiveAudienceMultiLinePuzzleTagDataBinding$bindViewModel$1();
    }
    public void LiveAudienceMultiLinePuzzleTagDataBinding$bindViewModel$1(){
       super(2);
    }
    public final Integer invoke(boolean p0,Integer p1){
       if (PatchProxy.isSupport(LiveAudienceMultiLinePuzzleTagDataBinding$bindViewModel$1.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, LiveAudienceMultiLinePuzzleTagDataBinding$bindViewModel$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p0) {
          p1 = Integer.valueOf(0);
       }
       return p1;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0.booleanValue(), p1);
    }
}
