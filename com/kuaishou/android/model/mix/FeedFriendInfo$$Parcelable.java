package com.kuaishou.android.model.mix.FeedFriendInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.FeedFriendInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.HyperTag;
import com.kuaishou.android.model.mix.HyperTag$$Parcelable;

public class FeedFriendInfo$$Parcelable implements Parcelable, d	// class@000c7b
{
    public FeedFriendInfo feedFriendInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FeedFriendInfo$$Parcelable.CREATOR = new FeedFriendInfo$$Parcelable$a();
    }
    public void FeedFriendInfo$$Parcelable(FeedFriendInfo p0){
       super();
       this.feedFriendInfo$$0 = p0;
    }
    public static FeedFriendInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          FeedFriendInfo uFeedFriendI = new FeedFriendInfo();
          p1.f(p1.g(), uFeedFriendI);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uFeedFriendI.mHasRead = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          uFeedFriendI.mBackToPrePage = b;
          uFeedFriendI.mOldFeedTips = HyperTag$$Parcelable.read(p0, p1);
          uFeedFriendI.mUnreadFinishTips = p0.readString();
          uFeedFriendI.mUnreadFinishHyperTag = HyperTag$$Parcelable.read(p0, p1);
          p1.f(i, uFeedFriendI);
          return uFeedFriendI;
       }
    }
    public static void write(FeedFriendInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHasRead);
          p1.writeInt(p0.mBackToPrePage);
          HyperTag$$Parcelable.write(p0.mOldFeedTips, p1, p2, p3);
          p1.writeString(p0.mUnreadFinishTips);
          HyperTag$$Parcelable.write(p0.mUnreadFinishHyperTag, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FeedFriendInfo getParcel(){
       return this.feedFriendInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FeedFriendInfo$$Parcelable.write(this.feedFriendInfo$$0, p0, p1, new a());
    }
}
