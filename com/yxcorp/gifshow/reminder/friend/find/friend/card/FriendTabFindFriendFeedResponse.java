package com.yxcorp.gifshow.reminder.friend.find.friend.card.FriendTabFindFriendFeedResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class FriendTabFindFriendFeedResponse implements CursorResponse	// class@001a91
{
    public final List photos;

    public void FriendTabFindFriendFeedResponse(List p0){
       a.p(p0, "photos");
       super();
       this.photos = p0;
    }
    public String getCursor(){
       return "no_more";
    }
    public List getItems(){
       return this.photos;
    }
    public boolean hasMore(){
       return false;
    }
}
