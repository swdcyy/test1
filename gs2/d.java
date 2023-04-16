package gs2.d;
import erd.g;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.LiveVoicePartyEmptyRecommendView;
import java.lang.Object;
import java.lang.Throwable;

public final class d implements g	// class@002b92
{
    public final LiveVoicePartyEmptyRecommendView b;
    public final g c;

    public void d(LiveVoicePartyEmptyRecommendView p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       this.b.f = null;
       this.c.accept(null);
    }
}
