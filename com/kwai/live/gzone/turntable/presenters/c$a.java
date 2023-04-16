package com.kwai.live.gzone.turntable.presenters.c$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.live.gzone.turntable.presenters.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import k67.b;
import com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import com.kwai.library.widget.popup.common.c;
import n77.k0;

public class c$a extends m	// class@000e5c
{
    public final c c;

    public void c$a(c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c n = this.c.N;
       Objects.requireNonNull(n);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, n, LiveGzoneTurntableLogger.class, "46")) {
          n.i("CLICK_BOTTOM_BUTTON_TURNTABLE");
       }
       c$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, c.class, "15") && a1.i(tc.getActivity())) {
          c t = tc.t;
          if (t != null && t.S2()) {
             tc.t.jm(LiveGzoneAudienceFeatureEntranceItem.TURN_TABLE, LiveGzoneTabSource.TURNTABLE);
          }else {
             t = tc.F;
             if (t != null && t.K()) {
                tc.F.q(0);
             }else {
                k0 ok0 = new k0(tc.getActivity());
                tc.F = ok0;
                ok0.y = tc.q;
                ok0.Z();
             }
          }
       }
       this.c.W8();
       return;
    }
}
