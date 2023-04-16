package com.yxcorp.gifshow.comment.CommentConfig;
import java.lang.Object;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import com.yxcorp.gifshow.comment.CommentTipsConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class CommentConfig	// class@00108e
{
    public boolean mAnchorToCommentItemTopWithOffset;
    public boolean mAutoSendAttachPageEvent;
    public boolean mAvoidAdaptEditorPanelCoverList;
    public boolean mDisableAllBubbleGuide;
    public boolean mDisableAnchorComment;
    public boolean mDisableAutoReply;
    public boolean mDisableGodCommentRecommendGuide;
    public CommentEditorConfig mEditorConfig;
    public boolean mEnableBaseEditorWidget;
    public boolean mEnableConversation;
    public boolean mEnableFixScrollError;
    public boolean mEnableLastViewedButton;
    public boolean mEnableLastViewedCheckHeader;
    public boolean mEnableNewLikeDislikeUi;
    public boolean mEnableShowCaptionTitle;
    public boolean mEnableShowPermissionTips;
    public boolean mEnableSubItemAnimation;
    public int mFloatButtonHidingSpace;
    public boolean mForcePage2Null;
    public boolean mIsSupportWhiteComment;
    public boolean mLocationAfterAddComment;
    public boolean mLogCommentIncludeQuickCommentInfo;
    public boolean mLogCommentShowOnDestroy;
    public boolean mNeedScrollToComment;
    public int mPage;
    public int mPageCategory;
    public CommentPageListConfig mPageListConfig;
    public int mThemeStyle;
    public CommentTipsConfig mTipsConfig;
    public boolean mUseLazyInit;

    public void CommentConfig(){
       super();
       this.mIsSupportWhiteComment = true;
       this.mLogCommentShowOnDestroy = true;
       this.mEnableFixScrollError = true;
       this.mAutoSendAttachPageEvent = true;
       this.mEnableConversation = true;
       this.mPageCategory = -1;
       this.mPage = -1;
       this.mEnableLastViewedCheckHeader = false;
       this.mEnableLastViewedButton = true;
       this.mPageListConfig = new CommentPageListConfig();
       this.mEditorConfig = new CommentEditorConfig();
       this.mTipsConfig = new CommentTipsConfig();
    }
    public CommentConfig copy(){
       Object[] objArray = null;
       CommentConfig obj = PatchProxy.apply(objArray, this, CommentConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CommentConfig();
       obj.mIsSupportWhiteComment = this.mIsSupportWhiteComment;
       obj.mNeedScrollToComment = this.mNeedScrollToComment;
       obj.mAnchorToCommentItemTopWithOffset = this.mAnchorToCommentItemTopWithOffset;
       obj.mLocationAfterAddComment = this.mLocationAfterAddComment;
       obj.mLogCommentShowOnDestroy = this.mLogCommentShowOnDestroy;
       obj.mLogCommentIncludeQuickCommentInfo = this.mLogCommentIncludeQuickCommentInfo;
       obj.mDisableAutoReply = this.mDisableAutoReply;
       obj.mEnableFixScrollError = this.mEnableFixScrollError;
       obj.mEnableShowCaptionTitle = this.mEnableShowCaptionTitle;
       obj.mAutoSendAttachPageEvent = this.mAutoSendAttachPageEvent;
       obj.mEnableShowPermissionTips = this.mEnableShowPermissionTips;
       obj.mThemeStyle = this.mThemeStyle;
       obj.mPage = this.mPage;
       obj.mPageCategory = this.mPageCategory;
       obj.mUseLazyInit = this.mUseLazyInit;
       obj.mForcePage2Null = this.mForcePage2Null;
       obj.mEnableNewLikeDislikeUi = this.mEnableNewLikeDislikeUi;
       obj.mEnableConversation = this.mEnableConversation;
       CommentConfig tmEditorConf = this.mEditorConfig;
       CommentEditorConfig uCommentEdit = (tmEditorConf != null)? tmEditorConf.copy(): objArray;
       obj.mEditorConfig = uCommentEdit;
       tmEditorConf = this.mPageListConfig;
       CommentPageListConfig uCommentPage = (tmEditorConf != null)? tmEditorConf.copy(): objArray;
       obj.mPageListConfig = uCommentPage;
       tmEditorConf = this.mTipsConfig;
       if (tmEditorConf != null) {
          objArray = tmEditorConf.copy();
       }
       obj.mTipsConfig = objArray;
       obj.mAvoidAdaptEditorPanelCoverList = this.mAvoidAdaptEditorPanelCoverList;
       return obj;
    }
}
