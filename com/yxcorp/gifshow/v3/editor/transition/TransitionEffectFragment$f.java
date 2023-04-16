package com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$f;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import rvc.a;
import android.widget.CheckBox;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$c;
import rvc.h;
import k2b.s;

public final class TransitionEffectFragment$f implements View$OnClickListener	// class@00151b
{
    public final TransitionEffectFragment b;

    public void TransitionEffectFragment$f(TransitionEffectFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TransitionEffectFragment$f.class, "1")) {
          return;
       }
       TransitionEffectFragment$f tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, TransitionEffectFragment.class, "9")) {
          TransitionEffectFragment n = tb.n;
          if (n != null) {
             TransitionEffectFragment t = tb.t;
             if (t == null) {
                a.S("mAdapter");
             }
             TransitionEffect transitionEf = t.J0();
             TransitionEffectFragment k = tb.k;
             if (k == null) {
                a.S("mCheckBox");
             }
             n.b(transitionEf, k.isChecked(), tb.r);
          }
          tb.fh();
       }
       if (!PatchProxy.applyVoid(null, null, h.class, "3")) {
          s.i("ENSURE_SPLIT_TRANSITION", null);
       }
       return;
    }
}
