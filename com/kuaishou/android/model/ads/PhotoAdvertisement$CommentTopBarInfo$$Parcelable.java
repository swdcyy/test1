package com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import java.util.HashMap;

public class PhotoAdvertisement$CommentTopBarInfo$$Parcelable implements Parcelable, d	// class@0008eb
{
    public PhotoAdvertisement$CommentTopBarInfo commentTopBarInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$CommentTopBarInfo$$Parcelable.CREATOR = new PhotoAdvertisement$CommentTopBarInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$CommentTopBarInfo$$Parcelable(PhotoAdvertisement$CommentTopBarInfo p0){
       super();
       this.commentTopBarInfo$$0 = p0;
    }
    public static PhotoAdvertisement$CommentTopBarInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$CommentTopBarInfo uCommentTopB = new PhotoAdvertisement$CommentTopBarInfo();
          p1.f(p1.g(), uCommentTopB);
          uCommentTopB.mMainDesc = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uCommentTopB.mShowArrow = b;
          uCommentTopB.mMainTitle = p0.readString();
          uCommentTopB.mSubDesc = p0.readString();
          uCommentTopB.mClientExtData = p0.readSerializable();
          uCommentTopB.mIconUrl = p0.readString();
          uCommentTopB.mSubTitle = p0.readString();
          uCommentTopB.mTag = p0.readString();
          p1.f(i, uCommentTopB);
          return uCommentTopB;
       }
    }
    public static void write(PhotoAdvertisement$CommentTopBarInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mMainDesc);
          p1.writeInt(p0.mShowArrow);
          p1.writeString(p0.mMainTitle);
          p1.writeString(p0.mSubDesc);
          p1.writeSerializable(p0.mClientExtData);
          p1.writeString(p0.mIconUrl);
          p1.writeString(p0.mSubTitle);
          p1.writeString(p0.mTag);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$CommentTopBarInfo getParcel(){
       return this.commentTopBarInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$CommentTopBarInfo$$Parcelable.write(this.commentTopBarInfo$$0, p0, p1, new a());
    }
}
