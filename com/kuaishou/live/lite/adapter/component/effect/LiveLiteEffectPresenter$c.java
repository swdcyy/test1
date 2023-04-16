package com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter$c;
import jy2.a;
import vb3.n;
import java.lang.Object;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;

public final class LiveLiteEffectPresenter$c implements a	// class@001d81
{
    public final n a;

    public void LiveLiteEffectPresenter$c(n p0){
       this.a = p0;
       super();
    }
    public void a(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEffectPresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "vc");
       this.a.c(LayoutViewType.GiftEffect, p0);
       return;
    }
}
