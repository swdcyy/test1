package jq9.h;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.corona.common.model.CoronaCaption;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta;
import fa6.a;
import com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo;
import java.lang.Number;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$OwnerCount;
import java.lang.Integer;

public final class h	// class@002b46
{

    public static final CoronaCaption a(CommonMeta p0){
       CoronaCommonMeta uCoronaCommo = null;
       Object obj = PatchProxy.applyOneRefs(p0, uCoronaCommo, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$coronaCaption");
       CoronaCommonMeta uCoronaCommo1 = h.b(p0);
       if (uCoronaCommo1 != null) {
          uCoronaCommo = uCoronaCommo1.mCoronaCaption;
       }
       return uCoronaCommo;
    }
    public static final CoronaCommonMeta b(CommonMeta p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, h.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(p0, "$this$coronaCommonMeta");
       p0 = p0.getPartData("coronaCommonModel");
       if (p0 instanceof CoronaCommonMeta) {
          obj = p0;
       }
       return obj;
    }
    public static final CoronaCoverInfo c(CommonMeta p0){
       CoronaCommonMeta uCoronaCommo = null;
       Object obj = PatchProxy.applyOneRefs(p0, uCoronaCommo, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$coronaCoverInfo");
       CoronaCommonMeta uCoronaCommo1 = h.b(p0);
       if (uCoronaCommo1 != null) {
          uCoronaCommo = uCoronaCommo1.mCoronaCoverInfo;
       }
       return uCoronaCommo;
    }
    public static final int d(CommonMeta p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, null, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "$this$coronaShowFlag");
       CoronaCommonMeta uCoronaCommo = h.b(p0);
       uCoronaCommo = (uCoronaCommo != null)? uCoronaCommo.mCoronaShowFlag: 0;
       return uCoronaCommo;
    }
    public static final CoronaCommonMeta$OwnerCount e(CommonMeta p0){
       CoronaCommonMeta uCoronaCommo = null;
       Object obj = PatchProxy.applyOneRefs(p0, uCoronaCommo, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$ownercount");
       CoronaCommonMeta uCoronaCommo1 = h.b(p0);
       if (uCoronaCommo1 != null) {
          uCoronaCommo = uCoronaCommo1.mOwnerCount;
       }
       return uCoronaCommo;
    }
    public static final void f(CommonMeta p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oh, "6")) {
          return;
       }
       a.p(p0, "$this$coronaShowFlag");
       CoronaCommonMeta uCoronaCommo = h.b(p0);
       if (uCoronaCommo != null) {
          uCoronaCommo.mCoronaShowFlag = p1;
       }
       return;
    }
}
