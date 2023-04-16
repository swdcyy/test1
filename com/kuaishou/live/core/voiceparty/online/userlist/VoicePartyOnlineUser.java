package com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import java.io.Serializable;
import java.lang.Object;

public class VoicePartyOnlineUser implements Serializable	// class@001803
{
    public String mAge;
    public long mApplyTimeMs;
    public UserInfo mApplyUserInfo;
    public String mDisplayKsCoin;
    public boolean mIsUserNotInLivingRoom;
    public boolean mIsUserOnline;
    public long mLastUserOnlineTimeMs;
    public String mLocation;
    public String mNextOrderedMusicName;
    public int mOrderedMusicCount;
    public int mStatus;
    public int mTeamType;
    public int mUserRelation;
    public static final long serialVersionUID = 0x2d9b8510fcba2488;

    public void VoicePartyOnlineUser(){
       super();
       this.mStatus = 0;
    }
}
