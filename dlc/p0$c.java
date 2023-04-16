package dlc.p0$c;
import erd.g;
import dlc.p0;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.utility.NetworkUtilsCached;
import kotlin.jvm.internal.a;
import qvb.a;
import tkc.i;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.entity.TrendingTitleInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.TrendingListRequestInfo;
import com.yxcorp.utility.SystemUtil;
import o56.c;
import o56.a;
import e17.i;
import tkc.b;
import q87.c;
import qvb.q;
import qvb.n0;

public final class p0$c implements g	// class@002263
{
    public final p0 b;

    public void p0$c(p0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object obj = this;
       boolean b = p0.booleanValue();
       p0$c uoc = p0$c.class;
       if (PatchProxy.isSupport(uoc) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), obj, uoc, "1") && b)) {
          p0$c b1 = obj.b;
          Objects.requireNonNull(b1);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, b1, p0.class, "4") && NetworkUtilsCached.k()) {
             p0 p = b1.p;
             String str = "mTrendingListPageList";
             if (p == null) {
                a.S(str);
             }
             if (p.isEmpty()) {
                p = b1.p;
                if (p == null) {
                   a.S(str);
                }
                Objects.requireNonNull(p);
                Object[] objArray1 = PatchProxy.apply(objArray, p, i.class, "3");
                if (objArray1 != PatchProxyResult.class) {
                }else if(!q.f(p.q)){
                   TrendingTitleInfo trendingTitl = p.q.get(0);
                   if (trendingTitl != null && (p.p != null && (!TextUtils.x(trendingTitl.mTrendingType) && !(trendingTitl.mTrendingType).equals(p.p.mTrendingType)))) {
                      objArray = new i();
                      i p1 = p.p;
                      TrendingListRequestInfo trendingList = new TrendingListRequestInfo(p1.mPhotoId, trendingTitl.mTrendingType, p1.mCurrentPlayTrendingInfoId, p1.mTrendingRequestSource, p1.mTrendingRequestListInfo, p1.mCurrentPlayTrendingInfoType, p1.mIsRisingTrending, p1.mTrendingSource, p1.mLocation);
                      objArray.l2(v5);
                   }
                }
             label_00b3 :
                objArray1 = objArray;
                b1.s = objArray1;
                if (objArray1 != null) {
                   if (SystemUtil.K()) {
                      c uoc1 = a.a();
                      a.o(uoc1, "AppEnv.get\(\)");
                      if (uoc1.c()) {
                         i.d(R.style.arg_RES_7f11066a, "当前热词已下线，且本地榜为空");
                      }
                   }
                   objArray = new Object[0];
                   b.C().w("MilanoTrendingEmptyChangeTabPresenter", "trendingId expire, current list is empty", objArray);
                   p = b1.s;
                   if (p != null) {
                      p.h(b1.t);
                   }
                   p0 s = b1.s;
                   if (s != null) {
                      s.a();
                   }
                }
             }
          }
       }
    label_00f2 :
       return;
    }
}
