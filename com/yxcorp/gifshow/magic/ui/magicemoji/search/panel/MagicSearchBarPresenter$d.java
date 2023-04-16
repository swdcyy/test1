package com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter$d;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import android.view.View;
import com.yxcorp.gifshow.util.rx.RxBus;
import b5b.a;

public final class MagicSearchBarPresenter$d extends AnimatorListenerAdapter	// class@001bfb
{
    public final MagicSearchBarPresenter a;
    public final boolean b;

    public void MagicSearchBarPresenter$d(MagicSearchBarPresenter p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSearchBarPresenter$d.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationCancel(p0);
       Iterator iterator = this.a.t.iterator();
       while (iterator.hasNext()) {
          View view = iterator.next();
          int i = (this.b != null)? 4: 0;
          view.setVisibility(i);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSearchBarPresenter$d.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationEnd(p0);
       if (this.b == null) {
          Iterator iterator = this.a.t.iterator();
          while (iterator.hasNext()) {
             iterator.next().setVisibility(4);
          }
       }
       RxBus.f.b(new a((this.b ^ 0x01)));
       return;
    }
    public void onAnimationPause(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSearchBarPresenter$d.class, "4")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationPause(p0);
       Iterator iterator = this.a.t.iterator();
       while (iterator.hasNext()) {
          View view = iterator.next();
          int i = (this.b != null)? 4: 0;
          view.setVisibility(i);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSearchBarPresenter$d.class, "3")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationStart(p0);
       if (this.b != null) {
          Iterator iterator = this.a.t.iterator();
          while (iterator.hasNext()) {
             iterator.next().setVisibility(0);
          }
       }
       return;
    }
}
