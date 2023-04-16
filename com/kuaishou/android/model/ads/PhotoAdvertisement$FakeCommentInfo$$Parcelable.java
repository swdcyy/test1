package com.kuaishou.android.model.ads.PhotoAdvertisement$FakeCommentInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FakeCommentInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FakeCommentInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$FakeCommentInfo$$Parcelable implements Parcelable, d	// class@00092f
{
    public PhotoAdvertisement$FakeCommentInfo fakeCommentInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$FakeCommentInfo$$Parcelable.CREATOR = new PhotoAdvertisement$FakeCommentInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$FakeCommentInfo$$Parcelable(PhotoAdvertisement$FakeCommentInfo p0){
       super();
       this.fakeCommentInfo$$0 = p0;
    }
    public static PhotoAdvertisement$FakeCommentInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$FakeCommentInfo uFakeComment = new PhotoAdvertisement$FakeCommentInfo();
          p1.f(p1.g(), uFakeComment);
          uFakeComment.mUserIconUrl = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uFakeComment.mEnableHideFakeComment = b;
          uFakeComment.mLiveFakeTitle = p0.readString();
          uFakeComment.mConvertedDescription = p0.readString();
          uFakeComment.mUserName = p0.readString();
          p1.f(i, uFakeComment);
          return uFakeComment;
       }
    }
    public static void write(PhotoAdvertisement$FakeCommentInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUserIconUrl);
          p1.writeInt(p0.mEnableHideFakeComment);
          p1.writeString(p0.mLiveFakeTitle);
          p1.writeString(p0.mConvertedDescription);
          p1.writeString(p0.mUserName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$FakeCommentInfo getParcel(){
       return this.fakeCommentInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$FakeCommentInfo$$Parcelable.write(this.fakeCommentInfo$$0, p0, p1, new a());
    }
}
