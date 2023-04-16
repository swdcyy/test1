package com.yxcorp.gifshow.novelcoreapi.sdk.NovelRankingCategoryResponse;
import la6.b;
import java.lang.Object;
import java.util.List;

public class NovelRankingCategoryResponse implements b	// class@0021c7
{
    public int categoryType;
    public String categoryTypeName;
    public List mItems;
    public List rankingBoard;
    public List rankingCategory;

    public void NovelRankingCategoryResponse(){
       super();
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       return false;
    }
}
