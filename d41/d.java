package d41.d;
import erd.g;
import d41.e;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import fu4.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lm3.b;

public final class d implements g	// class@001f06
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       b uob = tb.a9();
       b uob1 = PatchProxy.applyOneRefs(p0, tb, e.class, "6");
       if (uob1 != PatchProxyResult.class) {
       }else {
          uob1 = new b();
          uob1.mLiveFellowInfo = p0.mLiveFellowInfo;
          uob1.mLiveRecruitQuestionnaireConfig = p0.mLiveRecruitQuestionnaireConfig;
          uob1.mLiveRecruitAppliedJobIds = p0.mLiveRecruitAppliedJobIds;
       }
       uob.Uc(uob1);
       return;
    }
}
