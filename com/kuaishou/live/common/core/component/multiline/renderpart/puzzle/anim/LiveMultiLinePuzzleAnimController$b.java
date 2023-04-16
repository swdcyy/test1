package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController$b;
import erd.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController;
import java.lang.Object;
import nh3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveMultiLinePuzzleAnimController$b implements g	// class@001599
{
    public final LiveMultiLinePuzzleAnimController b;

    public void LiveMultiLinePuzzleAnimController$b(LiveMultiLinePuzzleAnimController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLinePuzzleAnimController$b.class, "1")) {
       }else if(p0 != null){
          p0 = this.b;
          if (p0.l == null) {
             p0.V2();
             p0.l = true;
          }
       }
       return;
    }
}
