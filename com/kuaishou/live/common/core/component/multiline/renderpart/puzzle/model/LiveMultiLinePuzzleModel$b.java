package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$b;
import erd.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class LiveMultiLinePuzzleModel$b implements g	// class@0015aa
{
    public final LiveMultiLinePuzzleModel b;

    public void LiveMultiLinePuzzleModel$b(LiveMultiLinePuzzleModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLinePuzzleModel$b.class, "1")) {
       }else {
          b.y(this.b.a, "query statistics fail", p0);
       }
       return;
    }
}
