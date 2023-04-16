package com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo;

public class PhotoAdvertisement$CommentActionBarInfo$$Parcelable$a implements Parcelable$Creator	// class@0008e2
{

    public void PhotoAdvertisement$CommentActionBarInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CommentActionBarInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CommentActionBarInfo$$Parcelable(PhotoAdvertisement$CommentActionBarInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CommentActionBarInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$CommentActionBarInfo$$Parcelable[] uCommentActi = new PhotoAdvertisement$CommentActionBarInfo$$Parcelable[p0];
       return uCommentActi;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
