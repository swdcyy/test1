package com.yxcorp.gifshow.detail.keyword.model.BlockKeywordListResponse;
import la6.b;
import java.lang.Object;
import java.util.List;

public class BlockKeywordListResponse implements b	// class@001574
{
    public List mBlockKeywords;

    public void BlockKeywordListResponse(){
       super();
    }
    public List getItems(){
       return this.mBlockKeywords;
    }
    public boolean hasMore(){
       return false;
    }
}
