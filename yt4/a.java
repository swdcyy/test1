package yt4.a;
import rq5.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import java.util.Arrays;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;

public abstract class a extends a	// class@003926
{

    public void a(){
       super();
    }
    public List c(){
       LivePendantRelation[] obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LivePendantRelation[9];
       obj[0] = LivePendantRelation.MERCHANT_INTERPRET;
       obj[1] = LivePendantRelation.SCORE_RANK;
       obj[2] = LivePendantRelation.ANSWERING_QUESTION;
       obj[3] = LivePendantRelation.PK_CRITICAL_HIT_ANIMATION;
       obj[4] = LivePendantRelation.LIVE_PK_RANK;
       obj[5] = LivePendantRelation.SCREEN_LANDSCAPE;
       obj[6] = LivePendantRelation.LIVE_BLIND;
       obj[7] = LivePendantRelation.LIVE_PLUS;
       obj[8] = LivePendantRelation.LIVE_PK_SMALL_WINDOW;
       return Arrays.asList(obj);
    }
    public LivePendantPriority f(){
       return LivePendantPriority.RECRUIT_INTERPRET;
    }
    public LivePendantRelation h(){
       return LivePendantRelation.RECRUIT_INTERPRET;
    }
}
