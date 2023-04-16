package c47.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.live.gzone.commandlottery.model.LiveGzoneAudienceCommandLotteryResultResponse$Prize;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class a	// class@0004cc
{

    public void a(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,LiveGzoneAudienceCommandLotteryResultResponse$Prize p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "OP_ACTIVITY_GAME_CNY2022_PASSWORD_DRAW_RESULTS_POP";
       i3 oi3 = i3.f();
       oi3.c("is_win", Integer.valueOf(a.d(p1)));
       oi3.d("button_type", p2);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void b(ClientContent$LiveStreamPackage p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "OP_ACTIVITY_GAME_CNY2022_PASSWORD_DRAW_REMIND_POP";
       i3 oi3 = i3.f();
       oi3.d("button_type", p1);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void c(ClientContent$LiveStreamPackage p0,LiveGzoneAudienceCommandLotteryResultResponse$Prize p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "OP_ACTIVITY_GAME_CNY2022_PASSWORD_DRAW_RESULTS_POP";
       i3 oi3 = i3.f();
       oi3.c("is_win", Integer.valueOf(a.d(p1)));
       oi3.d("button_type", "close");
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static boolean d(LiveGzoneAudienceCommandLotteryResultResponse$Prize p0){
       boolean b = true;
       if (p0 == null || p0.mPrizeType == b) {
          b = false;
       }
       return b;
    }
}
