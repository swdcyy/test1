package com.yxcorp.gifshow.detail.model.comment.CommentGuessSearch$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.model.comment.CommentGuessSearch$$Parcelable$a;
import com.yxcorp.gifshow.detail.model.comment.CommentGuessSearch;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CommentGuessSearch$$Parcelable implements Parcelable, d	// class@00158f
{
    public CommentGuessSearch commentGuessSearch$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CommentGuessSearch$$Parcelable.CREATOR = new CommentGuessSearch$$Parcelable$a();
    }
    public void CommentGuessSearch$$Parcelable(CommentGuessSearch p0){
       super();
       this.commentGuessSearch$$0 = p0;
    }
    public static CommentGuessSearch read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CommentGuessSearch uCommentGues = new CommentGuessSearch();
          p1.f(p1.g(), uCommentGues);
          uCommentGues.mQueryId = p0.readString();
          uCommentGues.mQueryListId = p0.readString();
          uCommentGues.mDisplayPrefix = p0.readString();
          uCommentGues.mQueryName = p0.readString();
          uCommentGues.mSearchWordUrl = p0.readString();
          uCommentGues.mIconUrl = p0.readString();
          p1.f(i, uCommentGues);
          return uCommentGues;
       }
    }
    public static void write(CommentGuessSearch p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mQueryId);
          p1.writeString(p0.mQueryListId);
          p1.writeString(p0.mDisplayPrefix);
          p1.writeString(p0.mQueryName);
          p1.writeString(p0.mSearchWordUrl);
          p1.writeString(p0.mIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CommentGuessSearch getParcel(){
       return this.commentGuessSearch$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CommentGuessSearch$$Parcelable.write(this.commentGuessSearch$$0, p0, p1, new a());
    }
}
