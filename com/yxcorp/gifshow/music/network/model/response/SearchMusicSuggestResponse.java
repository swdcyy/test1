package com.yxcorp.gifshow.music.network.model.response.SearchMusicSuggestResponse;
import la6.b;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;

public class SearchMusicSuggestResponse implements b, Serializable	// class@002067
{
    public String mSearchSid;
    public String mSugSid;
    public List mSuggestKeywords;
    public static final long serialVersionUID = 0x88eb5807e1418aff;

    public void SearchMusicSuggestResponse(){
       super();
    }
    public List getItems(){
       return this.mSuggestKeywords;
    }
    public boolean hasMore(){
       return false;
    }
}
