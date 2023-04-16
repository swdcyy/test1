package com.kuaishou.live.core.voiceparty.playway.shared.widget.b$a;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.VoicePartyHatView$b;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.b;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.a;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.VoicePartyHatView;
import android.graphics.drawable.Animatable;
import java.lang.StringBuilder;
import z12.e;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.b$a$a;
import android.animation.Animator$AnimatorListener;

public class b$a extends VoicePartyHatView$b	// class@0018a5
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super(null);
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "2")) {
          return;
       }
       this.a.b.s0();
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b$a.class, "1")) {
          return;
       }
       super.onFinalImageSet(p0, p1, p2);
       p1 = new String[0];
       e.c("hat_view_log", "start big animation hashcode = "+this.a.b.hashCode(), p1);
       this.a.b.B.removeAllListeners();
       this.a.b.A.cancel();
       this.a.b.B.addListener(new b$a$a(this));
       this.a.b.A.start();
       return;
    }
}
