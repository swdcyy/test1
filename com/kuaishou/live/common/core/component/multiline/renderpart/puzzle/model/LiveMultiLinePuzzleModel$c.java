package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$c;
import lf3.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCLivePuzzleStatistics;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import lf3.f;

public final class LiveMultiLinePuzzleModel$c implements g	// class@0015ab
{
    public final LiveMultiLinePuzzleModel b;

    public void LiveMultiLinePuzzleModel$c(LiveMultiLinePuzzleModel p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLinePuzzleModel$c.class, "1")) {
       }else {
          b.P(this.b.a, "receive statistics");
          a.o(p0, "it");
          this.b.f(p0);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
