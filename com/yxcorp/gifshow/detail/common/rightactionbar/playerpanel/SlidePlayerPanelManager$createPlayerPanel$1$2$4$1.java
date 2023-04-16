package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$4$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$4;
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
import com.yxcorp.gifshow.detail.player.panel.smallwindow.SmallWindowSwitchFragment;
import sz9.q;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$showSmallWindowPanel$2;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.SmallWindowSwitchFragment$a;
import com.kwai.robust.PatchProxyResult;
import m3a.w;
import msd.l;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.KwaiDialogFragment;
import sz9.r;
import android.content.DialogInterface$OnCancelListener;
import sz9.s;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import kotlin.Pair;
import qrd.r0;
import java.util.HashMap;
import trd.t0;

public final class SlidePlayerPanelManager$createPlayerPanel$1$2$4$1 extends Lambda implements p	// class@0014d9
{
    public final SlidePlayerPanelManager$createPlayerPanel$1$2$4 this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1$2$4$1(SlidePlayerPanelManager$createPlayerPanel$1$2$4 p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.booleanValue());
       return l1.a;
    }
    public final void invoke(View p0,boolean p1){
       SmallWindowSwitchFragment$a a;
       String str = "1";
       if (PatchProxy.isSupport(SlidePlayerPanelManager$createPlayerPanel$1$2$4$1.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SlidePlayerPanelManager$createPlayerPanel$1$2$4$1.class, str)) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       SlidePlayerPanelManager$createPlayerPanel$1 this$0 = this.this$0.this$0.this$0.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(null, this$0, SlidePlayerPanelManager.class, "9")) {
          SlidePlayerPanelManager f = this$0.f;
          if (f != null) {
             f.c();
          }
          a = SmallWindowSwitchFragment.A;
          q oq = new q(this$0);
          SlidePlayerPanelManager$showSmallWindowPanel$2 oshowSmallWi = new SlidePlayerPanelManager$showSmallWindowPanel$2(this$0);
          Objects.requireNonNull(a);
          SmallWindowSwitchFragment smallWindowS = PatchProxy.applyTwoRefs(oq, oshowSmallWi, a, SmallWindowSwitchFragment$a.class, str);
          if (smallWindowS != PatchProxyResult.class) {
          }else {
             a.p(oq, "switchChangeListener");
             a.p(oshowSmallWi, "onShow");
             smallWindowS = new SmallWindowSwitchFragment();
             if (!PatchProxy.applyVoidOneRefs(oq, smallWindowS, SmallWindowSwitchFragment.class, "2")) {
                a.p(oq, "<set-?>");
                smallWindowS.z = oq;
             }
             smallWindowS.ph(new w(oshowSmallWi));
          }
          this$0.h = smallWindowS;
          if (smallWindowS != null) {
             smallWindowS.oh(new r(this$0));
          }
          f = this$0.h;
          if (f != null) {
             f.k0(new s(this$0));
          }
          f = this$0.h;
          if (f != null) {
             f.Cb(this$0.o.getSupportFragmentManager(), "PlayerPanel");
          }
       }
       Pair[] pairArray = new Pair[]{r0.a("small_window_play", "Ð¡´°²¥·Å")};
       this.this$0.this$0.this$0.this$0.j(t0.M(pairArray));
       return;
    }
}
