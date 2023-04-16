package com.kwai.emotion.adapter.match.search.GifEmotionResponse;
import la6.b;
import java.lang.Object;
import java.util.List;

public class GifEmotionResponse implements b	// class@000d65
{
    public List mEmotions;
    public int mOffset;

    public void GifEmotionResponse(){
       super();
    }
    public List getItems(){
       return this.mEmotions;
    }
    public boolean hasMore(){
       boolean b = (this.mOffset != -1)? true: false;
       return b;
    }
}
