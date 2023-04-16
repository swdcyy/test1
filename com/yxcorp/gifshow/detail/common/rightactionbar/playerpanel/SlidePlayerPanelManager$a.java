package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$a;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i3a.a;
import androidx.fragment.app.KwaiDialogFragment;

public final class SlidePlayerPanelManager$a implements g	// class@0014c3
{
    public final SlidePlayerPanelManager b;

    public void SlidePlayerPanelManager$a(SlidePlayerPanelManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayerPanelManager$a.class, "1")) {
       }else {
          p0 = this.b.f;
          if (p0 != null) {
             p0.c();
          }
          p0 = this.b.g;
          if (p0 != null) {
             p0.c();
          }
          p0 = this.b.h;
          if (p0 != null) {
             p0.dismiss();
          }
          p0 = this.b.i;
          if (p0 != null) {
             p0.dismiss();
          }
          PatchProxy.onMethodExit(SlidePlayerPanelManager$a.class, "1");
       }
       return;
    }
}
