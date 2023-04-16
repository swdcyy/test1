package com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.io.Serializable;
import java.lang.Object;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.ArrayList;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;

public class BaseEditorFragment$Arguments implements Serializable	// class@0011e3
{
    public int forceDayNightMode;
    public boolean mAllowingStateLoss;
    public int mAtFriendMaxLimit;
    public int mAtFriendMaxLimitToastResId;
    public HashSet mAtFromAtPanelUidSet;
    public int mBottomTabBackgroundColorRes;
    public boolean mCancelWhenKeyboardHidden;
    public String mCommentOpenType;
    public boolean mDismissAfterEntryComplete;
    public EmotionInfo mEmotionInfo;
    public boolean mEnableAsr;
    public boolean mEnableAtFriends;
    public boolean mEnableEditorOpt;
    public boolean mEnableEmotion;
    public boolean mEnableEmpty;
    public boolean mEnableFinishShowWithSpace;
    public boolean mEnableGzoneEmotion;
    public boolean mEnableInputAt;
    public boolean mEnableLocation;
    public boolean mEnableNewGifEmotion;
    public boolean mEnableSendHotWordWithInitial;
    public boolean mEnableSendPicture;
    public boolean mEnableSingleLineHint;
    public boolean mEnableTextCountDownTipShow;
    public boolean mEnableTextLimitTipShow;
    public int mFinishButtonBackgroundResId;
    public boolean mFinishButtonLayoutGravityOnBottom;
    public String mFinishButtonText;
    public int mFinishButtonTextColorResId;
    public boolean mForceNewEditorStyle;
    public String mHintText;
    public ArrayList mHotWords;
    public int mImeOptions;
    public int mInputBackgroundResId;
    public int mInputContentBackResId;
    public boolean mInterceptEvents;
    public boolean mIsDisableEmojiClickLogger;
    public boolean mIsEditorMultiLineAdjust;
    public boolean mIsSlidePlay;
    public boolean mIsTubePlay;
    public int mKeyboardType;
    public int mMonitorId;
    public boolean mMonitorTextChanged;
    public boolean mOnlyShowKwaiEmoji;
    public QMedia mQMedia;
    public int mSelectUserBizId;
    public boolean mSendBtnPermanent;
    public boolean mShowAsrFirst;
    public boolean mShowAtFloatPanel;
    public boolean mShowAtGuideTips;
    public boolean mShowBelowEditorLayout;
    public boolean mShowEmojiFirst;
    public boolean mShowKeyBoardFirst;
    public boolean mShowLeftBtn;
    public boolean mShowTransparentStatus;
    public boolean mShowUserAlias;
    public boolean mSingleLine;
    public CharSequence mText;
    public int mTextLimit;
    public int mTheme;
    public boolean mTouchCancel;

