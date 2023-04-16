package com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo$$Parcelable$a;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$$Parcelable;

public class FeedUserAvatarInfo$$Parcelable implements Parcelable, d	// class@0010d3
{
    public FeedUserAvatarInfo feedUserAvatarInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FeedUserAvatarInfo$$Parcelable.CREATOR = new FeedUserAvatarInfo$$Parcelable$a();
    }
    public void FeedUserAvatarInfo$$Parcelable(FeedUserAvatarInfo p0){
       super();
       this.feedUserAvatarInfo$$0 = p0;
    }
    public static FeedUserAvatarInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          FeedUserAvatarInfo uFeedUserAva = new FeedUserAvatarInfo();
          p1.f(p1.g(), uFeedUserAva);
          uFeedUserAva.mLiveStreamFeed = LiveStreamFeed$$Parcelable.read(p0, p1);
          uFeedUserAva.mStatus = p0.readInt();
          p1.f(i, uFeedUserAva);
          return uFeedUserAva;
       }
    }
    public static void write(FeedUserAvatarInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          LiveStreamFeed$$Parcelable.write(p0.mLiveStreamFeed, p1, p2, p3);
          p1.writeInt(p0.mStatus);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FeedUserAvatarInfo getParcel(){
       return this.feedUserAvatarInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FeedUserAvatarInfo$$Parcelable.write(this.feedUserAvatarInfo$$0, p0, p1, new a());
    }
}
