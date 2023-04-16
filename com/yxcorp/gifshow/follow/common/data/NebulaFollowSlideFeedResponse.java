package com.yxcorp.gifshow.follow.common.data.NebulaFollowSlideFeedResponse;
import com.kwai.framework.model.response.CursorResponse;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.String;

public class NebulaFollowSlideFeedResponse extends HomeFeedResponse implements CursorResponse	// class@001021
{

    public void NebulaFollowSlideFeedResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
}
