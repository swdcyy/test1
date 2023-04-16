package com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$a;
import j87.b$b;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o87.d;
import bq5.h;
import bq5.f;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import a87.e$a;

public final class LiveLocalLifeNewProductBubblePresenter$a implements b$b	// class@000ea9
{
    public final LiveLocalLifeNewProductBubblePresenter a;

    public void LiveLocalLifeNewProductBubblePresenter$a(LiveLocalLifeNewProductBubblePresenter p0){
       this.a = p0;
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLocalLifeNewProductBubblePresenter$a.class, "1")) {
          return;
       }
       if (a.g(this.a.v, p0)) {
          LiveLocalLifeNewProductBubblePresenter t = this.a.t;
          if (t != null) {
             a.m(t);
             d m = t.m;
             if (m != null) {
                LiveLocalLifeNewProductBubblePresenter.P8(this.a).ce(m);
                m.t = null;
             }
             Iterator iterator = this.a.S8().iterator();
             while (iterator.hasNext()) {
                iterator.next().b();
             }
          }
       }
       return;
    }
}
