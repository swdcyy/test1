package com.kwai.feature.component.impl.ISearchHistoryItemClickCallback;
import java.io.Serializable;
import java.lang.String;
import com.kwai.feature.component.searchhistory.SearchHistoryData;

public interface abstract ISearchHistoryItemClickCallback implements Serializable	// class@00121b
{

    void onClearAllClick();
    void onItemDeleteBtnClick(int p0,String p1);
    void onItemKeywordClick(int p0,SearchHistoryData p1,String p2);
}
