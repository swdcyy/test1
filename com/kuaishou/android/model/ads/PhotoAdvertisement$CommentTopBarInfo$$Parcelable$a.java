package com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo;

public class PhotoAdvertisement$CommentTopBarInfo$$Parcelable$a implements Parcelable$Creator	// class@0008ea
{

    public void PhotoAdvertisement$CommentTopBarInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CommentTopBarInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CommentTopBarInfo$$Parcelable(PhotoAdvertisement$CommentTopBarInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CommentTopBarInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$CommentTopBarInfo$$Parcelable[] uCommentTopB = new PhotoAdvertisement$CommentTopBarInfo$$Parcelable[p0];
       return uCommentTopB;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
