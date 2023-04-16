package com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$c$a;
import o87.d$c;
import o87.d;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import a87.e$a;

public final class LiveLocalLifeNewProductBubblePresenter$c$a implements d$c	// class@000eab
{
    public final d a;
    public final LiveLocalLifeNewProductBubblePresenter$c b;
    public final d c;

    public void LiveLocalLifeNewProductBubblePresenter$c$a(d p0,LiveLocalLifeNewProductBubblePresenter$c p1,d p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onShow(){
       if (PatchProxy.applyVoidWithListener(null, this, LiveLocalLifeNewProductBubblePresenter$c$a.class, "1")) {
          return;
       }
       LiveLocalLifeNewProductBubblePresenter$c a = this.b.a;
       LiveLocalLifeNewProductBubblePresenter$c$a ta = this.a;
       a.t = ta;
       ta.m = a.u;
       Iterator iterator = a.S8().iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       PatchProxy.onMethodExit(LiveLocalLifeNewProductBubblePresenter$c$a.class, "1");
       return;
    }
}
