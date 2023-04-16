package com.kuaishou.android.model.feed.LiveCoverAnnex$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.LiveCoverAnnex$$Parcelable$a;
import com.kuaishou.android.model.feed.LiveCoverAnnex;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.HashMap;
import xwd.b;
import com.kuaishou.android.model.feed.LiveInfo;
import com.kuaishou.android.model.feed.LiveInfo$$Parcelable;
import com.kuaishou.android.model.feed.LiveComment;
import com.kuaishou.android.model.feed.LiveComment$$Parcelable;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;

public class LiveCoverAnnex$$Parcelable implements Parcelable, d	// class@000b00
{
    public LiveCoverAnnex liveCoverAnnex$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveCoverAnnex$$Parcelable.CREATOR = new LiveCoverAnnex$$Parcelable$a();
    }
    public void LiveCoverAnnex$$Parcelable(LiveCoverAnnex p0){
       super();
       this.liveCoverAnnex$$0 = p0;
    }
    public static LiveCoverAnnex read(Parcel p0,a p1){
       List list1;
       Map map;
       ArrayList uArrayList;
       int i3;
       List list2;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveCoverAnnex liveCoverAnn = new LiveCoverAnnex();
          p1.f(p1.g(), liveCoverAnn);
          liveCoverAnn.mCommodityTitle = p0.readString();
          liveCoverAnn.mCommodityShowType = p0.readInt();
          liveCoverAnn.mCommodityCount = p0.readString();
          liveCoverAnn.mCommodityImage = p0.readString();
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                int i4 = p0.readInt();
                if (i4 < 0) {
                   list2 = list;
                }else {
                   list2 = new CDNUrl[i4];
                   for (int i5 = 0; i5 < i4; i5 = i5 + 1) {
                      list2[i5] = CDNUrl$$Parcelable.read(p0, p1);
                   }
                }
                uArrayList.add(list2);
             }
          }
          liveCoverAnn.mIconUrls = list1;
          i1 = p0.readInt();
          if (i1 < 0) {
             map = list;
          }else {
             map = new HashMap(b.a(i1));
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                map.put(p0.readString(), p0.readString());
             }
          }
          liveCoverAnn.mExtraInfo = map;
          liveCoverAnn.mCommodityId = p0.readString();
          liveCoverAnn.mCommodityPrice = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(LiveInfo$$Parcelable.read(p0, p1));
             }
          }
          liveCoverAnn.mLiveInfos = list1;
          liveCoverAnn.mActionType = p0.readInt();
          liveCoverAnn.mType = p0.readInt();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(LiveComment$$Parcelable.read(p0, p1));
             }
          }
          liveCoverAnn.mComments = list;
          liveCoverAnn.mCardType = p0.readInt();
          liveCoverAnn.mAction = p0.readString();
          liveCoverAnn.mEntityId = p0.readString();
          liveCoverAnn.mTitle = p0.readString();
          liveCoverAnn.mJumpUrl = p0.readString();
          liveCoverAnn.mExpTag = p0.readString();
          p1.f(i, liveCoverAnn);
          return liveCoverAnn;
       }
    }
    public static void write(LiveCoverAnnex p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCommodityTitle);
          p1.writeInt(p0.mCommodityShowType);
          p1.writeString(p0.mCommodityCount);
          p1.writeString(p0.mCommodityImage);
          LiveCoverAnnex mIconUrls = p0.mIconUrls;
          if (mIconUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mIconUrls.size());
             iterator = p0.mIconUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl[] uCDNUrlArray = iterator.next();
                if (uCDNUrlArray == null) {
                   p1.writeInt(i1);
                }else {
                   p1.writeInt(uCDNUrlArray.length);
                   int len = uCDNUrlArray.length;
                   for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                      CDNUrl$$Parcelable.write(uCDNUrlArray[i2], p1, p2, p3);
                   }
                }
             }
          }
          mIconUrls = p0.mExtraInfo;
          if (mIconUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mIconUrls.size());
             iterator = p0.mExtraInfo.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          p1.writeString(p0.mCommodityId);
          p1.writeString(p0.mCommodityPrice);
          mIconUrls = p0.mLiveInfos;
          if (mIconUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mIconUrls.size());
             iterator = p0.mLiveInfos.iterator();
             while (iterator.hasNext()) {
                LiveInfo$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mActionType);
          p1.writeInt(p0.mType);
          mIconUrls = p0.mComments;
          if (mIconUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mIconUrls.size());
             iterator = p0.mComments.iterator();
             while (iterator.hasNext()) {
                LiveComment$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mCardType);
          p1.writeString(p0.mAction);
          p1.writeString(p0.mEntityId);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mJumpUrl);
          p1.writeString(p0.mExpTag);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveCoverAnnex getParcel(){
       return this.liveCoverAnnex$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveCoverAnnex$$Parcelable.write(this.liveCoverAnnex$$0, p0, p1, new a());
    }
}
