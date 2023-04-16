package com.yxcorp.gifshow.comment.CommentParams$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.comment.CommentParams$$Parcelable$a;
import com.yxcorp.gifshow.comment.CommentParams;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.gifshow.entity.QPreInfo$$Parcelable;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.android.model.mix.QComment$$Parcelable;

public class CommentParams$$Parcelable implements Parcelable, d	// class@001093
{
    public CommentParams commentParams$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CommentParams$$Parcelable.CREATOR = new CommentParams$$Parcelable$a();
    }
    public void CommentParams$$Parcelable(CommentParams p0){
       super();
       this.commentParams$$0 = p0;
    }
    public static CommentParams read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CommentParams uCommentPara = new CommentParams();
          p1.f(p1.g(), uCommentPara);
          uCommentPara.mPhotoIndex = p0.readInt();
          uCommentPara.mQPhoto = QPhoto$$Parcelable.read(p0, p1);
          uCommentPara.mCommentLoggerSource = p0.readString();
          uCommentPara.mPreInfo = QPreInfo$$Parcelable.read(p0, p1);
          uCommentPara.mLogWatchId = p0.readString();
          uCommentPara.mComment = QComment$$Parcelable.read(p0, p1);
          uCommentPara.mADCallback = p0.readString();
          p1.f(i, uCommentPara);
          return uCommentPara;
       }
    }
    public static void write(CommentParams p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mPhotoIndex);
          QPhoto$$Parcelable.write(p0.mQPhoto, p1, p2, p3);
          p1.writeString(p0.mCommentLoggerSource);
          QPreInfo$$Parcelable.write(p0.mPreInfo, p1, p2, p3);
          p1.writeString(p0.mLogWatchId);
          QComment$$Parcelable.write(p0.mComment, p1, p2, p3);
          p1.writeString(p0.mADCallback);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CommentParams getParcel(){
       return this.commentParams$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CommentParams$$Parcelable.write(this.commentParams$$0, p0, p1, new a());
    }
}
