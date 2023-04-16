package com.kuaishou.android.model.ads.PhotoAdvertisement$CommentEmojiInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentEmojiInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentEmojiInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$CommentEmojiInfo$$Parcelable implements Parcelable, d	// class@0008e7
{
    public PhotoAdvertisement$CommentEmojiInfo commentEmojiInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$CommentEmojiInfo$$Parcelable.CREATOR = new PhotoAdvertisement$CommentEmojiInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$CommentEmojiInfo$$Parcelable(PhotoAdvertisement$CommentEmojiInfo p0){
       super();
       this.commentEmojiInfo$$0 = p0;
    }
    public static PhotoAdvertisement$CommentEmojiInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$CommentEmojiInfo uCommentEmoj = new PhotoAdvertisement$CommentEmojiInfo();
          p1.f(p1.g(), uCommentEmoj);
          uCommentEmoj.mIconType = p0.readInt();
          uCommentEmoj.mCommentMsg = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
             list = uArrayList;
          }
          uCommentEmoj.mIconList = list;
          p1.f(i, uCommentEmoj);
          return uCommentEmoj;
       }
    }
    public static void write(PhotoAdvertisement$CommentEmojiInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIconType);
          p1.writeString(p0.mCommentMsg);
          PhotoAdvertisement$CommentEmojiInfo mIconList = p0.mIconList;
          if (mIconList == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mIconList.size());
             Iterator iterator = p0.mIconList.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$CommentEmojiInfo getParcel(){
       return this.commentEmojiInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$CommentEmojiInfo$$Parcelable.write(this.commentEmojiInfo$$0, p0, p1, new a());
    }
}
