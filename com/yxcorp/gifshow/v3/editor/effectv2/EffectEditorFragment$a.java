package com.yxcorp.gifshow.v3.editor.effectv2.EffectEditorFragment$a;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.effectv2.EffectEditorFragment;
import java.lang.Object;
import kqc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qqc.d;
import kotlin.jvm.internal.a;
import java.util.Objects;
import lqc.c;
import java.lang.Integer;
import java.lang.System;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import pqc.a;

public final class EffectEditorFragment$a implements Observer	// class@000f22
{
    public final EffectEditorFragment b;

    public void EffectEditorFragment$a(EffectEditorFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       c uoc;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectEditorFragment$a.class, str)) {
       }else {
          d uod = EffectEditorFragment.yh(this.b);
          a.o(p0, "newState");
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidOneRefs(p0, uod, d.class, "3")) {
             a.p(p0, "effectRootState");
             uoc = c.b;
             c k = p0.k;
             Objects.requireNonNull(uoc);
             c uoc1 = c.class;
             if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(k), uoc, uoc1, str)) {
                EffectEditorFragment$a uoa1 = 0x7f100cf9;
                int i = 0x7f110668;
                if (k != 1) {
                   if (k == 2 && (System.currentTimeMillis() - c.a) - (long)3000 > 0) {
                      i.d(i, a1.r(uoa1, a1.p(R.string.arg_RES_7f100cfd)));
                      c.a = System.currentTimeMillis();
                   }
                }else if((System.currentTimeMillis() - c.a) - (long)3000 > 0){
                   i.d(i, a1.r(uoa1, a1.p(R.string.arg_RES_7f100d00)));
                   c.a = System.currentTimeMillis();
                }
             }
          }
          uoc = EffectEditorFragment.yh(this.b).u0();
          Iterator iterator = this.b.I.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa instanceof a) {
                uoa.n(p0, uoc);
             }
          }
       }
       return;
    }
}
