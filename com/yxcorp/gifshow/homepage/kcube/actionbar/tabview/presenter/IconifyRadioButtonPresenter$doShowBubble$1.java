package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.IconifyRadioButtonPresenter$doShowBubble$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import co5.g;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.l;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.common.c;
import java.util.Objects;
import java.lang.ref.WeakReference;

public final class IconifyRadioButtonPresenter$doShowBubble$1 extends Lambda implements a	// class@001713
{
    public final g $tabBubble;

    public void IconifyRadioButtonPresenter$doShowBubble$1(g p0){
       this.$tabBubble = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       a uoa;
       if (PatchProxy.applyVoid(null, this, IconifyRadioButtonPresenter$doShowBubble$1.class, "1")) {
          return;
       }
       IconifyRadioButtonPresenter$doShowBubble$1 t$tabBubble = this.$tabBubble;
       g k = t$tabBubble.k;
       if (k != null) {
          a.m(k);
          uoa = k.invoke(this.$tabBubble.b);
       }else {
          g b = t$tabBubble.b;
          a.m(b);
          uoa = b.e0();
          uoa.Z();
       }
       if (uoa != null) {
          IconifyRadioButtonPresenter$doShowBubble$1 t$tabBubble1 = this.$tabBubble;
          Objects.requireNonNull(t$tabBubble1);
          if (!PatchProxy.applyVoidOneRefs(uoa, t$tabBubble1, g.class, "2")) {
             t$tabBubble1.j = new WeakReference(uoa);
          }
       }
       return;
    }
}
