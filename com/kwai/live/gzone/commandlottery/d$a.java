package com.kwai.live.gzone.commandlottery.d$a;
import com.kwai.live.gzone.commandlottery.d$b;
import com.kwai.live.gzone.commandlottery.d;
import java.lang.Object;
import com.kwai.live.gzone.commandlottery.model.LiveGzoneAudienceCommandLotteryResultResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import mq5.b;
import com.kwai.live.gzone.commandlottery.LiveGzoneAudienceCommandLotteryResultDialog;
import com.kwai.robust.PatchProxyResult;
import c47.t;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.KwaiDialogFragment;
import c47.u;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public class d$a implements d$b	// class@000c93
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(LiveGzoneAudienceCommandLotteryResultResponse p0){
       LiveGzoneAudienceCommandLotteryResultDialog liveGzoneAud;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       d$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, d.class, "8") && (a1.i(ta.getActivity()) && !ta.s.U0())) {
          ta.P8();
          d q = ta.q;
          d t = ta.t;
          d v = ta.v;
          d w = ta.w;
          if (PatchProxy.isSupport(LiveGzoneAudienceCommandLotteryResultDialog.class)) {
             Object[] objArray = new Object[]{p0,q,t,v,w};
             liveGzoneAud = PatchProxy.apply(objArray, null, LiveGzoneAudienceCommandLotteryResultDialog.class, "2");
             if (liveGzoneAud != PatchProxyResult.class) {
             label_007d :
                ta.E = liveGzoneAud;
                liveGzoneAud.ph(new t(ta, p0));
                ta.E.k0(new u(ta));
                ta.E.Cb(ta.getActivity().getSupportFragmentManager(), "command_lottery_result");
             }
          }
          liveGzoneAud = new LiveGzoneAudienceCommandLotteryResultDialog();
          liveGzoneAud.y = p0.mPrize;
          liveGzoneAud.z = p0.mExtraData;
          liveGzoneAud.A = q;
          liveGzoneAud.B = t;
          liveGzoneAud.C = v;
          liveGzoneAud.D = w;
          goto label_007d ;
       }
    label_00a2 :
       return;
    }
}
