package com.kuaishou.live.core.show.ask.model.LiveAskAndChatTabConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Boolean;
import ok.x;
import com.google.common.base.Suppliers;

public class LiveAskAndChatTabConfig implements Serializable	// class@0009c7
{
    public int mAskQuestionWordsLimit;
    public String mCurrentAskId;
    public int mCurrentAskNum;
    public int mCurrentChatNum;
    public boolean mEnableLockAsk;
    public boolean mEnableThanks;
    public boolean mIsAnchor;
    public boolean mIsAutoOpenKeyboard;
    public x mIsForbiddenCommentSupplier;
    public LiveAskAndChatType mLiveAskAndChatType;
    public String mLiveStreamId;
    public int mTargetTabIndex;
    public static final long serialVersionUID = 0xe4fc162c0f8d9f90;

    public void LiveAskAndChatTabConfig(){
       super();
       this.mCurrentAskNum = 0;
       this.mCurrentChatNum = 0;
       this.mTargetTabIndex = 0;
       this.mIsAutoOpenKeyboard = false;
       this.mAskQuestionWordsLimit = 0;
       this.mIsForbiddenCommentSupplier = Suppliers.b(Boolean.FALSE);
    }
}
