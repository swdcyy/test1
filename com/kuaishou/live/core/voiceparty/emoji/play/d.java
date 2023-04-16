package com.kuaishou.live.core.voiceparty.emoji.play.d;
import lnc.a1;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hc.a;
import dc.a;
import com.kuaishou.live.core.voiceparty.emoji.play.d$a;
import com.yxcorp.gifshow.image.KwaiImageView;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import android.graphics.drawable.Animatable;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.ImageView;

public final class d	// class@0014e6
{
    public static final float a;

    static {
       d.a = (float)a1.e(26.00f);
    }
    public void d(){
       super();
    }
    public static int[] a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int[] ointArray = new int[2];
       p0.getLocationOnScreen(ointArray);
       int[] ointArray1 = new int[]{ointArray[0] + (p0.getWidth() / 2),ointArray[1] + (p0.getHeight() / 2)};
       return ointArray1;
    }
    public static a b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d$a(p0.f());
    }
    public static void c(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "10")) {
          return;
       }
       a controller = p0.getController();
       if (controller != null) {
          Animatable animatable = controller.getAnimatable();
          if (animatable != null && animatable.isRunning()) {
             b.Z(LiveVoicePartyLogTag.EMOJI, "Stop Emoji Animation");
             animatable.stop();
          }
       }
       p0.setVisibility(4);
       return;
    }
}
