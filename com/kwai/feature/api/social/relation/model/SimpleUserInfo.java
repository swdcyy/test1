package com.kwai.feature.api.social.relation.model.SimpleUserInfo;
import java.io.Serializable;
import java.lang.Object;

public class SimpleUserInfo implements Serializable	// class@0011b7
{
    public String eid;
    public boolean followRequesting;
    public boolean following;
    public String headUrl;
    public CDNUrl[] headUrls;
    public String kwaiId;
    public boolean mPrivacy;
    public String mSex;
    public String mUserName;
    public String userId;
    public boolean visitorBeFollowed;
    public static final long serialVersionUID = 0xa23b3b5cf23110e4;

    public void SimpleUserInfo(){
       super();
    }
}
