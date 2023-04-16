package c47.t;
import android.content.DialogInterface$OnShowListener;
import com.kwai.live.gzone.commandlottery.d;
import com.kwai.live.gzone.commandlottery.model.LiveGzoneAudienceCommandLotteryResultResponse;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import c47.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.live.gzone.commandlottery.model.LiveGzoneAudienceCommandLotteryResultResponse$Prize;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class t implements DialogInterface$OnShowListener	// class@0004df
{
    public final LiveGzoneAudienceCommandLotteryResultResponse b;
    public final d c;

    public void t(d p0,LiveGzoneAudienceCommandLotteryResultResponse p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.c.q.a();
       LiveGzoneAudienceCommandLotteryResultResponse mPrize = this.b.mPrize;
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, mPrize, null, a.class, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "OP_ACTIVITY_GAME_CNY2022_PASSWORD_DRAW_RESULTS_POP";
          i3 oi3 = i3.f();
          oi3.c("is_win", Integer.valueOf(a.d(mPrize)));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u0(4, uElementPack, uContentPack);
       }
       return;
    }
}
