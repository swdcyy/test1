package com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$reportMaskShow$$inlined$let$lambda$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vq4.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ClickAfterWords;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.a;

public final class AdSearchDoubleFeedClickRecommendPresenter$reportMaskShow$$inlined$let$lambda$1 implements AdDataWrapper$AdLogParamAppender	// class@00155b
{
    public final AdSearchDoubleFeedClickRecommendPresenter this$0;

    public void AdSearchDoubleFeedClickRecommendPresenter$reportMaskShow$$inlined$let$lambda$1(AdSearchDoubleFeedClickRecommendPresenter p0){
       this.this$0 = p0;
       super();
    }
    public final void appendAdLogParam(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AdSearchDoubleFeedClickRecommendPresenter$reportMaskShow$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       p0 = p0.F;
       p0.C = 14;
       p0.X2 = 12;
       AdSearchDoubleFeedClickRecommendPresenter$reportMaskShow$$inlined$let$lambda$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       StringBuilder str = PatchProxy.apply(null, tthis$0, AdSearchDoubleFeedClickRecommendPresenter.class, "19");
       if (str != PatchProxyResult.class) {
       }else {
          str = "";
          AdSearchDoubleFeedClickRecommendPresenter e = tthis$0.E;
          if (e != null) {
             PhotoAdvertisement$ClickAfterWords mWords = e.mWords;
             if (mWords != null) {
                int i = mWords.size() - 1;
                int i1 = 0;
                Iterator iterator = mWords.iterator();
                while (iterator.hasNext()) {
                   Object obj = iterator.next();
                   int i2 = i1 + 1;
                   if (i1 < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   str = str+obj;
                   if (i1 != i) {
                      str = str+',';
                   }
                   i1 = i2;
                }
             }
          }
          str = str;
          a.o(str, "sb.toString\(\)");
       }
       p0.L3 = str;
       PatchProxy.onMethodExit(AdSearchDoubleFeedClickRecommendPresenter$reportMaskShow$$inlined$let$lambda$1.class, "1");
       return;
    }
}
