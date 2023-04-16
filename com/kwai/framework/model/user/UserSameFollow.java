package com.kwai.framework.model.user.UserSameFollow;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class UserSameFollow implements Serializable	// class@001771
{
    public List mSameFollowers;
    public int mTotalCount;
    public static final long serialVersionUID = 0xa0c6b82cb4e1873c;

    public void UserSameFollow(){
       super();
       this.mSameFollowers = new ArrayList();
    }
}
