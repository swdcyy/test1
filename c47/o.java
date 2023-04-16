package c47.o;
import java.lang.Runnable;
import com.kwai.live.gzone.commandlottery.d;
import e47.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import mq5.b;
import com.kwai.live.gzone.commandlottery.LiveGzoneAudienceCommandLotteryNoticeDialog;
import com.kwai.robust.PatchProxyResult;
import c47.r;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.KwaiDialogFragment;
import c47.s;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public class o implements Runnable	// class@0004da
{
    public final a b;
    public final d c;

    public void o(d p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       o tc = this.c;
       o tb = this.b;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(tb, tc, d.class, "7") && (a1.i(tc.getActivity()) && !tc.s.U0())) {
          tc.P8();
          d q = tc.q;
          d u = tc.u;
          d v = tc.v;
          LiveGzoneAudienceCommandLotteryNoticeDialog liveGzoneAud = PatchProxy.applyFourRefs(tb, q, u, v, null, LiveGzoneAudienceCommandLotteryNoticeDialog.class, "2");
          if (liveGzoneAud != PatchProxyResult.class) {
          }else {
             liveGzoneAud = new LiveGzoneAudienceCommandLotteryNoticeDialog();
             liveGzoneAud.u = tb;
             liveGzoneAud.v = q;
             liveGzoneAud.w = u;
             liveGzoneAud.x = v;
          }
          tc.F = liveGzoneAud;
          liveGzoneAud.ph(new r(tc));
          tc.F.k0(new s(tc));
          tc.F.Cb(tc.getActivity().getSupportFragmentManager(), "command_lottery_notice");
       }
    label_0083 :
       return;
    }
}
