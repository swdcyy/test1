package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$countDownModel$2$a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$countDownModel$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleState;
import as1.k;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleLineChatStartInfo;

public final class LiveMultiLinePuzzleModel$countDownModel$2$a implements Runnable	// class@0015ad
{
    public final LiveMultiLinePuzzleModel$countDownModel$2 b;

    public void LiveMultiLinePuzzleModel$countDownModel$2$a(LiveMultiLinePuzzleModel$countDownModel$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiLinePuzzleModel$countDownModel$2$a.class, "1")) {
          return;
       }
       LiveMultiLinePuzzleModel$countDownModel$2 this$0 = this.b.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(objArray, this$0, LiveMultiLinePuzzleModel.class, "12") && this$0.b.u() == LiveMultiLinePuzzleState.QUESTION) {
          this$0.g(this$0.q);
       }
       return;
    }
}
