package b53.r0;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.barrage.q$a;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import kg1.g;
import com.kwai.live.gzone.barrage.LiveGzoneColorBarrageRight;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import b53.u0;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import e17.s$a;
import lnc.a1;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import e17.i;
import e17.s;
import b53.t0;
import y8c.d;
import mrd.a;

public final class r0 implements View$OnClickListener	// class@000321
{
    public final q$a b;

    public void r0(q$a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       r0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, q$a.class, "4")) {
       }else {
          boolean b = tb.P8();
          LiveFansGroupIntimacyInfo mStatus = tb.v.r1.Qi().mStatus;
          int i = b ^ 0x01;
          LiveGzoneColorBarrageRight mLevel = tb.u.mLevel;
          ClientContent$LiveStreamPackage liveStreamPa = tb.v.Z2.a();
          if (!PatchProxy.isSupport(u0.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(mStatus), Boolean.valueOf(i), Integer.valueOf(mLevel), liveStreamPa, null, u0.class, "5")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "COLORFUL_COMMENT_COLOR_PICK_BUTTON";
             uElementPack.params = u0.b(mStatus, i, mLevel);
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(true, uElementPack, uContentPack);
          }
          if (b) {
             s$a uoa = new s$a();
             uoa.g(true);
             s.o(a1.q(R.string.arg_RES_7f100767, tb.u.mLevel), null, uoa);
          }else {
             tb.t.a.onNext(Integer.valueOf(tb.s.get()));
          }
       }
       return;
    }
}
