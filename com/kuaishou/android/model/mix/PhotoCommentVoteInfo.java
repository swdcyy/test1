package com.kuaishou.android.model.mix.PhotoCommentVoteInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoCommentVoteInfo$Option;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Boolean;
import java.lang.System;

public class PhotoCommentVoteInfo implements Serializable	// class@000d36
{
    public long mEndTimeStamp;
    public String mId;
    public boolean mIsVoteFinish;
    public List mOptionList;
    public int mParticipants;
    public String mStarter;
    public String mTopic;
    public int mType;
    public PhotoCommentVoteInfo$UserVoteStatus mUserVoteStatus;
    public static final long serialVersionUID = 0x257019ab6e700f1d;

    public void PhotoCommentVoteInfo(){
       super();
    }
    public PhotoCommentVoteInfo$Option getFirstOption(){
       Object obj = PatchProxy.apply(null, this, PhotoCommentVoteInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mOptionList.get(0);
    }
    public PhotoCommentVoteInfo$Option getSecondOption(){
       Object obj = PatchProxy.apply(null, this, PhotoCommentVoteInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mOptionList.get(1);
    }
    public boolean isValidVote(){
       PhotoCommentVoteInfo obj = PatchProxy.apply(null, this, PhotoCommentVoteInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mOptionList;
       if (obj == null || obj.size() != 2) {
          return false;
       }
       return true;
    }
    public boolean isVoteFinish(){
       Object obj = PatchProxy.apply(null, this, PhotoCommentVoteInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mIsVoteFinish != null || System.currentTimeMillis() - this.mEndTimeStamp >= 0)? true: false;
       return b;
    }
}
