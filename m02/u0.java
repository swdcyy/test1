package m02.u0;
import com.kuaishou.live.core.basic.player.LivePlayOptTextureView$a;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.activity.LivePlayStage;
import java.lang.System;
import m02.k1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;

public final class u0 implements LivePlayOptTextureView$a	// class@0030e4
{
    public final LivePlayFragment a;

    public void u0(LivePlayFragment p0){
       this.a = p0;
    }
    public final void a(){
       u0 ta = this.a;
       b.S(LivePlayFragment.K1, "LivePlayOptTextureView onTextureAvailableListener", "liveStreamId", ta.Ch());
       ta.T.a(LivePlayStage.PLAYER_VIEW_AVAILABLE, System.currentTimeMillis());
       if (PatchProxy.applyVoid(null, ta, LivePlayFragment.class, "1")) {
       }else if(ta.v1 == null){
          if (ta.getActivity() != null && !ta.getActivity().isFinishing()) {
             b.Z(LiveLogTag.PLAY_FRAGMENT, "initBizWorkWhenClickEnter");
             ta.Gh(false);
          }
          ta.v1 = false;
       }
       return;
    }
}
