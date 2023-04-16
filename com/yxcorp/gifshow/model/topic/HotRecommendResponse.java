package com.yxcorp.gifshow.model.topic.HotRecommendResponse;
import la6.b;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;

public class HotRecommendResponse implements b, Serializable	// class@001fa4
{
    public List mRecommendPageTags;
    public List mRecommendTags;
    public static final long serialVersionUID = 0xff6abb6ca2738a78;

    public void HotRecommendResponse(){
       super();
    }
    public List getItems(){
       return this.mRecommendTags;
    }
    public List getPageItems(){
       return this.mRecommendPageTags;
    }
    public boolean hasMore(){
       return false;
    }
}
