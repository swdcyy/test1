package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$showPlayerPanel$$inlined$apply$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import ro5.a;
import com.yxcorp.gifshow.widget.SwipeLayout;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class SlidePlayerPanelManager$showPlayerPanel$$inlined$apply$lambda$1 extends Lambda implements l	// class@0014eb
{
    public final SlidePlayerPanelManager this$0;

    public void SlidePlayerPanelManager$showPlayerPanel$$inlined$apply$lambda$1(SlidePlayerPanelManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       SlidePlayerPanelManager a;
       if (PatchProxy.isSupport2(SlidePlayerPanelManager$showPlayerPanel$$inlined$apply$lambda$1.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, SlidePlayerPanelManager$showPlayerPanel$$inlined$apply$lambda$1.class, "1")) {
          return;
       }
       a.o(this.this$0.t, (p0 ^ 0x01), 15);
       a = this.this$0.a;
       if (a != null) {
          a.n((p0 ^ 0x01), 21);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.this$0.t.getParentFragment());
       if (slidePlayVie != null) {
          slidePlayVie.d((p0 ^ 0x01), 21);
       }
       PatchProxy.onMethodExit(SlidePlayerPanelManager$showPlayerPanel$$inlined$apply$lambda$1.class, "1");
       return;
    }
}
