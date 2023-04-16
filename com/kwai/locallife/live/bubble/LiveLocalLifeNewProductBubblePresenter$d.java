package com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$d;
import a87.e;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter;
import java.lang.Object;
import a87.e$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;

public final class LiveLocalLifeNewProductBubblePresenter$d implements e	// class@000eae
{
    public final LiveLocalLifeNewProductBubblePresenter a;

    public void LiveLocalLifeNewProductBubblePresenter$d(LiveLocalLifeNewProductBubblePresenter p0){
       this.a = p0;
       super();
    }
    public void a(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLocalLifeNewProductBubblePresenter$d.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.a.S8().remove(p0);
       }
       return;
    }
    public void b(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLocalLifeNewProductBubblePresenter$d.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.a.S8().add(p0);
       }
       return;
    }
}
