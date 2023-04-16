package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$b;
import androidx.transition.d;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b;
import androidx.transition.Transition;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import androidx.transition.TransitionSet;
import androidx.transition.Fade;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import androidx.transition.e;

public class b$b extends d	// class@001b92
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void b(Transition p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b$b ta = this.a;
       Objects.requireNonNull(ta);
       b uob = b.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, uob, "41")) {
          a uoa = new a();
          uoa.i(ta.U0);
          uoa.V(ta.U.getId(), 0);
          b u0 = ta.U0;
          TransitionSet transitionSe = PatchProxy.apply(objArray, ta, uob, "39");
          if (transitionSe != PatchProxyResult.class) {
          }else {
             transitionSe = new TransitionSet();
             transitionSe.l0(new Fade());
             transitionSe.r0(200);
             transitionSe = transitionSe.s0(new LinearInterpolator());
          }
          e.b(u0, transitionSe);
          uoa.b(ta.U0);
       }
       return;
    }
}
