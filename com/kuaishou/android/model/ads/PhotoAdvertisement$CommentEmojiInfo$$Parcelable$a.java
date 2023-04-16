package com.kuaishou.android.model.ads.PhotoAdvertisement$CommentEmojiInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentEmojiInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentEmojiInfo;

public class PhotoAdvertisement$CommentEmojiInfo$$Parcelable$a implements Parcelable$Creator	// class@0008e6
{

    public void PhotoAdvertisement$CommentEmojiInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CommentEmojiInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CommentEmojiInfo$$Parcelable(PhotoAdvertisement$CommentEmojiInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CommentEmojiInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$CommentEmojiInfo$$Parcelable[] uCommentEmoj = new PhotoAdvertisement$CommentEmojiInfo$$Parcelable[p0];
       return uCommentEmoj;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
