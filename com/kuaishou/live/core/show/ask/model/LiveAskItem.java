package com.kuaishou.live.core.show.ask.model.LiveAskItem;
import java.io.Serializable;
import com.kuaishou.live.core.show.ask.model.LiveAskItem$a;
import nsd.u;
import java.lang.Object;

public final class LiveAskItem implements Serializable	// class@0009ca
{
    public int mAskItemOrder;
    public String mContent;
    public long mCreateTime;
    public boolean mHasShown;
    public boolean mIsAnswering;
    public String mItemId;
    public int mLikeCount;
    public int mLikeStatus;
    public int mQuestionStatus;
    public UserInfo mUserInfo;
    public static final LiveAskItem$a Companion;
    public static final long serialVersionUID;

    static {
       LiveAskItem.Companion = new LiveAskItem$a(null);
    }
    public void LiveAskItem(){
       super();
       this.mLikeStatus = 1;
       this.mQuestionStatus = 1;
    }
}
