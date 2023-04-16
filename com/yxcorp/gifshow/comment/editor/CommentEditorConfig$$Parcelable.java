package com.yxcorp.gifshow.comment.editor.CommentEditorConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig$$Parcelable$a;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CommentEditorConfig$$Parcelable implements Parcelable, d	// class@0010be
{
    public CommentEditorConfig commentEditorConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CommentEditorConfig$$Parcelable.CREATOR = new CommentEditorConfig$$Parcelable$a();
    }
    public void CommentEditorConfig$$Parcelable(CommentEditorConfig p0){
       super();
       this.commentEditorConfig$$0 = p0;
    }
    public static CommentEditorConfig read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CommentEditorConfig uCommentEdit = new CommentEditorConfig();
          p1.f(p1.g(), uCommentEdit);
          uCommentEdit.mAtFriendMaxLimit = p0.readInt();
          uCommentEdit.mEditorTextLimit = p0.readInt();
          uCommentEdit.mForceDayNightMode = p0.readInt();
          uCommentEdit.mBottomEditorHint = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uCommentEdit.mEnableEmotion = b1;
          uCommentEdit.mAtFriendMaxLimitToastResId = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uCommentEdit.mEnablePicture = b1;
          uCommentEdit.mEditorMode = p0.readInt();
          uCommentEdit.mSelectUserBizId = p0.readInt();
          uCommentEdit.mFloatEditorTheme = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          uCommentEdit.mEnableAtLimit = b;
          p1.f(i, uCommentEdit);
          return uCommentEdit;
       }
    }
    public static void write(CommentEditorConfig p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mAtFriendMaxLimit);
          p1.writeInt(p0.mEditorTextLimit);
          p1.writeInt(p0.mForceDayNightMode);
          p1.writeString(p0.mBottomEditorHint);
          p1.writeInt(p0.mEnableEmotion);
          p1.writeInt(p0.mAtFriendMaxLimitToastResId);
          p1.writeInt(p0.mEnablePicture);
          p1.writeInt(p0.mEditorMode);
          p1.writeInt(p0.mSelectUserBizId);
          p1.writeInt(p0.mFloatEditorTheme);
          p1.writeInt(p0.mEnableAtLimit);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CommentEditorConfig getParcel(){
       return this.commentEditorConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CommentEditorConfig$$Parcelable.write(this.commentEditorConfig$$0, p0, p1, new a());
    }
}
