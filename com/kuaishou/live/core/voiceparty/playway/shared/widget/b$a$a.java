package com.kuaishou.live.core.voiceparty.playway.shared.widget.b$a$a;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.VoicePartyHatView$a;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.b$a;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.b;
import z12.e;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.VoicePartyHatView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.VoicePartyHatView$b;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class b$a$a extends VoicePartyHatView$a	// class@0018a4
{
    public final b$a a;

    public void b$a$a(b$a p0){
       this.a = p0;
       super(null);
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a$a.class, "1")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("hat_view_log", "animation end hashcode = "+this.a.a.b.hashCode(), stringArray);
       b$a a = this.a.a;
       b b = a.b;
       b.x = false;
       if (b.q0(a.a, b.D)) {
          return;
       }
       b b1 = this.a.a.b;
       VoicePartyHatView d = b1.D;
       if (d != null) {
          b1.Y(d, null, new VoicePartyHatView$b(null));
       }
       b1 = this.a.a.b;
       if (b1.D == null && b1.E != null) {
          b1.s0();
       }
       return;
    }
}
