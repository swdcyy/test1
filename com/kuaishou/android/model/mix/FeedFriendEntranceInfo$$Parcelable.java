package com.kuaishou.android.model.mix.FeedFriendEntranceInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.FeedFriendEntranceInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.FeedFriendEntranceInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class FeedFriendEntranceInfo$$Parcelable implements Parcelable, d	// class@000c77
{
    public FeedFriendEntranceInfo feedFriendEntranceInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FeedFriendEntranceInfo$$Parcelable.CREATOR = new FeedFriendEntranceInfo$$Parcelable$a();
    }
    public void FeedFriendEntranceInfo$$Parcelable(FeedFriendEntranceInfo p0){
       super();
       this.feedFriendEntranceInfo$$0 = p0;
    }
    public static FeedFriendEntranceInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          FeedFriendEntranceInfo uFeedFriendE = new FeedFriendEntranceInfo();
          p1.f(p1.g(), uFeedFriendE);
          uFeedFriendE.mDefaultLinkUrl = p0.readString();
          uFeedFriendE.mFetchIntervals = p0.readLong();
          uFeedFriendE.mDefaultTitle = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(User$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uFeedFriendE.mUsers = list;
          uFeedFriendE.mTitle = p0.readString();
          uFeedFriendE.mUnReadCount = p0.readInt();
          uFeedFriendE.mLinkUrl = p0.readString();
          p1.f(i, uFeedFriendE);
          return uFeedFriendE;
       }
    }
    public static void write(FeedFriendEntranceInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mDefaultLinkUrl);
          p1.writeLong(p0.mFetchIntervals);
          p1.writeString(p0.mDefaultTitle);
          FeedFriendEntranceInfo mUsers = p0.mUsers;
          if (mUsers == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mUsers.size());
             Iterator iterator = p0.mUsers.iterator();
             while (iterator.hasNext()) {
                User$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mTitle);
          p1.writeInt(p0.mUnReadCount);
          p1.writeString(p0.mLinkUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FeedFriendEntranceInfo getParcel(){
       return this.feedFriendEntranceInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FeedFriendEntranceInfo$$Parcelable.write(this.feedFriendEntranceInfo$$0, p0, p1, new a());
    }
}
