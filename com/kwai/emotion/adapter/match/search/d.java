package com.kwai.emotion.adapter.match.search.d;
import erd.o;
import java.lang.Object;
import bk5.j;
import com.kwai.emotion.adapter.match.search.e;
import com.kwai.emotion.adapter.match.search.GifEmotionResponse;

public final class d implements o	// class@000d69
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       GifEmotionResponse gifEmotionRe = new GifEmotionResponse();
       gifEmotionRe.mEmotions = p0.mEmotions;
       gifEmotionRe.mOffset = p0.mOffset;
       return gifEmotionRe;
    }
}
