package e73.k;
import z1.a;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter;
import java.lang.Object;
import com.kuaishou.live.lite.adapter.component.fansgroup.http.LiveLiteFansGroupJoinResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import java.lang.Integer;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;

public final class k implements a	// class@00269e
{
    public final LiveLiteFansGroupPresenter a;

    public void k(LiveLiteFansGroupPresenter p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       LiveLiteFansGroupPresenter k;
       Integer integer1;
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          k = this.a.K;
          Integer integer = null;
          if (p0 != null) {
             LiveLiteFansGroupJoinResponse mIntimacyInf = p0.mIntimacyInfo;
             if (mIntimacyInf != null) {
                integer1 = Integer.valueOf(mIntimacyInf.mLevel);
             label_0020 :
                if (p0 != null) {
                   p0 = p0.mIntimacyInfo;
                   if (p0 != null) {
                      integer = Integer.valueOf(p0.mStatus);
                   }
                }
                k.s(integer1, integer);
             }
          }
          integer1 = integer;
          goto label_0020 ;
       }
       return;
    }
}
