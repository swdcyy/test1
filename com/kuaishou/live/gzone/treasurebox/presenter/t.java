package com.kuaishou.live.gzone.treasurebox.presenter.t;
import erd.g;
import com.kuaishou.live.gzone.treasurebox.presenter.w;
import java.lang.Object;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneAudienceTreasureBoxBubble;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import t57.a;
import java.lang.StringBuilder;
import p53.d2;
import f67.n0;

public final class t implements g	// class@001c9c
{
    public final w b;

    public void t(w p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, w.class, "15")) {
       }else {
          w l = tb.L;
          if (l != null && !l.getVisibility()) {
             l = tb.T;
             if (l != null && (!l.b() && tb.V0 == null)) {
                tb.V0 = true;
                String str = "treasure_box"+p0.mBubbleId;
                d2 uod2 = new d2(tb, str, p0);
                tb.Y0 = uod2;
                tb.c9(p0.mBubbleTitle, str, uod2);
             }
          }
       }
       return;
    }
}
