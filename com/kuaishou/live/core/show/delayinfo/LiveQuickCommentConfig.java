package com.kuaishou.live.core.show.delayinfo.LiveQuickCommentConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveQuickCommentConfig implements Serializable	// class@000af3
{
    public String mBizId;
    public boolean mClickDisappear;
    public LiveQuickCommentContainer$LiveQuickCommentItem[] mComments;
    public long mDelayDisplayMs;
    public long mDisPlayExpireMs;
    public int mPriority;
    public long mSlideInternalMs;
    public static final long serialVersionUID = 0xced45f7daa6775a8;

    public void LiveQuickCommentConfig(){
       super();
    }
}
