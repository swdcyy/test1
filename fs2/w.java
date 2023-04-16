package fs2.w;
import erd.g;
import fs2.x;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.LiveVoicePartyEmptyRecommendView;
import android.view.ViewGroup;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.LinearLayout;

public final class w implements g	// class@0029be
{
    public final x b;
    public final LiveVoicePartyEmptyRecommendView c;
    public final ViewGroup d;

    public void w(x p0,LiveVoicePartyEmptyRecommendView p1,ViewGroup p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       p0 = this.b;
       w tc = this.c;
       Objects.requireNonNull(p0);
       b.Z(LiveVoicePartyLogTag.KTV, "LiveVoicePartyStageView really showEmptyView "+tc);
       this.d.setVisibility(0);
       tc.setVisibility(8);
       p0.a();
    }
}
