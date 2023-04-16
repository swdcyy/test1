package l90.e;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Long;
import y80.f;
import t36.f$a;
import t36.f;
import java.util.List;
import y80.b;
import t45.d;
import brd.z;
import y80.g;

public final class e implements o	// class@002531
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object apply(Object p0){
       KSDataManager kSDataManage = KSDataManager.B0();
       Objects.requireNonNull(kSDataManage);
       t ot = PatchProxy.applyOneRefs(p0, kSDataManage, KSDataManager.class, "44");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "templateInfo");
          ArrayList uArrayList = new ArrayList();
          KSTemplateDetailInfo mTemplateId = p0.mTemplateId;
          a.o(mTemplateId, "templateInfo.mTemplateId");
          uArrayList.add(Long.valueOf(Long.parseLong(mTemplateId)));
          kSDataManage.s0(new f(p0));
          ot = kSDataManage.k.c(uArrayList).observeOn(d.a).map(g.b);
          a.o(ot, "mKSDataAPIProvider.delet¡­it.mResult == 1\n        }");
       }
       return ot;
    }
}
