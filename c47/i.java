package c47.i;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.commandlottery.a;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import e47.a;
import e47.a$a;
import c47.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import jga.f$a;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jga.f;
import c47.l;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;

public final class i implements View$OnClickListener	// class@0004d4
{
    public final a b;

    public void i(a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, uoa, "8")) {
       }else {
          ClientContent$LiveStreamPackage liveStreamPa = tb.K.a();
          a$a mSponsorId = tb.J.d.mSponsorId;
          if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, mSponsorId, objArray, a.class, "4")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "OP_ACTIVITY_GAME_CNY2022_PASSWORD_DRAW_TAB";
             i3 oi3 = i3.f();
             oi3.d("button_type", "follow");
             oi3.d("official_id", mSponsorId);
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(true, uElementPack, uContentPack);
          }
          mSponsorId = tb.J.d.mSponsorId;
          String str = PatchProxy.apply(objArray, tb, uoa, "10");
          if (str != PatchProxyResult.class) {
          }else if(tb.u() instanceof GifshowActivity){
             str = tb.u().Q2();
          }else {
             str = "live_gzone_command_lottery";
          }
          f$a uoa1 = new f$a(mSponsorId, str);
          uoa1.q(true);
          FollowHelper.c(uoa1.b(), new l(tb));
       }
       return;
    }
}
