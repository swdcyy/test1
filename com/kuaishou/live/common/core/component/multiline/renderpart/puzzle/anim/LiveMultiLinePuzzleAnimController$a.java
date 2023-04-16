package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController;
import java.lang.Object;
import yr1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnimController$bindAnimViewModel$1$1;
import msd.a;

public final class LiveMultiLinePuzzleAnimController$a implements Observer	// class@001597
{
    public final LiveMultiLinePuzzleAnimController b;

    public void LiveMultiLinePuzzleAnimController$a(LiveMultiLinePuzzleAnimController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLinePuzzleAnimController$a.class, "1")) {
       }else {
          p0.a(new LiveMultiLinePuzzleAnimController$bindAnimViewModel$1$1(this));
       }
       return;
    }
}
