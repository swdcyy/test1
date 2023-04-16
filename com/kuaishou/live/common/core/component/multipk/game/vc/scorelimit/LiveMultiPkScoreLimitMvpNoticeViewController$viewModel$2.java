package com.kuaishou.live.common.core.component.multipk.game.vc.scorelimit.LiveMultiPkScoreLimitMvpNoticeViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkBottomTip;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multipk.game.vc.scorelimit.LiveMultiPkScoreLimitMvpNoticeViewController$viewModel$2$1;
import com.kuaishou.live.common.core.component.multipk.game.vc.scorelimit.LiveMultiPkScoreLimitMvpNoticeViewController$viewModel$2$a;

public final class LiveMultiPkScoreLimitMvpNoticeViewController$viewModel$2 extends Lambda implements a	// class@001646
{
    public final LiveMultiPkBottomTip $bottomTip;

    public void LiveMultiPkScoreLimitMvpNoticeViewController$viewModel$2(LiveMultiPkBottomTip p0){
       this.$bottomTip = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkScoreLimitMvpNoticeViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMultiPkScoreLimitMvpNoticeViewController$viewModel$2$a(new LiveMultiPkScoreLimitMvpNoticeViewController$viewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
