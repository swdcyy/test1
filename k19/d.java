package k19.d;
import erd.g;
import k19.k;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import k19.b;
import com.kwai.library.widget.viewpager.RecyclerViewPager$b;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo;
import com.yxcorp.gifshow.commercial.adsdk.model.AdUrlInfo;
import com.yxcorp.gifshow.photoad.model.AdUrlDataWrapper;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.l;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k19.i;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import mxb.k;
import msd.l;
import com.yxcorp.gifshow.photoad.e;
import com.yxcorp.gifshow.ad.AdProcess;

public final class d implements g	// class@002a7d
{
    public final k b;

    public void d(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo mUrl;
       d tb = this.b;
       int i = p0.intValue();
       Objects.requireNonNull(tb);
       k ok = k.class;
       if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, ok, "11")) {
          RecyclerViewPager$b uob = null;
          if (i == 3) {
             ok = tb.A;
             if (ok != null) {
                ok.d();
                tb.A.c(uob);
             }
             tb.V8();
             tb.a9(i, 0);
          }else {
             PhotoAdvertisement$MerchandiseInfo$DiscountInfo obj = tb.B.get(tb.D);
             int i1 = tb.S8(obj);
             if (i1 == 1) {
                uob = obj.mScheme;
                obj = obj.mUrl;
             }else if(i1 == 2){
                uob = obj.mScheme;
                mUrl = obj.mUrl;
             }else {
                mUrl = uob;
             }
             AdUrlInfo uAdUrlInfo = new AdUrlInfo();
             uAdUrlInfo.mScheme = uob;
             uAdUrlInfo.mUrl = obj;
             l.a.a(tb.getActivity(), new AdUrlDataWrapper(uAdUrlInfo, tb.p.mEntity), null, new i(tb, i), null, null);
          }
       }
       return;
    }
}
