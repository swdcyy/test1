package a94.b;
import com.yxcorp.gifshow.widget.m;
import a94.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ks3.a0;
import u84.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ks3.h;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.marketing.shop.auction.start.LiveAnchorStartAuctionFragment;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.marketing.shop.auction.start.LiveAnchorStartAuctionFragment$c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class b extends m	// class@000045
{
    public final a c;

    public void b(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b tc = this.c;
       Objects.requireNonNull(tc);
       a uoa = a.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, uoa, "11")) {
          ClientContent$LiveStreamPackage liveStreamPa = tc.v.a();
          int i = 3;
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, a.class, "5")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ADD_AUCTION";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(i, uElementPack, uContentPack);
          }
          int i1 = tc.s.k();
          if (i1 != -1) {
             if (i1 != 1 && (i1 != 2 && i1 != i)) {
                if (i1 == 4) {
                   a.g(MerchantMarketingShopLogBiz.AUCTION, "LiveAnchorAuctionPendantPresenter", "disallow auction when pk with popular anchor");
                }
             }else {
                i.d(R.style.arg_RES_7f11066a, "老铁拍开启失败，该类型直播间无法开启拍卖");
             }
          }else if(tc.q != null || PatchProxy.applyVoid(objArray, tc, uoa, "12")){
             LiveMerchantBaseContext liveMerchant = tc.s.a();
             a s = tc.s;
             a t = tc.t;
             LiveAnchorStartAuctionFragment liveAnchorSt = PatchProxy.applyThreeRefs(liveMerchant, s, t, null, LiveAnchorStartAuctionFragment.class, "1");
             if (liveAnchorSt != PatchProxyResult.class) {
             }else {
                Bundle uBundle = new Bundle();
                uBundle.putParcelable("KEY_LIVE_BASE_CONTEXT", b.c(liveMerchant));
                LiveAnchorStartAuctionFragment liveAnchorSt1 = new LiveAnchorStartAuctionFragment();
                liveAnchorSt1.setArguments(uBundle);
                liveAnchorSt = liveAnchorSt1.j;
                liveAnchorSt.c = s;
                liveAnchorSt.d = t;
                liveAnchorSt = liveAnchorSt1;
             }
             tc.s.l(liveAnchorSt);
          }
       }
    label_00b8 :
       return;
    }
}
