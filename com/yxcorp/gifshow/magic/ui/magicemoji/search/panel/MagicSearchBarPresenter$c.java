package com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import java.lang.StringBuilder;
import j8c.b;
import java.util.Iterator;
import java.lang.Iterable;
import android.view.View;

public final class MagicSearchBarPresenter$c implements ValueAnimator$AnimatorUpdateListener	// class@001bfa
{
    public final MagicSearchBarPresenter a;
    public final boolean b;

    public void MagicSearchBarPresenter$c(MagicSearchBarPresenter p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSearchBarPresenter$c.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       float f = p0.floatValue();
       float f1 = 0x3f800000 - f;
       MagicSearchBarPresenter$a g = MagicSearchBarPresenter.G;
       Objects.requireNonNull(g);
       b.a(MagicSearchBarPresenter.C, "MagicViewAnimate + progress : "+f);
       Objects.requireNonNull(g);
       f = f * (float)MagicSearchBarPresenter.F;
       if (this.b != null) {
          Iterator iterator = this.a.s.iterator();
          while (iterator.hasNext()) {
             iterator.next().setTranslationY(f);
          }
       }
       Iterator iterator1 = this.a.t.iterator();
       while (iterator1.hasNext()) {
          iterator1.next().setAlpha(f1);
       }
       return;
    }
}
