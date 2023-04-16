package com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$b;
import s99.d;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.commercial.search.b;

public final class AdSearchDoubleFeedClickRecommendPresenter$b implements d	// class@001556
{
    public final AdSearchDoubleFeedClickRecommendPresenter a;

    public void AdSearchDoubleFeedClickRecommendPresenter$b(AdSearchDoubleFeedClickRecommendPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdSearchDoubleFeedClickRecommendPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "type");
       boolean b = true;
       if (b.g(AdSearchDoubleFeedClickRecommendPresenter.P8(this.a)) != b) {
          b = false;
       }
       return b;
    }
}
