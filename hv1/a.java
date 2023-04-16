package hv1.a;
import erd.g;
import hv1.b;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fv1.d;
import com.kuaishou.live.core.basic.model.TempIndicatorPendantConfig;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import mrd.a;
import java.util.Objects;
import z1.k;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import zsd.u;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting;
import kotlin.jvm.internal.a;

public final class a implements g	// class@002785
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       List list;
       List list1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          p0 = p0.mTempIndicatorPendantConfig;
          if (p0 != null) {
             TempIndicatorPendantConfig mGroupConfig = p0.mGroupConfigList;
             if (mGroupConfig != null) {
                list = ArraysKt___ArraysKt.uy(mGroupConfig);
                if (list != null) {
                label_0023 :
                   TempIndicatorPendantConfig mRejectionCo = p0.mRejectionConfigList;
                   if (mRejectionCo != null) {
                      list1 = ArraysKt___ArraysKt.uy(mRejectionCo);
                      if (list1 != null) {
                      label_0032 :
                         this.b.a.onNext(new d(list, list1));
                         a tb = this.b;
                         Objects.requireNonNull(tb);
                         if (!PatchProxy.applyVoidOneRefs(p0, tb, b.class, "4")) {
                            Object obj = tb.c.get();
                            String str = a.a.q(p0);
                            b.c0(LiveLogTag.LIVE_TOP_PENDANT, "LiveTempPlayPendantConfigManagerImpl", "configJsonString", str);
                            int i = (obj == null || u.S1(obj))? 1: 0;
                            if (!i) {
                               a.o(str, "configJsonString");
                               TroubleShooting.a.o(obj, "userIoStatus临时指示区挂件优先级配置", "接口", "", str);
                            }
                         }
                      }
                   }
                   list1 = CollectionsKt__CollectionsKt.E();
                   goto label_0032 ;
                }
             }
             list = CollectionsKt__CollectionsKt.E();
             goto label_0023 ;
          }
       }
       return;
    }
}
