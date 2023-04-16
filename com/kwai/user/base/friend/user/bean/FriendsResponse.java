package com.kwai.user.base.friend.user.bean.FriendsResponse;
import la6.b;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;

public class FriendsResponse implements b, Serializable	// class@001986
{
    public long mLastModifiedTime;
    public List mUsers;
    public static final long serialVersionUID = 0x1a24080c8b9072f4;

    public void FriendsResponse(){
       super();
    }
    public List getItems(){
       return this.mUsers;
    }
    public boolean hasMore(){
       return false;
    }
}
