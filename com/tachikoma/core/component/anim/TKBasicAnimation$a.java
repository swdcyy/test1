package com.tachikoma.core.component.anim.TKBasicAnimation$a;
import android.animation.AnimatorListenerAdapter;
import com.tachikoma.core.component.anim.TKBasicAnimation;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.tachikoma.core.component.anim.TKBasicAnimation$d;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;
import java.lang.Runnable;
import iq8.x;

public class TKBasicAnimation$a extends AnimatorListenerAdapter	// class@000d59
{
    public final TKBasicAnimation a;

    public void TKBasicAnimation$a(TKBasicAnimation p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport(TKBasicAnimation$a.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, TKBasicAnimation$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0, p1);
       TKBasicAnimation mBasicAnimat = this.a.mBasicAnimatorListener;
       if (mBasicAnimat != null) {
          mBasicAnimat.onAnimationEnd(p0, p1);
       }
       TKBasicAnimation animNJEndLis = this.a.animNJEndListenerRef;
       if (animNJEndLis != null && y.a(animNJEndLis.get())) {
          Object[] objArray = new Object[]{Boolean.TRUE};
          this.a.animNJEndListenerRef.get().call(null, objArray);
       }
    label_0056 :
       return;
    }
    public void onAnimationStart(Animator p0,boolean p1){
       if (PatchProxy.isSupport(TKBasicAnimation$a.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, TKBasicAnimation$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0, p1);
       TKBasicAnimation mBasicAnimat = this.a.mBasicAnimatorListener;
       if (mBasicAnimat != null) {
          mBasicAnimat.onAnimationStart(p0, p1);
       }
       TKBasicAnimation$a ta = this.a;
       x.d(ta.animatorOnStartForDelay, (long)ta.getAnimDelay());
       return;
    }
}
