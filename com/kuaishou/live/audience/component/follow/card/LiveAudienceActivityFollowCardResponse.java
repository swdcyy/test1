package com.kuaishou.live.audience.component.follow.card.LiveAudienceActivityFollowCardResponse;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.util.List;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.String;

public class LiveAudienceActivityFollowCardResponse implements Serializable, CursorResponse	// class@000ac5
{
    public List mFollowCardUsers;
    public static final long serialVersionUID = 0xd23129267e886a73;

    public void LiveAudienceActivityFollowCardResponse(List p0){
       super();
       this.mFollowCardUsers = new LinkedList();
       this.mFollowCardUsers = p0;
    }
    public String getCursor(){
       return "";
    }
    public List getItems(){
       return this.mFollowCardUsers;
    }
    public boolean hasMore(){
       return false;
    }
}
