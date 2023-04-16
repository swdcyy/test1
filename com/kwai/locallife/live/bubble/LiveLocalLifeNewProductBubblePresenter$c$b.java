package com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$c$b;
import o87.d$b;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$c;
import o87.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter;
import java.util.Iterator;
import java.lang.Iterable;
import a87.e$a;

public final class LiveLocalLifeNewProductBubblePresenter$c$b implements d$b	// class@000eac
{
    public final LiveLocalLifeNewProductBubblePresenter$c a;
    public final d b;

    public void LiveLocalLifeNewProductBubblePresenter$c$b(LiveLocalLifeNewProductBubblePresenter$c p0,d p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onDismiss(){
       if (PatchProxy.applyVoidWithListener(null, this, LiveLocalLifeNewProductBubblePresenter$c$b.class, "1")) {
          return;
       }
       Iterator iterator = this.a.a.S8().iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       this.a.a.t = null;
       PatchProxy.onMethodExit(LiveLocalLifeNewProductBubblePresenter$c$b.class, "1");
       return;
    }
}
