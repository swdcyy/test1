package com.yxcorp.gifshow.profile.model.IntimateFriend;
import java.io.Serializable;
import java.lang.Object;

public class IntimateFriend implements Serializable	// class@001389
{
    public String eid;
    public String following;
    public String headurl;
    public CDNUrl[] headurls;
    public IntimateTag intimateTag;
    public String kwaiId;
    public IntimateTag lastIntimateTag;
    public String sex;
    public int type;
    public String userId;
    public String userName;
    public String visitorBeFollowed;
    public static final long serialVersionUID = 0x2610fc9f0b9a0141;

    public void IntimateFriend(){
       super();
    }
}
