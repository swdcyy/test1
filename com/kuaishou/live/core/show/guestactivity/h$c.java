package com.kuaishou.live.core.show.guestactivity.h$c;
import com.kuaishou.live.core.show.guestactivity.h$f;
import com.kuaishou.live.core.show.guestactivity.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import n92.g0;
import com.kwai.robust.PatchProxyResult;
import android.animation.Animator;
import android.view.View;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import com.kuaishou.live.core.show.guestactivity.i;
import android.animation.Animator$AnimatorListener;
import n92.d0;

public class h$c implements h$f	// class@000bd9
{
    public final h a;

    public void h$c(h p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h$c.class, "1")) {
          return;
       }
       h$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, h.class, "10")) {
          ta.a9();
          h l = ta.L;
          ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(l, objArray, g0.class, "5");
          if (objectAnimat != PatchProxyResult.class) {
          }else {
             objectAnimat = j.a(l, new float[2]{0,0x3f800000});
             objectAnimat.setDuration(200);
          }
          objectAnimat.addListener(new i(ta));
          ta.L.setVisibility(0);
          objectAnimat.start();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, h$c.class, "4")) {
          return;
       }
       this.a.a9();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, h$c.class, "3")) {
          return;
       }
       this.a.d9();
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h$c.class, "2")) {
          return;
       }
       h$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, h.class, "11")) {
          Animator uAnimator = g0.a(ta.L);
          uAnimator.addListener(new d0(ta));
          uAnimator.start();
       }
       return;
    }
}
