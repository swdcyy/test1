package kh9.a$c;
import erd.o;
import kh9.a;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateSearchResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import k90.a;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a;
import kh9.a$b;

public final class a$c implements o	// class@002c8c
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       String str = "1";
       a obj = PatchProxy.applyOneRefs(p0, this, a$c.class, str);
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "response");
          this.b.r.a = p0.getMHasSearchResult();
          obj = this.b.r;
          List mTemplateLis = p0.getMTemplateList();
          Objects.requireNonNull(mTemplateLis, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo> /* = java.util.ArrayList<com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo> */");
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidOneRefs(mTemplateLis, obj, a.class, str)) {
             a.p(mTemplateLis, "<set-?>");
             obj.b = mTemplateLis;
          }
          KSDataManager kSDataManage = KSDataManager.q.a();
          a r = this.b.r;
          Objects.requireNonNull(kSDataManage);
          if (!PatchProxy.applyVoidOneRefs(r, kSDataManage, KSDataManager.class, "38")) {
             a.p(r, "searchData");
             kSDataManage.o = r;
          }
          obj = this.b.q;
          if (obj != null) {
             obj.a();
          }
       }
       return p0;
    }
}
