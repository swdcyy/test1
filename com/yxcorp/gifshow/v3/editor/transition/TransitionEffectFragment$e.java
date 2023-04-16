package com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rvc.h;
import k2b.s;

public final class TransitionEffectFragment$e implements View$OnClickListener	// class@00151a
{
    public final TransitionEffectFragment b;

    public void TransitionEffectFragment$e(TransitionEffectFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TransitionEffectFragment$e.class, "1")) {
          return;
       }
       this.b.gh();
       if (!PatchProxy.applyVoid(null, null, h.class, "2")) {
          s.i("CANCEL_SPLIT_TRANSITION", null);
       }
       return;
    }
}
