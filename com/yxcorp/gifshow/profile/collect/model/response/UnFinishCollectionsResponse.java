package com.yxcorp.gifshow.profile.collect.model.response.UnFinishCollectionsResponse;
import la6.b;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;

public class UnFinishCollectionsResponse implements b, Serializable	// class@0012ca
{
    public List mFeeds;
    public List mKickOutNoFinishedList;
    public static final long serialVersionUID = 0x25f2ad6568b59312;

    public void UnFinishCollectionsResponse(){
       super();
    }
    public List getItems(){
       return this.mFeeds;
    }
    public boolean hasMore(){
       return false;
    }
}