    public void BaseEditorFragment$Arguments(){
       super();
       this.mEnableAtFriends = true;
       this.mEnableInputAt = false;
       this.mEnableEmotion = true;
       this.mEnableAsr = false;
       this.mImeOptions = -1;
       this.mKeyboardType = 0x20001;
       this.mDismissAfterEntryComplete = true;
       this.mShowKeyBoardFirst = true;
       this.mShowTransparentStatus = true;
       this.mShowUserAlias = false;
       this.mInputBackgroundResId = -1;
       this.mInputContentBackResId = -1;
       this.mOnlyShowKwaiEmoji = false;
       this.mSendBtnPermanent = false;
       this.mFinishButtonBackgroundResId = -1;
       this.mFinishButtonTextColorResId = -1;
       this.mEnableGzoneEmotion = false;
       this.mEnableNewGifEmotion = false;
       this.mEnableSingleLineHint = false;
       this.mEnableFinishShowWithSpace = false;
       this.mBottomTabBackgroundColorRes = 0;
       this.mAtFriendMaxLimit = -1;
       this.mSelectUserBizId = 0;
       this.forceDayNightMode = 0;
       this.mForceNewEditorStyle = false;
       this.mShowAtFloatPanel = false;
       this.mShowBelowEditorLayout = false;
       this.mEnableSendPicture = false;
       this.mEnableTextCountDownTipShow = true;
       this.mIsEditorMultiLineAdjust = true;
       this.mEnableTextLimitTipShow = true;
       this.mCommentOpenType = "RIGHT_COMMENT_BUTTON";
    }
    public static BaseEditorFragment$Arguments fromBundle(Bundle p0){
       BaseEditorFragment$Arguments obj = PatchProxy.applyOneRefs(p0, null, BaseEditorFragment$Arguments.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SerializableHook.getSerializable(p0, "ARGUMENTS");
       if (obj == null) {
          obj = new BaseEditorFragment$Arguments();
       }
       CharSequence charSequence = p0.getCharSequence("KEY_CHARS");
       obj.mText = charSequence;
       if (TextUtils.isEmpty(charSequence)) {
          obj.mText = p0.getCharSequence("text", "");
       }
       return obj;
    }
    public Bundle build(){
       Bundle obj = PatchProxy.apply(null, this, BaseEditorFragment$Arguments.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       SerializableHook.putSerializable(obj, "ARGUMENTS", this);
       obj.putCharSequence("KEY_CHARS", this.mText);
       return obj;
    }
    public BaseEditorFragment$Arguments setAllowEmpty(boolean p0){
       this.mEnableEmpty = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setAllowingStateLoss(boolean p0){
       this.mAllowingStateLoss = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setAtFriendMaxLimit(int p0,int p1){
       this.mAtFriendMaxLimit = p0;
       this.mAtFriendMaxLimitToastResId = p1;
       return this;
    }
    public BaseEditorFragment$Arguments setAtFromAtPanelUidSet(HashSet p0){
       this.mAtFromAtPanelUidSet = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setCancelWhileKeyboardHidden(boolean p0){
       this.mCancelWhenKeyboardHidden = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setCommentHotWords(ArrayList p0){
       this.mHotWords = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setCommentOpenType(String p0){
       this.mCommentOpenType = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setDisableEmojiClickLogger(boolean p0){
       this.mIsDisableEmojiClickLogger = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setDismissAfterEntryComplete(boolean p0){
       this.mDismissAfterEntryComplete = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEmotionInfo(EmotionInfo p0){
       this.mEmotionInfo = p0;
       if (p0 != null) {
          this.mQMedia = null;
       }
       return this;
    }
    public BaseEditorFragment$Arguments setEnableAsr(boolean p0){
       this.mEnableAsr = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableAtFriends(boolean p0){
       this.mEnableAtFriends = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableEditorOpt(boolean p0){
       this.mEnableEditorOpt = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableEmoji(boolean p0){
       this.mEnableEmotion = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableFinishShowWithSpace(boolean p0){
       this.mEnableFinishShowWithSpace = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableGzoneEmotions(boolean p0){
       this.mEnableGzoneEmotion = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableInputAt(boolean p0){
       this.mEnableInputAt = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableLocation(boolean p0){
       this.mEnableLocation = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableNewGifEmotions(boolean p0){
       this.mEnableNewGifEmotion = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableSendHotWordWithInitial(boolean p0){
       this.mEnableSendHotWordWithInitial = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableSendPicture(boolean p0){
       this.mEnableSendPicture = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableSingleLine(boolean p0){
       this.mSingleLine = p0;
       int i = (p0)? 1: 0x20001;
       this.mKeyboardType = i;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableSingleLineHint(boolean p0){
       this.mEnableSingleLineHint = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableTextCountDownTipShow(boolean p0){
       this.mEnableTextCountDownTipShow = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setEnableTextLimitTipShow(boolean p0){
       this.mEnableTextLimitTipShow = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setFinishButtonBackgroundResId(int p0){
       this.mFinishButtonBackgroundResId = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setFinishButtonLayoutGravityOnBottom(boolean p0){
       this.mFinishButtonLayoutGravityOnBottom = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setFinishButtonText(String p0){
       this.mFinishButtonText = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setFinishButtonTextColorResId(int p0){
       this.mFinishButtonTextColorResId = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setForceDayNightMode(int p0){
       this.forceDayNightMode = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setForceNewEditorStyle(boolean p0){
       this.mForceNewEditorStyle = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setHintText(String p0){
       this.mHintText = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setImeOptions(int p0){
       this.mImeOptions = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setInputBackgroundResId(int p0){
       this.mInputBackgroundResId = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setInputContentBackResId(int p0){
       this.mInputContentBackResId = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setInterceptEvent(boolean p0){
       this.mInterceptEvents = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setIsEditorMultiLineAdjust(boolean p0){
       this.mIsEditorMultiLineAdjust = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setKeyboardType(int p0){
       this.mKeyboardType = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setMonitorId(int p0){
       this.mMonitorId = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setMonitorTextChange(boolean p0){
       this.mMonitorTextChanged = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setOnlyShowKwaiEmoji(boolean p0){
       this.mOnlyShowKwaiEmoji = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setQMediaInfo(QMedia p0){
       this.mQMedia = p0;
       if (p0 != null) {
          this.mEmotionInfo = null;
       }
       return this;
    }
    public BaseEditorFragment$Arguments setSelectUserBizId(int p0){
       this.mSelectUserBizId = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setSendBtnPermanent(boolean p0){
       this.mSendBtnPermanent = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setShowAsrFirst(boolean p0){
       this.mShowAsrFirst = p0;
       this.mShowEmojiFirst = false;
       this.mShowKeyBoardFirst = p0 ^ 0x01;
       return this;
    }
    public BaseEditorFragment$Arguments setShowAtFloatPanel(boolean p0){
       this.mShowAtFloatPanel = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setShowAtGuideTips(boolean p0){
       this.mShowAtGuideTips = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setShowBelowEditorLayout(boolean p0){
       this.mShowBelowEditorLayout = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setShowEmojiAndKeyboard(boolean p0,boolean p1){
       this.mShowEmojiFirst = p0;
       this.mShowKeyBoardFirst = p1;
       this.mShowAsrFirst = false;
       return this;
    }
    public BaseEditorFragment$Arguments setShowEmojiFirst(boolean p0){
       this.mShowEmojiFirst = p0;
       this.mShowKeyBoardFirst = p0 ^ 0x01;
       this.mShowAsrFirst = false;
       return this;
    }
    public BaseEditorFragment$Arguments setShowKeyBoardFirst(boolean p0){
       this.mShowKeyBoardFirst = p0;
       this.mShowEmojiFirst = p0 ^ 0x01;
       this.mShowAsrFirst = false;
       return this;
    }
    public BaseEditorFragment$Arguments setShowLeftBtn(boolean p0){
       this.mShowLeftBtn = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setShowTransparentStatus(boolean p0){
       this.mShowTransparentStatus = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setShowUserAlias(boolean p0){
       this.mShowUserAlias = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setSlidePlay(boolean p0){
       this.mIsSlidePlay = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setText(CharSequence p0){
       this.mText = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setTextLimit(int p0){
       this.mTextLimit = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setTheme(int p0){
       this.mTheme = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setTouchCancel(boolean p0){
       this.mTouchCancel = p0;
       return this;
    }
    public BaseEditorFragment$Arguments setTubePlay(boolean p0){
       this.mIsTubePlay = p0;
       return this;
    }
}
