package com.kwai.feed.player.ui.KwaiXfControlPanel$b;
import java.lang.Runnable;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.BitSet;
import com.yxcorp.utility.n;
import z46.b;
import java.lang.Long;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import th0.j;
import android.animation.TimeInterpolator;

public class KwaiXfControlPanel$b implements Runnable	// class@0014af
{
    public boolean b;
    public long c;
    public final KwaiXfControlPanel d;

    public void KwaiXfControlPanel$b(KwaiXfControlPanel p0){
       this.d = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiXfControlPanel$b.class, "1")) {
          return;
       }
       KwaiXfControlPanel$b uob = 1;
       KwaiXfControlPanel$b uob1 = (this.d.M.getVisibility())? 1: null;
       if (this.d.R.cardinality() <= 0) {
          uob = null;
       }
       if (uob1 == uob) {
          return;
       }else if(this.d.R.cardinality() > 0){
          n.W(this.d.M, 8, this.c);
       }else if(this.b != null){
          KwaiXfControlPanel m = this.d.M;
          KwaiXfControlPanel$b tc = this.c;
          b uob2 = b.class;
          if (!PatchProxy.isSupport(uob2) || (!PatchProxy.applyVoidTwoRefs(m, Long.valueOf(tc), objArray, uob2, "5") && m != null)) {
             if (!tc) {
                m.setVisibility(0);
             }else {
                m.clearAnimation();
                m.setAlpha(0);
                m.setScaleY(2.00f);
                m.setScaleX(2.00f);
                m.setVisibility(0);
                m.animate().setListener(objArray).cancel();
                m.animate().setDuration(tc).setInterpolator(new j()).alpha(0x3f800000).scaleX(0x3f800000).scaleY(0x3f800000).start();
             }
          }
       }else {
          n.W(this.d.M, 0, this.c);
       }
       return;
    }
}
