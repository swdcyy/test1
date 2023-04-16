package bg3.m;
import android.view.View$OnClickListener;
import bg3.n;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import zf3.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import k2b.u1;
import cq5.a;

public final class m implements View$OnClickListener	// class@0003ad
{
    public final n b;

    public void m(n p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, n.class, "9")) {
       }else {
          n p = tb.p;
          LiveStreamFeedWrapper mEntity = p.c.mEntity;
          BaseFragment uBaseFragmen = p.Z2.b();
          ClientContent$LiveStreamPackage liveStreamPa = tb.p.Z2.a();
          if (!PatchProxy.isSupport(a.class) || (!PatchProxy.applyVoidFourRefs(mEntity, uBaseFragmen, liveStreamPa, Integer.valueOf(7), null, a.class, "2") && mEntity != null)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MERCHANT_MORELIST_BUTTON";
             u1.B(new ClickMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(a.a(mEntity, liveStreamPa, 7)).setLogPage(uBaseFragmen).setFeedLogCtx(r1.O0(mEntity)));
          }
          n v = tb.v;
          if (v != null) {
             v.d();
          }
       }
       return;
    }
}
