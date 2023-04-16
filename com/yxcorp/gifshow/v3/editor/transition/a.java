package com.yxcorp.gifshow.v3.editor.transition.a;
import rvc.a$a;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$g;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment;
import android.widget.CheckBox;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$c;

public final class a implements a$a	// class@00151e
{
    public final TransitionEffectFragment$g a;

    public void a(TransitionEffectFragment$g p0){
       this.a = p0;
       super();
    }
    public void a(TransitionEffect p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "transitionEffect");
       TransitionEffectFragment$g b = this.a.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(p0, b, TransitionEffectFragment.class, "7")) {
          a.p(p0, "effect");
          TransitionEffectFragment n = b.n;
          if (n != null) {
             TransitionEffectFragment k = b.k;
             if (k == null) {
                a.S("mCheckBox");
             }
             n.d(p0, k.isChecked());
          }
       }
       return;
    }
}
