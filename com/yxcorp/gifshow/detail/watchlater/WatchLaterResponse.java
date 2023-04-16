package com.yxcorp.gifshow.detail.watchlater.WatchLaterResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.String;

public final class WatchLaterResponse implements Serializable	// class@001a78
{
    public List mFeeds;
    public String mLlsid;
    public String nextCursor;
    public String preCursor;

    public void WatchLaterResponse(){
       super();
    }
    public final List getMFeeds(){
       return this.mFeeds;
    }
    public final String getMLlsid(){
       return this.mLlsid;
    }
    public final String getNextCursor(){
       return this.nextCursor;
    }
    public final String getPreCursor(){
       return this.preCursor;
    }
    public final void setMFeeds(List p0){
       this.mFeeds = p0;
    }
    public final void setMLlsid(String p0){
       this.mLlsid = p0;
    }
    public final void setNextCursor(String p0){
       this.nextCursor = p0;
    }
    public final void setPreCursor(String p0){
       this.preCursor = p0;
    }
}
