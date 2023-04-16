package com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$CommentActionBarInfo$$Parcelable implements Parcelable, d	// class@0008e3
{
    public PhotoAdvertisement$CommentActionBarInfo commentActionBarInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$CommentActionBarInfo$$Parcelable.CREATOR = new PhotoAdvertisement$CommentActionBarInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$CommentActionBarInfo$$Parcelable(PhotoAdvertisement$CommentActionBarInfo p0){
       super();
       this.commentActionBarInfo$$0 = p0;
    }
    public static PhotoAdvertisement$CommentActionBarInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$CommentActionBarInfo uCommentActi = new PhotoAdvertisement$CommentActionBarInfo();
          p1.f(p1.g(), uCommentActi);
          uCommentActi.mCommentActionLocation = p0.readString();
          uCommentActi.mTemplateId = p0.readString();
          uCommentActi.mDownloadNum = p0.readLong();
          uCommentActi.mCategoryWordColor = p0.readString();
          uCommentActi.mCommentActionbarTitle = p0.readString();
          uCommentActi.mAppCategory = p0.readString();
          uCommentActi.mActionbarStyle = p0.readString();
          uCommentActi.mDisplayInfo = p0.readString();
          uCommentActi.mLiveActionBarBgColor = p0.readString();
          uCommentActi.mActionBarColor = p0.readString();
          uCommentActi.mConvertedDescription = p0.readString();
          uCommentActi.mUserName = p0.readString();
          uCommentActi.mLiveActionBarTag = p0.readString();
          p1.f(i, uCommentActi);
          return uCommentActi;
       }
    }
    public static void write(PhotoAdvertisement$CommentActionBarInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCommentActionLocation);
          p1.writeString(p0.mTemplateId);
          p1.writeLong(p0.mDownloadNum);
          p1.writeString(p0.mCategoryWordColor);
          p1.writeString(p0.mCommentActionbarTitle);
          p1.writeString(p0.mAppCategory);
          p1.writeString(p0.mActionbarStyle);
          p1.writeString(p0.mDisplayInfo);
          p1.writeString(p0.mLiveActionBarBgColor);
          p1.writeString(p0.mActionBarColor);
          p1.writeString(p0.mConvertedDescription);
          p1.writeString(p0.mUserName);
          p1.writeString(p0.mLiveActionBarTag);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$CommentActionBarInfo getParcel(){
       return this.commentActionBarInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$CommentActionBarInfo$$Parcelable.write(this.commentActionBarInfo$$0, p0, p1, new a());
    }
}
