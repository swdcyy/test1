package m02.k;
import com.kuaishou.live.core.show.liveprivate.LiveAudiencePrivatePasswordFragment$b;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;

public final class k implements LiveAudiencePrivatePasswordFragment$b	// class@0030c8
{
    public final LivePlayActivity a;

    public void k(LivePlayActivity p0){
       this.a = p0;
    }
    public final void a(String p0){
       k ta = this.a;
       ta.z.mShouldAttachFragmentForLivePrivate = true;
       ta.A3(p0);
    }
}
