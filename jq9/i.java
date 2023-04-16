package jq9.i;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$CoronaTVWatchHistoryRecord;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta;
import jq9.h;

public final class i	// class@002b48
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public final CoronaCommonMeta$CoronaTVWatchHistoryRecord a(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          CommonMeta uCommonMeta = p0.a(CommonMeta.class);
          if (uCommonMeta != null) {
             CoronaCommonMeta uCoronaCommo = h.b(uCommonMeta);
             if (uCoronaCommo != null) {
                uCoronaCommo = uCoronaCommo.mTVWatchRecord;
             label_0025 :
                return uCoronaCommo;
             }
          }
       }
       CoronaCommonMeta$CoronaTVWatchHistoryRecord uCoronaTVWat = null;
       goto label_0025 ;
    }
    public final void b(BaseFeed p0,CoronaCommonMeta$CoronaTVWatchHistoryRecord p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "1")) {
          return;
       }
       if (p0 != null) {
          CommonMeta uCommonMeta = p0.a(CommonMeta.class);
          if (uCommonMeta != null) {
             CoronaCommonMeta uCoronaCommo = h.b(uCommonMeta);
             if (uCoronaCommo != null) {
                uCoronaCommo.mTVWatchRecord = p1;
             }
          }
       }
       return;
    }
}
