package com.kuaishou.live.core.voiceparty.playway.shared.widget.b;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.VoicePartyHatView$a;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.VoicePartyHatView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.b$a;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class b extends VoicePartyHatView$a	// class@0018a6
{
    public final CDNUrl[] a;
    public final VoicePartyHatView b;

    public void b(VoicePartyHatView p0,CDNUrl[] p1){
       this.b = p0;
       this.a = p1;
       super(null);
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       VoicePartyHatView d = tb.D;
       if (d == null) {
          tb.s0();
          return;
       }else {
          tb.Y(d, null, new b$a(this));
          return;
       }
    }
}
