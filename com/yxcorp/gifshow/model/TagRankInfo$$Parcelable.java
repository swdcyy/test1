package com.yxcorp.gifshow.model.TagRankInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.TagRankInfo$$Parcelable$a;
import com.yxcorp.gifshow.model.TagRankInfo;
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

public class TagRankInfo$$Parcelable implements Parcelable, d	// class@001e99
{
    public TagRankInfo tagRankInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TagRankInfo$$Parcelable.CREATOR = new TagRankInfo$$Parcelable$a();
    }
    public void TagRankInfo$$Parcelable(TagRankInfo p0){
       super();
       this.tagRankInfo$$0 = p0;
    }
    public static TagRankInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TagRankInfo tagRankInfo = new TagRankInfo();
          p1.f(p1.g(), tagRankInfo);
          tagRankInfo.mTagScheme = p0.readString();
          tagRankInfo.mTagType = p0.readInt();
          tagRankInfo.mTagId = p0.readString();
          tagRankInfo.mScore = p0.readInt();
          tagRankInfo.mTotalRankNum = p0.readInt();
          tagRankInfo.mRankText = p0.readString();
          int i1 = 0;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          tagRankInfo.mShown = b;
          tagRankInfo.mTagName = p0.readString();
          int i2 = p0.readInt();
          if (i2 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i2);
             for (; i1 < i2; i1 = i1 + 1) {
                uArrayList.add(User$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          tagRankInfo.mTopUsers = list;
          tagRankInfo.mRank = p0.readInt();
          tagRankInfo.mIconUrl = p0.readString();
          tagRankInfo.mButtonScheme = p0.readString();
          p1.f(i, tagRankInfo);
          return tagRankInfo;
       }
    }
    public static void write(TagRankInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTagScheme);
          p1.writeInt(p0.mTagType);
          p1.writeString(p0.mTagId);
          p1.writeInt(p0.mScore);
          p1.writeInt(p0.mTotalRankNum);
          p1.writeString(p0.mRankText);
          p1.writeInt(p0.mShown);
          p1.writeString(p0.mTagName);
          TagRankInfo mTopUsers = p0.mTopUsers;
          if (mTopUsers == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTopUsers.size());
             Iterator iterator = p0.mTopUsers.iterator();
             while (iterator.hasNext()) {
                User$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mRank);
          p1.writeString(p0.mIconUrl);
          p1.writeString(p0.mButtonScheme);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TagRankInfo getParcel(){
       return this.tagRankInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TagRankInfo$$Parcelable.write(this.tagRankInfo$$0, p0, p1, new a());
    }
}
