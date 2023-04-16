package bg3.b;
import android.view.View$OnClickListener;
import bg3.e;
import com.kuaishou.live.merchant.chain.model.LiveMerchantChainPhotoFeedResponse$ChainBottomConfig;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import t02.a0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ag3.a;
import com.kuaishou.merchant.router.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import zf3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import k2b.u1;

public final class b implements View$OnClickListener	// class@00039d
{
    public final e b;
    public final LiveMerchantChainPhotoFeedResponse$ChainBottomConfig c;

    public void b(e p0,LiveMerchantChainPhotoFeedResponse$ChainBottomConfig p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (!TextUtils.x(this.c.mMoreZoneJumpUrl)) {
          b.o(tb.p.j1(), tb.getActivity(), tb.q.h2().mMoreZoneJumpUrl);
       }
       e p = tb.p;
       LiveStreamFeedWrapper mEntity = p.c.mEntity;
       ClientContent$LiveStreamPackage liveStreamPa = p.Z2.a();
       if (!PatchProxy.isSupport(a.class) || (!PatchProxy.applyVoidThreeRefs(mEntity, liveStreamPa, Integer.valueOf(7), null, a.class, "6") && mEntity != null)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MERCHANT_MORE_RACE_BUTTON";
          u1.B(new ClickMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(a.a(mEntity, liveStreamPa, 7)).setFeedLogCtx(r1.O0(mEntity)));
       }
       return;
    }
}
