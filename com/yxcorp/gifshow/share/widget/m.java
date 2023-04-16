package com.yxcorp.gifshow.share.widget.m;
import erd.g;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$c;
import android.view.View;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Pair;
import java.lang.Number;
import y8c.r;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment;
import android.animation.Animator;
import yic.h;
import qrd.l1;
import nl8.p;
import mhc.p1;
import mhc.x;
import zsd.u;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import android.animation.AnimatorSet;

public final class m implements g	// class@001d2c
{
    public final ForwardGridSectionRefactorFragment$c b;
    public final View c;
    public final View d;

    public void m(ForwardGridSectionRefactorFragment$c p0,View p1,View p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
       }else {
          p0 = this.b.l;
          if (p0 != null && p0.getFirst().booleanValue() == true) {
             this.c.setVisibility(4);
             p0 = this.b;
             Animator uAnimator = h.b(this.c, p0.l.getSecond().intValue(), this.b.F(), this.b.m.L);
             uAnimator.start();
             p0.j = uAnimator;
          }
          if (this.b.m.Mh() != null) {
             p0 = this.b.m.Mh();
             x platform = this.b.t().getPlatform();
             Object obj = null;
             String str = (platform != null)? platform.v(): obj;
             if (u.J1(p0, str, false, 2, obj) || (u.J1(this.b.m.Mh(), "download", false, 2, obj) && (this.b.t().M() == KwaiOp.PHOTO_DOWNLOAD && (!this.b.F() || !u.J1(this.b.m.Mh(), "message", false, 2, obj))))) {
                AnimatorSet uAnimatorSet = h.a(this.d);
                uAnimatorSet.start();
                p0.k = uAnimatorSet;
             }
          }
       }
    label_00c4 :
       return;
    }
}
