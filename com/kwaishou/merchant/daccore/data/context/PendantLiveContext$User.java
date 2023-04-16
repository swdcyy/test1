package com.kwaishou.merchant.daccore.data.context.PendantLiveContext$User;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.String;

public final class PendantLiveContext$User implements Serializable	// class@001314
{
    public List avatars;
    public boolean following;
    public String name;
    public String userId;

    public void PendantLiveContext$User(){
       super();
       this.userId = "";
       this.name = "";
    }
    public final List getAvatars(){
       return this.avatars;
    }
    public final boolean getFollowing(){
       return this.following;
    }
    public final String getName(){
       return this.name;
    }
    public final String getUserId(){
       return this.userId;
    }
    public final void setAvatars(List p0){
       this.avatars = p0;
    }
    public final void setFollowing(boolean p0){
       this.following = p0;
    }
    public final void setName(String p0){
       this.name = p0;
    }
    public final void setUserId(String p0){
       this.userId = p0;
    }
}
