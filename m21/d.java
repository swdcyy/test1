package m21.d;
import android.view.View$OnClickListener;
import l12.c;
import m21.c$b;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m21.c;
import t02.a0;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;
import m21.b;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import java.util.Objects;
import m21.b$a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class d implements View$OnClickListener	// class@003112
{
    public final c b;
    public final int c;
    public final c$b d;
    public final LiveTimeConsumingUserStatusResponse e;

    public void d(c p0,int p1,c$b p2,LiveTimeConsumingUserStatusResponse p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "1")) {
          return;
       }
       c.P8(this.d.b).p2.r4(this.b.router, this.d.b.getContext());
       b$a a = b.a;
       a0 z2 = c.P8(this.d.b).Z2;
       a.o(z2, "mLivePlayCallerContext.mLiveBasicContext");
       ClientContent$LiveStreamPackage liveStreamPa = z2.a();
       a.o(liveStreamPa, "mLivePlayCallerContext.m¡­       .liveStreamPackage");
       String str = this.b.a();
       d tc = this.c;
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(b$a.class) || !PatchProxy.applyVoidThreeRefs(liveStreamPa, str, Integer.valueOf(tc), a, b$a.class, "2")) {
          a.p(liveStreamPa, "liveStreamPackage");
          a.p(str, "bizId");
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uClickEvent.elementPackage = uElementPack;
          uElementPack.action2 = "ROTATION_ACTIVITY_PENDANT";
          i3 oi3 = i3.f();
          oi3.c("index", Integer.valueOf(tc));
          oi3.d("biz_id", str);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uClickEvent.contentPackage = uContentPack;
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.a0(uClickEvent);
       }
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
