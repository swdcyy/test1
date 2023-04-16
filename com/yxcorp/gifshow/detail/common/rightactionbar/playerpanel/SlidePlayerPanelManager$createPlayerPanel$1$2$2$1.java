package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$2$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$2;
import k3a.a;
import java.lang.Object;
import android.view.View;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import java.util.Objects;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import i3a.a;
import com.yxcorp.gifshow.detail.player.panel.savetraffic.PhotoSaveTrafficControlFragment;
import sz9.n;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$showSaveTrafficPanel$2;
import com.yxcorp.gifshow.detail.player.panel.savetraffic.PhotoSaveTrafficControlFragment$a;
import com.kwai.robust.PatchProxyResult;
import l3a.a;
import msd.l;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.KwaiDialogFragment;
import sz9.o;
import android.content.DialogInterface$OnCancelListener;
import sz9.p;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import kotlin.Pair;
import lnc.a1;
import qrd.r0;
import sz9.t;
import java.util.HashMap;
import trd.t0;

public final class SlidePlayerPanelManager$createPlayerPanel$1$2$2$1 extends Lambda implements p	// class@0014d5
{
    public final a $this_saveTraffic;
    public final SlidePlayerPanelManager$createPlayerPanel$1$2$2 this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1$2$2$1(SlidePlayerPanelManager$createPlayerPanel$1$2$2 p0,a p1){
       this.this$0 = p0;
       this.$this_saveTraffic = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.booleanValue());
       return l1.a;
    }
    public final void invoke(View p0,boolean p1){
       PhotoSaveTrafficControlFragment$a a;
       String str = "1";
       if (PatchProxy.isSupport(SlidePlayerPanelManager$createPlayerPanel$1$2$2$1.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SlidePlayerPanelManager$createPlayerPanel$1$2$2$1.class, str)) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       SlidePlayerPanelManager$createPlayerPanel$1 this$0 = this.this$0.this$0.this$0.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(null, this$0, SlidePlayerPanelManager.class, "10")) {
          SlidePlayerPanelManager f = this$0.f;
          if (f != null) {
             f.c();
          }
          a = PhotoSaveTrafficControlFragment.A;
          n on = new n(this$0);
          SlidePlayerPanelManager$showSaveTrafficPanel$2 oshowSaveTra = new SlidePlayerPanelManager$showSaveTrafficPanel$2(this$0);
          Objects.requireNonNull(a);
          PhotoSaveTrafficControlFragment photoSaveTra = PatchProxy.applyTwoRefs(on, oshowSaveTra, a, PhotoSaveTrafficControlFragment$a.class, str);
          if (photoSaveTra != PatchProxyResult.class) {
          }else {
             a.p(on, "onSelListener");
             a.p(oshowSaveTra, "onShow");
             photoSaveTra = new PhotoSaveTrafficControlFragment();
             if (!PatchProxy.applyVoidOneRefs(on, photoSaveTra, PhotoSaveTrafficControlFragment.class, "2")) {
                a.p(on, "<set-?>");
                photoSaveTra.z = on;
             }
             photoSaveTra.ph(new a(oshowSaveTra));
          }
          this$0.i = photoSaveTra;
          if (photoSaveTra != null) {
             photoSaveTra.oh(new o(this$0));
          }
          f = this$0.i;
          if (f != null) {
             f.k0(new p(this$0));
          }
          f = this$0.i;
          if (f != null) {
             f.Cb(this$0.o.getSupportFragmentManager(), "PlayerPanel");
          }
       }
       Pair[] pairArray = new Pair[]{r0.a("video_saveflow_icon_button", a1.p(0x7f103cba)),r0.a("show_or_hide", t.c(this.$this_saveTraffic.h()))};
       this.this$0.this$0.this$0.this$0.j(t0.M(pairArray));
       return;
    }
}
