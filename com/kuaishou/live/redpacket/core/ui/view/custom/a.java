package com.kuaishou.live.redpacket.core.ui.view.custom.a;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketMoleculeFollowButton;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import ko3.c;
import java.lang.Runnable;
import ekd.k1;

public class a implements Animator$AnimatorListener	// class@000efd
{
    public final CommonRedPacketMoleculeFollowButton a;

    public void a(CommonRedPacketMoleculeFollowButton p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.a.b.setVisibility(8);
       this.a.b.setAlpha(0x3f800000);
       k1.s(new c(this), this.a.i, 150);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a.c.setVisibility(0);
       return;
    }
}
