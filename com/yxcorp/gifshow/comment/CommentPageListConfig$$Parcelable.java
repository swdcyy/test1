package com.yxcorp.gifshow.comment.CommentPageListConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.comment.CommentPageListConfig$$Parcelable$a;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CommentPageListConfig$$Parcelable implements Parcelable, d	// class@001090
{
    public CommentPageListConfig commentPageListConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CommentPageListConfig$$Parcelable.CREATOR = new CommentPageListConfig$$Parcelable$a();
    }
    public void CommentPageListConfig$$Parcelable(CommentPageListConfig p0){
       super();
       this.commentPageListConfig$$0 = p0;
    }
    public static CommentPageListConfig read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CommentPageListConfig uCommentPage = new CommentPageListConfig();
          p1.f(p1.g(), uCommentPage);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uCommentPage.mEnableFoldComment = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentPage.mEnableLimitFirstRequestMinDuration = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentPage.mEnableUserInfoInComment = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uCommentPage.mEnableSinkComment = b1;
          uCommentPage.mCommentPanelType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uCommentPage.mEnableCommentEmotion = b1;
          uCommentPage.mHotCommentType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uCommentPage.mEnableSubBrowseMode = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          uCommentPage.mEnableFirstPageNoNetOpt = b;
          p1.f(i, uCommentPage);
          return uCommentPage;
       }
    }
    public static void write(CommentPageListConfig p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnableFoldComment);
          p1.writeInt(p0.mEnableLimitFirstRequestMinDuration);
          p1.writeInt(p0.mEnableUserInfoInComment);
          p1.writeInt(p0.mEnableSinkComment);
          p1.writeInt(p0.mCommentPanelType);
          p1.writeInt(p0.mEnableCommentEmotion);
          p1.writeInt(p0.mHotCommentType);
          p1.writeInt(p0.mEnableSubBrowseMode);
          p1.writeInt(p0.mEnableFirstPageNoNetOpt);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CommentPageListConfig getParcel(){
       return this.commentPageListConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CommentPageListConfig$$Parcelable.write(this.commentPageListConfig$$0, p0, p1, new a());
    }
}
