package com.yxcorp.gifshow.comment.CommentConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.comment.CommentConfig$$Parcelable$a;
import com.yxcorp.gifshow.comment.CommentConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig$$Parcelable;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import com.yxcorp.gifshow.comment.CommentPageListConfig$$Parcelable;
import com.yxcorp.gifshow.comment.CommentTipsConfig;
import com.yxcorp.gifshow.comment.CommentTipsConfig$$Parcelable;

public class CommentConfig$$Parcelable implements Parcelable, d	// class@00108d
{
    public CommentConfig commentConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CommentConfig$$Parcelable.CREATOR = new CommentConfig$$Parcelable$a();
    }
    public void CommentConfig$$Parcelable(CommentConfig p0){
       super();
       this.commentConfig$$0 = p0;
    }
    public static CommentConfig read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CommentConfig uCommentConf = new CommentConfig();
          p1.f(p1.g(), uCommentConf);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mEnableLastViewedCheckHeader = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mDisableAutoReply = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mEnableFixScrollError = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mEnableBaseEditorWidget = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mAvoidAdaptEditorPanelCoverList = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mDisableAnchorComment = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mLogCommentIncludeQuickCommentInfo = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mLocationAfterAddComment = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mEnableNewLikeDislikeUi = b1;
          uCommentConf.mFloatButtonHidingSpace = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mIsSupportWhiteComment = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mDisableGodCommentRecommendGuide = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mNeedScrollToComment = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mEnableShowCaptionTitle = b1;
          uCommentConf.mPageCategory = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mEnableShowPermissionTips = b1;
          uCommentConf.mEditorConfig = CommentEditorConfig$$Parcelable.read(p0, p1);
          uCommentConf.mPageListConfig = CommentPageListConfig$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mEnableSubItemAnimation = b1;
          uCommentConf.mThemeStyle = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mForcePage2Null = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mAnchorToCommentItemTopWithOffset = b1;
          uCommentConf.mTipsConfig = CommentTipsConfig$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mEnableConversation = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mDisableAllBubbleGuide = b1;
          uCommentConf.mPage = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mEnableLastViewedButton = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mLogCommentShowOnDestroy = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentConf.mAutoSendAttachPageEvent = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          uCommentConf.mUseLazyInit = b;
          p1.f(i, uCommentConf);
          return uCommentConf;
       }
    }
    public static void write(CommentConfig p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnableLastViewedCheckHeader);
          p1.writeInt(p0.mDisableAutoReply);
          p1.writeInt(p0.mEnableFixScrollError);
          p1.writeInt(p0.mEnableBaseEditorWidget);
          p1.writeInt(p0.mAvoidAdaptEditorPanelCoverList);
          p1.writeInt(p0.mDisableAnchorComment);
          p1.writeInt(p0.mLogCommentIncludeQuickCommentInfo);
          p1.writeInt(p0.mLocationAfterAddComment);
          p1.writeInt(p0.mEnableNewLikeDislikeUi);
          p1.writeInt(p0.mFloatButtonHidingSpace);
          p1.writeInt(p0.mIsSupportWhiteComment);
          p1.writeInt(p0.mDisableGodCommentRecommendGuide);
          p1.writeInt(p0.mNeedScrollToComment);
          p1.writeInt(p0.mEnableShowCaptionTitle);
          p1.writeInt(p0.mPageCategory);
          p1.writeInt(p0.mEnableShowPermissionTips);
          CommentEditorConfig$$Parcelable.write(p0.mEditorConfig, p1, p2, p3);
          CommentPageListConfig$$Parcelable.write(p0.mPageListConfig, p1, p2, p3);
          p1.writeInt(p0.mEnableSubItemAnimation);
          p1.writeInt(p0.mThemeStyle);
          p1.writeInt(p0.mForcePage2Null);
          p1.writeInt(p0.mAnchorToCommentItemTopWithOffset);
          CommentTipsConfig$$Parcelable.write(p0.mTipsConfig, p1, p2, p3);
          p1.writeInt(p0.mEnableConversation);
          p1.writeInt(p0.mDisableAllBubbleGuide);
          p1.writeInt(p0.mPage);
          p1.writeInt(p0.mEnableLastViewedButton);
          p1.writeInt(p0.mLogCommentShowOnDestroy);
          p1.writeInt(p0.mAutoSendAttachPageEvent);
          p1.writeInt(p0.mUseLazyInit);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CommentConfig getParcel(){
       return this.commentConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CommentConfig$$Parcelable.write(this.commentConfig$$0, p0, p1, new a());
    }
}
