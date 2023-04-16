package com.yxcorp.gifshow.comment.CommentTipsConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.comment.CommentTipsConfig$$Parcelable$a;
import com.yxcorp.gifshow.comment.CommentTipsConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CommentTipsConfig$$Parcelable implements Parcelable, d	// class@001096
{
    public CommentTipsConfig commentTipsConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CommentTipsConfig$$Parcelable.CREATOR = new CommentTipsConfig$$Parcelable$a();
    }
    public void CommentTipsConfig$$Parcelable(CommentTipsConfig p0){
       super();
       this.commentTipsConfig$$0 = p0;
    }
    public static CommentTipsConfig read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CommentTipsConfig uCommentTips = new CommentTipsConfig();
          p1.f(p1.g(), uCommentTips);
          uCommentTips.mEmptyViewTranslationY = p0.readFloat();
          uCommentTips.mEmptyRes = p0.readInt();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uCommentTips.mForceTipsCenter = b1;
          uCommentTips.mEmptyTextResId = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uCommentTips.mEnableFirstLoading = b1;
          uCommentTips.mEmptySubTextResId = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          uCommentTips.mDisableEmptyCommentGuide = b;
          p1.f(i, uCommentTips);
          return uCommentTips;
       }
    }
    public static void write(CommentTipsConfig p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeFloat(p0.mEmptyViewTranslationY);
          p1.writeInt(p0.mEmptyRes);
          p1.writeInt(p0.mForceTipsCenter);
          p1.writeInt(p0.mEmptyTextResId);
          p1.writeInt(p0.mEnableFirstLoading);
          p1.writeInt(p0.mEmptySubTextResId);
          p1.writeInt(p0.mDisableEmptyCommentGuide);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CommentTipsConfig getParcel(){
       return this.commentTipsConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CommentTipsConfig$$Parcelable.write(this.commentTipsConfig$$0, p0, p1, new a());
    }
}
