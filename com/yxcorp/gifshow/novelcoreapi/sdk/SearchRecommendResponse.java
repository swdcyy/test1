package com.yxcorp.gifshow.novelcoreapi.sdk.SearchRecommendResponse;
import la6.b;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.novelcoreapi.sdk.NovelSearchRecommendInfo;

public class SearchRecommendResponse implements b	// class@0021cd
{
    public NovelSearchRecommendInfo mNovelSearchRecommendInfo;

    public void SearchRecommendResponse(){
       super();
    }
    public List getItems(){
       return this.mNovelSearchRecommendInfo.mBooks;
    }
    public boolean hasMore(){
       return false;
    }
    public void setItems(List p0){
       this.mNovelSearchRecommendInfo.mBooks = p0;
    }
}
