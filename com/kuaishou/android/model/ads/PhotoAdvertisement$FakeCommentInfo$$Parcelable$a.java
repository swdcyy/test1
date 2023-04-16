package com.kuaishou.android.model.ads.PhotoAdvertisement$FakeCommentInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FakeCommentInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FakeCommentInfo;

public class PhotoAdvertisement$FakeCommentInfo$$Parcelable$a implements Parcelable$Creator	// class@00092e
{

    public void PhotoAdvertisement$FakeCommentInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$FakeCommentInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$FakeCommentInfo$$Parcelable(PhotoAdvertisement$FakeCommentInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$FakeCommentInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$FakeCommentInfo$$Parcelable[] uFakeComment = new PhotoAdvertisement$FakeCommentInfo$$Parcelable[p0];
       return uFakeComment;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
