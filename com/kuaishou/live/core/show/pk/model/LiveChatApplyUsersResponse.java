package com.kuaishou.live.core.show.pk.model.LiveChatApplyUsersResponse;
import la6.b;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;

public class LiveChatApplyUsersResponse implements b, Serializable	// class@000d97
{
    public List mApplyUsers;
    public int mSupportedChatCount;
    public List mTopUsers;
    public static final long serialVersionUID = 0xd2914aa24579f637;

    public void LiveChatApplyUsersResponse(){
       super();
    }
    public List getItems(){
       return this.mApplyUsers;
    }
    public boolean hasMore(){
       return false;
    }
}
