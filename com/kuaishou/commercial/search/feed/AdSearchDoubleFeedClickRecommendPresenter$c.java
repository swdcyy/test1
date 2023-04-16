package com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$c;
import erd.g;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class AdSearchDoubleFeedClickRecommendPresenter$c implements g	// class@001557
{
    public final AdSearchDoubleFeedClickRecommendPresenter b;

    public void AdSearchDoubleFeedClickRecommendPresenter$c(AdSearchDoubleFeedClickRecommendPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdSearchDoubleFeedClickRecommendPresenter$c.class, "1")) {
       }else {
          a.o(p0, "selected");
          if (p0.booleanValue()) {
             this.b.c9(true);
          }
       }
       return;
    }
}
