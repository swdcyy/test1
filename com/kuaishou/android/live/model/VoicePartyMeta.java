package com.kuaishou.android.live.model.VoicePartyMeta;
import java.io.Serializable;
import java.lang.Object;

public class VoicePartyMeta implements Serializable	// class@00083d
{
    public VoicePartyMeta$VoicePartyFeedBackgroundColor mBackgroundColor;
    public String mDisplayDistance;
    public boolean mIsNearBy;
    public int mMusicStatus;
    public List mUsers;
    public VoicePartyChannel mVoicePartyChannel;
    public String mVoicePartyContent;
    public String mVoicePartyId;
    public String mVoicePartyLabel;
    public VoicePartyMeta$VoicePartyPicture mVoicePartyPic;
    public int mVoicePartyPlayType;
    public String mVoicePartyTag;
    public String mVoicePartyTitle;
    public List mVoicePartyTopUsers;
    public int mVoicePartyUserAge;
    public static final long serialVersionUID = 0xac061d81b2826843;

    public void VoicePartyMeta(){
       super();
       this.mVoicePartyPlayType = 1;
    }
    public boolean isKtvPlayType(){
       boolean b = (this.mVoicePartyPlayType == 2)? true: false;
       return b;
    }
    public boolean isSingingMusic(){
       boolean b = (this.mMusicStatus > 2)? true: false;
       return b;
    }
}
