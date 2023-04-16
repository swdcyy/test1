package im1.e$d;
import com.yxcorp.gifshow.widget.m;
import im1.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveRampageTimeMessage$LiveRampageTimeInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import im1.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import k2b.u1;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;

public class e$d extends m	// class@00294d
{
    public final e c;

    public void e$d(e p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$d.class, "1")) {
          return;
       }
       e u = this.c.U;
       if (u != null && !TextUtils.x(u.route)) {
          ClientContent$LiveStreamPackage liveStreamPa = this.c.r.a();
          e$d tc = this.c;
          LiveRampageTimeMessage$LiveRampageTimeInfo giftId = tc.U.giftId;
          e q = tc.Q;
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(liveStreamPa, Integer.valueOf(giftId), Integer.valueOf(q), null, a.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "GIFT_RAMPAGE_PENDANT";
             i3 oi3 = i3.f();
             oi3.d("gift_time", a.a(q));
             uElementPack.params = oi3.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
             giftPackage.identity = String.valueOf(giftId);
             uContentPack.giftPackage = giftPackage;
             u1.u(1, uElementPack, uContentPack);
          }
          e$d tc1 = this.c;
          tc1.t.r4(tc1.U.route, tc1.getContext());
       }
       return;
    }
}
