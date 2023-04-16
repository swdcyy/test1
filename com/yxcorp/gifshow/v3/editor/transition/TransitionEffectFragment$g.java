package com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$g;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment;
import java.lang.Object;
import java.util.List;
import rvc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.transition.a;
import com.yxcorp.gifshow.v3.editor.transition.b;

public final class TransitionEffectFragment$g implements Observer	// class@00151c
{
    public final TransitionEffectFragment b;

    public void TransitionEffectFragment$g(TransitionEffectFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, TransitionEffectFragment$g.class, "1")) {
       }else {
          a uoa1 = TransitionEffectFragment.ch(this.b);
          a.o(p0, "it");
          Objects.requireNonNull(uoa1);
          if (!PatchProxy.applyVoidOneRefs(p0, uoa1, uoa, "3")) {
             a.p(p0, "effects");
             uoa1.f = p0;
          }
          p0 = TransitionEffectFragment.ch(this.b);
          uoa1 = new a(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uoa1, p0, uoa, "4")) {
             a.p(uoa1, "onItemClickListener");
             p0.e = uoa1;
          }
          p0 = TransitionEffectFragment.ch(this.b);
          b uob = new b(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uob, p0, uoa, "5")) {
             a.p(uob, "onTouchListener");
             p0.g = uob;
          }
       }
       return;
    }
}
