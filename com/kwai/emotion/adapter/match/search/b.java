package com.kwai.emotion.adapter.match.search.b;
import erd.g;
import java.lang.Object;
import com.kwai.emotion.adapter.match.search.GifEmotionResponse;
import com.kwai.emotion.adapter.match.search.e;
import java.util.List;
import java.util.Collection;
import ekd.q;
import lnc.a1;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.String;
import java.lang.reflect.Type;

public final class b implements g	// class@000d67
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       GifEmotionResponse gifEmotionRe = p0;
       if (gifEmotionRe && !q.f(gifEmotionRe.getItems())) {
          b.a(0x5f2ddeb4).c("emotion_search_weshine_reco", gifEmotionRe, GifEmotionResponse.class, (a1.k() + 0x36ee80));
       }
       return;
    }
}
