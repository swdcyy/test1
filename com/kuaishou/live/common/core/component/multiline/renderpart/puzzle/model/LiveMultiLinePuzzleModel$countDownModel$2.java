package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$countDownModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel;
import as1.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleLineChatStartInfo;
import java.lang.Long;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$countDownModel$2$1;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$countDownModel$2$a;
import java.lang.Runnable;

public final class LiveMultiLinePuzzleModel$countDownModel$2 extends Lambda implements a	// class@0015ae
{
    public final LiveMultiLinePuzzleModel this$0;

    public void LiveMultiLinePuzzleModel$countDownModel$2(LiveMultiLinePuzzleModel p0){
       this.this$0 = p0;
       super(0);
    }
    public final n invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLinePuzzleModel$countDownModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new n(Long.valueOf(this.this$0.q.queryStatisticsDeadline), new LiveMultiLinePuzzleModel$countDownModel$2$1(this), new LiveMultiLinePuzzleModel$countDownModel$2$a(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
