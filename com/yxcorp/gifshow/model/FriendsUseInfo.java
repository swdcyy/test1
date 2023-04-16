package com.yxcorp.gifshow.model.FriendsUseInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;

public class FriendsUseInfo implements Serializable, Cloneable	// class@001e1f
{
    public List mAvatarUrlList;
    public String mDefaultTitle;
    public int mUseCount;
    public static final long serialVersionUID = 0x2581329fe6351447;

    public void FriendsUseInfo(){
       super();
    }
    public int getUseCount(){
       return this.mUseCount;
    }
}
