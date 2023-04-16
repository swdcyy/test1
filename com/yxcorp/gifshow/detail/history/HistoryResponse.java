package com.yxcorp.gifshow.detail.history.HistoryResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.String;

public final class HistoryResponse implements Serializable	// class@00156f
{
    public List mFeeds;
    public String mLlsid;

    public void HistoryResponse(){
       super();
    }
    public final List getMFeeds(){
       return this.mFeeds;
    }
    public final String getMLlsid(){
       return this.mLlsid;
    }
    public final void setMFeeds(List p0){
       this.mFeeds = p0;
    }
    public final void setMLlsid(String p0){
       this.mLlsid = p0;
    }
}
