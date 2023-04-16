package com.kwai.feature.component.searchhistory.SearchHistoryResponse;
import la6.b;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;

public class SearchHistoryResponse implements b, Serializable	// class@00128d
{
    public final List mList;
    public static final long serialVersionUID = 0x3757fde01dcfd228;

    public void SearchHistoryResponse(List p0){
       super();
       this.mList = p0;
    }
    public List getItems(){
       return this.mList;
    }
    public boolean hasMore(){
       return false;
    }
}
