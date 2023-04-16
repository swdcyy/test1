package com.kuaishou.live.basic.model.QLiveMessage;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;

public class QLiveMessage implements Serializable	// class@000cde
{
    public int mBackgroundGroupType;
    public String mContent;
    public String mDeviceHash;
    public int mDisplayWeight;
    public boolean mEnableKwaiEmoji;
    public String mFeatureName;
    public boolean mHasLastButton;
    public boolean mHasShowed;
    public String mId;
    public boolean mIsAnonymous;
    public boolean mIsFoldMessage;
    public int mLiveAssistantType;
    public LiveAudienceState mLiveAudienceState;
    public String mLogId;
    public long mSortRank;
    public int mTagId;
    public long mTime;
    public UserInfo mUser;
    public int mWealthGrade;
    public static final long serialVersionUID = 0xdfd1fd00ec5d43e9;

    public void QLiveMessage(){
       super();
       this.mEnableKwaiEmoji = true;
       this.mIsAnonymous = false;
       this.mIsFoldMessage = false;
       this.mHasLastButton = false;
    }
    public QLiveMessage cast(){
       return this;
    }
    public int getBackgroundGroupType(){
       return this.mBackgroundGroupType;
    }
    public String getContent(){
       return this.mContent;
    }
    public int getDisplayWeight(){
       return this.mDisplayWeight;
    }
    public boolean getHasLastButton(){
       return this.mHasLastButton;
    }
    public String getId(){
       return this.mId;
    }
    public int getLiveAssistantType(){
       return this.mLiveAssistantType;
    }
    public long getSortRank(){
       return this.mSortRank;
    }
    public long getTime(){
       return this.mTime;
    }
    public UserInfo getUser(){
       return this.mUser;
    }
    public QLiveMessage setAnonymous(boolean p0){
       this.mIsAnonymous = p0;
       return this;
    }
    public QLiveMessage setBackgroundGroupType(int p0){
       this.mBackgroundGroupType = p0;
       return this;
    }
    public QLiveMessage setContent(String p0){
       this.mContent = p0;
       return this;
    }
    public QLiveMessage setDeviceHash(String p0){
       this.mDeviceHash = p0;
       return this;
    }
    public QLiveMessage setDisplayWeight(int p0){
       this.mDisplayWeight = p0;
       return this;
    }
    public void setHasLastButton(boolean p0){
       this.mHasLastButton = p0;
    }
    public QLiveMessage setId(String p0){
       this.mId = p0;
       return this;
    }
    public QLiveMessage setLiveAssistantType(int p0){
       this.mLiveAssistantType = p0;
       return this;
    }
    public QLiveMessage setLiveAudienceState(LiveAudienceState p0){
       this.mLiveAudienceState = p0;
       return this;
    }
    public QLiveMessage setSortRank(long p0){
       this.mSortRank = p0;
       return this;
    }
    public QLiveMessage setTime(long p0){
       this.mTime = p0;
       return this;
    }
    public QLiveMessage setUser(UserInfo p0){
       this.mUser = p0;
       return this;
    }
    public void setWealthGrade(int p0){
       this.mWealthGrade = p0;
    }
}
