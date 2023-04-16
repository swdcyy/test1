package ag4.d$a;
import pk0.a;
import ag4.d;
import java.lang.Object;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uf4.b;
import uf4.a;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;
import ekd.q;
import com.kuaishou.merchant.transaction.detail.detailv2.base.model.DetailStock;
import com.kuaishou.merchant.transaction.detail.self.dynamic.model.DetailCommonData;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.ItemInfo;
import java.lang.Integer;
import cjd.e;
import erd.o;
import com.kuaishou.merchant.transaction.detail.net.a;

public final class d$a implements a	// class@0000c0
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public final t a(Object p0){
       d h;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       String obj = PatchProxy.applyOneRefs(p0, this, d$a.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.a();
       d$a ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       d uod = PatchProxy.apply(objArray, ta, d.class, str);
       if (uod != patchProxyRe) {
       }else if(q.h(ta.e)){
          ta.e.putAll(ta.f);
          ta.e.remove(ta.d);
       }
       if (!ta.e.containsKey(ta.b)) {
          h = ta.h;
          if (h != null) {
             ta.e.put(ta.b, String.valueOf(h.mSellerId));
          }
       }
       h = ta.e;
       uod = ta.c;
       d g = ta.g;
       if (g != null) {
          DetailCommonData mItemInfo = g.mItemInfo;
          if (mItemInfo != null) {
             objArray = Integer.valueOf(mItemInfo.mItemSaleType);
          }
       }
       h.put(uod, String.valueOf(objArray));
       uod = ta.e;
       return obj.a(p0, uod).map(new e()).map(new a());
    }
}
