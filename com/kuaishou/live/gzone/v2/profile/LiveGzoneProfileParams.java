package com.kuaishou.live.gzone.v2.profile.LiveGzoneProfileParams;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import java.lang.String;

public class LiveGzoneProfileParams extends LiveProfileParams	// class@001cd9
{
    public boolean mGzoneAuthorAuthenticationTagEnabled;
    public boolean mIsChattingUser;
    public boolean mIsGzoneHidePhotoList;
    public boolean mIsGzoneHideUserInfoTag;
    public boolean mIsHideAtAudience;
    public boolean mIsHideMoreButton;
    public String mReplacedUserText;
    public static final long serialVersionUID = 0xd047a4e1a616e640;

    public void LiveGzoneProfileParams(){
       super();
    }
    public String getReplacedUserText(){
       return this.mReplacedUserText;
    }
    public boolean isChattingUser(){
       return this.mIsChattingUser;
    }
    public boolean isGzoneAuthorAuthenticationTagEnabled(){
       return this.mGzoneAuthorAuthenticationTagEnabled;
    }
    public boolean isGzoneHidePhotoList(){
       return this.mIsGzoneHidePhotoList;
    }
    public boolean isGzoneHideUserInfoTag(){
       return this.mIsGzoneHideUserInfoTag;
    }
    public boolean isHideAtAudience(){
       return this.mIsHideAtAudience;
    }
    public boolean isHideMoreButton(){
       return false;
    }
    public LiveProfileParams setChattingUser(boolean p0){
       this.mIsChattingUser = p0;
       return this;
    }
    public LiveProfileParams setGzoneAuthorAuthenticationTagEnable(boolean p0){
       this.mGzoneAuthorAuthenticationTagEnabled = p0;
       return this;
    }
    public void setGzoneHidePhotoList(boolean p0){
       this.mIsGzoneHidePhotoList = p0;
    }
    public void setGzoneHideUserInfoTag(boolean p0){
       this.mIsGzoneHideUserInfoTag = p0;
    }
    public LiveProfileParams setHideAtAudience(boolean p0){
       this.mIsHideAtAudience = p0;
       return this;
    }
    public LiveProfileParams setHideMoreButton(boolean p0){
       this.mIsHideMoreButton = p0;
       return this;
    }
    public void setReplacedUserText(String p0){
       this.mReplacedUserText = p0;
    }
}
