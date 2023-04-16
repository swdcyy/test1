package com.kwai.framework.model.user.FriendFollow;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class FriendFollow implements Serializable	// class@0016fb
{
    public List mFriendFollowers;
    public int mTotalCount;
    public static final long serialVersionUID = 0x1dd9f67f36707b26;

    public void FriendFollow(){
       super();
       this.mFriendFollowers = new ArrayList();
    }
}
