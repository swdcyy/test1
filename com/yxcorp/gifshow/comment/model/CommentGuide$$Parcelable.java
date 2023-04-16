package com.yxcorp.gifshow.comment.model.CommentGuide$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.comment.model.CommentGuide$$Parcelable$a;
import com.yxcorp.gifshow.comment.model.CommentGuide;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.io.Serializable;
import com.yxcorp.gifshow.comment.model.CommentGuide$EmojiBean;
import java.util.List;
import java.util.Iterator;

public class CommentGuide$$Parcelable implements Parcelable, d	// class@0010e4
{
    public CommentGuide commentGuide$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CommentGuide$$Parcelable.CREATOR = new CommentGuide$$Parcelable$a();
    }
    public void CommentGuide$$Parcelable(CommentGuide p0){
       super();
       this.commentGuide$$0 = p0;
    }
    public static CommentGuide read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CommentGuide uCommentGuid = new CommentGuide();
          p1.f(p1.g(), uCommentGuid);
          uCommentGuid.mDefaultText = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
             list = uArrayList;
          }
          uCommentGuid.mEmojiResources = list;
          p1.f(i, uCommentGuid);
          return uCommentGuid;
       }
    }
    public static void write(CommentGuide p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mDefaultText);
          CommentGuide mEmojiResour = p0.mEmojiResources;
          if (mEmojiResour == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mEmojiResour.size());
             Iterator iterator = p0.mEmojiResources.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CommentGuide getParcel(){
       return this.commentGuide$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CommentGuide$$Parcelable.write(this.commentGuide$$0, p0, p1, new a());
    }
}
