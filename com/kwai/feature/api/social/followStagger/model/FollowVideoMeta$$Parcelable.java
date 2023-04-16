package com.kwai.feature.api.social.followStagger.model.FollowVideoMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.followStagger.model.FollowVideoMeta$$Parcelable$a;
import com.kwai.feature.api.social.followStagger.model.FollowVideoMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo$$Parcelable;

public class FollowVideoMeta$$Parcelable implements Parcelable, d	// class@0010d8
{
    public FollowVideoMeta followVideoMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FollowVideoMeta$$Parcelable.CREATOR = new FollowVideoMeta$$Parcelable$a();
    }
    public void FollowVideoMeta$$Parcelable(FollowVideoMeta p0){
       super();
       this.followVideoMeta$$0 = p0;
    }
    public static FollowVideoMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          FollowVideoMeta uFollowVideo = new FollowVideoMeta();
          p1.f(p1.g(), uFollowVideo);
          uFollowVideo.mUserAvatarInfo = FeedUserAvatarInfo$$Parcelable.read(p0, p1);
          p1.f(i, uFollowVideo);
          return uFollowVideo;
       }
    }
    public static void write(FollowVideoMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          FeedUserAvatarInfo$$Parcelable.write(p0.mUserAvatarInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FollowVideoMeta getParcel(){
       return this.followVideoMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FollowVideoMeta$$Parcelable.write(this.followVideoMeta$$0, p0, p1, new a());
    }
}
