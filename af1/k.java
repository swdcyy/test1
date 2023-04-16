package af1.k;
import java.lang.String;
import java.lang.Object;
import androidx.collection.ArrayMap;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig;
import java.lang.reflect.Type;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import x51.b;
import v91.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import v91.d;
import v91.a;
import v91.h;
import v91.k;
import df1.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import ekd.q;
import com.google.common.base.Optional;
import v91.n;
import androidx.collection.SimpleArrayMap;
import java.lang.StringBuilder;

public class k	// class@000075
{
    public final String a;
    public final LiveMessageFrequencyConfig b;
    public final ArrayMap c;

    public void k(String p0){
       super();
       this.c = new ArrayMap();
       this.a = p0;
       this.b = a.t().u("SOURCE_LIVE").getValue("frequencyConfig", LiveMessageFrequencyConfig.class, null);
    }
    public final b a(LiveMessageFrequencyConfig$FrequencyConfig p0,String p1,String p2,b p3){
       d obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.b();
       LiveMessageFrequencyConfig$FrequencyConfig mAppearTimes = p0.mAppearTimesByLiveStream;
       if (mAppearTimes > null) {
          obj.c(new h(p2, mAppearTimes));
       }
       LiveMessageFrequencyConfig$FrequencyConfig mAppearTimes1 = p0.mAppearTimesByColdTime;
       if (mAppearTimes1 > null) {
          LiveMessageFrequencyConfig$FrequencyConfig mAppearColdT = p0.mAppearColdTimeSpan;
          if (mAppearColdT > 0) {
             k ok = new k(p1, mAppearColdT, mAppearTimes1, p3);
             obj.c(mAppearColdT);
          }
       }
       return obj;
    }
    public boolean b(c p0){
       LiveMessageFrequencyConfig$FrequencyConfig obj = PatchProxy.applyOneRefs(p0, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!p0.j()) {
          return b;
       }
       if (!this.c(p0)) {
          return false;
       }
       obj = this.d(p0);
       if (obj == null) {
          b.c0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "tryConsumeMessageFrequencyFail, config not found", "message", p0.h());
          return false;
       }else {
          b uob = this.e(p0, obj);
          if (uob == null || !uob.b()) {
             b = false;
          }
          return b;
       }
    }
    public final boolean c(c p0){
       p0 = PatchProxy.applyOneRefs(p0, this, k.class, "6");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = false;
       k tb = this.b;
       if (tb != null && !q.f(tb.mFrequencyConfigs)) {
          return true;
       }
       b.Z(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "tryConsumeMessageFrequencyFail, frequencyConfig is null");
       return b;
    }
    public final LiveMessageFrequencyConfig$FrequencyConfig d(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return n.d(p0.h()).orNull();
    }
    public final b e(c p0,LiveMessageFrequencyConfig$FrequencyConfig p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, ok, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.g();
       if (this.c.containsKey(obj)) {
          return this.c.get(obj);
       }
       String str = PatchProxy.applyOneRefs(p0, this, ok, "4");
       if (str != patchProxyRe) {
       }else {
          str = this.a+"_"+p0.g();
       }
       b uob = this.a(p1, obj, str, b.b());
       this.c.put(obj, uob);
       return uob;
    }
}
