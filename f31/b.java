package f31.b;
import ok.x;
import java.lang.Object;
import androidx.collection.ArrayMap;
import java.lang.String;
import v91.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.common.base.Optional;
import androidx.collection.SimpleArrayMap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import j21.b;
import ok.h;
import f31.a;
import java.util.Map;
import d61.r;
import com.kuaishou.live.core.basic.model.LiveAudienceTaskConfig;
import v91.d;
import v91.a;
import v91.n;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.k;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FreezeConfig;
import com.kuaishou.livestream.message.nano.LiveUserTaskProto$LiveUserTaskCommonRouteModel;

public class b	// class@0022b0
{
    public final x a;
    public final ArrayMap b;

    public void b(x p0){
       super();
       this.b = new ArrayMap();
       this.a = p0;
    }
    public final void a(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       this.b.put(p0, Optional.of(p1));
       return;
    }
    public boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c(p0).transform(b.b).or(Boolean.FALSE).booleanValue();
    }
    public final Optional c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r.b(this.b, p0, new a(this, p0));
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       Optional optional = this.c(p0);
       if (optional.isPresent()) {
          optional.get().a();
       }
       return;
    }
    public void e(LiveAudienceTaskConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       d uod = a.b();
       LiveMessageFrequencyConfig$FrequencyConfig uFrequencyCo = n.d(p0.mBizId).orNull();
       k ok = null;
       if (uFrequencyCo != null && (uFrequencyCo.mAppearTimesByColdTime > null && uFrequencyCo.mAppearColdTimeSpan - ok > 0)) {
          uod.c(new k(p0.mBizId+"_daily_"+QCurrentUser.me().getId(), uFrequencyCo.mAppearColdTimeSpan, uFrequencyCo.mAppearTimesByColdTime));
       }
    label_0053 :
       LiveMessageFrequencyConfig$FreezeConfig uFreezeConfi = n.c(p0.mBizId).orNull();
       if (uFreezeConfi != null && uFreezeConfi.mMessageColdTimeMs - ok > 0) {
          uod.c(new k(p0.mBizId+"_interval_"+QCurrentUser.me().getId(), uFreezeConfi.mMessageColdTimeMs, 1));
       }
       this.a(p0.mBizId, uod);
       return;
    }
    public void f(LiveUserTaskProto$LiveUserTaskCommonRouteModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       d uod = a.b();
       LiveMessageFrequencyConfig$FrequencyConfig uFrequencyCo = n.d(p0.bizId).orNull();
       if (uFrequencyCo != null && (uFrequencyCo.mAppearTimesByColdTime > null && uFrequencyCo.mAppearColdTimeSpan - null > 0)) {
          uod.c(new k(p0.bizId+"_daily_"+QCurrentUser.me().getId(), uFrequencyCo.mAppearColdTimeSpan, uFrequencyCo.mAppearTimesByColdTime));
       }
    label_0056 :
       if (p0.bizType == 1) {
          uod.c(new k(p0.bizId+"_forever_"+QCurrentUser.me().getId(), Long.MAX_VALUE, 3));
       }
       this.a(p0.bizId, uod);
       return;
    }
}
