package yb1.f;
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

public abstract class f extends a	// class@004805
{

    public void f(){
       super();
    }
    public List c(){
       LivePendantRelation[] obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LivePendantRelation[11];
       obj[0] = LivePendantRelation.MERCHANT_INTERPRET;
       obj[1] = LivePendantRelation.SCORE_RANK;
       obj[2] = LivePendantRelation.ANSWERING_QUESTION;
       obj[3] = LivePendantRelation.PK_CRITICAL_HIT_ANIMATION;
       obj[4] = LivePendantRelation.LIVE_PK_RANK;
       obj[5] = LivePendantRelation.SCREEN_LANDSCAPE;
       obj[6] = LivePendantRelation.LIVE_PK_SMALL_WINDOW;
       obj[7] = LivePendantRelation.LOCAL_LIFE_PENDANT;
       obj[8] = LivePendantRelation.LOCAL_LIFE_HOT_BUBBLE;
       obj[9] = LivePendantRelation.TUNA_EXPLAIN_PENDANT;
       obj[10] = LivePendantRelation.LIVE_PLUS;
       return Arrays.asList(obj);
    }
    public LivePendantPriority f(){
       return LivePendantPriority.LIVE_BLIND;
    }
    public LivePendantRelation h(){
       return LivePendantRelation.LIVE_BLIND;
    }
}
