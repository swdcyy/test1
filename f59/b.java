package f59.b;
import com.yxcorp.gifshow.ad.union.AdUnionShopCardView$a;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo;
import com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo$ShopInfo;

public final class b implements AdUnionShopCardView$a	// class@0022a3
{
    public final AdUnionHalfFollowFragment a;

    public void b(AdUnionHalfFollowFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       AdUnionHalfFollowFragment.mh(this.a, 141, 69, 16, false, 8, null);
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       b ta = this.a;
       AdUnionFollowInfo mShopInfo = AdUnionHalfFollowFragment.ch(ta).mShopInfo;
       if (mShopInfo != null) {
          objArray = mShopInfo.mShopLink;
       }
       ta.jh(objArray);
       AdUnionHalfFollowFragment.mh(this.a, 141, 19, 16, false, 8, null);
       return;
    }
}
