package com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.CheckBox;
import rvc.a;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$c;
import rvc.h;
import java.lang.Boolean;
import android.util.Pair;
import lnc.v6;
import k2b.s;

public final class TransitionEffectFragment$d implements View$OnClickListener	// class@001519
{
    public final TransitionEffectFragment b;

    public void TransitionEffectFragment$d(TransitionEffectFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, TransitionEffectFragment$d.class, str)) {
          return;
       }
       if (TransitionEffectFragment.dh(this.b).isChecked()) {
          TransitionEffectFragment$d tb = this.b;
          TransitionEffectFragment n = tb.n;
          if (n != null && n != null) {
             n.c(TransitionEffectFragment.ch(tb).J0(), TransitionEffectFragment.dh(this.b).isChecked());
          }
       }
       boolean b = TransitionEffectFragment.dh(this.b).isChecked();
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, oh, str)) {
          Pair[] pairArray = new Pair[]{new Pair("is_selected", Boolean.valueOf(b))};
          s.i("TRANSITION_TO_ALL", v6.a(pairArray));
       }
       return;
    }
}
