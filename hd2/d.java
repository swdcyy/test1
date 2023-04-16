package hd2.d;
import com.kwai.video.waynelive.listeners.LivePlayerKwaivppListener;
import com.kuaishou.live.core.show.pk.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import mw1.c;
import rkd.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import ga1.b;
import android.view.View;
import com.kuaishou.live.common.core.basic.player.AdaptPlayViewReason;
import ga1.a;
import p51.c;
import t02.a0;
import dq5.b;

public final class d implements LivePlayerKwaivppListener	// class@002d62
{
    public final a a;

    public void d(a p0){
       this.a = p0;
    }
    public final void onApplySuccess(int p0){
       boolean b;
       d ta = this.a;
       Objects.requireNonNull(ta);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, uoa, "12")) {
          b.c0(LiveLogTag.LIVE_PLAYER_CROP, "onPlayerCropApplySuccess", "requestedId", Integer.valueOf(p0));
          if (p0 == 0x186ac) {
             ta.r.n(1);
             if (ta.t != null) {
                b = (b.g())? b.e(): n.I(ta.getActivity());
                b uob = new b(b, 0x3fc00000, ta.w, ta.m8().getWidth(), ta.m8().getHeight(), AdaptPlayViewReason.DEFAULT, null);
                ta.t.a(v9);
             }else {
                ta.r.n3();
             }
             ta.q.W.a();
          }else if(p0 == 0x186aa){
             ta.r.n(0);
             ta.r.n3();
             ta.q.W.a();
          }else {
             ta.r.n(0);
          }
       }
       return;
    }
}
