package com.kuaishou.android.post.topic.model.TopicCollectionsResponse;
import la6.b;
import java.lang.Object;
import java.util.List;

public class TopicCollectionsResponse implements b	// class@000ec8
{
    public List mList;

    public void TopicCollectionsResponse(){
       super();
    }
    public List getItems(){
       return this.mList;
    }
    public boolean hasMore(){
       return false;
    }
    public void setTopicItemList(List p0){
       this.mList = p0;
    }
}
